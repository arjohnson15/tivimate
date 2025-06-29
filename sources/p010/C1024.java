package p010;

import java.util.concurrent.atomic.AtomicInteger;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p184.InterfaceC2551;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.C4883;
import ˈⁱ.ˉⁱ;

/* renamed from: ʻˎ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1024 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4405;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ AtomicInteger f4406;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C4883 f4407;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2551[] f4408;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4409;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024(InterfaceC2551[] interfaceC2551Arr, int i, AtomicInteger atomicInteger, C4883 c4883, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4408 = interfaceC2551Arr;
        this.f4409 = i;
        this.f4406 = atomicInteger;
        this.f4407 = c4883;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1024) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4405;
        AtomicInteger atomicInteger = this.f4406;
        C4883 c4883 = this.f4407;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                InterfaceC2551[] interfaceC2551Arr = this.f4408;
                int i2 = this.f4409;
                InterfaceC2551 interfaceC2551 = interfaceC2551Arr[i2];
                C1012 c1012 = new C1012(c4883, i2);
                this.f4405 = 1;
                if (interfaceC2551.mo3972(c1012, this) == enumC2332) {
                    return enumC2332;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ˉⁱ.ˆʿ(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                c4883.m10998(null);
            }
            return C3397.f13249;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c4883.m10998(null);
            }
        }
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1024(this.f4408, this.f4409, this.f4406, this.f4407, interfaceC3746);
    }
}
