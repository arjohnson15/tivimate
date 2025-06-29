package p072;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ʿʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1582 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6335 = AtomicIntegerFieldUpdater.newUpdater(C1582.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1637[] f6336;

    public C1582(InterfaceC1637[] interfaceC1637Arr) {
        this.f6336 = interfaceC1637Arr;
        this.notCompletedCount$volatile = interfaceC1637Arr.length;
    }
}
