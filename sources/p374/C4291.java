package p374;

import java.io.IOException;
import p166.AbstractC2394;
import p166.C2395;
import p166.C2412;
import p166.C2434;
import p383.AbstractC4470;

/* renamed from: ᵢˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4291 extends AbstractC4267 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f16695;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f16696;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f16697;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f16698;

    public C4291(AbstractC2394 abstractC2394, long j, long j2) throws IOException {
        super(abstractC2394);
        boolean z = false;
        z = false;
        z = false;
        final int i = 1;
        if (abstractC2394.mo6475() != 1) {
            final int i2 = z ? 1 : 0;
            throw new IOException(i2) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                {
                    super("Illegal clipping: ".concat(i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
                }
            };
        }
        C2434 c2434Mo6179 = abstractC2394.mo6179(0, new C2434(), 0L);
        long jMax = Math.max(0L, j);
        if (!c2434Mo6179.f9708 && jMax != 0 && !c2434Mo6179.f9710) {
            throw new IOException(i) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                {
                    super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
                }
            };
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c2434Mo6179.f9707 : Math.max(0L, j2);
        long j3 = c2434Mo6179.f9707;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                final int i3 = 2;
                throw new IOException(i3) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                    {
                        super("Illegal clipping: ".concat(i3 != 0 ? i3 != 1 ? i3 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
                    }
                };
            }
        }
        this.f16696 = jMax;
        this.f16698 = jMax2;
        this.f16695 = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c2434Mo6179.f9718 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f16697 = z;
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ˋⁱ */
    public final C2434 mo6179(int i, C2434 c2434, long j) {
        this.f16576.mo6179(0, c2434, 0L);
        long j2 = c2434.f9712;
        long j3 = this.f16696;
        c2434.f9712 = j2 + j3;
        c2434.f9707 = this.f16695;
        c2434.f9718 = this.f16697;
        long j4 = c2434.f9706;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c2434.f9706 = jMax;
            long j5 = this.f16698;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c2434.f9706 = jMax - j3;
        }
        long jM10171 = AbstractC4470.m10171(j3);
        long j6 = c2434.f9704;
        if (j6 != -9223372036854775807L) {
            c2434.f9704 = j6 + jM10171;
        }
        long j7 = c2434.f9714;
        if (j7 != -9223372036854775807L) {
            c2434.f9714 = j7 + jM10171;
        }
        return c2434;
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ٴˎ */
    public final C2412 mo6180(int i, C2412 c2412, boolean z) {
        this.f16576.mo6180(0, c2412, z);
        long j = c2412.f9575 - this.f16696;
        long j2 = this.f16695;
        c2412.m6501(c2412.f9577, c2412.f9574, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C2395.f9449, false);
        return c2412;
    }
}
