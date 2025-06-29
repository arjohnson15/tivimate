package p128;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p447.AbstractC5179;

/* renamed from: ˈﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2036 extends InputStream implements DataInput {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final ByteOrder f7704 = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final ByteOrder f7705 = ByteOrder.BIG_ENDIAN;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ByteOrder f7706;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f7707;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public byte[] f7708;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final DataInputStream f7709;

    public C2036(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C2036(InputStream inputStream, ByteOrder byteOrder) {
        this.f7706 = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f7709 = dataInputStream;
        dataInputStream.mark(0);
        this.f7707 = 0;
        this.f7706 = byteOrder;
    }

    public C2036(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f7709.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f7707++;
        return this.f7709.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f7709.read(bArr, i, i2);
        this.f7707 += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f7707++;
        return this.f7709.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f7707++;
        int i = this.f7709.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f7707 += 2;
        return this.f7709.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f7707 += bArr.length;
        this.f7709.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f7707 += i2;
        this.f7709.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f7707 += 4;
        DataInputStream dataInputStream = this.f7709;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7706;
        if (byteOrder == f7704) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f7705) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f7706);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f7707 += 8;
        DataInputStream dataInputStream = this.f7709;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7706;
        if (byteOrder == f7704) {
            return (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f7705) {
            return (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
        }
        throw new IOException("Invalid byte order: " + this.f7706);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f7707 += 2;
        DataInputStream dataInputStream = this.f7709;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7706;
        if (byteOrder == f7704) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f7705) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f7706);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f7707 += 2;
        return this.f7709.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f7707++;
        return this.f7709.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f7707 += 2;
        DataInputStream dataInputStream = this.f7709;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7706;
        if (byteOrder == f7704) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f7705) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f7706);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5685(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.f7709;
            int i3 = i - i2;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f7708 == null) {
                    this.f7708 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f7708, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC5179.m11548(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f7707 += i2;
    }
}
