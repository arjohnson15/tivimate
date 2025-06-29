package p084;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import p122.C1968;
import p123.C1995;
import p191.EnumC2648;
import p306.C3545;
import p306.C3554;
import p306.InterfaceC3552;
import p439.InterfaceC5123;
import p444.C5152;
import p450.InterfaceC5190;
import p450.InterfaceC5191;

/* renamed from: ʿٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1715 implements InterfaceC5191, InterfaceC3552, InterfaceC5123 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ long f6686;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6687;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ Object f6688;

    public /* synthetic */ C1715(long j, Object obj, Object obj2) {
        this.f6688 = obj;
        this.f6687 = obj2;
        this.f6686 = j;
    }

    public /* synthetic */ C1715(String str, long j, C1968 c1968) {
        this.f6688 = str;
        this.f6686 = j;
        this.f6687 = c1968;
    }

    @Override // p306.InterfaceC3552, p353.InterfaceC4019
    public Object apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC2648) this.f6687).f10517;
        String string = Integer.toString(i);
        String str = (String) this.f6688;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f6686;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            }
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p439.InterfaceC5123
    /* renamed from: ـﹶ */
    public Object mo4249() {
        C5152 c5152 = (C5152) this.f6688;
        long jM6468 = c5152.f19695.m6468() + this.f6686;
        C3554 c3554 = (C3554) c5152.f19692;
        C1995 c1995 = (C1995) this.f6687;
        c3554.getClass();
        c3554.m8437(new C3545(jM6468, c1995));
        return null;
    }

    @Override // p450.InterfaceC5191
    /* renamed from: ᐧʻ */
    public void mo4097(InterfaceC5190 interfaceC5190) {
        ((C1713) interfaceC5190.get()).m5432((String) this.f6688, this.f6686, (C1968) this.f6687);
    }
}
