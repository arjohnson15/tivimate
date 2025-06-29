package j$.time.format;

/* renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5408d implements InterfaceC5410f {
    private final char a;

    C5408d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (!wVar.k() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
