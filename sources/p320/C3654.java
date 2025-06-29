package p320;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p265.InterfaceMenuItemC3260;
import ˆˑ.ﹳﹳ;

/* renamed from: ᴵʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3654 implements InterfaceMenuItemC3260 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public CharSequence f13968;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f13969;

    /* renamed from: ˉי, reason: contains not printable characters */
    public CharSequence f13970;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public ColorStateList f13971;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public PorterDuff.Mode f13972;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public CharSequence f13973;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f13974;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Drawable f13975;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Intent f13976;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f13977;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public CharSequence f13978;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public char f13979;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f13980;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f13981;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public char f13982;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Context f13983;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13980;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13979;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13970;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f13975;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13971;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13972;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13976;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13969;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13982;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13978;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13968;
        return charSequence != null ? charSequence : this.f13978;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13973;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13977 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13977 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13977 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f13977 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f13979 = Character.toLowerCase(c);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f13979 = Character.toLowerCase(c);
        this.f13980 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f13977 = (z ? 1 : 0) | (this.f13977 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f13977 = (z ? 2 : 0) | (this.f13977 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13970 = charSequence;
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final InterfaceMenuItemC3260 setContentDescription(CharSequence charSequence) {
        this.f13970 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f13977 = (z ? 16 : 0) | (this.f13977 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f13975 = this.f13983.getDrawable(i);
        m8615();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13975 = drawable;
        m8615();
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13971 = colorStateList;
        this.f13981 = true;
        m8615();
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13972 = mode;
        this.f13974 = true;
        m8615();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13976 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f13982 = c;
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f13982 = c;
        this.f13969 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f13982 = c;
        this.f13979 = Character.toLowerCase(c2);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f13982 = c;
        this.f13969 = KeyEvent.normalizeMetaState(i);
        this.f13979 = Character.toLowerCase(c2);
        this.f13980 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f13978 = this.f13983.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13978 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13968 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13973 = charSequence;
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final InterfaceMenuItemC3260 setTooltipText(CharSequence charSequence) {
        this.f13973 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f13977 = (this.f13977 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260
    /* renamed from: ʽᐧ */
    public final InterfaceMenuItemC3260 mo8017(ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8615() {
        Drawable drawable = this.f13975;
        if (drawable != null) {
            if (this.f13981 || this.f13974) {
                Drawable drawable2 = ﹳﹳ.ᵢʿ(drawable);
                this.f13975 = drawable2;
                Drawable drawableMutate = drawable2.mutate();
                this.f13975 = drawableMutate;
                if (this.f13981) {
                    drawableMutate.setTintList(this.f13971);
                }
                if (this.f13974) {
                    this.f13975.setTintMode(this.f13972);
                }
            }
        }
    }

    @Override // p265.InterfaceMenuItemC3260
    /* renamed from: ـﹶ */
    public final ActionProviderVisibilityListenerC3646 mo8018() {
        return null;
    }
}
