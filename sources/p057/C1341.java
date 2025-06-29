package p057;

import java.util.Map;
import p070.AbstractC1549;
import p407.InterfaceC4671;

/* renamed from: ʾˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1341 implements Map.Entry, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f5474;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1347 f5475;

    public C1341(C1347 c1347, int i) {
        this.f5475 = c1347;
        this.f5474 = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC1549.m5138(entry.getKey(), getKey()) && AbstractC1549.m5138(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5475.f5502[this.f5474];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5475.f5495[this.f5474];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1347 c1347 = this.f5475;
        c1347.m4695();
        Object[] objArr = c1347.f5495;
        if (objArr == null) {
            int length = c1347.f5502.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c1347.f5495 = objArr;
        }
        int i = this.f5474;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
