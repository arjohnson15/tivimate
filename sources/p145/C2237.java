package p145;

import java.util.Locale;
import p070.AbstractC1549;
import p317.AbstractC3616;
import p317.AbstractC3617;

/* renamed from: ˉᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2237 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f8908;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f8909;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f8910;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8911;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f8912;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f8913;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f8914;

    public C2237(int i, int i2, String str, String str2, String str3, boolean z) {
        this.f8911 = str;
        this.f8908 = str2;
        this.f8910 = z;
        this.f8914 = i;
        this.f8909 = str3;
        this.f8912 = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.f8913 = AbstractC3616.m8533(upperCase, "INT", false) ? 3 : (AbstractC3616.m8533(upperCase, "CHAR", false) || AbstractC3616.m8533(upperCase, "CLOB", false) || AbstractC3616.m8533(upperCase, "TEXT", false)) ? 2 : AbstractC3616.m8533(upperCase, "BLOB", false) ? 5 : (AbstractC3616.m8533(upperCase, "REAL", false) || AbstractC3616.m8533(upperCase, "FLOA", false) || AbstractC3616.m8533(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2237) {
            C2237 c2237 = (C2237) obj;
            if (this.f8914 == c2237.f8914 && AbstractC1549.m5138(this.f8911, c2237.f8911) && this.f8910 == c2237.f8910) {
                int i = c2237.f8912;
                String str = c2237.f8909;
                String str2 = this.f8909;
                int i2 = this.f8912;
                if ((i2 != 1 || i != 2 || str2 == null || AbstractC2234.m6227(str2, str)) && ((i2 != 2 || i != 1 || str == null || AbstractC2234.m6227(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : AbstractC2234.m6227(str2, str))) && this.f8913 == c2237.f8913))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f8911.hashCode() * 31) + this.f8913) * 31) + (this.f8910 ? 1231 : 1237)) * 31) + this.f8914;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f8911);
        sb.append("',\n            |   type = '");
        sb.append(this.f8908);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f8913);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f8910);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f8914);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f8909;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return AbstractC3617.m8554(AbstractC3617.m8555(sb.toString()));
    }
}
