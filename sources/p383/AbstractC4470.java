package p383;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p014.C1060;
import p080.AbstractC1702;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p166.InterfaceC2419;
import p334.C3789;
import p345.AbstractC3980;
import p353.AbstractC4010;
import p395.AbstractC4535;
import p438.C5118;
import p447.AbstractC5179;
import ﾞﹶ.ᵢʿ;

/* renamed from: ᵢᵢ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4470 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f17192;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String f17193;

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final Pattern f17194;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final String[] f17195;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final String[] f17196;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static HashMap f17197;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final int[] f17198;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final Pattern f17199;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String f17200;

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final int[] f17201;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int f17202;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final byte[] f17203;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final long[] f17204;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final int[] f17205;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String f17206;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Pattern f17207;

    static {
        int i = Build.VERSION.SDK_INT;
        f17202 = i;
        String str = Build.DEVICE;
        f17192 = str;
        String str2 = Build.MANUFACTURER;
        f17200 = str2;
        String str3 = Build.MODEL;
        f17206 = str3;
        f17193 = str + ", " + str3 + ", " + str2 + ", " + i;
        f17203 = new byte[0];
        f17204 = new long[0];
        f17199 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f17207 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f17194 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f17195 = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f17196 = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f17205 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f17198 = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f17201 = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, ModuleDescriptor.MODULE_VERSION, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static String m10161(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM10327 = AbstractC4535.m10327(str);
        int i = 0;
        String str2 = strM10327.split("-", 2)[0];
        if (f17197 == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f17195;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                map.put(strArr[i2], strArr[i2 + 1]);
            }
            f17197 = map;
        }
        String str4 = (String) f17197.get(str2);
        if (str4 != null) {
            StringBuilder sbM5407 = AbstractC1702.m5407(str4);
            sbM5407.append(strM10327.substring(str2.length()));
            strM10327 = sbM5407.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strM10327;
        }
        while (true) {
            String[] strArr2 = f17196;
            if (i >= strArr2.length) {
                return strM10327;
            }
            if (strM10327.startsWith(strArr2[i])) {
                return strArr2[i + 1] + strM10327.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static String m10162(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m10163(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return z ? iBinarySearch : i;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static void m10164(int i) {
        Integer.toString(i, 36);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m10165(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static long m10166(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? m10173(j, j2, j3, roundingMode) : ᵢʿ.ﾞʽ(j2, ᵢʿ.ˏᵢ(j, j3, RoundingMode.UNNECESSARY)) : ᵢʿ.ˏᵢ(j2, ᵢʿ.ˏᵢ(j3, j, RoundingMode.UNNECESSARY), roundingMode) : ᵢʿ.ﾞʽ(j, ᵢʿ.ˏᵢ(j2, j3, RoundingMode.UNNECESSARY)) : ᵢʿ.ˏᵢ(j, ᵢʿ.ˏᵢ(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m10167(int i, String str) {
        int i2 = 0;
        for (String str2 : m10192(str)) {
            if (i == AbstractC2435.m6554(AbstractC2435.m6560(str2))) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C2431 m10168(int i, int i2, int i3) {
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("audio/raw");
        c2417.f9624 = i2;
        c2417.f9600 = i3;
        c2417.f9618 = i;
        return new C2431(c2417);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static String m10169(StringBuilder sb, Formatter formatter, long j) {
        long j2 = j == -9223372036854775807L ? 0L : j;
        String str = j2 < 0 ? "-" : "";
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static long m10170(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static long m10171(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m10172(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* renamed from: ˉᵎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m10173(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p383.AbstractC4470.m10173(long, long, long, java.math.RoundingMode):long");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m10174(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m10194(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static void m10175(ArrayList arrayList, int i, int i2) {
        if (i < 0 || i2 > arrayList.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            arrayList.subList(i, i2).clear();
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static String m10176(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                return i >= 10000 ? AbstractC5179.m11548(i, "custom (", ")") : "?";
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static String m10177(int i, String str) {
        String[] strArrM10192 = m10192(str);
        if (strArrM10192.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM10192) {
            if (i == AbstractC2435.m6554(AbstractC2435.m6560(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m10178(int i, int i2, int i3, byte[] bArr) {
        while (i < i2) {
            i3 = f17205[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static long m10179(int i, long j) {
        return m10166(j, 1000000L, i, RoundingMode.FLOOR);
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static String[] m10180(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static int m10181(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static AudioFormat m10182(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static boolean m10183(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static long m10184(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static String m10185(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m10186(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m10187(C1060 c1060, long j) {
        int i = c1060.f4469 - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (c1060.m4063(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < c1060.f4469 && c1060.m4063(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static String m10188(byte[] bArr) {
        return new String(bArr, AbstractC4010.f15450);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static boolean m10189(Context context) {
        int i = f17202;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i == 30) {
                String str = f17206;
                if (AbstractC4535.m10360(str, "moto g(20)") || AbstractC4535.m10360(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static boolean m10190(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static int m10191(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            int i = Integer.parseInt(str2);
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public static String[] m10192(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: ـˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m10193(p166.InterfaceC2419 r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = r6
            ﹶﾞ.ﾞʽ r1 = (p438.C5118) r1
            int r2 = r1.m11361()
            r3 = 1
            if (r2 != r3) goto L1d
            r4 = 2
            r5 = r6
            ʿﾞ.ﹳﹳ r5 = (ʿﾞ.ﹳﹳ) r5
            boolean r4 = r5.ٴᐧ(r4)
            if (r4 == 0) goto L1d
            r1.m11393()
        L1b:
            r0 = 1
            goto L39
        L1d:
            r1 = 4
            if (r2 != r1) goto L39
            r2 = r6
            ʿﾞ.ﹳﹳ r2 = (ʿﾞ.ﹳﹳ) r2
            boolean r1 = r2.ٴᐧ(r1)
            if (r1 == 0) goto L39
            r1 = r2
            ﹶﾞ.ﾞʽ r1 = (p438.C5118) r1
            int r1 = r1.m11386()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.ʻʻ(r4, r0, r1)
            goto L1b
        L39:
            ʿﾞ.ﹳﹳ r6 = (ʿﾞ.ﹳﹳ) r6
            boolean r1 = r6.ٴᐧ(r3)
            if (r1 == 0) goto L47
            ﹶﾞ.ﾞʽ r6 = (p438.C5118) r6
            r6.m11381(r3)
            goto L48
        L47:
            r3 = r0
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p383.AbstractC4470.m10193(ˊﹶ.ˑﾞ):boolean");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m10194(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m10195(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m10196(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static long m10197(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static int m10198(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m10199(android.net.Uri r8) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            java.lang.String r4 = r8.getScheme()
            if (r4 == 0) goto L13
            java.lang.String r5 = "rtsp"
            boolean r4 = p395.AbstractC4535.m10360(r5, r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            java.lang.String r4 = r8.getLastPathSegment()
            r5 = 4
            if (r4 != 0) goto L1b
            return r5
        L1b:
            r6 = 46
            int r6 = r4.lastIndexOf(r6)
            if (r6 < 0) goto L6f
            int r6 = r6 + r0
            java.lang.String r4 = r4.substring(r6)
            java.lang.String r4 = p395.AbstractC4535.m10327(r4)
            r4.getClass()
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case 104579: goto L58;
                case 108321: goto L4d;
                case 3242057: goto L42;
                case 3299913: goto L39;
                default: goto L37;
            }
        L37:
            r3 = -1
            goto L62
        L39:
            java.lang.String r7 = "m3u8"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L62
            goto L37
        L42:
            java.lang.String r3 = "isml"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L4b
            goto L37
        L4b:
            r3 = 2
            goto L62
        L4d:
            java.lang.String r3 = "mpd"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
            goto L37
        L56:
            r3 = 1
            goto L62
        L58:
            java.lang.String r3 = "ism"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L61
            goto L37
        L61:
            r3 = 0
        L62:
            switch(r3) {
                case 0: goto L6b;
                case 1: goto L69;
                case 2: goto L6b;
                case 3: goto L67;
                default: goto L65;
            }
        L65:
            r3 = 4
            goto L6c
        L67:
            r3 = 2
            goto L6c
        L69:
            r3 = 0
            goto L6c
        L6b:
            r3 = 1
        L6c:
            if (r3 == r5) goto L6f
            return r3
        L6f:
            java.lang.String r8 = r8.getPath()
            r8.getClass()
            java.util.regex.Pattern r3 = p383.AbstractC4470.f17194
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L9b
            java.lang.String r8 = r8.group(r1)
            if (r8 == 0) goto L9a
            java.lang.String r3 = "format=mpd-time-csf"
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L91
            return r2
        L91:
            java.lang.String r2 = "format=m3u8-aapl"
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L9a
            return r1
        L9a:
            return r0
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p383.AbstractC4470.m10199(android.net.Uri):int");
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static Handler m10200(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC4464.m10146(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static void m10201(long[] jArr, long j) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = ᵢʿ.ˏᵢ(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = ᵢʿ.ˏᵢ(jArr[i], j2, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long j3 = ᵢʿ.ˏᵢ(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = ᵢʿ.ﾞʽ(jArr[i], j3);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j4 = jArr[i2];
            if (j4 != 0) {
                if (j >= j4 && j % j4 == 0) {
                    jArr[i2] = ᵢʿ.ˏᵢ(1000000L, ᵢʿ.ˏᵢ(j, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j >= j4 || j4 % j != 0) {
                    jArr[i2] = m10173(j4, 1000000L, j, roundingMode);
                } else {
                    jArr[i2] = ᵢʿ.ﾞʽ(1000000L, ᵢʿ.ˏᵢ(j4, j, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m10202(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = p383.AbstractC4470.f17202
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p383.AbstractC4470.m10202(int):int");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m10203(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return 21;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static long m10204(String str) throws ParserException {
        Matcher matcher = f17199.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.m1097("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static Object[] m10205(int i, Object[] objArr) {
        AbstractC4464.m10142(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static long m10206(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static String[] m10207() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f17202;
        if (i >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            strArrSplit[i2] = m10161(strArrSplit[i2]);
        }
        return strArrSplit;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static boolean m10208(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static boolean m10209(InterfaceC2419 interfaceC2419, boolean z) {
        if (interfaceC2419 == null) {
            return true;
        }
        C5118 c5118 = (C5118) interfaceC2419;
        if (!c5118.m11362() || c5118.m11361() == 1 || c5118.m11361() == 4) {
            return true;
        }
        if (z) {
            c5118.m11358();
            if (c5118.f19520.f19462 != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static byte[] m10210(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static long m10211(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m10212(AbstractC3980 abstractC3980, Long l, boolean z) {
        int i;
        int iBinarySearch = Collections.binarySearch(abstractC3980, l);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || ((Comparable) abstractC3980.get(i2)).compareTo(l) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static String m10213(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            AbstractC4464.m10147("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static float m10214(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static int m10215(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static Drawable m10216(Context context, Resources resources, int i) {
        return f17202 >= 21 ? AbstractC4468.m10155(context, resources, i) : resources.getDrawable(i);
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static void m10217(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static boolean m10218(C4457 c4457, C4457 c44572, Inflater inflater) {
        if (c4457.m10096() <= 0) {
            return false;
        }
        if (c44572.f17171.length < c4457.m10096()) {
            c44572.m10077(c4457.m10096() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c4457.f17171, c4457.f17169, c4457.m10096());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = c44572.f17171;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = c44572.f17171;
                    if (iInflate == bArr2.length) {
                        c44572.m10077(bArr2.length * 2);
                    }
                } else {
                    c44572.m10104(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }
}
