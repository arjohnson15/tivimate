package p404;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: ﹳʻ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4636 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f17748;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f17749;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f17750;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f17751;

    public C4636(int i, int i2, long j, long j2) {
        this.f17750 = i;
        this.f17748 = i2;
        this.f17749 = j;
        this.f17751 = j2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4636 m10543(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C4636 c4636 = new C4636(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c4636;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4636)) {
            return false;
        }
        C4636 c4636 = (C4636) obj;
        return this.f17748 == c4636.f17748 && this.f17749 == c4636.f17749 && this.f17750 == c4636.f17750 && this.f17751 == c4636.f17751;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17748), Long.valueOf(this.f17749), Integer.valueOf(this.f17750), Long.valueOf(this.f17751));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10544(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f17750);
            dataOutputStream.writeInt(this.f17748);
            dataOutputStream.writeLong(this.f17749);
            dataOutputStream.writeLong(this.f17751);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
