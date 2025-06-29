package p314;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ᐧᵢ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC3604 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3604[] f13825;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC3604 f13826;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3604 EF2;

    static {
        EnumC3604 enumC3604 = new EnumC3604("SRGB", 0);
        EnumC3604 enumC36042 = new EnumC3604("DISPLAY_P3", 1);
        f13826 = enumC36042;
        f13825 = new EnumC3604[]{enumC3604, enumC36042};
    }

    public static EnumC3604 valueOf(String str) {
        return (EnumC3604) Enum.valueOf(EnumC3604.class, str);
    }

    public static EnumC3604[] values() {
        return (EnumC3604[]) f13825.clone();
    }
}
