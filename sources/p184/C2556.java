package p184;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010.AbstractC1014;
import p010.AbstractC1016;
import p010.C1017;
import p010.InterfaceC1008;
import p034.C1228;
import p070.AbstractC1549;
import p072.C1602;
import p288.C3397;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ˎ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2556 extends AbstractC1016 implements InterfaceC2544, InterfaceC2551, InterfaceC1008 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10135 = AtomicReferenceFieldUpdater.newUpdater(C2556.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f10136;

    public C2556(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p010.InterfaceC1008
    /* renamed from: ʽᐧ */
    public final InterfaceC2551 mo3960(InterfaceC3747 interfaceC3747, int i, int i2) {
        return ((((i < 0 || i >= 2) && i != -2) || i2 != 2) && !((i == 0 || i == -3) && i2 == 1)) ? new C1017(this, interfaceC3747, i, i2) : this;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6675(Object obj) {
        int i;
        C2542[] c2542Arr;
        C1228 c1228;
        if (obj == null) {
            obj = AbstractC1014.f4386;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10135;
            if (AbstractC1549.m5138(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f10136;
            if ((i2 & 1) != 0) {
                this.f10136 = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f10136 = i3;
            C2542[] c2542Arr2 = this.f4393;
            while (true) {
                if (c2542Arr2 != null) {
                    for (C2542 c2542 : c2542Arr2) {
                        if (c2542 != null) {
                            AtomicReference atomicReference = c2542.f10091;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (c1228 = AbstractC2539.f10081)) {
                                    C1228 c12282 = AbstractC2539.f10082;
                                    if (obj2 != c12282) {
                                        while (!atomicReference.compareAndSet(obj2, c12282)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((C1602) obj2).mo3974(C3397.f13249);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, c1228)) {
                                        if (atomicReference.get() != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f10136;
                    if (i == i3) {
                        this.f10136 = i3 + 1;
                        return;
                    }
                    c2542Arr = this.f4393;
                }
                c2542Arr2 = c2542Arr;
                i3 = i;
            }
        }
    }

    @Override // p184.InterfaceC2552
    /* renamed from: ˏʾ */
    public final Object mo3959(Object obj, InterfaceC3746 interfaceC3746) {
        m6675(obj);
        return C3397.f13249;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x013b, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00bf, B:52:0x00c7, B:55:0x00ce, B:56:0x00d2, B:58:0x00d5, B:68:0x00f6, B:71:0x0103, B:72:0x011d, B:78:0x012f, B:75:0x0126, B:77:0x012c, B:60:0x00db, B:64:0x00e2, B:21:0x0053, B:24:0x005e, B:49:0x00b2), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00bf, B:52:0x00c7, B:55:0x00ce, B:56:0x00d2, B:58:0x00d5, B:68:0x00f6, B:71:0x0103, B:72:0x011d, B:78:0x012f, B:75:0x0126, B:77:0x012c, B:60:0x00db, B:64:0x00e2, B:21:0x0053, B:24:0x005e, B:49:0x00b2), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00bf, B:52:0x00c7, B:55:0x00ce, B:56:0x00d2, B:58:0x00d5, B:68:0x00f6, B:71:0x0103, B:72:0x011d, B:78:0x012f, B:75:0x0126, B:77:0x012c, B:60:0x00db, B:64:0x00e2, B:21:0x0053, B:24:0x005e, B:49:0x00b2), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0102 -> B:50:0x00bf). Please report as a decompilation issue!!! */
    @Override // p184.InterfaceC2551
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3972(p184.InterfaceC2552 r17, p330.InterfaceC3746 r18) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p184.C2556.mo3972(ˎ.ᐧʻ, ᴵⁱ.ʿʼ):java.lang.Object");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object m6676() {
        C1228 c1228 = AbstractC1014.f4386;
        Object obj = f10135.get(this);
        if (obj == c1228) {
            return null;
        }
        return obj;
    }
}
