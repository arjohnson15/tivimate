package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p320.InterfaceC3665;
import p320.MenuC3643;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC3665 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p320.InterfaceC3665
    /* renamed from: ـﹶ */
    public final void mo110(MenuC3643 menuC3643) {
    }
}
