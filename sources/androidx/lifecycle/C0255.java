package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0002;
import java.lang.reflect.Constructor;
import p070.C1545;
import p285.C3383;
import p285.InterfaceC3387;
import p458.AbstractC5393;
import p458.C5395;

/* renamed from: androidx.lifecycle.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0255 implements InterfaceC0208 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0217 f1310;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3383 f1311;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Bundle f1312;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Application f1313;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC0233 f1314;

    public C0255(Application application, InterfaceC3387 interfaceC3387, Bundle bundle) {
        C0217 c0217;
        this.f1311 = interfaceC3387.getSavedStateRegistry();
        this.f1314 = interfaceC3387.getLifecycle();
        this.f1312 = bundle;
        this.f1313 = application;
        if (application != null) {
            if (C0217.f1233 == null) {
                C0217.f1233 = new C0217(application);
            }
            c0217 = C0217.f1233;
        } else {
            c0217 = new C0217(null);
        }
        this.f1310 = c0217;
    }

    @Override // androidx.lifecycle.InterfaceC0208
    /* renamed from: ʽᐧ */
    public final /* synthetic */ AbstractC0207 mo1002(C1545 c1545, C5395 c5395) {
        return AbstractC0002.m47(this, c1545, c5395);
    }

    @Override // androidx.lifecycle.InterfaceC0208
    /* renamed from: ˑʽ */
    public final AbstractC0207 mo1003(Class cls, AbstractC5393 abstractC5393) {
        String str = (String) abstractC5393.mo12171(AbstractC0224.f1238);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (abstractC5393.mo12171(AbstractC0224.f1240) == null || abstractC5393.mo12171(AbstractC0224.f1237) == null) {
            if (this.f1314 != null) {
                return m1090(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) abstractC5393.mo12171(C0217.f1232);
        boolean zIsAssignableFrom = AbstractC0239.class.isAssignableFrom(cls);
        Constructor constructorM1027 = (!zIsAssignableFrom || application == null) ? AbstractC0225.m1027(cls, AbstractC0225.f1242) : AbstractC0225.m1027(cls, AbstractC0225.f1243);
        return constructorM1027 == null ? this.f1310.m1015(cls, abstractC5393) : (!zIsAssignableFrom || application == null) ? AbstractC0225.m1026(cls, constructorM1027, AbstractC0224.m1017(abstractC5393)) : AbstractC0225.m1026(cls, constructorM1027, application, AbstractC0224.m1017(abstractC5393));
    }

    @Override // androidx.lifecycle.InterfaceC0208
    /* renamed from: ـﹶ */
    public final AbstractC0207 mo1004(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m1090(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC0207 m1090(String str, Class cls) throws Exception {
        int i = 1;
        AbstractC0233 abstractC0233 = this.f1314;
        if (abstractC0233 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0239.class.isAssignableFrom(cls);
        Application application = this.f1313;
        Constructor constructorM1027 = (!zIsAssignableFrom || application == null) ? AbstractC0225.m1027(cls, AbstractC0225.f1242) : AbstractC0225.m1027(cls, AbstractC0225.f1243);
        if (constructorM1027 == null) {
            if (application != null) {
                return this.f1310.m1016(cls);
            }
            if (ˊᵔ.ʽᐧ == null) {
                ˊᵔ.ʽᐧ = new ˊᵔ(1);
            }
            ˊᵔ.ʽᐧ.getClass();
            return com.google.android.gms.internal.play_billing.ˎˑ.ˏʾ(cls);
        }
        C3383 c3383 = this.f1311;
        Bundle bundleM8243 = c3383.m8243(str);
        Class[] clsArr = C0251.f1302;
        C0251 c0251M1021 = AbstractC0224.m1021(bundleM8243, this.f1312);
        C0263 c0263 = new C0263(str, c0251M1021);
        if (c0263.f1323) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        c0263.f1323 = true;
        abstractC0233.mo1032(c0263);
        c3383.m8242(str, c0251M1021.f1304);
        EnumC0230 enumC0230 = ((C0236) abstractC0233).f1275;
        if (enumC0230 == EnumC0230.f1250 || enumC0230.m1030(EnumC0230.f1253)) {
            c3383.m8244();
        } else {
            abstractC0233.mo1032(new C0243(abstractC0233, i, c3383));
        }
        AbstractC0207 abstractC0207M1026 = (!zIsAssignableFrom || application == null) ? AbstractC0225.m1026(cls, constructorM1027, c0251M1021) : AbstractC0225.m1026(cls, constructorM1027, application, c0251M1021);
        abstractC0207M1026.m1000("androidx.lifecycle.savedstate.vm.tag", c0263);
        return abstractC0207M1026;
    }
}
