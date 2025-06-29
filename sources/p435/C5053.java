package p435;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.io.IOException;
import p317.AbstractC3625;
import p331.C3759;
import p334.C3789;
import p366.C4143;
import p366.C4155;
import p366.C4165;
import p366.InterfaceC4161;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶᵔ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5053 extends AbstractC5050 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final C4155 f19172;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final C4155 f19173;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final C4155 f19174;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final C4155 f19175;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final C4155 f19176;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC4161 f19177;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f19178;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f19179;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public String f19180;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C4143 f19181;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f19182;

    static {
        C4155 c4155 = new C4155("'\\".getBytes(AbstractC3625.f13869));
        c4155.f16069 = "'\\";
        f19176 = c4155;
        C4155 c41552 = new C4155("\"\\".getBytes(AbstractC3625.f13869));
        c41552.f16069 = "\"\\";
        f19172 = c41552;
        C4155 c41553 = new C4155("{}[]:, \n\t\r\f/\\;#=".getBytes(AbstractC3625.f13869));
        c41553.f16069 = "{}[]:, \n\t\r\f/\\;#=";
        f19174 = c41553;
        C4155 c41554 = new C4155("\n\r".getBytes(AbstractC3625.f13869));
        c41554.f16069 = "\n\r";
        f19173 = c41554;
        C4155 c41555 = new C4155("*/".getBytes(AbstractC3625.f13869));
        c41555.f16069 = "*/";
        f19175 = c41555;
    }

    public C5053(InterfaceC4161 interfaceC4161) {
        this.f19162 = new int[32];
        this.f19163 = new String[32];
        this.f19164 = new int[32];
        this.f19182 = 0;
        if (interfaceC4161 == null) {
            throw new NullPointerException("source == null");
        }
        this.f19177 = interfaceC4161;
        this.f19181 = interfaceC4161.mo9532();
        m11189(6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19182 = 0;
        this.f19162[0] = 8;
        this.f19165 = 1;
        this.f19181.m9508();
        this.f19177.close();
    }

    public final String toString() {
        return "JsonReader(" + this.f19177 + ")";
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m11201(C4155 c4155) throws EOFException, JsonEncodingException {
        while (true) {
            long jMo9531 = this.f19177.mo9531(c4155);
            if (jMo9531 == -1) {
                m11187("Unterminated string");
                throw null;
            }
            C4143 c4143 = this.f19181;
            if (c4143.m9520(jMo9531) != 92) {
                c4143.skip(jMo9531 + 1);
                return;
            } else {
                c4143.skip(jMo9531 + 1);
                m11211();
            }
        }
    }

    @Override // p435.AbstractC5050
    /* renamed from: ʻʿ */
    public final void mo11184() throws EOFException, JsonEncodingException {
        int i = 0;
        do {
            int iM11206 = this.f19182;
            if (iM11206 == 0) {
                iM11206 = m11206();
            }
            if (iM11206 == 3) {
                m11189(1);
            } else if (iM11206 == 1) {
                m11189(3);
            } else {
                if (iM11206 == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
                    }
                    this.f19165--;
                } else if (iM11206 == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
                    }
                    this.f19165--;
                } else {
                    C4143 c4143 = this.f19181;
                    if (iM11206 == 14 || iM11206 == 10) {
                        long jMo9531 = this.f19177.mo9531(f19174);
                        if (jMo9531 == -1) {
                            jMo9531 = c4143.f16041;
                        }
                        c4143.skip(jMo9531);
                    } else if (iM11206 == 9 || iM11206 == 13) {
                        m11201(f19172);
                    } else if (iM11206 == 8 || iM11206 == 12) {
                        m11201(f19176);
                    } else if (iM11206 == 17) {
                        c4143.skip(this.f19179);
                    } else if (iM11206 == 18) {
                        throw new JsonDataException("Expected a value but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
                    }
                }
                this.f19182 = 0;
            }
            i++;
            this.f19182 = 0;
        } while (i != 0);
        int[] iArr = this.f19164;
        int i2 = this.f19165 - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f19163[i2] = "null";
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m11202() throws JsonEncodingException {
        m11187("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ʽᐧ */
    public final void mo11185() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 1) {
            m11189(3);
            this.f19182 = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
    }

    @Override // p435.AbstractC5050
    /* renamed from: ˋⁱ */
    public final int mo11188() throws NumberFormatException, EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 16) {
            long j = this.f19178;
            int i = (int) j;
            if (j == i) {
                this.f19182 = 0;
                int[] iArr = this.f19164;
                int i2 = this.f19165 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.f19178 + " at path " + m11186());
        }
        if (iM11206 == 17) {
            long j2 = this.f19179;
            C4143 c4143 = this.f19181;
            c4143.getClass();
            this.f19180 = c4143.m9495(j2, AbstractC3625.f13869);
        } else if (iM11206 == 9 || iM11206 == 8) {
            String strM11204 = iM11206 == 9 ? m11204(f19172) : m11204(f19176);
            this.f19180 = strM11204;
            try {
                int i3 = Integer.parseInt(strM11204);
                this.f19182 = 0;
                int[] iArr2 = this.f19164;
                int i4 = this.f19165 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM11206 != 11) {
            throw new JsonDataException("Expected an int but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
        this.f19182 = 11;
        try {
            double d = Double.parseDouble(this.f19180);
            int i5 = (int) d;
            if (i5 != d) {
                throw new JsonDataException("Expected an int but was " + this.f19180 + " at path " + m11186());
            }
            this.f19180 = null;
            this.f19182 = 0;
            int[] iArr3 = this.f19164;
            int i6 = this.f19165 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f19180 + " at path " + m11186());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.skip(r3);
        r2 = p435.C5053.f19173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 != 47) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.mo9511(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        m11202();
        r10 = r1.m9520(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r10 == 42) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.mo9531(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r5 = r1.f16041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.mo9497(p435.C5053.f19175);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        r5 = r5 + r2.f16070.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        r5 = r1.f16041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r3 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        m11187("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        m11202();
        r5 = r5.mo9531(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        r5 = r1.f16041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        return r6;
     */
    /* renamed from: ˎᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11203(boolean r13) throws java.io.EOFException, com.squareup.moshi.JsonEncodingException {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            ᵔﾞ.ᐧʻ r5 = r12.f19177
            boolean r3 = r5.mo9511(r3)
            if (r3 == 0) goto La7
            long r3 = (long) r1
            ᵔﾞ.ʿʼ r1 = r12.f19181
            byte r6 = r1.m9520(r3)
            r7 = 10
            if (r6 == r7) goto La4
            r7 = 32
            if (r6 == r7) goto La4
            r7 = 13
            if (r6 == r7) goto La4
            r7 = 9
            if (r6 != r7) goto L26
            goto La4
        L26:
            r1.skip(r3)
            ᵔﾞ.ˏᵢ r2 = p435.C5053.f19173
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8b
            r10 = 2
            boolean r10 = r5.mo9511(r10)
            if (r10 != 0) goto L3c
            return r6
        L3c:
            r12.m11202()
            byte r10 = r1.m9520(r7)
            r11 = 42
            if (r10 == r11) goto L60
            if (r10 == r9) goto L4a
            return r6
        L4a:
            r1.readByte()
            r1.readByte()
            long r5 = r5.mo9531(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5a
            long r5 = r5 + r7
            goto L5c
        L5a:
            long r5 = r1.f16041
        L5c:
            r1.skip(r5)
            goto L1
        L60:
            r1.readByte()
            r1.readByte()
            ᵔﾞ.ˏᵢ r2 = p435.C5053.f19175
            long r5 = r5.mo9497(r2)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L72
            r3 = 1
            goto L73
        L72:
            r3 = 0
        L73:
            if (r3 == 0) goto L7b
            byte[] r2 = r2.f16070
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7d
        L7b:
            long r5 = r1.f16041
        L7d:
            r1.skip(r5)
            if (r3 == 0) goto L84
            goto L1
        L84:
            java.lang.String r13 = "Unterminated comment"
            r12.m11187(r13)
            r13 = 0
            throw r13
        L8b:
            r9 = 35
            if (r6 != r9) goto La3
            r12.m11202()
            long r5 = r5.mo9531(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9c
            long r5 = r5 + r7
            goto L9e
        L9c:
            long r5 = r1.f16041
        L9e:
            r1.skip(r5)
            goto L1
        La3:
            return r6
        La4:
            r1 = r2
            goto L2
        La7:
            if (r13 != 0) goto Lab
            r13 = -1
            return r13
        Lab:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p435.C5053.m11203(boolean):int");
    }

    @Override // p435.AbstractC5050
    /* renamed from: ˏʾ */
    public final double mo11190() throws NumberFormatException, EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 16) {
            this.f19182 = 0;
            int[] iArr = this.f19164;
            int i = this.f19165 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f19178;
        }
        if (iM11206 == 17) {
            long j = this.f19179;
            C4143 c4143 = this.f19181;
            c4143.getClass();
            this.f19180 = c4143.m9495(j, AbstractC3625.f13869);
        } else if (iM11206 == 9) {
            this.f19180 = m11204(f19172);
        } else if (iM11206 == 8) {
            this.f19180 = m11204(f19176);
        } else if (iM11206 == 10) {
            this.f19180 = m11210();
        } else if (iM11206 != 11) {
            throw new JsonDataException("Expected a double but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
        this.f19182 = 11;
        try {
            double d = Double.parseDouble(this.f19180);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + m11186());
            }
            this.f19180 = null;
            this.f19182 = 0;
            int[] iArr2 = this.f19164;
            int i2 = this.f19165 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f19180 + " at path " + m11186());
        }
    }

    @Override // p435.AbstractC5050
    /* renamed from: ˏᵢ */
    public final boolean mo11191() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        return (iM11206 == 2 || iM11206 == 4 || iM11206 == 18) ? false : true;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ˑʽ */
    public final void mo11192() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
        int i = this.f19165;
        this.f19165 = i - 1;
        int[] iArr = this.f19164;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f19182 = 0;
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final String m11204(C4155 c4155) throws EOFException, JsonEncodingException {
        StringBuilder sb = null;
        while (true) {
            long jMo9531 = this.f19177.mo9531(c4155);
            if (jMo9531 == -1) {
                m11187("Unterminated string");
                throw null;
            }
            C4143 c4143 = this.f19181;
            if (c4143.m9520(jMo9531) != 92) {
                if (sb == null) {
                    String strM9495 = c4143.m9495(jMo9531, AbstractC3625.f13869);
                    c4143.readByte();
                    return strM9495;
                }
                sb.append(c4143.m9495(jMo9531, AbstractC3625.f13869));
                c4143.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c4143.m9495(jMo9531, AbstractC3625.f13869));
            c4143.readByte();
            sb.append(m11211());
        }
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final int m11205(String str, C3759 c3759) {
        int length = ((String[]) c3759.f14522).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c3759.f14522)[i])) {
                this.f19182 = 0;
                int[] iArr = this.f19164;
                int i2 = this.f19165 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ـﹶ */
    public final void mo11193() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 3) {
            m11189(1);
            this.f19164[this.f19165 - 1] = 0;
            this.f19182 = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b2, code lost:
    
        if (m11209(r7) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b5, code lost:
    
        if (r2 != 2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b7, code lost:
    
        if (r5 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bd, code lost:
    
        if (r16 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01bf, code lost:
    
        if (r6 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c4, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c8, code lost:
    
        if (r16 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01ca, code lost:
    
        if (r6 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01cc, code lost:
    
        if (r6 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01ce, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d1, code lost:
    
        r8 = -r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d4, code lost:
    
        r19.f19178 = r8;
        r11.skip(r4);
        r10 = 16;
        r19.f19182 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01df, code lost:
    
        if (r2 == r3) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e2, code lost:
    
        if (r2 == 4) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01e5, code lost:
    
        if (r2 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01e7, code lost:
    
        r19.f19179 = r4;
        r10 = 17;
        r19.f19182 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013c, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b  */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11206() throws java.io.EOFException, com.squareup.moshi.JsonEncodingException {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p435.C5053.m11206():int");
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final int m11207(String str, C3759 c3759) {
        int length = ((String[]) c3759.f14522).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c3759.f14522)[i])) {
                this.f19182 = 0;
                this.f19163[this.f19165 - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ᐧˋ */
    public final int mo11194(C3759 c3759) throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 < 12 || iM11206 > 15) {
            return -1;
        }
        if (iM11206 == 15) {
            return m11207(this.f19180, c3759);
        }
        int iMo9510 = this.f19177.mo9510((C4165) c3759.f14523);
        if (iMo9510 != -1) {
            this.f19182 = 0;
            this.f19163[this.f19165 - 1] = ((String[]) c3759.f14522)[iMo9510];
            return iMo9510;
        }
        String str = this.f19163[this.f19165 - 1];
        String strM11208 = m11208();
        int iM11207 = m11207(strM11208, c3759);
        if (iM11207 == -1) {
            this.f19182 = 15;
            this.f19180 = strM11208;
            this.f19163[this.f19165 - 1] = str;
        }
        return iM11207;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ᴵʿ */
    public final void mo11195() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 7) {
            this.f19182 = 0;
            int[] iArr = this.f19164;
            int i = this.f19165 - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final String m11208() throws EOFException, JsonEncodingException {
        String strM11204;
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 14) {
            strM11204 = m11210();
        } else if (iM11206 == 13) {
            strM11204 = m11204(f19172);
        } else if (iM11206 == 12) {
            strM11204 = m11204(f19176);
        } else {
            if (iM11206 != 15) {
                throw new JsonDataException("Expected a name but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
            }
            strM11204 = this.f19180;
            this.f19180 = null;
        }
        this.f19182 = 0;
        this.f19163[this.f19165 - 1] = strM11204;
        return strM11204;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ᵎـ */
    public final String mo11196() throws EOFException, JsonEncodingException {
        String strM9495;
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 10) {
            strM9495 = m11210();
        } else if (iM11206 == 9) {
            strM9495 = m11204(f19172);
        } else if (iM11206 == 8) {
            strM9495 = m11204(f19176);
        } else if (iM11206 == 11) {
            strM9495 = this.f19180;
            this.f19180 = null;
        } else if (iM11206 == 16) {
            strM9495 = Long.toString(this.f19178);
        } else {
            if (iM11206 != 17) {
                throw new JsonDataException("Expected a string but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
            }
            long j = this.f19179;
            C4143 c4143 = this.f19181;
            c4143.getClass();
            strM9495 = c4143.m9495(j, AbstractC3625.f13869);
        }
        this.f19182 = 0;
        int[] iArr = this.f19164;
        int i = this.f19165 - 1;
        iArr[i] = iArr[i] + 1;
        return strM9495;
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final boolean m11209(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m11202();
        return false;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ᵢʿ */
    public final void mo11197() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 == 14) {
            long jMo9531 = this.f19177.mo9531(f19174);
            C4143 c4143 = this.f19181;
            if (jMo9531 == -1) {
                jMo9531 = c4143.f16041;
            }
            c4143.skip(jMo9531);
        } else if (iM11206 == 13) {
            m11201(f19172);
        } else if (iM11206 == 12) {
            m11201(f19176);
        } else if (iM11206 != 15) {
            throw new JsonDataException("Expected a name but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
        this.f19182 = 0;
        this.f19163[this.f19165 - 1] = "null";
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final String m11210() {
        long jMo9531 = this.f19177.mo9531(f19174);
        C4143 c4143 = this.f19181;
        if (jMo9531 == -1) {
            return c4143.m9515();
        }
        c4143.getClass();
        return c4143.m9495(jMo9531, AbstractC3625.f13869);
    }

    @Override // p435.AbstractC5050
    /* renamed from: ﹳﹳ */
    public final void mo11198() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        if (iM11206 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + ᐧʻ.ˈٴ(mo11199()) + " at path " + m11186());
        }
        int i = this.f19165;
        int i2 = i - 1;
        this.f19165 = i2;
        this.f19163[i2] = null;
        int[] iArr = this.f19164;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f19182 = 0;
    }

    @Override // p435.AbstractC5050
    /* renamed from: ﾞʽ */
    public final int mo11199() throws EOFException, JsonEncodingException {
        int iM11206 = this.f19182;
        if (iM11206 == 0) {
            iM11206 = m11206();
        }
        switch (iM11206) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final char m11211() throws EOFException, JsonEncodingException {
        int i;
        InterfaceC4161 interfaceC4161 = this.f19177;
        if (!interfaceC4161.mo9511(1L)) {
            m11187("Unterminated escape sequence");
            throw null;
        }
        C4143 c4143 = this.f19181;
        byte b = c4143.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            m11187("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!interfaceC4161.mo9511(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m11186());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bM9520 = c4143.m9520(i2);
            char c2 = (char) (c << 4);
            if (bM9520 >= 48 && bM9520 <= 57) {
                i = bM9520 - 48;
            } else if (bM9520 >= 97 && bM9520 <= 102) {
                i = bM9520 - 87;
            } else {
                if (bM9520 < 65 || bM9520 > 70) {
                    m11187("\\u".concat(c4143.m9495(4L, AbstractC3625.f13869)));
                    throw null;
                }
                i = bM9520 - 55;
            }
            c = (char) (i + c2);
        }
        c4143.skip(4L);
        return c;
    }
}
