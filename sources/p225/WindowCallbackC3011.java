package p225;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p182.AbstractC2520;
import p182.AbstractC2521;
import p182.AbstractC2528;
import p320.MenuC3643;

/* renamed from: ˏᵢ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class WindowCallbackC3011 implements Window.Callback {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f11566;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C3017 f11567;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f11568;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f11569;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Window.Callback f11570;

    public WindowCallbackC3011(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017, Window.Callback callback) {
        this.f11567 = layoutInflaterFactory2C3017;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f11570 = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11570.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f11568;
        Window.Callback callback = this.f11570;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f11567.m7478(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f11570
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            ˏᵢ.ᵢʿ r2 = r6.f11567
            r2.m7466()
            ˏᵢ.ᵔﹳ r3 = r2.f11649
            r4 = 0
            if (r3 == 0) goto L3d
            ˏᵢ.ˎᵔ r3 = r3.f11603
            if (r3 != 0) goto L1d
        L1b:
            r0 = 0
            goto L39
        L1d:
            ᴵʿ.ˉי r3 = r3.f11520
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = 1
            goto L6b
        L3d:
            ˏᵢ.ˆᵔ r0 = r2.f11630
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m7465(r0, r3, r7)
            if (r0 == 0) goto L52
            ˏᵢ.ˆᵔ r7 = r2.f11630
            if (r7 == 0) goto L3b
            r7.f11493 = r1
            goto L3b
        L52:
            ˏᵢ.ˆᵔ r0 = r2.f11630
            if (r0 != 0) goto L6a
            ˏᵢ.ˆᵔ r0 = r2.m7479(r4)
            r2.m7477(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m7465(r0, r3, r7)
            r0.f11495 = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = 0
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.WindowCallbackC3011.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f11570.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11570.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11570.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f11570.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f11570.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f11570.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f11566) {
            this.f11570.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC3643)) {
            return this.f11570.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f11570.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f11570.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f11570.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m7436(i, menu);
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11567;
        if (i == 108) {
            layoutInflaterFactory2C3017.m7466();
            C3016 c3016 = layoutInflaterFactory2C3017.f11649;
            if (c3016 != null && true != c3016.f11586) {
                c3016.f11586 = true;
                ArrayList arrayList = c3016.f11588;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C3017.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f11569) {
            this.f11570.onPanelClosed(i, menu);
            return;
        }
        m7438(i, menu);
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11567;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C3017.getClass();
                return;
            }
            C2988 c2988M7479 = layoutInflaterFactory2C3017.m7479(i);
            if (c2988M7479.f11494) {
                layoutInflaterFactory2C3017.m7471(c2988M7479, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C3017.m7466();
        C3016 c3016 = layoutInflaterFactory2C3017.f11649;
        if (c3016 == null || !c3016.f11586) {
            return;
        }
        c3016.f11586 = false;
        ArrayList arrayList = c3016.f11588;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC2528.m6666(this.f11570, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC3643 menuC3643 = menu instanceof MenuC3643 ? (MenuC3643) menu : null;
        if (i == 0 && menuC3643 == null) {
            return false;
        }
        if (menuC3643 != null) {
            menuC3643.f13923 = true;
        }
        boolean zOnPreparePanel = this.f11570.onPreparePanel(i, view, menu);
        if (menuC3643 != null) {
            menuC3643.f13923 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC3643 menuC3643 = this.f11567.m7479(0).f11497;
        if (menuC3643 != null) {
            m7440(list, menuC3643, i);
        } else {
            m7440(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f11570.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC2520.m6660(this.f11570, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11570.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f11570.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.f11567.getClass();
        return m7437(callback);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        this.f11567.getClass();
        return i != 0 ? AbstractC2520.m6659(this.f11570, callback, i) : m7437(callback);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m7436(int i, Menu menu) {
        return this.f11570.onMenuOpened(i, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ˏᵢ.ˏᴵ] */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p182.C2526 m7437(android.view.ActionMode.Callback r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.WindowCallbackC3011.m7437(android.view.ActionMode$Callback):ˋⁱ.ٴˎ");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7438(int i, Menu menu) {
        this.f11570.onPanelClosed(i, menu);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7439(Window.Callback callback) {
        try {
            this.f11566 = true;
            callback.onContentChanged();
        } finally {
            this.f11566 = false;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7440(List list, Menu menu, int i) {
        AbstractC2521.m6661(this.f11570, list, menu, i);
    }
}
