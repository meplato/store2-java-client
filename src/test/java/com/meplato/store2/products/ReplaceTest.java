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

import com.meplato.store2.ServiceException;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ReplaceTest extends BaseTest {
    @Test
    public void testProductsReplace() throws ServiceException, IOException, HttpException {
        this.mockResponseFromFile("products.replace.success");

        Service service = getProductsService();
        assertNotNull(service);

        ReplaceProduct replace = new ReplaceProduct();
        replace.setName("MacBook Air 11in (NEU!)");
        replace.setPrice(1225.50);
        replace.setOrderUnit("PCE");

        ReplaceProductResponse replaceResponse = service.replace().pin("AD8CCDD5F9").area("work").id("1000@12").product(replace).execute();
        assertNotNull(replaceResponse);
        assertNotNull(replaceResponse.getLink());
        assertNotEquals("", replaceResponse.getLink());
        assertNotNull(replaceResponse.getId());
        assertNotEquals("", replaceResponse.getId());
    }
}
