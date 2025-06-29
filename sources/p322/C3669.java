package p322;

import android.content.Context;
import android.os.Bundle;
import com.bumptech.glide.ˑʽ;
import p147.InterfaceC2254;
import p164.InterfaceC2379;
import p210.C2804;
import p266.C3262;
import p330.InterfaceC3747;
import p334.C3781;
import p429.AbstractC4983;
import p429.C4945;
import p429.C4950;
import ˊﹶ.ˋˉ;

/* renamed from: ᴵˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3669 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3673 f14070 = new C3673();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3781 f14071 = ˑʽ.ʿˏ(AbstractC4983.f18821, new ˋˉ(C3677.f14096));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3679 f14072;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˋˉ f14073;

    public C3669(C2804 c2804, InterfaceC3747 interfaceC3747, InterfaceC3747 interfaceC37472, InterfaceC2254 interfaceC2254) {
        c2804.m7085();
        C4950 c4950 = C4950.f18725;
        C4945 c4945M11070 = C4950.m11070(c2804);
        Context context = c2804.f10936;
        ˋˉ r0 = new ˋˉ(context);
        C3262 c3262 = new C3262();
        c3262.f12726 = c4945M11070;
        c3262.f12724 = interfaceC3747;
        c3262.f12725 = "example.qtq";
        f14070.getClass();
        C3679 c3679 = new C3679(interfaceC2254, c4945M11070, c3262, (InterfaceC2379) f14071.m8860(context, C3673.f14084[0]));
        this.f14073 = r0;
        this.f14072 = c3679;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8624(p185.AbstractC2562 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p322.C3680
            if (r0 == 0) goto L13
            r0 = r7
            ᴵˉ.ﹶˆ r0 = (p322.C3680) r0
            int r1 = r0.f14111
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14111 = r1
            goto L18
        L13:
            ᴵˉ.ﹶˆ r0 = new ᴵˉ.ﹶˆ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14108
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f14111
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            ᴵˉ.ˉי r2 = r0.f14109
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L4a
        L3a:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            r0.f14109 = r6
            r0.f14111 = r5
            ˊﹶ.ˋˉ r7 = r6.f14073
            r7.getClass()
            if (r3 != r1) goto L49
            return r1
        L49:
            r2 = r6
        L4a:
            ᴵˉ.ﹳﹳ r7 = r2.f14072
            r2 = 0
            r0.f14109 = r2
            r0.f14111 = r4
            java.lang.Object r7 = r7.m8629(r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p322.C3669.m8624(ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final double m8625() {
        Bundle bundle = (Bundle) this.f14073.ˆʿ;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        C3676 c3676 = this.f14072.m8628().f14102;
        if (c3676 == null) {
            c3676 = null;
        }
        Double d = c3676.f14091;
        if (d != null) {
            double dDoubleValue2 = d.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }
}
