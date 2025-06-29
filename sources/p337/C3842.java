package p337;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import p383.AbstractC4470;
import p383.C4460;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵎˆ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3842 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long[] f14754;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f14755;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public long f14756;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f14757;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f14758;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public long f14759;

    /* renamed from: ˉי, reason: contains not printable characters */
    public float f14760;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f14761;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f14762;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public long f14763;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f14764;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f14765;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f14766;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f14767;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f14768;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f14769;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public AudioTrack f14770;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f14771;

    /* renamed from: יʻ, reason: contains not printable characters */
    public long f14772;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f14773;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᵢٴ f14774;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C3829 f14775;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f14776;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f14777;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f14778;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f14779;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public Method f14780;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public long f14781;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f14782;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public long f14783;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f14784;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public long f14785;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f14786;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f14787;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f14788;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f14789;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f14790;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C4460 f14791;

    public C3842(ᵢٴ r3) {
        this.f14774 = r3;
        try {
            this.f14780 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14754 = new long[10];
        this.f14791 = C4460.f17177;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m9018() {
        /*
            r13 = this;
            ᵢᵢ.ˏᴵ r0 = r13.f14791
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r13.f14772
            r4 = 2
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L46
            android.media.AudioTrack r2 = r13.f14770
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r4) goto L23
            long r0 = r13.f14759
            return r0
        L23:
            long r0 = p383.AbstractC4470.m10206(r0)
            long r2 = r13.f14772
            long r0 = r0 - r2
            float r2 = r13.f14760
            long r3 = p383.AbstractC4470.m10211(r0, r2)
            int r0 = r13.f14776
            long r5 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.CEILING
            long r0 = p383.AbstractC4470.m10166(r3, r5, r7, r9)
            long r2 = r13.f14778
            long r4 = r13.f14759
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L46:
            long r2 = r13.f14781
            long r2 = r0 - r2
            r7 = 5
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto Lb7
            android.media.AudioTrack r2 = r13.f14770
            r2.getClass()
            int r3 = r2.getPlayState()
            r7 = 1
            if (r3 != r7) goto L5d
            goto Lb5
        L5d:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r2 = r13.f14769
            r9 = 0
            if (r2 == 0) goto L7b
            if (r3 != r4) goto L78
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L78
            long r11 = r13.f14784
            r13.f14763 = r11
        L78:
            long r11 = r13.f14763
            long r7 = r7 + r11
        L7b:
            int r2 = p383.AbstractC4470.f17202
            r4 = 29
            if (r2 > r4) goto L99
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L97
            long r11 = r13.f14784
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L97
            r2 = 3
            if (r3 != r2) goto L97
            long r2 = r13.f14785
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto Lb5
            r13.f14785 = r0
            goto Lb5
        L97:
            r13.f14785 = r5
        L99:
            long r2 = r13.f14784
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto Lb3
            boolean r4 = r13.f14773
            if (r4 == 0) goto Lac
            long r4 = r13.f14779
            long r4 = r4 + r2
            r13.f14779 = r4
            r2 = 0
            r13.f14773 = r2
            goto Lb3
        Lac:
            long r2 = r13.f14756
            r4 = 1
            long r2 = r2 + r4
            r13.f14756 = r2
        Lb3:
            r13.f14784 = r7
        Lb5:
            r13.f14781 = r0
        Lb7:
            long r0 = r13.f14784
            long r2 = r13.f14779
            long r0 = r0 + r2
            long r2 = r13.f14756
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3842.m9018():long");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m9019(long j) {
        long jM9020 = m9020(false);
        int i = this.f14776;
        int i2 = AbstractC4470.f17202;
        if (j <= AbstractC4470.m10166(jM9020, i, 1000000L, RoundingMode.CEILING)) {
            if (!this.f14769) {
                return false;
            }
            AudioTrack audioTrack = this.f14770;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || m9018() != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0341 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221 A[Catch: Exception -> 0x0237, TRY_LEAVE, TryCatch #0 {Exception -> 0x0237, blocks: (B:89:0x01fa, B:91:0x0221), top: B:147:0x01fa }] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m9020(boolean r27) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3842.m9020(boolean):long");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9021() {
        this.f14761 = 0L;
        this.f14789 = 0;
        this.f14790 = 0;
        this.f14764 = 0L;
        this.f14765 = 0L;
        this.f14783 = 0L;
        this.f14767 = false;
    }
}
