package p401;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ⁱﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4618 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Pattern f17664;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Pattern f17665;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f17666 = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Pattern f17667;

    static {
        int i = AbstractC4470.f17202;
        Locale locale = Locale.US;
        f17664 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f17665 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f17667 = Pattern.compile("\\\\an(\\d+)");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static PointF m10503(String str) throws NumberFormatException {
        String strGroup;
        String strGroup2;
        Matcher matcher = f17664.matcher(str);
        Matcher matcher2 = f17665.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC4464.m10131("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f, Float.parseFloat(strGroup2.trim()));
    }
}
