package p275;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153.C2324;
import p166.C2401;
import p166.InterfaceC2425;
import p383.C4457;
import p383.C4458;
import p392.C4520;
import ˈⁱ.ˉⁱ;

/* renamed from: ـᵢ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3349 extends ˉⁱ {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C4458 f13132;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4457 f13133 = new C4457();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C2324 f13134 = new C2324(3);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2401 m8176(C4520 c4520, ByteBuffer byteBuffer) {
        InterfaceC2425 c3351;
        int i;
        long j;
        ArrayList arrayList;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int iM10100;
        int iM10086;
        int iM100862;
        long jM10110;
        boolean z4;
        List list;
        long j4;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        int i3;
        int iM100863;
        boolean z9;
        int i4 = 32;
        C4458 c4458 = this.f13132;
        if (c4458 == null || c4520.f17378 != c4458.m10113()) {
            C4458 c44582 = new C4458(c4520.f13807);
            this.f13132 = c44582;
            c44582.m10116(c4520.f13807 - c4520.f17378);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C4457 c4457 = this.f13133;
        c4457.m10081(iLimit, bArrArray);
        C2324 c2324 = this.f13134;
        c2324.m6398(iLimit, bArrArray);
        c2324.m6408(39);
        long jM6410 = (c2324.m6410(1) << 32) | c2324.m6410(32);
        c2324.m6408(20);
        int iM6410 = c2324.m6410(12);
        int iM64102 = c2324.m6410(8);
        c4457.m10085(14);
        if (iM64102 == 0) {
            c3351 = new C3351();
        } else if (iM64102 != 255) {
            long j6 = 1;
            long jM101102 = -9223372036854775807L;
            if (iM64102 == 4) {
                int iM100864 = c4457.m10086();
                ArrayList arrayList2 = new ArrayList(iM100864);
                int i5 = 0;
                while (i5 < iM100864) {
                    long jM101103 = c4457.m10110();
                    boolean z10 = (c4457.m10086() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i = i5;
                        j = j6;
                        arrayList = arrayList3;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = false;
                        z2 = false;
                        z3 = false;
                        iM10100 = 0;
                        iM10086 = 0;
                        iM100862 = 0;
                    } else {
                        int iM100865 = c4457.m10086();
                        boolean z11 = (iM100865 & 128) != 0;
                        boolean z12 = (iM100865 & 64) != 0;
                        boolean z13 = (iM100865 & i4) != 0;
                        long jM101104 = z12 ? c4457.m10110() : -9223372036854775807L;
                        if (z12) {
                            i = i5;
                        } else {
                            int iM100866 = c4457.m10086();
                            ArrayList arrayList4 = new ArrayList(iM100866);
                            int i6 = 0;
                            while (i6 < iM100866) {
                                arrayList4.add(new C3352(c4457.m10086(), c4457.m10110()));
                                i6++;
                                i5 = i5;
                            }
                            i = i5;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long jM10086 = c4457.m10086();
                            z4 = (jM10086 & 128) != 0;
                            j = 1;
                            jM10110 = ((((jM10086 & 1) << 32) | c4457.m10110()) * 1000) / 90;
                        } else {
                            j = 1;
                            jM10110 = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = jM10110;
                        z3 = z4;
                        arrayList = arrayList3;
                        z = z11;
                        z2 = z12;
                        j2 = jM101104;
                        iM10100 = c4457.m10100();
                        iM10086 = c4457.m10086();
                        iM100862 = c4457.m10086();
                    }
                    arrayList2.add(new C3348(jM101103, z10, z, z2, arrayList, j2, z3, j3, iM10100, iM10086, iM100862));
                    i5 = i + 1;
                    j6 = j;
                    i4 = 32;
                }
                c3351 = new C3354(arrayList2);
            } else if (iM64102 == 5) {
                C4458 c44583 = this.f13132;
                long jM101105 = c4457.m10110();
                boolean z14 = (c4457.m10086() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z14) {
                    list = listEmptyList;
                    j4 = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i2 = 0;
                    i3 = 0;
                    iM100863 = 0;
                } else {
                    int iM100867 = c4457.m10086();
                    boolean z15 = (iM100867 & 128) != 0;
                    boolean z16 = (iM100867 & 64) != 0;
                    boolean z17 = (iM100867 & 32) != 0;
                    boolean z18 = (iM100867 & 16) != 0;
                    long jM8175 = (!z16 || z18) ? -9223372036854775807L : C3347.m8175(jM6410, c4457);
                    if (!z16) {
                        int iM100868 = c4457.m10086();
                        ArrayList arrayList5 = new ArrayList(iM100868);
                        for (int i7 = 0; i7 < iM100868; i7++) {
                            int iM100869 = c4457.m10086();
                            long jM81752 = !z18 ? C3347.m8175(jM6410, c4457) : -9223372036854775807L;
                            arrayList5.add(new C3353(iM100869, jM81752, c44583.m10112(jM81752)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z17) {
                        long jM100862 = c4457.m10086();
                        z9 = (jM100862 & 128) != 0;
                        jM101102 = ((((jM100862 & 1) << 32) | c4457.m10110()) * 1000) / 90;
                    } else {
                        z9 = false;
                    }
                    int iM101002 = c4457.m10100();
                    int iM1008610 = c4457.m10086();
                    z8 = z9;
                    i2 = iM101002;
                    list = listEmptyList;
                    iM100863 = c4457.m10086();
                    i3 = iM1008610;
                    z5 = z15;
                    j5 = jM101102;
                    j4 = jM8175;
                    z7 = z18;
                    z6 = z16;
                }
                c3351 = new C3346(jM101105, z14, z5, z6, z7, j4, c44583.m10112(j4), list, z8, j5, i2, i3, iM100863);
            } else if (iM64102 != 6) {
                c3351 = null;
            } else {
                C4458 c44584 = this.f13132;
                long jM81753 = C3347.m8175(jM6410, c4457);
                c3351 = new C3347(jM81753, c44584.m10112(jM81753));
            }
        } else {
            long jM101106 = c4457.m10110();
            int i8 = iM6410 - 4;
            byte[] bArr = new byte[i8];
            c4457.m10097(bArr, 0, i8);
            c3351 = new C3350(jM101106, bArr, jM6410);
        }
        return c3351 == null ? new C2401(new InterfaceC2425[0]) : new C2401(c3351);
    }
}
