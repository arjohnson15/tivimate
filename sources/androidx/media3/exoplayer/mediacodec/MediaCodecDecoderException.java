package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p362.C4116;
import p383.AbstractC4470;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1435;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, C4116 c4116) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(c4116 == null ? null : c4116.f15902);
        super(sb.toString(), illegalStateException);
        int i = AbstractC4470.f17202;
        if (i >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f1435 = i >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC4470.m10191(diagnosticInfo);
    }
}
