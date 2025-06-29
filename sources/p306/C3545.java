package p306;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p081.AbstractC1705;
import p123.C1995;
import p183.EnumC2533;

/* renamed from: ᐧˈ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C3545 implements InterfaceC3552 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C1995 f13701;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ long f13702;

    public /* synthetic */ C3545(long j, C1995 c1995) {
        this.f13702 = j;
        this.f13701 = c1995;
    }

    @Override // p306.InterfaceC3552, p353.InterfaceC4019
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f13702));
        C1995 c1995 = this.f13701;
        String str = c1995.f7594;
        EnumC2533 enumC2533 = c1995.f7593;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC1705.m5421(enumC2533))}) < 1) {
            contentValues.put("backend_name", c1995.f7594);
            contentValues.put("priority", Integer.valueOf(AbstractC1705.m5421(enumC2533)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
