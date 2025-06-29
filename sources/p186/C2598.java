package p186;

import ar.tvplayer.tv.LibTvPlayerApplication;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import p181.C2510;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p338.InterfaceC3865;

/* renamed from: ˎʼ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2598 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C2510 f10345;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f10346;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3865 f10347;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2598(C2510 c2510, ArrayList arrayList, InterfaceC3865 interfaceC3865, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10345 = c2510;
        this.f10346 = arrayList;
        this.f10347 = interfaceC3865;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2598 c2598 = (C2598) LibTvPlayerApplication.i(496, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(627, (Object) c2598, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        SkuDetails skuDetails;
        LibTvPlayerApplication.m1498i(72, obj);
        if (LibTvPlayerApplication.m1480i(112, LibTvPlayerApplication.m1488i(575, (Object) this)) == 0) {
            LibTvPlayerApplication.m1484i(123);
            Object objM1488i = LibTvPlayerApplication.m1488i(321, (Object) this);
            Object objM1490i = (objM1488i == null || (skuDetails = (SkuDetails) LibTvPlayerApplication.m1488i(561, objM1488i)) == null) ? null : LibTvPlayerApplication.m1490i(-1, LibTvPlayerApplication.m1488i(16, (Object) skuDetails), (Object) ProtectedTvPlayerApplication.s("\u008c"));
            if (objM1490i == null) {
                objM1490i = "";
            }
            LibTvPlayerApplication.m1498i(355, objM1490i);
            Object objM1488i2 = LibTvPlayerApplication.m1488i(376, (Object) this);
            if (objM1488i2 != null) {
                LibTvPlayerApplication.m1488i(577, objM1488i2);
            }
        }
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(516);
        LibTvPlayerApplication.m1506i(666, objM1484i, LibTvPlayerApplication.m1488i(575, (Object) this), LibTvPlayerApplication.m1488i(321, (Object) this), LibTvPlayerApplication.m1488i(376, (Object) this), (Object) interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
