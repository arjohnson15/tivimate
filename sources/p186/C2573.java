package p186;

import android.content.Context;
import ar.tvplayer.tv.LibTvPlayerApplication;
import p185.AbstractC2567;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ˎʼ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2573 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Context f10229;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2573(Context context, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10229 = context;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C2573 c2573 = (C2573) LibTvPlayerApplication.i(701, (Object) this, obj, obj2);
        Object objM1484i = LibTvPlayerApplication.m1484i(184);
        LibTvPlayerApplication.m1490i(817, (Object) c2573, objM1484i);
        return objM1484i;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        LibTvPlayerApplication.m1498i(72, obj);
        LibTvPlayerApplication.m1488i(567, LibTvPlayerApplication.m1488i(708, (Object) this));
        return LibTvPlayerApplication.m1484i(184);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        Object objM1484i = LibTvPlayerApplication.m1484i(589);
        LibTvPlayerApplication.m1504i(547, objM1484i, LibTvPlayerApplication.m1488i(708, (Object) this), (Object) interfaceC3746);
        return (InterfaceC3746) objM1484i;
    }
}
