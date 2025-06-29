package p121;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˈˑ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1896 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1896[] f7204;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC1896 f7205;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1896 EF2;

    static {
        EnumC1896 enumC1896 = new EnumC1896("NOT_SET", 0);
        EnumC1896 enumC18962 = new EnumC1896("EVENT_OVERRIDE", 1);
        f7205 = enumC18962;
        f7204 = new EnumC1896[]{enumC1896, enumC18962};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC1896);
        sparseArray.put(5, enumC18962);
    }

    public static EnumC1896 valueOf(String str) {
        return (EnumC1896) Enum.valueOf(EnumC1896.class, str);
    }

    public static EnumC1896[] values() {
        return (EnumC1896[]) f7204.clone();
    }
}
