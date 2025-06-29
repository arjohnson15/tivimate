package p139;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.C0259;
import androidx.lifecycle.RunnableC0246;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p081.AbstractC1705;
import p123.C1995;
import p123.C1997;
import p123.C2001;
import p123.C2010;
import p141.RunnableC2187;
import p183.C2531;
import p191.C2646;
import p191.C2647;
import p191.C2649;
import p191.C2650;
import p191.C2651;
import p191.C2652;
import p191.EnumC2648;
import p288.C3397;
import p306.C3544;
import p306.C3550;
import p306.C3554;
import p306.InterfaceC3552;
import p338.InterfaceC3865;
import p410.C4682;
import p410.InterfaceC4689;
import p437.C5070;
import p439.InterfaceC5123;
import ˈⁱ.ﹳﹳ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ˉˋ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C2125 implements InterfaceC3552, InterfaceC5123, InterfaceC4689 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f8367;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8368;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f8369;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f8370;

    public /* synthetic */ C2125(Object obj, Object obj2, Object obj3, int i) {
        this.f8370 = i;
        this.f8367 = obj;
        this.f8368 = obj2;
        this.f8369 = obj3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p306.InterfaceC3552, p353.InterfaceC4019
    public Object apply(Object obj) {
        long jInsert;
        C3554 c3554;
        EnumC2648 enumC2648;
        EnumC2648 enumC26482;
        int i = 5;
        int i2 = 4;
        int i3 = 3;
        EnumC2648 enumC26483 = EnumC2648.f10514;
        int i4 = 2;
        Object obj2 = this.f8369;
        int i5 = 0;
        Object obj3 = this.f8368;
        Object obj4 = this.f8367;
        int i6 = 1;
        switch (this.f8370) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C3554 c35542 = (C3554) obj4;
                long jSimpleQueryForLong = c35542.m8438().compileStatement("PRAGMA page_size").simpleQueryForLong() * c35542.m8438().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C3550 c3550 = c35542.f13722;
                long j = c3550.f13715;
                C2010 c2010 = (C2010) obj3;
                String str = c2010.f7647;
                if (jSimpleQueryForLong >= j) {
                    c35542.m8435(1L, enumC26483, str);
                    return -1L;
                }
                C1995 c1995 = (C1995) obj2;
                Long lM8432 = C3554.m8432(sQLiteDatabase, c1995);
                if (lM8432 != null) {
                    jInsert = lM8432.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c1995.f7594);
                    contentValues.put("priority", Integer.valueOf(AbstractC1705.m5421(c1995.f7593)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c1995.f7592;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                C1997 c1997 = c2010.f7646;
                byte[] bArr2 = c1997.f7595;
                int length = bArr2.length;
                int i7 = c3550.f13713;
                boolean z = length <= i7;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c2010.f7650));
                contentValues2.put("uptime_ms", Long.valueOf(c2010.f7643));
                contentValues2.put("payload_encoding", c1997.f7596.f10069);
                contentValues2.put("code", c2010.f7642);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c2010.f7649);
                contentValues2.put("pseudonymous_id", c2010.f7645);
                contentValues2.put("experiment_ids_clear_blob", c2010.f7651);
                contentValues2.put("experiment_ids_encrypted_blob", c2010.f7644);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr2.length / i7);
                    for (int i8 = 1; i8 <= iCeil; i8++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i8 - 1) * i7, Math.min(i8 * i7, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i8));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(c2010.f7648).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                Cursor cursor = (Cursor) obj;
                C3554 c35543 = (C3554) obj4;
                c35543.getClass();
                while (cursor.moveToNext()) {
                    long j2 = cursor.getLong(0);
                    boolean z2 = cursor.getInt(7) != 0;
                    C2001 c2001 = new C2001();
                    c2001.f7615 = new HashMap();
                    String string = cursor.getString(i6);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c2001.f7614 = string;
                    c2001.f7617 = Long.valueOf(cursor.getLong(i4));
                    c2001.f7610 = Long.valueOf(cursor.getLong(3));
                    if (z2) {
                        String string2 = cursor.getString(4);
                        c2001.f7613 = new C1997(string2 == null ? C3554.f13718 : new C2531(string2), cursor.getBlob(5));
                        c3554 = c35543;
                    } else {
                        String string3 = cursor.getString(4);
                        C2531 c2531 = string3 == null ? C3554.f13718 : new C2531(string3);
                        Cursor cursorQuery = c35543.m8438().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                            }
                            byte[] bArr3 = new byte[length2];
                            int i9 = 0;
                            int length3 = 0;
                            while (i9 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i9);
                                ArrayList arrayList2 = arrayList;
                                C3554 c35544 = c35543;
                                System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                length3 += bArr4.length;
                                i9++;
                                arrayList = arrayList2;
                                c35543 = c35544;
                            }
                            c3554 = c35543;
                            cursorQuery.close();
                            c2001.f7613 = new C1997(c2531, bArr3);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        c2001.f7609 = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        c2001.f7616 = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        c2001.f7612 = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        c2001.f7618 = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        c2001.f7611 = cursor.getBlob(11);
                    }
                    ((ArrayList) obj3).add(new C3544(j2, (C1995) obj2, c2001.m5650()));
                    c35543 = c3554;
                    i4 = 2;
                    i6 = 1;
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                C3554 c35545 = (C3554) obj4;
                c35545.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i5);
                        int i10 = cursor2.getInt(1);
                        EnumC2648 enumC26484 = EnumC2648.f10509;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                enumC26484 = EnumC2648.f10512;
                            } else if (i10 == 2) {
                                enumC2648 = enumC26483;
                                enumC26482 = enumC2648;
                            } else if (i10 == i3) {
                                enumC26484 = EnumC2648.f10510;
                            } else if (i10 == i2) {
                                enumC26484 = EnumC2648.f10515;
                            } else if (i10 == i) {
                                enumC26484 = EnumC2648.f10516;
                            } else if (i10 == 6) {
                                enumC26484 = EnumC2648.f10511;
                            } else {
                                ﹳﹳ.ˋⁱ("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
                            }
                            enumC26482 = enumC26483;
                            enumC2648 = enumC26484;
                        } else {
                            enumC26482 = enumC26483;
                            enumC2648 = enumC26484;
                        }
                        long j3 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C2652(j3, enumC2648));
                        enumC26483 = enumC26482;
                        i = 5;
                        i2 = 4;
                        i3 = 3;
                        i5 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            ﹶˆ r5 = (ﹶˆ) obj2;
                            if (!it.hasNext()) {
                                final long jM6468 = c35545.f13719.m6468();
                                SQLiteDatabase sQLiteDatabaseM8438 = c35545.m8438();
                                sQLiteDatabaseM8438.beginTransaction();
                                try {
                                    C2651 c2651 = (C2651) C3554.m8433(sQLiteDatabaseM8438.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC3552() { // from class: ᐧˈ.ٴˎ
                                        @Override // p306.InterfaceC3552, p353.InterfaceC4019
                                        public final Object apply(Object obj5) {
                                            Cursor cursor3 = (Cursor) obj5;
                                            cursor3.moveToNext();
                                            return new C2651(cursor3.getLong(0), jM6468);
                                        }
                                    });
                                    sQLiteDatabaseM8438.setTransactionSuccessful();
                                    sQLiteDatabaseM8438.endTransaction();
                                    r5.ᐧⁱ = c2651;
                                    r5.ˎˑ = new C2646(new C2650(c35545.m8438().compileStatement("PRAGMA page_size").simpleQueryForLong() * c35545.m8438().compileStatement("PRAGMA page_count").simpleQueryForLong(), C3550.f13711.f13715));
                                    r5.ᐧˋ = (String) c35545.f13720.get();
                                    return new C2649((C2651) r5.ᐧⁱ, DesugarCollections.unmodifiableList((ArrayList) r5.ˆʿ), (C2646) r5.ˎˑ, (String) r5.ᐧˋ);
                                } catch (Throwable th2) {
                                    sQLiteDatabaseM8438.endTransaction();
                                    throw th2;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i11 = C2647.f10506;
                            new ArrayList();
                            ((ArrayList) r5.ˆʿ).add(new C2647((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m6025() {
        RunnableC0246 runnableC0246 = (RunnableC0246) this.f8367;
        if (runnableC0246 != null) {
            runnableC0246.run();
        } else {
            ((AbstractC2160) this.f8368).cancel();
            ((Runnable) this.f8369).run();
        }
    }

    @Override // p410.InterfaceC4689
    /* renamed from: ˑʽ */
    public Object mo4248(C4682 c4682) {
        ((Executor) this.f8367).execute(new RunnableC2187((InterfaceC3865) this.f8368, (C0259) this.f8369, c4682, 16));
        return C3397.f13249;
    }

    @Override // p439.InterfaceC5123
    /* renamed from: ـﹶ */
    public Object mo4249() {
        C5070 c5070 = (C5070) this.f8367;
        C3554 c3554 = (C3554) c5070.f19228;
        c3554.getClass();
        C1995 c1995 = (C1995) this.f8368;
        C2010 c2010 = (C2010) this.f8369;
        if (Log.isLoggable(ﹳﹳ.יʻ("SQLiteEventStore"), 3)) {
            String str = "Storing event with priority=" + c1995.f7593 + ", name=" + c2010.f7647 + " for destination " + c1995.f7594;
        }
        ((Long) c3554.m8437(new C2125(c3554, c2010, c1995, 1))).getClass();
        c5070.f19227.m11453(c1995, 1, false);
        return null;
    }
}
