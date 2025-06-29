package p424;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.leanback.widget.ﾞᐧ;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p033.C1215;
import p076.C1653;
import p076.C1657;
import p076.C1659;
import p076.InterfaceC1662;
import p076.InterfaceC1668;
import p166.AbstractC2426;
import p166.C2402;
import p166.C2431;
import p166.C2443;
import p166.C2444;
import p193.C2705;
import p198.AbstractC2735;
import p256.C3196;
import p266.C3264;
import p356.C4038;
import p356.C4039;
import p356.C4041;
import p374.AbstractC4273;
import p374.C4261;
import p374.C4290;
import p374.InterfaceC4294;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import ﹳᴵ.ˉי;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶʾ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4899 extends AbstractC4273 {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public C2402 f18516;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final InterfaceC1668 f18517;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public Handler f18518;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public Uri f18519;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final InterfaceC4483 f18520;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final InterfaceC1662 f18521;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public C2444 f18522;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public InterfaceC0875 f18523;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final RunnableC4900 f18524;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f18525;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final RunnableC4900 f18526;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public InterfaceC0880 f18527;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final long f18528;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public long f18529;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public int f18530;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final ـﹶ f18531;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C2705 f18532;

    /* renamed from: יˋ, reason: contains not printable characters */
    public DashManifestStaleException f18533;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final InterfaceC0864 f18534;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f18535;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final Uri f18536;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public C4039 f18537;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final ᐧʻ f18538;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C4902 f18539;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public long f18540;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public long f18541;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final Object f18542;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C4905 f18543;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final ᐧʻ f18544;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final long f18545;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public C1659 f18546;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public long f18547;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final SparseArray f18548;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C3264 f18549;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public int f18550;

    static {
        AbstractC2426.m6526("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [ﹶʾ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ﹶʾ.ˑʽ] */
    public C4899(C2402 c2402, InterfaceC0864 interfaceC0864, InterfaceC1668 interfaceC1668, ᐧʻ r5, C3264 c3264, InterfaceC4483 interfaceC4483, C2705 c2705, long j, long j2) {
        this.f18516 = c2402;
        this.f18522 = c2402.f9494;
        C2443 c2443 = c2402.f9492;
        c2443.getClass();
        Uri uri = c2443.f9734;
        this.f18519 = uri;
        this.f18536 = uri;
        this.f18537 = null;
        this.f18534 = interfaceC0864;
        this.f18517 = interfaceC1668;
        this.f18538 = r5;
        this.f18520 = interfaceC4483;
        this.f18532 = c2705;
        this.f18545 = j;
        this.f18528 = j2;
        this.f18549 = c3264;
        this.f18531 = new ـﹶ(13);
        this.f18525 = false;
        this.f18544 = m9731(null);
        this.f18542 = new Object();
        this.f18548 = new SparseArray();
        this.f18539 = new C4902(this);
        this.f18547 = -9223372036854775807L;
        this.f18529 = -9223372036854775807L;
        this.f18543 = new C4905(this, 1);
        this.f18521 = new C4902(this);
        final int i = 0;
        this.f18524 = new Runnable(this) { // from class: ﹶʾ.ˑʽ

            /* renamed from: ˆʿ, reason: contains not printable characters */
            public final /* synthetic */ C4899 f18551;

            {
                this.f18551 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f18551.m11022();
                        break;
                    default:
                        this.f18551.m11020(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f18526 = new Runnable(this) { // from class: ﹶʾ.ˑʽ

            /* renamed from: ˆʿ, reason: contains not printable characters */
            public final /* synthetic */ C4899 f18551;

            {
                this.f18551 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f18551.m11022();
                        break;
                    default:
                        this.f18551.m11020(false);
                        break;
                }
            }
        };
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static boolean m11019(C4038 c4038) {
        int i = 0;
        while (true) {
            List list = c4038.f15526;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((C4041) list.get(i)).f15545;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        int iIntValue = ((Integer) c4290.f16693).intValue() - this.f18550;
        ᐧʻ r14 = m9731(c4290);
        C4480 c4480 = new C4480(this.f16594.f17251, 0, c4290);
        int i = this.f18550 + iIntValue;
        C4039 c4039 = this.f18537;
        InterfaceC0880 interfaceC0880 = this.f18527;
        long j2 = this.f18529;
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        C4892 c4892 = new C4892(i, c4039, this.f18531, iIntValue, this.f18538, interfaceC0880, this.f18520, c4480, this.f18532, r14, j2, this.f18521, c1653, this.f18549, this.f18539, c1215);
        this.f18548.put(i, c4892);
        return c4892;
    }

    @Override // p374.AbstractC4273
    /* renamed from: ʿˏ */
    public final void mo6114(InterfaceC0880 interfaceC0880) {
        this.f18527 = interfaceC0880;
        Looper looperMyLooper = Looper.myLooper();
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        InterfaceC4483 interfaceC4483 = this.f18520;
        interfaceC4483.mo10233(looperMyLooper, c1215);
        interfaceC4483.mo10231();
        if (this.f18525) {
            m11020(false);
            return;
        }
        this.f18523 = this.f18534.mo900();
        this.f18546 = new C1659("DashMediaSource");
        this.f18518 = AbstractC4470.m10200(null);
        m11022();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a3  */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11020(boolean r41) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p424.C4899.m11020(boolean):void");
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m11021(C1657 c1657, long j, long j2) {
        long j3 = c1657.f6467;
        Uri uri = c1657.f6466.f3992;
        C4261 c4261 = new C4261(j2);
        this.f18532.getClass();
        this.f18544.ˋⁱ(c4261, c1657.f6465, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˉⁱ */
    public final synchronized void mo6115(C2402 c2402) {
        this.f18516 = c2402;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        C4892 c4892 = (C4892) interfaceC4294;
        C4898 c4898 = c4892.f18453;
        c4898.f18511 = true;
        c4898.f18512.removeCallbacksAndMessages(null);
        for (C3196 c3196 : c4892.f18443) {
            c3196.m7898(c4892);
        }
        c4892.f18460 = null;
        this.f18548.remove(c4892.f18456);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m11022() {
        Uri uri;
        this.f18518.removeCallbacks(this.f18524);
        if (this.f18546.m5332()) {
            return;
        }
        if (this.f18546.m5335()) {
            this.f18535 = true;
            return;
        }
        synchronized (this.f18542) {
            uri = this.f18519;
        }
        this.f18535 = false;
        C1657 c1657 = new C1657(this.f18523, uri, 4, this.f18517);
        C4905 c4905 = this.f18543;
        this.f18532.getClass();
        this.f18544.ʿˏ(new C4261(c1657.f6467, c1657.f6463, this.f18546.m5334(c1657, c4905, 3)), c1657.f6465, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() {
        this.f18521.mo5333();
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ـﹶ */
    public final synchronized C2402 mo6119() {
        return this.f18516;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m11023(IOException iOException) {
        AbstractC4464.m10147("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f18529 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        m11020(true);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m11024() {
        boolean z;
        C1659 c1659 = this.f18546;
        C4905 c4905 = new C4905(this, 0);
        synchronized (AbstractC2735.f10705) {
            z = AbstractC2735.f10706;
        }
        if (z) {
            c4905.m11025();
            return;
        }
        if (c1659 == null) {
            c1659 = new C1659("SntpClient");
        }
        c1659.m5334(new ˉי(26), new ﾞᐧ(24, c4905), 1);
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        this.f18535 = false;
        this.f18523 = null;
        C1659 c1659 = this.f18546;
        if (c1659 != null) {
            c1659.m5331(null);
            this.f18546 = null;
        }
        this.f18541 = 0L;
        this.f18540 = 0L;
        this.f18519 = this.f18536;
        this.f18533 = null;
        Handler handler = this.f18518;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f18518 = null;
        }
        this.f18529 = -9223372036854775807L;
        this.f18530 = 0;
        this.f18547 = -9223372036854775807L;
        this.f18548.clear();
        ـﹶ r0 = this.f18531;
        ((HashMap) r0.ˆʿ).clear();
        ((HashMap) r0.ˎˑ).clear();
        ((HashMap) r0.ᐧˋ).clear();
        this.f18520.mo10230();
    }
}
