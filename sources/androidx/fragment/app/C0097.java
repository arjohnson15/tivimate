package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0217;
import androidx.lifecycle.C0236;
import androidx.lifecycle.C0241;
import androidx.lifecycle.C0255;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0208;
import androidx.lifecycle.InterfaceC0218;
import androidx.lifecycle.InterfaceC0242;
import p285.C3383;
import p285.C3386;
import p285.InterfaceC3387;
import p458.AbstractC5393;
import p458.C5395;

/* renamed from: androidx.fragment.app.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0097 implements InterfaceC0218, InterfaceC3387, InterfaceC0242 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0241 f580;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final RunnableC0093 f582;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC0208 f583;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 f584;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C0236 f581 = null;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C3386 f585 = null;

    public C0097(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, C0241 c0241, RunnableC0093 runnableC0093) {
        this.f584 = abstractComponentCallbacksC0100;
        this.f580 = c0241;
        this.f582 = runnableC0093;
    }

    @Override // androidx.lifecycle.InterfaceC0218
    public final AbstractC5393 getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f584;
        Context applicationContext = abstractComponentCallbacksC0100.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C5395 c5395 = new C5395();
        if (application != null) {
            c5395.m12172(C0217.f1232, application);
        }
        c5395.m12172(AbstractC0224.f1240, abstractComponentCallbacksC0100);
        c5395.m12172(AbstractC0224.f1237, this);
        if (abstractComponentCallbacksC0100.getArguments() != null) {
            c5395.m12172(AbstractC0224.f1239, abstractComponentCallbacksC0100.getArguments());
        }
        return c5395;
    }

    @Override // androidx.lifecycle.InterfaceC0218
    public final InterfaceC0208 getDefaultViewModelProviderFactory() {
        Application application;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f584;
        InterfaceC0208 defaultViewModelProviderFactory = abstractComponentCallbacksC0100.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(abstractComponentCallbacksC0100.mDefaultFactory)) {
            this.f583 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f583 == null) {
            Context applicationContext = abstractComponentCallbacksC0100.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f583 = new C0255(application, abstractComponentCallbacksC0100, abstractComponentCallbacksC0100.getArguments());
        }
        return this.f583;
    }

    @Override // androidx.lifecycle.InterfaceC0262
    public final AbstractC0233 getLifecycle() {
        m608();
        return this.f581;
    }

    @Override // p285.InterfaceC3387
    public final C3383 getSavedStateRegistry() {
        m608();
        return this.f585.f13227;
    }

    @Override // androidx.lifecycle.InterfaceC0242
    public final C0241 getViewModelStore() {
        m608();
        return this.f580;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m608() {
        if (this.f581 == null) {
            this.f581 = new C0236(this);
            C3386 c3386 = new C3386(this);
            this.f585 = c3386;
            c3386.m8247();
            this.f582.run();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m609(EnumC0247 enumC0247) {
        this.f581.m1034(enumC0247);
    }
}
