package p446;

import com.hierynomus.mssmb2.SMBApiException;
import com.hierynomus.protocol.transport.TransportException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import p018.C1107;
import p018.C1113;
import p078.C1696;
import p283.InterfaceC3379;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p433.C5028;
import ʿﾞ.ﹳﹳ;
import ˈי.ʾˈ;
import ᵔᵔ.ٴˎ;

/* renamed from: ﾞˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5166 extends InputStream {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final InterfaceC3918 f19742 = AbstractC3917.m9105(C5166.class);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C5158 f19743;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public byte[] f19744;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f19745;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f19746 = 0;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f19747 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f19748;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f19749;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C5028 f19750;

    public C5166(C5158 c5158, int i, long j) {
        this.f19743 = c5158;
        this.f19745 = i;
        this.f19748 = j;
    }

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19749 = true;
        this.f19743 = null;
        this.f19744 = null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f19744;
        if (bArr == null || this.f19747 >= bArr.length) {
            m11464();
        }
        if (this.f19749) {
            return -1;
        }
        byte[] bArr2 = this.f19744;
        int i = this.f19747;
        this.f19747 = i + 1;
        return bArr2[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f19744;
        if (bArr2 == null || this.f19747 >= bArr2.length) {
            m11464();
        }
        if (this.f19749) {
            return -1;
        }
        byte[] bArr3 = this.f19744;
        int length = bArr3.length;
        int i3 = this.f19747;
        if (length - i3 <= i2) {
            i2 = bArr3.length - i3;
        }
        System.arraycopy(bArr3, i3, bArr, i, i2);
        this.f19747 += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (this.f19744 == null) {
            this.f19746 += j;
        } else {
            long j2 = this.f19747 + j;
            if (j2 < r0.length) {
                this.f19747 = (int) j2;
            } else {
                this.f19746 = (j2 - r0.length) + this.f19746;
                this.f19744 = null;
                this.f19750 = null;
            }
        }
        return j;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5028 m11463() {
        C5158 c5158 = this.f19743;
        long j = this.f19746;
        C5168 c5168 = c5158.f19732;
        int iMin = Math.min(this.f19745, c5168.f19720);
        return c5168.m11458(new C1107(c5168.f19712, c5158.f19733, c5168.f19710, c5168.f19714, j, iMin));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11464() {
        if (this.f19749) {
            return;
        }
        if (this.f19750 == null) {
            this.f19750 = m11463();
        }
        C5028 c5028 = this.f19750;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ٴˎ r2 = TransportException.f3662;
        C1113 c1113 = (C1113) ʾˈ.ˏᵢ(c5028, this.f19748, timeUnit);
        long j = ((C1696) ((InterfaceC3379) ((ﹳﹳ) c1113).ᐧⁱ)).f6598;
        if (j == 0) {
            this.f19744 = c1113.f4720;
            this.f19747 = 0;
            this.f19746 += c1113.f4719;
        }
        if (j == 3221225489L || c1113.f4719 == 0) {
            f19742.mo5517(Long.valueOf(this.f19746), "EOF, {} bytes read");
            this.f19749 = true;
        } else {
            if (j == 0) {
                this.f19750 = m11463();
                return;
            }
            throw new SMBApiException((C1696) ((InterfaceC3379) ((ﹳﹳ) c1113).ᐧⁱ), "Read failed for " + this);
        }
    }
}
