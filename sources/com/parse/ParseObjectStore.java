package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;

/* loaded from: classes.dex */
interface ParseObjectStore<T extends ParseObject> {
    Task<Void> deleteAsync();

    Task<T> getAsync();

    Task<Void> setAsync(T t);
}
