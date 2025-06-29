package p009;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC0113;
import com.bumptech.glide.ComponentCallbacks2C0283;
import com.bumptech.glide.ComponentCallbacks2C0294;
import p188.C2634;
import p329.AbstractC3742;
import p331.C3759;
import ˈˉ.ﹳﹳ;
import ᵔʼ.ˑʽ;
import ᵔᵔ.ٴˎ;
import ﹳᴵ.ˉי;

/* renamed from: ʻˋ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0985 implements Handler.Callback {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final ˑʽ f4332 = new ˑʽ();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC0993 f4333;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3759 f4334 = new C3759(f4332);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile ComponentCallbacks2C0294 f4335;

    public C0985() {
        this.f4333 = (C2634.f10439 && C2634.f10437) ? new C0982() : new ٴˎ(4);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Activity m3950(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m3950(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ComponentCallbacks2C0294 m3951(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC3742.f14503;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0113) {
                AbstractActivityC0113 abstractActivityC0113 = (AbstractActivityC0113) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return m3951(abstractActivityC0113.getApplicationContext());
                }
                if (abstractActivityC0113.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f4333.mo3948(abstractActivityC0113);
                Activity activityM3950 = m3950(abstractActivityC0113);
                return this.f4334.m8751(abstractActivityC0113, ComponentCallbacks2C0283.m1550(abstractActivityC0113.getApplicationContext()), abstractActivityC0113.getLifecycle(), abstractActivityC0113.getSupportFragmentManager(), activityM3950 == null || !activityM3950.isFinishing());
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m3951(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f4335 == null) {
            synchronized (this) {
                try {
                    if (this.f4335 == null) {
                        this.f4335 = new ComponentCallbacks2C0294(ComponentCallbacks2C0283.m1550(context.getApplicationContext()), new ﹳﹳ(4), new ˉי(4), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f4335;
    }
}
