package p226;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0217;
import androidx.lifecycle.C0236;
import androidx.lifecycle.C0241;
import androidx.lifecycle.C0252;
import androidx.lifecycle.C0255;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.FragmentC0206;
import androidx.lifecycle.InterfaceC0208;
import androidx.lifecycle.InterfaceC0218;
import androidx.lifecycle.InterfaceC0242;
import androidx.lifecycle.RunnableC0246;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.lsposed.hiddenapibypass.library.R;
import p071.AbstractC1569;
import p071.AbstractC1570;
import p071.InterfaceC1566;
import p071.InterfaceC1575;
import p107.InterfaceC1799;
import p107.InterfaceC1802;
import p240.InterfaceC3101;
import p285.C3383;
import p285.C3386;
import p285.InterfaceC3387;
import p286.AbstractC3390;
import p291.C3453;
import p307.AbstractActivityC3565;
import p307.C3572;
import p307.C3576;
import p307.InterfaceC3562;
import p307.InterfaceC3573;
import p338.InterfaceC3865;
import p378.C4354;
import p378.InterfaceC4341;
import p378.InterfaceC4343;
import p420.C4855;
import p420.InterfaceC4854;
import p458.AbstractC5393;
import p458.C5395;
import ˆˑ.ﹳﹳ;
import ˈⁱ.ˉⁱ;
import ˉﾞ.ⁱⁱ;

