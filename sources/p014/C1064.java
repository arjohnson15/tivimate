package p014;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p208.AbstractC2793;
import p254.C3159;
import p254.C3182;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p260.C3222;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p397.InterfaceC4603;
import ʾי.ˑʽ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻـ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1064 implements InterfaceC3165 {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final byte[] f4528 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final byte[] f4529;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final byte[] f4530;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static final Map f4531;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final byte[] f4532;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static final UUID f4533;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f4534;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1063 f4535;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f4536;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f4537;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f4538;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public long f4539;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f4540;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C1060 f4541;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public boolean f4542;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4457 f4543;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public int f4544;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C4457 f4545;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f4546;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f4547;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public long f4548;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C4457 f4549;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f4550;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f4551;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f4552;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f4553;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f4554;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4457 f4555;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C4457 f4556;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4457 f4557;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final SparseArray f4558;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C4457 f4559;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f4560;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int[] f4561;

    /* renamed from: יʻ, reason: contains not printable characters */
    public int f4562;

    /* renamed from: יˋ, reason: contains not printable characters */
    public InterfaceC3177 f4563;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f4564;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1059 f4565;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC4603 f4566;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4457 f4567;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C1060 f4568;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f4569;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f4570;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C4457 f4571;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f4572;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public long f4573;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ByteBuffer f4574;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f4575;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public long f4576;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f4577;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f4578;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f4579;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public byte f4580;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f4581;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public long f4582;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f4583;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f4584;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4457 f4585;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f4586;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public C1061 f4587;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f4588;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f4589;

    static {
        int i = AbstractC4470.f17202;
        f4530 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC4010.f15450);
        f4529 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f4532 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f4533 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        ᐧʻ.ˎٴ(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        ᐧʻ.ˎٴ(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f4531 = DesugarCollections.unmodifiableMap(map);
    }

    public C1064(InterfaceC4603 interfaceC4603, int i) {
        C1059 c1059 = new C1059();
        this.f4573 = -1L;
        this.f4581 = -9223372036854775807L;
        this.f4539 = -9223372036854775807L;
        this.f4548 = -9223372036854775807L;
        this.f4569 = -1L;
        this.f4540 = -1L;
        this.f4552 = -9223372036854775807L;
        this.f4565 = c1059;
        c1059.f4467 = new ˑʽ(10, this);
        this.f4566 = interfaceC4603;
        this.f4583 = (i & 1) == 0;
        this.f4537 = (i & 2) == 0;
        this.f4535 = new C1063();
        this.f4558 = new SparseArray();
        this.f4585 = new C4457(4);
        this.f4543 = new C4457(ByteBuffer.allocate(4).putInt(-1).array());
        this.f4555 = new C4457(4);
        this.f4567 = new C4457(AbstractC2793.f10876);
        this.f4557 = new C4457(4);
        this.f4545 = new C4457();
        this.f4549 = new C4457();
        this.f4571 = new C4457(8);
        this.f4556 = new C4457();
        this.f4559 = new C4457();
        this.f4561 = new int[1];
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static byte[] m4072(long j, long j2, String str) {
        AbstractC4464.m10142(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = AbstractC4470.f17202;
        return str2.getBytes(AbstractC4010.f15450);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        C1060 c1060 = new C1060(0);
        C3159 c3159 = (C3159) interfaceC3168;
        long j = c3159.f12216;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        C4457 c4457 = (C4457) c1060.f4468;
        c3159.mo4875(c4457.f17171, 0, 4, false);
        c1060.f4469 = 4;
        for (long jM10110 = c4457.m10110(); jM10110 != 440786851; jM10110 = ((jM10110 << 8) & (-256)) | (c4457.f17171[0] & 255)) {
            int i2 = c1060.f4469 + 1;
            c1060.f4469 = i2;
            if (i2 == i) {
                return false;
            }
            c3159.mo4875(c4457.f17171, 0, 1, false);
        }
        long jM4059 = c1060.m4059(c3159);
        long j3 = c1060.f4469;
        if (jM4059 == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jM4059 >= j) {
            return false;
        }
        while (true) {
            long j4 = c1060.f4469;
            long j5 = j3 + jM4059;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (c1060.m4059(c3159) == Long.MIN_VALUE) {
                return false;
            }
            long jM40592 = c1060.m4059(c3159);
            if (jM40592 < 0 || jM40592 > 2147483647L) {
                return false;
            }
            if (jM40592 != 0) {
                int i3 = (int) jM40592;
                c3159.m7828(i3, false);
                c1060.f4469 += i3;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0559 A[PHI: r31
  0x0559: PHI (r31v37 java.lang.String) = 
  (r31v3 java.lang.String)
  (r31v4 java.lang.String)
  (r31v5 java.lang.String)
  (r31v6 java.lang.String)
  (r31v7 java.lang.String)
  (r31v8 java.lang.String)
  (r31v9 java.lang.String)
  (r31v10 java.lang.String)
  (r31v11 java.lang.String)
  (r31v12 java.lang.String)
  (r31v13 java.lang.String)
  (r31v14 java.lang.String)
  (r31v15 java.lang.String)
  (r31v16 java.lang.String)
  (r31v17 java.lang.String)
  (r31v18 java.lang.String)
  (r31v19 java.lang.String)
  (r31v20 java.lang.String)
  (r31v21 java.lang.String)
  (r31v22 java.lang.String)
  (r31v23 java.lang.String)
  (r31v24 java.lang.String)
  (r31v25 java.lang.String)
  (r31v26 java.lang.String)
  (r31v27 java.lang.String)
  (r31v28 java.lang.String)
  (r31v29 java.lang.String)
  (r31v30 java.lang.String)
  (r31v31 java.lang.String)
  (r31v32 java.lang.String)
  (r31v33 java.lang.String)
  (r31v34 java.lang.String)
  (r31v38 java.lang.String)
 binds: [B:364:0x0740, B:360:0x0735, B:356:0x072a, B:352:0x071f, B:348:0x0714, B:344:0x0709, B:340:0x06fe, B:336:0x06f1, B:332:0x06e1, B:328:0x06d1, B:324:0x06c1, B:320:0x06b1, B:316:0x06a1, B:312:0x0691, B:308:0x0681, B:304:0x0671, B:300:0x0661, B:296:0x0651, B:292:0x0641, B:288:0x0631, B:284:0x0621, B:280:0x0611, B:276:0x0601, B:272:0x05f1, B:268:0x05e1, B:264:0x05d1, B:260:0x05c1, B:256:0x05b1, B:252:0x05a1, B:248:0x0591, B:244:0x0581, B:240:0x0571, B:233:0x0557] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0bcf  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0db1  */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, ʻـ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v26, types: [יי.ˉⁱ] */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r43, p166.C2430 r44) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 5442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p014.C1064.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m4076(C3159 c3159, int i) throws EOFException, InterruptedIOException {
        C4457 c4457 = this.f4585;
        if (c4457.f17170 >= i) {
            return;
        }
        byte[] bArr = c4457.f17171;
        if (bArr.length < i) {
            c4457.m10077(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c4457.f17171;
        int i2 = c4457.f17170;
        c3159.mo4876(bArr2, i2, i - i2, false);
        c4457.m10104(i);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m4077() {
        this.f4575 = 0;
        this.f4588 = 0;
        this.f4546 = 0;
        this.f4550 = false;
        this.f4572 = false;
        this.f4538 = false;
        this.f4544 = 0;
        this.f4580 = (byte) 0;
        this.f4551 = false;
        this.f4545.m10099(0);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int m4078(C3159 c3159, C1061 c1061, int i, boolean z) throws ParserException, EOFException, InterruptedIOException {
        int iMo7843;
        int iMo78432;
        int i2;
        if ("S_TEXT/UTF8".equals(c1061.f4471)) {
            m4081(c3159, f4528, i);
            int i3 = this.f4588;
            m4077();
            return i3;
        }
        if ("S_TEXT/ASS".equals(c1061.f4471)) {
            m4081(c3159, f4529, i);
            int i4 = this.f4588;
            m4077();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(c1061.f4471)) {
            m4081(c3159, f4532, i);
            int i5 = this.f4588;
            m4077();
            return i5;
        }
        InterfaceC3178 interfaceC3178 = c1061.f4505;
        boolean z2 = this.f4550;
        C4457 c4457 = this.f4545;
        if (!z2) {
            boolean z3 = c1061.f4491;
            C4457 c44572 = this.f4585;
            if (z3) {
                this.f4554 &= -1073741825;
                if (!this.f4572) {
                    c3159.mo4876(c44572.f17171, 0, 1, false);
                    this.f4575++;
                    byte b = c44572.f17171[0];
                    if ((b & 128) == 128) {
                        throw ParserException.m1097("Extension bit is set in signal byte", null);
                    }
                    this.f4580 = b;
                    this.f4572 = true;
                }
                byte b2 = this.f4580;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.f4554 |= 1073741824;
                    if (!this.f4551) {
                        C4457 c44573 = this.f4571;
                        c3159.mo4876(c44573.f17171, 0, 8, false);
                        this.f4575 += 8;
                        this.f4551 = true;
                        c44572.f17171[0] = (byte) ((z4 ? 128 : 0) | 8);
                        c44572.m10108(0);
                        interfaceC3178.mo7844(c44572, 1, 1);
                        this.f4588++;
                        c44573.m10108(0);
                        interfaceC3178.mo7844(c44573, 8, 1);
                        this.f4588 += 8;
                    }
                    if (z4) {
                        if (!this.f4538) {
                            c3159.mo4876(c44572.f17171, 0, 1, false);
                            this.f4575++;
                            c44572.m10108(0);
                            this.f4544 = c44572.m10086();
                            this.f4538 = true;
                        }
                        int i6 = this.f4544 * 4;
                        c44572.m10099(i6);
                        c3159.mo4876(c44572.f17171, 0, i6, false);
                        this.f4575 += i6;
                        short s = (short) ((this.f4544 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f4574;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f4574 = ByteBuffer.allocate(i7);
                        }
                        this.f4574.position(0);
                        this.f4574.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f4544;
                            if (i8 >= i2) {
                                break;
                            }
                            int iM10106 = c44572.m10106();
                            if (i8 % 2 == 0) {
                                this.f4574.putShort((short) (iM10106 - i9));
                            } else {
                                this.f4574.putInt(iM10106 - i9);
                            }
                            i8++;
                            i9 = iM10106;
                        }
                        int i10 = (i - this.f4575) - i9;
                        if (i2 % 2 == 1) {
                            this.f4574.putInt(i10);
                        } else {
                            this.f4574.putShort((short) i10);
                            this.f4574.putInt(0);
                        }
                        byte[] bArrArray = this.f4574.array();
                        C4457 c44574 = this.f4556;
                        c44574.m10081(i7, bArrArray);
                        interfaceC3178.mo7844(c44574, i7, 1);
                        this.f4588 += i7;
                    }
                }
            } else {
                byte[] bArr = c1061.f4517;
                if (bArr != null) {
                    c4457.m10081(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c1061.f4471) ? z : c1061.f4499 > 0) {
                this.f4554 |= 268435456;
                this.f4559.m10099(0);
                int i11 = (c4457.f17170 + i) - this.f4575;
                c44572.m10099(4);
                byte[] bArr2 = c44572.f17171;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                interfaceC3178.mo7844(c44572, 4, 2);
                this.f4588 += 4;
            }
            this.f4550 = true;
        }
        int i12 = i + c4457.f17170;
        if (!"V_MPEG4/ISO/AVC".equals(c1061.f4471) && !"V_MPEGH/ISO/HEVC".equals(c1061.f4471)) {
            if (c1061.f4508 != null) {
                AbstractC4464.m10132(c4457.f17170 == 0);
                c1061.f4508.m7851(c3159);
            }
            while (true) {
                int i13 = this.f4575;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iM10096 = c4457.m10096();
                if (iM10096 > 0) {
                    iMo78432 = Math.min(i14, iM10096);
                    interfaceC3178.mo7841(iMo78432, c4457);
                } else {
                    iMo78432 = interfaceC3178.mo7843(c3159, i14, false);
                }
                this.f4575 += iMo78432;
                this.f4588 += iMo78432;
            }
        } else {
            C4457 c44575 = this.f4557;
            byte[] bArr3 = c44575.f17171;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = c1061.f4474;
            int i16 = 4 - i15;
            while (this.f4575 < i12) {
                int i17 = this.f4546;
                if (i17 == 0) {
                    int iMin = Math.min(i15, c4457.m10096());
                    c3159.mo4876(bArr3, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        c4457.m10097(bArr3, i16, iMin);
                    }
                    this.f4575 += i15;
                    c44575.m10108(0);
                    this.f4546 = c44575.m10106();
                    C4457 c44576 = this.f4567;
                    c44576.m10108(0);
                    interfaceC3178.mo7841(4, c44576);
                    this.f4588 += 4;
                } else {
                    int iM100962 = c4457.m10096();
                    if (iM100962 > 0) {
                        iMo7843 = Math.min(i17, iM100962);
                        interfaceC3178.mo7841(iMo7843, c4457);
                    } else {
                        iMo7843 = interfaceC3178.mo7843(c3159, i17, false);
                    }
                    this.f4575 += iMo7843;
                    this.f4588 += iMo7843;
                    this.f4546 -= iMo7843;
                }
            }
        }
        if ("A_VORBIS".equals(c1061.f4471)) {
            C4457 c44577 = this.f4543;
            c44577.m10108(0);
            interfaceC3178.mo7841(4, c44577);
            this.f4588 += 4;
        }
        int i18 = this.f4588;
        m4077();
        return i18;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4080(int i) throws ParserException {
        if (this.f4568 == null || this.f4541 == null) {
            throw ParserException.m1097("Element " + i + " must be in a Cues", null);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4081(C3159 c3159, byte[] bArr, int i) throws EOFException, InterruptedIOException {
        int length = bArr.length + i;
        C4457 c4457 = this.f4549;
        byte[] bArr2 = c4457.f17171;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c4457.m10081(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c3159.mo4876(c4457.f17171, bArr.length, i, false);
        c4457.m10108(0);
        c4457.m10104(length);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo4082(long j, long j2) {
        this.f4552 = -9223372036854775807L;
        this.f4547 = 0;
        C1059 c1059 = this.f4565;
        c1059.f4462 = 0;
        c1059.f4461.clear();
        C1063 c1063 = c1059.f4463;
        c1063.f4525 = 0;
        c1063.f4526 = 0;
        C1063 c10632 = this.f4535;
        c10632.f4525 = 0;
        c10632.f4526 = 0;
        m4077();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f4558;
            if (i >= sparseArray.size()) {
                return;
            }
            C3182 c3182 = ((C1061) sparseArray.valueAt(i)).f4508;
            if (c3182 != null) {
                c3182.f12302 = false;
                c3182.f12304 = 0;
            }
            i++;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4083(int i) throws ParserException {
        if (this.f4587 != null) {
            return;
        }
        throw ParserException.m1097("Element " + i + " must be in a TrackEntry", null);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f4563 = interfaceC3177;
        if (this.f4537) {
            interfaceC3177 = new C3222(interfaceC3177, this.f4566);
        }
        this.f4563 = interfaceC3177;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final long m4085(long j) throws ParserException {
        long j2 = this.f4581;
        if (j2 == -9223372036854775807L) {
            throw ParserException.m1097("Can't scale timecode prior to timecodeScale being set.", null);
        }
        int i = AbstractC4470.f17202;
        return AbstractC4470.m10166(j, j2, 1000L, RoundingMode.FLOOR);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC3165 mo4086() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4087(p014.C1061 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p014.C1064.m4087(ʻـ.ˑʽ, long, int, int, int):void");
    }
}
