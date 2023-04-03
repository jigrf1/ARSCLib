/*
 *  Copyright (C) 2022 github.com/REAndroid
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.reandroid.archive2.block;

import java.io.IOException;
import java.io.InputStream;

public class LongBlock extends ZipBlock{
    public LongBlock() {
        super(8);
    }
    @Override
    public int readBytes(InputStream inputStream) throws IOException {
        byte[] bytes = getBytesInternal();
        return inputStream.read(bytes, 0, bytes.length);
    }
    public long get(){
        return getLong(0);
    }
    public void set(long value){
        putLong(0, value);
    }
    @Override
    public String toString(){
        return String.valueOf(get());
    }
}
