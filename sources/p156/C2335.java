package p156;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˊˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2335 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ByteBuffer f9262;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2334 f9263;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f9264 = new byte[256];

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f9265 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2334 m6416() {
        byte[] bArr;
        if (this.f9262 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m6419()) {
            return this.f9263;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m6418());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f9263.f9258 = this.f9262.getShort();
            this.f9263.f9259 = this.f9262.getShort();
            int iM6418 = m6418();
            C2334 c2334 = this.f9263;
            c2334.f9255 = (iM6418 & 128) != 0;
            c2334.f9261 = (int) Math.pow(2.0d, (iM6418 & 7) + 1);
            this.f9263.f9253 = m6418();
            C2334 c23342 = this.f9263;
            m6418();
            c23342.getClass();
            if (this.f9263.f9255 && !m6419()) {
                C2334 c23343 = this.f9263;
                c23343.f9257 = m6417(c23343.f9261);
                C2334 c23344 = this.f9263;
                c23344.f9254 = c23344.f9257[c23344.f9253];
            }
        } else {
            this.f9263.f9251 = 1;
        }
        if (!m6419()) {
            boolean z = false;
            while (!z && !m6419() && this.f9263.f9256 <= Integer.MAX_VALUE) {
                int iM64182 = m6418();
                if (iM64182 == 33) {
                    int iM64183 = m6418();
                    if (iM64183 == 1) {
                        m6420();
                    } else if (iM64183 == 249) {
                        this.f9263.f9260 = new C2336();
                        m6418();
                        int iM64184 = m6418();
                        C2336 c2336 = this.f9263.f9260;
                        int i2 = (iM64184 & 28) >> 2;
                        c2336.f9274 = i2;
                        if (i2 == 0) {
                            c2336.f9274 = 1;
                        }
                        c2336.f9273 = (iM64184 & 1) != 0;
                        short s = this.f9262.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C2336 c23362 = this.f9263.f9260;
                        c23362.f9276 = s * 10;
                        c23362.f9270 = m6418();
                        m6418();
                    } else if (iM64183 == 254) {
                        m6420();
                    } else if (iM64183 != 255) {
                        m6420();
                    } else {
                        m6421();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f9264;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m6421();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f9263.getClass();
                                }
                                if (this.f9265 > 0) {
                                }
                            } while (!m6419());
                        } else {
                            m6420();
                        }
                    }
                } else if (iM64182 == 44) {
                    C2334 c23345 = this.f9263;
                    if (c23345.f9260 == null) {
                        c23345.f9260 = new C2336();
                    }
                    c23345.f9260.f9272 = this.f9262.getShort();
                    this.f9263.f9260.f9266 = this.f9262.getShort();
                    this.f9263.f9260.f9271 = this.f9262.getShort();
                    this.f9263.f9260.f9275 = this.f9262.getShort();
                    int iM64185 = m6418();
                    boolean z2 = (iM64185 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM64185 & 7) + 1);
                    C2336 c23363 = this.f9263.f9260;
                    c23363.f9267 = (iM64185 & 64) != 0;
                    if (z2) {
                        c23363.f9269 = m6417(iPow);
                    } else {
                        c23363.f9269 = null;
                    }
                    this.f9263.f9260.f9268 = this.f9262.position();
                    m6418();
                    m6420();
                    if (!m6419()) {
                        C2334 c23346 = this.f9263;
                        c23346.f9256++;
                        c23346.f9252.add(c23346.f9260);
                    }
                } else if (iM64182 != 59) {
                    this.f9263.f9251 = 1;
                } else {
                    z = true;
                }
            }
            C2334 c23347 = this.f9263;
            if (c23347.f9256 < 0) {
                c23347.f9251 = 1;
            }
        }
        return this.f9263;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int[] m6417(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f9262.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
            }
            this.f9263.f9251 = 1;
        }
        return iArr;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m6418() {
        try {
            return this.f9262.get() & 255;
        } catch (Exception unused) {
            this.f9263.f9251 = 1;
            return 0;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6419() {
        return this.f9263.f9251 != 0;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m6420() {
        int iM6418;
        do {
            iM6418 = m6418();
            this.f9262.position(Math.min(this.f9262.position() + iM6418, this.f9262.limit()));
        } while (iM6418 > 0);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6421() {
        int iM6418 = m6418();
        this.f9265 = iM6418;
        if (iM6418 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f9265;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f9262.get(this.f9264, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sb = ᐧʻ.ᵎـ("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    sb.append(this.f9265);
                    sb.toString();
                }
                this.f9263.f9251 = 1;
                return;
            }
        }
    }
}
