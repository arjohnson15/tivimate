package p345;

import java.util.Map;
import ⁱـ.ˑי;

/* renamed from: ᵎᴵ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3937 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ˑי.ﹶˆ(getKey(), entry.getKey()) && ˑי.ﹶˆ(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
