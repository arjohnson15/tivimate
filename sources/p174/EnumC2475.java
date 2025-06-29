package p174;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˋˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC2475 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC2475 f9828;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2475[] f9829;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC2475 f9830;

    static {
        EnumC2475 enumC2475 = new EnumC2475("CRASHLYTICS", 0);
        f9830 = enumC2475;
        EnumC2475 enumC24752 = new EnumC2475("PERFORMANCE", 1);
        f9828 = enumC24752;
        f9829 = new EnumC2475[]{enumC2475, enumC24752, new EnumC2475("MATT_SAYS_HI", 2)};
    }

    public static EnumC2475 valueOf(String str) {
        return (EnumC2475) Enum.valueOf(EnumC2475.class, str);
    }

    public static EnumC2475[] values() {
        return (EnumC2475[]) f9829.clone();
    }
}
