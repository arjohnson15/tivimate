package p166;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import androidx.leanback.widget.ʿˏ;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0607;
import p033.C1219;
import p072.AbstractC1642;
import p096.C1765;
import p181.C2510;
import p183.C2534;
import p183.EnumC2533;
import p186.C2603;
import p243.C3111;
import p261.InterfaceC3251;
import p334.C3789;
import p338.InterfaceC3865;
import p369.C4195;
import p369.InterfaceC4184;
import p383.AbstractC4464;
import ˈʼ.ﹳﹳ;

/* renamed from: ˊﹶ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2428 implements InterfaceC4184 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f9649;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f9650;

    public C2428(int i) {
        switch (i) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f9649 = new Handler(Looper.getMainLooper(), new C1765(1));
                break;
            default:
                this.f9649 = new SparseBooleanArray();
                break;
        }
    }

    public /* synthetic */ C2428(Object obj, boolean z) {
        this.f9649 = obj;
        this.f9650 = z;
    }

    public C2428(C3111 c3111, boolean z) {
        this.f9649 = c3111;
        this.f9650 = z;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m6528(int i) {
        AbstractC4464.m10132(!this.f9650);
        ((SparseBooleanArray) this.f9649).append(i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6529(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L44
            if (r8 < 0) goto L44
            int r1 = r7.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.f9649
            ˑﾞ.ٴˎ r1 = (p243.C3111) r1
            if (r1 != 0) goto L17
            boolean r7 = r6.m6535()
            return r7
        L17:
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 2
        L1b:
            if (r3 >= r8) goto L39
            if (r4 != r2) goto L39
            char r4 = r7.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            ˊﹶ.ᴵʿ r5 = p243.AbstractC3112.f12004
            if (r4 == 0) goto L36
            if (r4 == r0) goto L34
            if (r4 == r2) goto L34
            switch(r4) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r4 = 2
            goto L37
        L34:
            r4 = 0
            goto L37
        L36:
            r4 = 1
        L37:
            int r3 = r3 + r0
            goto L1b
        L39:
            if (r4 == 0) goto L43
            if (r4 == r0) goto L42
            boolean r0 = r6.m6535()
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p166.C2428.m6529(java.lang.CharSequence, int):boolean");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m6530(C0607 c0607) {
        if (this.f9650) {
            AbstractC0629.m2646("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((ʿˏ) this.f9649).ˎٴ(new C2534(c0607, EnumC2533.f10073), new C1219(8));
        } catch (Throwable unused) {
            AbstractC0629.m2646("BillingLogger", "logging failed.");
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2414 m6531() {
        AbstractC4464.m10132(!this.f9650);
        this.f9650 = true;
        return new C2414((SparseBooleanArray) this.f9649);
    }

    @Override // p369.InterfaceC4184
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo6532(C4195 c4195, int i) {
        boolean z = this.f9650;
        StringBuilder sb = (StringBuilder) this.f9649;
        if (z) {
            this.f9650 = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m6533(C2510 c2510) {
        AbstractC1642.m5294(ﹳﹳ.ʽᐧ(), null, 0, new C2603(c2510, (InterfaceC3865) this.f9649, this.f9650, null), 3);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public synchronized void m6534(InterfaceC3251 interfaceC3251, boolean z) {
        try {
            if (this.f9650 || z) {
                ((Handler) this.f9649).obtainMessage(1, interfaceC3251).sendToTarget();
            } else {
                this.f9650 = true;
                interfaceC3251.mo4602();
                this.f9650 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean m6535() {
        return this.f9650;
    }
}
