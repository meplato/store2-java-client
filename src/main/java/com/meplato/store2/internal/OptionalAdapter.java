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
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/**
 * This class is a Gson adapter for the Optional class introduced in Java 8.
 */
class OptionalAdapter<T> extends TypeAdapter<Optional<T>> {
    private final TypeAdapter<T> delegate;

    public OptionalAdapter(TypeAdapter<T> delegate) {
        this.delegate = delegate;
    }

    /**
     * Write a JSON value depending on the state of value. If value is null, we write
     * nothing (which depends on what is set for setSerializeNulls in the generator).
     * If value is empty, we always write a null regardless of setSerializeNulls.
     * Otherwise, we write value.get().
     *
     * @param out   the JSON writer
     * @param value the value
     * @throws IOException
     */
    @Override
    public void write(JsonWriter out, Optional<T> value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        if (!value.isPresent()) {
            // HACK We want to serialize as null if the value is not present (or empty).
            // There seems to be no way to set the serializeNulls on a per-field basis,
            // so we enable, write, and reset here.
            boolean oldValue = out.getSerializeNulls();
            out.setSerializeNulls(true);
            out.nullValue();
            out.setSerializeNulls(oldValue);
            return;
        }
        delegate.write(out, value.get());
    }

    @Override
    public Optional<T> read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return Optional.empty();
        }
        return Optional.of(delegate.read(in));
    }

    @SuppressWarnings("unchecked")
    public static OptionalAdapter getInstance(Gson gson, TypeToken typeToken) {
        TypeAdapter delegate;
        Type type = typeToken.getType();
        if (type instanceof ParameterizedType) {
            Type innerType = ((ParameterizedType) type).getActualTypeArguments()[0];
            delegate = gson.getAdapter(TypeToken.get(innerType));
        } else if (type instanceof Class) {
            delegate = gson.getAdapter(Object.class);
        } else {
            throw new JsonIOException("unexpected token type: " + type.getClass());
        }
        return new OptionalAdapter<>(delegate);
    }
}
