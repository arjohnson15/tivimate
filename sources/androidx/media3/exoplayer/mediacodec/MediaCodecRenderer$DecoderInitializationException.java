package androidx.media3.exoplayer.mediacodec;

import p166.C2431;
import p362.C4116;

/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f1436;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4116 f1437;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f1438;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f1439;

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, C4116 c4116, String str3) {
        super(str, th);
        this.f1439 = str2;
        this.f1436 = z;
        this.f1437 = c4116;
        this.f1438 = str3;
    }

    public MediaCodecRenderer$DecoderInitializationException(C2431 c2431, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c2431, mediaCodecUtil$DecoderQueryException, c2431.f9667, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }
}
