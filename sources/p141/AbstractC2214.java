package p141;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p061.C1403;
import p334.C3789;
import p345.AbstractC3962;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.AbstractC3986;
import p345.C3928;
import p345.C3932;
import p345.C3935;
import p345.C3961;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4456;

/* renamed from: ˉˑ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2214 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f8769 = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Pattern f8765 = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Pattern f8768 = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Pattern f8772 = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Pattern f8766 = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Pattern f8770 = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final String f8771 = new String(new byte[]{10});

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final String f8767 = new String(new byte[]{13, 10});

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3932 m6181(String str) {
        if (str == null) {
            C3928 c3928 = AbstractC3980.f15360;
            return C3932.f15274;
        }
        AbstractC3968.m9177(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = AbstractC4470.f17202;
        int i2 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int iM6185 = m6185(str2);
            if (iM6185 != 0) {
                Integer numValueOf = Integer.valueOf(iM6185);
                int i3 = i2 + 1;
                if (objArrCopyOf.length < i3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC3962.m9169(objArrCopyOf.length, i3));
                }
                objArrCopyOf[i2] = numValueOf;
                i2 = i3;
            }
        }
        return AbstractC3980.m9206(i2, objArrCopyOf);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C4456 m6182(String str) throws ParserException {
        Matcher matcher = f8766.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            return new C4456(2, strGroup, strGroup2, strGroup3 != null ? strGroup3 : "");
        }
        Matcher matcher2 = f8770.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new C4456(1, strGroup4, "", "");
        }
        throw ParserException.m1095("Invalid WWW-Authenticate header " + str, null);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static String m6183(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PLAY";
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1403 m6184(String str) throws ParserException {
        long j;
        Matcher matcher = f8772.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.m1095(str, null);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        if (matcher.group(2) != null) {
            try {
                j = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e) {
                throw ParserException.m1095(str, e);
            }
        } else {
            j = 60000;
        }
        return new C1403(strGroup, j, 4);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m6185(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Uri m6186(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        AbstractC4464.m10142(authority.contains("@"));
        int i = AbstractC4470.f17202;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C3932 m6187(C2191 c2191) {
        AbstractC4464.m10142(c2191.f8615.m6133("CSeq") != null);
        C3961 c3961 = new C3961();
        c3961.m9174(AbstractC4470.m10185("%s %s %s", m6183(c2191.f8614), c2191.f8616, "RTSP/1.0"));
        C3935 c3935M6134 = c2191.f8615.m6134();
        AbstractC3986 it = c3935M6134.m9150().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3980 abstractC3980M9151 = c3935M6134.m9151(str);
            for (int i = 0; i < abstractC3980M9151.size(); i++) {
                c3961.m9174(AbstractC4470.m10185("%s: %s", str, abstractC3980M9151.get(i)));
            }
        }
        c3961.m9174("");
        c3961.m9174(c2191.f8617);
        return c3961.m9167();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C0559 m6188(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i = AbstractC4470.f17202;
        String[] strArrSplit = userInfo.split(":", 2);
        return new C0559(strArrSplit[0], 8, strArrSplit[1]);
    }
}
