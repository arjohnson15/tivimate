package p090;

import android.database.sqlite.SQLiteProgram;
import p034.InterfaceC1230;

/* renamed from: ʿﹶ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1750 implements InterfaceC1230 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final SQLiteProgram f6781;

    public C1750(SQLiteProgram sQLiteProgram) {
        this.f6781 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6781.close();
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ˉⁱ */
    public final void mo4419(int i, long j) {
        this.f6781.bindLong(i, j);
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ˋˊ */
    public final void mo4420(int i, String str) {
        this.f6781.bindString(i, str);
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ٴˎ */
    public final void mo4421(int i) {
        this.f6781.bindNull(i);
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ᐧʻ */
    public final void mo4422(int i, double d) {
        this.f6781.bindDouble(i, d);
    }

    @Override // p034.InterfaceC1230
    /* renamed from: ᵔﹳ */
    public final void mo4423(int i, byte[] bArr) {
        this.f6781.bindBlob(i, bArr);
    }
}
