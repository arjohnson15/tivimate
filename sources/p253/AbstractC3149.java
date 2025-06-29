package p253;

import java.util.concurrent.Executor;
import p072.AbstractC1633;
import p330.InterfaceC3747;

/* renamed from: יˑ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3149 extends AbstractC1633 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ExecutorC3140 f12162;

    public AbstractC3149(int i, int i2, long j, String str) {
        this.f12162 = new ExecutorC3140(i, i2, j, str);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ʽˆ */
    public final void mo5275(InterfaceC3747 interfaceC3747, Runnable runnable) {
        ExecutorC3140.m7784(this.f12162, runnable, true, 2);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        ExecutorC3140.m7784(this.f12162, runnable, false, 6);
    }

    @Override // p072.AbstractC1633
    /* renamed from: ـᵎ */
    public final Executor mo5199() {
        return this.f12162;
    }
}
