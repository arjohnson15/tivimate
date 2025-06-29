package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p320.C3644;
import p320.InterfaceC3663;
import p320.InterfaceC3665;
import p320.MenuC3643;
import p331.C3762;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC3663, InterfaceC3665, AdapterView.OnItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final int[] f55 = {R.attr.background, R.attr.divider};

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public MenuC3643 f56;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, f55, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c3762M8778.m8784(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c3762M8778.m8784(1));
        }
        c3762M8778.m8783();
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo109((C3644) getAdapter().getItem(i));
    }

    @Override // p320.InterfaceC3663
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo109(C3644 c3644) {
        return this.f56.m8596(c3644, null, 0);
    }

    @Override // p320.InterfaceC3665
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo110(MenuC3643 menuC3643) {
        this.f56 = menuC3643;
    }
}
