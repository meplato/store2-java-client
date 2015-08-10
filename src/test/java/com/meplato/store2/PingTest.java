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
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Tests for the Ping service.
 */
public class PingTest extends BaseTest {
    @Test
    public void testPing() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("ping.success");

        Service service = getService();
        assertNotNull(service);
        service.ping().execute();
    }

    @Test
    public void testPingUnauthorized() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("ping.unauthorized");

        Service service = getService();
        service.setUser("");
        service.setPassword("");
        assertNotNull(service);

        try {
            service.ping().execute();
            fail("expected to fail without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
        }
    }
}
