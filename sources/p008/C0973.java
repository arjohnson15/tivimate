package p008;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import p080.AbstractC1702;
import p260.C3222;
import p266.C3262;
import p298.C3493;
import p298.C3496;
import p298.C3498;
import p298.C3500;
import p298.C3501;
import ـˊ.ʿʼ;

/* renamed from: ʻˊ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0973 extends OutputStream {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C3501 f4295;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public char[] f4296;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3493 f4297;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C3262 f4298;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3496 f4299;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f4300;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f4301;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public CRC32 f4302;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public AbstractC0975 f4303;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C0979 f4304;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C3222 f4305;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C3500 f4306;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ʿʼ f4307;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public long f4308;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f4300) {
            m3943();
        }
        C3496 c3496 = this.f4299;
        C3498 c3498 = c3496.f13535;
        C0979 c0979 = this.f4304;
        C0974 c0974 = c0979.f4320;
        c3498.f13550 = c0974 instanceof C0974 ? c0974.f4313.getFilePointer() : c0979.f4319;
        this.f4295.getClass();
        this.f4298.m8027(c3496, c0979);
        c0979.close();
        this.f4301 = true;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4301) {
            throw new IOException("Stream is closed");
        }
        this.f4302.update(bArr, i, i2);
        this.f4303.write(bArr, i, i2);
        this.f4308 += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f4 A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030a A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0327 A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033c A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0346 A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034d A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0364 A[Catch: all -> 0x0308, TryCatch #1 {all -> 0x0308, blocks: (B:137:0x02a7, B:139:0x02e1, B:147:0x02f4, B:151:0x031d, B:153:0x0327, B:154:0x032d, B:158:0x0338, B:160:0x033c, B:161:0x033e, B:163:0x0346, B:166:0x034d, B:167:0x0360, B:169:0x0364, B:170:0x039e, B:150:0x030a), top: B:210:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0411  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3942(p298.C3495 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p008.C0973.m3942(ٴﾞ.ˉⁱ):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3493 m3943() throws IOException {
        this.f4303.mo3941();
        long j = this.f4303.f4315.f4289.f4294;
        C3493 c3493 = this.f4297;
        c3493.f13494 = j;
        C3500 c3500 = this.f4306;
        c3500.f13494 = j;
        long j2 = this.f4308;
        c3493.f13499 = j2;
        c3500.f13499 = j2;
        boolean zM5410 = (c3493.f13498 && AbstractC1702.m5410(c3493.f13497, 4)) ? AbstractC1702.m5410(c3493.f13504.f13553, 1) : true;
        CRC32 crc32 = this.f4302;
        if (zM5410) {
            this.f4297.f13507 = crc32.getValue();
            this.f4306.f13507 = crc32.getValue();
        }
        C3496 c3496 = this.f4299;
        c3496.f13538.add(this.f4306);
        c3496.f13532.f4789.add(this.f4297);
        C3500 c35002 = this.f4306;
        if (c35002.f13506) {
            C3262 c3262 = this.f4298;
            byte[] bArr = (byte[]) c3262.f12724;
            C3222 c3222 = (C3222) c3262.f12726;
            C0979 c0979 = this.f4304;
            if (c0979 == null) {
                throw new ZipException("input parameters is null, cannot write extended local header");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c3222.m7953(byteArrayOutputStream, (int) 134695760);
                C3222.m7925(c35002.f13507, bArr);
                byteArrayOutputStream.write(bArr, 0, 4);
                if (c35002.f13556) {
                    c3222.m7952(byteArrayOutputStream, c35002.f13494);
                    c3222.m7952(byteArrayOutputStream, c35002.f13499);
                } else {
                    C3222.m7925(c35002.f13494, bArr);
                    byteArrayOutputStream.write(bArr, 0, 4);
                    C3222.m7925(c35002.f13499, bArr);
                    byteArrayOutputStream.write(bArr, 0, 4);
                }
                c0979.write(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.f4308 = 0L;
        crc32.reset();
        this.f4303.close();
        this.f4300 = true;
        return this.f4297;
    }
}
