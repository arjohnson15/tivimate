package p363;

import androidx.leanback.widget.RunnableC0183;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p158.AbstractC2339;
import p158.ThreadFactoryC2340;
import ˆʽ.ᵎˏ;
import ˊﹶ.ˋˉ;
import ـˈ.ˉᵎ;

/* renamed from: ᵔⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4132 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C4132 f16016;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Logger f16017;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f16020;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˋˉ f16021;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f16024;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f16018 = 10000;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList f16019 = new ArrayList();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList f16022 = new ArrayList();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final RunnableC0183 f16023 = new RunnableC0183(29, this);

    /* JADX WARN: Type inference failed for: r3v1, types: [ˊˑ.ـﹶ] */
    static {
        final String str = ᵎˏ.ˎٴ(new StringBuilder(), AbstractC2339.f9303, " TaskRunner");
        final boolean z = true;
        f16016 = new C4132(new ˋˉ((ThreadFactoryC2340) new ThreadFactory() { // from class: ˊˑ.ـﹶ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        }));
        f16017 = Logger.getLogger(C4132.class.getName());
    }

    public C4132(ˋˉ r2) {
        this.f16021 = r2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m9482(C4132 c4132, AbstractC4133 abstractC4133) {
        c4132.getClass();
        byte[] bArr = AbstractC2339.f9301;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC4133.f16027);
        try {
            long jMo4576 = abstractC4133.mo4576();
            synchronized (c4132) {
                c4132.m9483(abstractC4133, jMo4576);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c4132) {
                c4132.m9483(abstractC4133, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9483(AbstractC4133 abstractC4133, long j) {
        byte[] bArr = AbstractC2339.f9301;
        C4131 c4131 = abstractC4133.f16026;
        if (c4131.f16015 != abstractC4133) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = c4131.f16014;
        c4131.f16014 = false;
        c4131.f16015 = null;
        this.f16019.remove(c4131);
        if (j != -1 && !z && !c4131.f16012) {
            c4131.m9481(abstractC4133, j, true);
        }
        if (c4131.f16011.isEmpty()) {
            return;
        }
        this.f16022.add(c4131);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4131 m9484() {
        int i;
        synchronized (this) {
            i = this.f16018;
            this.f16018 = i + 1;
        }
        return new C4131(this, ˉᵎ.ˉⁱ("Q", i));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC4133 m9485() {
        boolean z;
        C4132 c4132 = this;
        byte[] bArr = AbstractC2339.f9301;
        while (true) {
            ArrayList arrayList = c4132.f16022;
            if (arrayList.isEmpty()) {
                return null;
            }
            ˋˉ r3 = c4132.f16021;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC4133 abstractC4133 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC4133 abstractC41332 = (AbstractC4133) ((C4131) it.next()).f16011.get(0);
                long jMax = Math.max(0L, abstractC41332.f16028 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC4133 != null) {
                        z = true;
                        break;
                    }
                    abstractC4133 = abstractC41332;
                }
            }
            c4132 = this;
            ArrayList arrayList2 = c4132.f16019;
            if (abstractC4133 != null) {
                byte[] bArr2 = AbstractC2339.f9301;
                abstractC4133.f16028 = -1L;
                C4131 c4131 = abstractC4133.f16026;
                c4131.f16011.remove(abstractC4133);
                arrayList.remove(c4131);
                c4131.f16015 = abstractC4133;
                arrayList2.add(c4131);
                if (z || (!c4132.f16020 && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) r3.ˆʿ).execute(c4132.f16023);
                }
                return abstractC4133;
            }
            if (c4132.f16020) {
                if (jMin < c4132.f16024 - jNanoTime) {
                    notify();
                }
                return null;
            }
            c4132.f16020 = true;
            c4132.f16024 = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    Long.signum(j);
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        c4132.wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C4131) arrayList2.get(size)).m9477();
                    }
                    int i = -1;
                    for (int size2 = arrayList.size() - 1; i < size2; size2--) {
                        C4131 c41312 = (C4131) arrayList.get(size2);
                        c41312.m9477();
                        if (c41312.f16011.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i = -1;
                    }
                }
            } finally {
                c4132.f16020 = false;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9486(C4131 c4131) {
        byte[] bArr = AbstractC2339.f9301;
        if (c4131.f16015 == null) {
            boolean zIsEmpty = c4131.f16011.isEmpty();
            ArrayList arrayList = this.f16022;
            if (zIsEmpty) {
                arrayList.remove(c4131);
            } else if (!arrayList.contains(c4131)) {
                arrayList.add(c4131);
            }
        }
        boolean z = this.f16020;
        ˋˉ r0 = this.f16021;
        if (z) {
            notify();
        } else {
            ((ThreadPoolExecutor) r0.ˆʿ).execute(this.f16023);
        }
    }
}
