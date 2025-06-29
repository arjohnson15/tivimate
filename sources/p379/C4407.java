package p379;

import java.io.EOFException;
import java.util.Arrays;
import p158.AbstractC2339;
import p366.C4143;
import p366.C4155;

/* renamed from: ᵢᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4407 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4143 f16980;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f16982;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f16987;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f16988;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f16984 = true;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f16983 = Integer.MAX_VALUE;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f16981 = 4096;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4410[] f16985 = new C4410[8];

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f16986 = 7;

    public C4407(C4143 c4143) {
        this.f16980 = c4143;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10010(C4410 c4410) {
        int i = this.f16981;
        int i2 = c4410.f16997;
        if (i2 > i) {
            C4410[] c4410Arr = this.f16985;
            Arrays.fill(c4410Arr, 0, c4410Arr.length, (Object) null);
            this.f16986 = this.f16985.length - 1;
            this.f16982 = 0;
            this.f16988 = 0;
            return;
        }
        m10013((this.f16988 + i2) - i);
        int i3 = this.f16982 + 1;
        C4410[] c4410Arr2 = this.f16985;
        if (i3 > c4410Arr2.length) {
            C4410[] c4410Arr3 = new C4410[c4410Arr2.length * 2];
            System.arraycopy(c4410Arr2, 0, c4410Arr3, c4410Arr2.length, c4410Arr2.length);
            this.f16986 = this.f16985.length - 1;
            this.f16985 = c4410Arr3;
        }
        int i4 = this.f16986;
        this.f16986 = i4 - 1;
        this.f16985[i4] = c4410;
        this.f16982++;
        this.f16988 += i2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10011(int i, int i2, int i3) {
        C4143 c4143 = this.f16980;
        if (i < i2) {
            c4143.m9509(i | i3);
            return;
        }
        c4143.m9509(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c4143.m9509(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c4143.m9509(i4);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10012(C4155 c4155) throws EOFException {
        C4143 c4143 = this.f16980;
        if (this.f16984) {
            int[] iArr = AbstractC4420.f17052;
            int iMo9566 = c4155.mo9566();
            long j = 0;
            for (int i = 0; i < iMo9566; i++) {
                byte bMo9565 = c4155.mo9565(i);
                byte[] bArr = AbstractC2339.f9301;
                j += AbstractC4420.f17050[bMo9565 & 255];
            }
            if (((int) ((j + 7) >> 3)) < c4155.mo9566()) {
                C4143 c41432 = new C4143();
                int[] iArr2 = AbstractC4420.f17052;
                int iMo95662 = c4155.mo9566();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < iMo95662; i3++) {
                    byte bMo95652 = c4155.mo9565(i3);
                    byte[] bArr2 = AbstractC2339.f9301;
                    int i4 = bMo95652 & 255;
                    int i5 = AbstractC4420.f17052[i4];
                    byte b = AbstractC4420.f17050[i4];
                    j2 = (j2 << b) | i5;
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        c41432.m9509((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    c41432.m9509((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                C4155 c4155Mo9522 = c41432.mo9522(c41432.f16041);
                m10011(c4155Mo9522.mo9566(), 127, 128);
                c4155Mo9522.mo9567(c4143, c4155Mo9522.mo9566());
                return;
            }
        }
        m10011(c4155.mo9566(), 127, 0);
        c4155.mo9567(c4143, c4155.mo9566());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10013(int i) {
        int i2;
        if (i > 0) {
            int length = this.f16985.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f16986;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f16985[length].f16997;
                i -= i4;
                this.f16988 -= i4;
                this.f16982--;
                i3++;
                length--;
            }
            C4410[] c4410Arr = this.f16985;
            int i5 = i2 + 1;
            System.arraycopy(c4410Arr, i5, c4410Arr, i5 + i3, this.f16982);
            C4410[] c4410Arr2 = this.f16985;
            int i6 = this.f16986 + 1;
            Arrays.fill(c4410Arr2, i6, i6 + i3, (Object) null);
            this.f16986 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10014(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C4407.m10014(java.util.ArrayList):void");
    }
}
