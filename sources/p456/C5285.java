package p456;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* renamed from: ﾞⁱ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5285 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C5285 f20499 = new C5285((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f20500;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final EnumMap f20501;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Boolean f20502;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f20503;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f20504;

    public C5285(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        this.f20501 = enumMap;
        enumMap.put((EnumMap) EnumC5341.f20712, (EnumC5341) (bool == null ? EnumC5288.f20519 : bool.booleanValue() ? EnumC5288.f20520 : EnumC5288.f20522));
        this.f20503 = i;
        this.f20500 = m11865();
        this.f20502 = bool2;
        this.f20504 = str;
    }

    public C5285(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC5341.class);
        this.f20501 = enumMap2;
        enumMap2.putAll(enumMap);
        this.f20503 = i;
        this.f20500 = m11865();
        this.f20502 = bool;
        this.f20504 = str;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C5285 m11862(int i, Bundle bundle) {
        if (bundle == null) {
            return new C5285((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        for (EnumC5341 enumC5341 : EnumC5230.DMA.f20035) {
            enumMap.put((EnumMap) enumC5341, (EnumC5341) C5356.m12141(bundle.getString(enumC5341.f20714)));
        }
        return new C5285(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C5285 m11863(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f20499;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC5341.class);
        EnumC5341[] enumC5341Arr = EnumC5230.DMA.f20035;
        int length = enumC5341Arr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) enumC5341Arr[i3], (EnumC5341) C5356.m12138(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C5285(enumMap, i, (Boolean) null, (String) null);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Boolean m11864(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = AbstractC5315.f20609[C5356.m12141(bundle.getString("ad_personalization")).ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5285)) {
            return false;
        }
        C5285 c5285 = (C5285) obj;
        if (this.f20500.equalsIgnoreCase(c5285.f20500) && Objects.equals(this.f20502, c5285.f20502)) {
            return Objects.equals(this.f20504, c5285.f20504);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f20502;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f20504;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i * 29) + this.f20500.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C5356.m12135(this.f20503));
        for (EnumC5341 enumC5341 : EnumC5230.DMA.f20035) {
            sb.append(",");
            sb.append(enumC5341.f20714);
            sb.append("=");
            EnumC5288 enumC5288 = (EnumC5288) this.f20501.get(enumC5341);
            if (enumC5288 == null) {
                sb.append("uninitialized");
            } else {
                int i = AbstractC5315.f20609[enumC5288.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f20502;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f20504;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String m11865() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20503);
        for (EnumC5341 enumC5341 : EnumC5230.DMA.f20035) {
            sb.append(":");
            sb.append(C5356.m12139((EnumC5288) this.f20501.get(enumC5341)));
        }
        return sb.toString();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final EnumC5288 m11866() {
        EnumC5288 enumC5288 = (EnumC5288) this.f20501.get(EnumC5341.f20712);
        return enumC5288 == null ? EnumC5288.f20519 : enumC5288;
    }
}
