/*
 * Copyright (c) 2013-present Meplato GmbH.
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
package com.meplato.store2.catalogs;

import com.meplato.store2.ServiceException;
import com.meplato.store2.products.CreateProduct;
import com.meplato.store2.products.CreateProductResponse;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests creating a catalog
 */
public class CreateTest extends BaseTest {

    @Test
    public void testCreateCatalog() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("catalogs.create.success");

        Service service = getCatalogsService();
        assertNotNull(service);

        CreateCatalog create = new CreateCatalog();
        create.setMerchantId(1);
        create.setName("test");
        create.setProjectMpcc("meplato");
        create.setValidFrom(null);
        create.setValidUntil(null);
        create.setCountry("DE");
        create.setCurrency("EUR");
        create.setLanguage("de");
        create.setTarget("mall");
        create.setSageNumber("");
        create.setSageContract("");

        Catalog catalog = service.create().catalog(create).execute();
        assertNotNull(catalog);
        assertNotNull(catalog.getSelfLink());
        assertNotEquals("", catalog.getSelfLink());
        assertEquals("store#catalog", catalog.getKind());
    }
}
