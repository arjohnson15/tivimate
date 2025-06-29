package p295;

import ar.tvplayer.core.data.api.stalker.Stalker$Params;
import ar.tvplayer.core.data.api.stalker.VodCategory;
import ar.tvplayer.core.data.api.stalker.VodItemsResponseJs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013.AbstractC1041;
import p013.C1034;
import p013.C1053;
import p070.AbstractC1549;
import p317.AbstractC3616;
import ˈי.ʾˈ;
import ᵎﹳ.ˑʽ;
import ᵎﹳ.ـﹶ;

/* renamed from: ٴⁱ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3484 implements ـﹶ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f13445;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Integer f13446;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f13447;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f13448;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f13449;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f13450;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Long f13451;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f13452;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public List f13453;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ArrayList f13454;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ˑʽ f13455;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object f13456;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    public C3484(String str, String str2, Long l, ˑʽ r4, Integer num, List list, ArrayList arrayList, Map map, Map map2) {
        this.f13452 = str;
        this.f13445 = str2;
        this.f13451 = l;
        this.f13455 = r4;
        this.f13446 = num;
        this.f13453 = list;
        this.f13454 = arrayList;
        this.f13450 = map;
        this.f13456 = map2;
        this.f13447 = arrayList.size();
        Integer numM8360 = m8360(this.f13450, true);
        this.f13449 = numM8360 != null ? numM8360.intValue() : 0;
        Integer numM83602 = m8360(this.f13450, false);
        this.f13448 = (numM83602 == null && (numM83602 = m8360(this.f13456, false)) == null) ? 0 : numM83602.intValue();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static Integer m8360(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            VodCategory vodCategory = (VodCategory) entry.getKey();
            Map map2 = (Map) entry.getValue();
            if ((z && vodCategory.m1404()) || (!z && vodCategory.m1403())) {
                VodItemsResponseJs vodItemsResponseJs = (VodItemsResponseJs) AbstractC1041.m4025(map2.values());
                if (vodItemsResponseJs != null) {
                    return Integer.valueOf(vodItemsResponseJs.f2038);
                }
                return null;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3484)) {
            return false;
        }
        C3484 c3484 = (C3484) obj;
        return AbstractC1549.m5138(this.f13452, c3484.f13452) && AbstractC1549.m5138(this.f13445, c3484.f13445) && AbstractC1549.m5138(this.f13451, c3484.f13451) && this.f13455 == c3484.f13455 && this.f13446.equals(c3484.f13446) && this.f13453.equals(c3484.f13453) && this.f13454.equals(c3484.f13454) && this.f13450.equals(c3484.f13450) && this.f13456.equals(c3484.f13456);
    }

    public final int hashCode() {
        int iHashCode = this.f13452.hashCode() * 31;
        String str = this.f13445;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f13451;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        ˑʽ r2 = this.f13455;
        return this.f13456.hashCode() + ((this.f13450.hashCode() + ((this.f13454.hashCode() + ((this.f13453.hashCode() + ((this.f13446.hashCode() + ((iHashCode3 + (r2 != null ? r2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StalkerPlaylist(playlistUrl=" + this.f13452 + ", token=" + this.f13445 + ", expirationDate=" + this.f13451 + ", catchupType=" + this.f13455 + ", catchupHours=" + this.f13446 + ", genres=" + this.f13453 + ", channels=" + this.f13454 + ", vodCategoriesInfo=" + this.f13450 + ", seriesCategoriesInfo=" + this.f13456 + ')';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m8361(boolean z) {
        return ʾˈ.ˉⁱ(this, z);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8362() {
        this.f13456 = C1034.f4436;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final String m8363() {
        return this.f13445;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8364(boolean z) {
        this.f13450 = C1034.f4436;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m8365() {
        return this.f13448;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m8366(String str) {
        String strM1397;
        Stalker$Params stalker$Params = ˏᴵ.ʽᐧ(this.f13452, 0L);
        if (stalker$Params == null || (strM1397 = stalker$Params.m1397()) == null) {
            return "";
        }
        int iM8540 = AbstractC3616.m8540(strM1397, "//", 0, false, 6);
        return iM8540 != -1 ? strM1397.substring(iM8540 + 2) : strM1397;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m8367(boolean z) {
        return this.f13449;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8368(boolean z) {
        this.f13453 = C1053.f4449;
        this.f13454 = new ArrayList();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m8369() {
        return this.f13452;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int m8370(boolean z) {
        return this.f13447;
    }
}
