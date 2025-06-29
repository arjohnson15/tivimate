package p396;

import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: ⁱᴵ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4557 implements ParameterizedType {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Type f17464;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Type[] f17465;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f17466;

    public C4557(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC4581.m10482(type3);
        }
        this.f17466 = type;
        this.f17464 = type2;
        this.f17465 = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC4581.m10466(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f17465.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f17466;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f17464;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f17465) ^ this.f17464.hashCode();
        Type type = this.f17466;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f17465;
        int length = typeArr.length;
        Type type = this.f17464;
        if (length == 0) {
            return AbstractC4581.m10481(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC4581.m10481(type));
        sb.append("<");
        sb.append(AbstractC4581.m10481(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC4581.m10481(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
