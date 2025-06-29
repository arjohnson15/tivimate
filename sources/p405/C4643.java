package p405;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* renamed from: ﹳʽ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4643 extends FilterOutputStream implements DataOutput {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        writeShort(i);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            writeShort(str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws IOException {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws IOException {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i & 255);
        ((FilterOutputStream) this).out.write((i >> 8) & 255);
        ((FilterOutputStream) this).out.write((i >> 16) & 255);
        ((FilterOutputStream) this).out.write((i >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
        long jReverseBytes = Long.reverseBytes(j);
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & jReverseBytes);
            jReverseBytes >>= 8;
        }
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i & 255);
        ((FilterOutputStream) this).out.write((i >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
