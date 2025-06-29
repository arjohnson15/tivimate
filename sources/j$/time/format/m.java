package j$.time.format;

/* loaded from: classes2.dex */
final class m extends n {
    @Override // j$.time.format.n
    protected final boolean c(char c, char c2) {
        return w.c(c, c2);
    }

    @Override // j$.time.format.n
    protected final n e(String str, String str2, n nVar) {
        return new m(str, str2, nVar, 0);
    }

    @Override // j$.time.format.n
    protected final boolean h(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!w.c(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
