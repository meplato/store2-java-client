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

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Tests for the base service.
 */
public class ServiceTest extends BaseTest {

    @Test
    public void testGetClient() throws Exception {
        assertNotNull(getClient());
    }

    /*
    @Test
    public void testGsonDateSerialization() throws Exception {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSSXXX").create();
        //Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateRFC3339TypeAdapter()).create();
        String date = "2014-12-23T19:43:43Z";
        Date test = gson.fromJson(date, Date.class);
        assertEquals("abc", test);
    }

    @Test
    public void testGsonDateTimeSerialization() throws Exception {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
        String date = "2014-12-23T19:43:43+01:00";
        DateTime test = gson.fromJson(date, DateTime.class);
        assertEquals("abc", test);
    }
    */
}
