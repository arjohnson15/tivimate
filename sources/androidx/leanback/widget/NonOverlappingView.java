package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class NonOverlappingView extends View {
    public NonOverlappingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
