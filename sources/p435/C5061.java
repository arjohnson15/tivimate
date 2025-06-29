package p435;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.util.Arrays;
import p366.InterfaceC4160;

/* renamed from: ﹶᵔ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5061 extends AbstractC5048 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final String[] f19204 = new String[128];

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public String f19205;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final InterfaceC4160 f19206;

    static {
        for (int i = 0; i <= 31; i++) {
            f19204[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f19204;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C5061(InterfaceC4160 interfaceC4160) {
        int[] iArr = new int[32];
        this.f19156 = iArr;
        this.f19158 = new String[32];
        this.f19159 = new int[32];
        this.f19161 = -1;
        this.f19206 = interfaceC4160;
        this.f19160 = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m11218(p366.InterfaceC4160 r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p435.C5061.f19204
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo9534(r4, r3, r8)
        L2e:
            r7.mo9525(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo9534(r4, r2, r8)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p435.C5061.m11218(ᵔﾞ.ٴˎ, java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19206.close();
        int i = this.f19160;
        if (i > 1 || (i == 1 && this.f19156[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19160 = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f19160 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19206.flush();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m11219() {
        if (this.f19205 != null) {
            int iM11176 = m11176();
            InterfaceC4160 interfaceC4160 = this.f19206;
            if (iM11176 == 5) {
                interfaceC4160.writeByte(44);
            } else if (iM11176 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f19156[this.f19160 - 1] = 4;
            m11218(interfaceC4160, this.f19205);
            this.f19205 = null;
        }
    }

    @Override // p435.AbstractC5048
    /* renamed from: ʽᐧ */
    public final C5061 mo11173() {
        if (this.f19157) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m11182());
        }
        m11219();
        m11221(3, 5, '{');
        return this;
    }

    @Override // p435.AbstractC5048
    /* renamed from: ʿʼ */
    public final C5061 mo11174(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f19160 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iM11176 = m11176();
        if ((iM11176 != 3 && iM11176 != 5) || this.f19205 != null || this.f19157) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f19205 = str;
        this.f19158[this.f19160 - 1] = str;
        return this;
    }

    @Override // p435.AbstractC5048
    /* renamed from: ˋⁱ */
    public final C5061 mo11175(long j) {
        if (this.f19157) {
            this.f19157 = false;
            mo11174(Long.toString(j));
            return this;
        }
        m11219();
        m11222();
        this.f19206.mo9525(Long.toString(j));
        int[] iArr = this.f19159;
        int i = this.f19160 - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m11220(int i, int i2, char c) {
        int iM11176 = m11176();
        if (iM11176 != i2 && iM11176 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f19205 != null) {
            throw new IllegalStateException("Dangling name: " + this.f19205);
        }
        int i3 = this.f19160;
        int i4 = ~this.f19161;
        if (i3 == i4) {
            this.f19161 = i4;
            return;
        }
        int i5 = i3 - 1;
        this.f19160 = i5;
        this.f19158[i5] = null;
        int[] iArr = this.f19159;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f19206.writeByte(c);
    }

    @Override // p435.AbstractC5048
    /* renamed from: ˏᵢ */
    public final C5061 mo11177() {
        if (this.f19157) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m11182());
        }
        if (this.f19205 != null) {
            this.f19205 = null;
            return this;
        }
        m11222();
        this.f19206.mo9525("null");
        int[] iArr = this.f19159;
        int i = this.f19160 - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p435.AbstractC5048
    /* renamed from: ˑʽ */
    public final C5061 mo11178() {
        this.f19157 = false;
        m11220(3, 5, '}');
        return this;
    }

    @Override // p435.AbstractC5048
    /* renamed from: ـﹶ */
    public final C5061 mo11179() {
        if (this.f19157) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m11182());
        }
        m11219();
        m11221(1, 2, '[');
        return this;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m11221(int i, int i2, char c) {
        int i3;
        int i4 = this.f19160;
        int i5 = this.f19161;
        if (i4 == i5 && ((i3 = this.f19156[i4 - 1]) == i || i3 == i2)) {
            this.f19161 = ~i5;
            return;
        }
        m11222();
        int i6 = this.f19160;
        int[] iArr = this.f19156;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new JsonDataException("Nesting too deep at " + m11182() + ": circular reference?");
            }
            this.f19156 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f19158;
            this.f19158 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f19159;
            this.f19159 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f19156;
        int i7 = this.f19160;
        this.f19160 = i7 + 1;
        iArr3[i7] = i;
        this.f19159[i7] = 0;
        this.f19206.writeByte(c);
    }

    @Override // p435.AbstractC5048
    /* renamed from: ᴵʿ */
    public final C5061 mo11180(Number number) {
        if (number == null) {
            mo11177();
            return this;
        }
        String string = number.toString();
        if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f19157) {
            this.f19157 = false;
            mo11174(string);
            return this;
        }
        m11219();
        m11222();
        this.f19206.mo9525(string);
        int[] iArr = this.f19159;
        int i = this.f19160 - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p435.AbstractC5048
    /* renamed from: ᵎـ */
    public final C5061 mo11181(String str) {
        if (str == null) {
            mo11177();
            return this;
        }
        if (this.f19157) {
            this.f19157 = false;
            mo11174(str);
            return this;
        }
        m11219();
        m11222();
        m11218(this.f19206, str);
        int[] iArr = this.f19159;
        int i = this.f19160 - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m11222() {
        int iM11176 = m11176();
        int i = 2;
        if (iM11176 != 1) {
            InterfaceC4160 interfaceC4160 = this.f19206;
            if (iM11176 == 2) {
                interfaceC4160.writeByte(44);
            } else if (iM11176 == 4) {
                interfaceC4160.mo9525(":");
                i = 5;
            } else {
                if (iM11176 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iM11176 != 6) {
                    if (iM11176 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i = 7;
            }
        }
        this.f19156[this.f19160 - 1] = i;
    }
}
