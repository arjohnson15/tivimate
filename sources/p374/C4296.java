package p374;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.EOFException;
import p076.C1653;
import p076.C1663;
import p101.C1778;
import p166.C2405;
import p166.C2417;
import p166.C2431;
import p166.InterfaceC2442;
import p254.C3156;
import p254.InterfaceC3178;
import p310.C3581;
import p312.C3589;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p385.C4480;
import p385.InterfaceC4483;
import p385.InterfaceC4493;
import p456.C5349;
import ˆʽ.ᵎˏ;
import ˉʿ.ˑʽ;

/* renamed from: ᵢˎ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4296 implements InterfaceC3178 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4480 f16704;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f16706;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f16707;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public C2431 f16708;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f16714;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC4493 f16717;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f16719;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4240 f16721;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC4283 f16722;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2431 f16723;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f16724;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C2431 f16725;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f16727;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f16728;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f16729;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public boolean f16731;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC4483 f16732;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f16735;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˑʽ f16703 = new ˑʽ();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f16733 = 1000;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long[] f16709 = new long[1000];

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long[] f16715 = new long[1000];

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long[] f16726 = new long[1000];

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int[] f16712 = new int[1000];

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int[] f16710 = new int[1000];

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C3156[] f16716 = new C3156[1000];

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ᐧʻ f16718 = new ᐧʻ(new C3581(19));

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f16730 = Long.MIN_VALUE;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public long f16705 = Long.MIN_VALUE;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public long f16711 = Long.MIN_VALUE;

    /* renamed from: יʻ, reason: contains not printable characters */
    public boolean f16720 = true;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f16734 = true;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f16713 = true;

    public C4296(C1653 c1653, InterfaceC4483 interfaceC4483, C4480 c4480) {
        this.f16732 = interfaceC4483;
        this.f16704 = c4480;
        this.f16721 = new C4240(c1653);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʽᐧ */
    public final int mo7839(InterfaceC2442 interfaceC2442, int i, boolean z) throws EOFException {
        C4240 c4240 = this.f16721;
        int iM9701 = c4240.m9701(i);
        C1778 c1778 = c4240.f16460;
        C1663 c1663 = (C1663) c1778.f6898;
        int iMo3679 = interfaceC2442.mo3679(c1663.f6499, ((int) (c4240.f16461 - c1778.f6900)) + c1663.f6498, iM9701);
        if (iMo3679 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = c4240.f16461 + iMo3679;
        c4240.f16461 = j;
        C1778 c17782 = c4240.f16460;
        if (j != c17782.f6897) {
            return iMo3679;
        }
        c4240.f16460 = (C1778) c17782.f6899;
        return iMo3679;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000b, B:8:0x0019, B:13:0x002a, B:15:0x0043, B:19:0x005e, B:81:0x0114, B:73:0x0101, B:76:0x0109, B:18:0x005c), top: B:90:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    @Override // p254.InterfaceC3178
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7840(p166.C2431 r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4296.mo7840(ˊﹶ.ᵎـ):void");
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final synchronized C2431 m9756() {
        return this.f16720 ? null : this.f16725;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m9757() {
        m9764(true);
        InterfaceC4493 interfaceC4493 = this.f16717;
        if (interfaceC4493 != null) {
            interfaceC4493.mo10246(this.f16704);
            this.f16717 = null;
            this.f16723 = null;
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final synchronized boolean m9758(int i) {
        m9772();
        int i2 = this.f16728;
        if (i >= i2 && i <= this.f16719 + i2) {
            this.f16730 = Long.MIN_VALUE;
            this.f16727 = i - i2;
            return true;
        }
        return false;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final synchronized long m9759() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return m9762() ? this.f16709[m9774(this.f16727)] : this.f16706;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m9760() {
        long jM9768;
        C4240 c4240 = this.f16721;
        synchronized (this) {
            int i = this.f16719;
            jM9768 = i == 0 ? -1L : m9768(i);
        }
        c4240.m9700(jM9768);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m9761(int i) {
        long jM9766 = m9766(i);
        C4240 c4240 = this.f16721;
        AbstractC4464.m10142(jM9766 <= c4240.f16461);
        c4240.f16461 = jM9766;
        int i2 = c4240.f16456;
        if (jM9766 != 0) {
            C1778 c1778 = c4240.f16462;
            if (jM9766 != c1778.f6900) {
                while (c4240.f16461 > c1778.f6897) {
                    c1778 = (C1778) c1778.f6899;
                }
                C1778 c17782 = (C1778) c1778.f6899;
                c17782.getClass();
                c4240.m9702(c17782);
                C1778 c17783 = new C1778(i2, c1778.f6897);
                c1778.f6899 = c17783;
                if (c4240.f16461 == c1778.f6897) {
                    c1778 = c17783;
                }
                c4240.f16460 = c1778;
                if (c4240.f16457 == c17782) {
                    c4240.f16457 = c17783;
                    return;
                }
                return;
            }
        }
        c4240.m9702(c4240.f16462);
        C1778 c17784 = new C1778(i2, c4240.f16461);
        c4240.f16462 = c17784;
        c4240.f16457 = c17784;
        c4240.f16460 = c17784;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m9762() {
        return this.f16727 != this.f16719;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m9763(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f16726[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f16712[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.f16733) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m9764(boolean z) {
        ᐧʻ r0;
        SparseArray sparseArray;
        C4240 c4240 = this.f16721;
        c4240.m9702(c4240.f16462);
        C1778 c1778 = c4240.f16462;
        int i = 0;
        AbstractC4464.m10132(((C1663) c1778.f6898) == null);
        c1778.f6900 = 0L;
        c1778.f6897 = c4240.f16456;
        C1778 c17782 = c4240.f16462;
        c4240.f16457 = c17782;
        c4240.f16460 = c17782;
        c4240.f16461 = 0L;
        c4240.f16459.m5320();
        this.f16719 = 0;
        this.f16728 = 0;
        this.f16714 = 0;
        this.f16727 = 0;
        this.f16734 = true;
        this.f16730 = Long.MIN_VALUE;
        this.f16705 = Long.MIN_VALUE;
        this.f16711 = Long.MIN_VALUE;
        this.f16735 = false;
        while (true) {
            r0 = this.f16718;
            sparseArray = (SparseArray) r0.ˎˑ;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C3581) r0.ᐧˋ).mo4264(sparseArray.valueAt(i));
            i++;
        }
        r0.ˆʿ = -1;
        sparseArray.clear();
        if (z) {
            this.f16708 = null;
            this.f16725 = null;
            this.f16720 = true;
            this.f16713 = true;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m9765() {
        return this.f16728 + this.f16727;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final long m9766(int i) {
        int i2 = this.f16728;
        int i3 = this.f16719;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        AbstractC4464.m10142(i4 >= 0 && i4 <= i3 - this.f16727);
        int i5 = this.f16719 - i4;
        this.f16719 = i5;
        this.f16711 = Math.max(this.f16705, m9775(i5));
        if (i4 == 0 && this.f16735) {
            z = true;
        }
        this.f16735 = z;
        ᐧʻ r0 = this.f16718;
        SparseArray sparseArray = (SparseArray) r0.ˎˑ;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((C3581) r0.ᐧˋ).mo4264(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        r0.ˆʿ = sparseArray.size() > 0 ? Math.min(r0.ˆʿ, sparseArray.size() - 1) : -1;
        int i6 = this.f16719;
        if (i6 == 0) {
            return 0L;
        }
        return this.f16715[m9774(i6 - 1)] + this.f16710[r9];
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final synchronized long m9767() {
        return this.f16711;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long m9768(int i) {
        this.f16705 = Math.max(this.f16705, m9775(i));
        this.f16719 -= i;
        int i2 = this.f16728 + i;
        this.f16728 = i2;
        int i3 = this.f16714 + i;
        this.f16714 = i3;
        int i4 = this.f16733;
        if (i3 >= i4) {
            this.f16714 = i3 - i4;
        }
        int i5 = this.f16727 - i;
        this.f16727 = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f16727 = 0;
        }
        while (true) {
            ᐧʻ r1 = this.f16718;
            SparseArray sparseArray = (SparseArray) r1.ˎˑ;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((C3581) r1.ᐧˋ).mo4264(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = r1.ˆʿ;
            if (i8 > 0) {
                r1.ˆʿ = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f16719 != 0) {
            return this.f16715[this.f16714];
        }
        int i9 = this.f16714;
        if (i9 == 0) {
            i9 = this.f16733;
        }
        return this.f16715[i9 - 1] + this.f16710[r7];
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ˑʽ */
    public final /* synthetic */ void mo7841(int i, C4457 c4457) {
        ᵎˏ.ـﹶ(this, c4457, i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final synchronized long m9769() {
        return Math.max(this.f16705, m9775(this.f16727));
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m9770() throws DrmSession$DrmSessionException {
        InterfaceC4493 interfaceC4493 = this.f16717;
        if (interfaceC4493 == null || interfaceC4493.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionMo10248 = this.f16717.mo10248();
        drmSession$DrmSessionExceptionMo10248.getClass();
        throw drmSession$DrmSessionExceptionMo10248;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // p254.InterfaceC3178
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7842(long r13, int r15, int r16, int r17, p254.C3156 r18) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4296.mo7842(long, int, int, int, יי.ˆᵔ):void");
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ٴˎ */
    public final int mo7843(InterfaceC2442 interfaceC2442, int i, boolean z) {
        return mo7839(interfaceC2442, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m9771(long r9, int r11, long r12, int r14, p254.C3156 r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4296.m9771(long, int, long, int, יי.ˆᵔ):void");
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final synchronized void m9772() {
        this.f16727 = 0;
        C4240 c4240 = this.f16721;
        c4240.f16457 = c4240.f16462;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int m9773(C5349 c5349, C3589 c3589, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        ˑʽ r3 = this.f16703;
        synchronized (this) {
            try {
                c3589.f13806 = false;
                i2 = -3;
                if (m9762()) {
                    C2431 c2431 = ((C4284) this.f16718.ˉי(m9765())).f16632;
                    if (!z2 && c2431 == this.f16723) {
                        int iM9774 = m9774(this.f16727);
                        if (m9781(iM9774)) {
                            c3589.f5033 = this.f16712[iM9774];
                            if (this.f16727 == this.f16719 - 1 && (z || this.f16735)) {
                                c3589.m4409(536870912);
                            }
                            c3589.f13807 = this.f16726[iM9774];
                            r3.ـﹶ = this.f16710[iM9774];
                            r3.ʽᐧ = this.f16715[iM9774];
                            r3.ˑʽ = this.f16716[iM9774];
                            i2 = -4;
                        } else {
                            c3589.f13806 = true;
                        }
                    }
                    m9778(c2431, c5349);
                    i2 = -5;
                } else {
                    if (!z && !this.f16735) {
                        C2431 c24312 = this.f16725;
                        if (c24312 == null || (!z2 && c24312 == this.f16723)) {
                        }
                        m9778(c24312, c5349);
                        i2 = -5;
                    }
                    c3589.f5033 = 4;
                    c3589.f13807 = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !c3589.m4401(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    C4240 c4240 = this.f16721;
                    C4240.m9698(c4240.f16457, c3589, this.f16703, c4240.f16458);
                } else {
                    C4240 c42402 = this.f16721;
                    c42402.f16457 = C4240.m9698(c42402.f16457, c3589, this.f16703, c42402.f16458);
                }
            }
            if (!z3) {
                this.f16727++;
            }
        }
        return i2;
    }

    /* renamed from: ᴵʿ */
    public C2431 mo9680(C2431 c2431) {
        if (this.f16707 == 0 || c2431.f9669 == Long.MAX_VALUE) {
            return c2431;
        }
        C2417 c2417M6541 = c2431.m6541();
        c2417M6541.f9621 = c2431.f9669 + this.f16707;
        return new C2431(c2417M6541);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final int m9774(int i) {
        int i2 = this.f16714 + i;
        int i3 = this.f16733;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final long m9775(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM9774 = m9774(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f16726[iM9774]);
            if ((this.f16712[iM9774] & 1) != 0) {
                break;
            }
            iM9774--;
            if (iM9774 == -1) {
                iM9774 = this.f16733 - 1;
            }
        }
        return jMax;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final synchronized boolean m9776(boolean z, long j) {
        int iM9763;
        try {
            m9772();
            int iM9774 = m9774(this.f16727);
            if (m9762() && j >= this.f16726[iM9774] && (j <= this.f16711 || z)) {
                if (this.f16713) {
                    int i = this.f16719 - this.f16727;
                    iM9763 = 0;
                    while (true) {
                        if (iM9763 >= i) {
                            if (!z) {
                                i = -1;
                            }
                            iM9763 = i;
                        } else if (this.f16726[iM9774] < j) {
                            iM9774++;
                            if (iM9774 == this.f16733) {
                                iM9774 = 0;
                            }
                            iM9763++;
                        }
                    }
                } else {
                    iM9763 = m9763(iM9774, this.f16719 - this.f16727, j, true);
                }
                if (iM9763 == -1) {
                    return false;
                }
                this.f16730 = j;
                this.f16727 += iM9763;
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final synchronized int m9777(boolean z, long j) {
        int iM9774 = m9774(this.f16727);
        if (m9762() && j >= this.f16726[iM9774]) {
            if (j > this.f16711 && z) {
                return this.f16719 - this.f16727;
            }
            int iM9763 = m9763(iM9774, this.f16719 - this.f16727, j, true);
            if (iM9763 == -1) {
                return 0;
            }
            return iM9763;
        }
        return 0;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m9778(C2431 c2431, C5349 c5349) {
        C2431 c24312;
        C2431 c24313 = this.f16723;
        boolean z = c24313 == null;
        C2405 c2405 = c24313 == null ? null : c24313.f9685;
        this.f16723 = c2431;
        C2405 c24052 = c2431.f9685;
        InterfaceC4483 interfaceC4483 = this.f16732;
        if (interfaceC4483 != null) {
            int iMo10235 = interfaceC4483.mo10235(c2431);
            C2417 c2417M6541 = c2431.m6541();
            c2417M6541.f9603 = iMo10235;
            c24312 = new C2431(c2417M6541);
        } else {
            c24312 = c2431;
        }
        c5349.f20757 = c24312;
        c5349.f20756 = this.f16717;
        if (interfaceC4483 == null) {
            return;
        }
        if (z || !AbstractC4470.m10194(c2405, c24052)) {
            InterfaceC4493 interfaceC4493 = this.f16717;
            C4480 c4480 = this.f16704;
            InterfaceC4493 interfaceC4493Mo10234 = interfaceC4483.mo10234(c4480, c2431);
            this.f16717 = interfaceC4493Mo10234;
            c5349.f20756 = interfaceC4493Mo10234;
            if (interfaceC4493 != null) {
                interfaceC4493.mo10246(c4480);
            }
        }
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ﹳﹳ */
    public final void mo7844(C4457 c4457, int i, int i2) {
        while (true) {
            C4240 c4240 = this.f16721;
            if (i <= 0) {
                c4240.getClass();
                return;
            }
            int iM9701 = c4240.m9701(i);
            C1778 c1778 = c4240.f16460;
            C1663 c1663 = (C1663) c1778.f6898;
            c4457.m10097(c1663.f6499, ((int) (c4240.f16461 - c1778.f6900)) + c1663.f6498, iM9701);
            i -= iM9701;
            long j = c4240.f16461 + iM9701;
            c4240.f16461 = j;
            C1778 c17782 = c4240.f16460;
            if (j == c17782.f6897) {
                c4240.f16460 = (C1778) c17782.f6899;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m9779(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f16727     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f16719     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            p383.AbstractC4464.m10142(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f16727     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f16727 = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4296.m9779(int):void");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m9780(boolean z, long j) {
        long jM9768;
        int i;
        C4240 c4240 = this.f16721;
        synchronized (this) {
            try {
                int i2 = this.f16719;
                jM9768 = -1;
                if (i2 != 0) {
                    long[] jArr = this.f16726;
                    int i3 = this.f16714;
                    if (j >= jArr[i3]) {
                        if (z && (i = this.f16727) != i2) {
                            i2 = i + 1;
                        }
                        int iM9763 = m9763(i3, i2, j, false);
                        if (iM9763 != -1) {
                            jM9768 = m9768(iM9763);
                        }
                    }
                }
            } finally {
            }
        }
        c4240.m9700(jM9768);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m9781(int i) {
        InterfaceC4493 interfaceC4493 = this.f16717;
        return interfaceC4493 == null || interfaceC4493.getState() == 4 || ((this.f16712[i] & 1073741824) == 0 && this.f16717.mo10238());
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final synchronized boolean m9782(boolean z) {
        C2431 c2431;
        boolean z2 = true;
        if (m9762()) {
            if (((C4284) this.f16718.ˉי(m9765())).f16632 != this.f16723) {
                return true;
            }
            return m9781(m9774(this.f16727));
        }
        if (!z && !this.f16735 && ((c2431 = this.f16725) == null || c2431 == this.f16723)) {
            z2 = false;
        }
        return z2;
    }
}
