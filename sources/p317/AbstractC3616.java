package p317;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p013.AbstractC1039;
import p013.C1057;
import p163.C2357;
import p163.C2358;
import p447.AbstractC5179;
import ـˈ.ˉᵎ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᴵ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3616 extends AbstractC3629 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m8512(String str, char c) {
        int iM8534 = m8534(str, c, 0, 6);
        return iM8534 == -1 ? str : str.substring(0, iM8534);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static boolean m8513(String str, char c) {
        return str.length() > 0 && ـﹶ.ˎٴ(str.charAt(0), c, false);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static boolean m8514(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && ـﹶ.ˎٴ(charSequence.charAt(m8544(charSequence)), c, false);
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static String m8515(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public static String m8516(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final boolean m8517(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ـﹶ.ˎٴ(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public static String m8518(String str, String str2) {
        int iM8528 = m8528(6, str, str2);
        return iM8528 == -1 ? str : str.substring(0, iM8528);
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public static String m8519(String str, char c, String str2) {
        int iM8534 = m8534(str, c, 0, 6);
        return iM8534 == -1 ? str2 : str.substring(iM8534 + 1, str.length());
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final int m8520(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM8544 = m8544(charSequence);
        if (i > iM8544) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ـﹶ.ˎٴ(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM8544) {
                return -1;
            }
            i++;
        }
    }

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public static String m8521(String str, String str2) {
        int iM8528 = m8528(6, str, str2);
        return iM8528 == -1 ? str : str.substring(str2.length() + iM8528, str.length());
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static C3623 m8522(CharSequence charSequence, String[] strArr, boolean z, int i) {
        m8542(i);
        return new C3623(charSequence, 0, i, new C3631(1, Arrays.asList(strArr), z));
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static boolean m8523(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ـﹶ.ˆʿ(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public static String m8524(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static final int m8525(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C2358 c2358;
        if (z2) {
            int iM8544 = m8544(charSequence);
            if (i > iM8544) {
                i = iM8544;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c2358 = new C2358(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c2358 = new C2357(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c2358.f9331;
        int i4 = c2358.f9330;
        int i5 = c2358.f9332;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length2 = ((String) charSequence2).length();
                    if (!(!z ? str.regionMatches(0, str2, i5, length2) : str.regionMatches(z, 0, str2, i5, length2))) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m8517(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public static String m8526(String str, char c) {
        int iM8527 = m8527(str, c, 0, false, 6);
        return iM8527 == -1 ? str : str.substring(iM8527 + 1, str.length());
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static int m8527(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return (z || !(charSequence instanceof String)) ? m8520(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static int m8528(int i, String str, String str2) {
        int iM8544 = (i & 2) != 0 ? m8544(str) : 0;
        return !(str instanceof String) ? m8525(str, str2, iM8544, 0, false, true) : str.lastIndexOf(str2, iM8544);
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static final List m8530(int i, CharSequence charSequence, String str, boolean z) {
        m8542(i);
        int length = 0;
        int iM8551 = m8551(0, charSequence, str, z);
        if (iM8551 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iM8551).toString());
            length = str.length() + iM8551;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM8551 = m8551(length, charSequence, str, z);
        } while (iM8551 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static String m8531(String str, String str2) {
        int iM8540 = m8540(str, str2, 0, false, 6);
        return iM8540 == -1 ? str : str.substring(0, iM8540);
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public static List m8532(CharSequence charSequence, char[] cArr) {
        boolean z = false;
        if (cArr.length == 1) {
            return m8530(0, charSequence, String.valueOf(cArr[0]), false);
        }
        m8542(0);
        C1057 c1057 = new C1057(1, new C3623(charSequence, 0, 0, new C3631(0, cArr, z)));
        ArrayList arrayList = new ArrayList(AbstractC1039.m4012(c1057, 10));
        Iterator it = c1057.iterator();
        while (true) {
            C3614 c3614 = (C3614) it;
            if (!c3614.hasNext()) {
                return arrayList;
            }
            C2357 c2357 = (C2357) c3614.next();
            arrayList.add(charSequence.subSequence(c2357.f9332, c2357.f9330 + 1).toString());
        }
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static boolean m8533(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m8540(charSequence, (String) charSequence2, 0, z, 2) < 0) {
                return false;
            }
        } else if (m8525(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public static int m8534(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m8544(str);
        }
        if (str instanceof String) {
            return str.lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (str instanceof String) {
            return str.lastIndexOf(cArr[0], i);
        }
        int iM8544 = m8544(str);
        if (i > iM8544) {
            i = iM8544;
        }
        while (-1 < i) {
            if (ـﹶ.ˎٴ(cArr[0], str.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static StringBuilder m8535(int i, int i2, String str, String str2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(ˉᵎ.ˋⁱ("End index (", i2, ") is less than start index (", i, ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, i);
        sb.append((CharSequence) str2);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static String m8536(String str, String str2) {
        return m8552(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static String m8537(String str, String str2) {
        return m8545(str, str2, false) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public static String m8538(String str, String str2, String str3) {
        int iM8540 = m8540(str, str2, 0, false, 6);
        return iM8540 == -1 ? str3 : str.substring(str2.length() + iM8540, str.length());
    }

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public static CharSequence m8539(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = ـﹶ.ˆʿ(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static /* synthetic */ int m8540(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m8551(i, charSequence, str, z);
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public static StringBuilder m8541(String str) {
        return new StringBuilder((CharSequence) str).reverse();
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static final void m8542(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Limit must be non-negative, but was ", i).toString());
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static Character m8543(int i, String str) {
        if (i < 0 || i >= str.length()) {
            return null;
        }
        return Character.valueOf(str.charAt(i));
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static final int m8544(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static boolean m8545(String str, String str2, boolean z) {
        return (!z && (str instanceof String) && (str2 instanceof String)) ? AbstractC3629.m8561(str, str2, false) : m8517(str, str.length() - str2.length(), str2, 0, str2.length(), z);
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static boolean m8546(CharSequence charSequence, char c) {
        return m8527(charSequence, c, 0, false, 2) >= 0;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static String m8547(String str, char c) {
        int iM8527 = m8527(str, c, 0, false, 6);
        return iM8527 == -1 ? str : str.substring(0, iM8527);
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static char m8548(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(m8544(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static List m8549(CharSequence charSequence, String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m8530(0, charSequence, str, false);
            }
        }
        C1057 c1057 = new C1057(1, m8522(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(AbstractC1039.m4012(c1057, 10));
        Iterator it = c1057.iterator();
        while (true) {
            C3614 c3614 = (C3614) it;
            if (!c3614.hasNext()) {
                return arrayList;
            }
            C2357 c2357 = (C2357) c3614.next();
            arrayList.add(charSequence.subSequence(c2357.f9332, c2357.f9330 + 1).toString());
        }
    }

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public static String m8550(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static int m8551(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? m8525(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static boolean m8552(String str, String str2, boolean z) {
        return (!z && (str instanceof String) && (str2 instanceof String)) ? AbstractC3629.m8560(str, str2, false) : m8517(str, 0, str2, 0, str2.length(), z);
    }
}
