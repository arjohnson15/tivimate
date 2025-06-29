package p249;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import p166.C2400;
import p166.C2401;
import p166.C2410;
import p166.C2431;
import p166.InterfaceC2425;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p392.C4520;
import p438.AbstractC5115;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;
import p456.C5349;
import ˈⁱ.ˉⁱ;
import ᴵˎ.ˎˋ;
import ᵎﹳ.ᐧʻ;

/* renamed from: יˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3123 extends AbstractC5115 implements Handler.Callback {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C3124 f12067;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public long f12068;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public C2401 f12069;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public ˉⁱ f12070;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f12071;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f12072;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final Handler f12073;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC5075 f12074;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public long f12075;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final C4520 f12076;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3123(SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075, Looper looper) {
        super(5);
        C3124 c3124 = C3124.f12077;
        this.f12074 = surfaceHolderCallbackC5075;
        this.f12073 = looper == null ? null : new Handler(looper, this);
        this.f12067 = c3124;
        this.f12076 = new C4520();
        this.f12075 = -9223372036854775807L;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m7671((C2401) message.obj);
        return true;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ʿˏ */
    public final void mo1115(C2431[] c2431Arr, long j, long j2) {
        this.f12070 = this.f12067.m7673(c2431Arr[0]);
        C2401 c2401 = this.f12069;
        if (c2401 != null) {
            long j3 = this.f12075;
            long j4 = c2401.f9490;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                c2401 = new C2401(j5, c2401.f9491);
            }
            this.f12069 = c2401;
        }
        this.f12075 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7669(p166.C2401 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            ˊﹶ.ᐧˋ[] r1 = r6.f9491
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            ˊﹶ.ᵎـ r2 = r2.mo3977()
            if (r2 == 0) goto L3e
            יˊ.ـﹶ r3 = r5.f12067
            boolean r4 = r3.m7672(r2)
            if (r4 == 0) goto L3e
            ˈⁱ.ˉⁱ r2 = r3.m7673(r2)
            r1 = r1[r0]
            byte[] r1 = r1.mo3978()
            r1.getClass()
            ⁱˏ.ـﹶ r3 = r5.f12076
            r3.mo8492()
            int r4 = r1.length
            r3.m8491(r4)
            java.nio.ByteBuffer r4 = r3.f13800
            r4.put(r1)
            r3.m8494()
            ˊﹶ.ˆᵔ r1 = r2.ﹶˆ(r3)
            if (r1 == 0) goto L43
            r5.m7669(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p249.C3123.m7669(ˊﹶ.ˆᵔ, java.util.ArrayList):void");
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˈٴ */
    public final int mo1118(C2431 c2431) {
        if (this.f12067.m7672(c2431)) {
            return ᐧʻ.ˑʽ(c2431.f9676 == 0 ? 4 : 2, 0, 0, 0);
        }
        return ᐧʻ.ˑʽ(0, 0, 0, 0);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public final boolean mo1119() {
        return true;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long m7670(long j) {
        AbstractC4464.m10132(j != -9223372036854775807L);
        AbstractC4464.m10132(this.f12075 != -9223372036854775807L);
        return j - this.f12075;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ */
    public final boolean mo1122() {
        return this.f12072;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˑי */
    public final void mo1126(boolean z, long j) {
        this.f12069 = null;
        this.f12071 = false;
        this.f12072 = false;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m7671(C2401 c2401) {
        SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075 = this.f12074;
        C5118 c5118 = surfaceHolderCallbackC5075.f19247;
        C2400 c2400M6498 = c5118.f19547.m6498();
        int i = 0;
        while (true) {
            InterfaceC2425[] interfaceC2425Arr = c2401.f9491;
            if (i >= interfaceC2425Arr.length) {
                break;
            }
            interfaceC2425Arr[i].mo3979(c2400M6498);
            i++;
        }
        c5118.f19547 = new C2410(c2400M6498);
        C2410 c2410M11384 = c5118.m11384();
        boolean zEquals = c2410M11384.equals(c5118.f19574);
        ˎˋ r4 = c5118.f19524;
        if (!zEquals) {
            c5118.f19574 = c2410M11384;
            r4.ﹳﹳ(14, new C4125(17, surfaceHolderCallbackC5075));
        }
        r4.ﹳﹳ(28, new C4125(18, c2401));
        r4.ˑʽ();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public final void mo1131() {
        this.f12069 = null;
        this.f12070 = null;
        this.f12075 = -9223372036854775807L;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ */
    public final String mo1137() {
        return "MetadataRenderer";
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﾞˊ */
    public final void mo1138(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f12071 && this.f12069 == null) {
                C4520 c4520 = this.f12076;
                c4520.mo8492();
                C5349 c5349 = this.f19479;
                c5349.m12099();
                int iM11336 = m11336(c5349, c4520, 0);
                if (iM11336 == -4) {
                    if (c4520.m4401(4)) {
                        this.f12071 = true;
                    } else if (c4520.f13807 >= this.f19475) {
                        c4520.f17378 = this.f12068;
                        c4520.m8494();
                        ˉⁱ r1 = this.f12070;
                        int i = AbstractC4470.f17202;
                        C2401 c2401 = r1.ﹶˆ(c4520);
                        if (c2401 != null) {
                            ArrayList arrayList = new ArrayList(c2401.f9491.length);
                            m7669(c2401, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f12069 = new C2401(m7670(c4520.f13807), (InterfaceC2425[]) arrayList.toArray(new InterfaceC2425[0]));
                            }
                        }
                    }
                } else if (iM11336 == -5) {
                    C2431 c2431 = (C2431) c5349.f20757;
                    c2431.getClass();
                    this.f12068 = c2431.f9669;
                }
            }
            C2401 c24012 = this.f12069;
            if (c24012 == null || c24012.f9490 > m7670(j)) {
                z = false;
            } else {
                C2401 c24013 = this.f12069;
                Handler handler = this.f12073;
                if (handler != null) {
                    handler.obtainMessage(1, c24013).sendToTarget();
                } else {
                    m7671(c24013);
                }
                this.f12069 = null;
                z = true;
            }
            if (this.f12071 && this.f12069 == null) {
                this.f12072 = true;
            }
        }
    }
}
