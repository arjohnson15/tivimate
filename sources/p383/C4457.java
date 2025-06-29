package p383;

import java.nio.charset.Charset;
import java.util.Arrays;
import p345.AbstractC3985;
import p353.AbstractC4010;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵢᵢ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4457 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f17169;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f17170;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public byte[] f17171;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final char[] f17168 = {'\r', '\n'};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final char[] f17166 = {'\n'};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final AbstractC3985 f17167 = AbstractC3985.m9215(5, AbstractC4010.f15451, AbstractC4010.f15450, AbstractC4010.f15452, AbstractC4010.f15453, AbstractC4010.f15449);

    public C4457() {
        this.f17171 = AbstractC4470.f17203;
    }

    public C4457(int i) {
        this.f17171 = new byte[i];
        this.f17170 = i;
    }

    public C4457(int i, byte[] bArr) {
        this.f17171 = bArr;
        this.f17170 = i;
    }

    public C4457(byte[] bArr) {
        this.f17171 = bArr;
        this.f17170 = bArr.length;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10077(int i) {
        byte[] bArr = this.f17171;
        if (i > bArr.length) {
            this.f17171 = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m10078() {
        return this.f17171[this.f17169] & 255;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m10079() {
        return (m10086() << 21) | (m10086() << 14) | (m10086() << 7) | m10086();
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long m10080() {
        int i;
        int i2;
        long j = this.f17171[this.f17169];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException(ᵎˏ.ˏᴵ("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i = 1; i < i2; i++) {
            if ((this.f17171[this.f17169 + i] & 192) != 128) {
                throw new NumberFormatException(ᵎˏ.ˏᴵ("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f17169 += i2;
        return j;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m10081(int i, byte[] bArr) {
        this.f17171 = bArr;
        this.f17170 = i;
        this.f17169 = 0;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final long m10082() {
        long jM10094 = m10094();
        if (jM10094 >= 0) {
            return jM10094;
        }
        throw new IllegalStateException(ᵎˏ.ˏᴵ("Top bit not zero: ", jM10094));
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int m10083() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f17169 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f17169 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f17169 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final short m10084() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = bArr[i] & 255;
        this.f17169 = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m10085(int i) {
        m10108(this.f17169 + i);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final int m10086() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        this.f17169 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final long m10087() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        this.f17169 = i + 1;
        this.f17169 = i + 2;
        this.f17169 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f17169 = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Charset m10088() {
        if (m10096() >= 3) {
            byte[] bArr = this.f17171;
            int i = this.f17169;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f17169 = i + 3;
                return AbstractC4010.f15450;
            }
        }
        if (m10096() < 2) {
            return null;
        }
        byte[] bArr2 = this.f17171;
        int i2 = this.f17169;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f17169 = i2 + 2;
            return AbstractC4010.f15453;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f17169 = i2 + 2;
        return AbstractC4010.f15449;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final String m10089(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f17169;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f17170 || this.f17171[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f17171;
        int i5 = AbstractC4470.f17202;
        String str = new String(bArr, i2, i4, AbstractC4010.f15450);
        this.f17169 += i;
        return str;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final long m10090() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        this.f17169 = i + 1;
        this.f17169 = i + 2;
        this.f17169 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f17169 = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.f17169 = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.f17169 = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.f17169 = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.f17169 = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int m10091() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = bArr[i] & 255;
        this.f17169 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int m10092() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f17169 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f17169 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f17169 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final char m10093(Charset charset) {
        AbstractC4464.m10124("Unsupported charset: " + charset, f17167.contains(charset));
        return (char) (m10107(charset) >> 16);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final long m10094() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        this.f17169 = i + 1;
        this.f17169 = i + 2;
        this.f17169 = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f17169 = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.f17169 = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.f17169 = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.f17169 = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.f17169 = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int m10095() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f17169 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f17169 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m10096() {
        return this.f17170 - this.f17169;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m10097(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f17171, this.f17169, bArr, i, i2);
        this.f17169 += i2;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final char m10098(Charset charset, char[] cArr) {
        int iM10107 = m10107(charset);
        if (iM10107 != 0) {
            char c = (char) (iM10107 >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.f17169 += iM10107 & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m10099(int i) {
        byte[] bArr = this.f17171;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m10081(i, bArr);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int m10100() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f17169 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int m10101() {
        int iM10083 = m10083();
        if (iM10083 >= 0) {
            return iM10083;
        }
        throw new IllegalStateException(ˉᵎ.ˉⁱ("Top bit not zero: ", iM10083));
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final short m10102() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f17169 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final String m10103() {
        if (m10096() == 0) {
            return null;
        }
        int i = this.f17169;
        while (i < this.f17170 && this.f17171[i] != 0) {
            i++;
        }
        byte[] bArr = this.f17171;
        int i2 = this.f17169;
        int i3 = AbstractC4470.f17202;
        String str = new String(bArr, i2, i - i2, AbstractC4010.f15450);
        this.f17169 = i;
        if (i < this.f17170) {
            this.f17169 = i + 1;
        }
        return str;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10104(int i) {
        AbstractC4464.m10142(i >= 0 && i <= this.f17171.length);
        this.f17170 = i;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String m10105(int i, Charset charset) {
        String str = new String(this.f17171, this.f17169, i, charset);
        this.f17169 += i;
        return str;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final int m10106() {
        int iM10092 = m10092();
        if (iM10092 >= 0) {
            return iM10092;
        }
        throw new IllegalStateException(ˉᵎ.ˉⁱ("Top bit not zero: ", iM10092));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m10107(Charset charset) {
        byte b;
        int i;
        byte b2;
        byte b3;
        if ((charset.equals(AbstractC4010.f15450) || charset.equals(AbstractC4010.f15451)) && m10096() >= 1) {
            long j = this.f17171[this.f17169] & 255;
            char c = (char) j;
            ـﹶ.ٴˎ(j, "Out of range: %s", ((long) c) == j);
            b = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(AbstractC4010.f15452) || charset.equals(AbstractC4010.f15453)) && m10096() >= 2) {
                byte[] bArr = this.f17171;
                int i2 = this.f17169;
                b2 = bArr[i2];
                b3 = bArr[i2 + 1];
            } else {
                if (!charset.equals(AbstractC4010.f15449) || m10096() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f17171;
                int i3 = this.f17169;
                b2 = bArr2[i3 + 1];
                b3 = bArr2[i3];
            }
            b = (byte) ((char) ((b3 & 255) | (b2 << 8)));
        }
        long j2 = b;
        char c2 = (char) j2;
        ـﹶ.ٴˎ(j2, "Out of range: %s", ((long) c2) == j2);
        return (c2 << 16) + i;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m10108(int i) {
        AbstractC4464.m10142(i >= 0 && i <= this.f17170);
        this.f17169 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m10109(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            ᵎᴵ.ﾞᐧ r0 = p383.C4457.f17167
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            p383.AbstractC4464.m10124(r1, r0)
            int r0 = r4.m10096()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = p353.AbstractC4010.f15451
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.m10088()
        L2a:
            java.nio.charset.Charset r1 = p353.AbstractC4010.f15450
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = p353.AbstractC4010.f15452
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = p353.AbstractC4010.f15449
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = p353.AbstractC4010.f15453
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L64:
            r0 = 2
            goto L67
        L66:
            r0 = 1
        L67:
            int r1 = r4.f17169
        L69:
            int r2 = r4.f17170
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = p353.AbstractC4010.f15450
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = p353.AbstractC4010.f15451
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.f17171
            r2 = r2[r1]
            boolean r2 = p383.AbstractC4470.m10208(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = p353.AbstractC4010.f15452
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = p353.AbstractC4010.f15453
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.f17171
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = p383.AbstractC4470.m10208(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = p353.AbstractC4010.f15449
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.f17171
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = p383.AbstractC4470.m10208(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.f17169
            int r1 = r1 - r0
            java.lang.String r0 = r4.m10105(r1, r5)
            int r1 = r4.f17169
            int r2 = r4.f17170
            if (r1 != r2) goto Ld7
            return r0
        Ld7:
            char[] r1 = p383.C4457.f17168
            char r1 = r4.m10098(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = p383.C4457.f17166
            r4.m10098(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p383.C4457.m10109(java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final long m10110() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        this.f17169 = i + 1;
        this.f17169 = i + 2;
        this.f17169 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f17169 = i + 4;
        return (bArr[r4] & 255) | j;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int m10111() {
        byte[] bArr = this.f17171;
        int i = this.f17169;
        int i2 = i + 1;
        this.f17169 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f17169 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f17169 = i + 4;
        return i4;
    }
}
