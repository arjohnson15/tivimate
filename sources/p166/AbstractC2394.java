package p166;

import android.util.Pair;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2394 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2436 f9448 = new C2436();

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
    }

    public final boolean equals(Object obj) {
        int iMo6476;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2394)) {
            return false;
        }
        AbstractC2394 abstractC2394 = (AbstractC2394) obj;
        if (abstractC2394.mo6474() != mo6474() || abstractC2394.mo6475() != mo6475()) {
            return false;
        }
        C2434 c2434 = new C2434();
        C2412 c2412 = new C2412();
        C2434 c24342 = new C2434();
        C2412 c24122 = new C2412();
        for (int i = 0; i < mo6474(); i++) {
            if (!mo6179(i, c2434, 0L).equals(abstractC2394.mo6179(i, c24342, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo6475(); i2++) {
            if (!mo6180(i2, c2412, true).equals(abstractC2394.mo6180(i2, c24122, true))) {
                return false;
            }
        }
        int iMo6478 = mo6478(true);
        if (iMo6478 != abstractC2394.mo6478(true) || (iMo6476 = mo6476(true)) != abstractC2394.mo6476(true)) {
            return false;
        }
        while (iMo6478 != iMo6476) {
            int iMo6470 = mo6470(iMo6478, true, 0);
            if (iMo6470 != abstractC2394.mo6470(iMo6478, true, 0)) {
                return false;
            }
            iMo6478 = iMo6470;
        }
        return true;
    }

    public final int hashCode() {
        C2434 c2434 = new C2434();
        C2412 c2412 = new C2412();
        int iMo6474 = mo6474() + 217;
        for (int i = 0; i < mo6474(); i++) {
            iMo6474 = (iMo6474 * 31) + mo6179(i, c2434, 0L).hashCode();
        }
        int iMo6475 = mo6475() + (iMo6474 * 31);
        for (int i2 = 0; i2 < mo6475(); i2++) {
            iMo6475 = (iMo6475 * 31) + mo6180(i2, c2412, true).hashCode();
        }
        int iMo6478 = mo6478(true);
        while (iMo6478 != -1) {
            iMo6475 = (iMo6475 * 31) + iMo6478;
            iMo6478 = mo6470(iMo6478, true, 0);
        }
        return iMo6475;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract int mo6469(Object obj);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int mo6470(int i, boolean z, int i2) {
        if (i2 == 0) {
            if (i == mo6476(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo6476(z) ? mo6478(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Pair m6471(C2434 c2434, C2412 c2412, int i, long j, long j2) {
        AbstractC4464.m10152(i, mo6474());
        mo6179(i, c2434, j2);
        if (j == -9223372036854775807L) {
            j = c2434.f9706;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c2434.f9716;
        mo6180(i2, c2412, false);
        while (i2 < c2434.f9709 && c2412.f9575 != j) {
            int i3 = i2 + 1;
            if (mo6180(i3, c2412, false).f9575 > j) {
                break;
            }
            i2 = i3;
        }
        mo6180(i2, c2412, true);
        long jMin = j - c2412.f9575;
        long j3 = c2412.f9580;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c2412.f9574;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public abstract Object mo6472(int i);

    /* renamed from: ˋⁱ */
    public abstract C2434 mo6179(int i, C2434 c2434, long j);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int mo6473(int i, boolean z, int i2) {
        if (i2 == 0) {
            if (i == mo6478(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo6478(z) ? mo6476(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public abstract int mo6474();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract int mo6475();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int mo6476(boolean z) {
        if (m6477()) {
            return -1;
        }
        return mo6474() - 1;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m6477() {
        return mo6474() == 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int mo6478(boolean z) {
        return m6477() ? -1 : 0;
    }

    /* renamed from: ٴˎ */
    public abstract C2412 mo6180(int i, C2412 c2412, boolean z);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2412 mo6479(Object obj, C2412 c2412) {
        return mo6180(mo6469(obj), c2412, true);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m6480(int i, C2434 c2434) {
        mo6179(i, c2434, 0L);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m6481(int i, C2412 c2412, C2434 c2434, int i2, boolean z) {
        int i3 = mo6180(i, c2412, false).f9576;
        if (mo6179(i3, c2434, 0L).f9709 != i) {
            return i + 1;
        }
        int iMo6470 = mo6470(i3, z, i2);
        if (iMo6470 == -1) {
            return -1;
        }
        return mo6179(iMo6470, c2434, 0L).f9716;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Pair m6482(C2434 c2434, C2412 c2412, int i, long j) {
        Pair pairM6471 = m6471(c2434, c2412, i, j, 0L);
        pairM6471.getClass();
        return pairM6471;
    }
}
