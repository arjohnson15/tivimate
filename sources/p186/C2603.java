package p186;

import ar.tvplayer.tv.LibTvPlayerApplication;
import p181.C2510;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p338.InterfaceC3865;

/* renamed from: ˎʼ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2603 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C2510 f10369;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3865 f10370;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10371;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603(C2510 c2510, InterfaceC3865 interfaceC3865, boolean z, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10369 = c2510;
        this.f10370 = interfaceC3865;
        this.f10371 = z;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2603 c2603 = (C2603) LibTvPlayerApplication.i(447, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(732, (Object) c2603, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        LibTvPlayerApplication.m1484i(123);
        LibTvPlayerApplication.m1509i(563, LibTvPlayerApplication.m1480i(112, LibTvPlayerApplication.m1488i(135, (Object) this)) == 3);
        Object objM1488i = LibTvPlayerApplication.m1488i(135, (Object) this);
        if (LibTvPlayerApplication.m1480i(112, objM1488i) == 0) {
            LibTvPlayerApplication.m1488i(577, LibTvPlayerApplication.m1488i(779, (Object) this));
        } else if (LibTvPlayerApplication.m1512i(737, (Object) this)) {
            LibTvPlayerApplication.m1498i(507, objM1488i);
        }
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(669);
        LibTvPlayerApplication.i(385, objM1484i, LibTvPlayerApplication.m1488i(135, (Object) this), LibTvPlayerApplication.m1488i(779, (Object) this), LibTvPlayerApplication.m1512i(737, (Object) this), interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
