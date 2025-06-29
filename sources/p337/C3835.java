package p337;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import j$.util.Objects;
import p166.C2397;
import p345.AbstractC3980;
import p345.C3930;
import p345.C3932;
import p345.C3961;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3835 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C3930 f14732;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3835 f14733 = new C3835(AbstractC3980.m9207(C3813.f14679));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3932 f14734 = AbstractC3980.m9203(2, 5, 6);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14735;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SparseArray f14736 = new SparseArray();

    static {
        ᐧʻ r0 = new ᐧʻ(4);
        r0.ﾞˊ(5, 6);
        r0.ﾞˊ(17, 6);
        r0.ﾞˊ(7, 6);
        r0.ﾞˊ(30, 10);
        r0.ﾞˊ(18, 6);
        r0.ﾞˊ(6, 8);
        r0.ﾞˊ(8, 8);
        r0.ﾞˊ(14, 8);
        f14732 = r0.ﹳﹳ();
    }

    public C3835(C3932 c3932) {
        for (int i = 0; i < c3932.f15276; i++) {
            C3813 c3813 = (C3813) c3932.get(i);
            this.f14736.put(c3813.f14682, c3813);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f14736.size(); i2++) {
            iMax = Math.max(iMax, ((C3813) this.f14736.valueAt(i2)).f14680);
        }
        this.f14735 = iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p337.C3835 m8979(android.content.Context r5, android.content.Intent r6, p166.C2397 r7, p337.C3818 r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3835.m8979(android.content.Context, android.content.Intent, ˊﹶ.ʿʼ, ᵎˆ.ˉי):ᵎˆ.ٴˎ");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C3835 m8980(Context context, C2397 c2397, C3818 c3818) {
        return m8979(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c2397, c3818);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3932 m8981(int[] iArr, int i) {
        C3961 c3961M9205 = AbstractC3980.m9205();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            c3961M9205.m9172(new C3813(i2, i));
        }
        return c3961M9205.m9167();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[EDGE_INSN: B:13:0x0019->B:27:0x004a BREAK  A[LOOP:0: B:21:0x0032->B:25:0x0047]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof p337.C3835
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᵎˆ.ٴˎ r9 = (p337.C3835) r9
            android.util.SparseArray r1 = r8.f14736
            android.util.SparseArray r3 = r9.f14736
            int r4 = p383.AbstractC4470.f17202
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = 0
            goto L4a
        L1b:
            int r4 = p383.AbstractC4470.f17202
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = p337.AbstractC3834.m8965(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = 0
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = 1
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.f14735
            int r9 = r9.f14735
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3835.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f14736;
        if (AbstractC4470.f17202 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i = 0; i < sparseArray.size(); i++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f14735;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14735 + ", audioProfiles=" + this.f14736 + "]";
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m8982(int i) {
        SparseArray sparseArray = this.f14736;
        int i2 = AbstractC4470.f17202;
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair m8983(p166.C2397 r17, p166.C2431 r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3835.m8983(ˊﹶ.ʿʼ, ˊﹶ.ᵎـ):android.util.Pair");
    }
}
