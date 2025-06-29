package p188;

import p137.C2106;
import p314.C3598;
import p314.C3602;
import p314.InterfaceC3597;

/* renamed from: ˎʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2610 implements InterfaceC3597 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C3602 f10386 = C3602.m8503(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C3602 f10387 = new C3602("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C3602.f13820);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2106 f10388;

    public C2610(C2106 c2106) {
        this.f10388 = c2106;
    }

    @Override // p314.InterfaceC3597
    /* renamed from: ˉי, reason: contains not printable characters */
    public final int mo6785(C3598 c3598) {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    @Override // p314.InterfaceC3593
    /* renamed from: ﹳﹳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo3722(java.lang.Object r9, java.io.File r10, p314.C3598 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            ـ.ﾞʽ r9 = (p261.InterfaceC3251) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            ᐧᵢ.ᐧʻ r1 = p188.C2610.f10387
            java.lang.Object r2 = r11.m8502(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = p329.AbstractC3737.f14494
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            ᐧᵢ.ᐧʻ r5 = p188.C2610.f10386
            java.lang.Object r5 = r11.m8502(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            ˉˈ.ٴˎ r10 = r8.f10388
            if (r10 == 0) goto L51
            com.bumptech.glide.load.data.ˑʽ r6 = new com.bumptech.glide.load.data.ˑʽ     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            goto L52
        L48:
            r6 = r7
            goto Lba
        L4b:
            r6 = r7
            goto L63
        L4d:
            r9 = move-exception
            goto L48
        L4f:
            r10 = move-exception
            goto L4b
        L51:
            r6 = r7
        L52:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            goto L5e
        L5c:
            r9 = move-exception
            goto Lc0
        L5e:
            r10 = 1
            goto L73
        L60:
            r9 = move-exception
            goto Lba
        L62:
            r10 = move-exception
        L63:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6d
            java.lang.String r5 = "Failed to encode Bitmap"
        L6d:
            if (r6 == 0) goto L72
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L72
        L72:
            r10 = 0
        L73:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lb9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = p329.AbstractC3742.m8712(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = p329.AbstractC3737.m8704(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.m8502(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
        Lb9:
            return r10
        Lba:
            if (r6 == 0) goto Lc1
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> Lc1
            goto Lc1
        Lc0:
            throw r9
        Lc1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p188.C2610.mo3722(java.lang.Object, java.io.File, ᐧᵢ.ˏᵢ):boolean");
    }
}
