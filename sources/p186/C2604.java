package p186;

import ar.tvplayer.tv.LibTvPlayerApplication;
import java.util.AbstractCollection;
import java.util.List;
import p181.C2510;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ˎʼ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2604 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f10372;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C2510 f10373;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10374;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ String f10375;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2604(List list, boolean z, String str, C2510 c2510, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10372 = (AbstractCollection) list;
        this.f10374 = z;
        this.f10375 = str;
        this.f10373 = c2510;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2604 c2604 = (C2604) LibTvPlayerApplication.i(768, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(578, (Object) c2604, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        Object objM1488i = LibTvPlayerApplication.m1488i(235, (Object) this);
        if (LibTvPlayerApplication.m1512i(300, objM1488i)) {
            boolean zM1512i = LibTvPlayerApplication.m1512i(611, (Object) this);
            Object objM1488i2 = LibTvPlayerApplication.m1488i(231, (Object) this);
            if (zM1512i) {
                Object objM1484i = LibTvPlayerApplication.m1484i(152);
                Object objM1484i2 = LibTvPlayerApplication.m1484i(698);
                Object objM1488i3 = LibTvPlayerApplication.m1488i(820, (Object) this);
                LibTvPlayerApplication.i(322, objM1484i2, objM1488i3, 10, objM1488i2);
                if (LibTvPlayerApplication.m1512i(144, objM1484i)) {
                    Object objM1484i3 = LibTvPlayerApplication.m1484i(311);
                    LibTvPlayerApplication.i(260, objM1484i3, objM1484i, objM1488i3, objM1484i2, 1);
                    Object objM1484i4 = LibTvPlayerApplication.m1484i(520);
                    LibTvPlayerApplication.i(821, objM1484i4, objM1484i, 23, objM1484i2);
                    if (LibTvPlayerApplication.i(125, objM1484i, objM1484i3, 30000L, objM1484i4, LibTvPlayerApplication.m1488i(491, objM1484i)) == null) {
                        LibTvPlayerApplication.m1502i(20, objM1484i, LibTvPlayerApplication.m1486i(21, 25, 11, LibTvPlayerApplication.m1488i(586, objM1484i)));
                        LibTvPlayerApplication.m1498i(89, objM1484i2);
                    }
                } else {
                    LibTvPlayerApplication.m1502i(20, objM1484i, LibTvPlayerApplication.m1486i(21, 2, 11, LibTvPlayerApplication.m1484i(75)));
                    LibTvPlayerApplication.m1498i(89, objM1484i2);
                }
            } else {
                LibTvPlayerApplication.m1498i(507, objM1488i2);
            }
        } else {
            LibTvPlayerApplication.m1514i(629, LibTvPlayerApplication.m1484i(123), objM1488i, false);
        }
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(242);
        LibTvPlayerApplication.i(699, objM1484i, LibTvPlayerApplication.m1488i(235, (Object) this), LibTvPlayerApplication.m1512i(611, (Object) this), LibTvPlayerApplication.m1488i(820, (Object) this), LibTvPlayerApplication.m1488i(231, (Object) this), interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
