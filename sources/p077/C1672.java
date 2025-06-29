package p077;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p013.AbstractC1041;
import p070.AbstractC1549;

/* renamed from: ʿˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1672 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AtomicBoolean f6522;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Map f6523;

    public C1672(Map map, boolean z) {
        this.f6523 = map;
        this.f6522 = new AtomicBoolean(z);
    }

    public /* synthetic */ C1672(boolean z) {
        this(new LinkedHashMap(), z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1672)) {
            return false;
        }
        return AbstractC1549.m5138(this.f6523, ((C1672) obj).f6523);
    }

    public final int hashCode() {
        return this.f6523.hashCode();
    }

    public final String toString() {
        return AbstractC1041.m4033(this.f6523.entrySet(), ",\n", "{\n", "\n}", C1676.f6529, 24);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5362(C1673 c1673, Object obj) {
        AtomicBoolean atomicBoolean = this.f6522;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        Map map = this.f6523;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            map.remove(c1673);
        } else if (obj instanceof Set) {
            map.put(c1673, DesugarCollections.unmodifiableSet(AbstractC1041.m4029((Iterable) obj)));
        } else {
            map.put(c1673, obj);
        }
    }
}
