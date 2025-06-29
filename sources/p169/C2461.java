package p169;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import p435.AbstractC5047;

/* renamed from: ˋʿ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2461 implements WildcardType {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Type f9793;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f9794;

    public C2461(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC2458.m6572(typeArr[0]);
            this.f9793 = null;
            this.f9794 = AbstractC2458.m6577(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        AbstractC2458.m6572(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f9793 = AbstractC2458.m6577(typeArr2[0]);
        this.f9794 = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC5047.m11166(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f9793;
        return type != null ? new Type[]{type} : AbstractC2458.f9785;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f9794};
    }

    public final int hashCode() {
        Type type = this.f9793;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f9794.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f9793;
        if (type != null) {
            return "? super " + AbstractC2458.m6581(type);
        }
        Type type2 = this.f9794;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC2458.m6581(type2);
    }
}
