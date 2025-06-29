package p362;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p149.HandlerC2291;
import p193.C2705;
import p312.C3583;
import p383.AbstractC4470;
import ـˈ.ˎـ;

/* renamed from: ᵔᵢ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4128 implements InterfaceC4111 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HandlerThread f16001;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2705 f16002;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public HandlerC2291 f16003;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AtomicReference f16004;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final MediaCodec f16005;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f16006;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final ArrayDeque f16000 = new ArrayDeque();

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final Object f15999 = new Object();

    public C4128(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C2705 c2705 = new C2705();
        this.f16005 = mediaCodec;
        this.f16001 = handlerThread;
        this.f16002 = c2705;
        this.f16004 = new AtomicReference();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4119 m9465() {
        ArrayDeque arrayDeque = f16000;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C4119();
                }
                return (C4119) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m9466(C4119 c4119) {
        ArrayDeque arrayDeque = f16000;
        synchronized (arrayDeque) {
            arrayDeque.add(c4119);
        }
    }

    @Override // p362.InterfaceC4111
    public final void flush() {
        if (this.f16006) {
            try {
                HandlerC2291 handlerC2291 = this.f16003;
                handlerC2291.getClass();
                handlerC2291.removeCallbacksAndMessages(null);
                C2705 c2705 = this.f16002;
                c2705.m6870();
                HandlerC2291 handlerC22912 = this.f16003;
                handlerC22912.getClass();
                handlerC22912.obtainMessage(3).sendToTarget();
                synchronized (c2705) {
                    while (!c2705.f10605) {
                        c2705.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p362.InterfaceC4111
    public final void shutdown() {
        if (this.f16006) {
            flush();
            this.f16001.quit();
        }
        this.f16006 = false;
    }

    @Override // p362.InterfaceC4111
    public final void start() {
        if (this.f16006) {
            return;
        }
        HandlerThread handlerThread = this.f16001;
        handlerThread.start();
        this.f16003 = new HandlerC2291(this, handlerThread.getLooper(), 2);
        this.f16006 = true;
    }

    @Override // p362.InterfaceC4111
    /* renamed from: ʿʼ */
    public final void mo9426(Bundle bundle) {
        mo9429();
        HandlerC2291 handlerC2291 = this.f16003;
        int i = AbstractC4470.f17202;
        handlerC2291.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p362.InterfaceC4111
    /* renamed from: ـﹶ */
    public final void mo9427(int i, C3583 c3583, long j, int i2) {
        mo9429();
        C4119 c4119M9465 = m9465();
        c4119M9465.f15910 = i;
        c4119M9465.f15907 = 0;
        c4119M9465.f15911 = j;
        c4119M9465.f15908 = i2;
        int i3 = c3583.f13779;
        MediaCodec.CryptoInfo cryptoInfo = c4119M9465.f15909;
        cryptoInfo.numSubSamples = i3;
        int[] iArr = c3583.f13781;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c3583.f13774;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c3583.f13773;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c3583.f13778;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c3583.f13777;
        if (AbstractC4470.f17202 >= 24) {
            ˎـ.ˉⁱ();
            ˎـ.ˎٴ(cryptoInfo, ˎـ.ᐧʻ(c3583.f13780, c3583.f13776));
        }
        this.f16003.obtainMessage(2, c4119M9465).sendToTarget();
    }

    @Override // p362.InterfaceC4111
    /* renamed from: ᐧʻ */
    public final void mo9428(int i, int i2, long j, int i3) {
        mo9429();
        C4119 c4119M9465 = m9465();
        c4119M9465.f15910 = i;
        c4119M9465.f15907 = i2;
        c4119M9465.f15911 = j;
        c4119M9465.f15908 = i3;
        HandlerC2291 handlerC2291 = this.f16003;
        int i4 = AbstractC4470.f17202;
        handlerC2291.obtainMessage(1, c4119M9465).sendToTarget();
    }

    @Override // p362.InterfaceC4111
    /* renamed from: ﹶˆ */
    public final void mo9429() {
        RuntimeException runtimeException = (RuntimeException) this.f16004.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
