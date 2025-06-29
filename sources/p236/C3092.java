package p236;

import android.os.Looper;
import p007.ExecutorC0955;
import ʼˉ.ٴˎ;

/* renamed from: ˑי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3092 extends ٴˎ {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static volatile C3092 f11931;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final ExecutorC0955 f11932 = new ExecutorC0955(2);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3091 f11933 = new C3091();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C3092 m7596() {
        if (f11931 != null) {
            return f11931;
        }
        synchronized (C3092.class) {
            try {
                if (f11931 == null) {
                    f11931 = new C3092();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11931;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m7597(Runnable runnable) {
        C3091 c3091 = this.f11933;
        if (c3091.f11930 == null) {
            synchronized (c3091.f11928) {
                try {
                    if (c3091.f11930 == null) {
                        c3091.f11930 = C3091.m7595(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c3091.f11930.post(runnable);
    }
}
