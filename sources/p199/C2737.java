package p199;

import android.net.Uri;
import p072.InterfaceC1594;
import p116.C1838;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˎـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2737 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f10713;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C2739 f10714;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ Uri f10715;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2737(C2739 c2739, Uri uri, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10714 = c2739;
        this.f10715 = uri;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2737) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f10713;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C1838 c1838 = this.f10714.f10718;
            this.f10713 = 1;
            if (c1838.m5602(this.f10715, this) == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C2737(this.f10714, this.f10715, interfaceC3746);
    }
}
