package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5471i {
    public static final EnumC5471i CONCURRENT;
    public static final EnumC5471i IDENTITY_FINISH;
    public static final EnumC5471i UNORDERED;
    private static final /* synthetic */ EnumC5471i[] a;

    static {
        EnumC5471i enumC5471i = new EnumC5471i("CONCURRENT", 0);
        CONCURRENT = enumC5471i;
        EnumC5471i enumC5471i2 = new EnumC5471i("UNORDERED", 1);
        UNORDERED = enumC5471i2;
        EnumC5471i enumC5471i3 = new EnumC5471i("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC5471i3;
        a = new EnumC5471i[]{enumC5471i, enumC5471i2, enumC5471i3};
    }

    public static EnumC5471i valueOf(String str) {
        return (EnumC5471i) Enum.valueOf(EnumC5471i.class, str);
    }

    public static EnumC5471i[] values() {
        return (EnumC5471i[]) a.clone();
    }
}
