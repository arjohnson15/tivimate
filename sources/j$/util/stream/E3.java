package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class E3 {
    public static final E3 MAYBE_MORE;
    public static final E3 NO_MORE;
    public static final E3 UNLIMITED;
    private static final /* synthetic */ E3[] a;

    static {
        E3 e3 = new E3("NO_MORE", 0);
        NO_MORE = e3;
        E3 e32 = new E3("MAYBE_MORE", 1);
        MAYBE_MORE = e32;
        E3 e33 = new E3("UNLIMITED", 2);
        UNLIMITED = e33;
        a = new E3[]{e3, e32, e33};
    }

    public static E3 valueOf(String str) {
        return (E3) Enum.valueOf(E3.class, str);
    }

    public static E3[] values() {
        return (E3[]) a.clone();
    }
}
