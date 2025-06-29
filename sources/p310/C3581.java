package p310;

import android.graphics.Bitmap;
import androidx.leanback.widget.ʿˏ;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.bumptech.glide.ˑʽ;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p000.C0865;
import p000.C0873;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p031.C1199;
import p031.InterfaceC1197;
import p151.C2316;
import p353.InterfaceC4019;
import p357.InterfaceC4072;
import p362.AbstractC4130;
import p362.C4116;
import p362.InterfaceC4113;
import p362.InterfaceC4115;
import p373.C4238;
import p374.C4284;
import p380.InterfaceC4434;
import p381.EnumC4441;
import p383.AbstractC4470;
import p383.InterfaceC4462;
import p385.C4480;
import p385.InterfaceC4481;

/* renamed from: ᐧˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C3581 implements InterfaceC3579, InterfaceC4019, InterfaceC4072, InterfaceC4115, InterfaceC4113, InterfaceC0864, InterfaceC4462, InterfaceC4434, InterfaceC1197, InterfaceC4481 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13771;

    public /* synthetic */ C3581(int i) {
        this.f13771 = i;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static Bitmap m8482(int i, byte[] bArr) throws ImageDecoderException {
        try {
            return ˑʽ.ᐧʻ(i, bArr);
        } catch (ParserException e) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new ImageDecoderException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence] */
    @Override // p353.InterfaceC4019
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p310.C3581.apply(java.lang.Object):java.lang.Object");
    }

    @Override // p385.InterfaceC4481
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo8483() {
    }

    @Override // p362.InterfaceC4115
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public List mo8484(String str, boolean z, boolean z2) {
        return AbstractC4130.m9468(str, z, z2);
    }

    @Override // p000.InterfaceC0864
    /* renamed from: ˏᵢ */
    public InterfaceC0875 mo900() {
        switch (this.f13771) {
            case 13:
                return new C0873(false);
            case 14:
                return new C4238(true);
            case 15:
                return new C0865();
            default:
                return new C2316();
        }
    }

    @Override // p383.InterfaceC4462
    /* renamed from: ˑʽ */
    public void mo4264(Object obj) {
        switch (this.f13771) {
            case 19:
                ((C4284) obj).f16631.mo8483();
                break;
            default:
                ((C4480) obj).m10228();
                break;
        }
    }

    @Override // p380.InterfaceC4434
    /* renamed from: ـﹶ */
    public boolean mo4335(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    @Override // p310.InterfaceC3579
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4336(android.util.JsonReader r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p310.C3581.mo4336(android.util.JsonReader):java.lang.Object");
    }

    @Override // p362.InterfaceC4113
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int mo8485(Object obj) {
        C4116 c4116 = (C4116) obj;
        switch (this.f13771) {
            case 10:
                String str = c4116.f15902;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (AbstractC4470.f17202 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return c4116.f15902.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ */
    public Object mo4098(ʿˏ r1) {
        switch (this.f13771) {
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3653.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3652.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3651.get();
            default:
                C1199 c1199 = ExecutorsRegistrar.f3653;
                return EnumC4441.f17120;
        }
    }
}
