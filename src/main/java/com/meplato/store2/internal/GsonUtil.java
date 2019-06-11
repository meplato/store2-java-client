/*
 * Copyright (c) 2017 Meplato GmbH.
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
package com.meplato.store2.internal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Utilities for working with JSON and the Gson library.
 */
public final class GsonUtil {
    /**
     * RFC3339 pattern to deserialize date/time from the API.
     */
    public static String RFC3339 = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSSXXX";

    /**
     * Returns a serializer for JSON.
     *
     * @return Gson serializer.
     */
    public static Gson getSerializer() {
        return new GsonBuilder().
                registerTypeAdapterFactory(new GsonTypeAdapterFactory()).
                setDateFormat(RFC3339).
                create();
    }
}
