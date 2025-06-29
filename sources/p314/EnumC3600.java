package p314;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ᐧᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC3600 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC3600 f13816;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC3600 f13817;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3600[] f13818;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC3600 f13819;

    static {
        EnumC3600 enumC3600 = new EnumC3600("PREFER_ARGB_8888", 0);
        f13819 = enumC3600;
        EnumC3600 enumC36002 = new EnumC3600("PREFER_RGB_565", 1);
        f13816 = enumC36002;
        f13818 = new EnumC3600[]{enumC3600, enumC36002};
        f13817 = enumC3600;
    }

    public static EnumC3600 valueOf(String str) {
        return (EnumC3600) Enum.valueOf(EnumC3600.class, str);
    }

    public static EnumC3600[] values() {
        return (EnumC3600[]) f13818.clone();
    }
}
