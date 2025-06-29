package p222;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ˏᴵ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2934 extends SeekBar {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2880 f11358;

    public C2934(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0404f7);
        AbstractC2873.m7187(getContext(), this);
        C2880 c2880 = new C2880(this);
        this.f11358 = c2880;
        c2880.mo7192(attributeSet, R.attr._2_res_0x7f0404f7);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2880 c2880 = this.f11358;
        Drawable drawable = c2880.f11148;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C2934 c2934 = c2880.f11145;
        if (drawable.setState(c2934.getDrawableState())) {
            c2934.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11358.f11148;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11358.m7194(canvas);
    }
}
