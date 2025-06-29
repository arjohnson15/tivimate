package p188;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import p137.C2106;
import p137.InterfaceC2105;
import p314.C3598;
import p314.C3602;
import p314.EnumC3600;
import p314.EnumC3604;
import p329.AbstractC3740;
import p329.AbstractC3742;
import ᵔʼ.ˑʽ;

/* renamed from: ˎʾ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2631 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final Set f10422;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final ArrayDeque f10423;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final ˑʽ f10424;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C3602 f10425;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C3602 f10426 = C3602.m8503(EnumC3600.f13817, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3602 f10427 = new C3602("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C3602.f13820);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C3602 f10428;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final DisplayMetrics f10429;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2634 f10430 = C2634.m6817();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2106 f10431;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2105 f10432;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList f10433;

    static {
        C2616 c2616 = C2616.f10392;
        Boolean bool = Boolean.FALSE;
        f10425 = C3602.m8503(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f10428 = C3602.m8503(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f10422 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f10424 = new ˑʽ();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC3742.f14503;
        f10423 = new ArrayDeque(0);
    }

    public C2631(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC2105 interfaceC2105, C2106 c2106) {
        this.f10433 = arrayList;
        AbstractC3740.m8706(displayMetrics, "Argument must not be null");
        this.f10429 = displayMetrics;
        AbstractC3740.m8706(interfaceC2105, "Argument must not be null");
        this.f10432 = interfaceC2105;
        AbstractC3740.m8706(c2106, "Argument must not be null");
        this.f10431 = c2106;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m6811(BitmapFactory.Options options) {
        m6813(options);
        ArrayDeque arrayDeque = f10423;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r5;
     */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m6812(p188.InterfaceC2612 r9, android.graphics.BitmapFactory.Options r10, p188.InterfaceC2618 r11, p137.InterfaceC2105 r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.mo6792()
            r9.mo6787()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = p188.AbstractC2626.f10414
            r4.lock()
            android.graphics.Bitmap r9 = r9.mo6789(r10)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r9
        L1f:
            r9 = move-exception
            goto L66
        L21:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = ᵎﹳ.ᐧʻ.ᵎـ(r6, r1, r7, r2, r8)     // Catch: java.lang.Throwable -> L1f
            r1.append(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = m6814(r2)     // Catch: java.lang.Throwable -> L1f
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1f
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L50
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
        L50:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L65
            r12.mo5961(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L64
            r0 = 0
            r10.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L64
            android.graphics.Bitmap r9 = m6812(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L64
            java.util.concurrent.locks.Lock r10 = p188.AbstractC2626.f10414
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L1f
        L65:
            throw r5     // Catch: java.lang.Throwable -> L1f
        L66:
            java.util.concurrent.locks.Lock r10 = p188.AbstractC2626.f10414
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p188.C2631.m6812(ˎʾ.ʿˏ, android.graphics.BitmapFactory$Options, ˎʾ.ˋⁱ, ˉˈ.ـﹶ):android.graphics.Bitmap");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m6813(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m6814(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0589 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fd  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m6815(p188.InterfaceC2612 r41, android.graphics.BitmapFactory.Options r42, p188.C2616 r43, p314.EnumC3600 r44, p314.EnumC3604 r45, boolean r46, int r47, int r48, boolean r49, p188.InterfaceC2618 r50) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p188.C2631.m6815(ˎʾ.ʿˏ, android.graphics.BitmapFactory$Options, ˎʾ.ˉⁱ, ᐧᵢ.ـﹶ, ᐧᵢ.ﹶˆ, boolean, int, int, boolean, ˎʾ.ˋⁱ):android.graphics.Bitmap");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2624 m6816(InterfaceC2612 interfaceC2612, int i, int i2, C3598 c3598, InterfaceC2618 interfaceC2618) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f10431.m5971(65536, byte[].class);
        synchronized (C2631.class) {
            ArrayDeque arrayDeque = f10423;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m6813(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC3600 enumC3600 = (EnumC3600) c3598.m8502(f10426);
        EnumC3604 enumC3604 = (EnumC3604) c3598.m8502(f10427);
        C2616 c2616 = (C2616) c3598.m8502(C2616.f10397);
        boolean zBooleanValue = ((Boolean) c3598.m8502(f10425)).booleanValue();
        C3602 c3602 = f10428;
        try {
            return C2624.m6805(m6815(interfaceC2612, options2, c2616, enumC3600, enumC3604, c3598.m8502(c3602) != null && ((Boolean) c3598.m8502(c3602)).booleanValue(), i, i2, zBooleanValue, interfaceC2618), this.f10432);
        } finally {
            m6811(options2);
            this.f10431.m5966(bArr);
        }
    }
}
