package p372;

import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p000.InterfaceC0864;
import p000.InterfaceC0880;
import p033.C1215;
import p076.C1653;
import p076.C1657;
import p076.C1659;
import p166.AbstractC2426;
import p166.C2402;
import p166.C2431;
import p166.C2443;
import p166.C2444;
import p193.C2705;
import p266.C3264;
import p324.C3701;
import p324.C3709;
import p324.C3715;
import p345.AbstractC3980;
import p374.AbstractC4273;
import p374.C4261;
import p374.C4290;
import p374.InterfaceC4294;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import p385.InterfaceC4493;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵢˆ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4221 extends AbstractC4273 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public InterfaceC0880 f16296;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C2705 f16297;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final InterfaceC4237 f16298;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final long f16299;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int f16300;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final boolean f16301;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ᵢٴ f16302;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C3264 f16303;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C2402 f16304;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C2444 f16305;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final C3709 f16306;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final InterfaceC4483 f16307;

    static {
        AbstractC2426.m6526("media3.exoplayer.hls");
    }

    public C4221(C2402 c2402, ᵢٴ r2, InterfaceC4237 interfaceC4237, C3264 c3264, InterfaceC4483 interfaceC4483, C2705 c2705, C3709 c3709, long j, boolean z, int i) {
        this.f16304 = c2402;
        this.f16305 = c2402.f9494;
        this.f16302 = r2;
        this.f16298 = interfaceC4237;
        this.f16303 = c3264;
        this.f16307 = interfaceC4483;
        this.f16297 = c2705;
        this.f16306 = c3709;
        this.f16299 = j;
        this.f16301 = z;
        this.f16300 = i;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C3715 m9668(AbstractC3980 abstractC3980, long j) {
        C3715 c3715 = null;
        for (int i = 0; i < abstractC3980.size(); i++) {
            C3715 c37152 = (C3715) abstractC3980.get(i);
            long j2 = c37152.f14332;
            if (j2 > j || !c37152.f14396) {
                if (j2 > j) {
                    break;
                }
            } else {
                c3715 = c37152;
            }
        }
        return c3715;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ʽᐧ */
    public final InterfaceC4294 mo6113(C4290 c4290, C1653 c1653, long j) {
        ᐧʻ r9 = m9731(c4290);
        C4480 c4480 = new C4480(this.f16594.f17251, 0, c4290);
        InterfaceC0880 interfaceC0880 = this.f16296;
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        return new C4224(this.f16298, this.f16306, this.f16302, interfaceC0880, this.f16307, c4480, this.f16297, r9, c1653, this.f16303, this.f16301, this.f16300, c1215);
    }

    @Override // p374.AbstractC4273
    /* renamed from: ʿˏ */
    public final void mo6114(InterfaceC0880 interfaceC0880) {
        this.f16296 = interfaceC0880;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C1215 c1215 = this.f16597;
        AbstractC4464.m10146(c1215);
        InterfaceC4483 interfaceC4483 = this.f16307;
        interfaceC4483.mo10233(looperMyLooper, c1215);
        interfaceC4483.mo10231();
        ᐧʻ r0 = m9731(null);
        C2443 c2443 = mo6119().f9492;
        c2443.getClass();
        C3709 c3709 = this.f16306;
        c3709.getClass();
        c3709.f14317 = AbstractC4470.m10200(null);
        c3709.f14325 = r0;
        c3709.f14321 = this;
        C1657 c1657 = new C1657(((InterfaceC0864) c3709.f14323.ˆʿ).mo900(), c2443.f9734, 4, c3709.f14315.mo8052());
        AbstractC4464.m10132(c3709.f14326 == null);
        C1659 c1659 = new C1659("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c3709.f14326 = c1659;
        C2705 c2705 = c3709.f14318;
        int i = c1657.f6465;
        r0.ʿˏ(new C4261(c1657.f6467, c1657.f6463, c1659.m5334(c1657, c3709, c2705.m6869(i))), i, -1, (C2431) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˉⁱ */
    public final synchronized void mo6115(C2402 c2402) {
        this.f16304 = c2402;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˋⁱ */
    public final void mo6116(InterfaceC4294 interfaceC4294) {
        C4224 c4224 = (C4224) interfaceC4294;
        c4224.f16319.f14316.remove(c4224);
        for (C4234 c4234 : c4224.f16332) {
            if (c4234.f16388) {
                for (C4228 c4228 : c4234.f16399) {
                    c4228.m9760();
                    InterfaceC4493 interfaceC4493 = c4228.f16717;
                    if (interfaceC4493 != null) {
                        interfaceC4493.mo10246(c4228.f16704);
                        c4228.f16717 = null;
                        c4228.f16723 = null;
                    }
                }
            }
            C4226 c4226 = c4234.f16417;
            C3701 c3701 = (C3701) c4226.f16360.f14322.get(c4226.f16348[c4226.f16363.mo4447()]);
            if (c3701 != null) {
                c3701.f14283 = false;
            }
            c4226.f16361 = null;
            c4234.f16419.m5331(c4234);
            c4234.f16387.removeCallbacksAndMessages(null);
            c4234.f16415 = true;
            c4234.f16424.clear();
        }
        c4224.f16334 = null;
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ˏᵢ */
    public final void mo6117() throws IOException {
        C3709 c3709 = this.f16306;
        C1659 c1659 = c3709.f14326;
        if (c1659 != null) {
            c1659.mo5333();
        }
        Uri uri = c3709.f14327;
        if (uri != null) {
            C3701 c3701 = (C3701) c3709.f14322.get(uri);
            c3701.f14273.mo5333();
            IOException iOException = c3701.f14280;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // p374.InterfaceC4277
    /* renamed from: ـﹶ */
    public final synchronized C2402 mo6119() {
        return this.f16304;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9669(p324.C3716 r40) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.C4221.m9669(ᴵˋ.ﹶˆ):void");
    }

    @Override // p374.AbstractC4273
    /* renamed from: ﾞˊ */
    public final void mo6120() {
        C3709 c3709 = this.f16306;
        c3709.f14327 = null;
        c3709.f14314 = null;
        c3709.f14324 = null;
        c3709.f14319 = -9223372036854775807L;
        c3709.f14326.m5331(null);
        c3709.f14326 = null;
        HashMap map = c3709.f14322;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C3701) it.next()).f14273.m5331(null);
        }
        c3709.f14317.removeCallbacksAndMessages(null);
        c3709.f14317 = null;
        map.clear();
        this.f16307.mo10230();
    }
}
