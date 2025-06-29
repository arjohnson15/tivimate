package p166;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p033.C1212;
import p383.AbstractC4470;
import p395.AbstractC4535;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˊﹶ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2435 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ArrayList f9720 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Pattern f9719 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m6548(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrM10192 = AbstractC4470.m10192(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrM10192) {
            if (str2.equals(m6560(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m6549(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static boolean m6550(String str) {
        return "audio".equals(m6558(str));
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m6551(String str) {
        return "text".equals(m6558(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static boolean m6552(String str) {
        return "video".equals(m6558(str));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static boolean m6553(String str) {
        return "image".equals(m6558(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m6554(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m6550(str)) {
            return 1;
        }
        if (m6552(str)) {
            return 2;
        }
        if (m6551(str)) {
            return 3;
        }
        if (m6553(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f9720;
        if (arrayList.size() <= 0) {
            return -1;
        }
        ᐧʻ.ᵎˏ(arrayList.get(0));
        throw null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m6555(String str, String str2) {
        C1212 c1212M6557;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c1212M6557 = m6557(str2)) == null) {
                    return 0;
                }
                return c1212M6557.m4295();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m6556(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC4470.m10192(str)) {
            String strM6560 = m6560(str2);
            if (strM6560 != null && m6550(strM6560)) {
                return strM6560;
            }
        }
        return null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C1212 m6557(String str) {
        Matcher matcher = f9719.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C1212(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m6558(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static String m6559(String str) {
        String strM10327;
        if (str == null) {
            return null;
        }
        strM10327 = AbstractC4535.m10327(str);
        strM10327.getClass();
        switch (strM10327) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM10327;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m6560(String str) {
        C1212 c1212M6557;
        String strM6549 = null;
        if (str == null) {
            return null;
        }
        String strM10327 = AbstractC4535.m10327(str.trim());
        if (strM10327.startsWith("avc1") || strM10327.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM10327.startsWith("hev1") || strM10327.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM10327.startsWith("dvav") || strM10327.startsWith("dva1") || strM10327.startsWith("dvhe") || strM10327.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM10327.startsWith("av01")) {
            return "video/av01";
        }
        if (strM10327.startsWith("vp9") || strM10327.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM10327.startsWith("vp8") || strM10327.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM10327.startsWith("mp4a")) {
            if (strM10327.startsWith("mp4a.") && (c1212M6557 = m6557(strM10327)) != null) {
                strM6549 = m6549(c1212M6557.f4960);
            }
            return strM6549 == null ? "audio/mp4a-latm" : strM6549;
        }
        if (strM10327.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM10327.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM10327.startsWith("ac-3") || strM10327.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strM10327.startsWith("ec-3") || strM10327.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strM10327.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM10327.startsWith("ac-4") || strM10327.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM10327.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM10327.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM10327.startsWith("dtsh") || strM10327.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strM10327.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM10327.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM10327.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM10327.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM10327.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strM10327.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strM10327.contains("cea708")) {
            return "application/cea-708";
        }
        if (strM10327.contains("eia608") || strM10327.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f9720;
        if (arrayList.size() <= 0) {
            return null;
        }
        ᐧʻ.ᵎˏ(arrayList.get(0));
        throw null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static String m6561(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC4470.m10192(str)) {
            String strM6560 = m6560(str2);
            if (strM6560 != null && m6552(strM6560)) {
                return strM6560;
            }
        }
        return null;
    }
}
