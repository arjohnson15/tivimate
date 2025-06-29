package p166;

import android.util.SparseBooleanArray;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2414 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SparseBooleanArray f9586;

    public C2414(SparseBooleanArray sparseBooleanArray) {
        this.f9586 = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2414)) {
            return false;
        }
        C2414 c2414 = (C2414) obj;
        int i = AbstractC4470.f17202;
        SparseBooleanArray sparseBooleanArray = this.f9586;
        if (i >= 24) {
            return sparseBooleanArray.equals(c2414.f9586);
        }
        if (sparseBooleanArray.size() != c2414.f9586.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (m6508(i2) != c2414.m6508(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = AbstractC4470.f17202;
        SparseBooleanArray sparseBooleanArray = this.f9586;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + m6508(i2);
        }
        return size;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6508(int i) {
        SparseBooleanArray sparseBooleanArray = this.f9586;
        AbstractC4464.m10152(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }
}
