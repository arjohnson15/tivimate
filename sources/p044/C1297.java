package p044;

import android.graphics.drawable.Drawable;
import p361.C4105;

/* renamed from: ʽٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1297 extends Drawable.ConstantState {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f5317;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4105 f5318;

    public C1297(C1297 c1297) {
        this.f5318 = (C4105) c1297.f5318.f15848.newDrawable();
        this.f5317 = c1297.f5317;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1295(new C1297(this));
    }
}
