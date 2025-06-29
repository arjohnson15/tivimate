package p036;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import p076.C1660;
import p076.InterfaceC1670;
import p166.C2431;
import p166.C2433;
import p256.AbstractC3193;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3961;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;

/* renamed from: ʼﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1248 extends AbstractC1238 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public AbstractC3193 f5110;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long f5111;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f5112;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final float f5113;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f5114;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f5115;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final AbstractC3980 f5116;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f5117;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C4460 f5118;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC1670 f5119;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final float f5120;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f5121;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public float f5122;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f5123;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final long f5124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248(C2433 c2433, int[] iArr, InterfaceC1670 interfaceC1670, long j, long j2, long j3, float f, AbstractC3980 abstractC3980) {
        super(c2433, iArr);
        C4460 c4460 = C4460.f17177;
        if (j3 < j) {
            AbstractC4464.m10144("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f5119 = interfaceC1670;
        this.f5117 = j * 1000;
        this.f5124 = j2 * 1000;
        this.f5111 = j3 * 1000;
        this.f5115 = 1279;
        this.f5112 = 719;
        this.f5113 = 0.7f;
        this.f5120 = f;
        this.f5116 = AbstractC3980.m9209(abstractC3980);
        this.f5118 = c4460;
        this.f5122 = 1.0f;
        this.f5121 = 0;
        this.f5123 = -9223372036854775807L;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m4472(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C3961 c3961 = (C3961) arrayList.get(i);
            if (c3961 != null) {
                c3961.m9172(new C1251(j, jArr[i]));
            }
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static long m4473(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC3193 abstractC3193 = (AbstractC3193) AbstractC3968.m9180(list);
        long j = abstractC3193.f12398;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = abstractC3193.f12392;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // p036.AbstractC1238, p036.InterfaceC1239
    /* renamed from: ʿʼ */
    public final void mo4432() {
        this.f5123 = -9223372036854775807L;
        this.f5110 = null;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˉⁱ */
    public final int mo4448() {
        return this.f5121;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˋⁱ */
    public final int mo4449() {
        return this.f5114;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // p036.InterfaceC1239
    /* renamed from: ˎٴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4450(long r14, long r16, long r18, java.util.List r20, p256.InterfaceC3194[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            ᵢᵢ.ˏᴵ r2 = r0.f5118
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f5114
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f5114
            r1 = r1[r4]
            long r4 = r1.mo7666()
            long r6 = r1.mo7665()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.mo7666()
            long r6 = r6.mo7665()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = m4473(r20)
        L43:
            int r1 = r0.f5121
            if (r1 != 0) goto L51
            r1 = 1
            r0.f5121 = r1
            int r1 = r13.m4474(r2)
            r0.f5114 = r1
            return
        L51:
            int r6 = r0.f5114
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = -1
            goto L68
        L5c:
            java.lang.Object r7 = p345.AbstractC3968.m9180(r20)
            יᴵ.ˉⁱ r7 = (p256.AbstractC3193) r7
            ˊﹶ.ᵎـ r7 = r7.f12395
            int r7 = r13.mo4439(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = p345.AbstractC3968.m9180(r20)
            יᴵ.ˉⁱ r1 = (p256.AbstractC3193) r1
            int r1 = r1.f12391
            r6 = r7
        L73:
            int r7 = r13.m4474(r2)
            if (r7 == r6) goto Lb8
            boolean r2 = r13.mo4438(r6, r2)
            if (r2 != 0) goto Lb8
            ˊﹶ.ᵎـ[] r2 = r0.f5060
            r3 = r2[r6]
            r2 = r2[r7]
            long r8 = r0.f5117
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r12 != 0) goto L91
            goto La4
        L91:
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f5120
            float r4 = r4 * r5
            long r4 = (long) r4
            long r8 = java.lang.Math.min(r4, r8)
        La4:
            int r2 = r2.f9691
            int r3 = r3.f9691
            if (r2 <= r3) goto Laf
            int r4 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r4 >= 0) goto Laf
            goto Lb7
        Laf:
            if (r2 >= r3) goto Lb8
            long r2 = r0.f5124
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 < 0) goto Lb8
        Lb7:
            r7 = r6
        Lb8:
            if (r7 != r6) goto Lbb
            goto Lbc
        Lbb:
            r1 = 3
        Lbc:
            r0.f5121 = r1
            r0.f5114 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036.C1248.mo4450(long, long, long, java.util.List, יᴵ.ˋⁱ[]):void");
    }

    @Override // p036.AbstractC1238, p036.InterfaceC1239
    /* renamed from: ˏᴵ */
    public final void mo4436(float f) {
        this.f5122 = f;
    }

    @Override // p036.AbstractC1238, p036.InterfaceC1239
    /* renamed from: ˏᵢ */
    public final void mo4437() {
        this.f5110 = null;
    }

    @Override // p036.InterfaceC1239
    /* renamed from: ˑי */
    public final Object mo4451() {
        return null;
    }

    @Override // p036.AbstractC1238, p036.InterfaceC1239
    /* renamed from: ᐧʻ */
    public final int mo4441(long j, List list) {
        int i;
        int i2;
        this.f5118.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f5123;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC3193) AbstractC3968.m9180(list)).equals(this.f5110))) {
            return list.size();
        }
        this.f5123 = jElapsedRealtime;
        this.f5110 = list.isEmpty() ? null : (AbstractC3193) AbstractC3968.m9180(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM10197 = AbstractC4470.m10197(((AbstractC3193) list.get(size - 1)).f12398 - j, this.f5122);
        long j3 = this.f5111;
        if (jM10197 < j3) {
            return size;
        }
        m4473(list);
        C2431 c2431 = this.f5060[m4474(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3193 abstractC3193 = (AbstractC3193) list.get(i3);
            C2431 c24312 = abstractC3193.f12395;
            if (AbstractC4470.m10197(abstractC3193.f12398 - j, this.f5122) >= j3 && c24312.f9691 < c2431.f9691 && (i = c24312.f9687) != -1 && i <= this.f5112 && (i2 = c24312.f9684) != -1 && i2 <= this.f5115 && i < c2431.f9687) {
                return i3;
            }
        }
        return size;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int m4474(long j) {
        long j2;
        C1660 c1660 = (C1660) this.f5119;
        synchronized (c1660) {
            j2 = c1660.f6487;
        }
        long j3 = (long) (j2 * this.f5113);
        this.f5119.getClass();
        long j4 = (long) (j3 / this.f5122);
        if (!this.f5116.isEmpty()) {
            int i = 1;
            while (i < this.f5116.size() - 1 && ((C1251) this.f5116.get(i)).f5128 < j4) {
                i++;
            }
            C1251 c1251 = (C1251) this.f5116.get(i - 1);
            C1251 c12512 = (C1251) this.f5116.get(i);
            long j5 = c1251.f5128;
            long j6 = c1251.f5127;
            j4 = j6 + ((long) (((j4 - j5) / (c12512.f5128 - j5)) * (c12512.f5127 - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5055; i3++) {
            if (j == Long.MIN_VALUE || !mo4438(i3, j)) {
                if (mo4446(i3).f9691 <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
