package p357;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p361.C4089;
import p361.C4098;

/* renamed from: ᵔˎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4050 extends C4098 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final RectF f15583;

    public C4050(C4050 c4050) {
        super(c4050);
        this.f15583 = c4050.f15583;
    }

    public C4050(C4089 c4089, RectF rectF) {
        super(c4089);
        this.f15583 = rectF;
    }

    @Override // p361.C4098, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C4063 c4063 = new C4063(this);
        c4063.f15680 = this;
        c4063.invalidateSelf();
        return c4063;
    }
}
