package p422;

/* renamed from: ﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4867 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Integer f18384;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f18384 = num;
    }
}
