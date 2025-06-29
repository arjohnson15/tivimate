package p297;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: ٴﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3490 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3489 f13484 = C3489.f13483;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8379(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            "StrictMode violation in ".concat(violation.f526.getClass().getName());
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final void m8380(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, String str) {
        m8379(new FragmentReuseViolation(abstractComponentCallbacksC0100, "Attempting to reuse fragment " + abstractComponentCallbacksC0100 + " with previous ID " + str));
        m8381(abstractComponentCallbacksC0100).getClass();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3489 m8381(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        while (abstractComponentCallbacksC0100 != null) {
            if (abstractComponentCallbacksC0100.isAdded()) {
                abstractComponentCallbacksC0100.getParentFragmentManager();
            }
            abstractComponentCallbacksC0100 = abstractComponentCallbacksC0100.getParentFragment();
        }
        return f13484;
    }
}
