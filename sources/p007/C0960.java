package p007;

import android.content.Context;
import android.opengl.GLSurfaceView;
import p312.AbstractC3588;

/* renamed from: ʻˉ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0960 extends GLSurfaceView implements InterfaceC0963 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f4258 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0948 f4259;

    public C0960(Context context) {
        super(context, null);
        C0948 c0948 = new C0948(this);
        this.f4259 = c0948;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c0948);
        setRenderMode(0);
    }

    @Deprecated
    public InterfaceC0963 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(AbstractC3588 abstractC3588) {
        C0948 c0948 = this.f4259;
        if (c0948.f4168.getAndSet(abstractC3588) != null) {
            throw new ClassCastException();
        }
        c0948.f4167.requestRender();
    }
}
