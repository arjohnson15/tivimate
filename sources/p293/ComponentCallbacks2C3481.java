package p293;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ٴᵎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C3481 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final ComponentCallbacks2C3481 f13440 = new ComponentCallbacks2C3481();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AtomicBoolean f13444 = new AtomicBoolean();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AtomicBoolean f13441 = new AtomicBoolean();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ArrayList f13442 = new ArrayList();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f13443 = false;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8357(Application application) {
        ComponentCallbacks2C3481 componentCallbacks2C3481 = f13440;
        synchronized (componentCallbacks2C3481) {
            try {
                if (!componentCallbacks2C3481.f13443) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3481);
                    application.registerComponentCallbacks(componentCallbacks2C3481);
                    componentCallbacks2C3481.f13443 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f13441;
        boolean zCompareAndSet = this.f13444.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m8358(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f13441;
        boolean zCompareAndSet = this.f13444.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m8358(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f13444.compareAndSet(false, true)) {
            this.f13441.set(true);
            m8358(true);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8358(boolean z) {
        synchronized (f13440) {
            try {
                Iterator it = this.f13442.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3472) it.next()).mo7087(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8359(InterfaceC3472 interfaceC3472) {
        synchronized (f13440) {
            this.f13442.add(interfaceC3472);
        }
    }
}
