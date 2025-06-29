package p248;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.RunnableC0246;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p014.C1060;
import p033.C1215;
import p076.C1653;
import p076.C1654;
import p076.C1657;
import p076.C1659;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p076.InterfaceC1662;
import p076.InterfaceC1668;
import p134.C2085;
import p134.C2088;
import p166.AbstractC2426;
import p166.C2402;
import p166.C2431;
import p166.C2443;
import p193.C2705;
import p256.C3196;
import p266.C3264;
import p374.AbstractC4273;
import p374.C4252;
import p374.C4261;
import p374.C4290;
import p374.InterfaceC4294;
import p374.InterfaceC4295;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import ʻˋ.ˋˊ;
import ᵔʼ.ˑʽ;

/* renamed from: יˆ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3122 extends AbstractC4273 implements InterfaceC1658 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final ArrayList f12048;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C3264 f12049;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public Handler f12050;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public C2402 f12051;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public InterfaceC0880 f12052;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f12053;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public long f12054;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final ᐧʻ f12055;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C2705 f12056;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final InterfaceC4483 f12057;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Uri f12058;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final InterfaceC0864 f12059;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public C2088 f12060;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C1659 f12061;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public InterfaceC0875 f12062;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final InterfaceC1668 f12063;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final long f12064;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public InterfaceC1662 f12065;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ˋˊ f12066;

    static {
        AbstractC2426.m6526("media3.exoplayer.smoothstreaming");
    }

    public C3122(C2402 c2402, InterfaceC0864 interfaceC0864, InterfaceC1668 interfaceC1668, ˋˊ r7, C3264 c3264, InterfaceC4483 interfaceC4483, C2705 c2705, long j) {
        this.f12051 = c2402;
        C2443 c2443 = c2402.f9492;
        c2443.getClass();
        this.f12060 = null;
        Uri uri = Uri.EMPTY;
        Uri uriWithAppendedPath = c2443.f9734;
        if (uriWithAppendedPath.equals(uri)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = AbstractC4470.f17194.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f12058 = uriWithAppendedPath;
        this.f12059 = interfaceC0864;
        this.f12063 = interfaceC1668;
        this.f12066 = r7;
        this.f12049 = c3264;
        this.f12057 = interfaceC4483;
        this.f12056 = c2705;
        this.f12064 = j;
        this.f12055 = m9731(null);
        this.f12053 = false;
        this.f12048 = new ArrayList();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        ᐧʻ r8 = m9731(c4290);
        C4480 c4480 = new C4480(this.f16594.f17251, 0, c4290);
        C2088 c2088 = this.f12060;
        InterfaceC0880 interfaceC0880 = this.f12052;
        InterfaceC1662 interfaceC1662 = this.f12065;
        C3120 c3120 = new C3120(c2088, this.f12066, interfaceC0880, this.f12049, this.f12057, c4480, this.f12056, r8, interfaceC1662, c1653);
        this.f12048.add(c3120);
        return c3120;
    }

    @Override // p374.AbstractC4273
    /* renamed from: ʿˏ */
    public final void mo6114(InterfaceC0880 interfaceC0880) {
        this.f12052 = interfaceC0880;
        Looper looperMyLooper = Looper.myLooper();
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        InterfaceC4483 interfaceC4483 = this.f12057;
        interfaceC4483.mo10233(looperMyLooper, c1215);
        interfaceC4483.mo10231();
        if (this.f12053) {
            this.f12065 = new ˑʽ();
            m7667();
            return;
        }
        this.f12062 = this.f12059.mo900();
        C1659 c1659 = new C1659("SsMediaSource");
        this.f12061 = c1659;
        this.f12065 = c1659;
        this.f12050 = AbstractC4470.m10200(null);
        m7668();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˉⁱ */
    public final synchronized void mo6115(C2402 c2402) {
        this.f12051 = c2402;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        C3120 c3120 = (C3120) interfaceC4294;
        for (C3196 c3196 : c3120.f12038) {
            c3196.m7898(null);
        }
        c3120.f12045 = null;
        this.f12048.remove(interfaceC4294);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() {
        this.f12065.mo5333();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m7667() {
        C4252 c4252;
        C3196[] c3196Arr;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12048;
            if (i >= arrayList.size()) {
                break;
            }
            C3120 c3120 = (C3120) arrayList.get(i);
            C2088 c2088 = this.f12060;
            c3120.f12032 = c2088;
            C3196[] c3196Arr2 = c3120.f12038;
            int length = c3196Arr2.length;
            int i2 = 0;
            while (i2 < length) {
                C3119 c3119 = (C3119) c3196Arr2[i2].f12414;
                C2085[] c2085Arr = c3119.f12029.f8250;
                int i3 = c3119.f12024;
                C2085 c2085 = c2085Arr[i3];
                int i4 = c2085.f8217;
                C2085 c20852 = c2088.f8250[i3];
                if (i4 == 0 || c20852.f8217 == 0) {
                    c3196Arr = c3196Arr2;
                    c3119.f12030 += i4;
                } else {
                    int i5 = i4 - 1;
                    long[] jArr = c2085.f8218;
                    long jM5918 = c2085.m5918(i5) + jArr[i5];
                    c3196Arr = c3196Arr2;
                    long j = c20852.f8218[0];
                    if (jM5918 <= j) {
                        c3119.f12030 += i4;
                    } else {
                        c3119.f12030 = AbstractC4470.m10195(jArr, j, true) + c3119.f12030;
                    }
                }
                c3119.f12029 = c2088;
                i2++;
                c3196Arr2 = c3196Arr;
            }
            InterfaceC4295 interfaceC4295 = c3120.f12045;
            interfaceC4295.getClass();
            interfaceC4295.mo7664(c3120);
            i++;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (C2085 c20853 : this.f12060.f8250) {
            if (c20853.f8217 > 0) {
                long[] jArr2 = c20853.f8218;
                jMax2 = Math.min(jMax2, jArr2[0]);
                int i6 = c20853.f8217 - 1;
                jMax = Math.max(jMax, c20853.m5918(i6) + jArr2[i6]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j2 = this.f12060.f8252 ? -9223372036854775807L : 0L;
            C2088 c20882 = this.f12060;
            boolean z = c20882.f8252;
            c4252 = new C4252(j2, 0L, 0L, 0L, true, z, z, c20882, mo6119());
        } else {
            C2088 c20883 = this.f12060;
            if (c20883.f8252) {
                long j3 = c20883.f8247;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j3);
                }
                long j4 = jMax2;
                long j5 = jMax - j4;
                long jM10206 = j5 - AbstractC4470.m10206(this.f12064);
                if (jM10206 < 5000000) {
                    jM10206 = Math.min(5000000L, j5 / 2);
                }
                c4252 = new C4252(-9223372036854775807L, j5, j4, jM10206, true, true, true, this.f12060, mo6119());
            } else {
                long j6 = c20883.f8251;
                long j7 = j6 != -9223372036854775807L ? j6 : jMax - jMax2;
                c4252 = new C4252(-9223372036854775807L, -9223372036854775807L, jMax2 + j7, j7, jMax2, 0L, true, false, false, this.f12060, mo6119(), null);
            }
        }
        m9730(c4252);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ـﹶ */
    public final synchronized C2402 mo6119() {
        return this.f12051;
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    public final C1654 mo5327(InterfaceC1656 interfaceC1656, long j, long j2, IOException iOException, int i) {
        C1657 c1657 = (C1657) interfaceC1656;
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        long jM6871 = this.f12056.m6871(new C1060(i, iOException));
        C1654 c1654 = jM6871 == -9223372036854775807L ? C1659.f6471 : new C1654(jM6871, false, 0);
        this.f12055.ᵎˏ(c4261, c1657.f6465, iOException, !c1654.m5323());
        return c1654;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m7668() {
        if (this.f12061.m5332()) {
            return;
        }
        C1657 c1657 = new C1657(this.f12062, this.f12058, 4, this.f12063);
        C1659 c1659 = this.f12061;
        C2705 c2705 = this.f12056;
        int i = c1657.f6465;
        this.f12055.ʿˏ(new C4261(c1657.f6467, c1657.f6463, c1659.m5334(c1657, this, c2705.m6869(i))), i, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public final void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        C1657 c1657 = (C1657) interfaceC1656;
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        this.f12056.getClass();
        this.f12055.ˋⁱ(c4261, c1657.f6465, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public final void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        C1657 c1657 = (C1657) interfaceC1656;
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        this.f12056.getClass();
        this.f12055.ˏᴵ(c4261, c1657.f6465);
        this.f12060 = (C2088) c1657.f6468;
        this.f12054 = j - j2;
        m7667();
        if (this.f12060.f8252) {
            this.f12050.postDelayed(new RunnableC0246(11, this), Math.max(0L, (this.f12054 + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        this.f12060 = this.f12053 ? this.f12060 : null;
        this.f12062 = null;
        this.f12054 = 0L;
        C1659 c1659 = this.f12061;
        if (c1659 != null) {
            c1659.m5331(null);
            this.f12061 = null;
        }
        Handler handler = this.f12050;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f12050 = null;
        }
        this.f12057.mo10230();
    }
}
