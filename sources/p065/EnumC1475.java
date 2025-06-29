package p065;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ʾᵔ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1475 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC1475 f6003;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1475[] f6004;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC1475 f6005;

    static {
        EnumC1475 enumC1475 = new EnumC1475("DEFERRED", 0);
        f6005 = enumC1475;
        EnumC1475 enumC14752 = new EnumC1475("IMMEDIATE", 1);
        f6003 = enumC14752;
        f6004 = new EnumC1475[]{enumC1475, enumC14752, new EnumC1475("EXCLUSIVE", 2)};
    }

    public static EnumC1475 valueOf(String str) {
        return (EnumC1475) Enum.valueOf(EnumC1475.class, str);
    }

    public static EnumC1475[] values() {
        return (EnumC1475[]) f6004.clone();
    }
}
