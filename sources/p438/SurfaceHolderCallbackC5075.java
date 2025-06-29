package p438;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import p007.InterfaceC0962;
import p337.InterfaceC3822;

/* renamed from: ﹶﾞ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC5075 implements InterfaceC0962, InterfaceC3822, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C5118 f19247;

    public SurfaceHolderCallbackC5075(C5118 c5118) {
        this.f19247 = c5118;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C5118 c5118 = this.f19247;
        c5118.getClass();
        Surface surface = new Surface(surfaceTexture);
        c5118.m11395(surface);
        c5118.f19525 = surface;
        c5118.m11364(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C5118 c5118 = this.f19247;
        c5118.m11395(null);
        c5118.m11364(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f19247.m11364(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f19247.m11364(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C5118 c5118 = this.f19247;
        if (c5118.f19543) {
            c5118.m11395(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C5118 c5118 = this.f19247;
        if (c5118.f19543) {
            c5118.m11395(null);
        }
        c5118.m11364(0, 0);
    }
}
