package p240;

import p080.C1704;

/* renamed from: ˑⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3100 extends C1704 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f11984;

    public C3100(int i) {
        super(i);
        this.f11984 = new Object();
    }

    @Override // p080.C1704
    /* renamed from: ˑʽ */
    public final boolean mo5418(Object obj) {
        boolean zMo5418;
        synchronized (this.f11984) {
            zMo5418 = super.mo5418(obj);
        }
        return zMo5418;
    }

    @Override // p080.C1704
    /* renamed from: ـﹶ */
    public final Object mo5419() {
        Object objMo5419;
        synchronized (this.f11984) {
            objMo5419 = super.mo5419();
        }
        return objMo5419;
    }
}
