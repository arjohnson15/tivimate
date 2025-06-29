package p396;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: ⁱᴵ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4596 implements GenericArrayType {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f17594;

    public C4596(Type type) {
        this.f17594 = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC4581.m10466(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f17594;
    }

    public final int hashCode() {
        return this.f17594.hashCode();
    }

    public final String toString() {
        return AbstractC4581.m10481(this.f17594) + "[]";
    }
}
