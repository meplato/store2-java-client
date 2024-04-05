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
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests deleting an availability of a product.
 */
public class DeleteTest extends BaseTest {

    @Test
    public void testProductsDelete() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("availabilities.delete.success");

        Service service = getAvailabilitiesService();
        assertNotNull(service);

        DeleteResponse response = service.delete().spn("1234").execute();
        assertNotNull(response);
        assertEquals(response.getKind(), "store#availabilities/deleteResponse");
    }
}
