package p357;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import p421.AbstractC4862;

/* renamed from: ᵔˎ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4067 extends ArrayAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ColorStateList f15689;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C4056 f15690;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ColorStateList f15691;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4067(C4056 c4056, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f15690 = c4056;
        m9362();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C4056 c4056 = this.f15690;
            Drawable rippleDrawable = null;
            if (c4056.getText().toString().contentEquals(textView.getText()) && c4056.f15632 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c4056.f15632);
                if (this.f15689 != null) {
                    colorDrawable.setTintList(this.f15691);
                    rippleDrawable = new RippleDrawable(this.f15689, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9362() {
        ColorStateList colorStateList;
        C4056 c4056 = this.f15690;
        ColorStateList colorStateList2 = c4056.f15625;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f15689 = colorStateList;
        if (c4056.f15632 != 0 && c4056.f15625 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC4862.m10939(c4056.f15625.getColorForState(iArr3, 0), c4056.f15632), AbstractC4862.m10939(c4056.f15625.getColorForState(iArr2, 0), c4056.f15632), c4056.f15632});
        }
        this.f15691 = colorStateList3;
    }
}