/* renamed from: ˑʽ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3030 extends AbstractActivityC3565 implements InterfaceC0242, InterfaceC0218, InterfaceC3387, InterfaceC3048, InterfaceC1575, InterfaceC1799, InterfaceC1802, InterfaceC3573, InterfaceC3562, InterfaceC4341 {
    private final AbstractC1569 mActivityResultRegistry;
    private int mContentLayoutId;
    private InterfaceC0208 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final C3042 mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private C3031 mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC3101> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3101> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3101> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC3101> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3101> mOnTrimMemoryListeners;
    final InterfaceExecutorC3029 mReportFullyDrawnExecutor;
    final C3386 mSavedStateRegistryController;
    private C0241 mViewModelStore;
    final C4855 mContextAwareHelper = new C4855();
    private final C4354 mMenuHostHelper = new C4354(new RunnableC0246(7, this));
    private final C0236 mLifecycleRegistry = new C0236(this);

    public AbstractActivityC3030() {
        C3386 c3386 = new C3386(this);
        this.mSavedStateRegistryController = c3386;
        this.mOnBackPressedDispatcher = null;
        this.mReportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC3034(this);
        this.mFullyDrawnReporter = new C3042(new ⁱⁱ(7, this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C3027(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        getLifecycle().mo1032(new C3040(this, 1));
        getLifecycle().mo1032(new C3040(this, 0));
        getLifecycle().mo1032(new C3040(this, 2));
        c3386.m8247();
        AbstractC0224.m1024(this);
        if (i <= 23) {
            AbstractC0233 lifecycle = getLifecycle();
            C3040 c3040 = new C3040();
            c3040.f11734 = this;
            lifecycle.mo1032(c3040);
        }
        getSavedStateRegistry().m8242("android:support:activity-result", new C0252(1, this));
        addOnContextAvailableListener(new InterfaceC4854() { // from class: ˑʽ.ﹳﹳ
            @Override // p420.InterfaceC4854
            /* renamed from: ـﹶ */
            public final void mo610(AbstractActivityC3030 abstractActivityC3030) {
                AbstractActivityC3030.m7523(this.f11746);
            }
        });
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Bundle m7522(AbstractActivityC3030 abstractActivityC3030) {
        Bundle bundle = new Bundle();
        AbstractC1569 abstractC1569 = abstractActivityC3030.mActivityResultRegistry;
        abstractC1569.getClass();
        HashMap map = abstractC1569.f6314;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC1569.f6320));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC1569.f6319.clone());
        return bundle;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7523(AbstractActivityC3030 abstractActivityC3030) {
        Bundle bundleM8243 = abstractActivityC3030.getSavedStateRegistry().m8243("android:support:activity-result");
        if (bundleM8243 != null) {
            AbstractC1569 abstractC1569 = abstractActivityC3030.mActivityResultRegistry;
            abstractC1569.getClass();
            ArrayList<Integer> integerArrayList = bundleM8243.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM8243.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC1569.f6320 = bundleM8243.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleM8243.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC1569.f6319;
            bundle2.putAll(bundle);
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                HashMap map = abstractC1569.f6314;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = abstractC1569.f6317;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo7521(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p378.InterfaceC4341
    public void addMenuProvider(InterfaceC4343 interfaceC4343) {
        C4354 c4354 = this.mMenuHostHelper;
        c4354.f16859.add(interfaceC4343);
        c4354.f16861.run();
    }

    @Override // p107.InterfaceC1799
    public final void addOnConfigurationChangedListener(InterfaceC3101 interfaceC3101) {
        this.mOnConfigurationChangedListeners.add(interfaceC3101);
    }

    public final void addOnContextAvailableListener(InterfaceC4854 interfaceC4854) {
        C4855 c4855 = this.mContextAwareHelper;
        AbstractActivityC3030 abstractActivityC3030 = c4855.f18355;
        if (abstractActivityC3030 != null) {
            interfaceC4854.mo610(abstractActivityC3030);
        }
        c4855.f18356.add(interfaceC4854);
    }

    @Override // p307.InterfaceC3573
    public final void addOnMultiWindowModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC3101);
    }

    public final void addOnNewIntentListener(InterfaceC3101 interfaceC3101) {
        this.mOnNewIntentListeners.add(interfaceC3101);
    }

    @Override // p307.InterfaceC3562
    public final void addOnPictureInPictureModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC3101);
    }

    @Override // p107.InterfaceC1802
    public final void addOnTrimMemoryListener(InterfaceC3101 interfaceC3101) {
        this.mOnTrimMemoryListeners.add(interfaceC3101);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C3047 c3047 = (C3047) getLastNonConfigurationInstance();
            if (c3047 != null) {
                this.mViewModelStore = c3047.f11747;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0241();
            }
        }
    }

    @Override // p071.InterfaceC1575
    public final AbstractC1569 getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0218
    public AbstractC5393 getDefaultViewModelCreationExtras() {
        C5395 c5395 = new C5395();
        if (getApplication() != null) {
            c5395.m12172(C0217.f1232, getApplication());
        }
        c5395.m12172(AbstractC0224.f1240, this);
        c5395.m12172(AbstractC0224.f1237, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c5395.m12172(AbstractC0224.f1239, getIntent().getExtras());
        }
        return c5395;
    }

    @Override // androidx.lifecycle.InterfaceC0218
    public InterfaceC0208 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0255(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.InterfaceC0262
    public AbstractC0233 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p226.InterfaceC3048
    public final C3031 getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new C3031(new RunnableC3041(this));
            getLifecycle().mo1032(new C3040(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // p285.InterfaceC3387
    public final C3383 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f13227;
    }

    @Override // androidx.lifecycle.InterfaceC0242
    public C0241 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        AbstractC0224.m1025(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id._2_res_0x7f0b0423, this);
        ﹳﹳ.ﹳˑ(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id._2_res_0x7f0b0421, this);
        getWindow().getDecorView().setTag(R.id._2_res_0x7f0b0310, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.m5162(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m7526();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC3101> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo731(configuration);
        }
    }

    @Override // p307.AbstractActivityC3565, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m8245(bundle);
        C4855 c4855 = this.mContextAwareHelper;
        c4855.f18355 = this;
        Iterator it = c4855.f18356.iterator();
        while (it.hasNext()) {
            ((InterfaceC4854) it.next()).mo610(this);
        }
        super.onCreate(bundle);
        int i = FragmentC0206.f1216;
        AbstractC0224.m1019(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C4354 c4354 = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c4354.f16859.iterator();
        while (it.hasNext()) {
            ((C3453) ((InterfaceC4343) it.next())).f13374.m659(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.m9928(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC3101> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo731(new C3576(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC3101> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().mo731(new C3576(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC3101> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().mo731(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.mMenuHostHelper.f16859.iterator();
        while (it.hasNext()) {
            ((C3453) ((InterfaceC4343) it.next())).f13374.m682(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC3101> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo731(new C3572(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC3101> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().mo731(new C3572(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.mMenuHostHelper.f16859.iterator();
        while (it.hasNext()) {
            ((C3453) ((InterfaceC4343) it.next())).f13374.m687(menu);
        }
        return true;
    }

    @Override // android.app.Activity, p307.InterfaceC3555
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m5162(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C3047 c3047;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0241 c0241 = this.mViewModelStore;
        if (c0241 == null && (c3047 = (C3047) getLastNonConfigurationInstance()) != null) {
            c0241 = c3047.f11747;
        }
        if (c0241 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C3047 c30472 = new C3047();
        c30472.f11748 = objOnRetainCustomNonConfigurationInstance;
        c30472.f11747 = c0241;
        return c30472;
    }

    @Override // p307.AbstractActivityC3565, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0233 lifecycle = getLifecycle();
        if (lifecycle instanceof C0236) {
            C0236 c0236 = (C0236) lifecycle;
            EnumC0230 enumC0230 = EnumC0230.f1252;
            c0236.m1038("setCurrentState");
            c0236.m1036(enumC0230);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m8246(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC3101> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().mo731(Integer.valueOf(i));
        }
    }

    public final <I, O> AbstractC1570 registerForActivityResult(AbstractC3390 abstractC3390, InterfaceC1566 interfaceC1566) {
        return registerForActivityResult(abstractC3390, this.mActivityResultRegistry, interfaceC1566);
    }

    public final <I, O> AbstractC1570 registerForActivityResult(AbstractC3390 abstractC3390, AbstractC1569 abstractC1569, InterfaceC1566 interfaceC1566) {
        return abstractC1569.m5161("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC3390, interfaceC1566);
    }

    @Override // p378.InterfaceC4341
    public void removeMenuProvider(InterfaceC4343 interfaceC4343) {
        C4354 c4354 = this.mMenuHostHelper;
        c4354.f16859.remove(interfaceC4343);
        if (c4354.f16860.remove(interfaceC4343) != null) {
            throw new ClassCastException();
        }
        c4354.f16861.run();
    }

    @Override // p107.InterfaceC1799
    public final void removeOnConfigurationChangedListener(InterfaceC3101 interfaceC3101) {
        this.mOnConfigurationChangedListeners.remove(interfaceC3101);
    }

    @Override // p307.InterfaceC3573
    public final void removeOnMultiWindowModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC3101);
    }

    @Override // p307.InterfaceC3562
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC3101);
    }

    @Override // p107.InterfaceC1802
    public final void removeOnTrimMemoryListener(InterfaceC3101 interfaceC3101) {
        this.mOnTrimMemoryListeners.remove(interfaceC3101);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ˉⁱ.ˑי()) {
                Trace.beginSection(ˉⁱ.ˎˑ("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C3042 c3042 = this.mFullyDrawnReporter;
            synchronized (c3042.f11739) {
                try {
                    c3042.f11737 = true;
                    Iterator it = c3042.f11738.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3865) it.next()).mo1053();
                    }
                    c3042.f11738.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo7521(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo7521(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo7521(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
