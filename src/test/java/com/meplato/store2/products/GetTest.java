/*
 * Copyright (c) 2015 Meplato GmbH, Switzerland.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.meplato.store2.products;

import com.meplato.store2.ServiceException;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests getting a product.
 */
public class GetTest extends BaseTest {

    @Test
    public void testProductsGet() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.get.success");

        Service service = getProductsService();
        assertNotNull(service);

        Product product = service.get().pin("AD8CCDD5F9").area("work").spn("50763599").execute();
        assertNotNull(product);
        assertNotNull(product.getId());
        assertNotEquals("", product.getId());
        assertNotNull(product.getSpn());
        assertNotEquals("", product.getSpn());
        assertNotNull(product.getName());
        assertNotEquals("", product.getName());

        CustField[] custFields = product.getCustFields();
        assertNotNull(custFields);
        assertEquals(1, custFields.length);
        assertEquals("Steuersatz", custFields[0].getName());
        assertEquals("0.19", custFields[0].getValue());

        Blob[] blobs = product.getBlobs();
        assertNotNull(blobs);
        assertEquals(1, blobs.length);
        assertEquals("normal", blobs[0].getKind());
        assertEquals("50763599.jpg", blobs[0].getSource());
        assertEquals("Normalbild", blobs[0].getText());
        assertEquals("de", blobs[0].getLanguage());

        assertNotNull(product.getCreated());
        assertNotNull(product.getUpdated());
    }

    @Test
    public void testProductsGetUnauthorized() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.get.unauthorized");

        Service service = getProductsService();
        assertNotNull(service);

        try {
            service.get().pin("AD8CCDD5F9").area("work").spn("no-such-product").execute();
            fail("expected to not get data without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertEquals(401, ex.getStatusCode());
            assertNotNull(ex.getError());
            assertEquals("Unauthorized", ex.getMessage());
        }
    }

    @Test
    public void testProductsGetNotFound() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.get.not_found");

        Service service = getProductsService();
        assertNotNull(service);

        try {
            service.get().pin("AD8CCDD5F9").area("work").spn("no-such-product").execute();
            fail("expected to not get data");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertEquals(404, ex.getStatusCode());
            assertNotNull(ex.getError());
            assertEquals("Product not found", ex.getMessage());
            assertNotNull(ex.getError().getError());
            assertEquals(0, ex.getError().getError().getCode());
        }
    }
}
