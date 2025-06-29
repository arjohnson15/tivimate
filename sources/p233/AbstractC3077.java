package p233;

import java.lang.reflect.Method;
import p070.AbstractC1549;

/* renamed from: ˑˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3077 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Method f11865;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC1549.m5138(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (AbstractC1549.m5138(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f11865 = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC1549.m5138(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
