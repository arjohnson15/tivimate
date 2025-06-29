package p414;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p406.AbstractC4651;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳـ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4716 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ boolean f18102;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Context f18103;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4716(Context context, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18103 = context;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C4716 c4716 = (C4716) mo1056(bool, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c4716.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        AbstractC4651.m10555(this.f18103, RescheduleReceiver.class, this.f18102);
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C4716 c4716 = new C4716(this.f18103, interfaceC3746);
        c4716.f18102 = ((Boolean) obj).booleanValue();
        return c4716;
    }
}
