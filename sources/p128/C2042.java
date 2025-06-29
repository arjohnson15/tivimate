package p128;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.support.v4.media.session.AbstractC0002;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import ˈⁱ.ˉⁱ;
import ـˈ.ˉᵎ;

/* renamed from: ˈﹳ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2042 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final byte[] f7718;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final byte[] f7719;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final int[] f7720;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C2043[][] f7721;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static final byte[] f7722;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final boolean f7723 = Log.isLoggable("ExifInterface", 3);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final HashMap[] f7724;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final byte[] f7725;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final int[] f7726;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final byte[] f7727;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final byte[] f7728;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final byte[] f7729;

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final byte[] f7730;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final byte[] f7731;

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final byte[] f7732;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final HashSet f7733;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C2043 f7734;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final String[] f7735;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final HashMap f7736;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final int[] f7737;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final byte[] f7738;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final byte[] f7739;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final C2043[] f7740;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final byte[] f7741;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static final byte[] f7742;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final HashMap[] f7743;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final byte[] f7744;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final byte[] f7745;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final Charset f7746;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f7747;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final HashSet f7748;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f7749;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f7750;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f7751;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7752;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final FileDescriptor f7753;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public ByteOrder f7754;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f7755;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final HashMap[] f7756;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f7757;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f7726 = new int[]{8, 8, 8};
        f7737 = new int[]{8};
        f7729 = new byte[]{-1, -40, -1};
        f7730 = new byte[]{102, 116, 121, 112};
        f7739 = new byte[]{109, 105, 102, 49};
        f7728 = new byte[]{104, 101, 105, 99};
        f7738 = new byte[]{79, 76, 89, 77, 80, 0};
        f7741 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f7719 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f7725 = new byte[]{101, 88, 73, 102};
        f7745 = new byte[]{73, 72, 68, 82};
        f7744 = new byte[]{73, 69, 78, 68};
        f7732 = new byte[]{82, 73, 70, 70};
        f7742 = new byte[]{87, 69, 66, 80};
        f7722 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f7735 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f7720 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f7727 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C2043[] c2043Arr = {new C2043(254, 4, "NewSubfileType"), new C2043(255, 4, "SubfileType"), new C2043(256, 3, 4, "ImageWidth"), new C2043(257, 3, 4, "ImageLength"), new C2043(258, 3, "BitsPerSample"), new C2043(259, 3, "Compression"), new C2043(262, 3, "PhotometricInterpretation"), new C2043(270, 2, "ImageDescription"), new C2043(271, 2, "Make"), new C2043(272, 2, "Model"), new C2043(273, 3, 4, "StripOffsets"), new C2043(274, 3, "Orientation"), new C2043(277, 3, "SamplesPerPixel"), new C2043(278, 3, 4, "RowsPerStrip"), new C2043(279, 3, 4, "StripByteCounts"), new C2043(282, 5, "XResolution"), new C2043(283, 5, "YResolution"), new C2043(284, 3, "PlanarConfiguration"), new C2043(296, 3, "ResolutionUnit"), new C2043(301, 3, "TransferFunction"), new C2043(305, 2, "Software"), new C2043(306, 2, "DateTime"), new C2043(315, 2, "Artist"), new C2043(318, 5, "WhitePoint"), new C2043(319, 5, "PrimaryChromaticities"), new C2043(330, 4, "SubIFDPointer"), new C2043(513, 4, "JPEGInterchangeFormat"), new C2043(514, 4, "JPEGInterchangeFormatLength"), new C2043(529, 5, "YCbCrCoefficients"), new C2043(530, 3, "YCbCrSubSampling"), new C2043(531, 3, "YCbCrPositioning"), new C2043(532, 5, "ReferenceBlackWhite"), new C2043(33432, 2, "Copyright"), new C2043(34665, 4, "ExifIFDPointer"), new C2043(34853, 4, "GPSInfoIFDPointer"), new C2043(4, 4, "SensorTopBorder"), new C2043(5, 4, "SensorLeftBorder"), new C2043(6, 4, "SensorBottomBorder"), new C2043(7, 4, "SensorRightBorder"), new C2043(23, 3, "ISO"), new C2043(46, 7, "JpgFromRaw"), new C2043(700, 1, "Xmp")};
        C2043[] c2043Arr2 = {new C2043(33434, 5, "ExposureTime"), new C2043(33437, 5, "FNumber"), new C2043(34850, 3, "ExposureProgram"), new C2043(34852, 2, "SpectralSensitivity"), new C2043(34855, 3, "PhotographicSensitivity"), new C2043(34856, 7, "OECF"), new C2043(34864, 3, "SensitivityType"), new C2043(34865, 4, "StandardOutputSensitivity"), new C2043(34866, 4, "RecommendedExposureIndex"), new C2043(34867, 4, "ISOSpeed"), new C2043(34868, 4, "ISOSpeedLatitudeyyy"), new C2043(34869, 4, "ISOSpeedLatitudezzz"), new C2043(36864, 2, "ExifVersion"), new C2043(36867, 2, "DateTimeOriginal"), new C2043(36868, 2, "DateTimeDigitized"), new C2043(36880, 2, "OffsetTime"), new C2043(36881, 2, "OffsetTimeOriginal"), new C2043(36882, 2, "OffsetTimeDigitized"), new C2043(37121, 7, "ComponentsConfiguration"), new C2043(37122, 5, "CompressedBitsPerPixel"), new C2043(37377, 10, "ShutterSpeedValue"), new C2043(37378, 5, "ApertureValue"), new C2043(37379, 10, "BrightnessValue"), new C2043(37380, 10, "ExposureBiasValue"), new C2043(37381, 5, "MaxApertureValue"), new C2043(37382, 5, "SubjectDistance"), new C2043(37383, 3, "MeteringMode"), new C2043(37384, 3, "LightSource"), new C2043(37385, 3, "Flash"), new C2043(37386, 5, "FocalLength"), new C2043(37396, 3, "SubjectArea"), new C2043(37500, 7, "MakerNote"), new C2043(37510, 7, "UserComment"), new C2043(37520, 2, "SubSecTime"), new C2043(37521, 2, "SubSecTimeOriginal"), new C2043(37522, 2, "SubSecTimeDigitized"), new C2043(40960, 7, "FlashpixVersion"), new C2043(40961, 3, "ColorSpace"), new C2043(40962, 3, 4, "PixelXDimension"), new C2043(40963, 3, 4, "PixelYDimension"), new C2043(40964, 2, "RelatedSoundFile"), new C2043(40965, 4, "InteroperabilityIFDPointer"), new C2043(41483, 5, "FlashEnergy"), new C2043(41484, 7, "SpatialFrequencyResponse"), new C2043(41486, 5, "FocalPlaneXResolution"), new C2043(41487, 5, "FocalPlaneYResolution"), new C2043(41488, 3, "FocalPlaneResolutionUnit"), new C2043(41492, 3, "SubjectLocation"), new C2043(41493, 5, "ExposureIndex"), new C2043(41495, 3, "SensingMethod"), new C2043(41728, 7, "FileSource"), new C2043(41729, 7, "SceneType"), new C2043(41730, 7, "CFAPattern"), new C2043(41985, 3, "CustomRendered"), new C2043(41986, 3, "ExposureMode"), new C2043(41987, 3, "WhiteBalance"), new C2043(41988, 5, "DigitalZoomRatio"), new C2043(41989, 3, "FocalLengthIn35mmFilm"), new C2043(41990, 3, "SceneCaptureType"), new C2043(41991, 3, "GainControl"), new C2043(41992, 3, "Contrast"), new C2043(41993, 3, "Saturation"), new C2043(41994, 3, "Sharpness"), new C2043(41995, 7, "DeviceSettingDescription"), new C2043(41996, 3, "SubjectDistanceRange"), new C2043(42016, 2, "ImageUniqueID"), new C2043(42032, 2, "CameraOwnerName"), new C2043(42033, 2, "BodySerialNumber"), new C2043(42034, 5, "LensSpecification"), new C2043(42035, 2, "LensMake"), new C2043(42036, 2, "LensModel"), new C2043(42240, 5, "Gamma"), new C2043(50706, 1, "DNGVersion"), new C2043(50720, 3, 4, "DefaultCropSize")};
        C2043[] c2043Arr3 = {new C2043(0, 1, "GPSVersionID"), new C2043(1, 2, "GPSLatitudeRef"), new C2043(2, 5, 10, "GPSLatitude"), new C2043(3, 2, "GPSLongitudeRef"), new C2043(4, 5, 10, "GPSLongitude"), new C2043(5, 1, "GPSAltitudeRef"), new C2043(6, 5, "GPSAltitude"), new C2043(7, 5, "GPSTimeStamp"), new C2043(8, 2, "GPSSatellites"), new C2043(9, 2, "GPSStatus"), new C2043(10, 2, "GPSMeasureMode"), new C2043(11, 5, "GPSDOP"), new C2043(12, 2, "GPSSpeedRef"), new C2043(13, 5, "GPSSpeed"), new C2043(14, 2, "GPSTrackRef"), new C2043(15, 5, "GPSTrack"), new C2043(16, 2, "GPSImgDirectionRef"), new C2043(17, 5, "GPSImgDirection"), new C2043(18, 2, "GPSMapDatum"), new C2043(19, 2, "GPSDestLatitudeRef"), new C2043(20, 5, "GPSDestLatitude"), new C2043(21, 2, "GPSDestLongitudeRef"), new C2043(22, 5, "GPSDestLongitude"), new C2043(23, 2, "GPSDestBearingRef"), new C2043(24, 5, "GPSDestBearing"), new C2043(25, 2, "GPSDestDistanceRef"), new C2043(26, 5, "GPSDestDistance"), new C2043(27, 7, "GPSProcessingMethod"), new C2043(28, 7, "GPSAreaInformation"), new C2043(29, 2, "GPSDateStamp"), new C2043(30, 3, "GPSDifferential"), new C2043(31, 5, "GPSHPositioningError")};
        C2043[] c2043Arr4 = {new C2043(1, 2, "InteroperabilityIndex")};
        C2043[] c2043Arr5 = {new C2043(254, 4, "NewSubfileType"), new C2043(255, 4, "SubfileType"), new C2043(256, 3, 4, "ThumbnailImageWidth"), new C2043(257, 3, 4, "ThumbnailImageLength"), new C2043(258, 3, "BitsPerSample"), new C2043(259, 3, "Compression"), new C2043(262, 3, "PhotometricInterpretation"), new C2043(270, 2, "ImageDescription"), new C2043(271, 2, "Make"), new C2043(272, 2, "Model"), new C2043(273, 3, 4, "StripOffsets"), new C2043(274, 3, "ThumbnailOrientation"), new C2043(277, 3, "SamplesPerPixel"), new C2043(278, 3, 4, "RowsPerStrip"), new C2043(279, 3, 4, "StripByteCounts"), new C2043(282, 5, "XResolution"), new C2043(283, 5, "YResolution"), new C2043(284, 3, "PlanarConfiguration"), new C2043(296, 3, "ResolutionUnit"), new C2043(301, 3, "TransferFunction"), new C2043(305, 2, "Software"), new C2043(306, 2, "DateTime"), new C2043(315, 2, "Artist"), new C2043(318, 5, "WhitePoint"), new C2043(319, 5, "PrimaryChromaticities"), new C2043(330, 4, "SubIFDPointer"), new C2043(513, 4, "JPEGInterchangeFormat"), new C2043(514, 4, "JPEGInterchangeFormatLength"), new C2043(529, 5, "YCbCrCoefficients"), new C2043(530, 3, "YCbCrSubSampling"), new C2043(531, 3, "YCbCrPositioning"), new C2043(532, 5, "ReferenceBlackWhite"), new C2043(33432, 2, "Copyright"), new C2043(34665, 4, "ExifIFDPointer"), new C2043(34853, 4, "GPSInfoIFDPointer"), new C2043(50706, 1, "DNGVersion"), new C2043(50720, 3, 4, "DefaultCropSize")};
        f7734 = new C2043(273, 3, "StripOffsets");
        f7721 = new C2043[][]{c2043Arr, c2043Arr2, c2043Arr3, c2043Arr4, c2043Arr5, c2043Arr, new C2043[]{new C2043(256, 7, "ThumbnailImage"), new C2043(8224, 4, "CameraSettingsIFDPointer"), new C2043(8256, 4, "ImageProcessingIFDPointer")}, new C2043[]{new C2043(257, 4, "PreviewImageStart"), new C2043(258, 4, "PreviewImageLength")}, new C2043[]{new C2043(4371, 3, "AspectFrame")}, new C2043[]{new C2043(55, 3, "ColorSpace")}};
        f7740 = new C2043[]{new C2043(330, 4, "SubIFDPointer"), new C2043(34665, 4, "ExifIFDPointer"), new C2043(34853, 4, "GPSInfoIFDPointer"), new C2043(40965, 4, "InteroperabilityIFDPointer"), new C2043(8224, 1, "CameraSettingsIFDPointer"), new C2043(8256, 1, "ImageProcessingIFDPointer")};
        f7743 = new HashMap[10];
        f7724 = new HashMap[10];
        f7733 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f7736 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f7746 = charsetForName;
        f7718 = "Exif\u0000\u0000".getBytes(charsetForName);
        f7731 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2043[][] c2043Arr6 = f7721;
            if (i >= c2043Arr6.length) {
                HashMap map = f7736;
                C2043[] c2043Arr7 = f7740;
                map.put(Integer.valueOf(c2043Arr7[0].f7760), 5);
                map.put(Integer.valueOf(c2043Arr7[1].f7760), 1);
                map.put(Integer.valueOf(c2043Arr7[2].f7760), 2);
                map.put(Integer.valueOf(c2043Arr7[3].f7760), 3);
                map.put(Integer.valueOf(c2043Arr7[4].f7760), 7);
                map.put(Integer.valueOf(c2043Arr7[5].f7760), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f7743[i] = new HashMap();
            f7724[i] = new HashMap();
            for (C2043 c2043 : c2043Arr6[i]) {
                f7743[i].put(Integer.valueOf(c2043.f7760), c2043);
                f7724[i].put(c2043.f7758, c2043);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2042(java.io.InputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C2042.<init>(java.io.InputStream):void");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static ByteOrder m5697(C2036 c2036) throws IOException {
        short s = c2036.readShort();
        boolean z = f7723;
        if (s == 18761) {
            if (z) {
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (z) {
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m5698(String str) {
        C2039 c2039M5709 = m5709(str);
        if (c2039M5709 != null) {
            if (!f7733.contains(str)) {
                return c2039M5709.m5693(this.f7754);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c2039M5709.f7714;
                if (i != 5 && i != 10) {
                    String str2 = "GPS Timestamp format is not rational. format=" + i;
                    return null;
                }
                C2037[] c2037Arr = (C2037[]) c2039M5709.m5694(this.f7754);
                if (c2037Arr == null || c2037Arr.length != 3) {
                    String str3 = "Invalid GPS Timestamp array. array=" + Arrays.toString(c2037Arr);
                    return null;
                }
                C2037 c2037 = c2037Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c2037.f7711 / c2037.f7710));
                C2037 c20372 = c2037Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c20372.f7711 / c20372.f7710));
                C2037 c20373 = c2037Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c20373.f7711 / c20373.f7710)));
            }
            try {
                return Double.toString(c2039M5709.m5695(this.f7754));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        r23.f7706 = r22.f7754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188 A[LOOP:0: B:10:0x0032->B:82:0x0188, LOOP_END] */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5699(p128.C2036 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C2042.m5699(ˈﹳ.ʽᐧ, int, int):void");
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m5700(C2036 c2036) throws Throwable {
        C2039 c2039;
        int iM5692;
        HashMap map = this.f7756[4];
        C2039 c20392 = (C2039) map.get("Compression");
        if (c20392 == null) {
            m5704(c2036, map);
            return;
        }
        int iM56922 = c20392.m5692(this.f7754);
        int i = 1;
        if (iM56922 != 1) {
            if (iM56922 == 6) {
                m5704(c2036, map);
                return;
            } else if (iM56922 != 7) {
                return;
            }
        }
        C2039 c20393 = (C2039) map.get("BitsPerSample");
        if (c20393 != null) {
            int[] iArr = (int[]) c20393.m5694(this.f7754);
            int[] iArr2 = f7726;
            if (Arrays.equals(iArr2, iArr) || (this.f7752 == 3 && (c2039 = (C2039) map.get("PhotometricInterpretation")) != null && (((iM5692 = c2039.m5692(this.f7754)) == 1 && Arrays.equals(iArr, f7737)) || (iM5692 == 6 && Arrays.equals(iArr, iArr2))))) {
                C2039 c20394 = (C2039) map.get("StripOffsets");
                C2039 c20395 = (C2039) map.get("StripByteCounts");
                if (c20394 == null || c20395 == null) {
                    return;
                }
                long[] jArr = ˉⁱ.ʿʼ(c20394.m5694(this.f7754));
                long[] jArr2 = ˉⁱ.ʿʼ(c20395.m5694(this.f7754));
                if (jArr == null || jArr.length == 0) {
                    return;
                }
                if (jArr2 == null || jArr2.length == 0) {
                    return;
                }
                if (jArr.length != jArr2.length) {
                    return;
                }
                long j = 0;
                for (long j2 : jArr2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f7755 = true;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < jArr.length) {
                    int i5 = (int) jArr[i2];
                    int i6 = (int) jArr2[i2];
                    if (i2 < jArr.length - i && i5 + i6 != jArr[i2 + 1]) {
                        this.f7755 = false;
                    }
                    int i7 = i5 - i3;
                    if (i7 < 0) {
                        return;
                    }
                    long j3 = i7;
                    if (c2036.skip(j3) != j3) {
                        String str = "Failed to skip " + i7 + " bytes.";
                        return;
                    }
                    int i8 = i3 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (c2036.read(bArr2) != i6) {
                        String str2 = "Failed to read " + i6 + " bytes.";
                        return;
                    }
                    i3 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i4, i6);
                    i4 += i6;
                    i2++;
                    i = 1;
                }
                if (this.f7755) {
                    long j4 = jArr[0];
                    return;
                }
                return;
            }
        }
        if (f7723) {
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m5701(C2041 c2041) throws Throwable {
        m5707(c2041);
        m5715(c2041, 0);
        m5720(c2041, 0);
        m5720(c2041, 5);
        m5720(c2041, 4);
        m5719();
        if (this.f7752 == 8) {
            HashMap[] mapArr = this.f7756;
            C2039 c2039 = (C2039) mapArr[1].get("MakerNote");
            if (c2039 != null) {
                C2041 c20412 = new C2041(c2039.f7715);
                c20412.f7706 = this.f7754;
                c20412.m5685(6);
                m5715(c20412, 9);
                C2039 c20392 = (C2039) mapArr[9].get("ColorSpace");
                if (c20392 != null) {
                    mapArr[1].put("ColorSpace", c20392);
                }
            }
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m5702(C2036 c2036) throws Throwable {
        if (f7723) {
            String str = "getWebpAttributes starting with: " + c2036;
        }
        c2036.f7706 = ByteOrder.LITTLE_ENDIAN;
        c2036.m5685(f7732.length);
        int i = c2036.readInt() + 8;
        byte[] bArr = f7742;
        c2036.m5685(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c2036.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c2036.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f7722, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c2036.read(bArr3) == i2) {
                        this.f7751 = i3;
                        m5705(0, bArr3);
                        m5700(new C2036(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ˉⁱ.ʽᐧ(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c2036.m5685(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m5703(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f7756;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f7723;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                return;
            } else {
                return;
            }
        }
        C2039 c2039 = (C2039) mapArr[i].get("ImageLength");
        C2039 c20392 = (C2039) mapArr[i].get("ImageWidth");
        C2039 c20393 = (C2039) mapArr[i2].get("ImageLength");
        C2039 c20394 = (C2039) mapArr[i2].get("ImageWidth");
        if (c2039 == null || c20392 == null) {
            if (z) {
                return;
            } else {
                return;
            }
        }
        if (c20393 == null || c20394 == null) {
            if (z) {
                return;
            } else {
                return;
            }
        }
        int iM5692 = c2039.m5692(this.f7754);
        int iM56922 = c20392.m5692(this.f7754);
        int iM56923 = c20393.m5692(this.f7754);
        int iM56924 = c20394.m5692(this.f7754);
        if (iM5692 >= iM56923 || iM56922 >= iM56924) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m5704(C2036 c2036, HashMap map) throws Throwable {
        C2039 c2039 = (C2039) map.get("JPEGInterchangeFormat");
        C2039 c20392 = (C2039) map.get("JPEGInterchangeFormatLength");
        if (c2039 == null || c20392 == null) {
            return;
        }
        int iM5692 = c2039.m5692(this.f7754);
        int iM56922 = c20392.m5692(this.f7754);
        if (this.f7752 == 7) {
            iM5692 += this.f7757;
        }
        if (iM5692 > 0 && iM56922 > 0 && this.f7747 == null && this.f7753 == null) {
            c2036.skip(iM5692);
            c2036.read(new byte[iM56922]);
        }
        if (f7723) {
            String str = "Setting thumbnail attributes with offset: " + iM5692 + ", length: " + iM56922;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m5705(int i, byte[] bArr) throws IOException {
        C2041 c2041 = new C2041(bArr);
        m5707(c2041);
        m5715(c2041, i);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m5706(C2041 c2041) throws Throwable {
        if (f7723) {
            String str = "getRw2Attributes starting with: " + c2041;
        }
        m5701(c2041);
        HashMap[] mapArr = this.f7756;
        C2039 c2039 = (C2039) mapArr[0].get("JpgFromRaw");
        if (c2039 != null) {
            m5699(new C2036(c2039.f7715), (int) c2039.f7713, 5);
        }
        C2039 c20392 = (C2039) mapArr[0].get("ISO");
        C2039 c20393 = (C2039) mapArr[1].get("PhotographicSensitivity");
        if (c20392 == null || c20393 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c20392);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m5707(C2041 c2041) throws IOException {
        ByteOrder byteOrderM5697 = m5697(c2041);
        this.f7754 = byteOrderM5697;
        c2041.f7706 = byteOrderM5697;
        int unsignedShort = c2041.readUnsignedShort();
        int i = this.f7752;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c2041.readInt();
        if (i2 < 8) {
            throw new IOException(ˉᵎ.ˉⁱ("Invalid first Ifd offset: ", i2));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c2041.m5685(i3);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m5708(C2036 c2036) throws Throwable {
        if (f7723) {
            String str = "getPngAttributes starting with: " + c2036;
        }
        c2036.f7706 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f7719;
        c2036.m5685(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c2036.readInt();
                byte[] bArr2 = new byte[4];
                if (c2036.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f7745)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f7744)) {
                    return;
                }
                if (Arrays.equals(bArr2, f7725)) {
                    byte[] bArr3 = new byte[i];
                    if (c2036.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ˉⁱ.ʽᐧ(bArr2));
                    }
                    int i3 = c2036.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f7751 = i2;
                        m5705(0, bArr3);
                        m5719();
                        m5700(new C2036(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c2036.m5685(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2039 m5709(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f7723) {
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f7721.length; i++) {
            C2039 c2039 = (C2039) this.f7756[i].get(str);
            if (c2039 != null) {
                return c2039;
            }
        }
        return null;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m5710() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f7756;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM40 = AbstractC0002.m40(i, "The size of tag group[", "]: ");
            sbM40.append(mapArr[i].size());
            sbM40.toString();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C2039 c2039 = (C2039) entry.getValue();
                String str = "tagName: " + ((String) entry.getKey()) + ", tagType: " + c2039.toString() + ", tagValue: '" + c2039.m5693(this.f7754) + "'";
            }
            i++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5711() {
        String strM5698 = m5698("DateTimeOriginal");
        HashMap[] mapArr = this.f7756;
        if (strM5698 != null && m5698("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM5698.concat("\u0000").getBytes(f7746);
            map.put("DateTime", new C2039(bytes, 2, bytes.length));
        }
        if (m5698("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C2039.m5691(0L, this.f7754));
        }
        if (m5698("ImageLength") == null) {
            mapArr[0].put("ImageLength", C2039.m5691(0L, this.f7754));
        }
        if (m5698("Orientation") == null) {
            mapArr[0].put("Orientation", C2039.m5691(0L, this.f7754));
        }
        if (m5698("LightSource") == null) {
            mapArr[1].put("LightSource", C2039.m5691(0L, this.f7754));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:157|12|(3:147|13|(6:16|(2:18|(1:20))(1:25)|26|(1:28)|29|(1:31)(2:32|(4:38|(3:41|(1:43)(2:44|(1:46))|(1:173)(3:170|49|50))(2:40|171)|51|33))))|15|153|61|149|62|63|(1:69)(1:68)|70|(1:84)(8:155|86|151|87|88|(1:90)(1:91)|92|(1:106)(3:108|(2:109|(2:111|(2:162|113)(1:114))(2:163|115))|(1:117)(4:119|(2:120|(2:122|(1:165)(1:125))(3:164|126|(2:127|(2:129|(1:167)(1:132))(2:166|133))))|124|(1:135)(1:137))))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e2, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e7, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e9, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ec, code lost:
    
        if (r6 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ee, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f2, code lost:
    
        if (r2 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f4, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m5712(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C2042.m5712(java.io.BufferedInputStream):int");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m5713(C2041 c2041) throws Throwable {
        int i;
        int i2;
        m5701(c2041);
        HashMap[] mapArr = this.f7756;
        C2039 c2039 = (C2039) mapArr[1].get("MakerNote");
        if (c2039 != null) {
            C2041 c20412 = new C2041(c2039.f7715);
            c20412.f7706 = this.f7754;
            byte[] bArr = f7738;
            byte[] bArr2 = new byte[bArr.length];
            c20412.readFully(bArr2);
            c20412.m5696(0L);
            byte[] bArr3 = f7741;
            byte[] bArr4 = new byte[bArr3.length];
            c20412.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c20412.m5696(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c20412.m5696(12L);
            }
            m5715(c20412, 6);
            C2039 c20392 = (C2039) mapArr[7].get("PreviewImageStart");
            C2039 c20393 = (C2039) mapArr[7].get("PreviewImageLength");
            if (c20392 != null && c20393 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c20392);
                mapArr[5].put("JPEGInterchangeFormatLength", c20393);
            }
            C2039 c20394 = (C2039) mapArr[8].get("AspectFrame");
            if (c20394 != null) {
                int[] iArr = (int[]) c20394.m5694(this.f7754);
                if (iArr == null || iArr.length != 4) {
                    String str = "Invalid aspect frame values. frame=" + Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C2039 c2039M5690 = C2039.m5690(i5, this.f7754);
                C2039 c2039M56902 = C2039.m5690(i6, this.f7754);
                mapArr[0].put("ImageWidth", c2039M5690);
                mapArr[0].put("ImageLength", c2039M56902);
            }
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean m5714(HashMap map) {
        C2039 c2039 = (C2039) map.get("ImageLength");
        C2039 c20392 = (C2039) map.get("ImageWidth");
        if (c2039 == null || c20392 == null) {
            return false;
        }
        return c2039.m5692(this.f7754) <= 512 && c20392.m5692(this.f7754) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5715(p128.C2041 r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C2042.m5715(ˈﹳ.ٴˎ, int):void");
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m5716(int i, String str, String str2) {
        HashMap[] mapArr = this.f7756;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5717(C2041 c2041) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC2044.m5721(mediaMetadataRetriever, new C2040(c2041));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f7756;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C2039.m5690(Integer.parseInt(strExtractMetadata), this.f7754));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C2039.m5690(Integer.parseInt(strExtractMetadata2), this.f7754));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C2039.m5690(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f7754));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c2041.m5696(i2);
                    byte[] bArr = new byte[6];
                    if (c2041.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f7718)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c2041.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f7751 = i4;
                    m5705(0, bArr2);
                }
                if (f7723) {
                    String str = "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3;
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m5718(C2036 c2036) throws Throwable {
        boolean z = f7723;
        if (z) {
            String str = "getRafAttributes starting with: " + c2036;
        }
        c2036.m5685(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c2036.read(bArr);
        c2036.read(bArr2);
        c2036.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c2036.m5685(i - c2036.f7707);
        c2036.read(bArr4);
        m5699(new C2036(bArr4), i, 5);
        c2036.m5685(i3 - c2036.f7707);
        c2036.f7706 = ByteOrder.BIG_ENDIAN;
        int i4 = c2036.readInt();
        if (z) {
            String str2 = "numberOfDirectoryEntry: " + i4;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c2036.readUnsignedShort();
            int unsignedShort2 = c2036.readUnsignedShort();
            if (unsignedShort == f7734.f7760) {
                short s = c2036.readShort();
                short s2 = c2036.readShort();
                C2039 c2039M5690 = C2039.m5690(s, this.f7754);
                C2039 c2039M56902 = C2039.m5690(s2, this.f7754);
                HashMap[] mapArr = this.f7756;
                mapArr[0].put("ImageLength", c2039M5690);
                mapArr[0].put("ImageWidth", c2039M56902);
                if (z) {
                    String str3 = "Updated to length: " + ((int) s) + ", width: " + ((int) s2);
                    return;
                }
                return;
            }
            c2036.m5685(unsignedShort2);
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m5719() throws Throwable {
        m5703(0, 5);
        m5703(0, 4);
        m5703(5, 4);
        HashMap[] mapArr = this.f7756;
        C2039 c2039 = (C2039) mapArr[1].get("PixelXDimension");
        C2039 c20392 = (C2039) mapArr[1].get("PixelYDimension");
        if (c2039 != null && c20392 != null) {
            mapArr[0].put("ImageWidth", c2039);
            mapArr[0].put("ImageLength", c20392);
        }
        if (mapArr[4].isEmpty() && m5714(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m5714(mapArr[4])) {
        }
        m5716(0, "ThumbnailOrientation", "Orientation");
        m5716(0, "ThumbnailImageLength", "ImageLength");
        m5716(0, "ThumbnailImageWidth", "ImageWidth");
        m5716(5, "ThumbnailOrientation", "Orientation");
        m5716(5, "ThumbnailImageLength", "ImageLength");
        m5716(5, "ThumbnailImageWidth", "ImageWidth");
        m5716(4, "Orientation", "ThumbnailOrientation");
        m5716(4, "ImageLength", "ThumbnailImageLength");
        m5716(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m5720(C2041 c2041, int i) throws Throwable {
        C2039 c2039M5690;
        C2039 c2039M56902;
        HashMap[] mapArr = this.f7756;
        C2039 c2039 = (C2039) mapArr[i].get("DefaultCropSize");
        C2039 c20392 = (C2039) mapArr[i].get("SensorTopBorder");
        C2039 c20393 = (C2039) mapArr[i].get("SensorLeftBorder");
        C2039 c20394 = (C2039) mapArr[i].get("SensorBottomBorder");
        C2039 c20395 = (C2039) mapArr[i].get("SensorRightBorder");
        if (c2039 != null) {
            if (c2039.f7714 == 5) {
                C2037[] c2037Arr = (C2037[]) c2039.m5694(this.f7754);
                if (c2037Arr == null || c2037Arr.length != 2) {
                    String str = "Invalid crop size values. cropSize=" + Arrays.toString(c2037Arr);
                    return;
                }
                c2039M5690 = C2039.m5689(c2037Arr[0], this.f7754);
                c2039M56902 = C2039.m5689(c2037Arr[1], this.f7754);
            } else {
                int[] iArr = (int[]) c2039.m5694(this.f7754);
                if (iArr == null || iArr.length != 2) {
                    String str2 = "Invalid crop size values. cropSize=" + Arrays.toString(iArr);
                    return;
                }
                c2039M5690 = C2039.m5690(iArr[0], this.f7754);
                c2039M56902 = C2039.m5690(iArr[1], this.f7754);
            }
            mapArr[i].put("ImageWidth", c2039M5690);
            mapArr[i].put("ImageLength", c2039M56902);
            return;
        }
        if (c20392 != null && c20393 != null && c20394 != null && c20395 != null) {
            int iM5692 = c20392.m5692(this.f7754);
            int iM56922 = c20394.m5692(this.f7754);
            int iM56923 = c20395.m5692(this.f7754);
            int iM56924 = c20393.m5692(this.f7754);
            if (iM56922 <= iM5692 || iM56923 <= iM56924) {
                return;
            }
            C2039 c2039M56903 = C2039.m5690(iM56922 - iM5692, this.f7754);
            C2039 c2039M56904 = C2039.m5690(iM56923 - iM56924, this.f7754);
            mapArr[i].put("ImageLength", c2039M56903);
            mapArr[i].put("ImageWidth", c2039M56904);
            return;
        }
        C2039 c20396 = (C2039) mapArr[i].get("ImageLength");
        C2039 c20397 = (C2039) mapArr[i].get("ImageWidth");
        if (c20396 == null || c20397 == null) {
            C2039 c20398 = (C2039) mapArr[i].get("JPEGInterchangeFormat");
            C2039 c20399 = (C2039) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c20398 == null || c20399 == null) {
                return;
            }
            int iM56925 = c20398.m5692(this.f7754);
            int iM56926 = c20398.m5692(this.f7754);
            c2041.m5696(iM56925);
            byte[] bArr = new byte[iM56926];
            c2041.read(bArr);
            m5699(new C2036(bArr), iM56925, i);
        }
    }
}
