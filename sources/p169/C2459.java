package p169;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import p435.AbstractC5047;

/* renamed from: ˋʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2459 implements ParameterizedType {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Type f9789;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Type[] f9790;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f9791;

    public C2459(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC5047.m11172(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f9791 = type == null ? null : AbstractC2458.m6577(type);
        this.f9789 = AbstractC2458.m6577(type2);
        this.f9790 = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f9790;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            AbstractC2458.m6572(this.f9790[i]);
            Type[] typeArr3 = this.f9790;
            typeArr3[i] = AbstractC2458.m6577(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC5047.m11166(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f9790.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f9791;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9789;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f9790) ^ this.f9789.hashCode();
        Set set = AbstractC2458.f9787;
        Type type = this.f9791;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f9790;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC2458.m6581(this.f9789));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(AbstractC2458.m6581(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC2458.m6581(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
