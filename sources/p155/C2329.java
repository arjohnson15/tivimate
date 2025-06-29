package p155;

import p070.AbstractC1549;
import p185.AbstractC2561;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊˋ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2329 extends AbstractC2561 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f9241;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3864 f9242;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3746 f9243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2329(InterfaceC3746 interfaceC3746, InterfaceC3746 interfaceC37462, InterfaceC3864 interfaceC3864) {
        super(interfaceC3746);
        this.f9242 = interfaceC3864;
        this.f9243 = interfaceC37462;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        int i = this.f9241;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9241 = 2;
            ˉⁱ.ˆʿ(obj);
            return obj;
        }
        this.f9241 = 1;
        ˉⁱ.ˆʿ(obj);
        InterfaceC3864 interfaceC3864 = this.f9242;
        AbstractC1549.m5141(2, interfaceC3864);
        return interfaceC3864.mo1054(this.f9243, this);
    }
}
