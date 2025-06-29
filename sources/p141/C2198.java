package p141;

import java.util.TreeSet;
import p036.C1259;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉˑ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2198 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f8649;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f8650;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TreeSet f8651 = new TreeSet(new C1259(13));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f8652;

    public C2198() {
        m6128();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m6127(int i, int i2) {
        int iMin;
        int i3 = i - i2;
        return (Math.abs(i3) <= 1000 || (iMin = (Math.min(i, i2) - Math.max(i, i2)) + 65535) >= 1000) ? i3 : i < i2 ? iMin : -iMin;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m6128() {
        this.f8651.clear();
        this.f8652 = false;
        this.f8650 = -1;
        this.f8649 = -1;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m6129(C2217 c2217, long j) {
        if (this.f8651.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = c2217.f8778;
        if (!this.f8652) {
            m6128();
            this.f8650 = ـﹶ.ˎˑ(i - 1);
            this.f8652 = true;
            m6130(new C2192(c2217, j));
            return;
        }
        if (Math.abs(m6127(i, C2217.m6189(this.f8649))) < 1000) {
            if (m6127(i, this.f8650) > 0) {
                m6130(new C2192(c2217, j));
            }
        } else {
            this.f8650 = ـﹶ.ˎˑ(i - 1);
            this.f8651.clear();
            m6130(new C2192(c2217, j));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m6130(C2192 c2192) {
        this.f8649 = c2192.f8619.f8778;
        this.f8651.add(c2192);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized C2217 m6131(long j) {
        if (this.f8651.isEmpty()) {
            return null;
        }
        C2192 c2192 = (C2192) this.f8651.first();
        int i = c2192.f8619.f8778;
        if (i != C2217.m6189(this.f8650) && j < c2192.f8618) {
            return null;
        }
        this.f8651.pollFirst();
        this.f8650 = i;
        return c2192.f8619;
    }
}
