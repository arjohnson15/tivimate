package p148;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p072.InterfaceC1579;
import p330.InterfaceC3747;

/* renamed from: ˊʻ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2263 extends AbstractC2256 implements InterfaceC1579 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8995 = AtomicIntegerFieldUpdater.newUpdater(AbstractC2263.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f8996;

    public AbstractC2263(long j, AbstractC2263 abstractC2263, int i) {
        super(abstractC2263);
        this.f8996 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m6270() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f8995;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo5610() && m6258() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    /* renamed from: ˏᵢ */
    public abstract void mo5609(int i, InterfaceC3747 interfaceC3747);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m6271() {
        return f8995.addAndGet(this, -65536) == mo5610() && m6258() != null;
    }

    /* renamed from: ᐧʻ */
    public abstract int mo5610();

    @Override // p148.AbstractC2256
    /* renamed from: ﹳﹳ */
    public final boolean mo6259() {
        return f8995.get(this) == mo5610() && m6258() != null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m6272() {
        if (f8995.incrementAndGet(this) == mo5610()) {
            m6257();
        }
    }
}
