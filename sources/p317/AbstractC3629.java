package p317;

/* renamed from: ᴵ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3629 extends AbstractC3619 {
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static String m8559(String str, String str2, String str3, boolean z) {
        int i = 0;
        int iM8551 = AbstractC3616.m8551(0, str, str2, z);
        if (iM8551 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iM8551);
            sb.append(str3);
            i = iM8551 + length;
            if (iM8551 >= str.length()) {
                break;
            }
            iM8551 = AbstractC3616.m8551(iM8551 + i2, str, str2, z);
        } while (iM8551 > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static boolean m8560(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static boolean m8561(String str, String str2, boolean z) {
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static boolean m8562(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }
}
