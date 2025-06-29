package p435;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ﹶᵔ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5062 extends AbstractSet {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C5045 f19207;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19208;

    public /* synthetic */ C5062(C5045 c5045, int i) {
        this.f19208 = i;
        this.f19207 = c5045;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f19208) {
            case 0:
                this.f19207.clear();
                break;
            default:
                this.f19207.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C5040 c5040M11163;
        Object obj2;
        Object value;
        switch (this.f19208) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C5045 c5045 = this.f19207;
                c5045.getClass();
                Object key = entry.getKey();
                C5040 c5040 = null;
                if (key != null) {
                    try {
                        c5040M11163 = c5045.m11163(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c5040M11163 = null;
                }
                if (c5040M11163 != null && ((obj2 = c5040M11163.f19123) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c5040 = c5040M11163;
                }
                return c5040 != null;
            default:
                return this.f19207.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f19208) {
            case 0:
                return new C5060(this.f19207, 0);
            default:
                return new C5060(this.f19207, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5040 c5040M11163;
        Object obj2;
        Object value;
        switch (this.f19208) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C5045 c5045 = this.f19207;
                c5045.getClass();
                Object key = entry.getKey();
                C5040 c5040 = null;
                if (key != null) {
                    try {
                        c5040M11163 = c5045.m11163(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c5040M11163 = null;
                }
                if (c5040M11163 != null && ((obj2 = c5040M11163.f19123) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c5040 = c5040M11163;
                }
                if (c5040 == null) {
                    return false;
                }
                c5045.m11162(c5040, true);
                return true;
            default:
                C5045 c50452 = this.f19207;
                c50452.getClass();
                C5040 c5040M111632 = null;
                if (obj != null) {
                    try {
                        c5040M111632 = c50452.m11163(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c5040M111632 != null) {
                    c50452.m11162(c5040M111632, true);
                }
                return c5040M111632 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f19208) {
        }
        return this.f19207.f19142;
    }
}
