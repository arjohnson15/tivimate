package p430;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p070.AbstractC1549;
import p158.AbstractC2339;
import p163.C2358;
import p237.C3093;
import p317.AbstractC3616;
import ﾞﹶ.ᵢʿ;

/* renamed from: ﹶˏ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5004 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final char[] f18952 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18953;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f18954;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean f18955;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f18956;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f18957;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18958;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList f18959;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayList f18960;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f18961;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f18962;

    public C5004(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f18958 = str;
        this.f18953 = str2;
        this.f18957 = str3;
        this.f18961 = str4;
        this.f18954 = i;
        this.f18959 = arrayList;
        this.f18960 = arrayList2;
        this.f18956 = str5;
        this.f18962 = str6;
        this.f18955 = AbstractC1549.m5138(str, "https");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5004) && AbstractC1549.m5138(((C5004) obj).f18962, this.f18962);
    }

    public final int hashCode() {
        return this.f18962.hashCode();
    }

    public final String toString() {
        return this.f18962;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m11090() {
        int length = this.f18958.length() + 3;
        String str = this.f18962;
        int iM8527 = AbstractC3616.m8527(str, '/', length, false, 4);
        return str.substring(iM8527, AbstractC2339.m6428(iM8527, str.length(), str, "?#"));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String m11091() {
        if (this.f18953.length() == 0) {
            return "";
        }
        int length = this.f18958.length() + 3;
        String str = this.f18962;
        return str.substring(length, AbstractC2339.m6428(length, str.length(), str, ":@"));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String m11092() {
        C3093 c3093M11095 = m11095("/...");
        c3093M11095.getClass();
        c3093M11095.f11941 = C4991.m11077("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        c3093M11095.f11935 = C4991.m11077("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return c3093M11095.m7602().f18962;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList m11093() {
        int length = this.f18958.length() + 3;
        String str = this.f18962;
        int iM8527 = AbstractC3616.m8527(str, '/', length, false, 4);
        int iM6428 = AbstractC2339.m6428(iM8527, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM8527 < iM6428) {
            int i = iM8527 + 1;
            int iM6441 = AbstractC2339.m6441(str, '/', i, iM6428);
            arrayList.add(str.substring(i, iM6441));
            iM8527 = iM6441;
        }
        return arrayList;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m11094() {
        if (this.f18957.length() == 0) {
            return "";
        }
        int length = this.f18958.length() + 3;
        String str = this.f18962;
        return str.substring(AbstractC3616.m8527(str, ':', length, false, 4) + 1, AbstractC3616.m8527(str, '@', 0, false, 6));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3093 m11095(String str) {
        try {
            C3093 c3093 = new C3093();
            c3093.m7601(this, str);
            return c3093;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String m11096(String str) {
        ArrayList arrayList = this.f18960;
        if (arrayList == null) {
            return null;
        }
        C2358 c2358 = ᵢʿ.ˈٴ(ᵢʿ.ˎˑ(0, arrayList.size()), 2);
        int i = c2358.f9332;
        int i2 = c2358.f9330;
        int i3 = c2358.f9331;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!str.equals(arrayList.get(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return (String) arrayList.get(i + 1);
        }
        return null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m11097() {
        if (this.f18960 == null) {
            return null;
        }
        String str = this.f18962;
        int iM8527 = AbstractC3616.m8527(str, '?', 0, false, 6) + 1;
        return str.substring(iM8527, AbstractC2339.m6441(str, '#', iM8527, str.length()));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final URI m11098() {
        String strSubstring;
        C3093 c3093 = new C3093();
        String str = this.f18958;
        c3093.f11937 = str;
        c3093.f11941 = m11091();
        c3093.f11935 = m11094();
        c3093.f11939 = this.f18961;
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f18954;
        c3093.f11934 = i2 != i ? i2 : -1;
        ArrayList arrayList = (ArrayList) c3093.f11940;
        arrayList.clear();
        arrayList.addAll(m11093());
        String strM11097 = m11097();
        c3093.f11936 = strM11097 != null ? C4991.m11079(C4991.m11077(strM11097, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f18956 == null) {
            strSubstring = null;
        } else {
            String str2 = this.f18962;
            strSubstring = str2.substring(AbstractC3616.m8527(str2, '#', 0, false, 6) + 1);
        }
        c3093.f11942 = strSubstring;
        String str3 = (String) c3093.f11939;
        c3093.f11939 = str3 != null ? Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("") : null;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C4991.m11077((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = (ArrayList) c3093.f11936;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? C4991.m11077(str4, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str5 = (String) c3093.f11942;
        c3093.f11942 = str5 != null ? C4991.m11077(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = c3093.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }
}
