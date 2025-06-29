package p435;

import java.lang.reflect.Method;

/* renamed from: ﹶᵔ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5039 extends AbstractC5047 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final /* synthetic */ Class f19118;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19119;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final /* synthetic */ Method f19120;

    public C5039(Method method, Class cls, int i) {
        this.f19120 = method;
        this.f19118 = cls;
        this.f19119 = i;
    }

    public final String toString() {
        return this.f19118.getName();
    }

    @Override // p435.AbstractC5047
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object mo11156() {
        return this.f19120.invoke(null, this.f19118, Integer.valueOf(this.f19119));
    }
}
