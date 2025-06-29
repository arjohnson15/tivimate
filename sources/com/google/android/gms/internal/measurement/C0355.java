package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p200.C2741;

/* renamed from: com.google.android.gms.internal.measurement.ˆᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0355 implements InterfaceC0509 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0553 f2535 = new C0553(8);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f2536;

    @Override // com.google.android.gms.internal.measurement.InterfaceC0509
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C0371 mo1967(Class cls) {
        for (InterfaceC0509 interfaceC0509 : (InterfaceC0509[]) this.f2536) {
            if (interfaceC0509.mo1978(cls)) {
                return interfaceC0509.mo1967(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m1968(int i, float f) throws zzkl$zzb {
        C0346 c0346 = (C0346) this.f2536;
        c0346.getClass();
        c0346.m1942(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m1969(int i, boolean z) throws zzkl$zzb {
        C0346 c0346 = (C0346) this.f2536;
        c0346.m1939(i, 0);
        c0346.m1943(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m1970(int i, long j) {
        ((C0346) this.f2536).m1940(i, j);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m1971(int i, Object obj, InterfaceC0494 interfaceC0494) throws zzkl$zzb {
        AbstractC0563 abstractC0563 = (AbstractC0563) obj;
        C0346 c0346 = (C0346) this.f2536;
        c0346.m1939(i, 2);
        c0346.m1935(abstractC0563.mo2513(interfaceC0494));
        interfaceC0494.mo1842(abstractC0563, c0346.f2471);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public void m1972(int i, int i2) throws zzkl$zzb {
        ((C0346) this.f2536).m1931(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m1973(int i, int i2) {
        ((C0346) this.f2536).m1942(i, i2);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m1974(int i, long j) throws zzkl$zzb {
        ((C0346) this.f2536).m1944(i, j);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m1975(int i, C0315 c0315) {
        C0346 c0346 = (C0346) this.f2536;
        c0346.m1939(i, 2);
        c0346.m1936(c0315);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object m1976() {
        Map mapEmptyMap;
        C0460 c0460 = (C0460) this.f2536;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = c0460.f2779.acquireUnstableContentProviderClient(c0460.f2775);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.emptyMap();
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(c0460.f2775, C0460.f2774, null, null, null);
            try {
                if (cursorQuery == null) {
                    mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } else {
                        Map c2741 = count <= 256 ? new C2741(count) : new HashMap(count, 1.0f);
                        while (cursorQuery.moveToNext()) {
                            c2741.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (cursorQuery.isAfterLast()) {
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return c2741;
                        }
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                }
                return mapEmptyMap;
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
            return Collections.emptyMap();
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m1977(int i, int i2) throws zzkl$zzb {
        ((C0346) this.f2536).m1942(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0509
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean mo1978(Class cls) {
        for (InterfaceC0509 interfaceC0509 : (InterfaceC0509[]) this.f2536) {
            if (interfaceC0509.mo1978(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m1979(int i, int i2) throws zzkl$zzb {
        ((C0346) this.f2536).m1937(i, i2);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m1980(int i, long j) {
        ((C0346) this.f2536).m1944(i, j);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m1981(int i, int i2) throws zzkl$zzb {
        ((C0346) this.f2536).m1937(i, i2);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void m1982(int i, long j) throws zzkl$zzb {
        ((C0346) this.f2536).m1940(i, j);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m1983(int i, long j) throws zzkl$zzb {
        ((C0346) this.f2536).m1940(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public void m1984(int i, int i2) throws zzkl$zzb {
        ((C0346) this.f2536).m1931(i, i2);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m1985(int i, double d) throws zzkl$zzb {
        C0346 c0346 = (C0346) this.f2536;
        c0346.getClass();
        c0346.m1944(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m1986(int i, Object obj, InterfaceC0494 interfaceC0494) {
        C0346 c0346 = (C0346) this.f2536;
        c0346.m1939(i, 3);
        interfaceC0494.mo1842((AbstractC0563) obj, c0346.f2471);
        c0346.m1939(i, 4);
    }
}
