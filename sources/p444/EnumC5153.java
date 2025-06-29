package p444;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ﾞˆ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC5153 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC5153 f19698;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC5153 f19699;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5153[] f19700;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC5153 f19701;

    static {
        EnumC5153 enumC5153 = new EnumC5153("NETWORK_UNMETERED", 0);
        f19701 = enumC5153;
        EnumC5153 enumC51532 = new EnumC5153("DEVICE_IDLE", 1);
        f19698 = enumC51532;
        EnumC5153 enumC51533 = new EnumC5153("DEVICE_CHARGING", 2);
        f19699 = enumC51533;
        f19700 = new EnumC5153[]{enumC5153, enumC51532, enumC51533};
    }

    public static EnumC5153 valueOf(String str) {
        return (EnumC5153) Enum.valueOf(EnumC5153.class, str);
    }

    public static EnumC5153[] values() {
        return (EnumC5153[]) f19700.clone();
    }
}
