package p061;

import android.database.Observable;

/* renamed from: ʾـ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1428 extends Observable {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4950() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1382) ((Observable) this).mObservers.get(size)).mo4709();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4951(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1382) ((Observable) this).mObservers.get(size)).mo4708(i, i2);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4952(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1382) ((Observable) this).mObservers.get(size)).mo4712(i, i2);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m4953() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4954(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1382) ((Observable) this).mObservers.get(size)).mo4707(i, i2);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4955() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1382) ((Observable) this).mObservers.get(size)).mo4710();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4956(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1382) ((Observable) this).mObservers.get(size)).mo4706(i, i2, obj);
        }
    }
}
