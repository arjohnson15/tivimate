package p166;

import java.util.Collections;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˊﹶ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2402 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2443 f9492;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2399 f9493;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2444 f9494;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f9495;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2420 f9496;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2410 f9497;

    static {
        C2430 c2430 = new C2430();
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        Collections.emptyList();
        C3932 c39322 = C3932.f15274;
        C2407 c2407 = new C2407();
        C2420 c2420 = C2420.f9633;
        c2430.m6538();
        c2407.m6497();
        C2410 c2410 = C2410.f9547;
        ᵎˏ.ﹳˎ(0, 1, 2, 3, 4);
        AbstractC4470.m10164(5);
    }

    public C2402(String str, C2399 c2399, C2443 c2443, C2444 c2444, C2410 c2410, C2420 c2420) {
        this.f9495 = str;
        this.f9492 = c2443;
        this.f9494 = c2444;
        this.f9497 = c2410;
        this.f9493 = c2399;
        this.f9496 = c2420;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2402)) {
            return false;
        }
        C2402 c2402 = (C2402) obj;
        return AbstractC4470.m10194(this.f9495, c2402.f9495) && this.f9493.equals(c2402.f9493) && AbstractC4470.m10194(this.f9492, c2402.f9492) && this.f9494.equals(c2402.f9494) && AbstractC4470.m10194(this.f9497, c2402.f9497) && AbstractC4470.m10194(this.f9496, c2402.f9496);
    }

    public final int hashCode() {
        int iHashCode = this.f9495.hashCode() * 31;
        C2443 c2443 = this.f9492;
        int iHashCode2 = (this.f9497.hashCode() + ((this.f9493.hashCode() + ((this.f9494.hashCode() + ((iHashCode + (c2443 != null ? c2443.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f9496.getClass();
        return iHashCode2;
    }
}
