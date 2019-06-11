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
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.Optional;

/**
 * This Gson adapter recognizes Optional type introduced in Java 8.
 */
public class GsonTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    @SuppressWarnings("unchecked")
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<T> clazz = (Class<T>) typeToken.getRawType();

        if (clazz == Optional.class) {
            return (TypeAdapter<T>) OptionalAdapter.getInstance(gson, typeToken);
        } else {
            return null;
        }
    }
}
