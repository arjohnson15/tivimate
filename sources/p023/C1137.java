package p023;

import java.io.Serializable;
import p070.AbstractC1549;
import p077.C1672;
import p155.EnumC2332;
import p184.InterfaceC2552;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3870;
import ˈⁱ.ˉⁱ;

/* renamed from: ʼʾ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1137 extends AbstractC2567 implements InterfaceC3870 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f4766;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public /* synthetic */ Serializable f4767;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f4768;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC2552 f4769;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1137(int i, InterfaceC3746 interfaceC3746, int i2) {
        super(i, interfaceC3746);
        this.f4766 = i2;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        AbstractC1142 abstractC1142;
        AbstractC1142 abstractC11422;
        switch (this.f4766) {
            case 0:
                EnumC2332 enumC2332 = EnumC2332.f9250;
                int i = this.f4768;
                if (i == 0) {
                    ˉⁱ.ˆʿ(obj);
                    InterfaceC2552 interfaceC2552 = this.f4769;
                    AbstractC1142[] abstractC1142Arr = (AbstractC1142[]) ((Object[]) this.f4767);
                    int length = abstractC1142Arr.length;
                    int i2 = 0;
                    while (true) {
                        abstractC1142 = C1144.f4782;
                        if (i2 < length) {
                            abstractC11422 = abstractC1142Arr[i2];
                            if (AbstractC1549.m5138(abstractC11422, abstractC1142)) {
                                i2++;
                            }
                        } else {
                            abstractC11422 = null;
                        }
                    }
                    if (abstractC11422 != null) {
                        abstractC1142 = abstractC11422;
                    }
                    this.f4768 = 1;
                    if (interfaceC2552.mo3959(abstractC1142, this) == enumC2332) {
                        return enumC2332;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ˉⁱ.ˆʿ(obj);
                }
                return C3397.f13249;
            default:
                EnumC2332 enumC23322 = EnumC2332.f9250;
                int i3 = this.f4768;
                if (i3 == 0) {
                    ˉⁱ.ˆʿ(obj);
                    InterfaceC2552 interfaceC25522 = this.f4769;
                    C1672 c1672 = new C1672(true);
                    this.f4769 = null;
                    this.f4768 = 1;
                    if (interfaceC25522.mo3959(c1672, this) == enumC23322) {
                        return enumC23322;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ˉⁱ.ˆʿ(obj);
                }
                return C3397.f13249;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // p338.InterfaceC3870
    /* renamed from: ﹳﹳ */
    public final Object mo3975(Object obj, Object obj2, Object obj3) {
        InterfaceC2552 interfaceC2552 = (InterfaceC2552) obj;
        switch (this.f4766) {
            case 0:
                C1137 c1137 = new C1137(3, (InterfaceC3746) obj3, 0);
                c1137.f4769 = interfaceC2552;
                c1137.f4767 = (Object[]) obj2;
                return c1137.mo1055(C3397.f13249);
            default:
                C1137 c11372 = new C1137(3, (InterfaceC3746) obj3, 1);
                c11372.f4769 = interfaceC2552;
                c11372.f4767 = (Throwable) obj2;
                return c11372.mo1055(C3397.f13249);
        }
    }
}
