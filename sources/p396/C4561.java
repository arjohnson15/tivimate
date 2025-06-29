package p396;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: ⁱᴵ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4561 implements WildcardType {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Type f17470;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f17471;

    public C4561(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC4581.m10482(typeArr[0]);
            this.f17470 = null;
            this.f17471 = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC4581.m10482(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f17470 = typeArr2[0];
        this.f17471 = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC4581.m10466(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f17470;
        return type != null ? new Type[]{type} : AbstractC4581.f17530;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f17471};
    }

    public final int hashCode() {
        Type type = this.f17470;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f17471.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f17470;
        if (type != null) {
            return "? super " + AbstractC4581.m10481(type);
        }
        Type type2 = this.f17471;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC4581.m10481(type2);
    }
}
