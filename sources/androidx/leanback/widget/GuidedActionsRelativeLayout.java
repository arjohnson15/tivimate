package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f838;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C0172 f839;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f840;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f838 = false;
        this.f840 = GuidanceStylingRelativeLayout.m864(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0159 c0159;
        C0203 c0203;
        C0172 c0172 = this.f839;
        if (c0172 != null) {
            c0172.getClass();
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (c0203 = (c0159 = c0172.f1135).f1096) != null && c0203.m991()) {
                c0159.m949(true);
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f838 = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View viewFindViewById;
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && (viewFindViewById = findViewById(R.id._2_res_0x7f0b01c7)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f838) {
                this.f838 = true;
            }
            if (this.f838) {
                marginLayoutParams.topMargin = (int) ((this.f840 * size) / 100.0f);
            }
        }
        super.onMeasure(i, i2);
    }
}
