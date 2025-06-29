package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import p166.C2431;
import p312.AbstractC3584;
import p312.AbstractC3587;
import p312.C3589;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends AbstractC3587 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public volatile int f1345;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public volatile int f1346;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f1347;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final String f1348;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final byte[] f1349;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public long f1350;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int f1351;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f1352;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FfmpegAudioDecoder(int i, C2431 c2431, boolean z) throws FfmpegDecoderException {
        List list;
        byte[] bArr;
        byte[] bArrArray;
        super(new C3589[16], new SimpleDecoderOutputBuffer[16]);
        if (!FfmpegLibrary.m1112()) {
            throw new FfmpegDecoderException("Failed to load decoder native libraries.");
        }
        c2431.f9667.getClass();
        String str = c2431.f9667;
        String strM1111 = FfmpegLibrary.m1111(str);
        strM1111.getClass();
        this.f1348 = strM1111;
        list = c2431.f9674;
        switch (str) {
            case "audio/vorbis":
                byte[] bArr2 = (byte[]) list.get(0);
                byte[] bArr3 = (byte[]) list.get(1);
                byte[] bArr4 = new byte[bArr2.length + bArr3.length + 6];
                bArr4[0] = (byte) (bArr2.length >> 8);
                bArr4[1] = (byte) (bArr2.length & 255);
                System.arraycopy(bArr2, 0, bArr4, 2, bArr2.length);
                bArr4[bArr2.length + 2] = 0;
                bArr4[bArr2.length + 3] = 0;
                bArr4[bArr2.length + 4] = (byte) (bArr3.length >> 8);
                bArr4[bArr2.length + 5] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr4, bArr2.length + 6, bArr3.length);
                bArr = bArr4;
                break;
            case "audio/mp4a-latm":
            case "audio/opus":
                bArrArray = (byte[]) list.get(0);
                bArr = bArrArray;
                break;
            case "audio/alac":
                byte[] bArr5 = (byte[]) list.get(0);
                int length = bArr5.length + 12;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                byteBufferAllocate.putInt(length);
                byteBufferAllocate.putInt(1634492771);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.put(bArr5, 0, bArr5.length);
                bArrArray = byteBufferAllocate.array();
                bArr = bArrArray;
                break;
            default:
                bArrArray = null;
                bArr = bArrArray;
                break;
        }
        this.f1349 = bArr;
        this.f1351 = z ? 4 : 2;
        this.f1347 = z ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(strM1111, bArr, z, c2431.f9681, c2431.f9662);
        this.f1350 = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new FfmpegDecoderException("Initialization failed.");
        }
        int i2 = this.f13796;
        C3589[] c3589Arr = this.f13787;
        AbstractC4464.m10132(i2 == c3589Arr.length);
        for (C3589 c3589 : c3589Arr) {
            c3589.m8491(i);
        }
    }

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.f1347 = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f1344;
        byteBuffer.getClass();
        AbstractC4464.m10142(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        simpleDecoderOutputBuffer.f1344 = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // p312.AbstractC3587, p312.InterfaceC3585
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo1102() throws InterruptedException {
        super.mo1102();
        ffmpegRelease(this.f1350);
        this.f1350 = 0L;
    }

    @Override // p312.AbstractC3587
    /* renamed from: ˉי, reason: contains not printable characters */
    public final DecoderException mo1103(C3589 c3589, AbstractC3584 abstractC3584, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC3584;
        if (z) {
            long jFfmpegReset = ffmpegReset(this.f1350, this.f1349);
            this.f1350 = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new FfmpegDecoderException("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = c3589.f13800;
        int i = AbstractC4470.f17202;
        int iLimit = byteBuffer.limit();
        long j = c3589.f13807;
        int i2 = this.f1347;
        simpleDecoderOutputBuffer.f13784 = j;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f1344;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i2) {
            simpleDecoderOutputBuffer.f1344 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.f1344.position(0);
        simpleDecoderOutputBuffer.f1344.limit(i2);
        int iFfmpegDecode = ffmpegDecode(this.f1350, byteBuffer, iLimit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.f1344, this.f1347);
        if (iFfmpegDecode == -2) {
            return new FfmpegDecoderException("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1 || iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.f13783 = true;
        } else {
            if (!this.f1352) {
                this.f1345 = ffmpegGetChannelCount(this.f1350);
                this.f1346 = ffmpegGetSampleRate(this.f1350);
                if (this.f1346 == 0 && "alac".equals(this.f1348)) {
                    this.f1349.getClass();
                    C4457 c4457 = new C4457(this.f1349);
                    c4457.m10108(this.f1349.length - 4);
                    this.f1346 = c4457.m10106();
                }
                this.f1352 = true;
            }
            ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.f1344;
            byteBuffer3.getClass();
            byteBuffer3.position(0);
            byteBuffer3.limit(iFfmpegDecode);
        }
        return null;
    }

    @Override // p312.AbstractC3587
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AbstractC3584 mo1104() {
        return new SimpleDecoderOutputBuffer(new C0265(this));
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final String m1105() {
        return "ffmpeg" + FfmpegLibrary.m1110() + "-" + this.f1348;
    }

    @Override // p312.AbstractC3587
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3589 mo1106() {
        return new C3589(2, FfmpegLibrary.m1108());
    }

    @Override // p312.AbstractC3587
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final DecoderException mo1107(Throwable th) {
        return new FfmpegDecoderException("Unexpected decode error", th);
    }
}
