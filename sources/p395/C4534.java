package p395;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: ⁱـ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4534 implements PrivilegedExceptionAction {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Unsafe m10320() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return m10320();
    }
}
