package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC0100;

/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 f526;

    public Violation(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, String str) {
        super(str);
        this.f526 = abstractComponentCallbacksC0100;
    }
}
