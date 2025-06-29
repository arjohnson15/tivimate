package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0241;
import androidx.lifecycle.InterfaceC0242;
import p071.AbstractC1569;
import p071.InterfaceC1575;
import p107.InterfaceC1799;
import p107.InterfaceC1802;
import p225.AbstractActivityC3013;
import p226.C3031;
import p226.InterfaceC3048;
import p240.InterfaceC3101;
import p285.C3383;
import p285.InterfaceC3387;
import p291.AbstractC3458;
import p291.InterfaceC3438;
import p307.InterfaceC3562;
import p307.InterfaceC3573;
import p378.InterfaceC4341;
import p378.InterfaceC4343;

/* renamed from: androidx.fragment.app.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0111 extends AbstractC3458 implements InterfaceC1799, InterfaceC1802, InterfaceC3573, InterfaceC3562, InterfaceC0242, InterfaceC3048, InterfaceC1575, InterfaceC3387, InterfaceC3438, InterfaceC4341 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC3013 f681;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111(AbstractActivityC3013 abstractActivityC3013) {
        super(abstractActivityC3013);
        this.f681 = abstractActivityC3013;
    }

    @Override // p378.InterfaceC4341
    public final void addMenuProvider(InterfaceC4343 interfaceC4343) {
        this.f681.addMenuProvider(interfaceC4343);
    }

    @Override // p107.InterfaceC1799
    public final void addOnConfigurationChangedListener(InterfaceC3101 interfaceC3101) {
        this.f681.addOnConfigurationChangedListener(interfaceC3101);
    }

    @Override // p307.InterfaceC3573
    public final void addOnMultiWindowModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.f681.addOnMultiWindowModeChangedListener(interfaceC3101);
    }

    @Override // p307.InterfaceC3562
    public final void addOnPictureInPictureModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.f681.addOnPictureInPictureModeChangedListener(interfaceC3101);
    }

    @Override // p107.InterfaceC1802
    public final void addOnTrimMemoryListener(InterfaceC3101 interfaceC3101) {
        this.f681.addOnTrimMemoryListener(interfaceC3101);
    }

    @Override // p071.InterfaceC1575
    public final AbstractC1569 getActivityResultRegistry() {
        return this.f681.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC0262
    public final AbstractC0233 getLifecycle() {
        return this.f681.mFragmentLifecycleRegistry;
    }

    @Override // p226.InterfaceC3048
    public final C3031 getOnBackPressedDispatcher() {
        return this.f681.getOnBackPressedDispatcher();
    }

    @Override // p285.InterfaceC3387
    public final C3383 getSavedStateRegistry() {
        return this.f681.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC0242
    public final C0241 getViewModelStore() {
        return this.f681.getViewModelStore();
    }

    @Override // p378.InterfaceC4341
    public final void removeMenuProvider(InterfaceC4343 interfaceC4343) {
        this.f681.removeMenuProvider(interfaceC4343);
    }

    @Override // p107.InterfaceC1799
    public final void removeOnConfigurationChangedListener(InterfaceC3101 interfaceC3101) {
        this.f681.removeOnConfigurationChangedListener(interfaceC3101);
    }

    @Override // p307.InterfaceC3573
    public final void removeOnMultiWindowModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.f681.removeOnMultiWindowModeChangedListener(interfaceC3101);
    }

    @Override // p307.InterfaceC3562
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC3101 interfaceC3101) {
        this.f681.removeOnPictureInPictureModeChangedListener(interfaceC3101);
    }

    @Override // p107.InterfaceC1802
    public final void removeOnTrimMemoryListener(InterfaceC3101 interfaceC3101) {
        this.f681.removeOnTrimMemoryListener(interfaceC3101);
    }

    @Override // p291.AbstractC3416
    /* renamed from: ʽᐧ */
    public final View mo605(int i) {
        return this.f681.findViewById(i);
    }

    @Override // p291.AbstractC3416
    /* renamed from: ˑʽ */
    public final boolean mo606() {
        Window window = this.f681.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p291.InterfaceC3438
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo730(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f681.onAttachFragment(abstractComponentCallbacksC0100);
    }
}
