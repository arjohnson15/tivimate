package p379;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p080.AbstractC1702;
import p158.AbstractC2339;
import p366.C4143;
import p366.InterfaceC4160;
import ـˈ.ˉᵎ;

/* renamed from: ᵢᐧ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4421 implements Closeable {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final Logger f17053 = Logger.getLogger(AbstractC4397.class.getName());

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4143 f17054;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4407 f17055;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f17056;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f17057;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4160 f17058;

    public C4421(InterfaceC4160 interfaceC4160) {
        this.f17058 = interfaceC4160;
        C4143 c4143 = new C4143();
        this.f17054 = c4143;
        this.f17056 = 16384;
        this.f17055 = new C4407(c4143);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17057 = true;
        this.f17058.close();
    }

    public final synchronized void flush() {
        if (this.f17057) {
            throw new IOException("closed");
        }
        this.f17058.flush();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m10029(boolean z, int i, C4143 c4143, int i2) {
        if (this.f17057) {
            throw new IOException("closed");
        }
        m10034(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.f17058.mo4566(c4143, i2);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m10030(boolean z, int i, ArrayList arrayList) {
        if (this.f17057) {
            throw new IOException("closed");
        }
        this.f17055.m10014(arrayList);
        long j = this.f17054.f16041;
        long jMin = Math.min(this.f17056, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m10034(i, (int) jMin, 1, i2);
        this.f17058.mo4566(this.f17054, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.f17056, j2);
                j2 -= jMin2;
                m10034(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.f17058.mo4566(this.f17054, jMin2);
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final synchronized void m10031(C4417 c4417) {
        try {
            if (this.f17057) {
                throw new IOException("closed");
            }
            m10034(0, Integer.bitCount(c4417.f17043) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                boolean z = true;
                if (((1 << i) & c4417.f17043) == 0) {
                    z = false;
                }
                if (z) {
                    this.f17058.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f17058.writeInt(c4417.f17042[i]);
                }
                i++;
            }
            this.f17058.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final synchronized void m10032(int i, int i2) {
        if (this.f17057) {
            throw new IOException("closed");
        }
        if (AbstractC1702.m5411(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m10034(i, 4, 3, 0);
        this.f17058.writeInt(AbstractC1702.m5411(i2));
        this.f17058.flush();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized void m10033(int i, boolean z, int i2) {
        if (this.f17057) {
            throw new IOException("closed");
        }
        m10034(0, 8, 6, z ? 1 : 0);
        this.f17058.writeInt(i);
        this.f17058.writeInt(i2);
        this.f17058.flush();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10034(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f17053;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC4397.m9987(false, i, i2, i3, i4));
        }
        if (i2 > this.f17056) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f17056 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("reserved bit set: ", i).toString());
        }
        byte[] bArr = AbstractC2339.f9301;
        InterfaceC4160 interfaceC4160 = this.f17058;
        interfaceC4160.writeByte((i2 >>> 16) & 255);
        interfaceC4160.writeByte((i2 >>> 8) & 255);
        interfaceC4160.writeByte(i2 & 255);
        interfaceC4160.writeByte(i3 & 255);
        interfaceC4160.writeByte(i4 & 255);
        interfaceC4160.writeInt(i & Integer.MAX_VALUE);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m10035(C4417 c4417) {
        try {
            if (this.f17057) {
                throw new IOException("closed");
            }
            int i = this.f17056;
            int i2 = c4417.f17043;
            if ((i2 & 32) != 0) {
                i = c4417.f17042[5];
            }
            this.f17056 = i;
            if (((i2 & 2) != 0 ? c4417.f17042[1] : -1) != -1) {
                C4407 c4407 = this.f17055;
                int iMin = Math.min((i2 & 2) != 0 ? c4417.f17042[1] : -1, 16384);
                int i3 = c4407.f16981;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        c4407.f16983 = Math.min(c4407.f16983, iMin);
                    }
                    c4407.f16987 = true;
                    c4407.f16981 = iMin;
                    int i4 = c4407.f16988;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            C4410[] c4410Arr = c4407.f16985;
                            Arrays.fill(c4410Arr, 0, c4410Arr.length, (Object) null);
                            c4407.f16986 = c4407.f16985.length - 1;
                            c4407.f16982 = 0;
                            c4407.f16988 = 0;
                        } else {
                            c4407.m10013(i4 - iMin);
                        }
                    }
                }
            }
            m10034(0, 0, 4, 1);
            this.f17058.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final synchronized void m10036(int i, long j) {
        if (this.f17057) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m10034(i, 4, 8, 0);
        this.f17058.writeInt((int) j);
        this.f17058.flush();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized void m10037(byte[] bArr, int i, int i2) {
        if (this.f17057) {
            throw new IOException("closed");
        }
        if (AbstractC1702.m5411(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m10034(0, bArr.length + 8, 7, 0);
        this.f17058.writeInt(i);
        this.f17058.writeInt(AbstractC1702.m5411(i2));
        if (bArr.length != 0) {
            this.f17058.write(bArr);
        }
        this.f17058.flush();
    }
}
