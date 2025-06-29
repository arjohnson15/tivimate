package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import org.lsposed.hiddenapibypass.library.R;
import p348.AbstractC3996;

/* loaded from: classes.dex */
class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f828;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f828 = m864(context);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static float m864(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(AbstractC3996.f15430);
        float f = typedArrayObtainStyledAttributes.getFloat(46, 40.0f);
        typedArrayObtainStyledAttributes.recycle();
        return f;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View viewFindViewById = getRootView().findViewById(R.id._2_res_0x7f0b01b7);
        View viewFindViewById2 = getRootView().findViewById(R.id._2_res_0x7f0b01b3);
        View viewFindViewById3 = getRootView().findViewById(R.id._2_res_0x7f0b01b5);
        ImageView imageView = (ImageView) getRootView().findViewById(R.id._2_res_0x7f0b01b6);
        int measuredHeight = (int) ((getMeasuredHeight() * this.f828) / 100.0f);
        if (viewFindViewById != null && viewFindViewById.getParent() == this) {
            int baseline = (((measuredHeight - viewFindViewById.getBaseline()) - viewFindViewById2.getMeasuredHeight()) - viewFindViewById.getPaddingTop()) - viewFindViewById2.getTop();
            if (viewFindViewById2.getParent() == this) {
                viewFindViewById2.offsetTopAndBottom(baseline);
            }
            viewFindViewById.offsetTopAndBottom(baseline);
            if (viewFindViewById3 != null && viewFindViewById3.getParent() == this) {
                viewFindViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView == null || imageView.getParent() != this || imageView.getDrawable() == null) {
            return;
        }
        imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
    }
}
