package com.parse;

import com.parse.boltsinternal.Task;

/* loaded from: classes.dex */
interface ParseCurrentUserController extends ParseObjectCurrentController<ParseUser> {
    Task<ParseUser> getAsync(boolean z);

    Task<String> getCurrentSessionTokenAsync();

    Task<Void> logOutAsync();

    Task<Void> setIfNeededAsync(ParseUser parseUser);
}
