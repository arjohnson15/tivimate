package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.ﹳـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0553 implements InterfaceC0509, InterfaceC0318 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0553 f2903 = new C0553(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f2904;

    public /* synthetic */ C0553(int i) {
        this.f2904 = i;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static HashMap m2472(ContentResolver contentResolver, String[] strArr, C0553 c0553) throws zzhx {
        Uri uri = AbstractC0573.f2934;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new zzhx("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhx("ContentProvider query returned null cursor");
                    }
                    HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                    while (cursorQuery.moveToNext()) {
                        map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new zzhx("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    return map;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                throw new zzhx("ContentProvider query failed", e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m2473(C0405 c0405) {
        return c0405.m2140();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C0405 m2474(AbstractC0583 abstractC0583) {
        return abstractC0583.zzb;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m2475(Object obj) {
        C0405 c0405 = ((AbstractC0583) obj).zzb;
        if (c0405.f2690) {
            c0405.f2690 = false;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m2476(ContentResolver contentResolver, String str) {
        Uri uri = AbstractC0573.f2936;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new zzhx("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhx("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        cursorQuery.close();
                        return string;
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                throw new zzhx("ContentProvider query failed", e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0509
    /* renamed from: ʽᐧ */
    public C0371 mo1967(Class cls) {
        switch (this.f2904) {
            case 0:
                if (!AbstractC0583.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0371) AbstractC0583.m2536(cls.asSubclass(AbstractC0583.class)).mo1622(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0509
    /* renamed from: ـﹶ */
    public boolean mo1978(Class cls) {
        switch (this.f2904) {
            case 0:
                return AbstractC0583.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
