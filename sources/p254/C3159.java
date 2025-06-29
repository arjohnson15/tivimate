package p254;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p166.AbstractC2426;
import p166.InterfaceC2442;
import p383.AbstractC4470;

/* renamed from: יי.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3159 implements InterfaceC3168 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC2442 f12214;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f12216;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f12217;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f12219;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f12220;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public byte[] f12215 = new byte[65536];

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final byte[] f12218 = new byte[4096];

    static {
        AbstractC2426.m6526("media3.extractor");
    }

    public C3159(InterfaceC2442 interfaceC2442, long j, long j2) {
        this.f12214 = interfaceC2442;
        this.f12217 = j;
        this.f12216 = j2;
    }

    @Override // p254.InterfaceC3168
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo4876(bArr, i, i2, false);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m7825(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        m7827(i2);
        int i3 = this.f12220;
        int i4 = this.f12219;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m7829(this.f12215, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f12220 += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f12215, this.f12219, bArr, i, iMin);
        this.f12219 += iMin;
        return iMin;
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f12220;
        int iM7829 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f12215, 0, bArr, i, iMin);
            m7830(iMin);
            iM7829 = iMin;
        }
        if (iM7829 == 0) {
            iM7829 = m7829(bArr, i, i2, 0, true);
        }
        if (iM7829 != -1) {
            this.f12217 += iM7829;
        }
        return iM7829;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˈٴ */
    public final void mo4853(byte[] bArr, int i, int i2) {
        mo4875(bArr, i, i2, false);
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˉⁱ */
    public final void mo4854(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f12220, i);
        m7830(iMin);
        int iM7829 = iMin;
        while (iM7829 < i && iM7829 != -1) {
            byte[] bArr = this.f12218;
            iM7829 = m7829(bArr, -iM7829, Math.min(i, bArr.length + iM7829), iM7829, false);
        }
        if (iM7829 != -1) {
            this.f12217 += iM7829;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m7826(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f12220, i);
        m7830(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f12218;
            iMin = m7829(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f12217 += iMin;
        }
        return iMin;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˏʾ */
    public final void mo4860() {
        this.f12219 = 0;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ˏᵢ */
    public final long mo4861() {
        return this.f12216;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7827(int i) {
        int i2 = this.f12219 + i;
        byte[] bArr = this.f12215;
        if (i2 > bArr.length) {
            this.f12215 = Arrays.copyOf(this.f12215, AbstractC4470.m10172(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // p254.InterfaceC3168
    /* renamed from: יʻ */
    public final long mo4865() {
        return this.f12217 + this.f12219;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m7828(int i, boolean z) throws EOFException, InterruptedIOException {
        m7827(i);
        int iM7829 = this.f12220 - this.f12219;
        while (iM7829 < i) {
            iM7829 = m7829(this.f12215, this.f12219, i, iM7829, z);
            if (iM7829 == -1) {
                return false;
            }
            this.f12220 = this.f12219 + iM7829;
        }
        this.f12219 += i;
        return true;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m7829(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iMo3679 = this.f12214.mo3679(bArr, i + i3, i2 - i3);
        if (iMo3679 != -1) {
            return i3 + iMo3679;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ᐧˋ */
    public final long mo4869() {
        return this.f12217;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ᐧⁱ */
    public final void mo4870(int i) throws EOFException, InterruptedIOException {
        m7828(i, false);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m7830(int i) {
        int i2 = this.f12220 - i;
        this.f12220 = i2;
        this.f12219 = 0;
        byte[] bArr = this.f12215;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f12215 = bArr2;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ﹳˎ */
    public final boolean mo4875(byte[] bArr, int i, int i2, boolean z) {
        if (!m7828(i2, z)) {
            return false;
        }
        System.arraycopy(this.f12215, this.f12219 - i2, bArr, i, i2);
        return true;
    }

    @Override // p254.InterfaceC3168
    /* renamed from: ﹳﹳ */
    public final boolean mo4876(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f12220;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f12215, 0, bArr, i, iMin);
            m7830(iMin);
        }
        int iM7829 = iMin;
        while (iM7829 < i2 && iM7829 != -1) {
            iM7829 = m7829(bArr, i, i2, iM7829, z);
        }
        if (iM7829 != -1) {
            this.f12217 += iM7829;
        }
        return iM7829 != -1;
    }
}
