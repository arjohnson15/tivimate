package p374;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p166.AbstractC2394;
import p166.C2395;
import p166.C2402;
import p166.C2407;
import p166.C2410;
import p166.C2412;
import p166.C2420;
import p166.C2430;
import p166.C2443;
import p166.C2444;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;

/* renamed from: ᵢˎ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4252 extends AbstractC2394 {

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final Object f16506 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f16507;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f16508;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean f16509;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C2402 f16510;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C2444 f16511;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Object f16512;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f16513;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f16514;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f16515;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f16516;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f16517;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f16518;

    static {
        C2430 c2430 = new C2430();
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        List listEmptyList = Collections.emptyList();
        C3932 c39322 = C3932.f15274;
        C2407 c2407 = new C2407();
        C2420 c2420 = C2420.f9633;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C2443(uri, null, null, listEmptyList, c39322, -9223372036854775807L);
        }
        c2430.m6538();
        c2407.m6497();
        C2410 c2410 = C2410.f9547;
    }

    public C4252(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, C2402 c2402, C2444 c2444) {
        this.f16507 = j;
        this.f16514 = j2;
        this.f16517 = j3;
        this.f16508 = j4;
        this.f16515 = j5;
        this.f16516 = j6;
        this.f16513 = z;
        this.f16518 = z2;
        this.f16509 = z3;
        this.f16512 = obj;
        c2402.getClass();
        this.f16510 = c2402;
        this.f16511 = c2444;
    }

    public C4252(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C2402 c2402) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c2402, z3 ? c2402.f9494 : null);
    }

    public C4252(long j, boolean z, boolean z2, C2402 c2402) {
        this(j, j, 0L, 0L, z, false, z2, null, c2402);
    }

    @Override // p166.AbstractC2394
    /* renamed from: ʽᐧ */
    public final int mo6469(Object obj) {
        return f16506.equals(obj) ? 0 : -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˉⁱ */
    public final Object mo6472(int i) {
        AbstractC4464.m10152(i, 1);
        return f16506;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p166.AbstractC2394
    /* renamed from: ˋⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p166.C2434 mo6179(int r23, p166.C2434 r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            p383.AbstractC4464.m10152(r2, r1)
            long r1 = r0.f16516
            boolean r13 = r0.f16518
            if (r13 == 0) goto L2c
            boolean r3 = r0.f16509
            if (r3 != 0) goto L2c
            r3 = 0
            int r5 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r0.f16508
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r3
            goto L2d
        L25:
            long r1 = r1 + r25
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = p166.C2434.f9702
            ˊﹶ.ﾞˊ r14 = r0.f16511
            long r1 = r0.f16508
            r17 = r1
            ˊﹶ.ˈٴ r4 = r0.f16510
            java.lang.Object r5 = r0.f16512
            long r6 = r0.f16507
            long r8 = r0.f16514
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f16513
            r19 = 0
            long r1 = r0.f16515
            r20 = r1
            r3 = r24
            r3.m6546(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: p374.C4252.mo6179(int, ˊﹶ.ᵔﹳ, long):ˊﹶ.ᵔﹳ");
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏᴵ */
    public final int mo6474() {
        return 1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏᵢ */
    public final int mo6475() {
        return 1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ٴˎ */
    public final C2412 mo6180(int i, C2412 c2412, boolean z) {
        AbstractC4464.m10152(i, 1);
        Object obj = z ? f16506 : null;
        long j = -this.f16515;
        c2412.getClass();
        c2412.m6501(null, obj, 0, this.f16517, j, C2395.f9449, false);
        return c2412;
    }
}
