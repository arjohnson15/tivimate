package p023;

import android.net.NetworkRequest;
import p072.AbstractC1642;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.C4885;
import p423.InterfaceC4887;
import p457.C5358;
import p457.C5391;
import ˈⁱ.ˉⁱ;

/* renamed from: ʼʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1146 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4785;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C1141 f4786;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f4787;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C5358 f4788;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146(C5358 c5358, C1141 c1141, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4788 = c5358;
        this.f4786 = c1141;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1146) mo1056((InterfaceC4887) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4785;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            InterfaceC4887 interfaceC4887 = (InterfaceC4887) this.f4787;
            NetworkRequest networkRequestM12153 = this.f4788.m12153();
            if (networkRequestM12153 == null) {
                C4885 c4885 = (C4885) interfaceC4887;
                c4885.getClass();
                c4885.f18391.m10979(null, false);
                return c3397;
            }
            C1141 c1141 = this.f4786;
            C1145 c1145 = new C1145(AbstractC1642.m5294(interfaceC4887, null, 0, new C1135(c1141, interfaceC4887, null), 3), interfaceC4887);
            C5391.m12163().m12168(AbstractC1148.f4791, "NetworkRequestConstraintController register callback");
            c1141.f4777.registerNetworkCallback(networkRequestM12153, c1145);
            C1149 c1149 = new C1149(c1141, 0, c1145);
            this.f4785 = 1;
            if (ˉⁱ.ـﹶ(interfaceC4887, c1149, this) == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1146 c1146 = new C1146(this.f4788, this.f4786, interfaceC3746);
        c1146.f4787 = obj;
        return c1146;
    }
}
