package p225;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.lifecycle.AbstractC0224;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import p065.ExecutorC1522;
import p182.AbstractC2517;
import p182.C2522;
import p182.C2529;
import p182.C2530;
import p182.InterfaceC2525;
import p222.AbstractC2861;
import p222.C2885;
import p222.C2964;
import p307.AbstractC3569;
import p307.C3560;
import p307.InterfaceC3557;
import p371.AbstractC4205;
import p453.C5201;
import ˆˑ.ﹳﹳ;

/* renamed from: ˏᵢ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3013 extends AbstractActivityC0113 implements InterfaceC2999, InterfaceC3557 {
    private AbstractC3014 mDelegate;
    private Resources mResources;

    public AbstractActivityC3013() {
        getSavedStateRegistry().m8242("androidx:appcompat", new C2991(this));
        addOnContextAvailableListener(new C2994(this));
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m7442();
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        layoutInflaterFactory2C3017.m7468();
        ((ViewGroup) layoutInflaterFactory2C3017.f11652.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C3017.f11632.m7439(layoutInflaterFactory2C3017.f11616.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        layoutInflaterFactory2C3017.f11658 = true;
        int i = layoutInflaterFactory2C3017.f11617;
        if (i == -100) {
            i = AbstractC3014.f11571;
        }
        int iM7464 = layoutInflaterFactory2C3017.m7464(context, i);
        if (AbstractC3014.m7443(context) && AbstractC3014.m7443(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC3014.f11575) {
                    try {
                        C5201 c5201 = AbstractC3014.f11574;
                        if (c5201 == null) {
                            if (AbstractC3014.f11576 == null) {
                                AbstractC3014.f11576 = C5201.m11590(AbstractC3569.m8461(context));
                            }
                            if (!AbstractC3014.f11576.f20024.isEmpty()) {
                                AbstractC3014.f11574 = AbstractC3014.f11576;
                            }
                        } else if (!c5201.equals(AbstractC3014.f11576)) {
                            C5201 c52012 = AbstractC3014.f11574;
                            AbstractC3014.f11576 = c52012;
                            AbstractC3569.m8464(context, c52012.f20024.mo11584());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC3014.f11578) {
                AbstractC3014.f11577.execute(new RunnableC3002(context, 0));
            }
        }
        C5201 c5201M7460 = LayoutInflaterFactory2C3017.m7460(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C3017.m7462(context, iM7464, c5201M7460, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C2529) {
            try {
                ((C2529) context).m6668(LayoutInflaterFactory2C3017.m7462(context, iM7464, c5201M7460, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C3017.f11608) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        AbstractC3005.m7433(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration configurationM7462 = LayoutInflaterFactory2C3017.m7462(context, iM7464, c5201M7460, configuration, true);
            C2529 c2529 = new C2529(context, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f14029c);
            c2529.m6668(configurationM7462);
            try {
                if (context.getTheme() != null) {
                    AbstractC4205.m9645(c2529.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c2529;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p307.AbstractActivityC3565, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        getSupportActionBar();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        layoutInflaterFactory2C3017.m7468();
        return (T) layoutInflaterFactory2C3017.f11616.findViewById(i);
    }

    public AbstractC3014 getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC1522 executorC1522 = AbstractC3014.f11577;
            this.mDelegate = new LayoutInflaterFactory2C3017(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        if (layoutInflaterFactory2C3017.f11627 == null) {
            layoutInflaterFactory2C3017.m7466();
            C3016 c3016 = layoutInflaterFactory2C3017.f11649;
            layoutInflaterFactory2C3017.f11627 = new C2530(c3016 != null ? c3016.m7454() : layoutInflaterFactory2C3017.f11657);
        }
        return layoutInflaterFactory2C3017.f11627;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = AbstractC2861.f11122;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC3007 getSupportActionBar() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        layoutInflaterFactory2C3017.m7466();
        return layoutInflaterFactory2C3017.f11649;
    }

    @Override // p307.InterfaceC3557
    public Intent getSupportParentActivityIntent() {
        return AbstractC3569.m8463(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        if (layoutInflaterFactory2C3017.f11649 != null) {
            layoutInflaterFactory2C3017.m7466();
            layoutInflaterFactory2C3017.f11649.getClass();
            layoutInflaterFactory2C3017.m7474(0);
        }
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        if (layoutInflaterFactory2C3017.f11614 && layoutInflaterFactory2C3017.f11621) {
            layoutInflaterFactory2C3017.m7466();
            C3016 c3016 = layoutInflaterFactory2C3017.f11649;
            if (c3016 != null) {
                c3016.m7455(c3016.f11595.getResources().getBoolean(org.lsposed.hiddenapibypass.library.R.bool._2_res_0x7f050000));
            }
        }
        C2964 c2964M7339 = C2964.m7339();
        Context context = layoutInflaterFactory2C3017.f11657;
        synchronized (c2964M7339) {
            c2964M7339.f11437.m7216(context);
        }
        layoutInflaterFactory2C3017.f11624 = new Configuration(layoutInflaterFactory2C3017.f11657.getResources().getConfiguration());
        layoutInflaterFactory2C3017.m7469(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C3560 c3560) {
        c3560.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC3569.m8463(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC3013 abstractActivityC3013 = c3560.f13738;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC3013.getPackageManager());
            }
            ArrayList arrayList = c3560.f13739;
            int size = arrayList.size();
            try {
                for (Intent intentM8460 = AbstractC3569.m8460(abstractActivityC3013, component); intentM8460 != null; intentM8460 = AbstractC3569.m8460(abstractActivityC3013, intentM8460.getComponent())) {
                    arrayList.add(size, intentM8460);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo7445();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onLocalesChanged(C5201 c5201) {
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, p226.AbstractActivityC3030, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC3007 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (((C2885) ((C3016) supportActionBar).f11583).f11170 & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C3017) getDelegate()).m7468();
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, android.app.Activity
    public void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        layoutInflaterFactory2C3017.m7466();
        C3016 c3016 = layoutInflaterFactory2C3017.f11649;
        if (c3016 != null) {
            c3016.f11601 = true;
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(C3560 c3560) {
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ((LayoutInflaterFactory2C3017) getDelegate()).m7469(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) getDelegate();
        layoutInflaterFactory2C3017.m7466();
        C3016 c3016 = layoutInflaterFactory2C3017.f11649;
        if (c3016 != null) {
            c3016.f11601 = false;
            C2522 c2522 = c3016.f11599;
            if (c2522 != null) {
                c2522.m6663();
            }
        }
    }

    @Override // p225.InterfaceC2999
    public void onSupportActionModeFinished(AbstractC2517 abstractC2517) {
    }

    @Override // p225.InterfaceC2999
    public void onSupportActionModeStarted(AbstractC2517 abstractC2517) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C3560 c3560 = new C3560(this);
        onCreateSupportNavigateUpTaskStack(c3560);
        onPrepareSupportNavigateUpTaskStack(c3560);
        ArrayList arrayList = c3560.f13739;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        c3560.f13738.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo7447(charSequence);
    }

    @Override // p225.InterfaceC2999
    public AbstractC2517 onWindowStartingSupportActionMode(InterfaceC2525 interfaceC2525) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity
    public void setContentView(int i) {
        m7442();
        getDelegate().mo7448(i);
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity
    public void setContentView(View view) {
        m7442();
        getDelegate().mo7452(view);
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m7442();
        getDelegate().mo7446(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C3017) getDelegate()).f11619 = i;
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7442() {
        AbstractC0224.m1025(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0423, this);
        ﹳﹳ.ﹳˑ(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0421, this);
    }
}
