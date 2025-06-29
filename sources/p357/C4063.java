package p357;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p361.C4105;

/* renamed from: ᵔˎ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4063 extends C4105 {

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final /* synthetic */ int f15679 = 0;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public C4050 f15680;

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f15680 = new C4050(this.f15680);
        return this;
    }

    @Override // p361.C4105
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo9357(Canvas canvas) {
        if (this.f15680.f15583.isEmpty()) {
            super.mo9357(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f15680.f15583);
        } else {
            canvas.clipRect(this.f15680.f15583, Region.Op.DIFFERENCE);
        }
        super.mo9357(canvas);
        canvas.restore();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m9358(float f, float f2, float f3, float f4) {
        RectF rectF = this.f15680.f15583;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
