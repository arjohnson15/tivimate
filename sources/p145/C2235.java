package p145;

import java.util.List;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p288.C3397;
import p317.AbstractC3617;
import ˆʽ.ᵎˏ;

/* renamed from: ˉᴵ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2235 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f8899;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List f8900;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f8901;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8902;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f8903;

    public C2235(String str, String str2, String str3, List list, List list2) {
        this.f8902 = str;
        this.f8899 = str2;
        this.f8901 = str3;
        this.f8903 = list;
        this.f8900 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2235) {
            C2235 c2235 = (C2235) obj;
            if (AbstractC1549.m5138(this.f8902, c2235.f8902) && AbstractC1549.m5138(this.f8899, c2235.f8899) && AbstractC1549.m5138(this.f8901, c2235.f8901) && AbstractC1549.m5138(this.f8903, c2235.f8903)) {
                return AbstractC1549.m5138(this.f8900, c2235.f8900);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8900.hashCode() + ((this.f8903.hashCode() + ᵎˏ.ˏʾ(ᵎˏ.ˏʾ(this.f8902.hashCode() * 31, 31, this.f8899), 31, this.f8901)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f8902);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f8899);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f8901);
        sb.append("',\n            |   columnNames = {");
        AbstractC3617.m8554(AbstractC1041.m4033(AbstractC1041.m4017(this.f8903), ",", null, null, null, 62));
        AbstractC3617.m8554("},");
        C3397 c3397 = C3397.f13249;
        sb.append(c3397);
        sb.append("\n            |   referenceColumnNames = {");
        AbstractC3617.m8554(AbstractC1041.m4033(AbstractC1041.m4017(this.f8900), ",", null, null, null, 62));
        AbstractC3617.m8554(" }");
        sb.append(c3397);
        sb.append("\n            |}\n        ");
        return AbstractC3617.m8554(AbstractC3617.m8555(sb.toString()));
    }
}
