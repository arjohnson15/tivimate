package p234;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;
import p353.AbstractC4010;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ˑˏ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3080 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f11873 = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m7575(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static long m7576(String str) {
        int i = AbstractC4470.f17202;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m7577(C4457 c4457) {
        c4457.getClass();
        String strM10109 = c4457.m10109(AbstractC4010.f15450);
        return strM10109 != null && strM10109.startsWith("WEBVTT");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m7578(C4457 c4457) {
        int i = c4457.f17169;
        if (m7577(c4457)) {
            return;
        }
        c4457.m10108(i);
        throw ParserException.m1097("Expected WEBVTT. Got " + c4457.m10109(AbstractC4010.f15450), null);
    }
}
