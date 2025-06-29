package p243;

/* renamed from: ˑﾞ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3110 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final byte[] f11996 = new byte[1792];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f11997;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f11998;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final CharSequence f11999;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public char f12000;

    static {
        for (int i = 0; i < 1792; i++) {
            f11996[i] = Character.getDirectionality(i);
        }
    }

    public C3110(CharSequence charSequence) {
        this.f11999 = charSequence;
        this.f11997 = charSequence.length();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte m7644() {
        int i = this.f11998 - 1;
        CharSequence charSequence = this.f11999;
        char cCharAt = charSequence.charAt(i);
        this.f12000 = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f11998);
            this.f11998 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f11998--;
        char c = this.f12000;
        return c < 1792 ? f11996[c] : Character.getDirectionality(c);
    }
}
