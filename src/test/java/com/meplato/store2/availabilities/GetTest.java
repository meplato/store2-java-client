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
package com.meplato.store2.availabilities;

import com.meplato.store2.ServiceException;
import com.meplato.store2.availabilities.Availability;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests getting availabilities by SPN.
 */
public class GetTest extends BaseTest {

    @Test
    public void testJobsGet() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("availabilities.get.success");

        Service service = getAvailabilitiesService();
        assertNotNull(service);

        GetResponse response = service.get().spn("1234").execute();
        assertNotNull(response);
        assertEquals(3, response.getItems().length);

        for (Availability availability : response.getItems()) {
            assertNotNull(availability);
            assertNotNull(availability.getSpn());
            assertNotEquals("", availability.getSpn());
            assertNotNull(availability.getMpcc());
            assertNotEquals("", availability.getMpcc());
            assertNotNull(availability.getMessage());
            assertNotEquals("", availability.getMessage());
            assertNotNull(availability.getQuantity());
            assertNotEquals(0.0, availability.getQuantity());
            assertNotNull(availability.getRegion());
            assertNotEquals("", availability.getRegion());
            assertNotNull(availability.getZipCode());
            assertNotEquals("", availability.getZipCode());
            assertNotNull(availability.getUpdated());
            assertNotEquals("", availability.getUpdated());
        }
    }

    @Test
    public void testAvailabilitiesGetUnauthorized() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("availabilities.get.unauthorized");

        Service service = getAvailabilitiesService();
        assertNotNull(service);

        try {
            service.get().spn("1234").execute();
            fail("expected to not get data without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertEquals(401, ex.getStatusCode());
            assertNotNull(ex.getError());
            assertEquals("Unauthorized", ex.getMessage());
        }
    }


    @Test
    public void testAvailabilitiesGetNotFound() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("availabilities.get.not_found");

        Service service = getAvailabilitiesService();
        assertNotNull(service);

        GetResponse response = service.get().spn("1234").execute();
        assertNotNull(response);
        assertNull(response.getItems());
    }
}