package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Program {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1907;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Long f1908;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1909;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Long f1910;

    public Program(@InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "descr") String str2, @InterfaceC5065(name = "start_timestamp") Long l, @InterfaceC5065(name = "stop_timestamp") Long l2) {
        this.f1909 = str;
        this.f1907 = str2;
        this.f1908 = l;
        this.f1910 = l2;
    }

    public final Program copy(@InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "descr") String str2, @InterfaceC5065(name = "start_timestamp") Long l, @InterfaceC5065(name = "stop_timestamp") Long l2) {
        return new Program(str, str2, l, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Program)) {
            return false;
        }
        Program program = (Program) obj;
        return AbstractC1549.m5138(this.f1909, program.f1909) && AbstractC1549.m5138(this.f1907, program.f1907) && AbstractC1549.m5138(this.f1908, program.f1908) && AbstractC1549.m5138(this.f1910, program.f1910);
    }

    public final int hashCode() {
        String str = this.f1909;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1907;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f1908;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f1910;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Program(name=");
        sb.append(this.f1909);
        sb.append(", desc=");
        sb.append(this.f1907);
        sb.append(", startSeconds=");
        sb.append(this.f1908);
        sb.append(", stopSeconds=");
        return ˉᵎ.ˏᴵ(sb, this.f1910, ')');
    }
}
