package p072;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ʿʽ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1590 implements InterfaceC1577 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6347 = AtomicIntegerFieldUpdater.newUpdater(C1590.class, "_isCompleting$volatile");

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6348 = AtomicReferenceFieldUpdater.newUpdater(C1590.class, Object.class, "_rootCause$volatile");

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6349 = AtomicReferenceFieldUpdater.newUpdater(C1590.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1611 f6350;

    public C1590(C1611 c1611, Throwable th) {
        this.f6350 = c1611;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m5183());
        sb.append(", completing=");
        sb.append(f6347.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m5184());
        sb.append(", exceptions=");
        sb.append(f6349.get(this));
        sb.append(", list=");
        sb.append(this.f6350);
        sb.append(']');
        return sb.toString();
    }

    @Override // p072.InterfaceC1577
    /* renamed from: ʽᐧ */
    public final boolean mo5166() {
        return m5184() == null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m5183() {
        return m5184() != null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Throwable m5184() {
        return (Throwable) f6348.get(this);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5185(Throwable th) {
        Throwable thM5184 = m5184();
        if (thM5184 == null) {
            f6348.set(this, th);
            return;
        }
        if (th == thM5184) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6349;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList m5186(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6349;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM5184 = m5184();
        if (thM5184 != null) {
            arrayList.add(0, thM5184);
        }
        if (th != null && !th.equals(thM5184)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1642.f6418);
        return arrayList;
    }

    @Override // p072.InterfaceC1577
    /* renamed from: ﹳﹳ */
    public final C1611 mo5167() {
        return this.f6350;
    }
}
