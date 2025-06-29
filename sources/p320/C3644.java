package p320;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p265.InterfaceMenuItemC3260;
import ˆˑ.ﹳﹳ;
import ˏᵢ.ᵢٴ;
import ᴵﹳ.ٴˎ;

/* renamed from: ᴵʿ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3644 implements InterfaceMenuItemC3260 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f13925;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public CharSequence f13926;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC3646 f13929;

    /* renamed from: ˉי, reason: contains not printable characters */
    public char f13930;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Drawable f13931;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public CharSequence f13934;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public SubMenuC3642 f13936;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public char f13937;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f13938;

    /* renamed from: ˑי, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f13939;

    /* renamed from: יʻ, reason: contains not printable characters */
    public int f13940;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f13941;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public CharSequence f13942;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Intent f13943;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f13944;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final MenuC3643 f13945;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public CharSequence f13947;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public View f13949;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f13950;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f13951 = 4096;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f13935 = 4096;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f13933 = 0;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public ColorStateList f13946 = null;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public PorterDuff.Mode f13948 = null;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f13927 = false;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public boolean f13932 = false;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f13953 = false;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f13952 = 16;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f13928 = false;

    public C3644(MenuC3643 menuC3643, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f13945 = menuC3643;
        this.f13941 = i2;
        this.f13925 = i;
        this.f13938 = i3;
        this.f13950 = i4;
        this.f13926 = charSequence;
        this.f13940 = i5;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m8600(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f13940 & 8) == 0) {
            return false;
        }
        if (this.f13949 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13944;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13945.mo8584(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m8601()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13944;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13945.mo8582(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f13949;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646 = this.f13929;
        if (actionProviderVisibilityListenerC3646 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC3646.f13954.onCreateActionView(this);
        this.f13949 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13935;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13930;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13947;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f13925;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f13931;
        if (drawable != null) {
            return m8604(drawable);
        }
        int i = this.f13933;
        if (i == 0) {
            return null;
        }
        Drawable drawable2 = ٴˎ.ˏᵢ(this.f13945.f13914, i);
        this.f13933 = 0;
        this.f13931 = drawable2;
        return m8604(drawable2);
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13946;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13948;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13943;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f13941;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13951;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13937;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f13938;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f13936;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13926;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13942;
        return charSequence != null ? charSequence : this.f13926;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13934;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f13936 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f13928;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13952 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13952 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13952 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646 = this.f13929;
        return (actionProviderVisibilityListenerC3646 == null || !actionProviderVisibilityListenerC3646.f13954.overridesItemVisibility()) ? (this.f13952 & 8) == 0 : (this.f13952 & 8) == 0 && this.f13929.f13954.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f13945.f13914;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f13949 = viewInflate;
        this.f13929 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f13941) > 0) {
            viewInflate.setId(i2);
        }
        MenuC3643 menuC3643 = this.f13945;
        menuC3643.f13909 = true;
        menuC3643.m8592(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f13949 = view;
        this.f13929 = null;
        if (view != null && view.getId() == -1 && (i = this.f13941) > 0) {
            view.setId(i);
        }
        MenuC3643 menuC3643 = this.f13945;
        menuC3643.f13909 = true;
        menuC3643.m8592(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f13930 == c) {
            return this;
        }
        this.f13930 = Character.toLowerCase(c);
        this.f13945.m8592(false);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f13930 == c && this.f13935 == i) {
            return this;
        }
        this.f13930 = Character.toLowerCase(c);
        this.f13935 = KeyEvent.normalizeMetaState(i);
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f13952;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f13952 = i2;
        if (i != i2) {
            this.f13945.m8592(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f13952;
        if ((i & 4) != 0) {
            MenuC3643 menuC3643 = this.f13945;
            menuC3643.getClass();
            ArrayList arrayList = menuC3643.f13915;
            int size = arrayList.size();
            menuC3643.m8599();
            for (int i2 = 0; i2 < size; i2++) {
                C3644 c3644 = (C3644) arrayList.get(i2);
                if (c3644.f13925 == this.f13925 && (c3644.f13952 & 4) != 0 && c3644.isCheckable()) {
                    boolean z2 = c3644 == this;
                    int i3 = c3644.f13952;
                    int i4 = (z2 ? 2 : 0) | (i3 & (-3));
                    c3644.f13952 = i4;
                    if (i3 != i4) {
                        c3644.f13945.m8592(false);
                    }
                }
            }
            menuC3643.m8588();
        } else {
            int i5 = (i & (-3)) | (z ? 2 : 0);
            this.f13952 = i5;
            if (i != i5) {
                this.f13945.m8592(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final InterfaceMenuItemC3260 setContentDescription(CharSequence charSequence) {
        this.f13947 = charSequence;
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f13952 |= 16;
        } else {
            this.f13952 &= -17;
        }
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f13931 = null;
        this.f13933 = i;
        this.f13953 = true;
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13933 = 0;
        this.f13931 = drawable;
        this.f13953 = true;
        this.f13945.m8592(false);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13946 = colorStateList;
        this.f13927 = true;
        this.f13953 = true;
        this.f13945.m8592(false);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13948 = mode;
        this.f13932 = true;
        this.f13953 = true;
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13943 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f13937 == c) {
            return this;
        }
        this.f13937 = c;
        this.f13945.m8592(false);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f13937 == c && this.f13951 == i) {
            return this;
        }
        this.f13937 = c;
        this.f13951 = KeyEvent.normalizeMetaState(i);
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13944 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13939 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f13937 = c;
        this.f13930 = Character.toLowerCase(c2);
        this.f13945.m8592(false);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f13937 = c;
        this.f13951 = KeyEvent.normalizeMetaState(i);
        this.f13930 = Character.toLowerCase(c2);
        this.f13935 = KeyEvent.normalizeMetaState(i2);
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13940 = i;
        MenuC3643 menuC3643 = this.f13945;
        menuC3643.f13909 = true;
        menuC3643.m8592(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f13945.f13914.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13926 = charSequence;
        this.f13945.m8592(false);
        SubMenuC3642 subMenuC3642 = this.f13936;
        if (subMenuC3642 != null) {
            subMenuC3642.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13942 = charSequence;
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // p265.InterfaceMenuItemC3260, android.view.MenuItem
    public final InterfaceMenuItemC3260 setTooltipText(CharSequence charSequence) {
        this.f13934 = charSequence;
        this.f13945.m8592(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f13952;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f13952 = i2;
        if (i != i2) {
            MenuC3643 menuC3643 = this.f13945;
            menuC3643.f13911 = true;
            menuC3643.m8592(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f13926;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p265.InterfaceMenuItemC3260
    /* renamed from: ʽᐧ */
    public final InterfaceMenuItemC3260 mo8017(ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646) {
        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC36462 = this.f13929;
        if (actionProviderVisibilityListenerC36462 != null) {
            actionProviderVisibilityListenerC36462.getClass();
        }
        this.f13949 = null;
        this.f13929 = actionProviderVisibilityListenerC3646;
        this.f13945.m8592(true);
        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC36463 = this.f13929;
        if (actionProviderVisibilityListenerC36463 != null) {
            actionProviderVisibilityListenerC36463.f13956 = new ᵢٴ(11, this);
            actionProviderVisibilityListenerC36463.f13954.setVisibilityListener(actionProviderVisibilityListenerC36463);
        }
        return this;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m8601() {
        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646;
        if ((this.f13940 & 8) == 0) {
            return false;
        }
        if (this.f13949 == null && (actionProviderVisibilityListenerC3646 = this.f13929) != null) {
            this.f13949 = actionProviderVisibilityListenerC3646.f13954.onCreateActionView(this);
        }
        return this.f13949 != null;
    }

    @Override // p265.InterfaceMenuItemC3260
    /* renamed from: ـﹶ */
    public final ActionProviderVisibilityListenerC3646 mo8018() {
        return this.f13929;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m8602() {
        return (this.f13952 & 32) == 32;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8603(boolean z) {
        if (z) {
            this.f13952 |= 32;
        } else {
            this.f13952 &= -33;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Drawable m8604(Drawable drawable) {
        if (drawable != null && this.f13953 && (this.f13927 || this.f13932)) {
            drawable = ﹳﹳ.ᵢʿ(drawable).mutate();
            if (this.f13927) {
                drawable.setTintList(this.f13946);
            }
            if (this.f13932) {
                drawable.setTintMode(this.f13948);
            }
            this.f13953 = false;
        }
        return drawable;
    }
}
