package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final int[] f778 = {R.attr.state_checked};

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f779;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f779;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f779) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f778);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.f779 != z) {
            this.f779 = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f779);
    }
}
