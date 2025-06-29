package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC5445c3 {
    public static final EnumC5445c3 OP;
    public static final EnumC5445c3 SPLITERATOR;
    public static final EnumC5445c3 STREAM;
    public static final EnumC5445c3 TERMINAL_OP;
    public static final EnumC5445c3 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ EnumC5445c3[] a;

    static {
        EnumC5445c3 enumC5445c3 = new EnumC5445c3("SPLITERATOR", 0);
        SPLITERATOR = enumC5445c3;
        EnumC5445c3 enumC5445c32 = new EnumC5445c3("STREAM", 1);
        STREAM = enumC5445c32;
        EnumC5445c3 enumC5445c33 = new EnumC5445c3("OP", 2);
        OP = enumC5445c33;
        EnumC5445c3 enumC5445c34 = new EnumC5445c3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC5445c34;
        EnumC5445c3 enumC5445c35 = new EnumC5445c3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC5445c35;
        a = new EnumC5445c3[]{enumC5445c3, enumC5445c32, enumC5445c33, enumC5445c34, enumC5445c35};
    }

    public static EnumC5445c3 valueOf(String str) {
        return (EnumC5445c3) Enum.valueOf(EnumC5445c3.class, str);
    }

    public static EnumC5445c3[] values() {
        return (EnumC5445c3[]) a.clone();
    }
}
