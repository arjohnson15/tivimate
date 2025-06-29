package p362;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p014.C1060;
import p166.AbstractC2435;
import p166.C2431;
import p293.C3474;
import p310.C3581;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p395.AbstractC4535;
import ـˏ.ᴵˋ;

/* renamed from: ᵔᵢ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4130 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f16009 = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final HashMap f16007 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int f16008 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m9467(C2431 c2431) {
        Pair pairM9475;
        if ("audio/eac3-joc".equals(c2431.f9667)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c2431.f9667) || (pairM9475 = m9475(c2431)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM9475.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static synchronized List m9468(String str, boolean z, boolean z2) {
        C3474 c3474;
        try {
            C4127 c4127 = new C4127(str, z, z2);
            HashMap map = f16007;
            List list = (List) map.get(c4127);
            if (list != null) {
                return list;
            }
            int i = AbstractC4470.f17202;
            if (i >= 21) {
                C1060 c1060 = new C1060();
                c1060.f4469 = (z || z2) ? 1 : 0;
                c3474 = c1060;
            } else {
                c3474 = new C3474(3);
            }
            ArrayList arrayListM9473 = m9473(c4127, c3474);
            if (z && arrayListM9473.isEmpty() && 21 <= i && i <= 23) {
                arrayListM9473 = m9473(c4127, new C3474(3));
                if (!arrayListM9473.isEmpty()) {
                    AbstractC4464.m10144("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C4116) arrayListM9473.get(0)).f15902);
                }
            }
            m9472(str, arrayListM9473);
            AbstractC3980 abstractC3980M9209 = AbstractC3980.m9209(arrayListM9473);
            map.put(c4127, abstractC3980M9209);
            return abstractC3980M9209;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m9469() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f16008 == -1) {
            int iMax = 0;
            List listM9468 = m9468("video/avc", false, false);
            C4116 c4116 = listM9468.isEmpty() ? null : (C4116) listM9468.get(0);
            if (c4116 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c4116.f15905;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, AbstractC4470.f17202 >= 21 ? 345600 : 172800);
            }
            f16008 = iMax;
        }
        return f16008;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m9470(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC4470.f17202;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC4470.f17200))) {
            String str3 = AbstractC4470.f17192;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC4470.f17200)) {
            String str4 = AbstractC4470.f17192;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i == 19 && AbstractC4470.f17192.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m9471(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9472(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC4470.f17202 < 26 && AbstractC4470.f17192.equals("R9") && arrayList.size() == 1 && ((C4116) arrayList.get(0)).f15902.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C4116.m9432("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new ᴵˋ(3, new C3581(10)));
        }
        int i = AbstractC4470.f17202;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C4116) arrayList.get(0)).f15902;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new ᴵˋ(3, new C3581(11)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C4116) arrayList.get(0)).f15902)) {
            return;
        }
        arrayList.add((C4116) arrayList.remove(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m9473(p362.C4127 r23, p362.InterfaceC4110 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4130.m9473(ᵔᵢ.ﹳˎ, ᵔᵢ.ʿˏ):java.util.ArrayList");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C3932 m9474(InterfaceC4115 interfaceC4115, C2431 c2431, boolean z, boolean z2) {
        List listMo8484 = interfaceC4115.mo8484(c2431.f9667, z, z2);
        String strM9467 = m9467(c2431);
        List listMo84842 = strM9467 == null ? C3932.f15274 : interfaceC4115.mo8484(strM9467, z, z2);
        C3961 c3961M9205 = AbstractC3980.m9205();
        c3961M9205.m9171(listMo8484);
        c3961M9205.m9171(listMo84842);
        return c3961M9205.m9167();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0388 A[PHI: r2
  0x0388: PHI (r2v49 int) = (r2v48 int), (r2v53 int), (r2v54 int), (r2v55 int), (r2v56 int) binds: [B:252:0x035a, B:256:0x0362, B:258:0x0366, B:260:0x036a, B:262:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair m9475(p166.C2431 r25) {
        /*
            Method dump skipped, instructions count: 2496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4130.m9475(ˊﹶ.ᵎـ):android.util.Pair");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static boolean m9476(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC4470.f17202 >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC2435.m6550(str)) {
            return true;
        }
        String strM10327 = AbstractC4535.m10327(mediaCodecInfo.getName());
        if (strM10327.startsWith("arc.")) {
            return false;
        }
        if (strM10327.startsWith("omx.google.") || strM10327.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM10327.startsWith("omx.sec.") && strM10327.contains(".sw.")) || strM10327.equals("omx.qcom.video.decoder.hevcswvdec") || strM10327.startsWith("c2.android.") || strM10327.startsWith("c2.google.")) {
            return true;
        }
        return (strM10327.startsWith("omx.") || strM10327.startsWith("c2.")) ? false : true;
    }
}
