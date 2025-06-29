package p322;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p072.InterfaceC1594;
import p077.C1672;
import p155.EnumC2332;
import p184.AbstractC2539;
import p184.InterfaceC2551;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ᴵˉ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3672 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3678 f14081;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f14082;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3678 f14083;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3672(C3678 c3678, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f14083 = c3678;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C3672) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        C3678 c3678;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f14082;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C3678 c36782 = this.f14083;
            InterfaceC2551 interfaceC2551Mo5363 = c36782.f14103.mo5363();
            this.f14081 = c36782;
            this.f14082 = 1;
            Object objM6674 = AbstractC2539.m6674(interfaceC2551Mo5363, this);
            if (objM6674 == enumC2332) {
                return enumC2332;
            }
            c3678 = c36782;
            obj = objM6674;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3678 = this.f14081;
            ˉⁱ.ˆʿ(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(DesugarCollections.unmodifiableMap(((C1672) obj).f6523));
        new AtomicBoolean(true);
        c3678.getClass();
        c3678.f14102 = new C3676((Boolean) linkedHashMap.get(C3678.f14098), (Double) linkedHashMap.get(C3678.f14101), (Integer) linkedHashMap.get(C3678.f14097), (Integer) linkedHashMap.get(C3678.f14099), (Long) linkedHashMap.get(C3678.f14100));
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C3672(this.f14083, interfaceC3746);
    }
}
