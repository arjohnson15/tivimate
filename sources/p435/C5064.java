package p435;

import java.lang.reflect.Method;

/* renamed from: ﹶᵔ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5064 extends AbstractC5047 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final /* synthetic */ Object f19210;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final /* synthetic */ Class f19211;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final /* synthetic */ Method f19212;

    public C5064(Method method, Object obj, Class cls) {
        this.f19212 = method;
        this.f19210 = obj;
        this.f19211 = cls;
    }

    public final String toString() {
        return this.f19211.getName();
    }

    @Override // p435.AbstractC5047
    /* renamed from: ʿʼ */
    public final Object mo11156() {
        return this.f19212.invoke(this.f19210, this.f19211);
    }
}
