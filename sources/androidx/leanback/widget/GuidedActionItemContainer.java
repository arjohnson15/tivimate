package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class GuidedActionItemContainer extends AbstractC0150 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f837;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f837 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        if (this.f837 || !ʼˉ.ٴˎ.ˎٴ(this, view)) {
            return super.focusSearch(view, i);
        }
        View viewFocusSearch = super.focusSearch(view, i);
        if (ʼˉ.ٴˎ.ˎٴ(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        return null;
    }
}
