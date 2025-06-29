package p181;

import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0648;
import com.google.android.gms.internal.play_billing.EnumC0639;

/* renamed from: ˋᵔ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2510 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f9984;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f9985;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9986;

    public /* synthetic */ C2510(int i) {
        this.f9986 = i;
    }

    public C2510(int i, String str) {
        this.f9986 = 2;
        this.f9984 = i;
        this.f9985 = str;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2510 m6629() {
        C2510 c2510 = new C2510(0);
        c2510.f9985 = "";
        return c2510;
    }

    public String toString() {
        switch (this.f9986) {
            case 1:
                int i = this.f9984;
                int i2 = AbstractC0629.f3002;
                C0648 c0648 = EnumC0639.f3018;
                Integer numValueOf = Integer.valueOf(i);
                return "Response Code: " + (!c0648.containsKey(numValueOf) ? EnumC0639.f3017 : (EnumC0639) c0648.get(numValueOf)).toString() + ", Debug Message: " + this.f9985;
            default:
                return super.toString();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2510 m6630() {
        C2510 c2510 = new C2510(1);
        c2510.f9984 = this.f9984;
        c2510.f9985 = this.f9985;
        return c2510;
    }
}
