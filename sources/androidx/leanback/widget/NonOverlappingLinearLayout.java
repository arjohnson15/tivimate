package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f862;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ArrayList f863;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f864;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f864 = false;
        this.f863 = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.f862) {
            super.focusableViewAvailable(view);
            return;
        }
        for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
            if (view2.getParent() == this) {
                iIndexOfChild = indexOfChild(view2);
                break;
            }
        }
        iIndexOfChild = -1;
        if (iIndexOfChild != -1) {
            ((ArrayList) this.f863.get(iIndexOfChild)).add(view);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.f863;
        int i5 = 0;
        try {
            boolean z2 = this.f864 && getOrientation() == 0 && getLayoutDirection() == 1;
            this.f862 = z2;
            if (z2) {
                while (arrayList.size() > getChildCount()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                while (arrayList.size() < getChildCount()) {
                    arrayList.add(new ArrayList());
                }
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.f862) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    for (int i7 = 0; i7 < ((ArrayList) arrayList.get(i6)).size(); i7++) {
                        super.focusableViewAvailable((View) ((ArrayList) arrayList.get(i6)).get(i7));
                    }
                }
            }
            if (this.f862) {
                this.f862 = false;
                while (i5 < arrayList.size()) {
                    ((ArrayList) arrayList.get(i5)).clear();
                    i5++;
                }
            }
        } catch (Throwable th) {
            if (this.f862) {
                this.f862 = false;
                while (i5 < arrayList.size()) {
                    ((ArrayList) arrayList.get(i5)).clear();
                    i5++;
                }
            }
            throw th;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.f864 = z;
    }
}
