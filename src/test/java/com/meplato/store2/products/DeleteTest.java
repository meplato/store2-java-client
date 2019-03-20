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
 * Tests deleting a product.
 */
public class DeleteTest extends BaseTest {

    @Test
    public void testProductsDelete() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.delete.success");

        Service service = getProductsService();
        assertNotNull(service);

        service.delete().pin("AD8CCDD5F9").area("work").spn("50763599").execute();
    }

    @Test
    public void testProductsDeleteNotFound() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.delete.not_found");

        Service service = getProductsService();
        assertNotNull(service);

        try {
            service.delete().pin("AD8CCDD5F9").area("work").spn("no-such-product").execute();
            fail("expected to not succeed");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertEquals(404, ex.getStatusCode());
            assertNotNull(ex.getError());
            assertEquals("Product not found", ex.getMessage());
        }
    }
}
