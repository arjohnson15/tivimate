package p254;

import android.support.v4.media.session.AbstractC0002;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p153.C2324;
import p166.C2401;
import p209.C2799;
import p231.C3075;
import p331.C3761;
import p334.C3789;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˏᵢ.ᵢٴ;
import ـˈ.ˉᵎ;

/* renamed from: יי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3152 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f12179 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f12165 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int[] f12176 = {1, 2, 3, 6};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int[] f12186 = {48000, 44100, 32000};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int[] f12166 = {24000, 22050, 16000};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int[] f12180 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final int[] f12181 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final int[] f12175 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final int[] f12187 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final int[] f12168 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final int[] f12173 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final int[] f12169 = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final int[] f12171 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final int[] f12182 = {5, 8, 10, 12};

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final int[] f12174 = {6, 9, 12, 15};

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final int[] f12177 = {2, 4, 6, 8};

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final int[] f12184 = {9, 11, 13, 16};

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final int[] f12172 = {5, 8, 10, 12};

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final String[] f12183 = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final int[] f12185 = {44100, 48000, 32000};

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final int[] f12167 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final int[] f12170 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final int[] f12189 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final int[] f12188 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final int[] f12178 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static byte[] m7802(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m7803(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.m1097(str, null);
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static C3761 m7804(C4457 c4457) {
        c4457.m10085(1);
        int iM10095 = c4457.m10095();
        long j = c4457.f17169 + iM10095;
        int i = iM10095 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jM10094 = c4457.m10094();
            if (jM10094 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM10094;
            jArrCopyOf2[i2] = c4457.m10094();
            c4457.m10085(2);
            i2++;
        }
        c4457.m10085((int) (j - c4457.f17169));
        return new C3761(jArrCopyOf, 11, jArrCopyOf2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m7805(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f12185[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f12167[i4 - 1] : f12170[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f12189[i4 - 1] : f12188[i4 - 1] : f12178[i4 - 1];
        if (i2 == 3) {
            return AbstractC0002.m53(i8, 144, i6, i7);
        }
        return AbstractC0002.m53(i3 == 1 ? 72 : 144, i8, i6, i7);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static long m7806(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static ᵢٴ m7807(C4457 c4457, boolean z, boolean z2) throws ParserException {
        if (z) {
            m7824(3, c4457, false);
        }
        c4457.m10105((int) c4457.m10087(), AbstractC4010.f15450);
        long jM10087 = c4457.m10087();
        String[] strArr = new String[(int) jM10087];
        for (int i = 0; i < jM10087; i++) {
            strArr[i] = c4457.m10105((int) c4457.m10087(), AbstractC4010.f15450);
        }
        if (z2 && (c4457.m10086() & 1) == 0) {
            throw ParserException.m1097("framing bit expected to be set", null);
        }
        return new ᵢٴ(3, strArr);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m7808(C2324 c2324) throws ParserException {
        int iM6410 = c2324.m6410(4);
        if (iM6410 == 15) {
            if (c2324.m6389() >= 24) {
                return c2324.m6410(24);
            }
            throw ParserException.m1097("AAC header insufficient data", null);
        }
        if (iM6410 < 13) {
            return f12179[iM6410];
        }
        throw ParserException.m1097("AAC header wrong Sampling Frequency Index", null);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m7809(C2324 c2324, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c2324.m6399(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c2324.m6410(iArr[i]) + i3;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static C2324 m7810(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new C2324(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C2324 c2324 = new C2324(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C2324 c23242 = new C2324(bArrCopyOf.length, bArrCopyOf);
            while (c23242.m6389() >= 16) {
                c23242.m6408(2);
                int iM6410 = c23242.m6410(14) & 16383;
                int iMin = Math.min(8 - c2324.f9223, 14);
                int i3 = c2324.f9223;
                int i4 = (8 - i3) - iMin;
                byte[] bArr2 = c2324.f9219;
                int i5 = c2324.f9221;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr2[i5]);
                bArr2[i5] = b4;
                int i6 = 14 - iMin;
                bArr2[i5] = (byte) (b4 | ((iM6410 >>> i6) << i4));
                int i7 = i5 + 1;
                while (i6 > 8) {
                    c2324.f9219[i7] = (byte) (iM6410 >>> (i6 - 8));
                    i6 -= 8;
                    i7++;
                }
                int i8 = 8 - i6;
                byte[] bArr3 = c2324.f9219;
                byte b5 = (byte) (bArr3[i7] & ((1 << i8) - 1));
                bArr3[i7] = b5;
                bArr3[i7] = (byte) (((iM6410 & ((1 << i6) - 1)) << i8) | b5);
                c2324.m6408(14);
                c2324.m6402();
            }
        }
        c2324.m6398(bArrCopyOf.length, bArrCopyOf);
        return c2324;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p254.C3167 m7811(p153.C2324 r21) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p254.AbstractC3152.m7811(ˊˉ.ٴˎ):יי.ˑʽ");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m7812(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f12186[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f12175[i3]) * 2;
        }
        int i5 = f12181[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ArrayList m7813(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p007.C0946 m7814(p153.C2324 r9) {
        /*
            r0 = 16
            int r1 = r9.m6410(r0)
            int r0 = r9.m6410(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.m6410(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.m6410(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.m6410(r1)
            boolean r2 = r9.m6399()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.m6410(r2)
            boolean r5 = r9.m6399()
            if (r5 == 0) goto L47
            int r5 = r9.m6410(r4)
            if (r5 <= 0) goto L47
            r9.m6408(r1)
        L47:
            boolean r5 = r9.m6399()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L57
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L5a
        L57:
            r5 = 44100(0xac44, float:6.1797E-41)
        L5a:
            int r9 = r9.m6410(r3)
            int[] r8 = p254.AbstractC3152.f12187
            if (r5 != r6) goto L69
            r6 = 13
            if (r9 != r6) goto L69
            r9 = r8[r9]
            goto L97
        L69:
            if (r5 != r7) goto L96
            r6 = 14
            if (r9 >= r6) goto L96
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8f
            r7 = 11
            if (r2 == r1) goto L8a
            if (r2 == r4) goto L8f
            if (r2 == r3) goto L81
            goto L94
        L81:
            if (r9 == r4) goto L87
            if (r9 == r8) goto L87
            if (r9 != r7) goto L94
        L87:
            int r9 = r6 + 1
            goto L97
        L8a:
            if (r9 == r8) goto L87
            if (r9 != r7) goto L94
            goto L87
        L8f:
            if (r9 == r4) goto L87
            if (r9 != r8) goto L94
            goto L87
        L94:
            r9 = r6
            goto L97
        L96:
            r9 = 0
        L97:
            ʻˉ.ˋⁱ r1 = new ʻˉ.ˋⁱ
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p254.AbstractC3152.m7814(ˊˉ.ٴˎ):ʻˉ.ˋⁱ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m7815(int i, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < 13; i4++) {
            if (i == f12179[i4]) {
                i3 = i4;
            }
        }
        int i5 = -1;
        for (int i6 = 0; i6 < 16; i6++) {
            if (i2 == f12165[i6]) {
                i5 = i6;
            }
        }
        if (i == -1 || i5 == -1) {
            throw new IllegalArgumentException(AbstractC0002.m55(i, i2, "Invalid sample rate or number of channels: ", ", "));
        }
        return m7802(2, i3, i5);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m7816(long j, C4457 c4457, InterfaceC3178[] interfaceC3178Arr) {
        int i;
        while (true) {
            if (c4457.m10096() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c4457.m10096() == 0) {
                    i = -1;
                    break;
                }
                int iM10086 = c4457.m10086();
                i2 += iM10086;
                if (iM10086 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (c4457.m10096() == 0) {
                    i3 = -1;
                    break;
                }
                int iM100862 = c4457.m10086();
                i3 += iM100862;
                if (iM100862 != 255) {
                    break;
                }
            }
            int i4 = c4457.f17169 + i3;
            if (i3 == -1 || i3 > c4457.m10096()) {
                AbstractC4464.m10144("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = c4457.f17170;
            } else if (i == 4 && i3 >= 8) {
                int iM100863 = c4457.m10086();
                int iM10100 = c4457.m10100();
                int iM10092 = iM10100 == 49 ? c4457.m10092() : 0;
                int iM100864 = c4457.m10086();
                if (iM10100 == 47) {
                    c4457.m10085(1);
                }
                boolean z = iM100863 == 181 && (iM10100 == 49 || iM10100 == 47) && iM100864 == 3;
                if (iM10100 == 49) {
                    z &= iM10092 == 1195456820;
                }
                if (z) {
                    m7817(j, c4457, interfaceC3178Arr);
                }
            }
            c4457.m10108(i4);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m7817(long j, C4457 c4457, InterfaceC3178[] interfaceC3178Arr) {
        int iM10086 = c4457.m10086();
        if ((iM10086 & 64) != 0) {
            c4457.m10085(1);
            int i = (iM10086 & 31) * 3;
            int i2 = c4457.f17169;
            for (InterfaceC3178 interfaceC3178 : interfaceC3178Arr) {
                c4457.m10108(i2);
                interfaceC3178.mo7841(i, c4457);
                AbstractC4464.m10132(j != -9223372036854775807L);
                interfaceC3178.mo7842(j, 1, i, 0, null);
            }
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m7818(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static C2401 m7819(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = AbstractC4470.f17202;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC4464.m10144("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2799.m7077(new C4457(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC4464.m10127("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C3075(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2401(arrayList);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C3170 m7820(C2324 c2324, boolean z) throws ParserException {
        int iM6410 = c2324.m6410(5);
        if (iM6410 == 31) {
            iM6410 = c2324.m6410(6) + 32;
        }
        int iM7808 = m7808(c2324);
        int iM64102 = c2324.m6410(4);
        String str = ˉᵎ.ˉⁱ("mp4a.40.", iM6410);
        if (iM6410 == 5 || iM6410 == 29) {
            iM7808 = m7808(c2324);
            int iM64103 = c2324.m6410(5);
            if (iM64103 == 31) {
                iM64103 = c2324.m6410(6) + 32;
            }
            iM6410 = iM64103;
            if (iM6410 == 22) {
                iM64102 = c2324.m6410(4);
            }
        }
        if (z) {
            if (iM6410 != 1 && iM6410 != 2 && iM6410 != 3 && iM6410 != 4 && iM6410 != 6 && iM6410 != 7 && iM6410 != 17) {
                switch (iM6410) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.m1096("Unsupported audio object type: " + iM6410);
                }
            }
            if (c2324.m6399()) {
                AbstractC4464.m10144("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c2324.m6399()) {
                c2324.m6408(14);
            }
            boolean zM6399 = c2324.m6399();
            if (iM64102 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM6410 == 6 || iM6410 == 20) {
                c2324.m6408(3);
            }
            if (zM6399) {
                if (iM6410 == 22) {
                    c2324.m6408(16);
                }
                if (iM6410 == 17 || iM6410 == 19 || iM6410 == 20 || iM6410 == 23) {
                    c2324.m6408(3);
                }
                c2324.m6408(1);
            }
            switch (iM6410) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM64104 = c2324.m6410(2);
                    if (iM64104 == 2 || iM64104 == 3) {
                        throw ParserException.m1096("Unsupported epConfig: " + iM64104);
                    }
            }
        }
        int i = f12165[iM64102];
        if (i != -1) {
            return new C3170(iM7808, i, str);
        }
        throw ParserException.m1097(null, null);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m7821(int i, C4457 c4457) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return c4457.m10086() + 1;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return c4457.m10100() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7822(p383.C4457 r18, p254.C3179 r19, int r20, p166.C2430 r21) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p254.AbstractC3152.m7822(ᵢᵢ.ˋⁱ, יי.ﹳˎ, int, ˊﹶ.ᵎˏ):boolean");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m7823(int i, C4457 c4457) {
        c4457.m10099(7);
        byte[] bArr = c4457.f17171;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static boolean m7824(int i, C4457 c4457, boolean z) throws ParserException {
        if (c4457.m10096() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.m1097("too short header: " + c4457.m10096(), null);
        }
        if (c4457.m10086() != i) {
            if (z) {
                return false;
            }
            throw ParserException.m1097("expected header type " + Integer.toHexString(i), null);
        }
        if (c4457.m10086() == 118 && c4457.m10086() == 111 && c4457.m10086() == 114 && c4457.m10086() == 98 && c4457.m10086() == 105 && c4457.m10086() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.m1097("expected characters 'vorbis'", null);
    }
}
