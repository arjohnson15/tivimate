package p072;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;

/* renamed from: ʿʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1605 extends AbstractC1596 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6376 = AtomicReferenceFieldUpdater.newUpdater(C1605.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1602 f6377;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InterfaceC1639 f6378;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1582 f6379;

    public C1605(C1582 c1582, C1602 c1602) {
        this.f6379 = c1582;
        this.f6377 = c1602;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˉי */
    public final boolean mo5174() {
        return false;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˏʾ */
    public final void mo5175(Throwable th) {
        C1602 c1602 = this.f6377;
        if (th != null) {
            c1602.getClass();
            C1228 c1228M5216 = c1602.m5216(new C1626(th, false), null);
            if (c1228M5216 != null) {
                c1602.mo5181(c1228M5216);
                C1638 c1638 = (C1638) f6376.get(this);
                if (c1638 != null) {
                    c1638.m5279();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1582.f6335;
        C1582 c1582 = this.f6379;
        if (atomicIntegerFieldUpdater.decrementAndGet(c1582) == 0) {
            InterfaceC1637[] interfaceC1637Arr = c1582.f6336;
            ArrayList arrayList = new ArrayList(interfaceC1637Arr.length);
            for (InterfaceC1637 interfaceC1637 : interfaceC1637Arr) {
                arrayList.add(interfaceC1637.m5278());
            }
            c1602.mo3974(arrayList);
        }
    }
}
