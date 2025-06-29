package p007;

import androidx.media3.common.VideoFrameProcessingException;
import p166.InterfaceC2404;

/* renamed from: ʻˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0938 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0965 f4130;

    public C0938(C0965 c0965) {
        this.f4130 = c0965;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3807() throws VideoFrameProcessingException {
        try {
            ((C0938) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC2404.class).newInstance(this.f4130)).m3807();
        } catch (Exception e) {
            int i = VideoFrameProcessingException.f1337;
            if (!(e instanceof VideoFrameProcessingException)) {
                throw new VideoFrameProcessingException(e);
            }
        }
    }
}
