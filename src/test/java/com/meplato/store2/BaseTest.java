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

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpException;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

/**
 * Base class for all tests.
 */
public abstract class BaseTest {
    private static final String BASE_URL = "https://store3.go/api/v2";

    private MockClient client;

    protected BaseTest() {
    }

    public MockClient getClient() {
        if (client == null) {
            client = new MockClient();
        }
        return client;
    }

    public Service getService() {
        Service service = new Service(getClient());
        service.setBaseURL(BASE_URL);
        return service;
    }

    public com.meplato.store2.catalogs.Service getCatalogsService() {
        com.meplato.store2.catalogs.Service service = new com.meplato.store2.catalogs.Service(getClient());
        service.setBaseURL(BASE_URL);
        return service;
    }

    public com.meplato.store2.products.Service getProductsService() {
        com.meplato.store2.products.Service service = new com.meplato.store2.products.Service(getClient());
        service.setBaseURL(BASE_URL);
        return service;
    }

    public com.meplato.store2.jobs.Service getJobsService() {
        com.meplato.store2.jobs.Service service = new com.meplato.store2.jobs.Service(getClient());
        service.setBaseURL(BASE_URL);
        return service;
    }

    protected void mockResponse(Response response) {
        this.getClient().setResponse(response);
    }

    protected void mockResponseFromFile(String filename) throws IOException, HttpException, ServiceException {
        String contents = IOUtils.toString(this.getClass().getResourceAsStream(filename), "UTF-8");
        this.mockResponse(MockResponse.fromContents(contents));
    }

    protected void mockResponseException(ServiceException exception) {
        this.getClient().setServiceException(exception);
    }

    @Before
    public void beforeTest() throws ServiceException {
    }

    @After
    public void afterTest() throws ServiceException {
    }
}
