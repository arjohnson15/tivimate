package p265;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p320.ActionProviderVisibilityListenerC3646;

/* renamed from: ـˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC3260 extends MenuItem {
    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC3260 setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC3260 setTooltipText(CharSequence charSequence);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    InterfaceMenuItemC3260 mo8017(ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    ActionProviderVisibilityListenerC3646 mo8018();
}
