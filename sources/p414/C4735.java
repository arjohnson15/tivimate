package p414;

import android.os.Build;
import p072.AbstractC1642;
import p072.InterfaceC1594;
import p106.ExecutorC1797;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.C3768;
import p338.InterfaceC3864;
import p406.AbstractC4663;
import p406.C4647;
import p406.C4652;
import p410.C4681;
import p457.AbstractC5366;
import p457.C5391;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳـ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4735 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f18157;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C4647 f18158;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C4715 f18159;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5366 f18160;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4735(C4715 c4715, AbstractC5366 abstractC5366, C4647 c4647, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18159 = c4715;
        this.f18160 = abstractC5366;
        this.f18158 = c4647;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4735) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws Throwable {
        Object objM5295;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f18157;
        C4715 c4715 = this.f18159;
        AbstractC5366 abstractC5366 = this.f18160;
        C3768 c3768 = c4715.f18097;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f18157 = 1;
            String str = AbstractC4663.f17793;
            boolean z = c3768.f14580;
            Object obj2 = C3397.f13249;
            if (z && Build.VERSION.SDK_INT < 31 && (objM5295 = AbstractC1642.m5295(AbstractC1642.m5305((ExecutorC1797) c4715.f18100.ᐧˋ), new C4652(abstractC5366, c3768, this.f18158, c4715.f18089, null), this)) == enumC2332) {
                obj2 = objM5295;
            }
            if (obj2 == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ˉⁱ.ˆʿ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        String str2 = AbstractC4730.f18154;
        C5391.m12163().m12168(str2, "Starting work for " + c3768.f14573);
        C4681 c4681Mo1370 = abstractC5366.mo1370();
        this.f18157 = 2;
        obj = AbstractC4730.m10644(c4681Mo1370, abstractC5366, this);
        return obj == enumC2332 ? enumC2332 : obj;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C4735(this.f18159, this.f18160, this.f18158, interfaceC3746);
    }
}
