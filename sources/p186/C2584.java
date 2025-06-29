package p186;

import ar.tvplayer.tv.LibTvPlayerApplication;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ʼʽ.ʿʼ;

/* renamed from: ˎʼ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2584 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3864 f10259;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ ʿʼ f10260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2584(InterfaceC3864 interfaceC3864, ʿʼ r4, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10259 = interfaceC3864;
        this.f10260 = r4;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2584 c2584 = (C2584) LibTvPlayerApplication.i(822, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(559, (Object) c2584, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        Object objM1488i = LibTvPlayerApplication.m1488i(581, (Object) this);
        LibTvPlayerApplication.i(291, LibTvPlayerApplication.m1488i(284, (Object) this), LibTvPlayerApplication.m1488i(113, objM1488i), LibTvPlayerApplication.m1488i(133, objM1488i));
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(830);
        LibTvPlayerApplication.m1505i(810, objM1484i, LibTvPlayerApplication.m1488i(284, (Object) this), LibTvPlayerApplication.m1488i(581, (Object) this), (Object) interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
