package p090;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import p034.InterfaceC1226;
import p070.AbstractC1547;
import p338.InterfaceC3859;

/* renamed from: ʿﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1745 extends AbstractC1547 implements InterfaceC3859 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1226 f6763;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745(InterfaceC1226 interfaceC1226) {
        super(4);
        this.f6763 = interfaceC1226;
    }

    @Override // p338.InterfaceC3859
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Object mo5463(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.f6763.mo4396(new C1750(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
