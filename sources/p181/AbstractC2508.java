package p181;

import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0590;
import com.google.android.gms.internal.play_billing.C0594;
import com.google.android.gms.internal.play_billing.C0611;
import com.google.android.gms.internal.play_billing.C0653;
import com.google.android.gms.internal.play_billing.C0674;
import com.google.android.gms.internal.play_billing.C0676;

/* renamed from: ˋᵔ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2508 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f9979 = 0;

    static {
        int i = InterfaceC2506.f9959;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C0590 m6627(int i) {
        try {
            C0676 c0676M2554 = C0590.m2554();
            c0676M2554.m2578();
            C0590.m2553((C0590) c0676M2554.f2966, i);
            return (C0590) c0676M2554.m2577();
        } catch (Exception e) {
            AbstractC0629.m2647("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0611 m6628(int i, int i2, C2510 c2510) {
        try {
            C0594 c0594M2612 = C0611.m2612();
            C0653 c0653M2743 = C0674.m2743();
            int i3 = c2510.f9984;
            c0653M2743.m2578();
            C0674.m2740((C0674) c0653M2743.f2966, i3);
            String str = c2510.f9985;
            c0653M2743.m2578();
            C0674.m2741((C0674) c0653M2743.f2966, str);
            c0653M2743.m2578();
            C0674.m2742((C0674) c0653M2743.f2966, i);
            c0594M2612.m2578();
            C0611.m2611((C0611) c0594M2612.f2966, (C0674) c0653M2743.m2577());
            c0594M2612.m2578();
            C0611.m2613((C0611) c0594M2612.f2966, i2);
            return (C0611) c0594M2612.m2577();
        } catch (Exception e) {
            AbstractC0629.m2647("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
