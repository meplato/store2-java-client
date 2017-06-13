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
package com.meplato.store2.jobs;

import com.meplato.store2.ServiceException;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests searching for/listing jobs.
 */
public class SearchTest extends BaseTest {

    @Test
    public void testJobsSearch() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("jobs.search.success");

        Service service = getJobsService();
        assertNotNull(service);

        SearchResponse response = service.search().skip(0).take(10).execute();
        assertNotNull(response);
        assertTrue(response.getTotalItems() > 0);
        for (Job job : response.getItems()) {
            assertNotNull(job);
            assertNotNull(job.getId());
            assertNotEquals("", job.getId());
            assertTrue(job.getMerchantId() > 0);
            assertNotNull(job.getMerchantName());
            assertNotEquals("", job.getMerchantName());
            assertNotNull(job.getCreated());
        }
    }

    @Test
    public void testJobsSearchUnauthorized() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("jobs.search.unauthorized");

        Service service = getJobsService();
        assertNotNull(service);
        service.setUser("");
        service.setPassword("");

        try {
            service.search().skip(0).take(10).execute();
            fail("expected to not get data without authorization");
        } catch (ServiceException ex) {
            assertNotNull(ex);
            assertNotNull(ex.getError());
            assertEquals("Unauthorized", ex.getMessage());
        }
    }
}
