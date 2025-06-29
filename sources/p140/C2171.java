package p140;

import p013.C1047;
import p070.AbstractC1547;
import p262.InterfaceC3255;
import p280.C3374;
import p338.InterfaceC3865;
import p423.C4874;
import p423.C4883;
import p423.C4884;
import ˈⁱ.ﹳﹳ;

/* renamed from: ˉˏ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2171 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC1547 f8531;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4883 f8532;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3374 f8533;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8534;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2183[] f8535;

    /* JADX WARN: Multi-variable type inference failed */
    public C2171(int i, InterfaceC3865 interfaceC3865) {
        this.f8534 = i;
        this.f8531 = (AbstractC1547) interfaceC3865;
        C3374 c3374 = new C3374();
        c3374.f13199 = 0;
        this.f8533 = c3374;
        this.f8535 = new C2183[i];
        this.f8532 = ﹳﹳ.ـﹶ(i, 0, new C1047(4, this), 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ʿ.ˉי, ᵎˈ.ـﹶ] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6092() {
        int i = this.f8533.f13199;
        if (i >= this.f8534) {
            return;
        }
        C3374 c3374 = this.f8533;
        c3374.getClass();
        if (!C3374.f13198.compareAndSet(c3374, i, i + 1)) {
            m6092();
            return;
        }
        C2183 c2183 = new C2183((InterfaceC3255) this.f8531.mo1053());
        Object objMo10958 = this.f8532.mo10958(c2183);
        if (!(objMo10958 instanceof C4884)) {
            this.f8535[i] = c2183;
            return;
        }
        c2183.close();
        if (!(objMo10958 instanceof C4874)) {
            throw new IllegalStateException("Couldn't send a new connection for acquisition");
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6093(C2183 c2183) {
        Object objMo10958 = this.f8532.mo10958(c2183);
        if (objMo10958 instanceof C4884) {
            c2183.close();
            if (!(objMo10958 instanceof C4874)) {
                throw new IllegalStateException("Couldn't recycle connection");
            }
        }
    }
}
