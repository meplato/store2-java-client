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
import org.junit.After;
import org.junit.Before;

/**
 * Base class for availabilities tests.
 */
public abstract class BaseTest extends com.meplato.store2.BaseTest {

    @Before
    public void beforeTest() throws ServiceException {
    }

    @After
    public void afterTest() throws ServiceException {
    }

}
