package p362;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p061.C1423;
import p438.C5096;

/* renamed from: ᵔᵢ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4109 extends MediaCodec.Callback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HandlerThread f15882;

    /* renamed from: ˉי, reason: contains not printable characters */
    public MediaCodec.CodecException f15884;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f15885;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f15886;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public MediaCodec.CryptoException f15887;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C4117 f15888;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public MediaFormat f15889;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Handler f15890;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public IllegalStateException f15894;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public MediaFormat f15896;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f15891 = new Object();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1423 f15895 = new C1423();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1423 f15883 = new C1423();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayDeque f15892 = new ArrayDeque();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayDeque f15893 = new ArrayDeque();

    public C4109(HandlerThread handlerThread) {
        this.f15882 = handlerThread;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f15891) {
            this.f15887 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f15891) {
            this.f15884 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C5096 c5096;
        synchronized (this.f15891) {
            this.f15895.m4928(i);
            C4117 c4117 = this.f15888;
            if (c4117 != null && (c5096 = c4117.f15906.f15971) != null) {
                c5096.m11296();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        C5096 c5096;
        synchronized (this.f15891) {
            try {
                MediaFormat mediaFormat = this.f15896;
                if (mediaFormat != null) {
                    this.f15883.m4928(-2);
                    this.f15893.add(mediaFormat);
                    this.f15896 = null;
                }
                this.f15883.m4928(i);
                this.f15892.add(bufferInfo);
                C4117 c4117 = this.f15888;
                if (c4117 != null && (c5096 = c4117.f15906.f15971) != null) {
                    c5096.m11296();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f15891) {
            this.f15883.m4928(-2);
            this.f15893.add(mediaFormat);
            this.f15896 = null;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9424(IllegalStateException illegalStateException) {
        synchronized (this.f15891) {
            this.f15894 = illegalStateException;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9425() {
        ArrayDeque arrayDeque = this.f15893;
        if (!arrayDeque.isEmpty()) {
            this.f15896 = (MediaFormat) arrayDeque.getLast();
        }
        C1423 c1423 = this.f15895;
        c1423.f5794 = c1423.f5793;
        C1423 c14232 = this.f15883;
        c14232.f5794 = c14232.f5793;
        this.f15892.clear();
        arrayDeque.clear();
    }
}
