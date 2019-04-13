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

import com.damnhandy.uri.template.UriTemplate;
import com.meplato.store2.products.CreateProduct;
import com.meplato.store2.products.CreateProductResponse;
import com.meplato.store2.products.Service;
import org.apache.http.HttpException;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests for the base service.
 */
public class ServiceTest extends BaseTest {

    @Test
    public void testGetClient() throws Exception {
        assertNotNull(getClient());
    }

    @Test
    public void testUriTemplateWithSlash() throws ServiceException, IOException, HttpException {
        // Make a copy of the parameters and add the path parameters to it
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("area", "work");
        params.put("pin", "AD8CCDD5F9");
        params.put("spn", "1000/11");

        // Make a copy of the header parameters and set common headers, like the UA
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "secret");

        String uriTemplate = "/catalogs/{pin}/{area}/products/{spn}";

        String url = UriTemplate.fromTemplate(uriTemplate).expand(params);
        assertEquals("/catalogs/AD8CCDD5F9/work/products/1000%2F11", url);
    }

    @Test
    public void testUriTemplateWithURLEncoding() throws ServiceException, IOException, HttpException {
        // Make a copy of the parameters and add the path parameters to it
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("area", "work");
        params.put("pin", "AD8CCDD5F9");
        params.put("spn", "123456 1+2");

        // Make a copy of the header parameters and set common headers, like the UA
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "secret");

        String uriTemplate = "/catalogs/{pin}/{area}/products/{spn}";

        String url = UriTemplate.fromTemplate(uriTemplate).expand(params);
        assertEquals("/catalogs/AD8CCDD5F9/work/products/123456%201%2B2", url);
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
