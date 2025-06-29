package p379;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p158.AbstractC2339;
import p366.C4143;
import p366.C4151;
import p366.C4155;
import p366.InterfaceC4161;
import p366.InterfaceC4163;

/* renamed from: ᵢᐧ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4415 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f17030;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f17031;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f17032;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f17033;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4161 f17034;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f17035;

    public C4415(InterfaceC4161 interfaceC4161) {
        this.f17034 = interfaceC4161;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f17031;
            InterfaceC4161 interfaceC4161 = this.f17034;
            if (i3 != 0) {
                long jMo4577 = interfaceC4161.mo4577(c4143, Math.min(8192L, i3));
                if (jMo4577 == -1) {
                    return -1L;
                }
                this.f17031 -= (int) jMo4577;
                return jMo4577;
            }
            interfaceC4161.skip(this.f17035);
            this.f17035 = 0;
            if ((this.f17032 & 4) != 0) {
                return -1L;
            }
            i = this.f17033;
            int iM6434 = AbstractC2339.m6434(interfaceC4161);
            this.f17031 = iM6434;
            this.f17030 = iM6434;
            int i4 = interfaceC4161.readByte() & 255;
            this.f17032 = interfaceC4161.readByte() & 255;
            Logger logger = C4403.f16961;
            if (logger.isLoggable(Level.FINE)) {
                C4155 c4155 = AbstractC4397.f16936;
                logger.fine(AbstractC4397.m9987(true, this.f17033, this.f17030, i4, this.f17032));
            }
            i2 = interfaceC4161.readInt() & Integer.MAX_VALUE;
            this.f17033 = i2;
            if (i4 != 9) {
                throw new IOException(i4 + " != TYPE_CONTINUATION");
            }
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return this.f17034.mo8177();
    }
}
