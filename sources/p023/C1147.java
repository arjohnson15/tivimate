package p023;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.leanback.widget.ʿˏ;
import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.util.ArrayList;
import java.util.Iterator;
import p013.AbstractC1036;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p035.C1233;
import p078.C1692;
import p078.C1695;
import p078.C1696;
import p093.InterfaceC1758;
import p180.AbstractC2497;
import p184.AbstractC2539;
import p184.InterfaceC2551;
import p269.C3290;
import p269.C3291;
import p269.C3292;
import p269.InterfaceC3287;
import p279.AbstractC3370;
import p279.C3369;
import p283.C3380;
import p314.InterfaceC3597;
import p331.C3768;
import p332.C3779;
import p334.C3789;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p397.C4598;
import p445.C5154;
import p445.C5155;
import p445.InterfaceC5156;
import p457.C5391;

/* renamed from: ʼʾ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1147 implements InterfaceC1758 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ArrayList f4789;

    public C1147(int i) {
        switch (i) {
            case 2:
                this.f4789 = new ArrayList();
                break;
            case 3:
            default:
                this.f4789 = new ArrayList();
                break;
            case 4:
                this.f4789 = new ArrayList();
                break;
            case 5:
                this.f4789 = new ArrayList();
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f4789 = new ArrayList();
                break;
        }
    }

    public C1147(ʿˏ r15) {
        C1141 c1141;
        C3292 c3292 = new C3292((AbstractC3370) r15.ˆʿ, 0);
        C3292 c32922 = new C3292((C3369) r15.ˎˑ, 1);
        C3292 c32923 = new C3292((AbstractC3370) r15.ˆᵔ, 4);
        AbstractC3370 abstractC3370 = (AbstractC3370) r15.ᐧˋ;
        C3292 c32924 = new C3292(abstractC3370, 2);
        C3292 c32925 = new C3292(abstractC3370, 3);
        C3291 c3291 = new C3291(abstractC3370);
        C3290 c3290 = new C3290(abstractC3370);
        if (Build.VERSION.SDK_INT >= 28) {
            String str = AbstractC1148.f4791;
            c1141 = new C1141((ConnectivityManager) ((Context) r15.ᐧⁱ).getSystemService("connectivity"));
        } else {
            c1141 = null;
        }
        this.f4789 = AbstractC1036.m4001(new InterfaceC3287[]{c3292, c32922, c32923, c32924, c32925, c3291, c3290, c1141});
    }

    @Override // p093.InterfaceC1758
    public void clear() {
        this.f4789.clear();
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long mo4163(long j) {
        ArrayList arrayList = this.f4789;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C4598) arrayList.get(0)).f17598) {
            return ((C4598) arrayList.get(0)).f17598;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C4598 c4598 = (C4598) arrayList.get(i);
            if (j < c4598.f17598) {
                long j2 = ((C4598) arrayList.get(i - 1)).f17601;
                long j3 = c4598.f17598;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((C4598) AbstractC3968.m9180(arrayList)).f17601;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo4164(long j) {
        int iM4174 = m4174(j);
        if (iM4174 > 0) {
            this.f4789.subList(0, iM4174).clear();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public synchronized ArrayList m4165(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f4789.iterator();
        while (it.hasNext()) {
            C5154 c5154 = (C5154) it.next();
            if ((c5154.f19704.isAssignableFrom(cls) && cls2.isAssignableFrom(c5154.f19702)) && !arrayList.contains(c5154.f19702)) {
                arrayList.add(c5154.f19702);
            }
        }
        return arrayList;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public InterfaceC2551 m4166(C3768 c3768) {
        ArrayList arrayList = this.f4789;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC3287) obj).mo4160(c3768)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC1039.m4012(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC3287) it.next()).mo4162(c3768.f14565));
        }
        return AbstractC2539.m6671(new C1138(0, (InterfaceC2551[]) AbstractC1041.m4016(arrayList3).toArray(new InterfaceC2551[0])));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m4167(C1696 c1696, C3380 c3380) throws Buffer$BufferException {
        String strM8840;
        long j = c1696.f6598;
        ArrayList arrayList = this.f4789;
        if (j == 3221225507L) {
            C1695 c1695 = new C1695();
            c3380.f14613.m8854(c3380);
            arrayList.add(c1695);
            return;
        }
        if (j == 2147483693L) {
            C1692 c1692 = new C1692();
            int iM8848 = c3380.f14614 + c3380.m8848();
            c3380.m8843(4);
            c3380.m8843(4);
            c3380.m8843(2);
            C3779 c3779 = c3380.f14613;
            c1692.f6589 = c3779.m8852(c3380);
            int iM8852 = c3779.m8852(c3380);
            int iM88522 = c3779.m8852(c3380);
            int iM88523 = c3779.m8852(c3380);
            int iM88524 = c3779.m8852(c3380);
            c1692.f6591 = c3779.m8854(c3380) == 0;
            int i = c3380.f14614;
            if (iM88522 > 0) {
                c3380.f14614 = iM8852 + i;
                strM8840 = c3380.m8840(iM88522 / 2, AbstractC2497.f9931);
            } else {
                strM8840 = null;
            }
            c3380.f14614 = i;
            c1692.f6590 = strM8840;
            if (iM88524 > 0) {
                c3380.f14614 = i + iM88523;
                c3380.m8840(iM88524 / 2, AbstractC2497.f9931);
            }
            c3380.f14614 = iM8848;
            arrayList.add(c1692);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public synchronized InterfaceC5156 m4168(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5155.f19705;
        }
        Iterator it = this.f4789.iterator();
        while (it.hasNext()) {
            C5154 c5154 = (C5154) it.next();
            if (c5154.f19704.isAssignableFrom(cls) && cls2.isAssignableFrom(c5154.f19702)) {
                return c5154.f19703;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // p093.InterfaceC1758
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo4169(p397.C4598 r11, long r12) {
        /*
            r10 = this;
            long r0 = r11.f17598
            r2 = 0
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto Lf
            r6 = 1
            goto L10
        Lf:
            r6 = 0
        L10:
            p383.AbstractC4464.m10142(r6)
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L23
            long r6 = r11.f17601
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L21
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 >= 0) goto L23
        L21:
            r4 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            java.util.ArrayList r5 = r10.f4789
            int r6 = r5.size()
            int r6 = r6 - r3
        L2b:
            if (r6 < 0) goto L4e
            java.lang.Object r7 = r5.get(r6)
            ⁱᵎ.ʽᐧ r7 = (p397.C4598) r7
            long r7 = r7.f17598
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L3e
            int r6 = r6 + r3
            r5.add(r6, r11)
            return r4
        L3e:
            java.lang.Object r7 = r5.get(r6)
            ⁱᵎ.ʽᐧ r7 = (p397.C4598) r7
            long r7 = r7.f17598
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 > 0) goto L4b
            r4 = 0
        L4b:
            int r6 = r6 + (-1)
            goto L2b
        L4e:
            r5.add(r2, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p023.C1147.mo4169(ⁱᵎ.ʽᐧ, long):boolean");
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC3980 mo4170(long j) {
        int iM4174 = m4174(j);
        if (iM4174 == 0) {
            C3928 c3928 = AbstractC3980.f15360;
            return C3932.f15274;
        }
        C4598 c4598 = (C4598) this.f4789.get(iM4174 - 1);
        long j2 = c4598.f17601;
        if (j2 == -9223372036854775807L || j < j2) {
            return c4598.f17600;
        }
        C3928 c39282 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean m4171(C3768 c3768) {
        ArrayList arrayList = this.f4789;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC3287) obj).mo4161(c3768)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            C5391.m12163().m12168(AbstractC1148.f4791, "Work " + c3768.f14575 + " constrained by " + AbstractC1041.m4033(arrayList2, null, null, null, C1139.f4772, 31));
        }
        return arrayList2.isEmpty();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public synchronized InterfaceC3597 m4172(Class cls) {
        int size = this.f4789.size();
        for (int i = 0; i < size; i++) {
            C1233 c1233 = (C1233) this.f4789.get(i);
            if (c1233.f5044.isAssignableFrom(cls)) {
                return c1233.f5043;
            }
        }
        return null;
    }

    @Override // p093.InterfaceC1758
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long mo4173(long j) {
        ArrayList arrayList = this.f4789;
        if (arrayList.isEmpty() || j < ((C4598) arrayList.get(0)).f17598) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C4598) arrayList.get(i)).f17598;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C4598 c4598 = (C4598) arrayList.get(i - 1);
                long j3 = c4598.f17601;
                return (j3 == -9223372036854775807L || j3 > j) ? c4598.f17598 : j3;
            }
        }
        C4598 c45982 = (C4598) AbstractC3968.m9180(arrayList);
        long j4 = c45982.f17601;
        return (j4 == -9223372036854775807L || j < j4) ? c45982.f17598 : j4;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int m4174(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4789;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C4598) arrayList.get(i)).f17598) {
                return i;
            }
            i++;
        }
    }
}
