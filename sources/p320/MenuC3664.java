package p320;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p200.C2755;
import p225.AbstractC2995;
import p265.InterfaceMenuItemC3260;

/* renamed from: ᴵʿ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class MenuC3664 extends AbstractC2995 implements Menu {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final MenuC3643 f14054;

    public MenuC3664(Context context, MenuC3643 menuC3643) {
        super(context);
        if (menuC3643 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f14054 = menuC3643;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m7419(this.f14054.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m7419(this.f14054.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m7419(this.f14054.m8593(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m7419(this.f14054.m8593(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f14054.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m7419(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f14054.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f14054.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f14054.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f14054.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2755 c2755 = (C2755) this.f11516;
        if (c2755 != null) {
            c2755.clear();
        }
        this.f14054.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f14054.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m7419(this.f14054.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m7419(this.f14054.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f14054.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f14054.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f14054.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f14054.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C2755) this.f11516) != null) {
            int i2 = 0;
            while (true) {
                C2755 c2755 = (C2755) this.f11516;
                if (i2 >= c2755.f10778) {
                    break;
                }
                if (((InterfaceMenuItemC3260) c2755.m7021(i2)).getGroupId() == i) {
                    ((C2755) this.f11516).mo7022(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f14054.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C2755) this.f11516) != null) {
            int i2 = 0;
            while (true) {
                C2755 c2755 = (C2755) this.f11516;
                if (i2 >= c2755.f10778) {
                    break;
                }
                if (((InterfaceMenuItemC3260) c2755.m7021(i2)).getItemId() == i) {
                    ((C2755) this.f11516).mo7022(i2);
                    break;
                }
                i2++;
            }
        }
        this.f14054.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f14054.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f14054.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f14054.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f14054.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14054.size();
    }
}
