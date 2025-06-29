package p302;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ᐧʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC3509 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3509[] f13612;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC3509 f13613;

    static {
        EnumC3509 enumC3509 = new EnumC3509("DEFAULT", 0);
        f13613 = enumC3509;
        f13612 = new EnumC3509[]{enumC3509, new EnumC3509("SIGNED", 1), new EnumC3509("FIXED", 2)};
    }

    public static EnumC3509 valueOf(String str) {
        return (EnumC3509) Enum.valueOf(EnumC3509.class, str);
    }

    public static EnumC3509[] values() {
        return (EnumC3509[]) f13612.clone();
    }
}
