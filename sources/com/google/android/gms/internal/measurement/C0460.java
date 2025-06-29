package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p200.C2741;
import p200.C2758;

/* renamed from: com.google.android.gms.internal.measurement.ـᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0460 implements InterfaceC0387 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final C2741 f2773 = new C2741(0);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final String[] f2774 = {"key", "value"};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Uri f2775;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f2776;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Runnable f2777;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0448 f2778;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ContentResolver f2779;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile Map f2780;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ArrayList f2781;

    public C0460(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C0448 c0448 = new C0448(1, this);
        this.f2778 = c0448;
        this.f2776 = new Object();
        this.f2781 = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f2779 = contentResolver;
        this.f2775 = uri;
        this.f2777 = runnable;
        contentResolver.registerContentObserver(uri, false, c0448);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static synchronized void m2239() {
        try {
            Iterator it = ((C2758) f2773.values()).iterator();
            while (it.hasNext()) {
                C0460 c0460 = (C0460) it.next();
                c0460.f2779.unregisterContentObserver(c0460.f2778);
            }
            f2773.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0460 m2240(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C0460 c0460;
        synchronized (C0460.class) {
            C2741 c2741 = f2773;
            c0460 = (C0460) c2741.get(uri);
            if (c0460 == null) {
                try {
                    C0460 c04602 = new C0460(contentResolver, uri, runnable);
                    try {
                        c2741.put(uri, c04602);
                    } catch (SecurityException unused) {
                    }
                    c0460 = c04602;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c0460;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map m2241() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f2780
            if (r0 != 0) goto L53
            java.lang.Object r1 = r5.f2776
            monitor-enter(r1)
            java.util.Map r0 = r5.f2780     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L4f
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.measurement.ˆᵎ r2 = new com.google.android.gms.internal.measurement.ˆᵎ     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.f2536 = r5     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.m1976()     // Catch: java.lang.SecurityException -> L1b java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L26
        L1b:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.m1976()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L49
            goto L45
        L2c:
            r2 = move-exception
            goto L4b
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L2c
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L49
        L45:
            r5.f2780 = r2     // Catch: java.lang.Throwable -> L49
            r0 = r2
            goto L4f
        L49:
            r0 = move-exception
            goto L51
        L4b:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L49
            throw r2     // Catch: java.lang.Throwable -> L49
        L4f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            goto L53
        L51:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r0
        L53:
            if (r0 == 0) goto L56
            return r0
        L56:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0460.m2241():java.util.Map");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0387
    /* renamed from: ٴˎ */
    public final /* synthetic */ Object mo2109(String str) {
        return (String) m2241().get(str);
    }
}
