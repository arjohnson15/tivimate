package p324;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076.InterfaceC1668;
import p166.AbstractC2424;
import p166.C2405;
import p166.C2413;
import p323.AbstractC3691;
import p331.C3762;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ᴵˋ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3714 implements InterfaceC1668 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3716 f14394;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3704 f14395;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final Pattern f14362 = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Pattern f14375 = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Pattern f14352 = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final Pattern f14384 = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Pattern f14389 = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final Pattern f14359 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final Pattern f14370 = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final Pattern f14377 = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final Pattern f14392 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final Pattern f14349 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final Pattern f14368 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final Pattern f14367 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final Pattern f14385 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static final Pattern f14363 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static final Pattern f14383 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final Pattern f14344 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static final Pattern f14382 = m8679("CAN-SKIP-DATERANGES");

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final Pattern f14381 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static final Pattern f14391 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static final Pattern f14357 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final Pattern f14360 = m8679("CAN-BLOCK-RELOAD");

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static final Pattern f14378 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final Pattern f14351 = Pattern.compile("#EXTINF:\\s*([\\d\\.]+)\\b");

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final Pattern f14355 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static final Pattern f14387 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static final Pattern f14361 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final Pattern f14369 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final Pattern f14345 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final Pattern f14354 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final Pattern f14347 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final Pattern f14372 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static final Pattern f14373 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static final Pattern f14371 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static final Pattern f14380 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public static final Pattern f14379 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static final Pattern f14364 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public static final Pattern f14366 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static final Pattern f14388 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final Pattern f14393 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static final Pattern f14343 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public static final Pattern f14374 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public static final Pattern f14358 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public static final Pattern f14350 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public static final Pattern f14353 = m8679("AUTOSELECT");

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static final Pattern f14386 = m8679("DEFAULT");

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final Pattern f14365 = m8679("FORCED");

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final Pattern f14342 = m8679("INDEPENDENT");

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public static final Pattern f14348 = m8679("GAP");

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public static final Pattern f14356 = m8679("PRECISE");

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public static final Pattern f14376 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public static final Pattern f14390 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public static final Pattern f14346 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C3714(C3704 c3704, C3716 c3716) {
        this.f14395 = c3704;
        this.f14394 = c3716;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2405 m8673(String str, C2413[] c2413Arr) {
        C2413[] c2413Arr2 = new C2413[c2413Arr.length];
        for (int i = 0; i < c2413Arr.length; i++) {
            C2413 c2413 = c2413Arr[i];
            c2413Arr2[i] = new C2413(c2413.f9581, c2413.f9583, c2413.f9584, null);
        }
        return new C2405(str, true, c2413Arr2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x03b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p324.C3704 m8674(p331.C3762 r38, java.lang.String r39) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p324.C3714.m8674(ᴵﹳ.ˋⁱ, java.lang.String):ᴵˋ.ˉⁱ");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static String m8675(String str, Pattern pattern, Map map) throws ParserException {
        String strM8683 = m8683(str, pattern, null, map);
        if (strM8683 != null) {
            return strM8683;
        }
        throw ParserException.m1095("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static String m8676(String str, Map map) {
        Matcher matcher = f14346.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static long m8677(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2413 m8678(String str, String str2, HashMap map) throws ParserException {
        String strM8683 = m8683(str, f14380, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f14379;
        if (zEquals) {
            String strM8675 = m8675(str, pattern, map);
            return new C2413(AbstractC2424.f9645, null, "video/mp4", Base64.decode(strM8675.substring(strM8675.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC2424.f9645;
            int i = AbstractC4470.f17202;
            return new C2413(uuid, null, "hls", str.getBytes(AbstractC4010.f15450));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM8683)) {
            return null;
        }
        String strM86752 = m8675(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM86752.substring(strM86752.indexOf(44)), 0);
        UUID uuid2 = AbstractC2424.f9642;
        return new C2413(uuid2, null, "video/mp4", AbstractC3691.m8642(uuid2, null, bArrDecode));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Pattern m8679(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static boolean m8680(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static double m8681(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C3716 m8682(C3704 c3704, C3716 c3716, C3762 c3762, String str) throws NumberFormatException, IOException {
        int i;
        String str2;
        HashMap map;
        HashMap map2;
        C3715 c3715;
        ArrayList arrayList;
        String str3;
        C3715 c37152;
        int i2;
        String str4;
        HashMap map3;
        int i3;
        long j;
        long j2;
        HashMap map4;
        C3712 c3712;
        C2405 c2405;
        C3704 c37042 = c3704;
        C3716 c37162 = c3716;
        boolean z = c37042.f14300;
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C3708 c3708 = new C3708(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z2 = z;
        C3708 c37082 = c3708;
        String strM8683 = "";
        long j3 = -1;
        int i4 = 0;
        boolean zM8680 = false;
        long j4 = -9223372036854775807L;
        long jM10206 = 0;
        boolean z3 = false;
        int i5 = 0;
        long j5 = 0;
        int i6 = 1;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        C2405 c2405M8673 = null;
        long j8 = 0;
        C2405 c24052 = null;
        long j9 = 0;
        long j10 = 0;
        boolean z5 = false;
        String strM8675 = null;
        String str6 = null;
        String str7 = null;
        int i7 = 0;
        long j11 = 0;
        boolean z6 = false;
        C3712 c37122 = null;
        long jLongValue = 0;
        long j12 = 0;
        ArrayList arrayList6 = arrayList3;
        C3715 c37153 = null;
        while (c3762.m8794()) {
            String strM8793 = c3762.m8793();
            if (strM8793.startsWith("#EXT")) {
                arrayList5.add(strM8793);
            }
            if (strM8793.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM86752 = m8675(strM8793, f14383, map5);
                if ("VOD".equals(strM86752)) {
                    i4 = 1;
                } else if ("EVENT".equals(strM86752)) {
                    i4 = 2;
                }
            } else if (strM8793.equals("#EXT-X-I-FRAMES-ONLY")) {
                z6 = true;
            } else {
                if (strM8793.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j13 = (long) (Double.parseDouble(m8675(strM8793, f14369, Collections.emptyMap())) * 1000000.0d);
                    zM8680 = m8680(strM8793, f14356);
                    j4 = j13;
                } else {
                    str2 = str5;
                    if (strM8793.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dM8681 = m8681(strM8793, f14344);
                        long j14 = dM8681 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM8681 * 1000000.0d);
                        boolean zM86802 = m8680(strM8793, f14382);
                        double dM86812 = m8681(strM8793, f14391);
                        long j15 = dM86812 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM86812 * 1000000.0d);
                        double dM86813 = m8681(strM8793, f14357);
                        c37082 = new C3708(j14, zM86802, j15, dM86813 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM86813 * 1000000.0d), m8680(strM8793, f14360));
                    } else if (strM8793.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (Double.parseDouble(m8675(strM8793, f14385, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strM8793.startsWith("#EXT-X-MAP");
                        Pattern pattern = f14354;
                        boolean z7 = zM8680;
                        Pattern pattern2 = f14379;
                        if (zStartsWith) {
                            String strM86753 = m8675(strM8793, pattern2, map5);
                            String strM86832 = m8683(strM8793, pattern, null, map5);
                            if (strM86832 != null) {
                                int i8 = AbstractC4470.f17202;
                                String[] strArrSplit = strM86832.split("@", -1);
                                j3 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j8 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            if (j3 == -1) {
                                j8 = 0;
                            }
                            if (strM8675 != null && str6 == null) {
                                throw ParserException.m1095("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            c37122 = new C3712(strM86753, j8, j3, strM8675, str6);
                            if (j3 != -1) {
                                j8 += j3;
                            }
                            j3 = -1;
                            str5 = str2;
                            zM8680 = z7;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (strM8793.startsWith("#EXT-X-TARGETDURATION")) {
                                j6 = Integer.parseInt(m8675(strM8793, f14368, Collections.emptyMap())) * 1000000;
                            } else if (strM8793.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j9 = Long.parseLong(m8675(strM8793, f14378, Collections.emptyMap()));
                                j5 = j9;
                            } else if (strM8793.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(m8675(strM8793, f14363, Collections.emptyMap()));
                            } else {
                                if (strM8793.startsWith("#EXT-X-DEFINE")) {
                                    String strM86833 = m8683(strM8793, f14390, null, map5);
                                    if (strM86833 != null) {
                                        String str8 = (String) c37042.f14292.get(strM86833);
                                        if (str8 != null) {
                                            map5.put(strM86833, str8);
                                        }
                                    } else {
                                        map5.put(m8675(strM8793, f14343, map5), m8675(strM8793, f14376, map5));
                                    }
                                    map = map5;
                                    map2 = map6;
                                    c3715 = c37153;
                                    arrayList = arrayList7;
                                    str3 = str7;
                                } else if (strM8793.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(m8675(strM8793, f14351, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strM8683 = m8683(strM8793, f14355, str2, map5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    zM8680 = z7;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str9 = str2;
                                    if (strM8793.startsWith("#EXT-X-SKIP")) {
                                        int i9 = Integer.parseInt(m8675(strM8793, f14381, Collections.emptyMap()));
                                        AbstractC4464.m10132(c37162 != null && arrayList2.isEmpty());
                                        int i10 = AbstractC4470.f17202;
                                        int i11 = (int) (j5 - c37162.f14405);
                                        int i12 = i9 + i11;
                                        if (i11 >= 0) {
                                            AbstractC3980 abstractC3980 = c37162.f14404;
                                            if (i12 <= abstractC3980.size()) {
                                                while (i11 < i12) {
                                                    C3712 c37123 = (C3712) abstractC3980.get(i11);
                                                    if (j5 != c37162.f14405) {
                                                        int i13 = (c37162.f14400 - i5) + c37123.f14336;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j16 = j11;
                                                        int i14 = 0;
                                                        while (true) {
                                                            AbstractC3980 abstractC39802 = c37123.f14330;
                                                            i2 = i12;
                                                            if (i14 >= abstractC39802.size()) {
                                                                break;
                                                            }
                                                            C3715 c37154 = (C3715) abstractC39802.get(i14);
                                                            arrayList9.add(new C3715(c37154.f14337, c37154.f14331, c37154.f14334, i13, j16, c37154.f14339, c37154.f14340, c37154.f14333, c37154.f14335, c37154.f14338, c37154.f14341, c37154.f14396, c37154.f14397));
                                                            j16 += c37154.f14334;
                                                            i14++;
                                                            map6 = map6;
                                                            i12 = i2;
                                                            str9 = str9;
                                                            c37153 = c37153;
                                                        }
                                                        c37152 = c37153;
                                                        str4 = str9;
                                                        map3 = map6;
                                                        c37123 = new C3712(c37123.f14337, c37123.f14331, c37123.f14329, c37123.f14334, i13, j11, c37123.f14339, c37123.f14340, c37123.f14333, c37123.f14335, c37123.f14338, c37123.f14341, arrayList9);
                                                    } else {
                                                        c37152 = c37153;
                                                        i2 = i12;
                                                        str4 = str9;
                                                        map3 = map6;
                                                    }
                                                    arrayList2.add(c37123);
                                                    j11 += c37123.f14334;
                                                    long j17 = c37123.f14338;
                                                    if (j17 != -1) {
                                                        j8 = c37123.f14335 + j17;
                                                    }
                                                    String str10 = c37123.f14333;
                                                    if (str10 == null || !str10.equals(Long.toHexString(j9))) {
                                                        str6 = str10;
                                                    }
                                                    j9++;
                                                    i11++;
                                                    i7 = c37123.f14336;
                                                    c37122 = c37123.f14331;
                                                    c24052 = c37123.f14339;
                                                    strM8675 = c37123.f14340;
                                                    map6 = map3;
                                                    i12 = i2;
                                                    j10 = j11;
                                                    str9 = str4;
                                                    c37153 = c37152;
                                                    c37162 = c3716;
                                                }
                                                str2 = str9;
                                                c37042 = c3704;
                                                c37162 = c3716;
                                            }
                                        }
                                        throw new IOException() { // from class: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException
                                        };
                                    }
                                    c3715 = c37153;
                                    str2 = str9;
                                    HashMap map7 = map6;
                                    if (strM8793.startsWith("#EXT-X-KEY")) {
                                        String strM86754 = m8675(strM8793, f14373, map5);
                                        String strM86834 = m8683(strM8793, f14371, "identity", map5);
                                        if ("NONE".equals(strM86754)) {
                                            treeMap.clear();
                                            c24052 = null;
                                            strM8675 = null;
                                            str6 = null;
                                        } else {
                                            String strM86835 = m8683(strM8793, f14364, null, map5);
                                            if (!"identity".equals(strM86834)) {
                                                String str11 = str7;
                                                if (str11 == null) {
                                                    str7 = ("SAMPLE-AES-CENC".equals(strM86754) || "SAMPLE-AES-CTR".equals(strM86754)) ? "cenc" : "cbcs";
                                                } else {
                                                    str7 = str11;
                                                }
                                                C2413 c2413M8678 = m8678(strM8793, strM86834, map5);
                                                if (c2413M8678 != null) {
                                                    treeMap.put(strM86834, c2413M8678);
                                                    str6 = strM86835;
                                                    c24052 = null;
                                                }
                                                strM8675 = null;
                                            } else if ("AES-128".equals(strM86754)) {
                                                strM8675 = m8675(strM8793, pattern2, map5);
                                                str6 = strM86835;
                                            }
                                            str6 = strM86835;
                                            strM8675 = null;
                                        }
                                        c37042 = c3704;
                                        c37162 = c3716;
                                        map6 = map7;
                                    } else {
                                        str3 = str7;
                                        if (strM8793.startsWith("#EXT-X-BYTERANGE")) {
                                            String strM86755 = m8675(strM8793, f14345, map5);
                                            int i15 = AbstractC4470.f17202;
                                            String[] strArrSplit2 = strM86755.split("@", -1);
                                            j3 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j8 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strM8793.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(strM8793.substring(strM8793.indexOf(58) + 1));
                                            c37042 = c3704;
                                            c37162 = c3716;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zM8680 = z7;
                                            arrayList5 = arrayList8;
                                            c37153 = c3715;
                                            z3 = true;
                                        } else if (strM8793.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else {
                                            if (strM8793.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (jM10206 == 0) {
                                                    jM10206 = AbstractC4470.m10206(AbstractC4470.m10204(strM8793.substring(strM8793.indexOf(58) + 1))) - j11;
                                                } else {
                                                    map = map5;
                                                    arrayList = arrayList7;
                                                    map2 = map7;
                                                }
                                            } else if (strM8793.equals("#EXT-X-GAP")) {
                                                c37042 = c3704;
                                                c37162 = c3716;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zM8680 = z7;
                                                arrayList5 = arrayList8;
                                                c37153 = c3715;
                                                z5 = true;
                                            } else if (strM8793.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                c37042 = c3704;
                                                c37162 = c3716;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zM8680 = z7;
                                                arrayList5 = arrayList8;
                                                c37153 = c3715;
                                                z2 = true;
                                            } else if (strM8793.equals("#EXT-X-ENDLIST")) {
                                                c37042 = c3704;
                                                c37162 = c3716;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zM8680 = z7;
                                                arrayList5 = arrayList8;
                                                c37153 = c3715;
                                                z4 = true;
                                            } else {
                                                if (strM8793.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    long jM8677 = m8677(strM8793, f14387);
                                                    Matcher matcher = f14361.matcher(strM8793);
                                                    if (matcher.find()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        i3 = Integer.parseInt(strGroup);
                                                    } else {
                                                        i3 = -1;
                                                    }
                                                    arrayList4.add(new C3702(i3, jM8677, Uri.parse(AbstractC4464.m10145(str, m8675(strM8793, pattern2, map5)))));
                                                } else if (strM8793.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (c3715 == null && "PART".equals(m8675(strM8793, f14388, map5))) {
                                                        String strM86756 = m8675(strM8793, pattern2, map5);
                                                        long jM86772 = m8677(strM8793, f14347);
                                                        long jM86773 = m8677(strM8793, f14372);
                                                        String hexString = strM8675 == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                        if (c24052 == null && !treeMap.isEmpty()) {
                                                            C2413[] c2413Arr = (C2413[]) treeMap.values().toArray(new C2413[0]);
                                                            C2405 c24053 = new C2405(str3, true, c2413Arr);
                                                            if (c2405M8673 == null) {
                                                                c2405M8673 = m8673(str3, c2413Arr);
                                                            }
                                                            c24052 = c24053;
                                                        }
                                                        if (jM86772 == -1 || jM86773 != -1) {
                                                            c3715 = new C3715(strM86756, c37122, 0L, i7, j10, c24052, strM8675, hexString, jM86772 != -1 ? jM86772 : 0L, jM86773, false, false, true);
                                                        }
                                                    }
                                                } else if (strM8793.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = strM8675 == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    String strM86757 = m8675(strM8793, pattern2, map5);
                                                    long j18 = (long) (Double.parseDouble(m8675(strM8793, f14367, Collections.emptyMap())) * 1000000.0d);
                                                    boolean zM86803 = m8680(strM8793, f14342) | (z2 && arrayList7.isEmpty());
                                                    boolean zM86804 = m8680(strM8793, f14348);
                                                    String strM86836 = m8683(strM8793, pattern, null, map5);
                                                    if (strM86836 != null) {
                                                        int i16 = AbstractC4470.f17202;
                                                        String[] strArrSplit3 = strM86836.split("@", -1);
                                                        j = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j12 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                    } else {
                                                        j = -1;
                                                    }
                                                    if (j == -1) {
                                                        j12 = 0;
                                                    }
                                                    if (c24052 == null && !treeMap.isEmpty()) {
                                                        C2413[] c2413Arr2 = (C2413[]) treeMap.values().toArray(new C2413[0]);
                                                        C2405 c24054 = new C2405(str3, true, c2413Arr2);
                                                        if (c2405M8673 == null) {
                                                            c2405M8673 = m8673(str3, c2413Arr2);
                                                        }
                                                        c24052 = c24054;
                                                    }
                                                    arrayList7.add(new C3715(strM86757, c37122, j18, i7, j10, c24052, strM8675, hexString2, j12, j, zM86804, zM86803, false));
                                                    j10 += j18;
                                                    if (j != -1) {
                                                        j12 += j;
                                                    }
                                                    c37042 = c3704;
                                                    c37162 = c3716;
                                                    map6 = map7;
                                                    str7 = str3;
                                                    arrayList6 = arrayList7;
                                                } else {
                                                    arrayList = arrayList7;
                                                    if (strM8793.startsWith("#")) {
                                                        map = map5;
                                                        map2 = map7;
                                                    } else {
                                                        String hexString3 = strM8675 == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                        long j19 = j9 + 1;
                                                        String strM8676 = m8676(strM8793, map5);
                                                        C3712 c37124 = (C3712) map7.get(strM8676);
                                                        if (j3 == -1) {
                                                            j2 = 0;
                                                        } else {
                                                            if (z6 && c37122 == null && c37124 == null) {
                                                                c37124 = new C3712(strM8676, 0L, j8, null, null);
                                                                map7.put(strM8676, c37124);
                                                            }
                                                            j2 = j8;
                                                        }
                                                        if (c24052 != null || treeMap.isEmpty()) {
                                                            map4 = map5;
                                                            c3712 = c37124;
                                                            c2405 = c24052;
                                                        } else {
                                                            map4 = map5;
                                                            c3712 = c37124;
                                                            C2413[] c2413Arr3 = (C2413[]) treeMap.values().toArray(new C2413[0]);
                                                            c2405 = new C2405(str3, true, c2413Arr3);
                                                            if (c2405M8673 == null) {
                                                                c2405M8673 = m8673(str3, c2413Arr3);
                                                            }
                                                        }
                                                        arrayList2.add(new C3712(strM8676, c37122 != null ? c37122 : c3712, strM8683, jLongValue, i7, j11, c2405, strM8675, hexString3, j2, j3, z5, arrayList));
                                                        j10 = j11 + jLongValue;
                                                        ArrayList arrayList10 = new ArrayList();
                                                        if (j3 != -1) {
                                                            j2 += j3;
                                                        }
                                                        j8 = j2;
                                                        c37162 = c3716;
                                                        arrayList6 = arrayList10;
                                                        map6 = map7;
                                                        str7 = str3;
                                                        c24052 = c2405;
                                                        j3 = -1;
                                                        j11 = j10;
                                                        j9 = j19;
                                                        map5 = map4;
                                                        str5 = str2;
                                                        strM8683 = str5;
                                                        zM8680 = z7;
                                                        arrayList5 = arrayList8;
                                                        c37153 = c3715;
                                                        z5 = false;
                                                        jLongValue = 0;
                                                        c37042 = c3704;
                                                    }
                                                }
                                                map = map5;
                                                arrayList = arrayList7;
                                                map2 = map7;
                                            }
                                            str5 = str2;
                                            zM8680 = z7;
                                            arrayList5 = arrayList8;
                                            c37153 = c3715;
                                        }
                                        c37042 = c3704;
                                        c37162 = c3716;
                                        map6 = map7;
                                        str7 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    zM8680 = z7;
                                    arrayList5 = arrayList8;
                                    c37153 = c3715;
                                }
                                c37042 = c3704;
                                c37162 = c3716;
                                map6 = map2;
                                str7 = str3;
                                arrayList6 = arrayList;
                                map5 = map;
                                str5 = str2;
                                zM8680 = z7;
                                arrayList5 = arrayList8;
                                c37153 = c3715;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            zM8680 = z7;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        C3715 c37155 = c37153;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z8 = zM8680;
        HashMap map8 = new HashMap();
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            C3702 c3702 = (C3702) arrayList4.get(i17);
            long size = c3702.f14284;
            if (size == -1) {
                size = (j5 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = c3702.f14285;
            if (size2 != -1 || j7 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                size2 = (arrayList11.isEmpty() ? ((C3712) AbstractC3968.m9180(arrayList2)).f14330 : arrayList11).size() - 1;
            }
            Uri uri = c3702.f14286;
            map8.put(uri, new C3702(size2, size, uri));
            i17 += i;
        }
        if (c37155 != null) {
            arrayList11.add(c37155);
        }
        return new C3716(i4, str, arrayList12, j4, z8, jM10206, z3, i5, j5, i6, j6, j7, z2, z4, jM10206 != 0, c2405M8673, arrayList2, arrayList11, c37082, map8);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static String m8683(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m8676(str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004f A[SYNTHETIC] */
    @Override // p076.InterfaceC1668
    /* renamed from: ʿˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5358(android.net.Uri r7, p000.C0876 r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p324.C3714.mo5358(android.net.Uri, ʻ.ᐧʻ):java.lang.Object");
    }
}
