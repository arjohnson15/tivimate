package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    public SearchBar$ScrollingViewBehavior() {
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, p315.AbstractC3608
    /* renamed from: ﹳﹳ */
    public final boolean mo2805(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.mo2805(coordinatorLayout, view, view2);
        return false;
    }
}
