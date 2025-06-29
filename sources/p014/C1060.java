package p014;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.support.v4.media.session.AbstractC0002;
import android.view.View;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import p046.C1303;
import p141.C2197;
import p141.C2210;
import p166.AbstractC2435;
import p204.InterfaceC2783;
import p254.C3159;
import p261.InterfaceC3251;
import p266.C3264;
import p305.C3524;
import p312.C3589;
import p314.C3598;
import p331.C3759;
import p362.C4123;
import p362.InterfaceC4110;
import p362.InterfaceC4118;
import p362.InterfaceC4129;
import p374.C4296;
import p374.InterfaceC4254;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p417.AbstractC4753;
import p445.InterfaceC5156;
import p456.C5349;

/* renamed from: ʻـ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1060 implements InterfaceC4254, InterfaceC4118, InterfaceC4110, InterfaceC2783, InterfaceC5156 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f4468;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f4469;

    public C1060(int i) {
        switch (i) {
            case 9:
                this.f4468 = new long[32];
                break;
            case 10:
            default:
                this.f4468 = new C4457(8);
                break;
            case 11:
                this.f4468 = Bitmap.CompressFormat.JPEG;
                this.f4469 = 100;
                break;
        }
    }

    public /* synthetic */ C1060(int i, Object obj) {
        this.f4468 = obj;
        this.f4469 = i;
    }

    public C1060(C3524 c3524, int i) {
        AbstractC4753.m10683(c3524);
        this.f4468 = c3524;
        this.f4469 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4053(long j) {
        int i = this.f4469;
        long[] jArr = (long[]) this.f4468;
        if (i == jArr.length) {
            this.f4468 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f4468;
        int i2 = this.f4469;
        this.f4469 = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int mo4054(C5349 c5349, C3589 c3589, int i) {
        C2210 c2210 = (C2210) this.f4468;
        if (c2210.f8750) {
            return -3;
        }
        C2197 c2197 = (C2197) c2210.f8737.get(this.f4469);
        return c2197.f8645.m9773(c5349, c3589, i, c2197.f8648);
    }

    @Override // p362.InterfaceC4118
    /* renamed from: ˉי, reason: contains not printable characters */
    public InterfaceC4129 mo4055(C4123 c4123) {
        int i;
        Context context;
        int i2 = AbstractC4470.f17202;
        if (i2 < 23 || ((i = this.f4469) != 1 && (i != 0 || (i2 < 31 && ((context = (Context) this.f4468) == null || i2 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))))) {
            return new C3264(4).mo4055(c4123);
        }
        int iM6554 = AbstractC2435.m6554(c4123.f15925.f9667);
        AbstractC4464.m10131("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC4470.m10176(iM6554));
        return new C3759(iM6554).mo4055(c4123);
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public boolean mo4056(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean mo4057(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean mo4058() {
        C2210 c2210 = (C2210) this.f4468;
        if (!c2210.f8750) {
            C2197 c2197 = (C2197) c2210.f8737.get(this.f4469);
            if (c2197.f8645.m9782(c2197.f8648)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long m4059(C3159 c3159) {
        C4457 c4457 = (C4457) this.f4468;
        int i = 0;
        c3159.mo4875(c4457.f17171, 0, 1, false);
        int i2 = c4457.f17171[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c3159.mo4875(c4457.f17171, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c4457.f17171[i] & 255) + (i5 << 8);
        }
        this.f4469 = i4 + 1 + this.f4469;
        return i5;
    }

    @Override // p204.InterfaceC2783
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean mo4060(View view) {
        ((BottomSheetBehavior) this.f4468).m2821(this.f4469);
        return true;
    }

    @Override // p362.InterfaceC4110
    /* renamed from: יʻ, reason: contains not printable characters */
    public boolean mo4061() {
        return true;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo4062() throws RtspMediaSource$RtspPlaybackException {
        RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException = ((C2210) this.f4468).f8735;
        if (rtspMediaSource$RtspPlaybackException != null) {
            throw rtspMediaSource$RtspPlaybackException;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long m4063(int i) {
        if (i >= 0 && i < this.f4469) {
            return ((long[]) this.f4468)[i];
        }
        StringBuilder sbM40 = AbstractC0002.m40(i, "Invalid index ", ", size is ");
        sbM40.append(this.f4469);
        throw new IndexOutOfBoundsException(sbM40.toString());
    }

    @Override // p445.InterfaceC5156
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC3251 mo4064(InterfaceC3251 interfaceC3251, C3598 c3598) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC3251.get()).compress((Bitmap.CompressFormat) this.f4468, this.f4469, byteArrayOutputStream);
        interfaceC3251.mo4602();
        return new C1303(byteArrayOutputStream.toByteArray());
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int mo4065() {
        if (((MediaCodecInfo[]) this.f4468) == null) {
            this.f4468 = new MediaCodecList(this.f4469).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4468).length;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int mo4066(long j) {
        C2210 c2210 = (C2210) this.f4468;
        if (c2210.f8750) {
            return -3;
        }
        C2197 c2197 = (C2197) c2210.f8737.get(this.f4469);
        C4296 c4296 = c2197.f8645;
        int iM9777 = c4296.m9777(c2197.f8648, j);
        c4296.m9779(iM9777);
        return iM9777;
    }

    @Override // p362.InterfaceC4110
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public MediaCodecInfo mo4067(int i) {
        if (((MediaCodecInfo[]) this.f4468) == null) {
            this.f4468 = new MediaCodecList(this.f4469).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4468)[i];
    }
}
