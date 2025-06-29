package p372;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ᵢˆ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4236 extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
