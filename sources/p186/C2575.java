package p186;

import ar.tvplayer.tv.LibTvPlayerApplication;
import java.util.AbstractCollection;
import java.util.List;
import p181.C2510;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ˎʼ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2575 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C2510 f10232;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f10233;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2575(C2510 c2510, List list, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10232 = c2510;
        this.f10233 = (AbstractCollection) list;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2575 c2575 = (C2575) LibTvPlayerApplication.i(342, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(390, (Object) c2575, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        if (LibTvPlayerApplication.m1480i(112, LibTvPlayerApplication.m1488i(275, (Object) this)) == 0) {
            LibTvPlayerApplication.m1514i(629, LibTvPlayerApplication.m1484i(123), LibTvPlayerApplication.m1488i(570, (Object) this), true);
        }
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(776);
        LibTvPlayerApplication.m1505i(360, objM1484i, LibTvPlayerApplication.m1488i(275, (Object) this), LibTvPlayerApplication.m1488i(570, (Object) this), (Object) interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
