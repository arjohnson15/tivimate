package p183;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˋﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC2533 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC2533 f10070;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC2533 f10071;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2533[] f10072;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC2533 f10073;

    static {
        EnumC2533 enumC2533 = new EnumC2533("DEFAULT", 0);
        f10073 = enumC2533;
        EnumC2533 enumC25332 = new EnumC2533("VERY_LOW", 1);
        f10070 = enumC25332;
        EnumC2533 enumC25333 = new EnumC2533("HIGHEST", 2);
        f10071 = enumC25333;
        f10072 = new EnumC2533[]{enumC2533, enumC25332, enumC25333};
    }

    public static EnumC2533 valueOf(String str) {
        return (EnumC2533) Enum.valueOf(EnumC2533.class, str);
    }

    public static EnumC2533[] values() {
        return (EnumC2533[]) f10072.clone();
    }
}
