package p356;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p022.InterfaceC1133;
import p166.C2407;
import p166.C2418;
import p331.C3761;
import p383.AbstractC4470;

/* renamed from: ᵔˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4039 implements InterfaceC1133 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f15529;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f15530;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2407 f15531;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C4048 f15532;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final List f15533;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Uri f15534;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f15535;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f15536;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f15537;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f15538;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f15539;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f15540;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3761 f15541;

    public C4039(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C4048 c4048, C3761 c3761, C2407 c2407, Uri uri, ArrayList arrayList) {
        this.f15537 = j;
        this.f15529 = j2;
        this.f15536 = j3;
        this.f15540 = z;
        this.f15530 = j4;
        this.f15538 = j5;
        this.f15539 = j6;
        this.f15535 = j7;
        this.f15532 = c4048;
        this.f15541 = c3761;
        this.f15534 = uri;
        this.f15531 = c2407;
        this.f15533 = arrayList;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4038 m9300(int i) {
        return (C4038) this.f15533.get(i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long m9301(int i) {
        List list = this.f15533;
        if (i != list.size() - 1) {
            return ((C4038) list.get(i + 1)).f15525 - ((C4038) list.get(i)).f15525;
        }
        long j = this.f15529;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - ((C4038) list.get(i)).f15525;
    }

    @Override // p022.InterfaceC1133
    /* renamed from: ـﹶ */
    public final Object mo4158(List list) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C2418());
        ArrayList arrayList3 = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (i < this.f15533.size()) {
            if (((C2418) linkedList.peek()).f9632 != i) {
                long jM9301 = m9301(i);
                if (jM9301 != -9223372036854775807L) {
                    j2 += jM9301;
                }
                arrayList2 = arrayList3;
            } else {
                C4038 c4038M9300 = m9300(i);
                List list2 = c4038M9300.f15526;
                C2418 c2418 = (C2418) linkedList.poll();
                int i2 = c2418.f9632;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i3 = c2418.f9630;
                    C4041 c4041 = (C4041) list2.get(i3);
                    List list3 = c4041.f15547;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((AbstractC4034) list3.get(c2418.f9631));
                        c2418 = (C2418) linkedList.poll();
                        if (c2418.f9632 != i2) {
                            break;
                        }
                    } while (c2418.f9630 == i3);
                    arrayList = arrayList3;
                    j = j2;
                    arrayList4.add(new C4041(c4041.f15548, c4041.f15545, arrayList5, c4041.f15550, c4041.f15546, c4041.f15549));
                    if (c2418.f9632 != i2) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j2 = j;
                }
                linkedList.addFirst(c2418);
                arrayList2 = arrayList;
                arrayList2.add(new C4038(c4038M9300.f15527, c4038M9300.f15525 - j, arrayList4, c4038M9300.f15528));
                j2 = j;
            }
            i++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j3 = j2;
        long j4 = this.f15529;
        return new C4039(this.f15537, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.f15536, this.f15540, this.f15530, this.f15538, this.f15539, this.f15535, this.f15532, this.f15541, this.f15531, this.f15534, arrayList6);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long m9302(int i) {
        return AbstractC4470.m10206(m9301(i));
    }
}
