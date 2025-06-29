package p072;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ʿʽ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1626 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6401 = AtomicIntegerFieldUpdater.newUpdater(C1626.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Throwable f6402;

    public C1626(Throwable th, boolean z) {
        this.f6402 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f6402 + ']';
    }
}
