package p222;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ˏᴵ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2877 extends RatingBar {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2883 f11140;

    public C2877(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0404b7);
        AbstractC2873.m7187(getContext(), this);
        C2883 c2883 = new C2883(this);
        this.f11140 = c2883;
        c2883.mo7192(attributeSet, R.attr._2_res_0x7f0404b7);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f11140.f11168;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
