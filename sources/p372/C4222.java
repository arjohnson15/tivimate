package p372;

import android.support.v4.media.session.AbstractC0001;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p166.C2431;
import p312.C3589;
import p374.InterfaceC4254;
import p383.AbstractC4470;
import p456.C5349;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢˆ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4222 implements InterfaceC4254 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4234 f16308;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f16309 = -1;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f16310;

    public C4222(C4234 c4234, int i) {
        this.f16308 = c4234;
        this.f16310 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9670() {
        /*
            r6 = this;
            int r0 = r6.f16309
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p383.AbstractC4464.m10142(r0)
            ᵢˆ.ᵎـ r0 = r6.f16308
            r0.m9689()
            int[] r3 = r0.f16421
            r3.getClass()
            int[] r3 = r0.f16421
            int r4 = r6.f16310
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set r1 = r0.f16422
            ᵢˎ.ʻﹳ r0 = r0.f16413
            ˊﹶ.ᵔٴ r0 = r0.m9704(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L36
            r0 = -3
            r3 = -3
            goto L3a
        L30:
            boolean[] r0 = r0.f16430
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
        L36:
            r3 = -2
            goto L3a
        L38:
            r0[r3] = r1
        L3a:
            r6.f16309 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.C4222.m9670():void");
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) {
        C2431 c2431;
        C2431 c24312;
        int iM9773 = -3;
        if (this.f16309 == -3) {
            c3589.m4409(4);
            return -4;
        }
        if (m9671()) {
            int i2 = this.f16309;
            C4234 c4234 = this.f16308;
            if (!c4234.m9685()) {
                ArrayList arrayList = c4234.f16409;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((C4220) arrayList.get(i4)).f16295;
                        int length = c4234.f16399.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (c4234.f16430[i6] && c4234.f16399[i6].m9759() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    AbstractC4470.m10175(arrayList, 0, i4);
                    C4220 c4220 = (C4220) arrayList.get(0);
                    C2431 c24313 = c4220.f12395;
                    if (c24313.equals(c4234.f16414)) {
                        c24312 = c24313;
                    } else {
                        ᐧʻ r9 = c4234.f16433;
                        Object obj = c4220.f12397;
                        long j = c4220.f12398;
                        int i7 = c4234.f16394;
                        int i8 = c4220.f12391;
                        c24312 = c24313;
                        r9.ᐧʻ(i7, c24313, i8, obj, j);
                    }
                    c4234.f16414 = c24312;
                }
                if ((arrayList.isEmpty() || ((C4220) arrayList.get(0)).f16287) && (iM9773 = c4234.f16399[i2].m9773(c5349, c3589, i, c4234.f16396)) == -5) {
                    C2431 c2431M6542 = (C2431) c5349.f20757;
                    c2431M6542.getClass();
                    if (i2 == c4234.f16403) {
                        int iM12 = AbstractC0001.m12(c4234.f16399[i2].m9759());
                        while (i3 < arrayList.size() && ((C4220) arrayList.get(i3)).f16295 != iM12) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            c2431 = ((C4220) arrayList.get(i3)).f12395;
                        } else {
                            c2431 = c4234.f16389;
                            c2431.getClass();
                        }
                        c2431M6542 = c2431M6542.m6542(c2431);
                    }
                    c5349.f20757 = c2431M6542;
                }
            }
        }
        return iM9773;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        if (this.f16309 != -3) {
            if (m9671()) {
                int i = this.f16309;
                C4234 c4234 = this.f16308;
                if (c4234.m9685() || !c4234.f16399[i].m9782(c4234.f16396)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m9671() {
        int i = this.f16309;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() throws IOException {
        int i = this.f16309;
        C4234 c4234 = this.f16308;
        if (i == -2) {
            c4234.m9689();
            throw new SampleQueueMappingException(ᵎˏ.ˑי("Unable to bind a sample queue to TrackGroup with MIME type ", c4234.f16413.m9704(this.f16310).f9700[0].f9667, "."));
        }
        if (i == -1) {
            c4234.m9683();
        } else if (i != -3) {
            c4234.m9683();
            c4234.f16399[i].m9770();
        }
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        if (!m9671()) {
            return 0;
        }
        int i = this.f16309;
        C4234 c4234 = this.f16308;
        if (c4234.m9685()) {
            return 0;
        }
        C4228 c4228 = c4234.f16399[i];
        int iM9777 = c4228.m9777(c4234.f16396, j);
        ArrayList arrayList = c4234.f16409;
        Object next = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = arrayList.get(arrayList.size() - 1);
        }
        C4220 c4220 = (C4220) next;
        if (c4220 != null && !c4220.f16287) {
            iM9777 = Math.min(iM9777, c4220.m9666(i) - c4228.m9765());
        }
        c4228.m9779(iM9777);
        return iM9777;
    }
}
