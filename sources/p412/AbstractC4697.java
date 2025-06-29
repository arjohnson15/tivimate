package p412;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p447.C5174;

/* renamed from: ﹳˑ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4697 extends AbstractC4692 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f17895;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f17896;

    @Override // p412.AbstractC4692, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17895 || this.f17896) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f17850; i++) {
                    View view = (View) constraintLayout.f269.get(this.f17854[i]);
                    if (view != null) {
                        if (this.f17895) {
                            view.setVisibility(visibility);
                        }
                        if (this.f17896 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m10605();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m10605();
    }

    /* renamed from: ˉⁱ */
    public abstract void mo165(C5174 c5174, int i, int i2);

    @Override // p412.AbstractC4692
    /* renamed from: ˏᵢ */
    public void mo166(AttributeSet attributeSet) {
        super.mo166(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4702.f17908);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f17895 = true;
                } else if (index == 22) {
                    this.f17896 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p412.AbstractC4692
    /* renamed from: ٴˎ */
    public final void mo175(ConstraintLayout constraintLayout) {
        m10600(constraintLayout);
    }
}
