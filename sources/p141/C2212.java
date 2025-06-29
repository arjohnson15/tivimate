package p141;

import android.net.Uri;
import android.support.v4.media.session.AbstractC0002;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0863;
import p000.C0882;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˉˑ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2212 extends AbstractC0863 implements InterfaceC2215 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final LinkedBlockingQueue f8760;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f8761;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final long f8762;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public byte[] f8763;

    public C2212() {
        super(true);
        this.f8762 = 8000L;
        this.f8760 = new LinkedBlockingQueue();
        this.f8763 = new byte[0];
        this.f8761 = -1;
    }

    @Override // p000.InterfaceC0875
    public final void close() {
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String mo6175() {
        AbstractC4464.m10132(this.f8761 != -1);
        int i = this.f8761;
        int i2 = this.f8761 + 1;
        int i3 = AbstractC4470.f17202;
        Locale locale = Locale.US;
        return AbstractC0002.m55(i, i2, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f8763.length);
        System.arraycopy(this.f8763, 0, bArr, i, iMin);
        byte[] bArr2 = this.f8763;
        this.f8763 = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i2) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f8760.poll(this.f8762, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i2 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f8763 = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) {
        this.f8761 = c0882.f4004.getPort();
        return -1L;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return null;
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo6176() {
        return this.f8761;
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean mo6177() {
        return false;
    }

    @Override // p141.InterfaceC2215
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final C2212 mo6178() {
        return this;
    }
}
