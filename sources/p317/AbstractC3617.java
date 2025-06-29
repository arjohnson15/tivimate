package p317;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013.AbstractC1037;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p218.AbstractC2834;
import p218.C2837;
import p447.AbstractC5179;
import ﹶⁱ.ـﹶ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ᴵ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3617 extends ᵢʿ {
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static String m8553(String str) {
        Comparable comparable;
        String strSubstring;
        int i = 0;
        List listM7107 = AbstractC2834.m7107(new C2837(AbstractC3616.m8522(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new C3620(str, 1)));
        List list = listM7107;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC3616.m8523((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!ـﹶ.ˆʿ(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM7107.size();
        int iM4009 = AbstractC1037.m4009(listM7107);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1037.m4008();
                throw null;
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == iM4009) && AbstractC3616.m8523(str3)) {
                strSubstring = null;
            } else {
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(AbstractC5179.m11548(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC1041.m4022(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static String m8554(String str) {
        return AbstractC2834.m7108(new C2837(new C2837(AbstractC3616.m8522(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new C3620(str, 1)), new C3620("    ", 0)), "\n");
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static String m8555(String str) {
        if (AbstractC3616.m8523("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM7107 = AbstractC2834.m7107(new C2837(AbstractC3616.m8522(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new C3620(str, 1)));
        int length = str.length();
        listM7107.size();
        int iM4009 = AbstractC1037.m4009(listM7107);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM7107) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC1037.m4008();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM4009) || !AbstractC3616.m8523(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ـﹶ.ˆʿ(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str2.startsWith("|", i3)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC1041.m4022(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }
}
