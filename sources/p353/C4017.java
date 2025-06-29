package p353;

/* renamed from: ᵔʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4017 extends AbstractC4009 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final char f15466;

    public C4017(char c) {
        this.f15466 = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f15466;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }

    @Override // p353.AbstractC4009
    /* renamed from: ـﹶ */
    public final boolean mo9267(char c) {
        return c == this.f15466;
    }
}
