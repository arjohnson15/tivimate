package p065;

import android.database.Cursor;
import android.database.SQLException;
import android.support.v4.media.session.AbstractC0001;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p034.AbstractC1227;
import p049.C1310;
import p057.C1344;
import p057.C1345;
import p090.C1749;
import p145.AbstractC2234;
import p270.AbstractC3293;
import p278.AbstractC3362;
import p317.AbstractC3629;
import p396.C4554;
import p427.C4914;
import ـˈ.ˉᵎ;

/* renamed from: ʾᵔ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1523 extends AbstractC1227 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4554 f6190;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C1509 f6191;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final List f6192;

    public C1523(C1509 c1509, C4554 c4554) {
        super(23, 0);
        this.f6192 = c1509.f6128;
        this.f6191 = c1509;
        this.f6190 = c4554;
    }

    @Override // p034.AbstractC1227
    /* renamed from: ˋⁱ */
    public final void mo4404(C1749 c1749) throws SQLException {
        Cursor cursorMo4391 = c1749.mo4391("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorMo4391.moveToFirst()) {
                if (cursorMo4391.getInt(0) == 0) {
                    z = true;
                }
            }
            AbstractC0001.m5(cursorMo4391, null);
            C4554 c4554 = this.f6190;
            C4554.m10424(c1749);
            if (!z) {
                C1310 c1310M10425 = C4554.m10425(c1749);
                if (!c1310M10425.f5352) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c1310M10425.f5353);
                }
            }
            c1749.mo4392("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c1749.mo4392("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            ((WorkDatabase_Impl) c4554.f17462).getClass();
            List list = this.f6192;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C1485) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0001.m5(cursorMo4391, th);
                throw th2;
            }
        }
    }

    @Override // p034.AbstractC1227
    /* renamed from: ˏʾ */
    public final void mo4405(C1749 c1749) {
    }

    @Override // p034.AbstractC1227
    /* renamed from: ˏᴵ */
    public final void mo4406(C1749 c1749, int i, int i2) throws SQLException {
        mo4412(c1749, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // p034.AbstractC1227
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4408(p090.C1749 r7) throws android.database.SQLException {
        /*
            r6 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r7.mo4391(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r7 = move-exception
            goto Lba
        L18:
            r1 = 0
        L19:
            r3 = 0
            android.support.v4.media.session.AbstractC0001.m5(r0, r3)
            ⁱᴵ.ˈٴ r0 = r6.f6190
            if (r1 == 0) goto L61
            ʼᵔ.ـﹶ r1 = new ʼᵔ.ـﹶ
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r5 = 0
            r1.<init>(r4, r5)
            android.database.Cursor r1 = r7.mo4388(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3a
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r7 = move-exception
            goto L5b
        L3a:
            r2 = r3
        L3b:
            android.support.v4.media.session.AbstractC0001.m5(r1, r3)
            java.lang.String r1 = "86254750241babac4b8d52996a675549"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L73
            java.lang.String r1 = "1cbd3130fa23b59692c061c594c16cc0"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4f
            goto L73
        L4f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: "
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ﾞˊ(r0, r2)
            r7.<init>(r0)
            throw r7
        L5b:
            throw r7     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            android.support.v4.media.session.AbstractC0001.m5(r1, r7)
            throw r0
        L61:
            ʽﹳ.ـﹶ r1 = p396.C4554.m10425(r7)
            boolean r2 = r1.f5352
            if (r2 == 0) goto La4
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r7.mo4392(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')"
            r7.mo4392(r1)
        L73:
            java.lang.Object r0 = r0.f17462
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            r0.getClass()
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r7.mo4392(r1)
            ﹶˉ.ـﹶ r1 = new ﹶˉ.ـﹶ
            r1.<init>(r7)
            r0.m5050(r1)
            java.util.List r0 = r6.f6192
            if (r0 == 0) goto La1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L91:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            ʾᵔ.ˈٴ r1 = (p065.C1485) r1
            r1.m5056(r7)
            goto L91
        La1:
            r6.f6191 = r3
            return
        La4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f5353
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lba:
            throw r7     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r1 = move-exception
            android.support.v4.media.session.AbstractC0001.m5(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p065.C1523.mo4408(ʿﹶ.ﹳﹳ):void");
    }

    @Override // p034.AbstractC1227
    /* renamed from: ᵎـ */
    public final void mo4412(C1749 c1749, int i, int i2) throws SQLException {
        List<AbstractC3293> listM5059;
        C1509 c1509 = this.f6191;
        C4554 c4554 = this.f6190;
        if (c1509 != null && (listM5059 = c1509.f6146.m5059(i, i2)) != null) {
            AbstractC2234.m6236(new C4914(c1749));
            for (AbstractC3293 abstractC3293 : listM5059) {
                abstractC3293.getClass();
                abstractC3293.mo8104(c1749);
            }
            C1310 c1310M10425 = C4554.m10425(c1749);
            if (!c1310M10425.f5352) {
                throw new IllegalStateException("Migration didn't properly handle: " + c1310M10425.f5353);
            }
            c1749.mo4392("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c1749.mo4392("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            return;
        }
        C1509 c15092 = this.f6191;
        if (c15092 == null || c15092.m5081(i, i2)) {
            throw new IllegalStateException(ˉᵎ.ˋⁱ("A migration from ", i, " to ", i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (c15092.f6143) {
            Cursor cursorMo4391 = c1749.mo4391("SELECT name FROM sqlite_master WHERE type = 'table'");
            try {
                C1344 c1344 = new C1344(10);
                while (cursorMo4391.moveToNext()) {
                    String string = cursorMo4391.getString(0);
                    if (!AbstractC3629.m8560(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        c1344.add(string);
                    }
                }
                C1344 c1344M8205 = AbstractC3362.m8205(c1344);
                AbstractC0001.m5(cursorMo4391, null);
                ListIterator listIterator = c1344M8205.listIterator(0);
                while (true) {
                    C1345 c1345 = (C1345) listIterator;
                    if (!c1345.hasNext()) {
                        break;
                    }
                    c1749.mo4392("DROP TABLE IF EXISTS " + ((String) c1345.next()));
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0001.m5(cursorMo4391, th);
                    throw th2;
                }
            }
        } else {
            c1749.mo4392("DROP TABLE IF EXISTS `Dependency`");
            c1749.mo4392("DROP TABLE IF EXISTS `WorkSpec`");
            c1749.mo4392("DROP TABLE IF EXISTS `WorkTag`");
            c1749.mo4392("DROP TABLE IF EXISTS `SystemIdInfo`");
            c1749.mo4392("DROP TABLE IF EXISTS `WorkName`");
            c1749.mo4392("DROP TABLE IF EXISTS `WorkProgress`");
            c1749.mo4392("DROP TABLE IF EXISTS `Preference`");
            ((WorkDatabase_Impl) c4554.f17462).getClass();
        }
        List list = this.f6192;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1485) it.next()).getClass();
            }
        }
        C4554.m10424(c1749);
    }
}
