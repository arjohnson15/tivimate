package p429;

import p070.AbstractC1549;
import ـˈ.ˉᵎ;

/* renamed from: ﹶˎ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4975 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18806;

    public C4975(String str) {
        this.f18806 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4975) && AbstractC1549.m5138(this.f18806, ((C4975) obj).f18806);
    }

    public final int hashCode() {
        String str = this.f18806;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ˑי(new StringBuilder("FirebaseSessionsData(sessionId="), this.f18806, ')');
    }
}
