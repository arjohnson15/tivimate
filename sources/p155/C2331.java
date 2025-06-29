package p155;

import p070.AbstractC1549;
import p185.AbstractC2562;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2331 extends AbstractC2562 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3864 f9244;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f9245;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3746 f9246;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331(InterfaceC3746 interfaceC3746, InterfaceC3747 interfaceC3747, InterfaceC3864 interfaceC3864, InterfaceC3746 interfaceC37462) {
        super(interfaceC3746, interfaceC3747);
        this.f9244 = interfaceC3864;
        this.f9246 = interfaceC37462;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        int i = this.f9245;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9245 = 2;
            ˉⁱ.ˆʿ(obj);
            return obj;
        }
        this.f9245 = 1;
        ˉⁱ.ˆʿ(obj);
        InterfaceC3864 interfaceC3864 = this.f9244;
        AbstractC1549.m5141(2, interfaceC3864);
        return interfaceC3864.mo1054(this.f9246, this);
    }
}
