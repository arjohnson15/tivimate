package p145;

import java.util.AbstractSet;
import java.util.Map;
import p013.AbstractC1041;
import p013.C1053;
import p070.AbstractC1549;
import p090.C1749;
import p317.AbstractC3617;
import p427.C4914;
import ʽᵔ.ʽⁱ;

/* renamed from: ˉᴵ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2243 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f8935;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractSet f8936;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8937;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractSet f8938;

    public C2243(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f8937 = str;
        this.f8935 = map;
        this.f8936 = abstractSet;
        this.f8938 = abstractSet2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2243 m6238(C1749 c1749, String str) {
        return AbstractC2234.m6234(new C4914(c1749), str);
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2243) {
            C2243 c2243 = (C2243) obj;
            if (this.f8937.equals(c2243.f8937) && AbstractC1549.m5138(this.f8935, c2243.f8935) && AbstractC1549.m5138(this.f8936, c2243.f8936)) {
                AbstractSet abstractSet2 = this.f8938;
                if (abstractSet2 == null || (abstractSet = c2243.f8938) == null) {
                    return true;
                }
                return abstractSet2.equals(abstractSet);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8936.hashCode() + ((this.f8935.hashCode() + (this.f8937.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f8937);
        sb.append("',\n            |    columns = {");
        sb.append(AbstractC2234.m6219(AbstractC1041.m4018(this.f8935.values(), new ʽⁱ(9))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(AbstractC2234.m6219(this.f8936));
        sb.append("\n            |    indices = {");
        AbstractSet abstractSet = this.f8938;
        sb.append(AbstractC2234.m6219(abstractSet != null ? AbstractC1041.m4018(abstractSet, new ʽⁱ(10)) : C1053.f4449));
        sb.append("\n            |}\n        ");
        return AbstractC3617.m8555(sb.toString());
    }
}
