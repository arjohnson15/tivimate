package p374;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5077;
import p438.C5085;

/* renamed from: ᵢˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4266 implements InterfaceC4294, InterfaceC4295 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public InterfaceC4295 f16569;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f16570;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C4242[] f16571 = new C4242[0];

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f16572;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4294 f16573;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public long f16574;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ClippingMediaSource$IllegalClippingException f16575;

    public C4266(InterfaceC4294 interfaceC4294, boolean z, long j, long j2) {
        this.f16573 = interfaceC4294;
        this.f16572 = z ? j : -9223372036854775807L;
        this.f16570 = j;
        this.f16574 = j2;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f16573.mo6160();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי */
    public final long mo6161() {
        if (m9728()) {
            long j = this.f16572;
            this.f16572 = -9223372036854775807L;
            long jMo6161 = mo6161();
            return jMo6161 != -9223372036854775807L ? jMo6161 : j;
        }
        long jMo61612 = this.f16573.mo6161();
        if (jMo61612 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC4464.m10132(jMo61612 >= this.f16570);
        long j2 = this.f16574;
        AbstractC4464.m10132(j2 == Long.MIN_VALUE || jMo61612 <= j2);
        return jMo61612;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo6162(p036.InterfaceC1239[] r16, boolean[] r17, p374.InterfaceC4254[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4266.mo6162(ʼﹶ.ʿˏ[], boolean[], ᵢˎ.ˊᵔ[], boolean[], long):long");
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f16569 = interfaceC4295;
        this.f16573.mo6163(this, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo6164(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f16572 = r0
            ᵢˎ.ʽᐧ[] r0 = r6.f16571
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f16467 = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            ᵢˎ.ﾞʽ r0 = r6.f16573
            long r0 = r0.mo6164(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.f16570
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f16574
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            p383.AbstractC4464.m10132(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4266.mo6164(long):long");
    }

    @Override // p374.InterfaceC4295
    /* renamed from: ˏʾ */
    public final void mo9719(InterfaceC4294 interfaceC4294) {
        if (this.f16575 != null) {
            return;
        }
        InterfaceC4295 interfaceC4295 = this.f16569;
        interfaceC4295.getClass();
        interfaceC4295.mo9719(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        long jMo6165 = this.f16573.mo6165();
        if (jMo6165 != Long.MIN_VALUE) {
            long j = this.f16574;
            if (j == Long.MIN_VALUE || jMo6165 < j) {
                return jMo6165;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        return this.f16573.mo6166(c5077);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        long j2 = this.f16570;
        if (j == j2) {
            return j2;
        }
        long jM10184 = AbstractC4470.m10184(c5085.f19327, 0L, j - j2);
        long j3 = this.f16574;
        long jM101842 = AbstractC4470.m10184(c5085.f19326, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jM10184 != c5085.f19327 || jM101842 != c5085.f19326) {
            c5085 = new C5085(jM10184, jM101842);
        }
        return this.f16573.mo6167(j, c5085);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f16575;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.f16573.mo6168();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m9728() {
        return this.f16572 != -9223372036854775807L;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        return this.f16573.mo6169();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        this.f16573.mo6170(j);
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        InterfaceC4295 interfaceC4295 = this.f16569;
        interfaceC4295.getClass();
        interfaceC4295.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        this.f16573.mo6171(j);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        long jMo6173 = this.f16573.mo6173();
        if (jMo6173 != Long.MIN_VALUE) {
            long j = this.f16574;
            if (j == Long.MIN_VALUE || jMo6173 < j) {
                return jMo6173;
            }
        }
        return Long.MIN_VALUE;
    }
}
