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
 * Tests searching for products.
 */
public class SearchTest extends BaseTest {

    @Test
    public void testProductsSearch() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.search.success");

        Service service = getProductsService();
        assertNotNull(service);

        SearchResponse response = service.search().pin("AD8CCDD5F9").area("work").skip(0).take(10).execute();
        assertNotNull(response);
        assertTrue(response.getTotalItems() > 0);
        for (Product product : response.getItems()) {
            assertNotNull(product);
            assertNotNull(product.getId());
            assertNotEquals("", product.getId());
            assertNotNull(product.getSpn());
            assertNotEquals("", product.getSpn());
            assertNotNull(product.getName());
            assertNotEquals("", product.getName());
            assertNotNull(product.getCreated());
            assertNotNull(product.getUpdated());
        }
    }

    @Test
    public void testProductsSearchUnauthorized() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.search.unauthorized");

        Service service = getProductsService();
        assertNotNull(service);
        service.setUser("");
        service.setPassword("");

        try {
            service.search().pin("AD8CCDD5F9").area("work").skip(0).take(10).execute();
            fail("expected to not get data without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertNotNull(ex.getError());
            assertEquals("Unauthorized", ex.getMessage());
        }
    }
}
