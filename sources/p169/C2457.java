package p169;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p435.AbstractC5047;

/* renamed from: ˋʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2457 implements GenericArrayType {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f9784;

    public C2457(Type type) {
        this.f9784 = AbstractC2458.m6577(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC5047.m11166(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9784;
    }

    public final int hashCode() {
        return this.f9784.hashCode();
    }

    public final String toString() {
        return AbstractC2458.m6581(this.f9784) + "[]";
    }
}
