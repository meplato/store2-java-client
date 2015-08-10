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
package com.meplato.store2;

import org.apache.http.HttpException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests for the Me service.
 */
public class MeTest extends BaseTest {
    @Before
    public void beforeTest() throws ServiceException {
    }

    @After
    public void afterTest() throws ServiceException {
    }

    @Test
    public void testMe() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("me.success");

        Service service = getService();
        assertNotNull(service);

        MeResponse response = service.me().execute();
        assertNotNull(response);
        assertEquals("store#me", response.getKind());
    }

    @Test
    public void testMeAuthorized() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("me.unauthorized");

        Service service = getService();
        assertNotNull(service);
        service.setUser("");
        service.setPassword("");

        try {
            service.me().execute();
            fail("expected to fail without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertNotNull(ex.getError());
            assertEquals("Unauthorized", ex.getMessage());
        }
    }
}
