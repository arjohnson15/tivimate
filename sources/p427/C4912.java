package p427;

import android.database.Cursor;
import java.util.Arrays;
import ᵢ.ʿʼ;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹶˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4912 extends AbstractC4916 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long[] f18576;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public byte[][] f18577;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public double[] f18578;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public String[] f18579;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int[] f18580;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Cursor f18581;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m11028(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            ـﹶ.ﾞᐧ(25, "column index out of range");
            throw null;
        }
    }

    @Override // p262.InterfaceC3254
    public final void close() {
        if (!this.f18590) {
            m11033();
            this.f18580 = new int[0];
            this.f18576 = new long[0];
            this.f18578 = new double[0];
            this.f18579 = new String[0];
            this.f18577 = new byte[0][];
            mo6102();
        }
        this.f18590 = true;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ʽᐧ */
    public final String mo6094(int i) {
        m11033();
        Cursor cursorM11029 = m11029();
        m11028(cursorM11029, i);
        return cursorM11029.getString(i);
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ʿʼ */
    public final long mo6095(int i) {
        m11033();
        Cursor cursorM11029 = m11029();
        m11028(cursorM11029, i);
        return cursorM11029.getLong(i);
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ˉי */
    public final boolean mo6096(int i) {
        m11033();
        Cursor cursorM11029 = m11029();
        m11028(cursorM11029, i);
        return cursorM11029.isNull(i);
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ˉⁱ */
    public final void mo6097(int i, long j) {
        m11033();
        m11030(1, i);
        this.f18580[i] = 1;
        this.f18576[i] = j;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ˋⁱ */
    public final boolean mo6098() {
        m11033();
        m11031();
        Cursor cursor = this.f18581;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final Cursor m11029() {
        Cursor cursor = this.f18581;
        if (cursor != null) {
            return cursor;
        }
        ـﹶ.ﾞᐧ(21, "no row");
        throw null;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ˏʾ */
    public final String mo6099(int i) {
        m11033();
        m11031();
        Cursor cursor = this.f18581;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m11028(cursor, i);
        return cursor.getColumnName(i);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m11030(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f18580;
        if (iArr.length < i3) {
            this.f18580 = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f18576;
            if (jArr.length < i3) {
                this.f18576 = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f18578;
            if (dArr.length < i3) {
                this.f18578 = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f18579;
            if (strArr.length < i3) {
                this.f18579 = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f18577;
        if (bArr.length < i3) {
            this.f18577 = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ˏᵢ */
    public final void mo6100(int i, String str) {
        m11033();
        m11030(3, i);
        this.f18580[i] = 3;
        this.f18579[i] = str;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ˑʽ */
    public final int mo6101() {
        m11033();
        m11031();
        Cursor cursor = this.f18581;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m11031() {
        if (this.f18581 == null) {
            this.f18581 = this.f18591.mo4388(new ʿʼ(17, this));
        }
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ـﹶ */
    public final void mo6102() {
        m11033();
        Cursor cursor = this.f18581;
        if (cursor != null) {
            cursor.close();
        }
        this.f18581 = null;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ٴˎ */
    public final void mo6103(int i) {
        m11033();
        m11030(5, i);
        this.f18580[i] = 5;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ᐧʻ */
    public final void mo6104(int i, double d) {
        m11033();
        m11030(2, i);
        this.f18580[i] = 2;
        this.f18578[i] = d;
    }

    @Override // p262.InterfaceC3254
    /* renamed from: ﹳﹳ */
    public final double mo6105(int i) {
        m11033();
        Cursor cursorM11029 = m11029();
        m11028(cursorM11029, i);
        return cursorM11029.getDouble(i);
    }
}
