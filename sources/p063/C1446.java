package p063;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0283;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import p137.C2106;
import p137.InterfaceC2105;
import p156.C2334;
import p156.C2335;
import p156.C2337;
import p261.InterfaceC3251;
import p314.C3598;
import p314.EnumC3600;
import p314.InterfaceC3595;
import p329.AbstractC3737;
import p331.C3758;
import ˈˉ.ﹳﹳ;
import ᵎﹳ.ᐧʻ;
import ⁱـ.ˑי;

/* renamed from: ʾᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1446 implements InterfaceC3595 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final ﹳﹳ f5916 = new ﹳﹳ(10);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1454 f5917 = new C1454(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f5918;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3758 f5919;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1454 f5920;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f5921;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ﹳﹳ f5922;

    public C1446(Context context, ArrayList arrayList, InterfaceC2105 interfaceC2105, C2106 c2106) {
        ﹳﹳ r0 = f5916;
        this.f5921 = context.getApplicationContext();
        this.f5918 = arrayList;
        this.f5922 = r0;
        this.f5919 = new C3758(interfaceC2105, 5, c2106);
        this.f5920 = f5917;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m4998(C2334 c2334, int i, int i2) {
        int iMin = Math.min(c2334.f9259 / i2, c2334.f9258 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sb = ᐧʻ.ᵎـ("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(c2334.f9258);
            sb.append("x");
            sb.append(c2334.f9259);
            sb.append("]");
            sb.toString();
        }
        return iMax;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo4999(Object obj, C3598 c3598) {
        return !((Boolean) c3598.m8502(AbstractC1449.f5941)).booleanValue() && ˑי.ᴵʿ(this.f5918, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1447 m5000(ByteBuffer byteBuffer, int i, int i2, C2335 c2335, C3598 c3598) throws Throwable {
        Bitmap.Config config;
        int i3 = AbstractC3737.f14494;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i4 = 2;
        try {
            C2334 c2334M6416 = c2335.m6416();
            if (c2334M6416.f9256 > 0 && c2334M6416.f9251 == 0) {
                if (c3598.m8502(AbstractC1449.f5942) == EnumC3600.f13816) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                        if (Log.isLoggable("BufferGifDecoder", i4)) {
                            String str = "Decoded GIF from stream in " + AbstractC3737.m8704(jElapsedRealtimeNanos);
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int iM4998 = m4998(c2334M6416, i, i2);
                ﹳﹳ r11 = this.f5922;
                C3758 c3758 = this.f5919;
                r11.getClass();
                C2337 c2337 = new C2337(c3758, c2334M6416, byteBuffer, iM4998);
                c2337.m6423(config);
                c2337.f9283 = (c2337.f9283 + 1) % c2337.f9280.f9256;
                Bitmap bitmapM6422 = c2337.m6422();
                if (bitmapM6422 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        String str2 = "Decoded GIF from stream in " + AbstractC3737.m8704(jElapsedRealtimeNanos);
                    }
                    return null;
                }
                C1447 c1447 = new C1447(new C1457(new C1453(0, new C1448(ComponentCallbacks2C0283.m1550(this.f5921), c2337, i, i2, bitmapM6422))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    String str3 = "Decoded GIF from stream in " + AbstractC3737.m8704(jElapsedRealtimeNanos);
                }
                return c1447;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                String str4 = "Decoded GIF from stream in " + AbstractC3737.m8704(jElapsedRealtimeNanos);
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i4 = 2;
        }
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        C2335 c2335;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C1454 c1454 = this.f5920;
        synchronized (c1454) {
            try {
                C2335 c23352 = (C2335) c1454.f5950.poll();
                if (c23352 == null) {
                    c23352 = new C2335();
                }
                c2335 = c23352;
                c2335.f9262 = null;
                Arrays.fill(c2335.f9264, (byte) 0);
                c2335.f9263 = new C2334();
                c2335.f9265 = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c2335.f9262 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c2335.f9262.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m5000(byteBuffer, i, i2, c2335, c3598);
        } finally {
            this.f5920.m5009(c2335);
        }
    }
}
