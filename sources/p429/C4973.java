package p429;

import android.content.Context;
import java.io.IOException;
import p072.InterfaceC1594;
import p077.C1678;
import p155.EnumC2332;
import p164.InterfaceC2379;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹶˎ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4973 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f18802;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C4949 f18803;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ String f18804;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4973(C4949 c4949, String str, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18803 = c4949;
        this.f18804 = str;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4973) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f18802;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                C4988 c4988 = C4949.f18718;
                Context context = this.f18803.f18722;
                c4988.getClass();
                InterfaceC2379 interfaceC2379 = (InterfaceC2379) C4949.f18719.m8860(context, C4988.f18847[0]);
                C4951 c4951 = new C4951(this.f18804, null);
                this.f18802 = 1;
                if (interfaceC2379.mo5364(new C1678(c4951, null), this) == enumC2332) {
                    return enumC2332;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ˉⁱ.ˆʿ(obj);
            }
        } catch (IOException e) {
            String str = "Failed to update session Id: " + e;
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C4973(this.f18803, this.f18804, interfaceC3746);
    }
}
