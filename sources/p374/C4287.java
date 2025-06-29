package p374;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p000.InterfaceC0875;
import p011.C1027;
import p014.C1060;
import p036.InterfaceC1239;
import p076.C1653;
import p076.C1654;
import p076.C1659;
import p076.HandlerC1655;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p076.InterfaceC1666;
import p166.AbstractC2435;
import p166.C2401;
import p166.C2417;
import p166.C2431;
import p166.C2433;
import p193.C2705;
import p254.C3175;
import p254.C3180;
import p254.InterfaceC3157;
import p254.InterfaceC3165;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p260.C3222;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import p438.C5077;
import p438.C5085;
import ʻˉ.ᐧˋ;
import ﹶˋ.ـﹶ;

/* renamed from: ᵢˎ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4287 implements InterfaceC4294, InterfaceC3177, InterfaceC1658, InterfaceC1666, InterfaceC4283 {

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static final Map f16644;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final C2431 f16645;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C1027 f16646;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f16647;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public int f16648;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C3222 f16649;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public ـﹶ f16650;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC0875 f16651;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ᐧʻ f16652;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f16653;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public InterfaceC3157 f16654;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f16655;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C1653 f16656;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f16657;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f16658;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC4483 f16659;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public boolean f16661;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public boolean f16662;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final long f16666;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f16668;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public long f16669;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C2705 f16670;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Uri f16671;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f16672;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f16673;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public int f16674;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public boolean f16675;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public InterfaceC4295 f16678;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C4480 f16679;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public long f16681;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C4285 f16682;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public boolean f16683;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C1659 f16684 = new C1659("ProgressiveMediaPeriod");

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C2705 f16664 = new C2705();

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final RunnableC4278 f16663 = new RunnableC4278(this, 1);

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final RunnableC4278 f16680 = new RunnableC4278(this, 2);

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final Handler f16660 = AbstractC4470.m10200(null);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C4268[] f16676 = new C4268[0];

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C4296[] f16677 = new C4296[0];

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public long f16667 = -9223372036854775807L;

    /* renamed from: יˋ, reason: contains not printable characters */
    public int f16665 = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f16644 = DesugarCollections.unmodifiableMap(map);
        C2417 c2417 = new C2417();
        c2417.f9614 = "icy";
        c2417.f9602 = AbstractC2435.m6559("application/x-icy");
        f16645 = new C2431(c2417);
    }

    public C4287(Uri uri, InterfaceC0875 interfaceC0875, C3222 c3222, InterfaceC4483 interfaceC4483, C4480 c4480, C2705 c2705, ᐧʻ r7, C4285 c4285, C1653 c1653, int i, long j) {
        this.f16671 = uri;
        this.f16651 = interfaceC0875;
        this.f16659 = interfaceC4483;
        this.f16679 = c4480;
        this.f16670 = c2705;
        this.f16652 = r7;
        this.f16682 = c4285;
        this.f16656 = c1653;
        this.f16666 = i;
        this.f16649 = c3222;
        this.f16672 = j;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        boolean z;
        if (this.f16684.m5335()) {
            C2705 c2705 = this.f16664;
            synchronized (c2705) {
                z = c2705.f10605;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿʼ */
    public final void mo4850() {
        this.f16683 = true;
        this.f16660.post(this.f16663);
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿˏ */
    public final InterfaceC3178 mo4851(int i, int i2) {
        return m9749(new C4268(i, false));
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m9743() {
        C4243 c4243 = new C4243(this, this.f16671, this.f16651, this.f16649, this, this.f16664);
        if (this.f16655) {
            AbstractC4464.m10132(m9745());
            long j = this.f16681;
            if (j != -9223372036854775807L && this.f16667 > j) {
                this.f16661 = true;
                this.f16667 = -9223372036854775807L;
                return;
            }
            InterfaceC3157 interfaceC3157 = this.f16654;
            interfaceC3157.getClass();
            long j2 = interfaceC3157.mo5503(this.f16667).f12289.f12269;
            long j3 = this.f16667;
            c4243.f16482.f9656 = j2;
            c4243.f16480 = j3;
            c4243.f16477 = true;
            c4243.f16476 = false;
            for (C4296 c4296 : this.f16677) {
                c4296.f16730 = this.f16667;
            }
            this.f16667 = -9223372036854775807L;
        }
        this.f16674 = m9746();
        this.f16652.ʿˏ(new C4261(c4243.f16479, c4243.f16483, this.f16684.m5334(c4243, this, this.f16670.m6869(this.f16665))), 1, -1, (C2431) null, 0, (Object) null, c4243.f16480, this.f16681);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m9744(int i) {
        m9747();
        boolean[] zArr = (boolean[]) this.f16650.ˎˑ;
        if (this.f16675 && zArr[i] && !this.f16677[i].m9782(false)) {
            this.f16667 = 0L;
            this.f16675 = false;
            this.f16653 = true;
            this.f16669 = 0L;
            this.f16674 = 0;
            for (C4296 c4296 : this.f16677) {
                c4296.m9764(false);
            }
            InterfaceC4295 interfaceC4295 = this.f16678;
            interfaceC4295.getClass();
            interfaceC4295.mo7664(this);
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי */
    public final long mo6161() {
        if (!this.f16653) {
            return -9223372036854775807L;
        }
        if (!this.f16661 && m9746() <= this.f16674) {
            return -9223372036854775807L;
        }
        this.f16653 = false;
        return this.f16669;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ */
    public final long mo6162(InterfaceC1239[] interfaceC1239Arr, boolean[] zArr, InterfaceC4254[] interfaceC4254Arr, boolean[] zArr2, long j) {
        InterfaceC1239 interfaceC1239;
        m9747();
        ـﹶ r0 = this.f16650;
        C4241 c4241 = (C4241) r0.ˆʿ;
        boolean[] zArr3 = (boolean[]) r0.ᐧˋ;
        int i = this.f16648;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC1239Arr.length; i3++) {
            InterfaceC4254 interfaceC4254 = interfaceC4254Arr[i3];
            if (interfaceC4254 != null && (interfaceC1239Arr[i3] == null || !zArr[i3])) {
                int i4 = ((C4269) interfaceC4254).f16580;
                AbstractC4464.m10132(zArr3[i4]);
                this.f16648--;
                zArr3[i4] = false;
                interfaceC4254Arr[i3] = null;
            }
        }
        boolean z = !this.f16647 ? j == 0 || this.f16673 : i != 0;
        for (int i5 = 0; i5 < interfaceC1239Arr.length; i5++) {
            if (interfaceC4254Arr[i5] == null && (interfaceC1239 = interfaceC1239Arr[i5]) != null) {
                AbstractC4464.m10132(interfaceC1239.length() == 1);
                AbstractC4464.m10132(interfaceC1239.mo4440(0) == 0);
                int iM9703 = c4241.m9703(interfaceC1239.mo4434());
                AbstractC4464.m10132(!zArr3[iM9703]);
                this.f16648++;
                zArr3[iM9703] = true;
                interfaceC4254Arr[i5] = new C4269(this, iM9703);
                zArr2[i5] = true;
                if (!z) {
                    C4296 c4296 = this.f16677[iM9703];
                    z = (c4296.m9765() == 0 || c4296.m9776(true, j)) ? false : true;
                }
            }
        }
        if (this.f16648 == 0) {
            this.f16675 = false;
            this.f16653 = false;
            C1659 c1659 = this.f16684;
            if (c1659.m5335()) {
                C4296[] c4296Arr = this.f16677;
                int length = c4296Arr.length;
                while (i2 < length) {
                    c4296Arr[i2].m9760();
                    i2++;
                }
                c1659.m5330();
            } else {
                this.f16661 = false;
                for (C4296 c42962 : this.f16677) {
                    c42962.m9764(false);
                }
            }
        } else if (z) {
            j = mo6164(j);
            while (i2 < interfaceC4254Arr.length) {
                if (interfaceC4254Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f16647 = true;
        return j;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m9745() {
        return this.f16667 != -9223372036854775807L;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f16678 = interfaceC4295;
        this.f16664.m6868();
        m9743();
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ˎˑ */
    public final void mo4858(InterfaceC3157 interfaceC3157) {
        this.f16660.post(new ᐧˋ(this, 24, interfaceC3157));
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    public final long mo6164(long j) {
        boolean z;
        m9747();
        boolean[] zArr = (boolean[]) this.f16650.ˎˑ;
        if (!this.f16654.mo5504()) {
            j = 0;
        }
        this.f16653 = false;
        this.f16669 = j;
        if (m9745()) {
            this.f16667 = j;
            return j;
        }
        int i = this.f16665;
        C1659 c1659 = this.f16684;
        if (i != 7 && (this.f16661 || c1659.m5335())) {
            int length = this.f16677.length;
            for (int i2 = 0; i2 < length; i2++) {
                C4296 c4296 = this.f16677[i2];
                if (!(this.f16673 ? c4296.m9758(c4296.f16728) : c4296.m9776(false, j)) && (zArr[i2] || !this.f16657)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.f16675 = false;
        this.f16667 = j;
        this.f16661 = false;
        if (c1659.m5335()) {
            for (C4296 c42962 : this.f16677) {
                c42962.m9760();
            }
            c1659.m5330();
        } else {
            c1659.f6473 = null;
            for (C4296 c42963 : this.f16677) {
                c42963.m9764(false);
            }
        }
        return j;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int m9746() {
        int i = 0;
        for (C4296 c4296 : this.f16677) {
            i += c4296.f16728 + c4296.f16719;
        }
        return i;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        long jM9750;
        boolean z;
        m9747();
        if (this.f16661 || this.f16648 == 0) {
            return Long.MIN_VALUE;
        }
        if (m9745()) {
            return this.f16667;
        }
        if (this.f16657) {
            int length = this.f16677.length;
            jM9750 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ـﹶ r9 = this.f16650;
                if (((boolean[]) r9.ˎˑ)[i] && ((boolean[]) r9.ᐧˋ)[i]) {
                    C4296 c4296 = this.f16677[i];
                    synchronized (c4296) {
                        z = c4296.f16735;
                    }
                    if (!z) {
                        jM9750 = Math.min(jM9750, this.f16677[i].m9767());
                    }
                }
            }
        } else {
            jM9750 = Long.MAX_VALUE;
        }
        if (jM9750 == Long.MAX_VALUE) {
            jM9750 = m9750(false);
        }
        return jM9750 == Long.MIN_VALUE ? this.f16669 : jM9750;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        if (this.f16661) {
            return false;
        }
        C1659 c1659 = this.f16684;
        if (c1659.m5332() || this.f16675) {
            return false;
        }
        if (this.f16655 && this.f16648 == 0) {
            return false;
        }
        boolean zM6868 = this.f16664.m6868();
        if (c1659.m5335()) {
            return zM6868;
        }
        m9743();
        return true;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        m9747();
        if (!this.f16654.mo5504()) {
            return 0L;
        }
        C3180 c3180Mo5503 = this.f16654.mo5503(j);
        return c5085.m11289(j, c3180Mo5503.f12289.f12270, c3180Mo5503.f12288.f12270);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() throws IOException {
        int iM6869 = this.f16670.m6869(this.f16665);
        C1659 c1659 = this.f16684;
        IOException iOException = c1659.f6473;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1655 handlerC1655 = c1659.f6472;
        if (handlerC1655 != null) {
            if (iM6869 == Integer.MIN_VALUE) {
                iM6869 = handlerC1655.f6459;
            }
            IOException iOException2 = handlerC1655.f6454;
            if (iOException2 != null && handlerC1655.f6461 > iM6869) {
                throw iOException2;
            }
        }
        if (this.f16661 && !this.f16655) {
            throw ParserException.m1097("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p374.InterfaceC4283
    /* renamed from: יʻ */
    public final void mo9688() {
        this.f16660.post(this.f16663);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9747() {
        AbstractC4464.m10132(this.f16655);
        this.f16650.getClass();
        this.f16654.getClass();
    }

    @Override // p076.InterfaceC1666
    /* renamed from: ٴˎ */
    public final void mo5357() {
        for (C4296 c4296 : this.f16677) {
            c4296.m9757();
        }
        C3222 c3222 = this.f16649;
        InterfaceC3165 interfaceC3165 = (InterfaceC3165) c3222.f12539;
        if (interfaceC3165 != null) {
            interfaceC3165.mo4073();
            c3222.f12539 = null;
        }
        c3222.f12540 = null;
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    public final C1654 mo5327(InterfaceC1656 interfaceC1656, long j, long j2, IOException iOException, int i) {
        C1654 c1654;
        InterfaceC3157 interfaceC3157;
        C4243 c4243 = (C4243) interfaceC1656;
        Uri uri = c4243.f16474.f3992;
        C4261 c4261 = new C4261(j2);
        AbstractC4470.m10171(c4243.f16480);
        AbstractC4470.m10171(this.f16681);
        long jM6871 = this.f16670.m6871(new C1060(i, iOException));
        if (jM6871 == -9223372036854775807L) {
            c1654 = C1659.f6471;
        } else {
            int iM9746 = m9746();
            int i2 = iM9746 > this.f16674 ? 1 : 0;
            if (this.f16668 || !((interfaceC3157 = this.f16654) == null || interfaceC3157.mo5502() == -9223372036854775807L)) {
                this.f16674 = iM9746;
            } else if (!this.f16655 || m9748()) {
                this.f16653 = this.f16655;
                this.f16669 = 0L;
                this.f16674 = 0;
                for (C4296 c4296 : this.f16677) {
                    c4296.m9764(false);
                }
                c4243.f16482.f9656 = 0L;
                c4243.f16480 = 0L;
                c4243.f16477 = true;
                c4243.f16476 = false;
            } else {
                this.f16675 = true;
                c1654 = C1659.f6469;
            }
            c1654 = new C1654(jM6871, false, i2);
        }
        this.f16652.ˎٴ(c4261, 1, -1, (C2431) null, 0, (Object) null, c4243.f16480, this.f16681, iOException, !c1654.m5323());
        return c1654;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m9748() {
        return this.f16653 || m9745();
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3178 m9749(C4268 c4268) {
        int length = this.f16677.length;
        for (int i = 0; i < length; i++) {
            if (c4268.equals(this.f16676[i])) {
                return this.f16677[i];
            }
        }
        if (this.f16683) {
            AbstractC4464.m10144("ProgressiveMediaPeriod", "Extractor added new track (id=" + c4268.f16578 + ") after finishing tracks.");
            return new C3175();
        }
        C4480 c4480 = this.f16679;
        InterfaceC4483 interfaceC4483 = this.f16659;
        interfaceC4483.getClass();
        C4296 c4296 = new C4296(this.f16656, interfaceC4483, c4480);
        c4296.f16722 = this;
        int i2 = length + 1;
        C4268[] c4268Arr = (C4268[]) Arrays.copyOf(this.f16676, i2);
        c4268Arr[length] = c4268;
        int i3 = AbstractC4470.f17202;
        this.f16676 = c4268Arr;
        C4296[] c4296Arr = (C4296[]) Arrays.copyOf(this.f16677, i2);
        c4296Arr[length] = c4296;
        this.f16677 = c4296Arr;
        return c4296;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        m9747();
        return (C4241) this.f16650.ˆʿ;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        if (this.f16673) {
            return;
        }
        m9747();
        if (m9745()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f16650.ᐧˋ;
        int length = this.f16677.length;
        for (int i = 0; i < length; i++) {
            this.f16677[i].m9780(zArr[i], j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m9750(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            ᵢˎ.ﾞˎ[] r3 = r5.f16677
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            ﹶˋ.ـﹶ r3 = r5.f16650
            r3.getClass()
            java.lang.Object r3 = r3.ᐧˋ
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            ᵢˎ.ﾞˎ[] r3 = r5.f16677
            r3 = r3[r2]
            long r3 = r3.m9767()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4287.m9750(boolean):long");
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m9751(int i) {
        m9747();
        ـﹶ r0 = this.f16650;
        boolean[] zArr = (boolean[]) r0.ˆᵔ;
        if (zArr[i]) {
            return;
        }
        C2431 c2431 = ((C4241) r0.ˆʿ).m9704(i).f9700[0];
        this.f16652.ᐧʻ(AbstractC2435.m6554(c2431.f9667), c2431, 0, (Object) null, this.f16669);
        zArr[i] = true;
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public final void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        C4243 c4243 = (C4243) interfaceC1656;
        Uri uri = c4243.f16474.f3992;
        C4261 c4261 = new C4261(j2);
        this.f16670.getClass();
        this.f16652.ˋⁱ(c4261, 1, -1, (C2431) null, 0, (Object) null, c4243.f16480, this.f16681);
        if (z) {
            return;
        }
        for (C4296 c4296 : this.f16677) {
            c4296.m9764(false);
        }
        if (this.f16648 > 0) {
            InterfaceC4295 interfaceC4295 = this.f16678;
            interfaceC4295.getClass();
            interfaceC4295.mo7664(this);
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        return mo6165();
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public final void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        InterfaceC3157 interfaceC3157;
        C4243 c4243 = (C4243) interfaceC1656;
        if (this.f16681 == -9223372036854775807L && (interfaceC3157 = this.f16654) != null) {
            boolean zMo5504 = interfaceC3157.mo5504();
            long jM9750 = m9750(true);
            long j3 = jM9750 == Long.MIN_VALUE ? 0L : jM9750 + 10000;
            this.f16681 = j3;
            this.f16682.m9742(j3, zMo5504, this.f16658);
        }
        Uri uri = c4243.f16474.f3992;
        C4261 c4261 = new C4261(j2);
        this.f16670.getClass();
        this.f16652.ˑי(c4261, 1, -1, (C2431) null, 0, (Object) null, c4243.f16480, this.f16681);
        this.f16661 = true;
        InterfaceC4295 interfaceC4295 = this.f16678;
        interfaceC4295.getClass();
        interfaceC4295.mo7664(this);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m9752() {
        long j;
        int i;
        if (this.f16662 || this.f16655 || !this.f16683 || this.f16654 == null) {
            return;
        }
        for (C4296 c4296 : this.f16677) {
            if (c4296.m9756() == null) {
                return;
            }
        }
        this.f16664.m6870();
        int length = this.f16677.length;
        C2433[] c2433Arr = new C2433[length];
        boolean[] zArr = new boolean[length];
        int i2 = 0;
        while (true) {
            j = this.f16672;
            if (i2 >= length) {
                break;
            }
            C2431 c2431M9756 = this.f16677[i2].m9756();
            c2431M9756.getClass();
            String str = c2431M9756.f9667;
            boolean zM6550 = AbstractC2435.m6550(str);
            boolean z = zM6550 || AbstractC2435.m6552(str);
            zArr[i2] = z;
            this.f16657 = z | this.f16657;
            this.f16673 = j != -9223372036854775807L && length == 1 && AbstractC2435.m6553(str);
            C1027 c1027 = this.f16646;
            if (c1027 != null) {
                if (zM6550 || this.f16676[i2].f16577) {
                    C2401 c2401 = c2431M9756.f9670;
                    C2401 c24012 = c2401 == null ? new C2401(c1027) : c2401.m6493(c1027);
                    C2417 c2417M6541 = c2431M9756.m6541();
                    c2417M6541.f9601 = c24012;
                    c2431M9756 = new C2431(c2417M6541);
                }
                if (zM6550 && c2431M9756.f9679 == -1 && c2431M9756.f9672 == -1 && (i = c1027.f4419) != -1) {
                    C2417 c2417M65412 = c2431M9756.m6541();
                    c2417M65412.f9616 = i;
                    c2431M9756 = new C2431(c2417M65412);
                }
            }
            int iMo10235 = this.f16659.mo10235(c2431M9756);
            C2417 c2417M65413 = c2431M9756.m6541();
            c2417M65413.f9603 = iMo10235;
            c2433Arr[i2] = new C2433(Integer.toString(i2), new C2431(c2417M65413));
            i2++;
        }
        this.f16650 = new ـﹶ(new C4241(c2433Arr), zArr);
        if (this.f16673 && this.f16681 == -9223372036854775807L) {
            this.f16681 = j;
            this.f16654 = new C4297(this, this.f16654);
        }
        this.f16682.m9742(this.f16681, this.f16654.mo5504(), this.f16658);
        this.f16655 = true;
        InterfaceC4295 interfaceC4295 = this.f16678;
        interfaceC4295.getClass();
        interfaceC4295.mo9719(this);
    }
}
