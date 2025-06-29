package p065;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ʾᵔ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1532 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC1532 f6226;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC1532 f6227;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1532[] f6228;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC1532 f6229;

    static {
        EnumC1532 enumC1532 = new EnumC1532("NO_OP", 0);
        f6229 = enumC1532;
        EnumC1532 enumC15322 = new EnumC1532("ADD", 1);
        f6226 = enumC15322;
        EnumC1532 enumC15323 = new EnumC1532("REMOVE", 2);
        f6227 = enumC15323;
        f6228 = new EnumC1532[]{enumC1532, enumC15322, enumC15323};
    }

    public static EnumC1532 valueOf(String str) {
        return (EnumC1532) Enum.valueOf(EnumC1532.class, str);
    }

    public static EnumC1532[] values() {
        return (EnumC1532[]) f6228.clone();
    }
}
