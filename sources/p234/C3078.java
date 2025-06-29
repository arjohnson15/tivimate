package p234;

import java.util.regex.Pattern;
import p383.C4457;

/* renamed from: ˑˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3078 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Pattern f11866 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Pattern f11867 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4457 f11869 = new C4457();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final StringBuilder f11868 = new StringBuilder();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m7572(C4457 c4457, StringBuilder sb) {
        m7573(c4457);
        if (c4457.m10096() == 0) {
            return null;
        }
        String strM7574 = m7574(c4457, sb);
        if (!"".equals(strM7574)) {
            return strM7574;
        }
        return "" + ((char) c4457.m10086());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7573(C4457 c4457) {
        while (true) {
            for (boolean z = true; c4457.m10096() > 0 && z; z = false) {
                int i = c4457.f17169;
                byte[] bArr = c4457.f17171;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    c4457.m10085(1);
                } else {
                    int i2 = c4457.f17170;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            c4457.m10085(i2 - c4457.f17169);
                        }
                    }
                }
            }
            return;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m7574(C4457 c4457, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c4457.f17169;
        int i2 = c4457.f17170;
        while (i < i2 && !z) {
            char c = (char) c4457.f17171[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        c4457.m10085(i - c4457.f17169);
        return sb.toString();
    }
}
