package p072;

/* renamed from: ʿʽ.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1628 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ThreadLocal f6403 = new ThreadLocal();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static AbstractC1608 m5245() {
        ThreadLocal threadLocal = f6403;
        AbstractC1608 abstractC1608 = (AbstractC1608) threadLocal.get();
        if (abstractC1608 != null) {
            return abstractC1608;
        }
        C1618 c1618 = new C1618(Thread.currentThread());
        threadLocal.set(c1618);
        return c1618;
    }
}
