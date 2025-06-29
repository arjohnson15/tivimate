package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ControlBar extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f780;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f781;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f781 = -1;
        this.f780 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i != 33 && i != 130) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        int i3 = this.f781;
        if (i3 >= 0 && i3 < getChildCount()) {
            arrayList.add(getChildAt(this.f781));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(this.f780 ? getChildCount() / 2 : 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (getChildCount() > 0) {
            int i2 = this.f781;
            if (getChildAt((i2 < 0 || i2 >= getChildCount()) ? this.f780 ? getChildCount() / 2 : 0 : this.f781).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f781 = indexOfChild(view);
    }
}
