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

import com.google.gson.Gson;
import com.meplato.store2.internal.GsonUtil;
import com.meplato.store2.ServiceException;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests updating a product.
 */
public class UpdateTest extends BaseTest {
    @Test
    public void testProductsUpdate() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.update.success");

        Service service = getProductsService();
        assertNotNull(service);

        UpdateProduct update = new UpdateProduct();
        update.setName(Optional.of("Produkt 1000 (NEU!)"));
        update.setPrice(Optional.of(2.50));
        update.setOrderUnit(Optional.of("PCE"));

        UpdateProductResponse updateResponse = service.update().pin("AD8CCDD5F9").area("work").spn("MBA11").product(update).execute();
        assertNotNull(updateResponse);
        assertNotNull(updateResponse.getLink());
        assertNotEquals("", updateResponse.getLink());
        assertEquals("store#productsUpdateResponse", updateResponse.getKind());

        // Here's how to get the product now.
        /*
        Product product = service.get().pin("AD8CCDD5F9").area("work").id("MBA11@12").execute();
        assertNotNull(product);
        assertEquals("MBA11@12", product.getId());
        assertEquals("MBA11", product.getSpn());
        assertEquals(update.getName(), product.getName());
        assertTrue(update.getPrice() == product.getPrice());
        */
    }

    @Test
    public void testProductsUpdateWithSlash() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.update.success");

        Service service = getProductsService();
        assertNotNull(service);

        UpdateProduct update = new UpdateProduct();
        update.setName(Optional.of("Produkt 1000 (NEU!)"));
        update.setPrice(Optional.of(2.50));
        update.setOrderUnit(Optional.of("PCE"));

        UpdateProductResponse updateResponse = service.update().pin("AD8CCDD5F9").area("work").spn("MBA11/2017").product(update).execute();
        assertNotNull(updateResponse);
        assertNotNull(updateResponse.getLink());
        assertNotEquals("", updateResponse.getLink());
        assertEquals("store#productsUpdateResponse", updateResponse.getKind());

        // Here's how to get the product now.
        /*
        Product product = service.get().pin("AD8CCDD5F9").area("work").id("MBA11@12").execute();
        assertNotNull(product);
        assertEquals("MBA11@12", product.getId());
        assertEquals("MBA11", product.getSpn());
        assertEquals(update.getName(), product.getName());
        assertTrue(update.getPrice() == product.getPrice());
        */
    }

    @Test
    public void testProductsUpdateSerializeOptionalFields() throws ServiceException, IOException, HttpException {
        Gson gson = GsonUtil.getSerializer();

        UpdateProduct update;
        String have;

        // No value for nullable field like quantityMin
        update = new UpdateProduct();
        update.setName(Optional.of("Produkt 1000"));
        have = gson.toJson(update);
        assertEquals("{\"name\":\"Produkt 1000\"}", have);

        // Specific non-null value for nullable field like quantityMin, quantityMax, and quantityInterval
        update = new UpdateProduct();
        update.setName(Optional.of("Produkt 1000"));
        update.setKeepPrice(Optional.of(true));
        update.setManufacturer(Optional.of("Microsoft"));
        update.setLeadtime(Optional.of(3.0));
        update.setQuantityMin(Optional.of(10.0));
        update.setQuantityMax(Optional.empty());
        update.setQuantityInterval(Optional.of(1.0));
        have = gson.toJson(update);
        assertEquals("{\"keepPrice\":true,\"leadtime\":3.0,\"manufacturer\":\"Microsoft\",\"name\":\"Produkt 1000\",\"quantityInterval\":1.0,\"quantityMax\":null,\"quantityMin\":10.0}", have);

        // Null value for nullable field like quantityMin
        update = new UpdateProduct();
        update.setName(Optional.of("Produkt 1000"));
        update.setKeepPrice(Optional.empty());
        update.setManufacturer(Optional.ofNullable(null));
        update.setLeadtime(Optional.empty());
        update.setQuantityMin(Optional.empty());
        update.setQuantityMax(Optional.empty());
        update.setQuantityInterval(Optional.empty());
        have = gson.toJson(update);
        assertEquals("{\"keepPrice\":null,\"leadtime\":null,\"manufacturer\":null,\"name\":\"Produkt 1000\",\"quantityInterval\":null,\"quantityMax\":null,\"quantityMin\":null}", have);

        // Null value for nullable field like quantityMin
        update = new UpdateProduct();
        update.setLeadtime(Optional.ofNullable(null));
        update.setQuantityMin(Optional.ofNullable(null));
        update.setQuantityMax(Optional.ofNullable(null));
        update.setQuantityInterval(Optional.ofNullable(null));
        have = gson.toJson(update);
        assertEquals("{\"leadtime\":null,\"quantityInterval\":null,\"quantityMax\":null,\"quantityMin\":null}", have);
    }
}
