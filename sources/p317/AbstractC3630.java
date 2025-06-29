package p317;

/* renamed from: ᴵ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3630 extends AbstractC3624 {
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static Float m8563(String str) {
        try {
            if (AbstractC3633.f13878.f13862.matcher(str).matches()) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
