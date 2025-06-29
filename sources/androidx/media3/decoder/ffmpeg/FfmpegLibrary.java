package androidx.media3.decoder.ffmpeg;

import java.util.Arrays;
import p166.AbstractC2426;
import p383.AbstractC4464;

/* loaded from: classes.dex */
public abstract class FfmpegLibrary {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String f1353;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int f1354;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C0268 f1355;

    static {
        AbstractC2426.m6526("media3.decoder.ffmpeg");
        C0268 c0268 = new C0268();
        c0268.f1400 = new String[]{"ffmpegJNI"};
        f1355 = c0268;
        f1354 = -1;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m1108() {
        if (!m1112()) {
            return -1;
        }
        if (f1354 == -1) {
            f1354 = ffmpegGetInputBufferPaddingSize();
        }
        return f1354;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m1109(String str) {
        String strM1111;
        if (!m1112() || (strM1111 = m1111(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(strM1111)) {
            return true;
        }
        AbstractC4464.m10144("FfmpegLibrary", "No " + strM1111 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m1110() {
        if (!m1112()) {
            return null;
        }
        if (f1353 == null) {
            f1353 = ffmpegGetVersion();
        }
        return f1353;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m1111(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
            case "video/hevc":
                return "hevc";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "audio/ac3":
                return "ac3";
            case "video/avc":
                return "h264";
            case "audio/3gpp":
                return "amrnb";
            case "audio/alac":
                return "alac";
            case "audio/flac":
                return "flac";
            case "audio/opus":
                return "opus";
            case "audio/true-hd":
                return "truehd";
            case "audio/g711-alaw":
                return "pcm_alaw";
            case "audio/g711-mlaw":
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m1112() {
        boolean z;
        C0268 c0268 = f1355;
        synchronized (c0268) {
            if (c0268.f1401) {
                z = c0268.f1399;
            } else {
                c0268.f1401 = true;
                try {
                    for (String str : (String[]) c0268.f1400) {
                        System.loadLibrary(str);
                    }
                    c0268.f1399 = true;
                } catch (UnsatisfiedLinkError unused) {
                    AbstractC4464.m10144("LibraryLoader", "Failed to load " + Arrays.toString((String[]) c0268.f1400));
                }
                z = c0268.f1399;
            }
        }
        return z;
    }
}
