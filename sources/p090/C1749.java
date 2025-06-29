package p090;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p034.C1228;
import p034.InterfaceC1224;
import p034.InterfaceC1226;
import ˈⁱ.ﹳﹳ;

/* renamed from: ʿﹶ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1749 implements InterfaceC1224 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final SQLiteDatabase f6780;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final String[] f6776 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final String[] f6778 = new String[0];

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Object f6779 = ﹳﹳ.ᐧⁱ(3, C1741.f6751);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Object f6777 = ﹳﹳ.ᐧⁱ(3, C1741.f6750);

    public C1749(SQLiteDatabase sQLiteDatabase) {
        this.f6780 = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6780.close();
    }

    @Override // p034.InterfaceC1224
    public final boolean isOpen() {
        return this.f6780.isOpen();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ʾʼ */
    public final Cursor mo4380(InterfaceC1226 interfaceC1226, CancellationSignal cancellationSignal) {
        return this.f6780.rawQueryWithFactory(new C1746(0, interfaceC1226), interfaceC1226.mo4397(), f6778, null, cancellationSignal);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ٴˑ.ˑʽ] */
    @Override // p034.InterfaceC1224
    /* renamed from: ˆʿ */
    public final void mo4381() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r1 = f6777;
        if (((Method) r1.getValue()) != null) {
            ?? r2 = f6779;
            if (((Method) r2.getValue()) != null) {
                Method method = (Method) r1.getValue();
                Object objInvoke = ((Method) r2.getValue()).invoke(this.f6780, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        mo4386();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ˆᵔ */
    public final boolean mo4382() {
        return this.f6780.inTransaction();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ˈٴ */
    public final C1743 mo4383(String str) {
        return new C1743(this.f6780.compileStatement(str));
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ˎᵔ */
    public final void mo4384() {
        this.f6780.beginTransactionNonExclusive();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ˏᴵ */
    public final void mo4385() {
        this.f6780.endTransaction();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ˑי */
    public final void mo4386() {
        this.f6780.beginTransaction();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ˑﾞ */
    public final void mo4387(Object[] objArr) throws SQLException {
        this.f6780.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ᐧⁱ */
    public final Cursor mo4388(InterfaceC1226 interfaceC1226) {
        return this.f6780.rawQueryWithFactory(new C1746(1, new C1745(interfaceC1226)), interfaceC1226.mo4397(), f6778, null);
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ᵎʽ */
    public final long mo4389(String str, ContentValues contentValues, int i) {
        return this.f6780.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ᵢٴ */
    public final void mo4390() {
        this.f6780.setTransactionSuccessful();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ⁱʿ */
    public final Cursor mo4391(String str) {
        return mo4388(new C1228(str, 0));
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ﹳˎ */
    public final void mo4392(String str) throws SQLException {
        this.f6780.execSQL(str);
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ﾞˎ */
    public final int mo4393(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f6776[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        C1743 c1743Mo4383 = mo4383(sb.toString());
        int length2 = objArr2.length;
        int i3 = 0;
        while (i3 < length2) {
            Object obj = objArr2[i3];
            i3++;
            if (obj == null) {
                c1743Mo4383.mo4421(i3);
            } else if (obj instanceof byte[]) {
                c1743Mo4383.mo4423(i3, (byte[]) obj);
            } else if (obj instanceof Float) {
                c1743Mo4383.mo4422(i3, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                c1743Mo4383.mo4422(i3, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                c1743Mo4383.mo4419(i3, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                c1743Mo4383.mo4419(i3, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                c1743Mo4383.mo4419(i3, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                c1743Mo4383.mo4419(i3, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                c1743Mo4383.mo4420(i3, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                c1743Mo4383.mo4419(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return c1743Mo4383.f6755.executeUpdateDelete();
    }

    @Override // p034.InterfaceC1224
    /* renamed from: ﾞᐧ */
    public final boolean mo4394() {
        return this.f6780.isWriteAheadLoggingEnabled();
    }
}
