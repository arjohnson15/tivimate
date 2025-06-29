package p271;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ـٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3295 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3295 f12832 = new C3295(DesugarCollections.unmodifiableMap(new HashMap()));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Map f12833;

    public C3295(Map map) {
        this.f12833 = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3295) {
            return this.f12833.equals(((C3295) obj).f12833);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12833.hashCode();
    }

    public final String toString() {
        return this.f12833.toString();
    }
}
