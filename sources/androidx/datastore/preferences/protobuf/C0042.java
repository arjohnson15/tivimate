package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import p447.AbstractC5179;

/* renamed from: androidx.datastore.preferences.protobuf.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0042 extends AbstractC0080 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f440;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f441 = Integer.MAX_VALUE;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f442;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final FileInputStream f443;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f444;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f445;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] f446;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f447;

    public C0042(FileInputStream fileInputStream) {
        Charset charset = AbstractC0077.f505;
        this.f443 = fileInputStream;
        this.f446 = new byte[4096];
        this.f440 = 0;
        this.f445 = 0;
        this.f447 = 0;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m436(int i) throws InvalidProtocolBufferException {
        if (m461(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f447) - this.f445) {
            throw InvalidProtocolBufferException.m222();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo437(int i) throws InvalidProtocolBufferException {
        if (this.f442 != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int m438() throws InvalidProtocolBufferException {
        int i = this.f445;
        if (this.f440 - i < 4) {
            m436(4);
            i = this.f445;
        }
        this.f445 = i + 4;
        byte[] bArr = this.f446;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final long mo439() {
        return m450();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String mo440() throws InvalidProtocolBufferException {
        int iM449 = m449();
        byte[] bArr = this.f446;
        if (iM449 > 0) {
            int i = this.f440;
            int i2 = this.f445;
            if (iM449 <= i - i2) {
                String str = new String(bArr, i2, iM449, AbstractC0077.f505);
                this.f445 += iM449;
                return str;
            }
        }
        if (iM449 == 0) {
            return "";
        }
        if (iM449 > this.f440) {
            return new String(m452(iM449), AbstractC0077.f505);
        }
        m436(iM449);
        String str2 = new String(bArr, this.f445, iM449, AbstractC0077.f505);
        this.f445 += iM449;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int mo441() {
        return m449();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int mo442() {
        int iM449 = m449();
        return (-(iM449 & 1)) ^ (iM449 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo443(int i) {
        this.f441 = i;
        m463();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final float mo444() {
        return Float.intBitsToFloat(m438());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String mo445() throws IOException {
        int iM449 = m449();
        int i = this.f445;
        int i2 = this.f440;
        int i3 = i2 - i;
        byte[] bArrM452 = this.f446;
        if (iM449 <= i3 && iM449 > 0) {
            this.f445 = i + iM449;
        } else {
            if (iM449 == 0) {
                return "";
            }
            i = 0;
            if (iM449 <= i2) {
                m436(iM449);
                this.f445 = iM449;
            } else {
                bArrM452 = m452(iM449);
            }
        }
        return AbstractC0073.f497.mo238(bArrM452, i, iM449);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final double mo446() {
        return Double.longBitsToDouble(m450());
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final long m447() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f445 == this.f440) {
                m436(1);
            }
            int i2 = this.f445;
            this.f445 = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f446[i2] & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m220();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean mo448() {
        return m465() != 0;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int m449() {
        int i;
        int i2 = this.f445;
        int i3 = this.f440;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f446;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f445 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f445 = i5;
                return i;
            }
        }
        return (int) m447();
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final long m450() throws InvalidProtocolBufferException {
        int i = this.f445;
        if (this.f440 - i < 8) {
            m436(8);
            i = this.f445;
        }
        this.f445 = i + 8;
        byte[] bArr = this.f446;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: יʻ, reason: contains not printable characters */
    public final int mo451() {
        return m438();
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final byte[] m452(int i) throws IOException {
        byte[] bArrM457 = m457(i);
        if (bArrM457 != null) {
            return bArrM457;
        }
        int i2 = this.f445;
        int i3 = this.f440;
        int length = i3 - i2;
        this.f447 += i3;
        this.f445 = 0;
        this.f440 = 0;
        ArrayList arrayListM471 = m471(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f446, i2, bArr, 0, length);
        Iterator it = arrayListM471.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo453() {
        return this.f447 + this.f445;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo454() {
        return this.f445 == this.f440 && !m461(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int mo455() throws InvalidProtocolBufferException {
        if (mo454()) {
            this.f442 = 0;
            return 0;
        }
        int iM449 = m449();
        this.f442 = iM449;
        if ((iM449 >>> 3) != 0) {
            return iM449;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long mo456() {
        long jM465 = m465();
        return (-(jM465 & 1)) ^ (jM465 >>> 1);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final byte[] m457(int i) throws IOException {
        if (i == 0) {
            return AbstractC0077.f504;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m223();
        }
        int i2 = this.f447;
        int i3 = this.f445;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f441;
        if (i4 > i5) {
            m462((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m222();
        }
        int i6 = this.f440 - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.f443;
        if (i7 >= 4096 && i7 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f446, this.f445, bArr, 0, i6);
        this.f447 += this.f440;
        this.f445 = 0;
        this.f440 = 0;
        while (i6 < i) {
            int i8 = fileInputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw InvalidProtocolBufferException.m222();
            }
            this.f447 += i8;
            i6 += i8;
        }
        return bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int mo458(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m223();
        }
        int i2 = this.f447 + this.f445 + i;
        int i3 = this.f441;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m222();
        }
        this.f441 = i2;
        m463();
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final int mo459() {
        return m449();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C0056 mo460() throws IOException {
        int iM449 = m449();
        int i = this.f440;
        int i2 = this.f445;
        int i3 = i - i2;
        byte[] bArr = this.f446;
        if (iM449 <= i3 && iM449 > 0) {
            C0056 c0056M484 = C0056.m484(bArr, i2, iM449);
            this.f445 += iM449;
            return c0056M484;
        }
        if (iM449 == 0) {
            return C0056.f467;
        }
        byte[] bArrM457 = m457(iM449);
        if (bArrM457 != null) {
            return C0056.m484(bArrM457, 0, bArrM457.length);
        }
        int i4 = this.f445;
        int i5 = this.f440;
        int length = i5 - i4;
        this.f447 += i5;
        this.f445 = 0;
        this.f440 = 0;
        ArrayList arrayListM471 = m471(iM449 - length);
        byte[] bArr2 = new byte[iM449];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        Iterator it = arrayListM471.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0056 c0056 = C0056.f467;
        return new C0056(bArr2);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean m461(int i) throws IOException {
        int i2 = this.f445;
        int i3 = i2 + i;
        int i4 = this.f440;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC5179.m11548(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f447;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.f441) {
            return false;
        }
        byte[] bArr = this.f446;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.f447 += i2;
            this.f440 -= i2;
            this.f445 = 0;
        }
        int i6 = this.f440;
        int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f447) - i6);
        FileInputStream fileInputStream = this.f443;
        int i7 = fileInputStream.read(bArr, i6, iMin);
        if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
            throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        }
        if (i7 <= 0) {
            return false;
        }
        this.f440 += i7;
        m463();
        if (this.f440 >= i) {
            return true;
        }
        return m461(i);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m462(int i) throws InvalidProtocolBufferException {
        int i2 = this.f440;
        int i3 = this.f445;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f445 = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f443;
        if (i < 0) {
            throw InvalidProtocolBufferException.m223();
        }
        int i5 = this.f447;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f441;
        if (i7 > i8) {
            m462((i8 - i5) - i3);
            throw InvalidProtocolBufferException.m222();
        }
        this.f447 = i6;
        this.f440 = 0;
        this.f445 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } finally {
                this.f447 += i4;
                m463();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i9 = this.f440;
        int i10 = i9 - this.f445;
        this.f445 = i9;
        m436(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f440;
            if (i11 <= i12) {
                this.f445 = i11;
                return;
            } else {
                i10 += i12;
                this.f445 = i12;
                m436(1);
            }
        }
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m463() {
        int i = this.f440 + this.f444;
        this.f440 = i;
        int i2 = this.f447 + i;
        int i3 = this.f441;
        if (i2 <= i3) {
            this.f444 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f444 = i4;
        this.f440 = i - i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long mo464() {
        return m465();
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final long m465() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f445;
        int i2 = this.f440;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f446;
            byte b = bArr[i];
            if (b >= 0) {
                this.f445 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f445 = i4;
                return j;
            }
        }
        return m447();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int mo466() {
        return m438();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final long mo467() {
        return m450();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean mo468(int i) throws InvalidProtocolBufferException {
        int iMo455;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f440 - this.f445;
            byte[] bArr = this.f446;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f445;
                    this.f445 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.m220();
            }
            while (i3 < 10) {
                if (this.f445 == this.f440) {
                    m436(1);
                }
                int i6 = this.f445;
                this.f445 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.m220();
            return true;
        }
        if (i2 == 1) {
            m462(8);
            return true;
        }
        if (i2 == 2) {
            m462(m449());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m218();
            }
            m462(4);
            return true;
        }
        do {
            iMo455 = mo455();
            if (iMo455 == 0) {
                break;
            }
        } while (mo468(iMo455));
        mo437(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final long mo469() {
        return m465();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int mo470() {
        return m449();
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ArrayList m471(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f443.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.m222();
                }
                this.f447 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }
}
