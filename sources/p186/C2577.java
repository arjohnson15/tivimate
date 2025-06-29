package p186;

import ar.tvplayer.tv.LibTvPlayerApplication;
import p181.C2510;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ˎʼ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2577 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ String f10239;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C2510 f10240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2577(String str, C2510 c2510, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10239 = str;
        this.f10240 = c2510;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2577 c2577 = (C2577) LibTvPlayerApplication.i(413, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(850, (Object) c2577, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        LibTvPlayerApplication.m1484i(123);
        Object objM1484i = LibTvPlayerApplication.m1484i(773);
        LibTvPlayerApplication.i(723, objM1484i, 1, LibTvPlayerApplication.m1488i(448, (Object) this), LibTvPlayerApplication.m1488i(278, (Object) this), false);
        LibTvPlayerApplication.i(427, false, objM1484i);
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(407);
        LibTvPlayerApplication.m1505i(438, objM1484i, LibTvPlayerApplication.m1488i(448, (Object) this), LibTvPlayerApplication.m1488i(278, (Object) this), (Object) interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
