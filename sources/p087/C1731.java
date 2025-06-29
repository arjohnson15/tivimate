package p087;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.StringTokenizer;
import p091.C1752;
import p117.AbstractC1841;
import p201.C2760;
import p201.C2762;
import p334.C3789;
import p419.C4851;
import p419.C4852;
import p419.C4853;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʿᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1731 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f6739;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1731(ˈˉ.ﹳﹳ r1, int i) {
        super(r1);
        this.f6739 = i;
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public static void m5453(C1737 c1737) {
        String str = c1737.f6745;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        byteArrayOutputStream.write((Integer.parseInt(stringTokenizer.nextToken()) * 40) + Integer.parseInt(stringTokenizer.nextToken()));
        while (stringTokenizer.hasMoreTokens()) {
            BigInteger bigInteger = new BigInteger(stringTokenizer.nextToken());
            if (bigInteger.intValue() <= 0 || bigInteger.intValue() >= 127) {
                for (int iBitLength = ((bigInteger.bitLength() / 7) + (bigInteger.bitLength() % 7 > 0 ? 1 : 0)) - 1; iBitLength >= 0; iBitLength--) {
                    byte bByteValue = (byte) (bigInteger.shiftRight(iBitLength * 7).byteValue() & Byte.MAX_VALUE);
                    if (iBitLength > 0) {
                        bByteValue = (byte) (bByteValue | 128);
                    }
                    byteArrayOutputStream.write(bByteValue);
                }
            } else {
                byteArrayOutputStream.write(bigInteger.intValue());
            }
        }
        c1737.f6741 = byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m5454(AbstractC1841 abstractC1841) throws IOException {
        switch (this.f6739) {
            case 0:
                return 1;
            case 1:
                C1738 c1738 = (C1738) abstractC1841;
                if (c1738.f6741 == null) {
                    c1738.f6741 = c1738.f6746.toByteArray();
                }
                return c1738.f6741.length;
            case 2:
                return ((C1732) abstractC1841).f6741.length;
            case 3:
                return 0;
            case 4:
                C1737 c1737 = (C1737) abstractC1841;
                if (c1737.f6741 == null) {
                    m5453(c1737);
                }
                return c1737.f6741.length;
            case 5:
                return ((C2762) abstractC1841).f10792.length + 1;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C2760) abstractC1841).f10792.length;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C4853 c4853 = (C4853) abstractC1841;
                if (c4853.f18354 == null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C1752 c1752 = new C1752((ˈˉ.ﹳﹳ) ((ﹳﹳ) this).ᐧⁱ, byteArrayOutputStream);
                    Iterator it = c4853.iterator();
                    while (it.hasNext()) {
                        c1752.m5468((AbstractC1841) it.next());
                    }
                    c4853.f18354 = byteArrayOutputStream.toByteArray();
                }
                return c4853.f18354.length;
            case 8:
                C4851 c4851 = (C4851) abstractC1841;
                if (c4851.f18348 == null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    C1752 c17522 = new C1752((ˈˉ.ﹳﹳ) ((ﹳﹳ) this).ᐧⁱ, byteArrayOutputStream2);
                    Iterator it2 = c4851.iterator();
                    while (it2.hasNext()) {
                        c17522.m5468((AbstractC1841) it2.next());
                    }
                    c4851.f18348 = byteArrayOutputStream2.toByteArray();
                }
                return c4851.f18348.length;
            default:
                C4852 c4852 = (C4852) abstractC1841;
                if (c4852.f18351 == null) {
                    m5456(c4852);
                }
                return c4852.f18351.length;
        }
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final void m5455(AbstractC1841 abstractC1841, C1752 c1752) throws IOException {
        switch (this.f6739) {
            case 0:
                c1752.write(((C1734) abstractC1841).f6742 ? 1 : 0);
                break;
            case 1:
                C1738 c1738 = (C1738) abstractC1841;
                if (c1738.f6741 == null) {
                    c1738.f6741 = c1738.f6746.toByteArray();
                }
                c1752.write(c1738.f6741);
                break;
            case 2:
                c1752.write(((C1732) abstractC1841).f6741);
                break;
            case 3:
                break;
            case 4:
                C1737 c1737 = (C1737) abstractC1841;
                if (c1737.f6741 == null) {
                    m5453(c1737);
                }
                c1752.write(c1737.f6741);
                break;
            case 5:
                C2762 c2762 = (C2762) abstractC1841;
                c1752.write(c2762.f10793);
                c1752.write(c2762.f10792);
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                c1752.write(((C2760) abstractC1841).f10792);
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C4853 c4853 = (C4853) abstractC1841;
                byte[] bArr = c4853.f18354;
                if (bArr == null) {
                    Iterator it = c4853.iterator();
                    while (it.hasNext()) {
                        c1752.m5468((AbstractC1841) it.next());
                    }
                    break;
                } else {
                    c1752.write(bArr);
                    break;
                }
            case 8:
                C4851 c4851 = (C4851) abstractC1841;
                byte[] bArr2 = c4851.f18348;
                if (bArr2 == null) {
                    Iterator it2 = c4851.iterator();
                    while (it2.hasNext()) {
                        c1752.m5468((AbstractC1841) it2.next());
                    }
                    break;
                } else {
                    c1752.write(bArr2);
                    break;
                }
            default:
                C4852 c4852 = (C4852) abstractC1841;
                if (c4852.f18351 == null) {
                    m5456(c4852);
                }
                c1752.write(c4852.f18351);
                break;
        }
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public void m5456(C4852 c4852) throws IOException {
        AbstractC1841 abstractC1841 = c4852.f18349;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ˈˉ.ﹳﹳ r3 = (ˈˉ.ﹳﹳ) ((ﹳﹳ) this).ᐧⁱ;
        C1752 c1752 = new C1752(r3, byteArrayOutputStream);
        try {
            if (c4852.f18350) {
                c1752.m5468(abstractC1841);
            } else {
                abstractC1841.f7065.mo5605(r3).ᵢᵢ(abstractC1841, c1752);
            }
            c4852.f18351 = byteArrayOutputStream.toByteArray();
            c1752.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c1752.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
