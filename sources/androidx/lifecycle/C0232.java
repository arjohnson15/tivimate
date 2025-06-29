package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0232 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Method f1256;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f1257;

    public C0232(Method method, int i) throws SecurityException {
        this.f1257 = i;
        this.f1256 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0232)) {
            return false;
        }
        C0232 c0232 = (C0232) obj;
        return this.f1257 == c0232.f1257 && this.f1256.getName().equals(c0232.f1256.getName());
    }

    public final int hashCode() {
        return this.f1256.getName().hashCode() + (this.f1257 * 31);
    }
}
