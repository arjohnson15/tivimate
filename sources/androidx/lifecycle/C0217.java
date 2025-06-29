package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import p458.AbstractC5393;

/* renamed from: androidx.lifecycle.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0217 extends ˊᵔ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final ﹳᴵ.ˉי f1232 = new ﹳᴵ.ˉי(1);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C0217 f1233;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Application f1234;

    public C0217(Application application) {
        super(1);
        this.f1234 = application;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static AbstractC0207 m1014(Class cls, Application application) {
        if (!AbstractC0239.class.isAssignableFrom(cls)) {
            return com.google.android.gms.internal.play_billing.ˎˑ.ˏʾ(cls);
        }
        try {
            return (AbstractC0207) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC0207 m1015(Class cls, AbstractC5393 abstractC5393) {
        if (this.f1234 != null) {
            return m1016(cls);
        }
        Application application = (Application) abstractC5393.mo12171(f1232);
        if (application != null) {
            return m1014(cls, application);
        }
        if (AbstractC0239.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return com.google.android.gms.internal.play_billing.ˎˑ.ˏʾ(cls);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0207 m1016(Class cls) {
        Application application = this.f1234;
        if (application != null) {
            return m1014(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
