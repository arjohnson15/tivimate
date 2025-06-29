package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5455e3 {
    public static final EnumC5455e3 DOUBLE_VALUE;
    public static final EnumC5455e3 INT_VALUE;
    public static final EnumC5455e3 LONG_VALUE;
    public static final EnumC5455e3 REFERENCE;
    private static final /* synthetic */ EnumC5455e3[] a;

    static {
        EnumC5455e3 enumC5455e3 = new EnumC5455e3("REFERENCE", 0);
        REFERENCE = enumC5455e3;
        EnumC5455e3 enumC5455e32 = new EnumC5455e3("INT_VALUE", 1);
        INT_VALUE = enumC5455e32;
        EnumC5455e3 enumC5455e33 = new EnumC5455e3("LONG_VALUE", 2);
        LONG_VALUE = enumC5455e33;
        EnumC5455e3 enumC5455e34 = new EnumC5455e3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC5455e34;
        a = new EnumC5455e3[]{enumC5455e3, enumC5455e32, enumC5455e33, enumC5455e34};
    }

    public static EnumC5455e3 valueOf(String str) {
        return (EnumC5455e3) Enum.valueOf(EnumC5455e3.class, str);
    }

    public static EnumC5455e3[] values() {
        return (EnumC5455e3[]) a.clone();
    }
}
