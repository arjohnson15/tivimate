package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0760 implements PrivilegedExceptionAction {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Unsafe m3171() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return m3171();
    }
}
