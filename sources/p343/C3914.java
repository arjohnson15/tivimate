package p343;

import java.util.HashMap;

/* renamed from: ᵎـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3914 extends C3915 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final HashMap f15219 = new HashMap();

    @Override // p343.C3915
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object mo9102(Object obj) {
        Object objMo9102 = super.mo9102(obj);
        this.f15219.remove(obj);
        return objMo9102;
    }

    @Override // p343.C3915
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3913 mo9103(Object obj) {
        return (C3913) this.f15219.get(obj);
    }
}
