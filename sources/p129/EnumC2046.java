package p129;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˈﹶ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC2046 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC2046 f7762;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2046[] f7763;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static String f7764;

    /* renamed from: ᐧⁱ, reason: contains not printable characters and collision with other field name */
    public static final EnumC2046 f7765;

    static {
        EnumC2046 enumC2046 = new EnumC2046("Synchronously", 0);
        f7765 = enumC2046;
        EnumC2046 enumC20462 = new EnumC2046("Asynchronously", 1);
        f7762 = enumC20462;
        f7763 = new EnumC2046[]{enumC2046, enumC20462};
    }

    public static EnumC2046 valueOf(String str) {
        return (EnumC2046) Enum.valueOf(EnumC2046.class, str);
    }

    public static EnumC2046[] values() {
        return (EnumC2046[]) f7763.clone();
    }
}
