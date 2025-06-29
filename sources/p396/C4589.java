package p396;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ⁱᴵ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4589 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f17570;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Method f17571;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f17572;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f17573;

    public C4589(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f17572 = cls;
        this.f17570 = obj;
        this.f17571 = method;
        this.f17573 = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f17572.getName(), this.f17571.getName(), this.f17573);
    }
}
