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
 * Tests for upserting a product, i.e. create or update a product in one roundtrip.
 */
public class UpsertTest extends BaseTest {

    @Test
    public void testProductsUpsert() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.upsert.success");

        Service service = getProductsService();
        assertNotNull(service);

        UpsertProduct up = new UpsertProduct();
        up.setSpn("1000");
        up.setName("Produkt 1000");
        up.setPrice(4.99);
        up.setOrderUnit("PCE");

        UpsertProductResponse upsertResponse = service.upsert().pin("AD8CCDD5F9").area("work").product(up).execute();
        assertNotNull(upsertResponse);
        assertNotNull(upsertResponse.getLink());
        assertNotEquals("", upsertResponse.getLink());
        assertEquals("store#productsUpsertResponse", upsertResponse.getKind());
    }
}
