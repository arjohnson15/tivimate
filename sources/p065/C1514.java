package p065;

import android.support.v4.media.session.AbstractC0002;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p013.AbstractC1035;
import p013.AbstractC1041;
import p013.C1034;
import p013.C1047;
import p013.C1053;
import p034.C1231;
import p034.InterfaceC1225;
import p034.InterfaceC1229;
import p049.C1310;
import p057.C1344;
import p057.C1345;
import p061.AbstractC1420;
import p080.AbstractC1702;
import p140.C2172;
import p140.InterfaceC2162;
import p262.InterfaceC3253;
import p262.InterfaceC3254;
import p262.InterfaceC3255;
import p270.AbstractC3293;
import p278.AbstractC3362;
import p288.AbstractC3404;
import p288.C3397;
import p288.C3403;
import p288.C3405;
import p317.AbstractC3629;
import p331.C3761;
import p396.C4554;
import p427.C4911;
import p427.C4914;
import ʽ.ᵎـ;
import ﹶⁱ.ـﹶ;

/* renamed from: ʾᵔ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1514 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f6164;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f6165;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f6166;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f6167;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6168;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f6169;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f6170;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f6171;

    public C1514(C1509 c1509, C1047 c1047) {
        this.f6168 = 0;
        this.f6171 = c1509;
        this.f6165 = new C1527(-1, "", "");
        Collection collection = C1053.f4449;
        Collection collection2 = c1509.f6128;
        this.f6169 = collection2 == null ? collection : collection2;
        this.f6170 = new C4911(new C4554(((AbstractC1484) c1047.f4447).mo1379(new C1509(c1509.f6139, c1509.f6127, c1509.f6137, c1509.f6146, AbstractC1041.m4021(collection2 != null ? collection2 : collection, new C1485(0, new C1047(2, this))), c1509.f6140, c1509.f6141, c1509.f6136, c1509.f6147, c1509.f6130, c1509.f6134, c1509.f6131, c1509.f6132, c1509.f6142, c1509.f6135, c1509.f6138, c1509.f6144, c1509.f6133, c1509.f6143, c1509.f6145, c1509.f6129))));
        boolean z = c1509.f6141 == 3;
        InterfaceC1229 interfaceC1229M5093 = m5093();
        if (interfaceC1229M5093 != null) {
            interfaceC1229M5093.setWriteAheadLoggingEnabled(z);
        }
    }

    public C1514(C1509 c1509, AbstractC1420 abstractC1420) {
        int i;
        C2172 c2172;
        this.f6168 = 0;
        this.f6171 = c1509;
        this.f6165 = abstractC1420;
        Object obj = c1509.f6128;
        this.f6169 = obj == null ? C1053.f4449 : obj;
        int i2 = c1509.f6141;
        InterfaceC3253 interfaceC3253 = c1509.f6145;
        if (interfaceC3253 == null) {
            InterfaceC1225 interfaceC1225 = c1509.f6137;
            if (interfaceC1225 == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.f6170 = new C4911(new C4554(interfaceC1225.mo4395(new C1231(c1509.f6139, c1509.f6127, new ᵎـ(this, abstractC1420.f5787), false, false))));
        } else {
            String str = c1509.f6127;
            if (str == null) {
                c2172 = new C2172(new C3761(5, this, interfaceC3253, false));
            } else {
                C3761 c3761 = new C3761(5, this, interfaceC3253, false);
                int iM5411 = AbstractC1702.m5411(i2);
                if (iM5411 == 1) {
                    i = 1;
                } else {
                    if (iM5411 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + AbstractC0002.m39(i2) + '\'').toString());
                    }
                    i = 4;
                }
                int iM54112 = AbstractC1702.m5411(i2);
                if (iM54112 != 1 && iM54112 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + AbstractC0002.m39(i2) + '\'').toString());
                }
                c2172 = new C2172(c3761, str, i);
            }
            this.f6170 = c2172;
        }
        boolean z = i2 == 3;
        InterfaceC1229 interfaceC1229M5093 = m5093();
        if (interfaceC1229M5093 != null) {
            interfaceC1229M5093.setWriteAheadLoggingEnabled(z);
        }
    }

    public C1514(boolean z, boolean z2, Long l, Long l2, Long l3, Long l4) {
        this.f6168 = 1;
        C1034 c1034 = C1034.f4436;
        this.f6164 = z;
        this.f6167 = z2;
        this.f6171 = l;
        this.f6165 = l2;
        this.f6169 = l3;
        this.f6170 = l4;
        this.f6166 = AbstractC1035.m3986(c1034);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m5092(C1514 c1514, InterfaceC3255 interfaceC3255) throws Throwable {
        Object c3403;
        if (((C1509) c1514.f6171).f6141 == 3) {
            ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA journal_mode = WAL");
        } else {
            ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA journal_mode = TRUNCATE");
        }
        if (((C1509) c1514.f6171).f6141 == 3) {
            ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA synchronous = NORMAL");
        } else {
            ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA synchronous = FULL");
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA user_version");
        try {
            interfaceC3254Mo6108.mo6098();
            int iMo6095 = (int) interfaceC3254Mo6108.mo6095(0);
            interfaceC3254Mo6108.close();
            AbstractC1420 abstractC1420 = (AbstractC1420) c1514.f6165;
            if (iMo6095 != abstractC1420.f5787) {
                ـﹶ.ﹳˎ(interfaceC3255, "BEGIN EXCLUSIVE TRANSACTION");
                int i = abstractC1420.f5787;
                try {
                    if (iMo6095 == 0) {
                        c1514.m5095(interfaceC3255);
                    } else {
                        c1514.m5096(interfaceC3255, iMo6095, i);
                    }
                    ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA user_version = " + i);
                    c3403 = C3397.f13249;
                } catch (Throwable th) {
                    c3403 = new C3403(th);
                }
                if (!(c3403 instanceof C3403)) {
                    ـﹶ.ﹳˎ(interfaceC3255, "END TRANSACTION");
                }
                Throwable thM8265 = AbstractC3404.m8265(c3403);
                if (thM8265 != null) {
                    ـﹶ.ﹳˎ(interfaceC3255, "ROLLBACK TRANSACTION");
                    throw thM8265;
                }
            }
            c1514.m5094(interfaceC3255);
        } catch (Throwable th2) {
            interfaceC3254Mo6108.close();
            throw th2;
        }
    }

    public String toString() {
        switch (this.f6168) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f6164) {
                    arrayList.add("isRegularFile");
                }
                if (this.f6167) {
                    arrayList.add("isDirectory");
                }
                Long l = (Long) this.f6171;
                if (l != null) {
                    arrayList.add("byteCount=" + l);
                }
                Long l2 = (Long) this.f6165;
                if (l2 != null) {
                    arrayList.add("createdAt=" + l2);
                }
                Long l3 = (Long) this.f6169;
                if (l3 != null) {
                    arrayList.add("lastModifiedAt=" + l3);
                }
                Long l4 = (Long) this.f6170;
                if (l4 != null) {
                    arrayList.add("lastAccessedAt=" + l4);
                }
                Map map = (Map) this.f6166;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC1041.m4033(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC1229 m5093() {
        C4554 c4554;
        InterfaceC2162 interfaceC2162 = (InterfaceC2162) this.f6170;
        C4911 c4911 = interfaceC2162 instanceof C4911 ? (C4911) interfaceC2162 : null;
        if (c4911 == null || (c4554 = c4911.f18575) == null) {
            return null;
        }
        return (InterfaceC1229) c4554.f17462;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5094(p262.InterfaceC3255 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1514.m5094(ـʼ.ـﹶ):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m5095(InterfaceC3255 interfaceC3255) {
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (interfaceC3254Mo6108.mo6098()) {
                if (interfaceC3254Mo6108.mo6095(0) == 0) {
                    z = true;
                }
            }
            interfaceC3254Mo6108.close();
            AbstractC1420 abstractC1420 = (AbstractC1420) this.f6165;
            abstractC1420.mo4918(interfaceC3255);
            if (!z) {
                C1310 c1310Mo4921 = abstractC1420.mo4921(interfaceC3255);
                if (!c1310Mo4921.f5352) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c1310Mo4921.f5353).toString());
                }
            }
            ـﹶ.ﹳˎ(interfaceC3255, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ـﹶ.ﹳˎ(interfaceC3255, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) abstractC1420.f5785) + "')");
            abstractC1420.mo4919();
            Iterator it = ((List) this.f6169).iterator();
            while (it.hasNext()) {
                ((C1485) it.next()).getClass();
                boolean z2 = interfaceC3255 instanceof C4914;
            }
        } catch (Throwable th) {
            interfaceC3254Mo6108.close();
            throw th;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m5096(InterfaceC3255 interfaceC3255, int i, int i2) {
        C1509 c1509 = (C1509) this.f6171;
        List<AbstractC3293> listM5059 = c1509.f6146.m5059(i, i2);
        AbstractC1420 abstractC1420 = (AbstractC1420) this.f6165;
        if (listM5059 != null) {
            abstractC1420.mo4915(interfaceC3255);
            for (AbstractC3293 abstractC3293 : listM5059) {
                abstractC3293.getClass();
                if (!(interfaceC3255 instanceof C4914)) {
                    throw new C3405("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                abstractC3293.mo8104(((C4914) interfaceC3255).f18587);
            }
            C1310 c1310Mo4921 = abstractC1420.mo4921(interfaceC3255);
            if (!c1310Mo4921.f5352) {
                throw new IllegalStateException(("Migration didn't properly handle: " + c1310Mo4921.f5353).toString());
            }
            abstractC1420.mo4914(interfaceC3255);
            ـﹶ.ﹳˎ(interfaceC3255, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ـﹶ.ﹳˎ(interfaceC3255, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) abstractC1420.f5785) + "')");
            return;
        }
        if (c1509.m5081(i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.").toString());
        }
        if (c1509.f6143) {
            InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("SELECT name FROM sqlite_master WHERE type = 'table'");
            try {
                C1344 c1344 = new C1344(10);
                while (interfaceC3254Mo6108.mo6098()) {
                    String strMo6094 = interfaceC3254Mo6108.mo6094(0);
                    if (!AbstractC3629.m8560(strMo6094, "sqlite_", false) && !strMo6094.equals("android_metadata")) {
                        c1344.add(strMo6094);
                    }
                }
                C1344 c1344M8205 = AbstractC3362.m8205(c1344);
                interfaceC3254Mo6108.close();
                ListIterator listIterator = c1344M8205.listIterator(0);
                while (true) {
                    C1345 c1345 = (C1345) listIterator;
                    if (!c1345.hasNext()) {
                        break;
                    }
                    ـﹶ.ﹳˎ(interfaceC3255, "DROP TABLE IF EXISTS " + ((String) c1345.next()));
                }
            } catch (Throwable th) {
                interfaceC3254Mo6108.close();
                throw th;
            }
        } else {
            abstractC1420.mo4917(interfaceC3255);
        }
        Iterator it = ((List) this.f6169).iterator();
        while (it.hasNext()) {
            ((C1485) it.next()).getClass();
            boolean z = interfaceC3255 instanceof C4914;
        }
        abstractC1420.mo4918(interfaceC3255);
    }
}
