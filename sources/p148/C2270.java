package p148;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p072.AbstractC1610;
import p072.AbstractC1636;
import p072.C1602;
import p072.InterfaceC1621;
import p072.InterfaceC1639;
import p072.RunnableC1625;
import p330.InterfaceC3747;
import p395.RunnableC4533;
import ˆʽ.ᵎˏ;

/* renamed from: ˊʻ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2270 extends AbstractC1636 implements InterfaceC1621 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9007 = AtomicIntegerFieldUpdater.newUpdater(C2270.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1621 f9008;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f9009;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC1636 f9010;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f9011;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2259 f9012;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Object f9013;

    /* JADX WARN: Multi-variable type inference failed */
    public C2270(AbstractC1636 abstractC1636, int i, String str) {
        InterfaceC1621 interfaceC1621 = abstractC1636 instanceof InterfaceC1621 ? (InterfaceC1621) abstractC1636 : null;
        this.f9008 = interfaceC1621 == null ? AbstractC1610.f6388 : interfaceC1621;
        this.f9010 = abstractC1636;
        this.f9011 = i;
        this.f9009 = str;
        this.f9012 = new C2259();
        this.f9013 = new Object();
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        String str = this.f9009;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9010);
        sb.append(".limitedParallelism(");
        return ᵎˏ.ᵎـ(sb, this.f9011, ')');
    }

    @Override // p072.AbstractC1636
    /* renamed from: ʽˆ */
    public final void mo5275(InterfaceC3747 interfaceC3747, Runnable runnable) {
        Runnable runnableM6289;
        this.f9012.m6264(runnable);
        if (f9007.get(this) >= this.f9011 || !m6290() || (runnableM6289 = m6289()) == null) {
            return;
        }
        this.f9010.mo5275(this, new RunnableC4533(19, this, runnableM6289, false));
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ʿʼ */
    public final void mo5197(long j, C1602 c1602) {
        this.f9008.mo5197(j, c1602);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        Runnable runnableM6289;
        this.f9012.m6264(runnable);
        if (f9007.get(this) >= this.f9011 || !m6290() || (runnableM6289 = m6289()) == null) {
            return;
        }
        this.f9010.mo5198(this, new RunnableC4533(19, this, runnableM6289, false));
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final Runnable m6289() {
        while (true) {
            Runnable runnable = (Runnable) this.f9012.m6265();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f9013) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9007;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f9012.m6263() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ */
    public final AbstractC1636 mo5222(int i, String str) {
        AbstractC2269.m6283(1);
        return 1 >= this.f9011 ? str != null ? new C2272(this, str) : this : super.mo5222(1, str);
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ᵎـ */
    public final InterfaceC1639 mo5200(long j, RunnableC1625 runnableC1625, InterfaceC3747 interfaceC3747) {
        return this.f9008.mo5200(j, runnableC1625, interfaceC3747);
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final boolean m6290() {
        synchronized (this.f9013) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9007;
            if (atomicIntegerFieldUpdater.get(this) >= this.f9011) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
