package p188;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p046.C1304;
import p137.InterfaceC2105;
import p261.InterfaceC3251;
import p314.C3598;
import p314.C3602;
import p314.InterfaceC3595;
import ˆʽ.ᵎˏ;
import ˈˉ.ﹳﹳ;

/* renamed from: ˎʾ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2619 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC2105 f10404;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ﹳﹳ f10405 = f10401;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2630 f10406;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3602 f10403 = new C3602("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2637());

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C3602 f10400 = new C3602("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1304());

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final ﹳﹳ f10401 = new ﹳﹳ(25);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final List f10402 = DesugarCollections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public C2619(InterfaceC2105 interfaceC2105, InterfaceC2630 interfaceC2630) {
        this.f10404 = interfaceC2105;
        this.f10406 = interfaceC2630;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final boolean mo4999(Object obj, C3598 c3598) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0189  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m6794(java.lang.Object r15, android.media.MediaMetadataRetriever r16, long r17, int r19, int r20, int r21, p188.C2616 r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p188.C2619.m6794(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, ˎʾ.ˉⁱ):android.graphics.Bitmap");
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) throws IOException {
        long jLongValue = ((Long) c3598.m8502(f10403)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) c3598.m8502(f10400);
        if (num == null) {
            num = 2;
        }
        C2616 c2616 = (C2616) c3598.m8502(C2616.f10397);
        if (c2616 == null) {
            c2616 = C2616.f10396;
        }
        C2616 c26162 = c2616;
        this.f10405.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f10406.m6809(mediaMetadataRetriever, obj);
            return C2624.m6805(m6794(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, c26162), this.f10404);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }
}
