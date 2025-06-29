package com.parse;

import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;

/* loaded from: classes.dex */
interface ParseUserController {
    Task<ParseUser.State> logInAsync(ParseUser.State state, ParseOperationSet parseOperationSet);

    Task<ParseUser.State> logInAsync(String str, String str2, String str3);

    Task<Void> requestPasswordResetAsync(String str);

    Task<ParseUser.State> signUpAsync(ParseObject.State state, ParseOperationSet parseOperationSet, String str, String str2);
}
