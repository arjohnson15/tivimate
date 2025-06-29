package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p412.C4708;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f275;

    public Guideline(Context context) {
        super(context);
        this.f275 = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f275 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f275 = z;
    }

    public void setGuidelineBegin(int i) {
        C4708 c4708 = (C4708) getLayoutParams();
        if (this.f275 && c4708.f17979 == i) {
            return;
        }
        c4708.f17979 = i;
        setLayoutParams(c4708);
    }

    public void setGuidelineEnd(int i) {
        C4708 c4708 = (C4708) getLayoutParams();
        if (this.f275 && c4708.f17945 == i) {
            return;
        }
        c4708.f17945 = i;
        setLayoutParams(c4708);
    }

    public void setGuidelinePercent(float f) {
        C4708 c4708 = (C4708) getLayoutParams();
        if (this.f275 && c4708.f17970 == f) {
            return;
        }
        c4708.f17970 = f;
        setLayoutParams(c4708);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
