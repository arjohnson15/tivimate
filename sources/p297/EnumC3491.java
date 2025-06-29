package p297;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ٴﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC3491 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC3491 f13485;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final EnumC3491 f13486;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC3491 f13487;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC3491 f13488;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC3491 f13489;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3491[] f13490;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3491 EF9;

    static {
        EnumC3491 enumC3491 = new EnumC3491("PENALTY_LOG", 0);
        EnumC3491 enumC34912 = new EnumC3491("PENALTY_DEATH", 1);
        EnumC3491 enumC34913 = new EnumC3491("DETECT_FRAGMENT_REUSE", 2);
        f13489 = enumC34913;
        EnumC3491 enumC34914 = new EnumC3491("DETECT_FRAGMENT_TAG_USAGE", 3);
        f13485 = enumC34914;
        EnumC3491 enumC34915 = new EnumC3491("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f13487 = enumC34915;
        EnumC3491 enumC34916 = new EnumC3491("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC3491 enumC34917 = new EnumC3491("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC3491 enumC34918 = new EnumC3491("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f13488 = enumC34918;
        EnumC3491 enumC34919 = new EnumC3491("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f13486 = enumC34919;
        f13490 = new EnumC3491[]{enumC3491, enumC34912, enumC34913, enumC34914, enumC34915, enumC34916, enumC34917, enumC34918, enumC34919};
    }

    public static EnumC3491 valueOf(String str) {
        return (EnumC3491) Enum.valueOf(EnumC3491.class, str);
    }

    public static EnumC3491[] values() {
        return (EnumC3491[]) f13490.clone();
    }
}
