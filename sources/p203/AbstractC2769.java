package p203;

/* renamed from: ˎᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2769 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f10825 = 0;

    static {
        Math.log(2.0d);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m7046(double d) {
        if (Math.getExponent(d) > 1023) {
            return false;
        }
        if (d != 0.0d) {
            if (!(Math.getExponent(d) <= 1023)) {
                throw new IllegalArgumentException("not a normal value");
            }
            int exponent = Math.getExponent(d);
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) > Math.getExponent(d)) {
                return false;
            }
        }
        return true;
    }
}
