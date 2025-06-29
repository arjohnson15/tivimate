package p380;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2401;
import p310.C3581;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;
import p353.AbstractC4010;
import p383.AbstractC4470;
import p383.C4457;
import p392.C4520;
import p395.AbstractC4535;
import ˈⁱ.ˉⁱ;

/* renamed from: ᵢᴵ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4437 extends ˉⁱ {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3581 f17101 = new C3581(22);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC4434 f17102;

    public C4437(InterfaceC4434 interfaceC4434) {
        this.f17102 = interfaceC4434;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static C4430 m10040(C4457 c4457, int i, int i2, boolean z, int i3, InterfaceC4434 interfaceC4434) {
        int i4 = c4457.f17169;
        int iM10050 = m10050(i4, c4457.f17171);
        String str = new String(c4457.f17171, i4, iM10050 - i4, AbstractC4010.f15448);
        c4457.m10108(iM10050 + 1);
        int iM10092 = c4457.m10092();
        int iM100922 = c4457.m10092();
        long jM10110 = c4457.m10110();
        long j = jM10110 == 4294967295L ? -1L : jM10110;
        long jM101102 = c4457.m10110();
        long j2 = jM101102 == 4294967295L ? -1L : jM101102;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c4457.f17169 < i5) {
            AbstractC4424 abstractC4424M10060 = m10060(i2, c4457, z, i3, interfaceC4434);
            if (abstractC4424M10060 != null) {
                arrayList.add(abstractC4424M10060);
            }
        }
        return new C4430(str, iM10092, iM100922, j, j2, (AbstractC4424[]) arrayList.toArray(new AbstractC4424[0]));
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static C4431 m10041(int i, C4457 c4457) {
        if (i < 1) {
            return null;
        }
        int iM10086 = c4457.m10086();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4457.m10097(bArr, 0, i2);
        int iM10052 = m10052(bArr, 0, iM10086);
        String str = new String(bArr, 0, iM10052, m10042(iM10086));
        int iM10044 = m10044(iM10086) + iM10052;
        return new C4431("WXXX", str, m10043(bArr, iM10044, m10050(iM10044, bArr), AbstractC4010.f15448));
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static Charset m10042(int i) {
        return i != 1 ? i != 2 ? i != 3 ? AbstractC4010.f15448 : AbstractC4010.f15450 : AbstractC4010.f15453 : AbstractC4010.f15452;
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static String m10043(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static int m10044(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static C4428 m10045(int i, String str, C4457 c4457) {
        if (i < 1) {
            return null;
        }
        int iM10086 = c4457.m10086();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4457.m10097(bArr, 0, i2);
        return new C4428(str, null, m10059(bArr, iM10086, 0));
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static C4433 m10046(int i, C4457 c4457) {
        int iM10086 = c4457.m10086();
        Charset charsetM10042 = m10042(iM10086);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4457.m10097(bArr, 0, i2);
        int iM10050 = m10050(0, bArr);
        String strM6559 = AbstractC2435.m6559(new String(bArr, 0, iM10050, AbstractC4010.f15448));
        int i3 = iM10050 + 1;
        int iM10052 = m10052(bArr, i3, iM10086);
        String strM10043 = m10043(bArr, i3, iM10052, charsetM10042);
        int iM10044 = m10044(iM10086) + iM10052;
        int iM100522 = m10052(bArr, iM10044, iM10086);
        String strM100432 = m10043(bArr, iM10044, iM100522, charsetM10042);
        int iM100442 = m10044(iM10086) + iM100522;
        return new C4433(strM6559, strM10043, strM100432, i2 <= iM100442 ? AbstractC4470.f17203 : Arrays.copyOfRange(bArr, iM100442, i2));
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static C4426 m10047(int i, C4457 c4457) {
        int iM10100 = c4457.m10100();
        int iM10095 = c4457.m10095();
        int iM100952 = c4457.m10095();
        int iM10086 = c4457.m10086();
        int iM100862 = c4457.m10086();
        C2324 c2324 = new C2324(3);
        c2324.m6401(c4457);
        int i2 = ((i - 10) * 8) / (iM10086 + iM100862);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM6410 = c2324.m6410(iM10086);
            int iM64102 = c2324.m6410(iM100862);
            iArr[i3] = iM6410;
            iArr2[i3] = iM64102;
        }
        return new C4426(iM10100, iM10095, iM100952, iArr, iArr2);
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static C4428 m10048(int i, C4457 c4457) {
        if (i < 1) {
            return null;
        }
        int iM10086 = c4457.m10086();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4457.m10097(bArr, 0, i2);
        int iM10052 = m10052(bArr, 0, iM10086);
        return new C4428("TXXX", new String(bArr, 0, iM10052, m10042(iM10086)), m10059(bArr, iM10086, m10044(iM10086) + iM10052));
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public static C4431 m10049(int i, String str, C4457 c4457) {
        byte[] bArr = new byte[i];
        c4457.m10097(bArr, 0, i);
        return new C4431(str, null, new String(bArr, 0, m10050(0, bArr), AbstractC4010.f15448));
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static int m10050(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static String m10051(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static int m10052(byte[] bArr, int i, int i2) {
        int iM10050 = m10050(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM10050;
        }
        while (iM10050 < bArr.length - 1) {
            if ((iM10050 - i) % 2 == 0 && bArr[iM10050 + 1] == 0) {
                return iM10050;
            }
            iM10050 = m10050(iM10050 + 1, bArr);
        }
        return bArr.length;
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static C4435 m10053(int i, C4457 c4457) {
        byte[] bArr = new byte[i];
        c4457.m10097(bArr, 0, i);
        int iM10050 = m10050(0, bArr);
        String str = new String(bArr, 0, iM10050, AbstractC4010.f15448);
        int i2 = iM10050 + 1;
        return new C4435(i <= i2 ? AbstractC4470.f17203 : Arrays.copyOfRange(bArr, i2, i), str);
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public static boolean m10054(C4457 c4457, int i, int i2, boolean z) {
        int iM10095;
        long jM10095;
        int iM10100;
        int i3;
        int i4 = c4457.f17169;
        while (true) {
            try {
                boolean z2 = true;
                if (c4457.m10096() < i2) {
                    c4457.m10108(i4);
                    return true;
                }
                if (i >= 3) {
                    iM10095 = c4457.m10092();
                    jM10095 = c4457.m10110();
                    iM10100 = c4457.m10100();
                } else {
                    iM10095 = c4457.m10095();
                    jM10095 = c4457.m10095();
                    iM10100 = 0;
                }
                if (iM10095 == 0 && jM10095 == 0 && iM10100 == 0) {
                    c4457.m10108(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM10095) != 0) {
                        c4457.m10108(i4);
                        return false;
                    }
                    jM10095 = (((jM10095 >> 24) & 255) << 21) | (jM10095 & 255) | (((jM10095 >> 8) & 255) << 7) | (((jM10095 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM10100 & 64) != 0 ? 1 : 0;
                    if ((iM10100 & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM10100 & 32) != 0 ? 1 : 0;
                        if ((iM10100 & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM10095 < i3) {
                    c4457.m10108(i4);
                    return false;
                }
                if (c4457.m10096() < jM10095) {
                    c4457.m10108(i4);
                    return false;
                }
                c4457.m10085((int) jM10095);
            } catch (Throwable th) {
                c4457.m10108(i4);
                throw th;
            }
        }
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static int m10055(int i, C4457 c4457) {
        byte[] bArr = c4457.f17171;
        int i2 = c4457.f17169;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static C4423 m10056(int i, C4457 c4457) {
        if (i < 4) {
            return null;
        }
        int iM10086 = c4457.m10086();
        Charset charsetM10042 = m10042(iM10086);
        byte[] bArr = new byte[3];
        c4457.m10097(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c4457.m10097(bArr2, 0, i2);
        int iM10052 = m10052(bArr2, 0, iM10086);
        String str2 = new String(bArr2, 0, iM10052, charsetM10042);
        int iM10044 = m10044(iM10086) + iM10052;
        return new C4423(str, str2, m10043(bArr2, iM10044, m10052(bArr2, iM10044, iM10086), charsetM10042));
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static C4436 m10057(C4457 c4457, int i, int i2, boolean z, int i3, InterfaceC4434 interfaceC4434) {
        int i4 = c4457.f17169;
        int iM10050 = m10050(i4, c4457.f17171);
        String str = new String(c4457.f17171, i4, iM10050 - i4, AbstractC4010.f15448);
        c4457.m10108(iM10050 + 1);
        int iM10086 = c4457.m10086();
        boolean z2 = (iM10086 & 2) != 0;
        boolean z3 = (iM10086 & 1) != 0;
        int iM100862 = c4457.m10086();
        String[] strArr = new String[iM100862];
        for (int i5 = 0; i5 < iM100862; i5++) {
            int i6 = c4457.f17169;
            int iM100502 = m10050(i6, c4457.f17171);
            strArr[i5] = new String(c4457.f17171, i6, iM100502 - i6, AbstractC4010.f15448);
            c4457.m10108(iM100502 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c4457.f17169 < i7) {
            AbstractC4424 abstractC4424M10060 = m10060(i2, c4457, z, i3, interfaceC4434);
            if (abstractC4424M10060 != null) {
                arrayList.add(abstractC4424M10060);
            }
        }
        return new C4436(str, z2, z3, strArr, (AbstractC4424[]) arrayList.toArray(new AbstractC4424[0]));
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static C4432 m10058(C4457 c4457, int i, int i2) {
        int iM10050;
        String strConcat;
        int iM10086 = c4457.m10086();
        Charset charsetM10042 = m10042(iM10086);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c4457.m10097(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + AbstractC4535.m10327(new String(bArr, 0, 3, AbstractC4010.f15448));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM10050 = 2;
        } else {
            iM10050 = m10050(0, bArr);
            String strM10327 = AbstractC4535.m10327(new String(bArr, 0, iM10050, AbstractC4010.f15448));
            strConcat = strM10327.indexOf(47) == -1 ? "image/".concat(strM10327) : strM10327;
        }
        int i4 = bArr[iM10050 + 1] & 255;
        int i5 = iM10050 + 2;
        int iM10052 = m10052(bArr, i5, iM10086);
        String str = new String(bArr, i5, iM10052 - i5, charsetM10042);
        int iM10044 = m10044(iM10086) + iM10052;
        return new C4432(strConcat, str, i4, i3 <= iM10044 ? AbstractC4470.f17203 : Arrays.copyOfRange(bArr, iM10044, i3));
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static C3932 m10059(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return AbstractC3980.m9207("");
        }
        C3961 c3961M9205 = AbstractC3980.m9205();
        int iM10052 = m10052(bArr, i2, i);
        while (i2 < iM10052) {
            c3961M9205.m9172(new String(bArr, i2, iM10052 - i2, m10042(i)));
            i2 = m10044(i) + iM10052;
            iM10052 = m10052(bArr, i2, i);
        }
        C3932 c3932M9167 = c3961M9205.m9167();
        return c3932M9167.isEmpty() ? AbstractC3980.m9207("") : c3932M9167;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e3 A[Catch: all -> 0x0115, Exception -> 0x0118, OutOfMemoryError -> 0x011b, TRY_LEAVE, TryCatch #2 {Exception -> 0x0118, OutOfMemoryError -> 0x011b, all -> 0x0115, blocks: (B:91:0x010f, B:99:0x0120, B:106:0x0136, B:108:0x013e, B:116:0x0158, B:125:0x0170, B:136:0x018b, B:143:0x019d, B:149:0x01ac, B:154:0x01c4, B:160:0x01de, B:161:0x01e3), top: B:172:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0206  */
    /* renamed from: ﾞˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p380.AbstractC4424 m10060(int r19, p383.C4457 r20, boolean r21, int r22, p380.InterfaceC4434 r23) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p380.C4437.m10060(int, ᵢᵢ.ˋⁱ, boolean, int, ᵢᴵ.ᐧʻ):ᵢᴵ.ˉי");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2401 m10061(C4520 c4520, ByteBuffer byteBuffer) {
        return m10062(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* renamed from: ˎᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p166.C2401 m10062(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p380.C4437.m10062(int, byte[]):ˊﹶ.ˆᵔ");
    }
}
