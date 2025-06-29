package j$.time.format;

/* loaded from: classes2.dex */
final class l implements InterfaceC5410f {
    private final InterfaceC5410f a;
    private final int b;
    private final char c;

    l(InterfaceC5410f interfaceC5410f, int i, char c) {
        this.a = interfaceC5410f;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.n(zVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        boolean zL = wVar.l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.b + i;
        if (length > charSequence.length()) {
            if (zL) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && wVar.b(charSequence.charAt(i2), this.c)) {
            i2++;
        }
        int iP = this.a.p(wVar, charSequence.subSequence(0, length), i2);
        return (iP == length || !zL) ? iP : ~(i + i2);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
