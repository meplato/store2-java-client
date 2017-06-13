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
 * Tests getting a job.
 */
public class GetTest extends BaseTest {

    @Test
    public void testJobsGet() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("jobs.get.success");

        Service service = getJobsService();
        assertNotNull(service);

        Job job = service.get().id("58097dc3-b279-49b5-a5da-23eb1c77d840").execute();
        assertNotNull(job);
        assertEquals("58097dc3-b279-49b5-a5da-23eb1c77d840", job.getId());
        assertEquals("store#job", job.getKind());
        assertEquals("https://store.meplato.com/api/v2/jobs/58097dc3-b279-49b5-a5da-23eb1c77d840", job.getSelfLink());
        assertEquals(1, job.getMerchantId());
        assertEquals("meplato", job.getMerchantMpcc());
        assertEquals("Meplato", job.getMerchantName());
        assertEquals(57, job.getCatalogId());
        assertEquals("Office Supplies", job.getCatalogName());
        assertEquals("succeeded", job.getState());
        assertEquals("joe.average@example.com", job.getEmail());
        assertNotNull(job.getCreated());
        assertNotNull(job.getStarted());
        assertNotNull(job.getCompleted());
    }
}
