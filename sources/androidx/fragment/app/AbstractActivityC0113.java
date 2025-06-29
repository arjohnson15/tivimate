package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.EnumC0247;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p070.AbstractC1563;
import p070.C1545;
import p200.C2757;
import p225.AbstractActivityC3013;
import p226.AbstractActivityC3030;
import p240.InterfaceC3101;
import p285.InterfaceC3388;
import p291.C3424;
import p291.C3455;
import p301.C3506;
import p307.InterfaceC3555;
import p307.InterfaceC3566;
import p420.InterfaceC4854;
import p458.C5394;

/* renamed from: androidx.fragment.app.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0113 extends AbstractActivityC3030 implements InterfaceC3555, InterfaceC3566 {
    boolean mCreated;
    final C3424 mFragments;
    boolean mResumed;
    final C0236 mFragmentLifecycleRegistry = new C0236(this);
    boolean mStopped = true;

    public AbstractActivityC0113() {
        final AbstractActivityC3013 abstractActivityC3013 = (AbstractActivityC3013) this;
        this.mFragments = new C3424(new C0111(abstractActivityC3013));
        getSavedStateRegistry().m8242("android:support:lifecycle", new InterfaceC3388() { // from class: androidx.fragment.app.ˑי
            @Override // p285.InterfaceC3388
            /* renamed from: ـﹶ, reason: contains not printable characters */
            public final Bundle mo629() {
                AbstractActivityC3013 abstractActivityC30132 = abstractActivityC3013;
                abstractActivityC30132.markFragmentsCreated();
                abstractActivityC30132.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_STOP);
                return new Bundle();
            }
        });
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC3101() { // from class: androidx.fragment.app.ᵎـ
            @Override // p240.InterfaceC3101
            /* renamed from: ˑʽ, reason: contains not printable characters */
            public final void mo731(Object obj) {
                switch (i) {
                    case 0:
                        abstractActivityC3013.mFragments.m8292();
                        break;
                    default:
                        abstractActivityC3013.mFragments.m8292();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC3101() { // from class: androidx.fragment.app.ᵎـ
            @Override // p240.InterfaceC3101
            /* renamed from: ˑʽ, reason: contains not printable characters */
            public final void mo731(Object obj) {
                switch (i2) {
                    case 0:
                        abstractActivityC3013.mFragments.m8292();
                        break;
                    default:
                        abstractActivityC3013.mFragments.m8292();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC4854() { // from class: androidx.fragment.app.ˎٴ
            @Override // p420.InterfaceC4854
            /* renamed from: ـﹶ, reason: contains not printable characters */
            public final void mo610(AbstractActivityC3030 abstractActivityC3030) {
                C0111 c0111 = abstractActivityC3013.mFragments.f13302;
                c0111.f13387.m637(c0111, c0111, null);
            }
        });
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m732(AbstractC0104 abstractC0104) {
        boolean zM732 = false;
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 : abstractC0104.f612.m597()) {
            if (abstractComponentCallbacksC0100 != null) {
                if (abstractComponentCallbacksC0100.getHost() != null) {
                    zM732 |= m732(abstractComponentCallbacksC0100.getChildFragmentManager());
                }
                C0097 c0097 = abstractComponentCallbacksC0100.mViewLifecycleOwner;
                EnumC0230 enumC0230 = EnumC0230.f1253;
                EnumC0230 enumC02302 = EnumC0230.f1252;
                if (c0097 != null) {
                    c0097.m608();
                    if (c0097.f581.f1275.m1030(enumC0230)) {
                        C0236 c0236 = abstractComponentCallbacksC0100.mViewLifecycleOwner.f581;
                        c0236.m1038("setCurrentState");
                        c0236.m1036(enumC02302);
                        zM732 = true;
                    }
                }
                if (abstractComponentCallbacksC0100.mLifecycleRegistry.f1275.m1030(enumC0230)) {
                    C0236 c02362 = abstractComponentCallbacksC0100.mLifecycleRegistry;
                    c02362.m1038("setCurrentState");
                    c02362.m1036(enumC02302);
                    zM732 = true;
                }
            }
        }
        return zM732;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f13302.f13387.f619.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                ﹶˋ.ـﹶ r4 = new ﹶˋ.ـﹶ(getViewModelStore(), C3506.f13600, C5394.f20869);
                C1545 c1545M5154 = AbstractC1563.m5154(C3506.class);
                String strM5132 = c1545M5154.m5132();
                if (strM5132 == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                C2757 c2757 = ((C3506) r4.ᴵʿ(c1545M5154, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5132))).f13601;
                if (c2757.f10787 > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (c2757.f10787 > 0) {
                        if (c2757.f10786[0] != null) {
                            throw new ClassCastException();
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(c2757.f10788[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            this.mFragments.f13302.f13387.m693(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC0104 getSupportFragmentManager() {
        return this.mFragments.f13302.f13387;
    }

    public void markFragmentsCreated() {
        while (m732(getSupportFragmentManager())) {
        }
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m8292();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
    }

    @Override // p226.AbstractActivityC3030, p307.AbstractActivityC3565, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_CREATE);
        C3455 c3455 = this.mFragments.f13302.f13387;
        c3455.f632 = false;
        c3455.f604 = false;
        c3455.f614.f689 = false;
        c3455.m641(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f13302.f13387.m648();
        this.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_DESTROY);
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f13302.f13387.m646(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f13302.f13387.m641(5);
        this.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // p226.AbstractActivityC3030, android.app.Activity, p307.InterfaceC3555
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m8292();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m8292();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f13302.f13387.m644(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_RESUME);
        C3455 c3455 = this.mFragments.f13302.f13387;
        c3455.f632 = false;
        c3455.f604 = false;
        c3455.f614.f689 = false;
        c3455.m641(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m8292();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C3455 c3455 = this.mFragments.f13302.f13387;
            c3455.f632 = false;
            c3455.f604 = false;
            c3455.f614.f689 = false;
            c3455.m641(4);
        }
        this.mFragments.f13302.f13387.m644(true);
        this.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_START);
        C3455 c34552 = this.mFragments.f13302.f13387;
        c34552.f632 = false;
        c34552.f604 = false;
        c34552.f614.f689 = false;
        c34552.m641(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m8292();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C3455 c3455 = this.mFragments.f13302.f13387;
        c3455.f604 = true;
        c3455.f614.f689 = true;
        c3455.m641(4);
        this.mFragmentLifecycleRegistry.m1034(EnumC0247.ON_STOP);
    }

    @Override // p307.InterfaceC3566
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
