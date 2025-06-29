package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import p412.AbstractC4692;
import p412.C4708;

/* loaded from: classes.dex */
public class Group extends AbstractC4692 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p412.AbstractC4692, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10605();
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

    @Override // p412.AbstractC4692
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo174() {
        C4708 c4708 = (C4708) getLayoutParams();
        c4708.f18009.m11493(0);
        c4708.f18009.m11513(0);
    }

    @Override // p412.AbstractC4692
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo175(ConstraintLayout constraintLayout) {
        m10600(constraintLayout);
    }
}
