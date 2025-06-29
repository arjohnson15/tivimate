package p121;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ˈˑ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC1898 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1898[] f7209;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final SparseArray f7210;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1898 EF3;

    static {
        EnumC1898 enumC1898 = new EnumC1898("MOBILE", 0);
        EnumC1898 enumC18982 = new EnumC1898("WIFI", 1);
        EnumC1898 enumC18983 = new EnumC1898("MOBILE_MMS", 2);
        EnumC1898 enumC18984 = new EnumC1898("MOBILE_SUPL", 3);
        EnumC1898 enumC18985 = new EnumC1898("MOBILE_DUN", 4);
        EnumC1898 enumC18986 = new EnumC1898("MOBILE_HIPRI", 5);
        EnumC1898 enumC18987 = new EnumC1898("WIMAX", 6);
        EnumC1898 enumC18988 = new EnumC1898("BLUETOOTH", 7);
        EnumC1898 enumC18989 = new EnumC1898("DUMMY", 8);
        EnumC1898 enumC189810 = new EnumC1898("ETHERNET", 9);
        EnumC1898 enumC189811 = new EnumC1898("MOBILE_FOTA", 10);
        EnumC1898 enumC189812 = new EnumC1898("MOBILE_IMS", 11);
        EnumC1898 enumC189813 = new EnumC1898("MOBILE_CBS", 12);
        EnumC1898 enumC189814 = new EnumC1898("WIFI_P2P", 13);
        EnumC1898 enumC189815 = new EnumC1898("MOBILE_IA", 14);
        EnumC1898 enumC189816 = new EnumC1898("MOBILE_EMERGENCY", 15);
        EnumC1898 enumC189817 = new EnumC1898("PROXY", 16);
        EnumC1898 enumC189818 = new EnumC1898("VPN", 17);
        EnumC1898 enumC189819 = new EnumC1898("NONE", 18);
        f7209 = new EnumC1898[]{enumC1898, enumC18982, enumC18983, enumC18984, enumC18985, enumC18986, enumC18987, enumC18988, enumC18989, enumC189810, enumC189811, enumC189812, enumC189813, enumC189814, enumC189815, enumC189816, enumC189817, enumC189818, enumC189819};
        SparseArray sparseArray = new SparseArray();
        f7210 = sparseArray;
        sparseArray.put(0, enumC1898);
        sparseArray.put(1, enumC18982);
        sparseArray.put(2, enumC18983);
        sparseArray.put(3, enumC18984);
        sparseArray.put(4, enumC18985);
        sparseArray.put(5, enumC18986);
        sparseArray.put(6, enumC18987);
        sparseArray.put(7, enumC18988);
        sparseArray.put(8, enumC18989);
        sparseArray.put(9, enumC189810);
        sparseArray.put(10, enumC189811);
        sparseArray.put(11, enumC189812);
        sparseArray.put(12, enumC189813);
        sparseArray.put(13, enumC189814);
        sparseArray.put(14, enumC189815);
        sparseArray.put(15, enumC189816);
        sparseArray.put(16, enumC189817);
        sparseArray.put(17, enumC189818);
        sparseArray.put(-1, enumC189819);
    }

    public static EnumC1898 valueOf(String str) {
        return (EnumC1898) Enum.valueOf(EnumC1898.class, str);
    }

    public static EnumC1898[] values() {
        return (EnumC1898[]) f7209.clone();
    }
}
