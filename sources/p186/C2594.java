package p186;

import androidx.fragment.app.AbstractActivityC0113;
import ar.tvplayer.tv.LibTvPlayerApplication;
import java.util.AbstractCollection;
import java.util.List;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ˎʼ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2594 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f10322;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ String f10323;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC0113 f10324;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10325;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2594(List list, AbstractActivityC0113 abstractActivityC0113, boolean z, String str, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10322 = (AbstractCollection) list;
        this.f10324 = abstractActivityC0113;
        this.f10325 = z;
        this.f10323 = str;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2594 c2594 = (C2594) LibTvPlayerApplication.i(703, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(710, (Object) c2594, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        Object objM1488i = LibTvPlayerApplication.m1488i(308, (Object) this);
        if (LibTvPlayerApplication.m1512i(780, objM1488i) || !LibTvPlayerApplication.m1514i(629, LibTvPlayerApplication.m1484i(123), objM1488i, false)) {
            LibTvPlayerApplication.m1484i(123);
            Object objM1484i = LibTvPlayerApplication.m1484i(773);
            LibTvPlayerApplication.i(599, objM1484i, LibTvPlayerApplication.m1488i(479, (Object) this), LibTvPlayerApplication.m1488i(199, (Object) this), LibTvPlayerApplication.m1512i(754, (Object) this));
            LibTvPlayerApplication.i(427, true, objM1484i);
        }
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(683);
        LibTvPlayerApplication.i(267, objM1484i, LibTvPlayerApplication.m1488i(308, (Object) this), LibTvPlayerApplication.m1488i(479, (Object) this), LibTvPlayerApplication.m1512i(754, (Object) this), LibTvPlayerApplication.m1488i(199, (Object) this), interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
