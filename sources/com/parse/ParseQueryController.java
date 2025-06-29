package com.parse;

import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import java.util.List;

/* loaded from: classes.dex */
interface ParseQueryController {
    <T extends ParseObject> Task<List<T>> findAsync(ParseQuery.State<T> state, ParseUser parseUser, Task<Void> task);
}
