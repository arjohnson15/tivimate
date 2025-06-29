package p363;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p158.AbstractC2339;
import ˊﹶ.ˋˉ;
import ˎˊ.ˏʾ;

/* renamed from: ᵔⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4131 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f16010;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList f16011 = new ArrayList();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f16012;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4132 f16013;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f16014;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public AbstractC4133 f16015;

    public C4131(C4132 c4132, String str) {
        this.f16013 = c4132;
        this.f16010 = str;
    }

    public final String toString() {
        return this.f16010;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m9477() {
        AbstractC4133 abstractC4133 = this.f16015;
        if (abstractC4133 != null && abstractC4133.f16025) {
            this.f16014 = true;
        }
        ArrayList arrayList = this.f16011;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC4133) arrayList.get(size)).f16025) {
                AbstractC4133 abstractC41332 = (AbstractC4133) arrayList.get(size);
                if (C4132.f16017.isLoggable(Level.FINE)) {
                    ˏʾ.ʽᐧ(abstractC41332, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9478() {
        byte[] bArr = AbstractC2339.f9301;
        synchronized (this.f16013) {
            this.f16012 = true;
            if (m9477()) {
                this.f16013.m9486(this);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9479(AbstractC4133 abstractC4133, long j) {
        synchronized (this.f16013) {
            if (!this.f16012) {
                if (m9481(abstractC4133, j, false)) {
                    this.f16013.m9486(this);
                }
            } else if (abstractC4133.f16025) {
                if (C4132.f16017.isLoggable(Level.FINE)) {
                    ˏʾ.ʽᐧ(abstractC4133, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C4132.f16017.isLoggable(Level.FINE)) {
                    ˏʾ.ʽᐧ(abstractC4133, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9480() {
        byte[] bArr = AbstractC2339.f9301;
        synchronized (this.f16013) {
            if (m9477()) {
                this.f16013.m9486(this);
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m9481(AbstractC4133 abstractC4133, long j, boolean z) {
        C4131 c4131 = abstractC4133.f16026;
        if (c4131 != this) {
            if (c4131 != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            abstractC4133.f16026 = this;
        }
        ˋˉ r0 = this.f16013.f16021;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f16011;
        int iIndexOf = arrayList.indexOf(abstractC4133);
        if (iIndexOf != -1) {
            if (abstractC4133.f16028 <= j2) {
                if (C4132.f16017.isLoggable(Level.FINE)) {
                    ˏʾ.ʽᐧ(abstractC4133, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        abstractC4133.f16028 = j2;
        if (C4132.f16017.isLoggable(Level.FINE)) {
            ˏʾ.ʽᐧ(abstractC4133, this, z ? "run again after ".concat(ˏʾ.ˑי(j2 - jNanoTime)) : "scheduled after ".concat(ˏʾ.ˑי(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC4133) it.next()).f16028 - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, abstractC4133);
        return size == 0;
    }
}
