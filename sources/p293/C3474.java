package p293;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.measurement.C0316;
import com.google.android.gms.internal.measurement.C0326;
import com.google.android.gms.internal.measurement.C0329;
import com.google.android.gms.internal.measurement.C0345;
import com.google.android.gms.internal.measurement.C0354;
import com.google.android.gms.internal.measurement.C0407;
import com.google.android.gms.internal.measurement.C0431;
import com.google.android.gms.internal.measurement.C0441;
import com.google.android.gms.internal.measurement.C0450;
import com.google.android.gms.internal.measurement.C0495;
import com.google.android.gms.internal.measurement.C0536;
import com.google.android.gms.internal.measurement.C0559;
import com.google.android.gms.internal.measurement.C0568;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0876;
import p033.C1215;
import p076.InterfaceC1668;
import p133.C2079;
import p166.C2431;
import p234.C3083;
import p257.C3204;
import p258.C3207;
import p312.InterfaceC3586;
import p314.InterfaceC3601;
import p362.InterfaceC4110;
import p366.C4143;
import p366.C4155;
import p366.C4167;
import p376.AbstractC4320;
import p378.C4377;
import p383.AbstractC4470;
import p385.C4484;
import p385.C4495;
import p385.InterfaceC4497;
import p397.InterfaceC4602;
import p397.InterfaceC4603;
import p401.C4619;
import p442.C5141;
import p446.InterfaceC5161;
import p456.InterfaceC5313;
import ˏᵢ.ᵢٴ;
import ᴵﹳ.ﹶˆ;
import ᵎﹳ.ᐧʻ;
import ᵢ.ʿʼ;

/* renamed from: ٴᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3474 implements InterfaceC3601, InterfaceC4110, InterfaceC4497, InterfaceC4603, InterfaceC1668, InterfaceC5161, InterfaceC5313 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13430;

    public /* synthetic */ C3474(int i) {
        this.f13430 = i;
    }

    public C3474(View view) {
        this.f13430 = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            new C4377(23, view).f16882 = view;
        } else {
            new ᵢٴ(23, view);
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static boolean m8337() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C4167 m8338(File file) {
        String str = C4167.f16083;
        String string = file.toString();
        C4155 c4155 = AbstractC4320.f16780;
        C4143 c4143 = new C4143();
        c4143.m9496(string);
        return AbstractC4320.m9820(c4143, false);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4167 m8339(String str) {
        C4155 c4155 = AbstractC4320.f16780;
        C4143 c4143 = new C4143();
        c4143.m9496(str);
        return AbstractC4320.m9820(c4143, false);
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo8340() {
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo8341(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p076.InterfaceC1668
    /* renamed from: ʿˏ */
    public Object mo5358(Uri uri, C0876 c0876) {
        return Long.valueOf(AbstractC4470.m10204(new BufferedReader(new InputStreamReader(c0876)).readLine()));
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˉי, reason: contains not printable characters */
    public void mo8342(byte[] bArr) {
    }

    @Override // p397.InterfaceC4603
    /* renamed from: ˉⁱ */
    public int mo8051(C2431 c2431) {
        String str = c2431.f9667;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(ᐧʻ.ﾞˊ("Unsupported MIME type: ", str));
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ˋˊ */
    public boolean mo4056(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ˋⁱ */
    public boolean mo4057(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public /* synthetic */ void mo8343(byte[] bArr, C1215 c1215) {
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public byte[] mo8344(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C4495 mo8345() {
        throw new IllegalStateException();
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Map mo8346(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean mo8347(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ˑי, reason: contains not printable characters */
    public void mo8348(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p362.InterfaceC4110
    /* renamed from: יʻ */
    public boolean mo4061() {
        return false;
    }

    @Override // p456.InterfaceC5313
    /* renamed from: ـﹶ */
    public Object mo8054() {
        switch (this.f13430) {
            case 17:
                C0407.f2694.get();
                Boolean bool = (Boolean) C0568.f2926.m2133();
                bool.getClass();
                return bool;
            case 18:
                C0441.f2748.get();
                return Integer.valueOf((int) ((Long) C0354.f2506.m2133()).longValue());
            case 19:
                C0326.f2444.get();
                Boolean bool2 = (Boolean) C0431.f2729.m2133();
                bool2.getClass();
                return bool2;
            case 20:
                C0316.f2434.get();
                Boolean bool3 = (Boolean) C0450.f2755.m2133();
                bool3.getClass();
                return bool3;
            case 21:
                C0441.f2748.get();
                return Integer.valueOf((int) ((Long) C0354.f2480.m2133()).longValue());
            case 22:
                C0329.f2451.get();
                Boolean bool4 = (Boolean) C0495.f2831.m2133();
                bool4.getClass();
                return bool4;
            case 23:
                C0441.f2748.get();
                return Integer.valueOf((int) ((Long) C0354.f2522.m2133()).longValue());
            case 24:
                C0441.f2748.get();
                return Integer.valueOf((int) ((Long) C0354.f2492.m2133()).longValue());
            case 25:
                C0441.f2748.get();
                Long l = (Long) C0354.f2534.m2133();
                l.getClass();
                return l;
            case 26:
                C0536.f2876.get();
                Boolean bool5 = (Boolean) C0345.f2465.m2133();
                bool5.getClass();
                return bool5;
            case 27:
                C0441.f2748.get();
                Long l2 = (Long) C0354.f2485.m2133();
                l2.getClass();
                return l2;
            case 28:
                C0441.f2748.get();
                Long l3 = (Long) C0354.f2484.m2133();
                l3.getClass();
                return l3;
            default:
                C0441.f2748.get();
                Long l4 = (Long) C0354.f2533.m2133();
                l4.getClass();
                return l4;
        }
    }

    @Override // p397.InterfaceC4603
    /* renamed from: ٴˎ */
    public boolean mo8055(C2431 c2431) {
        String str = c2431.f9667;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p446.InterfaceC5161
    /* renamed from: ᐧʻ */
    public boolean mo8056(long j) {
        switch (this.f13430) {
            case 14:
                if (j == 3221225524L || j == 3221225530L || j == 3221225658L || j == 3221225558L) {
                }
                break;
            default:
                if (j == 0 || j == 3221225768L) {
                }
                break;
        }
        return true;
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ᴵʿ */
    public int mo4065() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p397.InterfaceC4603
    /* renamed from: ᵎˏ */
    public InterfaceC4602 mo8058(C2431 c2431) {
        List list;
        String str = c2431.f9667;
        if (str != null) {
            list = c2431.f9674;
            switch (str) {
                case "application/dvbsubs":
                    return new C3207(list);
                case "application/pgs":
                    return new ﹶˆ(13);
                case "application/x-mp4-vtt":
                    return new C3083(0);
                case "text/vtt":
                    return new C0559(11);
                case "application/x-quicktime-tx3g":
                    return new C3204(list);
                case "text/x-ssa":
                    return new C4619(list);
                case "application/x-subrip":
                    return new C5141();
                case "application/ttml+xml":
                    return new C2079();
            }
        }
        throw new IllegalArgumentException(ᐧʻ.ﾞˊ("Unsupported MIME type: ", str));
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public C4484 mo8349(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int mo8350() {
        return 1;
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public byte[] mo8351() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ﹳﹳ */
    public MediaCodecInfo mo4067(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p314.InterfaceC3601
    /* renamed from: ﹶˆ */
    public void mo4607(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public void mo8352(ʿʼ r1) {
    }

    @Override // p385.InterfaceC4497
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public InterfaceC3586 mo8353(byte[] bArr) {
        throw new IllegalStateException();
    }
}
