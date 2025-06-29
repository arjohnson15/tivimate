package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.C0265;
import java.nio.ByteBuffer;
import p312.AbstractC3584;

/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends AbstractC3584 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0265 f1343;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ByteBuffer f1344;

    public SimpleDecoderOutputBuffer(C0265 c0265) {
        super(3);
        this.f1343 = c0265;
    }

    @Override // p312.AbstractC3584
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo1100() {
        super.mo1100();
        ByteBuffer byteBuffer = this.f1344;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // p312.AbstractC3584
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo1101() {
        C0265 c0265 = this.f1343;
        c0265.getClass();
        c0265.f1356.m8489(this);
    }
}
