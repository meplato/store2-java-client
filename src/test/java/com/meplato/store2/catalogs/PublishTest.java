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
 * Tests publishing a catalog.
 */
public class PublishTest extends BaseTest {

    @Test
    public void testCatalogsPublish() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("catalogs.publish.success");

        Service service = getCatalogsService();
        assertNotNull(service);

        // Trigger publish
        PublishResponse publishResponse = service.publish().pin("AD8CCDD5F9").execute();
        assertNotNull(publishResponse);
        assertEquals("store#catalogPublish", publishResponse.getKind());
        assertNotEquals("", publishResponse.getSelfLink());
        assertNotEquals("", publishResponse.getStatusLink());

        /*
        // Watch publish status
        long i = 0;
        long n = 10;
        while (true) {
            PublishStatusResponse publishStatus = service.publishStatus().pin("AD8CCDD5F9").execute();
            assertNotNull(publishStatus);
            assertEquals("store#catalogPublishStatus", publishStatus.getKind());
            assertNotEquals("", publishStatus.getSelfLink());
            assertNotEquals("", publishStatus.getStatus());

            if ("done".equalsIgnoreCase(publishStatus.getStatus())) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            i += 1;
            if (i >= n) {
                fail("expected to publish catalog after a while");
            }
        }
        */
    }
}
