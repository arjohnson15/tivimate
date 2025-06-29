package p320;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ـˈ.ˉᵎ;

/* renamed from: ᴵʿ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SubMenuC3642 extends MenuC3643 implements SubMenu {

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C3644 f13898;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final MenuC3643 f13899;

    public SubMenuC3642(Context context, MenuC3643 menuC3643, C3644 c3644) {
        super(context);
        this.f13899 = menuC3643;
        this.f13898 = c3644;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f13898;
    }

    @Override // p320.MenuC3643, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f13899.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m8586(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m8586(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m8586(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m8586(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m8586(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f13898.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f13898.setIcon(drawable);
        return this;
    }

    @Override // p320.MenuC3643, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f13899.setQwertyMode(z);
    }

    @Override // p320.MenuC3643
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo8577(MenuC3643 menuC3643, MenuItem menuItem) {
        return super.mo8577(menuC3643, menuItem) || this.f13899.mo8577(menuC3643, menuItem);
    }

    @Override // p320.MenuC3643
    /* renamed from: ˉי, reason: contains not printable characters */
    public final String mo8578() {
        C3644 c3644 = this.f13898;
        int i = c3644 != null ? c3644.f13941 : 0;
        if (i == 0) {
            return null;
        }
        return ˉᵎ.ˉⁱ("android:menu:actionviewstates:", i);
    }

    @Override // p320.MenuC3643
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean mo8579() {
        return this.f13899.mo8579();
    }

    @Override // p320.MenuC3643
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final MenuC3643 mo8580() {
        return this.f13899.mo8580();
    }

    @Override // p320.MenuC3643
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean mo8581() {
        return this.f13899.mo8581();
    }

    @Override // p320.MenuC3643
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo8582(C3644 c3644) {
        return this.f13899.mo8582(c3644);
    }

    @Override // p320.MenuC3643
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean mo8583() {
        return this.f13899.mo8583();
    }

    @Override // p320.MenuC3643
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean mo8584(C3644 c3644) {
        return this.f13899.mo8584(c3644);
    }
}
