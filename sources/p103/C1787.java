package p103;

import java.util.Collections;
import java.util.Map;

/* renamed from: ˆי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1787 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Map f6930;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f6931;

    public C1787(String str, Map map) {
        this.f6931 = str;
        this.f6930 = map;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1787 m5530(String str) {
        return new C1787(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1787)) {
            return false;
        }
        C1787 c1787 = (C1787) obj;
        return this.f6931.equals(c1787.f6931) && this.f6930.equals(c1787.f6930);
    }

    public final int hashCode() {
        return this.f6930.hashCode() + (this.f6931.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f6931 + ", properties=" + this.f6930.values() + "}";
    }
}
