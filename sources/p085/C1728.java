package p085;

import java.util.concurrent.atomic.AtomicInteger;
import p023.C1147;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.C3768;
import p338.InterfaceC3864;
import p395.InterfaceFutureC4542;
import ˈⁱ.ˉⁱ;

/* renamed from: ʿᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1728 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6720;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ AtomicInteger f6721;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceFutureC4542 f6722;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f6723;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3768 f6724;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728(C1147 c1147, C3768 c3768, AtomicInteger atomicInteger, InterfaceFutureC4542 interfaceFutureC4542, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6723 = c1147;
        this.f6724 = c3768;
        this.f6721 = atomicInteger;
        this.f6722 = interfaceFutureC4542;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1728) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6720;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f6720 = 1;
            obj = AbstractC1720.m5451(this.f6723, this.f6724, this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        this.f6721.set(((Number) obj).intValue());
        this.f6722.cancel(true);
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1728(this.f6723, this.f6724, this.f6721, this.f6722, interfaceC3746);
    }
}
