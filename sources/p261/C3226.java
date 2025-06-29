package p261;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p329.AbstractC3740;

/* renamed from: ـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3226 extends WeakReference {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f12542;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC3251 f12543;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3234 f12544;

    public C3226(C3234 c3234, C3245 c3245, ReferenceQueue referenceQueue) {
        super(c3245, referenceQueue);
        AbstractC3740.m8706(c3234, "Argument must not be null");
        this.f12544 = c3234;
        boolean z = c3245.f12653;
        this.f12543 = null;
        this.f12542 = z;
    }
}
