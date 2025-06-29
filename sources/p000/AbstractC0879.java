package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0879 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f3995 = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Pattern f3994 = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static long m3696(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f3994.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m3697(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = ᐧʻ.ˑי(j, "bytes=", "-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }
}
