package p121;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˈˑ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1885 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1885[] f7178;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC1885 f7179;

    static {
        EnumC1885 enumC1885 = new EnumC1885("DEFAULT", 0);
        f7179 = enumC1885;
        EnumC1885 enumC18852 = new EnumC1885("UNMETERED_ONLY", 1);
        EnumC1885 enumC18853 = new EnumC1885("UNMETERED_OR_DAILY", 2);
        EnumC1885 enumC18854 = new EnumC1885("FAST_IF_RADIO_AWAKE", 3);
        EnumC1885 enumC18855 = new EnumC1885("NEVER", 4);
        EnumC1885 enumC18856 = new EnumC1885("UNRECOGNIZED", 5);
        f7178 = new EnumC1885[]{enumC1885, enumC18852, enumC18853, enumC18854, enumC18855, enumC18856};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC1885);
        sparseArray.put(1, enumC18852);
        sparseArray.put(2, enumC18853);
        sparseArray.put(3, enumC18854);
        sparseArray.put(4, enumC18855);
        sparseArray.put(-1, enumC18856);
    }

    public static EnumC1885 valueOf(String str) {
        return (EnumC1885) Enum.valueOf(EnumC1885.class, str);
    }

    public static EnumC1885[] values() {
        return (EnumC1885[]) f7178.clone();
    }
}
