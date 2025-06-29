package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import p417.AbstractC4753;

/* loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        AbstractC4753.m10680(str, "Detail message must not be empty");
    }
}
