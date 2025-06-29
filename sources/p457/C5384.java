package p457;

import java.util.concurrent.CancellationException;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p410.C4681;
import p410.C4682;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞﹶ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5384 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f20853;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C4682 f20854;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f20855;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2567 f20856;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5384(InterfaceC3864 interfaceC3864, C4682 c4682, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f20856 = (AbstractC2567) interfaceC3864;
        this.f20854 = c4682;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C5384) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f20853;
        C4682 c4682 = this.f20854;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                InterfaceC1594 interfaceC1594 = (InterfaceC1594) this.f20855;
                ?? r1 = this.f20856;
                this.f20853 = 1;
                obj = r1.mo1054(interfaceC1594, this);
                if (obj == enumC2332) {
                    return enumC2332;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ˉⁱ.ˆʿ(obj);
            }
            c4682.m10585(obj);
        } catch (CancellationException unused) {
            c4682.f17820 = true;
            C4681 c4681 = c4682.f17817;
            if (c4681 != null && c4681.f17815.cancel(true)) {
                c4682.f17819 = null;
                c4682.f17817 = null;
                c4682.f17818 = null;
            }
        } catch (Throwable th) {
            c4682.m10584(th);
        }
        return C3397.f13249;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C5384 c5384 = new C5384(this.f20856, this.f20854, interfaceC3746);
        c5384.f20855 = obj;
        return c5384;
    }
}
