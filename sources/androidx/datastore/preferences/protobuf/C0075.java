package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0075 implements PrivilegedExceptionAction {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Unsafe m562() throws IllegalAccessException, SecurityException, IllegalArgumentException {
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
        return m562();
    }
}
