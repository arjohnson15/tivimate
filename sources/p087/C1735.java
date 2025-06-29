package p087;

import com.hierynomus.asn1.ASN1ParseException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import p091.C1751;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p117.EnumC1844;
import p201.C2760;
import p201.C2762;
import p334.C3789;
import p419.C4851;
import p419.C4852;
import p419.C4853;
import ʿﾞ.ﹳﹳ;
import ـˈ.ˉᵎ;
import ﹳᴵ.ˉי;

/* renamed from: ʿᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1735 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f6743;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1735(ˉי r1, int i) {
        super(r1);
        this.f6743 = i;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final AbstractC1841 m5458(AbstractC1845 abstractC1845, byte[] bArr) throws IOException {
        int i;
        C1751 c1751;
        switch (this.f6743) {
            case 0:
                boolean z = bArr.length == 1;
                int length = bArr.length;
                if (!z) {
                    throw new IllegalStateException(ˉᵎ.ˉⁱ("Value of ASN1Boolean should have length 1, but was ", length));
                }
                boolean z2 = bArr[0] != 0;
                C1734 c1734 = new C1734(AbstractC1845.f7078, bArr);
                c1734.f6742 = z2;
                return c1734;
            case 1:
                return new C1738(new BigInteger(bArr), bArr);
            case 2:
                BigInteger bigInteger = new BigInteger(bArr);
                C1732 c1732 = new C1732(AbstractC1845.f7079, bArr);
                c1732.f6740 = bigInteger;
                return c1732;
            case 3:
                if (bArr.length == 0) {
                    return new C1736(AbstractC1845.f7080, C1736.f6744);
                }
                throw new IllegalStateException("ASN.1 NULL can not have a value");
            case 4:
                if (bArr.length <= 0) {
                    throw new IllegalArgumentException("An ASN.1 OBJECT IDENTIFIER should have at least a one byte value");
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                StringBuilder sb = new StringBuilder();
                int i2 = byteArrayInputStream.read();
                sb.append(i2 / 40);
                sb.append('.');
                sb.append(i2 % 40);
                while (byteArrayInputStream.available() > 0) {
                    int i3 = byteArrayInputStream.read();
                    if (i3 < 127) {
                        sb.append('.');
                        sb.append(i3);
                    } else {
                        BigInteger bigIntegerValueOf = BigInteger.valueOf(i3 & 127);
                        do {
                            i = byteArrayInputStream.read();
                            bigIntegerValueOf = bigIntegerValueOf.shiftLeft(7).add(BigInteger.valueOf(i & 127));
                        } while (i > 127);
                        sb.append('.');
                        sb.append(bigIntegerValueOf);
                    }
                }
                String string = sb.toString();
                C1737 c1737 = new C1737(AbstractC1845.f7073, bArr);
                c1737.f6745 = string;
                return c1737;
            case 5:
                if (abstractC1845.f7084 != EnumC1844.f7069) {
                    return new C2762(abstractC1845, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0]);
                }
                try {
                    c1751 = new C1751((ˉי) ((ﹳﹳ) this).ᐧⁱ, bArr);
                    ˉי r11 = c1751.f6783;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte b = 0;
                        while (c1751.available() > 0) {
                            r11.getClass();
                            AbstractC1845 abstractC18452 = ˉי.ˎˑ(c1751);
                            Object[] objArr = {abstractC18452};
                            if (!(abstractC18452.f7081 == abstractC1845.f7081)) {
                                throw new IllegalStateException(String.format("Expected an ASN.1 BIT STRING as Constructed object, got: %s", objArr));
                            }
                            byte[] bArr2 = ˉי.ᐧˋ(ˉי.ˆʿ(c1751), c1751);
                            byteArrayOutputStream.write(bArr2, 1, bArr2.length - 1);
                            if (c1751.available() <= 0) {
                                b = bArr2[0];
                            }
                        }
                        C2762 c2762 = new C2762(abstractC1845, byteArrayOutputStream.toByteArray(), b);
                        c1751.close();
                        return c2762;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                            try {
                                c1751.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new ASN1ParseException(e, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
                }
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C2760(abstractC1845, bArr);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                ArrayList arrayList = new ArrayList();
                try {
                    C1751 c17512 = new C1751((ˉי) ((ﹳﹳ) this).ᐧⁱ, bArr);
                    while (true) {
                        try {
                            try {
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } finally {
                                    try {
                                        c17512.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                            }
                        } catch (IOException unused) {
                        }
                        boolean z3 = c17512.available() > 0;
                        if (!z3) {
                            c17512.close();
                            return new C4853(arrayList, bArr);
                        }
                        try {
                            arrayList.add(c17512.m5467());
                        } catch (Exception e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                } catch (IOException e3) {
                    throw new ASN1ParseException(e3, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
                }
            case 8:
                HashSet hashSet = new HashSet();
                try {
                    c1751 = new C1751((ˉי) ((ﹳﹳ) this).ᐧⁱ, bArr);
                    while (true) {
                        try {
                            try {
                            } finally {
                            }
                        } catch (IOException unused2) {
                        }
                        boolean z4 = c1751.available() > 0;
                        if (!z4) {
                            c1751.close();
                            return new C4851(hashSet, bArr);
                        }
                        try {
                            hashSet.add(c1751.m5467());
                        } catch (Exception e4) {
                            throw new NoSuchElementException(e4.getMessage());
                        }
                    }
                } catch (IOException e5) {
                    throw new ASN1ParseException(e5, "Could not parse ASN.1 SET contents.", new Object[0]);
                }
            default:
                return new C4852(abstractC1845, bArr, (ˉי) ((ﹳﹳ) this).ᐧⁱ);
        }
    }
}
