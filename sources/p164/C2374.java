package p164;

import android.support.v4.media.session.AbstractC0001;
import java.util.List;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊᵔ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2374 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f9391;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f9392;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ List f9393;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374(List list, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f9393 = list;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2374) mo1056((C2391) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f9391;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C2391 c2391 = (C2391) this.f9392;
            this.f9391 = 1;
            if (AbstractC0001.m16(this.f9393, c2391, this) == enumC2332) {
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
        C2374 c2374 = new C2374(this.f9393, interfaceC3746);
        c2374.f9392 = obj;
        return c2374;
    }
}
