package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class F {
    public static final F LENIENT;
    public static final F SMART;
    public static final F STRICT;
    private static final /* synthetic */ F[] a;

    static {
        F f = new F("STRICT", 0);
        STRICT = f;
        F f2 = new F("SMART", 1);
        SMART = f2;
        F f3 = new F("LENIENT", 2);
        LENIENT = f3;
        a = new F[]{f, f2, f3};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) a.clone();
    }
}
