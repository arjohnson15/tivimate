package p438;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import p036.AbstractC1261;
import p036.C1258;
import p036.InterfaceC1239;
import p076.C1653;
import p361.C4092;
import p374.C4241;
import p374.C4264;
import p374.C4266;
import p374.C4281;
import p374.C4290;
import p374.InterfaceC4254;
import p383.AbstractC4464;

/* renamed from: ﹶﾞ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5116 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f19492;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f19493;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final AbstractC1261 f19494;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C5116 f19495;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C4241 f19496;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4092 f19497;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f19498;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean[] f19499;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC4254[] f19500;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f19501;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C5082 f19502;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f19503;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C1258 f19504;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f19505;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractC5115[] f19506;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [ᵢˎ.ˑʽ] */
    public C5116(AbstractC5115[] abstractC5115Arr, long j, AbstractC1261 abstractC1261, C1653 c1653, C4092 c4092, C5082 c5082, C1258 c1258) {
        this.f19506 = abstractC5115Arr;
        this.f19498 = j;
        this.f19494 = abstractC1261;
        this.f19497 = c4092;
        C4290 c4290 = c5082.f19313;
        this.f19492 = c4290.f16693;
        this.f19502 = c5082;
        this.f19496 = C4241.f16463;
        this.f19504 = c1258;
        this.f19500 = new InterfaceC4254[abstractC5115Arr.length];
        this.f19499 = new boolean[abstractC5115Arr.length];
        c4092.getClass();
        int i = C5120.f19583;
        Pair pair = (Pair) c4290.f16693;
        Object obj = pair.first;
        C4290 c4290M9754 = c4290.m9754(pair.second);
        C5088 c5088 = (C5088) ((HashMap) c4092.f15787).get(obj);
        c5088.getClass();
        ((HashSet) c4092.f15791).add(c5088);
        C5112 c5112 = (C5112) ((HashMap) c4092.f15795).get(c5088);
        if (c5112 != null) {
            c5112.f19470.mo9734(c5112.f19468);
        }
        c5088.f19336.add(c4290M9754);
        C4281 c4281Mo6113 = c5088.f19337.mo6113(c4290M9754, c1653, c5082.f19309);
        ((IdentityHashMap) c4092.f15796).put(c4281Mo6113, c5088);
        c4092.m9392();
        long j2 = c5082.f19316;
        this.f19501 = j2 != -9223372036854775807L ? new C4266(c4281Mo6113, true, 0L, j2) : c4281Mo6113;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11341() {
        if (this.f19495 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1258 c1258 = this.f19504;
            if (i >= c1258.f5167) {
                return;
            }
            boolean zM4487 = c1258.m4487(i);
            InterfaceC1239 interfaceC1239 = this.f19504.f5166[i];
            if (zM4487 && interfaceC1239 != null) {
                interfaceC1239.mo4437();
            }
            i++;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long m11342() {
        return this.f19502.f19309 + this.f19498;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x062c  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p036.C1258 m11343(float r38, p166.AbstractC2394 r39) {
        /*
            Method dump skipped, instructions count: 2092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5116.m11343(float, ˊﹶ.ʻʿ):ʼﹶ.ﹳˑ");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11344() {
        if (this.f19495 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1258 c1258 = this.f19504;
            if (i >= c1258.f5167) {
                return;
            }
            boolean zM4487 = c1258.m4487(i);
            InterfaceC1239 interfaceC1239 = this.f19504.f5166[i];
            if (zM4487 && interfaceC1239 != null) {
                interfaceC1239.mo4432();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m11345(C1258 c1258, long j, boolean z, boolean[] zArr) {
        AbstractC5115[] abstractC5115Arr;
        InterfaceC4254[] interfaceC4254Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c1258.f5167) {
                break;
            }
            if (z || !c1258.m4488(this.f19504, i)) {
                z2 = false;
            }
            this.f19499[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC5115Arr = this.f19506;
            int length = abstractC5115Arr.length;
            interfaceC4254Arr = this.f19500;
            if (i2 >= length) {
                break;
            }
            if (abstractC5115Arr[i2].f19476 == -2) {
                interfaceC4254Arr[i2] = null;
            }
            i2++;
        }
        m11341();
        this.f19504 = c1258;
        m11344();
        long jMo6162 = this.f19501.mo6162(c1258.f5166, this.f19499, this.f19500, zArr, j);
        for (int i3 = 0; i3 < abstractC5115Arr.length; i3++) {
            if (abstractC5115Arr[i3].f19476 == -2 && this.f19504.m4487(i3)) {
                interfaceC4254Arr[i3] = new C4264();
            }
        }
        this.f19493 = false;
        for (int i4 = 0; i4 < interfaceC4254Arr.length; i4++) {
            if (interfaceC4254Arr[i4] != null) {
                AbstractC4464.m10132(c1258.m4487(i4));
                if (abstractC5115Arr[i4].f19476 != -2) {
                    this.f19493 = true;
                }
            } else {
                AbstractC4464.m10132(c1258.f5166[i4] == null);
            }
        }
        return jMo6162;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m11346() {
        return this.f19505 && (!this.f19493 || this.f19501.mo6165() == Long.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ᵢˎ.ﾞʽ] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m11347() {
        m11341();
        ?? r0 = this.f19501;
        try {
            boolean z = r0 instanceof C4266;
            C4092 c4092 = this.f19497;
            if (z) {
                c4092.m9387(((C4266) r0).f16573);
            } else {
                c4092.m9387(r0);
            }
        } catch (RuntimeException e) {
            AbstractC4464.m10147("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ᵢˎ.ᵎʽ] */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long m11348() {
        if (!this.f19505) {
            return this.f19502.f19309;
        }
        long jMo6165 = this.f19493 ? this.f19501.mo6165() : Long.MIN_VALUE;
        return jMo6165 == Long.MIN_VALUE ? this.f19502.f19310 : jMo6165;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m11349() {
        Object obj = this.f19501;
        if (obj instanceof C4266) {
            long j = this.f19502.f19316;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C4266 c4266 = (C4266) obj;
            c4266.f16570 = 0L;
            c4266.f16574 = j;
        }
    }
}
