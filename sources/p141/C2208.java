package p141;

import androidx.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p383.AbstractC4470;

/* renamed from: ˉˑ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2208 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C2208 f8711 = new C2208(0, -9223372036854775807L);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Pattern f8712 = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f8713;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f8714;

    public C2208(long j, long j2) {
        this.f8714 = j;
        this.f8713 = j2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2208 m6139(String str) {
        Matcher matcher = f8712.matcher(str);
        boolean zMatches = matcher.matches();
        Pattern pattern = AbstractC2214.f8769;
        if (!zMatches) {
            throw ParserException.m1095(str, null);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            throw ParserException.m1095(str, null);
        }
        int i = AbstractC4470.f17202;
        long j = strGroup.equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        long j2 = -9223372036854775807L;
        if (strGroup2 != null) {
            try {
                long j3 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                if (j3 >= j) {
                    j2 = j3;
                }
            } catch (NumberFormatException e) {
                throw ParserException.m1095(strGroup2, e);
            }
        }
        return new C2208(j, j2);
    }
}
