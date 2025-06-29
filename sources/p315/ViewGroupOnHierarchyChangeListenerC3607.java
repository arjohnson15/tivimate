package p315;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ᐧⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC3607 implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ CoordinatorLayout f13828;

    public ViewGroupOnHierarchyChangeListenerC3607(CoordinatorLayout coordinatorLayout) {
        this.f13828 = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13828.f295;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f13828;
        coordinatorLayout.m187(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f295;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
