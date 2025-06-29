package p155;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˊˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC2332 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC2332 f9247;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC2332 f9248;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2332[] f9249;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC2332 f9250;

    static {
        EnumC2332 enumC2332 = new EnumC2332("COROUTINE_SUSPENDED", 0);
        f9250 = enumC2332;
        EnumC2332 enumC23322 = new EnumC2332("UNDECIDED", 1);
        f9247 = enumC23322;
        EnumC2332 enumC23323 = new EnumC2332("RESUMED", 2);
        f9248 = enumC23323;
        f9249 = new EnumC2332[]{enumC2332, enumC23322, enumC23323};
    }

    public static EnumC2332 valueOf(String str) {
        return (EnumC2332) Enum.valueOf(EnumC2332.class, str);
    }

    public static EnumC2332[] values() {
        return (EnumC2332[]) f9249.clone();
    }
}
