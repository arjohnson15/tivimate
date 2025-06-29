package p090;

import android.database.sqlite.SQLiteStatement;
import p034.InterfaceC1230;

/* renamed from: ʿﹶ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1743 extends C1750 implements InterfaceC1230 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final SQLiteStatement f6755;

    public C1743(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f6755 = sQLiteStatement;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m5462() {
        return this.f6755.executeUpdateDelete();
    }
}
