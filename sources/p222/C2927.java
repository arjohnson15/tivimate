package p222;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: ˏᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2927 extends Drawable {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ActionBarContainer f11336;

    public C2927(ActionBarContainer actionBarContainer) {
        this.f11336 = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f11336;
        if (actionBarContainer.f82) {
            Drawable drawable = actionBarContainer.f81;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f79;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f75;
        if (drawable3 == null || !actionBarContainer.f76) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f11336;
        if (actionBarContainer.f82) {
            if (actionBarContainer.f81 != null) {
                actionBarContainer.f79.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f79;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
