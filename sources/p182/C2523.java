package p182;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v4.media.session.AbstractC0002;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p107.AbstractC1801;
import p265.InterfaceMenuItemC3260;
import p320.ActionProviderVisibilityListenerC3646;
import p320.C3644;
import p320.MenuItemC3659;

/* renamed from: ˋⁱ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2523 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f10023;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public CharSequence f10025;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f10026;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public CharSequence f10027;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f10028;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f10029;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f10031;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public CharSequence f10032;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f10033;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f10034;

    /* renamed from: ˑי, reason: contains not printable characters */
    public char f10036;

    /* renamed from: יʻ, reason: contains not printable characters */
    public String f10037;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Menu f10038;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2530 f10041;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public CharSequence f10042;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public char f10043;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f10044;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f10045;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f10046;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC3646 f10047;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f10049;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public String f10050;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f10051;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ColorStateList f10024 = null;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public PorterDuff.Mode f10030 = null;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f10021 = 0;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f10035 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10048 = 0;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10022 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f10039 = true;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f10040 = true;

    public C2523(C2530 c2530, Menu menu) {
        this.f10041 = c2530;
        this.f10038 = menu;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6664(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f10044).setVisible(this.f10046).setEnabled(this.f10023).setCheckable(this.f10031 >= 1).setTitleCondensed(this.f10027).setIcon(this.f10029);
        int i = this.f10028;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f10037;
        C2530 c2530 = this.f10041;
        if (str != null) {
            if (c2530.f10066.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c2530.f10068 == null) {
                c2530.f10068 = C2530.m6669(c2530.f10066);
            }
            Object obj = c2530.f10068;
            String str2 = this.f10037;
            MenuItemOnMenuItemClickListenerC2527 menuItemOnMenuItemClickListenerC2527 = new MenuItemOnMenuItemClickListenerC2527();
            menuItemOnMenuItemClickListenerC2527.f10056 = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC2527.f10055 = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC2527.f10054);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC2527);
            } catch (Exception e) {
                StringBuilder sbM50 = AbstractC0002.m50("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM50.append(cls.getName());
                InflateException inflateException = new InflateException(sbM50.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f10031 >= 2) {
            if (menuItem instanceof C3644) {
                C3644 c3644 = (C3644) menuItem;
                c3644.f13952 = (c3644.f13952 & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC3659) {
                MenuItemC3659 menuItemC3659 = (MenuItemC3659) menuItem;
                try {
                    Method method = menuItemC3659.f14009;
                    InterfaceMenuItemC3260 interfaceMenuItemC3260 = menuItemC3659.f14008;
                    if (method == null) {
                        menuItemC3659.f14009 = interfaceMenuItemC3260.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC3659.f14009.invoke(interfaceMenuItemC3260, Boolean.TRUE);
                } catch (Exception e2) {
                }
            }
        }
        String str3 = this.f10050;
        if (str3 != null) {
            menuItem.setActionView((View) m6665(str3, C2530.f10063, c2530.f10067));
            z = true;
        }
        int i2 = this.f10051;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646 = this.f10047;
        if (actionProviderVisibilityListenerC3646 != null && (menuItem instanceof InterfaceMenuItemC3260)) {
            ((InterfaceMenuItemC3260) menuItem).mo8017(actionProviderVisibilityListenerC3646);
        }
        CharSequence charSequence = this.f10025;
        boolean z2 = menuItem instanceof InterfaceMenuItemC3260;
        if (z2) {
            ((InterfaceMenuItemC3260) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1801.m5543(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f10042;
        if (z2) {
            ((InterfaceMenuItemC3260) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1801.m5538(menuItem, charSequence2);
        }
        char c = this.f10043;
        int i3 = this.f10033;
        if (z2) {
            ((InterfaceMenuItemC3260) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1801.m5542(menuItem, c, i3);
        }
        char c2 = this.f10036;
        int i4 = this.f10045;
        if (z2) {
            ((InterfaceMenuItemC3260) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1801.m5536(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f10030;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC3260) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1801.m5545(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f10024;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC3260) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1801.m5539(menuItem, colorStateList);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m6665(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f10041.f10066.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            String str2 = "Cannot instantiate class: " + str;
            return null;
        }
    }
}
