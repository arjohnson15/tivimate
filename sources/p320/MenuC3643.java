package p320;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p004.AbstractC0921;
import p378.AbstractC4364;

/* renamed from: ᴵʿ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public class MenuC3643 implements Menu {

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final int[] f13900 = {1, 4, 5, 3, 2, 0};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Resources f13901;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC3650 f13902;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList f13904;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public C3644 f13906;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public CharSequence f13907;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f13909;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public View f13910;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f13911;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f13912;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f13914;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList f13915;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayList f13916;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public Drawable f13917;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f13921;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList f13922;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f13923;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f13905 = 0;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f13913 = false;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f13919 = false;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f13908 = false;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f13918 = false;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final ArrayList f13920 = new ArrayList();

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f13903 = new CopyOnWriteArrayList();

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f13924 = false;

    public MenuC3643(Context context) {
        boolean zM3768;
        boolean z = false;
        this.f13914 = context;
        Resources resources = context.getResources();
        this.f13901 = resources;
        this.f13915 = new ArrayList();
        this.f13916 = new ArrayList();
        this.f13911 = true;
        this.f13922 = new ArrayList();
        this.f13904 = new ArrayList();
        this.f13909 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC4364.f16866;
            if (Build.VERSION.SDK_INT >= 28) {
                zM3768 = AbstractC0921.m3768(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM3768 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM3768) {
                z = true;
            }
        }
        this.f13921 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m8593(0, 0, 0, this.f13901.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m8593(i, i2, i3, this.f13901.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m8593(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m8593(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f13914.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C3644 c3644M8593 = m8593(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c3644M8593.setIcon(resolveInfo.loadIcon(packageManager));
            c3644M8593.f13943 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c3644M8593;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f13901.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f13901.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C3644 c3644M8593 = m8593(i, i2, i3, charSequence);
        SubMenuC3642 subMenuC3642 = new SubMenuC3642(this.f13914, this, c3644M8593);
        c3644M8593.f13936 = subMenuC3642;
        subMenuC3642.setHeaderTitle(c3644M8593.f13926);
        return subMenuC3642;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C3644 c3644 = this.f13906;
        if (c3644 != null) {
            mo8584(c3644);
        }
        this.f13915.clear();
        m8592(true);
    }

    public final void clearHeader() {
        this.f13917 = null;
        this.f13907 = null;
        this.f13910 = null;
        m8592(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m8591(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3644 c3644 = (C3644) arrayList.get(i2);
            if (c3644.f13941 == i) {
                return c3644;
            }
            if (c3644.hasSubMenu() && (menuItemFindItem = c3644.f13936.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f13915.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f13923) {
            return true;
        }
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C3644) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m8594(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m8596(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C3644 c3644M8594 = m8594(i, keyEvent);
        boolean zM8596 = c3644M8594 != null ? m8596(c3644M8594, null, i2) : false;
        if ((i2 & 2) != 0) {
            m8591(true);
        }
        return zM8596;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C3644) arrayList.get(i3)).f13925 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C3644) arrayList.get(i3)).f13925 != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f13915;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            m8592(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C3644) arrayList.get(i2)).f13941 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f13915;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            m8592(true);
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3644 c3644 = (C3644) arrayList.get(i2);
            if (c3644.f13925 == i) {
                c3644.f13952 = (c3644.f13952 & (-5)) | (z2 ? 4 : 0);
                c3644.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f13924 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3644 c3644 = (C3644) arrayList.get(i2);
            if (c3644.f13925 == i) {
                c3644.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f13915;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C3644 c3644 = (C3644) arrayList.get(i2);
            if (c3644.f13925 == i) {
                int i3 = c3644.f13952;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c3644.f13952 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m8592(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f13912 = z;
        m8592(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13915.size();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8585(InterfaceC3641 interfaceC3641, Context context) {
        this.f13903.add(new WeakReference(interfaceC3641));
        interfaceC3641.mo7195(context, this);
        this.f13909 = true;
    }

    /* renamed from: ʿʼ */
    public boolean mo8577(MenuC3643 menuC3643, MenuItem menuItem) {
        InterfaceC3650 interfaceC3650 = this.f13902;
        return interfaceC3650 != null && interfaceC3650.mo6655(menuC3643, menuItem);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m8586(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f13910 = view;
            this.f13907 = null;
            this.f13917 = null;
        } else {
            if (i > 0) {
                this.f13907 = this.f13901.getText(i);
            } else if (charSequence != null) {
                this.f13907 = charSequence;
            }
            if (i2 > 0) {
                this.f13917 = this.f13914.getDrawable(i2);
            } else if (drawable != null) {
                this.f13917 = drawable;
            }
            this.f13910 = null;
        }
        m8592(false);
    }

    /* renamed from: ˉי */
    public String mo8578() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList m8587() {
        boolean z = this.f13911;
        ArrayList arrayList = this.f13916;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f13915;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C3644 c3644 = (C3644) arrayList2.get(i);
            if (c3644.isVisible()) {
                arrayList.add(c3644);
            }
        }
        this.f13911 = false;
        this.f13909 = true;
        return arrayList;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m8588() {
        this.f13913 = false;
        if (this.f13919) {
            this.f13919 = false;
            m8592(this.f13908);
        }
    }

    /* renamed from: ˋⁱ */
    public boolean mo8579() {
        return this.f13924;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m8589(InterfaceC3641 interfaceC3641) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13903;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3641 interfaceC36412 = (InterfaceC3641) weakReference.get();
            if (interfaceC36412 == null || interfaceC36412 == interfaceC3641) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* renamed from: ˏʾ */
    public MenuC3643 mo8580() {
        return this;
    }

    /* renamed from: ˏᴵ */
    public boolean mo8581() {
        return this.f13921;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8590(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.mo8583()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f13915
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            ᴵʿ.ˉⁱ r12 = (p320.C3644) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            ᴵʿ.ˈٴ r13 = r12.f13936
            r13.m8590(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.f13930
            goto L42
        L40:
            char r13 = r12.f13937
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.f13935
            goto L49
        L47:
            int r14 = r12.f13951
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p320.MenuC3643.m8590(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8591(boolean z) {
        if (this.f13918) {
            return;
        }
        this.f13918 = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13903;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3641 interfaceC3641 = (InterfaceC3641) weakReference.get();
            if (interfaceC3641 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC3641.mo7199(this, z);
            }
        }
        this.f13918 = false;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m8592(boolean z) {
        if (this.f13913) {
            this.f13919 = true;
            if (z) {
                this.f13908 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f13911 = true;
            this.f13909 = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13903;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m8599();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3641 interfaceC3641 = (InterfaceC3641) weakReference.get();
            if (interfaceC3641 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC3641.mo7200();
            }
        }
        m8588();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3644 m8593(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f13900[i5] << 16) | (65535 & i3);
        C3644 c3644 = new C3644(this, i, i2, i3, i6, charSequence, this.f13905);
        ArrayList arrayList = this.f13915;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C3644) arrayList.get(size)).f13950 <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c3644);
        m8592(true);
        return c3644;
    }

    /* renamed from: ٴˎ */
    public boolean mo8582(C3644 c3644) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13903;
        boolean zMo7201 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m8599();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC3641 interfaceC3641 = (InterfaceC3641) weakReference.get();
            if (interfaceC3641 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zMo7201 = interfaceC3641.mo7201(c3644);
                if (zMo7201) {
                    break;
                }
            }
        }
        m8588();
        if (zMo7201) {
            this.f13906 = c3644;
        }
        return zMo7201;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3644 m8594(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13920;
        arrayList.clear();
        m8590(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C3644) arrayList.get(0);
        }
        boolean zMo8583 = mo8583();
        for (int i2 = 0; i2 < size; i2++) {
            C3644 c3644 = (C3644) arrayList.get(i2);
            char c = zMo8583 ? c3644.f13930 : c3644.f13937;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo8583 && c == '\b' && i == 67))) {
                return c3644;
            }
        }
        return null;
    }

    /* renamed from: ᴵʿ */
    public boolean mo8583() {
        return this.f13912;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m8595(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo8578());
        int size = this.f13915.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC3642) item.getSubMenu()).m8595(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m8596(android.view.MenuItem r7, p320.InterfaceC3641 r8, int r9) {
        /*
            r6 = this;
            ᴵʿ.ˉⁱ r7 = (p320.C3644) r7
            r0 = 0
            if (r7 == 0) goto Ld5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld5
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f13939
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = 1
            goto L41
        L1a:
            ᴵʿ.ˉי r1 = r7.f13945
            boolean r3 = r1.mo8577(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f13943
            if (r3 == 0) goto L33
            android.content.Context r1 = r1.f13914     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
        L33:
            ᴵʿ.ˋⁱ r1 = r7.f13929
            if (r1 == 0) goto L40
            android.view.ActionProvider r1 = r1.f13954
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L40
            goto L18
        L40:
            r1 = 0
        L41:
            ᴵʿ.ˋⁱ r3 = r7.f13929
            if (r3 == 0) goto L4f
            android.view.ActionProvider r4 = r3.f13954
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r7.m8601()
            if (r5 == 0) goto L62
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld4
            r6.m8591(r2)
            goto Ld4
        L62:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L73
            if (r4 == 0) goto L6b
            goto L73
        L6b:
            r7 = r9 & 1
            if (r7 != 0) goto Ld4
            r6.m8591(r2)
            goto Ld4
        L73:
            r9 = r9 & 4
            if (r9 != 0) goto L7a
            r6.m8591(r0)
        L7a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8e
            ᴵʿ.ˈٴ r9 = new ᴵʿ.ˈٴ
            android.content.Context r5 = r6.f13914
            r9.<init>(r5, r6, r7)
            r7.f13936 = r9
            java.lang.CharSequence r5 = r7.f13926
            r9.setHeaderTitle(r5)
        L8e:
            ᴵʿ.ˈٴ r7 = r7.f13936
            if (r4 == 0) goto L9c
            ᴵʿ.ᵎـ r9 = r3.f13955
            r9.getClass()
            android.view.ActionProvider r9 = r3.f13954
            r9.onPrepareSubMenu(r7)
        L9c:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f13903
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La5
            goto Lce
        La5:
            if (r8 == 0) goto Lab
            boolean r0 = r8.mo7198(r7)
        Lab:
            java.util.Iterator r8 = r9.iterator()
        Laf:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            ᴵʿ.ʿˏ r4 = (p320.InterfaceC3641) r4
            if (r4 != 0) goto Lc7
            r9.remove(r3)
            goto Laf
        Lc7:
            if (r0 != 0) goto Laf
            boolean r0 = r4.mo7198(r7)
            goto Laf
        Lce:
            r1 = r1 | r0
            if (r1 != 0) goto Ld4
            r6.m8591(r2)
        Ld4:
            return r1
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p320.MenuC3643.m8596(android.view.MenuItem, ᴵʿ.ʿˏ, int):boolean");
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m8597(Bundle bundle) {
        int size = this.f13915.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC3642) item.getSubMenu()).m8597(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo8578(), sparseArray);
        }
    }

    /* renamed from: ﹳﹳ */
    public boolean mo8584(C3644 c3644) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13903;
        boolean zMo7197 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f13906 == c3644) {
            m8599();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC3641 interfaceC3641 = (InterfaceC3641) weakReference.get();
                if (interfaceC3641 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo7197 = interfaceC3641.mo7197(c3644);
                    if (zMo7197) {
                        break;
                    }
                }
            }
            m8588();
            if (zMo7197) {
                this.f13906 = null;
            }
        }
        return zMo7197;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m8598() {
        ArrayList arrayListM8587 = m8587();
        if (this.f13909) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13903;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zMo7196 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC3641 interfaceC3641 = (InterfaceC3641) weakReference.get();
                if (interfaceC3641 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo7196 |= interfaceC3641.mo7196();
                }
            }
            ArrayList arrayList = this.f13922;
            ArrayList arrayList2 = this.f13904;
            if (zMo7196) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM8587.size();
                for (int i = 0; i < size; i++) {
                    C3644 c3644 = (C3644) arrayListM8587.get(i);
                    if (c3644.m8602()) {
                        arrayList.add(c3644);
                    } else {
                        arrayList2.add(c3644);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m8587());
            }
            this.f13909 = false;
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m8599() {
        if (this.f13913) {
            return;
        }
        this.f13913 = true;
        this.f13919 = false;
        this.f13908 = false;
    }
}
