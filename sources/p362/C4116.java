package p362;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.support.v4.media.session.AbstractC0002;
import android.util.Pair;
import p166.AbstractC2435;
import p166.C2415;
import p166.C2431;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5099;
import ˈⁱ.ˉⁱ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵔᵢ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4116 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f15898;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f15899;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f15900;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f15901;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15902;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f15903;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f15904;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final MediaCodecInfo.CodecCapabilities f15905;

    public C4116(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f15902 = str;
        this.f15898 = str2;
        this.f15901 = str3;
        this.f15905 = codecCapabilities;
        this.f15904 = z;
        this.f15899 = z2;
        this.f15903 = z3;
        this.f15900 = AbstractC2435.m6552(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p362.C4116 m9432(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            ᵔᵢ.ˏʾ r13 = new ᵔᵢ.ˏʾ
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = p383.AbstractC4470.f17202
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = p383.AbstractC4470.f17206
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = 1
            goto L3a
        L39:
            r6 = 0
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = p383.AbstractC4470.f17202
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = p383.AbstractC4470.f17202
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = 0
            goto L5c
        L5b:
            r7 = 1
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.C4116.m9432(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):ᵔᵢ.ˏʾ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m9433(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC4470.m10196(i, widthAlignment) * widthAlignment, AbstractC4470.m10196(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final String toString() {
        return this.f15902;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5099 m9434(C2431 c2431, C2431 c24312) {
        int i = !AbstractC4470.m10194(c2431.f9667, c24312.f9667) ? 8 : 0;
        if (this.f15900) {
            if (c2431.f9666 != c24312.f9666) {
                i |= 1024;
            }
            if (!this.f15899 && (c2431.f9684 != c24312.f9684 || c2431.f9687 != c24312.f9687)) {
                i |= 512;
            }
            C2415 c2415 = c2431.f9688;
            boolean zM6510 = C2415.m6510(c2415);
            C2415 c24152 = c24312.f9688;
            if ((!zM6510 || !C2415.m6510(c24152)) && !AbstractC4470.m10194(c2415, c24152)) {
                i |= 2048;
            }
            if (AbstractC4470.f17206.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f15902) && !c2431.m6540(c24312)) {
                i |= 2;
            }
            if (i == 0) {
                return new C5099(this.f15902, c2431, c24312, c2431.m6540(c24312) ? 3 : 2, 0);
            }
        } else {
            if (c2431.f9662 != c24312.f9662) {
                i |= 4096;
            }
            if (c2431.f9681 != c24312.f9681) {
                i |= 8192;
            }
            if (c2431.f9660 != c24312.f9660) {
                i |= 16384;
            }
            String str = this.f15898;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairM9475 = AbstractC4130.m9475(c2431);
                Pair pairM94752 = AbstractC4130.m9475(c24312);
                if (pairM9475 != null && pairM94752 != null) {
                    int iIntValue = ((Integer) pairM9475.first).intValue();
                    int iIntValue2 = ((Integer) pairM94752.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C5099(this.f15902, c2431, c24312, 3, 0);
                    }
                }
            }
            if (!c2431.m6540(c24312)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new C5099(this.f15902, c2431, c24312, 1, 0);
            }
        }
        return new C5099(this.f15902, c2431, c24312, 0, i);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m9435(C2431 c2431) {
        if (this.f15900) {
            return this.f15899;
        }
        Pair pairM9475 = AbstractC4130.m9475(c2431);
        return pairM9475 != null && ((Integer) pairM9475.first).intValue() == 42;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m9436(C2431 c2431, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairM9475 = AbstractC4130.m9475(c2431);
        if (pairM9475 == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM9475.first).intValue();
        int iIntValue2 = ((Integer) pairM9475.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c2431.f9667);
        int i = 8;
        String str = this.f15898;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.f15900 && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15905;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC4470.f17202 <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = AbstractC4470.f17192;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        m9438("codec.profileLevel, " + c2431.f9663 + ", " + this.f15901);
        return false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m9437(int i, int i2, double d) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15905;
        if (codecCapabilities == null) {
            m9438("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m9438("sizeAndRate.vCaps");
            return false;
        }
        int i3 = AbstractC4470.f17202;
        if (i3 >= 29) {
            int iM9430 = (i3 < 29 || ((bool = ˉⁱ.ʿʼ) != null && bool.booleanValue())) ? 0 : AbstractC4112.m9430(videoCapabilities, i, i2, d);
            if (iM9430 == 2) {
                return true;
            }
            if (iM9430 == 1) {
                StringBuilder sb = ᐧʻ.ᵎـ("sizeAndRate.cover, ", i, "x", i2, "@");
                sb.append(d);
                m9438(sb.toString());
                return false;
            }
        }
        if (!m9433(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.f15902;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC4470.f17192)) && m9433(videoCapabilities, i2, i, d)) {
                    StringBuilder sb2 = ᐧʻ.ᵎـ("sizeAndRate.rotated, ", i, "x", i2, "@");
                    sb2.append(d);
                    AbstractC4464.m10148("MediaCodecInfo", "AssumedSupport [" + sb2.toString() + "] [" + str + ", " + this.f15898 + "] [" + AbstractC4470.f17193 + "]");
                }
            }
            StringBuilder sb3 = ᐧʻ.ᵎـ("sizeAndRate.support, ", i, "x", i2, "@");
            sb3.append(d);
            m9438(sb3.toString());
            return false;
        }
        return true;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9438(String str) {
        StringBuilder sbM50 = AbstractC0002.m50("NoSupport [", str, "] [");
        sbM50.append(this.f15902);
        sbM50.append(", ");
        sbM50.append(this.f15898);
        sbM50.append("] [");
        sbM50.append(AbstractC4470.f17193);
        sbM50.append("]");
        AbstractC4464.m10148("MediaCodecInfo", sbM50.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9439(p166.C2431 r9) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.C4116.m9439(ˊﹶ.ᵎـ):boolean");
    }
}
