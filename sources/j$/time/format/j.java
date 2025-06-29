package j$.time.format;

/* loaded from: classes2.dex */
class j implements InterfaceC5410f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final j$.time.temporal.q a;
    final int b;
    final int c;
    private final G d;
    final int e;

    j(j$.time.temporal.q qVar, int i, int i2, G g) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = g;
        this.e = 0;
    }

    protected j(j$.time.temporal.q qVar, int i, int i2, G g, int i3) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = g;
        this.e = i3;
    }

    long b(z zVar, long j) {
        return j;
    }

    boolean c(w wVar) {
        int i = this.e;
        return i == -1 || (i > 0 && this.b == this.c && this.d == G.NOT_NEGATIVE);
    }

    int d(w wVar, long j, int i, int i2) {
        return wVar.o(this.a, j, i, i2);
    }

    j e() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    j f(int i) {
        int i2 = this.e + i;
        return new j(this.a, this.b, this.c, this.d, i2);
    }

    @Override // j$.time.format.InterfaceC5410f
    public boolean n(z zVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long lE = zVar.e(qVar);
        if (lE == null) {
            return false;
        }
        long jB = b(zVar, lE.longValue());
        D dB = zVar.b();
        String string = jB == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jB));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.c("Field " + qVar + " cannot be printed as the value " + jB + " exceeds the maximum print width of " + i);
        }
        dB.getClass();
        int i2 = this.b;
        G g = this.d;
        if (jB >= 0) {
            int i3 = AbstractC5407c.a[g.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jB >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC5407c.a[g.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.c("Field " + qVar + " cannot be printed as the value " + jB + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x014d, code lost:
    
        return ~(r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x014e, code lost:
    
        if (r0 <= r8) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0151, code lost:
    
        return ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0152, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x015a, code lost:
    
        if (r1.bitLength() <= 63) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015c, code lost:
    
        r1 = r1.divide(java.math.BigInteger.TEN);
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0170, code lost:
    
        return d(r21, r1.longValue(), r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0179, code lost:
    
        return d(r21, r2, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0101, code lost:
    
        r5 = r13;
        r1 = r16;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
    
        if (r0 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010e, code lost:
    
        if (r1 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
    
        if (r1.equals(java.math.BigInteger.ZERO) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
    
        if (r21.l() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0121, code lost:
    
        return ~(r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0122, code lost:
    
        r1 = r1.negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0126, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012d, code lost:
    
        if (r9 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0133, code lost:
    
        if (r21.l() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0137, code lost:
    
        return ~(r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0138, code lost:
    
        r2 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013c, code lost:
    
        if (r7 != j$.time.format.G.EXCEEDS_PAD) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0142, code lost:
    
        if (r21.l() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0144, code lost:
    
        r0 = r5 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0146, code lost:
    
        if (r2 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0148, code lost:
    
        if (r0 > r8) goto L85;
     */
    @Override // j$.time.format.InterfaceC5410f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p(j$.time.format.w r21, java.lang.CharSequence r22, int r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.p(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.q qVar = this.a;
        G g = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && g == G.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i2 == i && g == G.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i2 + ")";
        }
        return "Value(" + qVar + "," + i2 + "," + i + "," + g + ")";
    }
}
