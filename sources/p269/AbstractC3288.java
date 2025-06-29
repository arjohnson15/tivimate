package p269;

import p184.C2548;
import p279.AbstractC3370;
import p330.C3749;
import p331.C3768;
import p457.C5358;

/* renamed from: ـˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3288 implements InterfaceC3287 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC3370 f12820;

    public AbstractC3288(AbstractC3370 abstractC3370) {
        this.f12820 = abstractC3370;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract boolean mo8101(Object obj);

    @Override // p269.InterfaceC3287
    /* renamed from: ˑʽ */
    public final boolean mo4161(C3768 c3768) {
        return mo4160(c3768) && mo8101(this.f12820.mo8223());
    }

    @Override // p269.InterfaceC3287
    /* renamed from: ـﹶ */
    public final C2548 mo4162(C5358 c5358) {
        return new C2548(new C3286(this, null), C3749.f14510, -2, 1);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract int mo8102();
}
