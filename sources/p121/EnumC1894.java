package p121;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˈˑ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1894 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1894[] f7196;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final SparseArray f7197;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1894 EF5;

    static {
        EnumC1894 enumC1894 = new EnumC1894("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC1894 enumC18942 = new EnumC1894("GPRS", 1);
        EnumC1894 enumC18943 = new EnumC1894("EDGE", 2);
        EnumC1894 enumC18944 = new EnumC1894("UMTS", 3);
        EnumC1894 enumC18945 = new EnumC1894("CDMA", 4);
        EnumC1894 enumC18946 = new EnumC1894("EVDO_0", 5);
        EnumC1894 enumC18947 = new EnumC1894("EVDO_A", 6);
        EnumC1894 enumC18948 = new EnumC1894("RTT", 7);
        EnumC1894 enumC18949 = new EnumC1894("HSDPA", 8);
        EnumC1894 enumC189410 = new EnumC1894("HSUPA", 9);
        EnumC1894 enumC189411 = new EnumC1894("HSPA", 10);
        EnumC1894 enumC189412 = new EnumC1894("IDEN", 11);
        EnumC1894 enumC189413 = new EnumC1894("EVDO_B", 12);
        EnumC1894 enumC189414 = new EnumC1894("LTE", 13);
        EnumC1894 enumC189415 = new EnumC1894("EHRPD", 14);
        EnumC1894 enumC189416 = new EnumC1894("HSPAP", 15);
        EnumC1894 enumC189417 = new EnumC1894("GSM", 16);
        EnumC1894 enumC189418 = new EnumC1894("TD_SCDMA", 17);
        EnumC1894 enumC189419 = new EnumC1894("IWLAN", 18);
        EnumC1894 enumC189420 = new EnumC1894("LTE_CA", 19);
        f7196 = new EnumC1894[]{enumC1894, enumC18942, enumC18943, enumC18944, enumC18945, enumC18946, enumC18947, enumC18948, enumC18949, enumC189410, enumC189411, enumC189412, enumC189413, enumC189414, enumC189415, enumC189416, enumC189417, enumC189418, enumC189419, enumC189420, new EnumC1894("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f7197 = sparseArray;
        sparseArray.put(0, enumC1894);
        sparseArray.put(1, enumC18942);
        sparseArray.put(2, enumC18943);
        sparseArray.put(3, enumC18944);
        sparseArray.put(4, enumC18945);
        sparseArray.put(5, enumC18946);
        sparseArray.put(6, enumC18947);
        sparseArray.put(7, enumC18948);
        sparseArray.put(8, enumC18949);
        sparseArray.put(9, enumC189410);
        sparseArray.put(10, enumC189411);
        sparseArray.put(11, enumC189412);
        sparseArray.put(12, enumC189413);
        sparseArray.put(13, enumC189414);
        sparseArray.put(14, enumC189415);
        sparseArray.put(15, enumC189416);
        sparseArray.put(16, enumC189417);
        sparseArray.put(17, enumC189418);
        sparseArray.put(18, enumC189419);
        sparseArray.put(19, enumC189420);
    }

    public static EnumC1894 valueOf(String str) {
        return (EnumC1894) Enum.valueOf(EnumC1894.class, str);
    }

    public static EnumC1894[] values() {
        return (EnumC1894[]) f7196.clone();
    }
}
