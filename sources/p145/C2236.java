package p145;

import java.util.ArrayList;
import java.util.List;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p288.C3397;
import p317.AbstractC3617;
import p317.AbstractC3629;

/* renamed from: ˉᴵ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2236 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f8904;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f8905;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8906;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f8907;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public C2236(String str, boolean z, List list, List list2) {
        this.f8906 = str;
        this.f8904 = z;
        this.f8905 = list;
        this.f8907 = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.f8907 = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2236) {
            C2236 c2236 = (C2236) obj;
            if (this.f8904 == c2236.f8904 && AbstractC1549.m5138(this.f8905, c2236.f8905) && AbstractC1549.m5138(this.f8907, c2236.f8907)) {
                String str = this.f8906;
                boolean zM8560 = AbstractC3629.m8560(str, "index_", false);
                String str2 = c2236.f8906;
                return zM8560 ? AbstractC3629.m8560(str2, "index_", false) : str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8906;
        return this.f8907.hashCode() + ((this.f8905.hashCode() + ((((AbstractC3629.m8560(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f8904 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f8906);
        sb.append("',\n            |   unique = '");
        sb.append(this.f8904);
        sb.append("',\n            |   columns = {");
        AbstractC3617.m8554(AbstractC1041.m4033(this.f8905, ",", null, null, null, 62));
        AbstractC3617.m8554("},");
        C3397 c3397 = C3397.f13249;
        sb.append(c3397);
        sb.append("\n            |   orders = {");
        AbstractC3617.m8554(AbstractC1041.m4033(this.f8907, ",", null, null, null, 62));
        AbstractC3617.m8554(" }");
        sb.append(c3397);
        sb.append("\n            |}\n        ");
        return AbstractC3617.m8554(AbstractC3617.m8555(sb.toString()));
    }
}
