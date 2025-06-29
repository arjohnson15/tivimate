package p369;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p166.C2428;

/* renamed from: ᵢʽ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4187 implements Closeable {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Logger f16143 = Logger.getLogger(C4187.class.getName());

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f16144;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C4188 f16145;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f16146;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C4188 f16147;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final RandomAccessFile f16148;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final byte[] f16149;

    public C4187(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f16149 = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m9599(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f16148 = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM9598 = m9598(0, bArr);
        this.f16144 = iM9598;
        if (iM9598 > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f16144 + ", Actual length: " + randomAccessFile2.length());
        }
        this.f16146 = m9598(4, bArr);
        int iM95982 = m9598(8, bArr);
        int iM95983 = m9598(12, bArr);
        this.f16147 = m9604(iM95982);
        this.f16145 = m9604(iM95983);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m9598(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static void m9599(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f16148.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4187.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f16144);
        sb.append(", size=");
        sb.append(this.f16146);
        sb.append(", first=");
        sb.append(this.f16147);
        sb.append(", last=");
        sb.append(this.f16145);
        sb.append(", element lengths=[");
        try {
            C2428 c2428 = new C2428();
            c2428.f9649 = sb;
            c2428.f9650 = true;
            m9610(c2428);
        } catch (IOException e) {
            f16143.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m9600() {
        m9607(4096, 0, 0, 0);
        this.f16146 = 0;
        C4188 c4188 = C4188.f16150;
        this.f16147 = c4188;
        this.f16145 = c4188;
        if (this.f16144 > 4096) {
            RandomAccessFile randomAccessFile = this.f16148;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f16144 = 4096;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized boolean m9601() {
        return this.f16146 == 0;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final synchronized void m9602() {
        try {
            if (m9601()) {
                throw new NoSuchElementException();
            }
            if (this.f16146 == 1) {
                m9600();
            } else {
                C4188 c4188 = this.f16147;
                int iM9603 = m9603(c4188.f16152 + 4 + c4188.f16151);
                m9608(iM9603, 0, 4, this.f16149);
                int iM9598 = m9598(0, this.f16149);
                m9607(this.f16144, this.f16146 - 1, iM9603, this.f16145.f16152);
                this.f16146--;
                this.f16147 = new C4188(iM9603, iM9598);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int m9603(int i) {
        int i2 = this.f16144;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4188 m9604(int i) throws IOException {
        if (i == 0) {
            return C4188.f16150;
        }
        RandomAccessFile randomAccessFile = this.f16148;
        randomAccessFile.seek(i);
        return new C4188(i, randomAccessFile.readInt());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9605(int i) throws IOException {
        int i2 = i + 4;
        int iM9611 = this.f16144 - m9611();
        if (iM9611 >= i2) {
            return;
        }
        int i3 = this.f16144;
        do {
            iM9611 += i3;
            i3 <<= 1;
        } while (iM9611 < i2);
        RandomAccessFile randomAccessFile = this.f16148;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        C4188 c4188 = this.f16145;
        int iM9603 = m9603(c4188.f16152 + 4 + c4188.f16151);
        if (iM9603 < this.f16147.f16152) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f16144);
            long j = iM9603 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f16145.f16152;
        int i5 = this.f16147.f16152;
        if (i4 < i5) {
            int i6 = (this.f16144 + i4) - 16;
            m9607(i3, this.f16146, i5, i6);
            this.f16145 = new C4188(i6, this.f16145.f16151);
        } else {
            m9607(i3, this.f16146, i5, i4);
        }
        this.f16144 = i3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9606(byte[] bArr) {
        int iM9603;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m9605(length);
                    boolean zM9601 = m9601();
                    if (zM9601) {
                        iM9603 = 16;
                    } else {
                        C4188 c4188 = this.f16145;
                        iM9603 = m9603(c4188.f16152 + 4 + c4188.f16151);
                    }
                    C4188 c41882 = new C4188(iM9603, length);
                    m9599(this.f16149, 0, length);
                    m9609(this.f16149, iM9603, 4);
                    m9609(bArr, iM9603 + 4, length);
                    m9607(this.f16144, this.f16146 + 1, zM9601 ? iM9603 : this.f16147.f16152, iM9603);
                    this.f16145 = c41882;
                    this.f16146++;
                    if (zM9601) {
                        this.f16147 = c41882;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m9607(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        byte[] bArr = this.f16149;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            m9599(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        RandomAccessFile randomAccessFile = this.f16148;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m9608(int i, int i2, int i3, byte[] bArr) throws IOException {
        int iM9603 = m9603(i);
        int i4 = iM9603 + i3;
        int i5 = this.f16144;
        RandomAccessFile randomAccessFile = this.f16148;
        if (i4 <= i5) {
            randomAccessFile.seek(iM9603);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM9603;
        randomAccessFile.seek(iM9603);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m9609(byte[] bArr, int i, int i2) throws IOException {
        int iM9603 = m9603(i);
        int i3 = iM9603 + i2;
        int i4 = this.f16144;
        RandomAccessFile randomAccessFile = this.f16148;
        if (i3 <= i4) {
            randomAccessFile.seek(iM9603);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM9603;
        randomAccessFile.seek(iM9603);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized void m9610(InterfaceC4184 interfaceC4184) {
        int iM9603 = this.f16147.f16152;
        for (int i = 0; i < this.f16146; i++) {
            C4188 c4188M9604 = m9604(iM9603);
            interfaceC4184.mo6532(new C4195(this, c4188M9604), c4188M9604.f16151);
            iM9603 = m9603(c4188M9604.f16152 + 4 + c4188M9604.f16151);
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m9611() {
        if (this.f16146 == 0) {
            return 16;
        }
        C4188 c4188 = this.f16145;
        int i = c4188.f16152;
        int i2 = this.f16147.f16152;
        return i >= i2 ? (i - i2) + 4 + c4188.f16151 + 16 : (((i + 4) + c4188.f16151) + this.f16144) - i2;
    }
}
