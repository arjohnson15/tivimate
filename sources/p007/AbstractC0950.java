package p007;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.leanback.widget.ˉⁱ;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p166.AbstractC2435;
import p166.C2415;
import p166.C2417;
import p166.C2431;
import p166.C2437;
import p312.C3589;
import p331.C3761;
import p345.C3932;
import p362.AbstractC4126;
import p362.AbstractC4130;
import p362.C4116;
import p362.C4120;
import p362.C4123;
import p362.C4125;
import p362.InterfaceC4115;
import p362.InterfaceC4118;
import p362.InterfaceC4129;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4460;
import p383.C4467;
import p383.C4469;
import p385.InterfaceC4493;
import p395.EnumC4543;
import p438.C5074;
import p438.C5081;
import p438.C5096;
import p438.C5099;
import p438.SurfaceHolderCallbackC5075;
import p456.C5349;
import ʾי.ˑʽ;
import ـˏ.ᴵˋ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻˉ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0950 extends AbstractC4126 {

    /* renamed from: ʾـ, reason: contains not printable characters */
    public static boolean f4170;

    /* renamed from: ˑˊ, reason: contains not printable characters */
    public static boolean f4171;

    /* renamed from: ﹳʻ, reason: contains not printable characters */
    public static final int[] f4172 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public final C0945 f4173;

    /* renamed from: ʻـ, reason: contains not printable characters */
    public boolean f4174;

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public C0961 f4175;

    /* renamed from: ˈʾ, reason: contains not printable characters */
    public boolean f4176;

    /* renamed from: ˉ, reason: contains not printable characters */
    public final boolean f4177;

    /* renamed from: ˉʽ, reason: contains not printable characters */
    public long f4178;

    /* renamed from: ˊʾ, reason: contains not printable characters */
    public int f4179;

    /* renamed from: ˊˉ, reason: contains not printable characters */
    public int f4180;

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public List f4181;

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public boolean f4182;

    /* renamed from: ˎـ, reason: contains not printable characters */
    public boolean f4183;

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public final C0969 f4184;

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public C0957 f4185;

    /* renamed from: ˑˏ, reason: contains not printable characters */
    public long f4186;

    /* renamed from: יʾ, reason: contains not printable characters */
    public final boolean f4187;

    /* renamed from: יᵎ, reason: contains not printable characters */
    public int f4188;

    /* renamed from: יᵔ, reason: contains not printable characters */
    public long f4189;

    /* renamed from: ـᐧ, reason: contains not printable characters */
    public boolean f4190;

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public boolean f4191;

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final Context f4192;

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public Surface f4193;

    /* renamed from: ᵎˑ, reason: contains not printable characters */
    public C2437 f4194;

    /* renamed from: ᵔˊ, reason: contains not printable characters */
    public C2437 f4195;

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public C0946 f4196;

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final C3761 f4197;

    /* renamed from: ⁱי, reason: contains not printable characters */
    public C0959 f4198;

    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    public boolean f4199;

    /* renamed from: ⁱﹳ, reason: contains not printable characters */
    public int f4200;

    /* renamed from: ⁱﾞ, reason: contains not printable characters */
    public int f4201;

    /* renamed from: ﹳˋ, reason: contains not printable characters */
    public int f4202;

    /* renamed from: ﹳﾞ, reason: contains not printable characters */
    public InterfaceC0939 f4203;

    /* renamed from: ﾞʾ, reason: contains not printable characters */
    public int f4204;

    /* renamed from: ﾞי, reason: contains not printable characters */
    public final int f4205;

    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    public C4467 f4206;

    public AbstractC0950(Context context, InterfaceC4118 interfaceC4118, ˉⁱ r9, long j, boolean z, Handler handler, SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075) {
        super(2, interfaceC4118, r9, z, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f4192 = applicationContext;
        this.f4205 = 50;
        this.f4197 = new C3761(handler, surfaceHolderCallbackC5075);
        this.f4177 = true;
        this.f4184 = new C0969(applicationContext, this, j);
        this.f4173 = new C0945();
        this.f4187 = "NVIDIA".equals(AbstractC4470.f17200);
        this.f4206 = C4467.f17187;
        this.f4180 = 1;
        this.f4194 = C2437.f9721;
        this.f4179 = 0;
        this.f4195 = null;
        this.f4202 = -1000;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static List m3843(Context context, InterfaceC4115 interfaceC4115, C2431 c2431, boolean z, boolean z2) {
        String str = c2431.f9667;
        if (str == null) {
            return C3932.f15274;
        }
        if (AbstractC4470.f17202 >= 26 && "video/dolby-vision".equals(str) && !AbstractC0944.m3810(context)) {
            String strM9467 = AbstractC4130.m9467(c2431);
            List listMo8484 = strM9467 == null ? C3932.f15274 : interfaceC4115.mo8484(strM9467, z, z2);
            if (!listMo8484.isEmpty()) {
                return listMo8484;
            }
        }
        return AbstractC4130.m9474(interfaceC4115, c2431, z, z2);
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public static int m3844(C4116 c4116, C2431 c2431) {
        if (c2431.f9683 == -1) {
            return m3845(c4116, c2431);
        }
        List list = c2431.f9674;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return c2431.f9683 + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3845(p362.C4116 r11, p166.C2431 r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.AbstractC0950.m3845(ᵔᵢ.ˏʾ, ˊﹶ.ᵎـ):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m3846(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.AbstractC0950.m3846(java.lang.String):boolean");
    }

    @Override // p362.AbstractC4126
    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void mo3847(C3589 c3589) {
        Surface surface;
        boolean z = this.f4190;
        if (!z) {
            this.f4204++;
        }
        if (AbstractC4470.f17202 >= 23 || !z) {
            return;
        }
        long j = c3589.f13807;
        m9449(j);
        m3866(this.f4194);
        this.f15991.f19236++;
        C0969 c0969 = this.f4184;
        boolean z2 = c0969.f4277 != 3;
        c0969.f4277 = 3;
        c0969.f4279.getClass();
        c0969.f4285 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
        if (z2 && (surface = this.f4193) != null) {
            C3761 c3761 = this.f4197;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0941(c3761, surface, SystemClock.elapsedRealtime()));
            }
            this.f4199 = true;
        }
        mo3856(j);
    }

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final void m3848() {
        Surface surface = this.f4193;
        C0961 c0961 = this.f4175;
        if (surface == c0961) {
            this.f4193 = null;
        }
        if (c0961 != null) {
            c0961.release();
            this.f4175 = null;
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int mo3849(C3589 c3589) {
        return (AbstractC4470.f17202 < 34 || !this.f4190 || c3589.f13807 >= this.f19475) ? 0 : 32;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C5099 mo3850(C5349 c5349) throws ExoPlaybackException {
        C5099 c5099Mo3850 = super.mo3850(c5349);
        C2431 c2431 = (C2431) c5349.f20757;
        c2431.getClass();
        C3761 c3761 = this.f4197;
        Handler handler = (Handler) c3761.f14527;
        if (handler != null) {
            handler.post(new ᐧˋ(c3761, c2431, c5099Mo3850, 1));
        }
        return c5099Mo3850;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void mo3851(C2431 c2431) throws ExoPlaybackException {
        C0957 c0957 = this.f4185;
        if (c0957 == null) {
            return;
        }
        c0957.getClass();
        try {
            this.f4185.m3886(c2431);
            throw null;
        } catch (VideoSink$VideoSinkException e) {
            throw m11339(e, c2431, false, 7000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    @Override // p362.AbstractC4126
    /* renamed from: ˉᵎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3852(p166.C2431 r10, android.media.MediaFormat r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.AbstractC0950.mo3852(ˊﹶ.ᵎـ, android.media.MediaFormat):void");
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public final boolean mo1119() {
        C0961 c0961;
        boolean z = super.mo1119() && this.f4185 == null;
        if (z && (((c0961 = this.f4175) != null && this.f4193 == c0961) || this.f15961 == null || this.f4190)) {
            return true;
        }
        C0969 c0969 = this.f4184;
        if (z && c0969.f4277 == 3) {
            c0969.f4287 = -9223372036854775807L;
        } else {
            if (c0969.f4287 == -9223372036854775807L) {
                return false;
            }
            c0969.f4279.getClass();
            if (SystemClock.elapsedRealtime() >= c0969.f4287) {
                c0969.f4287 = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final void m3853() {
        if (this.f4201 > 0) {
            this.f19490.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f4189;
            int i = this.f4201;
            C3761 c3761 = this.f4197;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0947(c3761, i, j));
            }
            this.f4201 = 0;
            this.f4189 = jElapsedRealtime;
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final void mo3854(Exception exc) {
        AbstractC4464.m10147("MediaCodecVideoRenderer", "Video codec error", exc);
        C3761 c3761 = this.f4197;
        Handler handler = (Handler) c3761.f14527;
        if (handler != null) {
            handler.post(new RunnableC0947(c3761, exc, 3));
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final void mo3855(long j, long j2, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C3761 c3761 = this.f4197;
        Handler handler = (Handler) c3761.f14527;
        if (handler != null) {
            handler.post(new RunnableC0947(c3761, str, j, j2));
        }
        this.f4182 = m3846(str);
        C4116 c4116 = this.f15942;
        c4116.getClass();
        boolean z = false;
        if (AbstractC4470.f17202 >= 29 && "video/x-vnd.on2.vp9".equals(c4116.f15898)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c4116.f15905;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f4191 = z;
        m3879();
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˎˉ, reason: contains not printable characters */
    public void mo3856(long j) {
        super.mo3856(j);
        if (this.f4190) {
            return;
        }
        this.f4204--;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C5099 mo3857(C4116 c4116, C2431 c2431, C2431 c24312) {
        C5099 c5099M9434 = c4116.m9434(c2431, c24312);
        C0946 c0946 = this.f4196;
        c0946.getClass();
        int i = c24312.f9684;
        int i2 = c0946.f4158;
        int i3 = c5099M9434.f19403;
        if (i > i2 || c24312.f9687 > c0946.f4156) {
            i3 |= 256;
        }
        if (m3844(c4116, c24312) > c0946.f4157) {
            i3 |= 64;
        }
        int i4 = i3;
        return new C5099(c4116.f15902, c2431, c24312, i4 != 0 ? 0 : c5099M9434.f19406, i4);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo3858() {
        try {
            try {
                m9448();
                m9455();
            } finally {
                ᐧʻ.יʻ(this.f15940, (InterfaceC4493) null);
                this.f15940 = null;
            }
        } finally {
            this.f4174 = false;
            if (this.f4175 != null) {
                m3848();
            }
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C4123 mo3859(C4116 c4116, C2431 c2431, MediaCrypto mediaCrypto, float f) {
        int iMax;
        int i;
        int i2;
        C2415 c2415;
        C0946 c0946;
        Point point;
        float f2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i3;
        boolean z;
        Pair pairM9475;
        int iM3845;
        String str;
        C0961 c0961 = this.f4175;
        boolean z2 = c4116.f15903;
        if (c0961 != null && c0961.f4264 != z2) {
            m3848();
        }
        String str2 = c4116.f15901;
        C2431[] c2431Arr = this.f19486;
        c2431Arr.getClass();
        int iMax2 = c2431.f9684;
        boolean z3 = this.f4183;
        int i4 = c2431.f9687;
        if (z3 && (str = c4116.f15902) != null && str.startsWith("OMX.amlogic.avc.decoder.awesome")) {
            iMax2 = Math.max(iMax2, 1920);
            iMax = Math.max(i4, 1089);
        } else {
            iMax = i4;
        }
        int iM3844 = m3844(c4116, c2431);
        int length = c2431Arr.length;
        float f3 = c2431.f9659;
        int i5 = c2431.f9684;
        C2415 c24152 = c2431.f9688;
        if (length == 1) {
            if (iM3844 != -1 && (iM3845 = m3845(c4116, c2431)) != -1) {
                iM3844 = Math.min((int) (iM3844 * 1.5f), iM3845);
            }
            c0946 = new C0946(iMax2, iMax, iM3844);
            i = i4;
            i2 = i5;
            c2415 = c24152;
        } else {
            int length2 = c2431Arr.length;
            int i6 = 0;
            boolean z4 = false;
            while (i6 < length2) {
                C2431 c24312 = c2431Arr[i6];
                C2431[] c2431Arr2 = c2431Arr;
                if (c24152 != null && c24312.f9688 == null) {
                    C2417 c2417M6541 = c24312.m6541();
                    c2417M6541.f9613 = c24152;
                    c24312 = new C2431(c2417M6541);
                }
                if (c4116.m9434(c2431, c24312).f19406 != 0) {
                    int i7 = c24312.f9687;
                    i3 = length2;
                    int i8 = c24312.f9684;
                    z4 |= i8 == -1 || i7 == -1;
                    iMax2 = Math.max(iMax2, i8);
                    int iMax3 = Math.max(iMax, i7);
                    iM3844 = Math.max(iM3844, m3844(c4116, c24312));
                    iMax = iMax3;
                } else {
                    i3 = length2;
                }
                i6++;
                c2431Arr = c2431Arr2;
                length2 = i3;
            }
            if (z4) {
                AbstractC4464.m10144("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + "x" + iMax);
                boolean z5 = i4 > i5;
                int i9 = z5 ? i4 : i5;
                int i10 = z5 ? i5 : i4;
                c2415 = c24152;
                float f4 = i10 / i9;
                int[] iArr = f4172;
                i = i4;
                i2 = i5;
                int i11 = 0;
                while (i11 < 9) {
                    int i12 = iArr[i11];
                    int[] iArr2 = iArr;
                    int i13 = (int) (i12 * f4);
                    if (i12 <= i9 || i13 <= i10) {
                        break;
                    }
                    int i14 = i9;
                    int i15 = i10;
                    if (AbstractC4470.f17202 >= 21) {
                        int i16 = z5 ? i13 : i12;
                        if (!z5) {
                            i12 = i13;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = c4116.f15905;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f2 = f4;
                            point = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f4;
                            point = new Point(AbstractC4470.m10196(i16, widthAlignment) * widthAlignment, AbstractC4470.m10196(i12, heightAlignment) * heightAlignment);
                        }
                        if (point != null && c4116.m9437(point.x, point.y, f3)) {
                            break;
                        }
                        i11++;
                        iArr = iArr2;
                        i9 = i14;
                        i10 = i15;
                        f4 = f2;
                    } else {
                        f2 = f4;
                        try {
                            int iM10196 = AbstractC4470.m10196(i12, 16) * 16;
                            int iM101962 = AbstractC4470.m10196(i13, 16) * 16;
                            if (iM10196 * iM101962 <= AbstractC4130.m9469()) {
                                int i17 = z5 ? iM101962 : iM10196;
                                if (!z5) {
                                    iM10196 = iM101962;
                                }
                                point = new Point(i17, iM10196);
                            } else {
                                i11++;
                                iArr = iArr2;
                                i9 = i14;
                                i10 = i15;
                                f4 = f2;
                            }
                        } catch (MediaCodecUtil$DecoderQueryException unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(iMax, point.y);
                    C2417 c2417M65412 = c2431.m6541();
                    c2417M65412.f9607 = iMax2;
                    c2417M65412.f9620 = iMax;
                    iM3844 = Math.max(iM3844, m3845(c4116, new C2431(c2417M65412)));
                    AbstractC4464.m10144("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
            } else {
                i = i4;
                i2 = i5;
                c2415 = c24152;
            }
            c0946 = new C0946(iMax2, iMax, iM3844);
        }
        this.f4196 = c0946;
        int i18 = this.f4190 ? this.f4179 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        AbstractC4464.m10133(mediaFormat, c2431.f9674);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        AbstractC4464.m10150(mediaFormat, "rotation-degrees", c2431.f9666);
        if (c2415 != null) {
            C2415 c24153 = c2415;
            AbstractC4464.m10150(mediaFormat, "color-transfer", c24153.f9590);
            AbstractC4464.m10150(mediaFormat, "color-standard", c24153.f9591);
            AbstractC4464.m10150(mediaFormat, "color-range", c24153.f9588);
            byte[] bArr = c24153.f9594;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c2431.f9667) && (pairM9475 = AbstractC4130.m9475(c2431)) != null) {
            AbstractC4464.m10150(mediaFormat, "profile", ((Integer) pairM9475.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0946.f4158);
        mediaFormat.setInteger("max-height", c0946.f4156);
        AbstractC4464.m10150(mediaFormat, "max-input-size", c0946.f4157);
        int i19 = AbstractC4470.f17202;
        if (i19 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f4187) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i18 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i18);
        }
        if (i19 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f4202));
        }
        if (this.f4193 == null) {
            if (!m3872(c4116)) {
                throw new IllegalStateException();
            }
            if (this.f4175 == null) {
                this.f4175 = C0961.m3896(this.f4192, z2);
            }
            this.f4193 = this.f4175;
        }
        C0957 c0957 = this.f4185;
        if (c0957 != null && !AbstractC4470.m10189(c0957.f4234)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f4185 == null) {
            return new C4123(c4116, mediaFormat, c2431, this.f4193, mediaCrypto);
        }
        AbstractC4464.m10132(false);
        AbstractC4464.m10146(null);
        throw null;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ */
    public final boolean mo1122() {
        return this.f15934 && this.f4185 == null;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏᴵ */
    public final void mo1123(boolean z, boolean z2) {
        this.f15991 = new C5074();
        C5081 c5081 = this.f19484;
        c5081.getClass();
        boolean z3 = c5081.f19307;
        AbstractC4464.m10132((z3 && this.f4179 == 0) ? false : true);
        if (this.f4190 != z3) {
            this.f4190 = z3;
            m9455();
        }
        C5074 c5074 = this.f15991;
        C3761 c3761 = this.f4197;
        Handler handler = (Handler) c3761.f14527;
        if (handler != null) {
            handler.post(new RunnableC0947(c3761, c5074, 4));
        }
        boolean z4 = this.f4174;
        C0969 c0969 = this.f4184;
        if (!z4) {
            if ((this.f4181 != null || !this.f4177) && this.f4185 == null) {
                C0937 c0937 = new C0937(this.f4192, c0969);
                C4460 c4460 = this.f19490;
                c4460.getClass();
                c0937.f4129 = c4460;
                AbstractC4464.m10132(!c0937.f4124);
                if (((C0938) c0937.f4125) == null) {
                    if (((C0965) c0937.f4127) == null) {
                        c0937.f4127 = new C0965();
                    }
                    c0937.f4125 = new C0938((C0965) c0937.f4127);
                }
                C0951 c0951 = new C0951(c0937);
                c0937.f4124 = true;
                this.f4185 = c0951.f4215;
            }
            this.f4174 = true;
        }
        C0957 c0957 = this.f4185;
        if (c0957 == null) {
            C4460 c44602 = this.f19490;
            c44602.getClass();
            c0969.f4279 = c44602;
            c0969.f4277 = z2 ? 1 : 0;
            return;
        }
        ˑʽ r2 = new ˑʽ(9, this);
        EnumC4543 enumC4543 = EnumC4543.f17444;
        c0957.f4232 = r2;
        c0957.f4238 = enumC4543;
        InterfaceC0939 interfaceC0939 = this.f4203;
        if (interfaceC0939 != null) {
            c0957.f4231.f4213 = interfaceC0939;
        }
        if (this.f4193 != null && !this.f4206.equals(C4467.f17187)) {
            this.f4185.m3887(this.f4193, this.f4206);
        }
        C0957 c09572 = this.f4185;
        float f = this.f15980;
        C0940 c0940 = c09572.f4231.f4214;
        c0940.getClass();
        AbstractC4464.m10142(f > 0.0f);
        C0969 c09692 = c0940.f4131;
        if (f != c09692.f4280) {
            c09692.f4280 = f;
            C0958 c0958 = c09692.f4276;
            c0958.f4255 = f;
            c0958.f4243 = 0L;
            c0958.f4248 = -1L;
            c0958.f4252 = -1L;
            c0958.m3894(false);
        }
        List list = this.f4181;
        if (list != null) {
            C0957 c09573 = this.f4185;
            ArrayList arrayList = c09573.f4233;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                c09573.m3888();
            }
        }
        this.f4185.f4231.f4208.f4277 = z2 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.view.Surface] */
    @Override // p438.AbstractC5115, p438.InterfaceC5109
    /* renamed from: ˑʽ */
    public final void mo1125(int i, Object obj) throws ExoPlaybackException {
        Handler handler;
        C0969 c0969 = this.f4184;
        if (i == 1) {
            C0961 c0961M3896 = obj instanceof Surface ? (Surface) obj : null;
            if (c0961M3896 == null) {
                C0961 c0961 = this.f4175;
                if (c0961 != null) {
                    c0961M3896 = c0961;
                } else {
                    C4116 c4116 = this.f15942;
                    if (c4116 != null && m3872(c4116)) {
                        c0961M3896 = C0961.m3896(this.f4192, c4116.f15903);
                        this.f4175 = c0961M3896;
                    }
                }
            }
            Surface surface = this.f4193;
            C3761 c3761 = this.f4197;
            if (surface == c0961M3896) {
                if (c0961M3896 == null || c0961M3896 == this.f4175) {
                    return;
                }
                C2437 c2437 = this.f4195;
                if (c2437 != null) {
                    c3761.m8773(c2437);
                }
                Surface surface2 = this.f4193;
                if (surface2 == null || !this.f4199 || (handler = (Handler) c3761.f14527) == null) {
                    return;
                }
                handler.post(new RunnableC0941(c3761, surface2, SystemClock.elapsedRealtime()));
                return;
            }
            this.f4193 = c0961M3896;
            if (this.f4185 == null) {
                C0958 c0958 = c0969.f4276;
                c0958.getClass();
                C0961 c09612 = c0961M3896 instanceof C0961 ? null : c0961M3896;
                if (c0958.f4240 != c09612) {
                    c0958.m3892();
                    c0958.f4240 = c09612;
                    c0958.m3894(true);
                }
                c0969.m3935(1);
            }
            this.f4199 = false;
            int i2 = this.f19478;
            InterfaceC4129 interfaceC4129 = this.f15961;
            if (interfaceC4129 != null && this.f4185 == null) {
                if (AbstractC4470.f17202 < 23 || c0961M3896 == null || this.f4182) {
                    m9455();
                    m9458();
                } else {
                    interfaceC4129.mo5344(c0961M3896);
                }
            }
            if (c0961M3896 == null || c0961M3896 == this.f4175) {
                this.f4195 = null;
                C0957 c0957 = this.f4185;
                if (c0957 != null) {
                    C0951 c0951 = c0957.f4231;
                    c0951.getClass();
                    int i3 = C4467.f17187.f17189;
                    c0951.f4210 = null;
                }
            } else {
                C2437 c24372 = this.f4195;
                if (c24372 != null) {
                    c3761.m8773(c24372);
                }
                if (i2 == 2) {
                    c0969.m3933(true);
                }
            }
            m3879();
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC0939 interfaceC0939 = (InterfaceC0939) obj;
            this.f4203 = interfaceC0939;
            C0957 c09572 = this.f4185;
            if (c09572 != null) {
                c09572.f4231.f4213 = interfaceC0939;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f4179 != iIntValue) {
                this.f4179 = iIntValue;
                if (this.f4190) {
                    m9455();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f4202 = ((Integer) obj).intValue();
            InterfaceC4129 interfaceC41292 = this.f15961;
            if (interfaceC41292 != null && AbstractC4470.f17202 >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f4202));
                interfaceC41292.mo5343(bundle);
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f4180 = iIntValue2;
            InterfaceC4129 interfaceC41293 = this.f15961;
            if (interfaceC41293 != null) {
                interfaceC41293.mo5351(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            C0958 c09582 = c0969.f4276;
            if (c09582.f4241 == iIntValue3) {
                return;
            }
            c09582.f4241 = iIntValue3;
            c09582.m3894(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f4181 = list;
            C0957 c09573 = this.f4185;
            if (c09573 != null) {
                ArrayList arrayList = c09573.f4233;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                c09573.m3888();
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.f15971 = (C5096) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C4467 c4467 = (C4467) obj;
        if (c4467.f17189 == 0 || c4467.f17188 == 0) {
            return;
        }
        this.f4206 = c4467;
        C0957 c09574 = this.f4185;
        if (c09574 != null) {
            Surface surface3 = this.f4193;
            AbstractC4464.m10146(surface3);
            c09574.m3887(surface3, c4467);
        }
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ˑי */
    public final void mo1126(boolean z, long j) throws ExoPlaybackException {
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            c0957.m3889(true);
            C0957 c09572 = this.f4185;
            long j2 = this.f15948.f15914;
            c09572.getClass();
        }
        super.mo1126(z, j);
        C0957 c09573 = this.f4185;
        C0969 c0969 = this.f4184;
        if (c09573 == null) {
            C0958 c0958 = c0969.f4276;
            c0958.f4243 = 0L;
            c0958.f4248 = -1L;
            c0958.f4252 = -1L;
            c0969.f4281 = -9223372036854775807L;
            c0969.f4284 = -9223372036854775807L;
            c0969.m3935(1);
            c0969.f4287 = -9223372036854775807L;
        }
        if (z) {
            c0969.m3933(false);
        }
        m3879();
        this.f4200 = 0;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final float mo3860(float f, C2431[] c2431Arr) {
        float fMax = -1.0f;
        for (C2431 c2431 : c2431Arr) {
            float f2 = c2431.f9659;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final boolean mo3861() {
        return this.f4190 && AbstractC4470.f17202 < 23;
    }

    @Override // p362.AbstractC4126
    /* renamed from: יˋ, reason: contains not printable characters */
    public final void mo3862() {
        if (this.f4185 != null) {
            long j = this.f15948.f15914;
        } else {
            this.f4184.m3935(2);
        }
        m3879();
    }

    @Override // p362.AbstractC4126
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final boolean mo3863(long j, long j2, InterfaceC4129 interfaceC4129, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2431 c2431) throws ExoPlaybackException, InterruptedException {
        long j4;
        long j5;
        long j6;
        interfaceC4129.getClass();
        C4120 c4120 = this.f15948;
        long j7 = j3 - c4120.f15914;
        int iM3936 = this.f4184.m3936(j3, j, j2, c4120.f15913, z2, this.f4173);
        if (iM3936 == 4) {
            return false;
        }
        if (z && !z2) {
            m3876(interfaceC4129, i);
            return true;
        }
        Surface surface = this.f4193;
        C0961 c0961 = this.f4175;
        C0945 c0945 = this.f4173;
        if (surface == c0961 && this.f4185 == null) {
            if (c0945.f4155 >= 30000) {
                return false;
            }
            m3876(interfaceC4129, i);
            m3867(c0945.f4155);
            return true;
        }
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            try {
                c0957.m3890(j, j2);
                C0957 c09572 = this.f4185;
                c09572.getClass();
                AbstractC4464.m10132(false);
                AbstractC4464.m10132(c09572.f4229 != -1);
                long j8 = c09572.f4236;
                if (j8 != -9223372036854775807L) {
                    C0951 c0951 = c09572.f4231;
                    if (c0951.f4212 == 0) {
                        long j9 = c0951.f4214.f4133;
                        if (j9 != -9223372036854775807L && j9 >= j8) {
                            c09572.m3888();
                            c09572.f4236 = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                AbstractC4464.m10146(null);
                throw null;
            } catch (VideoSink$VideoSinkException e) {
                throw m11339(e, e.f1447, false, 7001);
            }
        }
        if (iM3936 == 0) {
            this.f19490.getClass();
            long jNanoTime = System.nanoTime();
            InterfaceC0939 interfaceC0939 = this.f4203;
            if (interfaceC0939 != null) {
                j4 = jNanoTime;
                interfaceC0939.mo3808(j7, jNanoTime, c2431, this.f15990);
            } else {
                j4 = jNanoTime;
            }
            if (AbstractC4470.f17202 >= 21) {
                m3878(interfaceC4129, i, j4);
            } else {
                m3870(interfaceC4129, i);
            }
            m3867(c0945.f4155);
            return true;
        }
        if (iM3936 != 1) {
            if (iM3936 == 2) {
                Trace.beginSection("dropVideoBuffer");
                interfaceC4129.mo5345(i, false);
                Trace.endSection();
                m3874(0, 1);
                m3867(c0945.f4155);
                return true;
            }
            if (iM3936 != 3) {
                if (iM3936 == 5) {
                    return false;
                }
                throw new IllegalStateException(String.valueOf(iM3936));
            }
            m3876(interfaceC4129, i);
            m3867(c0945.f4155);
            return true;
        }
        long j10 = c0945.f4154;
        long j11 = c0945.f4155;
        if (AbstractC4470.f17202 >= 21) {
            if (j10 != this.f4186 || this.f4176) {
                InterfaceC0939 interfaceC09392 = this.f4203;
                if (interfaceC09392 != null) {
                    j5 = j11;
                    j6 = j10;
                    interfaceC09392.mo3808(j7, j10, c2431, this.f15990);
                } else {
                    j5 = j11;
                    j6 = j10;
                }
                m3878(interfaceC4129, i, j6);
            } else {
                m3876(interfaceC4129, i);
                j5 = j11;
                j6 = j10;
            }
            m3867(j5);
            this.f4186 = j6;
        } else {
            if (j11 >= 30000) {
                return false;
            }
            if (j11 > 11000) {
                try {
                    Thread.sleep((j11 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            InterfaceC0939 interfaceC09393 = this.f4203;
            if (interfaceC09393 != null) {
                interfaceC09393.mo3808(j7, j10, c2431, this.f15990);
            }
            m3870(interfaceC4129, i);
            m3867(j11);
        }
        return true;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᐧʻ */
    public final void mo1140() {
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            C0969 c0969 = c0957.f4231.f4208;
            if (c0969.f4277 == 0) {
                c0969.f4277 = 1;
                return;
            }
            return;
        }
        C0969 c09692 = this.f4184;
        if (c09692.f4277 == 0) {
            c09692.f4277 = 1;
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final int mo3864(InterfaceC4115 interfaceC4115, C2431 c2431) {
        boolean z;
        int i = 0;
        if (!AbstractC2435.m6552(c2431.f9667)) {
            return ᐧʻ.ˑʽ(0, 0, 0, 0);
        }
        boolean z2 = c2431.f9685 != null;
        Context context = this.f4192;
        List listM3843 = m3843(context, interfaceC4115, c2431, z2, false);
        if (z2 && listM3843.isEmpty()) {
            listM3843 = m3843(context, interfaceC4115, c2431, false, false);
        }
        if (listM3843.isEmpty()) {
            return ᐧʻ.ˑʽ(1, 0, 0, 0);
        }
        int i2 = c2431.f9676;
        if (i2 != 0 && i2 != 2) {
            return ᐧʻ.ˑʽ(2, 0, 0, 0);
        }
        C4116 c4116 = (C4116) listM3843.get(0);
        boolean zM9439 = c4116.m9439(c2431);
        if (zM9439) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listM3843.size(); i3++) {
                C4116 c41162 = (C4116) listM3843.get(i3);
                if (c41162.m9439(c2431)) {
                    c4116 = c41162;
                    z = false;
                    zM9439 = true;
                    break;
                }
            }
            z = true;
        }
        int i4 = zM9439 ? 4 : 3;
        int i5 = c4116.m9435(c2431) ? 16 : 8;
        int i6 = c4116.f15904 ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (AbstractC4470.f17202 >= 26 && "video/dolby-vision".equals(c2431.f9667) && !AbstractC0944.m3810(context)) {
            i7 = 256;
        }
        if (zM9439) {
            List listM38432 = m3843(context, interfaceC4115, c2431, z2, true);
            if (!listM38432.isEmpty()) {
                Pattern pattern = AbstractC4130.f16009;
                ArrayList arrayList = new ArrayList(listM38432);
                Collections.sort(arrayList, new ᴵˋ(3, new C4125(i, c2431)));
                C4116 c41163 = (C4116) arrayList.get(0);
                if (c41163.m9439(c2431) && c41163.m9435(c2431)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final MediaCodecDecoderException mo3865(IllegalStateException illegalStateException, C4116 c4116) {
        Surface surface = this.f4193;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, c4116);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final void m3866(C2437 c2437) {
        if (c2437.equals(C2437.f9721) || c2437.equals(this.f4195)) {
            return;
        }
        this.f4195 = c2437;
        this.f4197.m8773(c2437);
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public final void mo1131() {
        C3761 c3761 = this.f4197;
        this.f4195 = null;
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            c0957.f4231.f4208.m3935(0);
        } else {
            this.f4184.m3935(0);
        }
        m3879();
        this.f4199 = false;
        this.f4198 = null;
        try {
            super.mo1131();
        } finally {
            c3761.m8768(this.f15991);
            c3761.m8773(C2437.f9721);
        }
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final void m3867(long j) {
        C5074 c5074 = this.f15991;
        c5074.f19239 += j;
        c5074.f19238++;
        this.f4178 += j;
        this.f4188++;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void mo3868(String str) {
        C3761 c3761 = this.f4197;
        Handler handler = (Handler) c3761.f14527;
        if (handler != null) {
            handler.post(new RunnableC0947(c3761, str, 5));
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void mo3869() {
        super.mo3869();
        this.f4204 = 0;
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final void m3870(InterfaceC4129 interfaceC4129, int i) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC4129.mo5345(i, true);
        Trace.endSection();
        this.f15991.f19236++;
        this.f4200 = 0;
        if (this.f4185 == null) {
            m3866(this.f4194);
            C0969 c0969 = this.f4184;
            boolean z = c0969.f4277 != 3;
            c0969.f4277 = 3;
            c0969.f4279.getClass();
            c0969.f4285 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f4193) == null) {
                return;
            }
            C3761 c3761 = this.f4197;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0941(c3761, surface, SystemClock.elapsedRealtime()));
            }
            this.f4199 = true;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᵎˏ */
    public final void mo1132() {
        this.f4201 = 0;
        this.f19490.getClass();
        this.f4189 = SystemClock.elapsedRealtime();
        this.f4178 = 0L;
        this.f4188 = 0;
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            c0957.f4231.f4208.m3938();
        } else {
            this.f4184.m3938();
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo3871() {
        C0957 c0957 = this.f4185;
        if (c0957 == null || !this.f4177) {
            return;
        }
        C0951 c0951 = c0957.f4231;
        if (c0951.f4211 == 2) {
            return;
        }
        C4469 c4469 = c0951.f4219;
        if (c4469 != null) {
            c4469.f17191.removeCallbacksAndMessages(null);
        }
        c0951.f4210 = null;
        c0951.f4211 = 2;
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final boolean m3872(C4116 c4116) {
        return AbstractC4470.f17202 >= 23 && !this.f4190 && !m3846(c4116.f15902) && (!c4116.f15903 || C0961.m3897(this.f4192));
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void mo3873(C3589 c3589) {
        if (this.f4191) {
            ByteBuffer byteBuffer = c3589.f13801;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC4129 interfaceC4129 = this.f15961;
                        interfaceC4129.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC4129.mo5343(bundle);
                    }
                }
            }
        }
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final void m3874(int i, int i2) {
        C5074 c5074 = this.f15991;
        c5074.f19240 += i;
        int i3 = i + i2;
        c5074.f19244 += i3;
        this.f4201 += i3;
        int i4 = this.f4200 + i3;
        this.f4200 = i4;
        c5074.f19246 = Math.max(i4, c5074.f19246);
        int i5 = this.f4205;
        if (i5 <= 0 || this.f4201 < i5) {
            return;
        }
        m3853();
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ArrayList mo3875(InterfaceC4115 interfaceC4115, C2431 c2431, boolean z) {
        List listM3843 = m3843(this.f4192, interfaceC4115, c2431, z, this.f4190);
        Pattern pattern = AbstractC4130.f16009;
        ArrayList arrayList = new ArrayList(listM3843);
        Collections.sort(arrayList, new ᴵˋ(3, new C4125(0, c2431)));
        return arrayList;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void m3876(InterfaceC4129 interfaceC4129, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC4129.mo5345(i, false);
        Trace.endSection();
        this.f15991.f19243++;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹳˎ */
    public final void mo1134() {
        m3853();
        int i = this.f4188;
        if (i != 0) {
            long j = this.f4178;
            C3761 c3761 = this.f4197;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0947(c3761, j, i));
            }
            this.f4178 = 0L;
            this.f4188 = 0;
        }
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            c0957.f4231.f4208.m3934();
        } else {
            this.f4184.m3934();
        }
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void mo3877(float f, float f2) throws ExoPlaybackException {
        super.mo3877(f, f2);
        C0957 c0957 = this.f4185;
        if (c0957 == null) {
            C0969 c0969 = this.f4184;
            if (f == c0969.f4280) {
                return;
            }
            c0969.f4280 = f;
            C0958 c0958 = c0969.f4276;
            c0958.f4255 = f;
            c0958.f4243 = 0L;
            c0958.f4248 = -1L;
            c0958.f4252 = -1L;
            c0958.m3894(false);
            return;
        }
        C0940 c0940 = c0957.f4231.f4214;
        c0940.getClass();
        AbstractC4464.m10142(f > 0.0f);
        C0969 c09692 = c0940.f4131;
        if (f == c09692.f4280) {
            return;
        }
        c09692.f4280 = f;
        C0958 c09582 = c09692.f4276;
        c09582.f4255 = f;
        c09582.f4243 = 0L;
        c09582.f4248 = -1L;
        c09582.f4252 = -1L;
        c09582.m3894(false);
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final void m3878(InterfaceC4129 interfaceC4129, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC4129.mo5350(i, j);
        Trace.endSection();
        this.f15991.f19236++;
        this.f4200 = 0;
        if (this.f4185 == null) {
            m3866(this.f4194);
            C0969 c0969 = this.f4184;
            boolean z = c0969.f4277 != 3;
            c0969.f4277 = 3;
            c0969.f4279.getClass();
            c0969.f4285 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f4193) == null) {
                return;
            }
            C3761 c3761 = this.f4197;
            Handler handler = (Handler) c3761.f14527;
            if (handler != null) {
                handler.post(new RunnableC0941(c3761, surface, SystemClock.elapsedRealtime()));
            }
            this.f4199 = true;
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ */
    public final String mo1137() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final void m3879() {
        int i;
        InterfaceC4129 interfaceC4129;
        if (!this.f4190 || (i = AbstractC4470.f17202) < 23 || (interfaceC4129 = this.f15961) == null) {
            return;
        }
        this.f4198 = new C0959(this, interfaceC4129);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC4129.mo5343(bundle);
        }
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ﾞˊ */
    public final void mo1138(long j, long j2) throws MediaCryptoException, ExoPlaybackException {
        super.mo1138(j, j2);
        C0957 c0957 = this.f4185;
        if (c0957 != null) {
            try {
                c0957.m3890(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw m11339(e, e.f1447, false, 7001);
            }
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final boolean mo3880(C4116 c4116) {
        return this.f4193 != null || m3872(c4116);
    }
}
