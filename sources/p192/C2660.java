package p192;

import android.util.SparseArray;

/* renamed from: ˎˉ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2660 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C2655 f10542;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SparseArray f10543;

    public C2660(int i) {
        this.f10543 = new SparseArray(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6837(C2655 c2655, int i, int i2) {
        int iM6835 = c2655.m6835(i);
        SparseArray sparseArray = this.f10543;
        C2660 c2660 = sparseArray == null ? null : (C2660) sparseArray.get(iM6835);
        if (c2660 == null) {
            c2660 = new C2660(1);
            sparseArray.put(c2655.m6835(i), c2660);
        }
        if (i2 > i) {
            c2660.m6837(c2655, i + 1, i2);
        } else {
            c2660.f10542 = c2655;
        }
    }
}
