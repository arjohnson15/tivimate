package p052;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p061.C1424;
import p200.C2755;

/* renamed from: ʾʼ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1323 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ThreadPoolExecutor f5381;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object f5382;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1424 f5383 = new C1424(16);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C2755 f5384;

    static {
        ThreadFactoryC1320 threadFactoryC1320 = new ThreadFactoryC1320();
        threadFactoryC1320.f5377 = "fonts-androidx";
        threadFactoryC1320.f5376 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC1320);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5381 = threadPoolExecutor;
        f5382 = new Object();
        f5384 = new C2755(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c6, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r8 = move-exception;
     */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p052.C1327 m4620(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = ˈⁱ.ˉⁱ.ˎˑ(r1)
            android.os.Trace.beginSection(r1)
            ʾـ.ᵢˆ r1 = p052.AbstractC1323.f5383
            java.lang.Object r2 = r1.m4941(r8)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L20
            ʾʼ.ᐧʻ r8 = new ʾʼ.ᐧʻ     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        L1d:
            r8 = move-exception
            goto Lc3
        L20:
            ʾʼ.ﹶˆ r10 = p052.AbstractC1324.m4624(r9, r10)     // Catch: java.lang.Throwable -> L1d android.content.pm.PackageManager.NameNotFoundException -> Lb9
            int r2 = r10.f5397     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            java.util.List r10 = r10.f5396
            r4 = -3
            if (r2 == 0) goto L32
            if (r2 == r0) goto L30
        L2e:
            r2 = -3
            goto L52
        L30:
            r2 = -2
            goto L52
        L32:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            ʾʼ.ˉי[] r2 = (p052.C1319[]) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L51
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L3e
            goto L51
        L3e:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1d
            r6 = 0
        L40:
            if (r6 >= r5) goto L4f
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L1d
            int r7 = r7.f5372     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L4d
            if (r7 >= 0) goto L4b
            goto L2e
        L4b:
            r2 = r7
            goto L52
        L4d:
            int r6 = r6 + r0
            goto L40
        L4f:
            r2 = 0
            goto L52
        L51:
            r2 = 1
        L52:
            if (r2 == 0) goto L5d
            ʾʼ.ᐧʻ r8 = new ʾʼ.ᐧʻ     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        L5d:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L1d
            if (r2 <= r0) goto L83
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r2 = 29
            if (r0 < r2) goto L83
            ʼˉ.ٴˎ r0 = p421.AbstractC4863.f18370     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r0 = ˈⁱ.ˉⁱ.ˎˑ(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            ʼˉ.ٴˎ r0 = p421.AbstractC4863.f18370     // Catch: java.lang.Throwable -> L7e
            android.graphics.Typeface r9 = r0.ᐧʻ(r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            goto L9d
        L7e:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        L83:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            ʾʼ.ˉי[] r10 = (p052.C1319[]) r10     // Catch: java.lang.Throwable -> L1d
            ʼˉ.ٴˎ r0 = p421.AbstractC4863.f18370     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r0 = ˈⁱ.ˉⁱ.ˎˑ(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            ʼˉ.ٴˎ r0 = p421.AbstractC4863.f18370     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r9 = r0.ٴˎ(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
        L9d:
            if (r9 == 0) goto Lab
            r1.m4933(r8, r9)     // Catch: java.lang.Throwable -> L1d
            ʾʼ.ᐧʻ r8 = new ʾʼ.ᐧʻ     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lab:
            ʾʼ.ᐧʻ r8 = new ʾʼ.ᐧʻ     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lb4:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        Lb9:
            ʾʼ.ᐧʻ r8 = new ʾʼ.ᐧʻ     // Catch: java.lang.Throwable -> L1d
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lc3:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p052.AbstractC1323.m4620(java.lang.String, android.content.Context, java.util.List, int):ʾʼ.ᐧʻ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m4621(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C1328) list.get(i2)).f5392);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
