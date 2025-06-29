package p405;

import android.support.v4.media.session.AbstractC0001;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: ﹳʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4640 extends FilterInputStream implements DataInput {
    public C4640(C4641 c4641) {
        super(c4641);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
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
    public final void readFully(byte[] bArr) {
        int i = AbstractC4639.f17755;
        AbstractC4639.m10546(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        AbstractC4639.m10546(this, bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bM10549 = m10549();
        byte bM105492 = m10549();
        return AbstractC0001.m22(m10549(), m10549(), bM105492, bM10549);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bM10549 = m10549();
        byte bM105492 = m10549();
        byte bM105493 = m10549();
        byte bM105494 = m10549();
        byte bM105495 = m10549();
        return ((m10549() & 255) << 56) | ((m10549() & 255) << 48) | ((m10549() & 255) << 40) | ((bM105495 & 255) << 32) | ((bM105494 & 255) << 24) | ((bM105493 & 255) << 16) | ((bM105492 & 255) << 8) | (bM10549 & 255);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return AbstractC0001.m22((byte) 0, (byte) 0, m10549(), m10549());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte m10549() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (-1 != i) {
            return (byte) i;
        }
        throw new EOFException();
    }
}
