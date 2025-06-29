package p131;

import android.graphics.drawable.Drawable;

/* renamed from: ˉʻ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2068 implements Drawable.Callback {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f7845;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f7846 = 1;

    public /* synthetic */ C2068() {
    }

    public C2068(C2061 c2061) {
        this.f7845 = c2061;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m5729(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7846) {
            case 0:
                ((C2061) this.f7845).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f7846) {
            case 0:
                ((C2061) this.f7845).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f7845;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7846) {
            case 0:
                ((C2061) this.f7845).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f7845;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }
}
