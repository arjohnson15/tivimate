package p366;

import java.io.File;
import java.util.ArrayList;
import p070.AbstractC1549;
import p376.AbstractC4320;

/* renamed from: ᵔﾞ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4167 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final String f16083 = File.separator;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4155 f16084;

    public C4167(C4155 c4155) {
        this.f16084 = c4155;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16084.compareTo(((C4167) obj).f16084);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4167) && AbstractC1549.m5138(((C4167) obj).f16084, this.f16084);
    }

    public final int hashCode() {
        return this.f16084.hashCode();
    }

    public final String toString() {
        return this.f16084.m9564();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4167 m9579(String str) {
        C4143 c4143 = new C4143();
        c4143.m9496(str);
        return AbstractC4320.m9815(this, AbstractC4320.m9820(c4143, false), false);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Character m9580() {
        C4155 c4155 = AbstractC4320.f16780;
        C4155 c41552 = this.f16084;
        if (C4155.m9558(c41552, c4155) != -1 || c41552.mo9566() < 2 || c41552.mo9565(1) != 58) {
            return null;
        }
        char cMo9565 = (char) c41552.mo9565(0);
        if (('a' > cMo9565 || cMo9565 >= '{') && ('A' > cMo9565 || cMo9565 >= '[')) {
            return null;
        }
        return Character.valueOf(cMo9565);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList m9581() {
        ArrayList arrayList = new ArrayList();
        int iM9818 = AbstractC4320.m9818(this);
        C4155 c4155 = this.f16084;
        if (iM9818 == -1) {
            iM9818 = 0;
        } else if (iM9818 < c4155.mo9566() && c4155.mo9565(iM9818) == 92) {
            iM9818++;
        }
        int iMo9566 = c4155.mo9566();
        int i = iM9818;
        while (iM9818 < iMo9566) {
            if (c4155.mo9565(iM9818) == 47 || c4155.mo9565(iM9818) == 92) {
                arrayList.add(c4155.mo9562(i, iM9818));
                i = iM9818 + 1;
            }
            iM9818++;
        }
        if (i < c4155.mo9566()) {
            arrayList.add(c4155.mo9562(i, c4155.mo9566()));
        }
        return arrayList;
    }
}
