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
package com.meplato.store2.catalogs;

import com.meplato.store2.ServiceException;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests getting a catalog.
 */
public class GetTest extends BaseTest {

    @Test
    public void testCatalogsGet() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("catalogs.get.success");

        Service service = getCatalogsService();
        assertNotNull(service);

        Catalog catalog = service.get().pin("5094310527").execute();
        assertNotNull(catalog);
        assertTrue(catalog.getId() > 0);
        assertEquals("5094310527", catalog.getPin());
        assertNotNull(catalog.getName());
        assertNotEquals("", catalog.getName());
        assertNotNull(catalog.getCreated());
        assertNotNull(catalog.getUpdated());
    }

    @Test
    public void testCatalogsGetNotFound() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("catalogs.get.not_found");

        Service service = getCatalogsService();
        assertNotNull(service);

        try {
            service.get().pin("5094310527").execute();
            fail("expected to not get catalog");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertEquals(404, ex.getStatusCode());
            assertNotNull(ex.getError());
            assertEquals("Catalog not found", ex.getMessage());
            assertNotNull(ex.getError().getError());
            assertEquals(0, ex.getError().getError().getCode());
        }
    }
}
