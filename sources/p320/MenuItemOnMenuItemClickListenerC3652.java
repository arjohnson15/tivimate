package p320;

import android.view.MenuItem;

/* renamed from: ᴵʿ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC3652 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC3659 f13966;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f13967;

    public MenuItemOnMenuItemClickListenerC3652(MenuItemC3659 menuItemC3659, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13966 = menuItemC3659;
        this.f13967 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f13967.onMenuItemClick(this.f13966.m7419(menuItem));
    }
}
