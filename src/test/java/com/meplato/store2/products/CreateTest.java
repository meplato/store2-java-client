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

import com.meplato.store2.*;
import com.meplato.store2.Error;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests for creating a product.
 */
public class CreateTest extends BaseTest {

    @Test
    public void testProductsCreate() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.create.success");

        Service service = getProductsService();
        assertNotNull(service);

        CreateProduct create = new CreateProduct();
        create.setSpn("1000");
        create.setName("Produkt 1000");
        create.setPrice(4.99);
        create.setOrderUnit("PCE");

        CreateProductResponse createResponse = service.create().pin("AD8CCDD5F9").area("work").product(create).execute();
        assertNotNull(createResponse);
        assertNotNull(createResponse.getLink());
        assertNotEquals("", createResponse.getLink());
        assertNotNull(createResponse.getId());
        assertNotEquals("", createResponse.getId());
    }

    @Test
    public void testProductsCreateMissingParameter() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.create.parameter_missing");

        Service service = getProductsService();
        assertNotNull(service);

        CreateProduct create = new CreateProduct();
        create.setSpn("1000");
        create.setName("");
        create.setPrice(4.99);
        create.setOrderUnit("");

        try {
            service.create().pin("AD8CCDD5F9").area("work").product(create).execute();
            fail("expected to fail without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertNotNull(ex.getError());
            assertEquals("Bitte prüfen Sie Ihre Eingaben", ex.getMessage());
            Error.ErrorInner error = ex.getError().getError();
            assertNotNull(error);
            assertEquals(2, error.getDetails().size());
            assertEquals("Name must not be blank", error.getDetails().get(0));
            assertEquals("OrderUnit must not be blank", error.getDetails().get(1));
        }
    }
}
