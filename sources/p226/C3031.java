package p226;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0118;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p013.C1056;

/* renamed from: ˑʽ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3031 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1056 f11707 = new C1056();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f11708;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C0118 f11709;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Runnable f11710;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f11711;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f11712;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final OnBackInvokedCallback f11713;

    public C3031(Runnable runnable) {
        this.f11710 = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f11713 = i >= 34 ? C3043.f11740.m7536(new C3035(this, 0), new C3035(this, 1), new C3038(this, 0), new C3038(this, 1)) : C3044.f11741.m7539(new C3038(this, 2));
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7524(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f11708;
        OnBackInvokedCallback onBackInvokedCallback = this.f11713;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C3044 c3044 = C3044.f11741;
        if (z && !this.f11711) {
            c3044.m7537(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f11711 = true;
        } else {
            if (z || !this.f11711) {
                return;
            }
            c3044.m7538(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f11711 = false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7525() {
        boolean z = this.f11712;
        C1056 c1056 = this.f11707;
        boolean z2 = false;
        if (!(c1056 instanceof Collection) || !c1056.isEmpty()) {
            Iterator it = c1056.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0118) it.next()).f713) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f11712 = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m7524(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7526() {
        C0118 c0118Previous;
        C0118 c0118 = this.f11709;
        if (c0118 == null) {
            C1056 c1056 = this.f11707;
            ListIterator listIterator = c1056.listIterator(c1056.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0118Previous = 0;
                    break;
                } else {
                    c0118Previous = listIterator.previous();
                    if (((C0118) c0118Previous).f713) {
                        break;
                    }
                }
            }
            c0118 = c0118Previous;
        }
        this.f11709 = null;
        if (c0118 != null) {
            c0118.m745();
            return;
        }
        Runnable runnable = this.f11710;
        if (runnable != null) {
            runnable.run();
        }
    }
}
