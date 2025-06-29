package p061;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: ʾـ.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1391 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SparseArray f5674 = new SparseArray();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5672 = 0;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Set f5673 = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4803(int i, int i2) {
        C1385 c1385M4804 = m4804(i);
        c1385M4804.f5650 = i2;
        ArrayList arrayList = c1385M4804.f5652;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1385 m4804(int i) {
        SparseArray sparseArray = this.f5674;
        C1385 c1385 = (C1385) sparseArray.get(i);
        if (c1385 != null) {
            return c1385;
        }
        C1385 c13852 = new C1385();
        sparseArray.put(i, c13852);
        return c13852;
    }
}
