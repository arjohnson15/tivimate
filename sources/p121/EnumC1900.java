package p121;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˈˑ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1900 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1900[] f7221;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC1900 f7222;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1900 EF2;

    static {
        EnumC1900 enumC1900 = new EnumC1900("UNKNOWN", 0);
        EnumC1900 enumC19002 = new EnumC1900("ANDROID_FIREBASE", 1);
        f7222 = enumC19002;
        f7221 = new EnumC1900[]{enumC1900, enumC19002};
    }

    public static EnumC1900 valueOf(String str) {
        return (EnumC1900) Enum.valueOf(EnumC1900.class, str);
    }

    public static EnumC1900[] values() {
        return (EnumC1900[]) f7221.clone();
    }
}
