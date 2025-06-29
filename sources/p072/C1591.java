package p072;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ʿʽ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1591 extends C1626 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6351 = AtomicIntegerFieldUpdater.newUpdater(C1591.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1591(C1602 c1602, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c1602 + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
