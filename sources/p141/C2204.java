package p141;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˉˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2204 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f8670;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f8671;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8672;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f8673;

    public C2204(int i, int i2, int i3, String str) {
        this.f8672 = i;
        this.f8670 = str;
        this.f8671 = i2;
        this.f8673 = i3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2204 m6138(String str) {
        int i = AbstractC4470.f17202;
        String[] strArrSplit = str.split(" ", 2);
        AbstractC4464.m10142(strArrSplit.length == 2);
        String str2 = strArrSplit[0];
        Pattern pattern = AbstractC2214.f8769;
        try {
            int i2 = Integer.parseInt(str2);
            int i3 = -1;
            String[] strArrSplit2 = strArrSplit[1].trim().split("/", -1);
            AbstractC4464.m10142(strArrSplit2.length >= 2);
            String str3 = strArrSplit2[1];
            try {
                int i4 = Integer.parseInt(str3);
                if (strArrSplit2.length == 3) {
                    String str4 = strArrSplit2[2];
                    try {
                        i3 = Integer.parseInt(str4);
                    } catch (NumberFormatException e) {
                        throw ParserException.m1095(str4, e);
                    }
                }
                return new C2204(i2, i4, i3, strArrSplit2[0]);
            } catch (NumberFormatException e2) {
                throw ParserException.m1095(str3, e2);
            }
        } catch (NumberFormatException e3) {
            throw ParserException.m1095(str2, e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2204.class != obj.getClass()) {
            return false;
        }
        C2204 c2204 = (C2204) obj;
        return this.f8672 == c2204.f8672 && this.f8670.equals(c2204.f8670) && this.f8671 == c2204.f8671 && this.f8673 == c2204.f8673;
    }

    public final int hashCode() {
        return ((ᵎˏ.ˏʾ((217 + this.f8672) * 31, 31, this.f8670) + this.f8671) * 31) + this.f8673;
    }
}
