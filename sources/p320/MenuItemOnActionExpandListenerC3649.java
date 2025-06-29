package p320;

import android.view.MenuItem;

/* renamed from: ᴵʿ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC3649 implements MenuItem.OnActionExpandListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC3659 f13961;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final MenuItem.OnActionExpandListener f13962;

    public MenuItemOnActionExpandListenerC3649(MenuItemC3659 menuItemC3659, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13961 = menuItemC3659;
        this.f13962 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13962.onMenuItemActionCollapse(this.f13961.m7419(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13962.onMenuItemActionExpand(this.f13961.m7419(menuItem));
    }
}
