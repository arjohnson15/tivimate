package p077;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʿˊ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1678 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6530;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f6531;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2567 f6532;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1678(InterfaceC3864 interfaceC3864, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6532 = (AbstractC2567) interfaceC3864;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1678) mo1056((C1672) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6530;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1672 c1672 = (C1672) this.f6531;
            ˉⁱ.ˆʿ(obj);
            return c1672;
        }
        ˉⁱ.ˆʿ(obj);
        C1672 c16722 = new C1672(new LinkedHashMap(DesugarCollections.unmodifiableMap(((C1672) this.f6531).f6523)), false);
        this.f6531 = c16722;
        this.f6530 = 1;
        return this.f6532.mo1054(c16722, this) == enumC2332 ? enumC2332 : c16722;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1678 c1678 = new C1678(this.f6532, interfaceC3746);
        c1678.f6531 = obj;
        return c1678;
    }
}
