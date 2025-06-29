package p145;

import java.util.AbstractSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p317.AbstractC3617;

/* renamed from: ˉᴵ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2245 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractSet f8944;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Set f8945;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8946;

    public C2245(String str, AbstractSet abstractSet, Set set) {
        this.f8946 = str;
        this.f8944 = abstractSet;
        this.f8945 = set;
    }

    public C2245(String str, LinkedHashSet linkedHashSet, String str2) {
        this(str, linkedHashSet, AbstractC2234.m6221(str2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2245) {
            C2245 c2245 = (C2245) obj;
            if (AbstractC1549.m5138(this.f8946, c2245.f8946) && AbstractC1549.m5138(this.f8944, c2245.f8944)) {
                return AbstractC1549.m5138(this.f8945, c2245.f8945);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8945.hashCode() + ((this.f8944.hashCode() + (this.f8946.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return AbstractC3617.m8555("\n            |FtsTableInfo {\n            |   name = '" + this.f8946 + "',\n            |   columns = {" + AbstractC2234.m6219(AbstractC1041.m4017(this.f8944)) + "\n            |   options = {" + AbstractC2234.m6219(AbstractC1041.m4017(this.f8945)) + "\n            |}\n        ");
    }
}
