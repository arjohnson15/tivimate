package ar.tvplayer.core.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p338.InterfaceC3865;

/* loaded from: classes.dex */
public final class CustomImageView extends AppCompatImageView {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC3865 f2277;

    public CustomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final InterfaceC3865 getOnDrawableSetListener() {
        return this.f2277;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2277 = null;
    }

    @Override // android.view.View
    public final void requestLayout() {
        forceLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        InterfaceC3865 interfaceC3865 = this.f2277;
        if (interfaceC3865 != null) {
            interfaceC3865.mo1053();
        }
        this.f2277 = null;
    }

    public final void setOnDrawableSetListener(InterfaceC3865 interfaceC3865) {
        this.f2277 = interfaceC3865;
    }
}
