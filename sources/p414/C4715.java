package p414;

import android.content.Context;
import android.support.v4.media.session.AbstractC0002;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import p013.AbstractC1037;
import p013.AbstractC1041;
import p013.AbstractC1052;
import p072.AbstractC1642;
import p072.C1592;
import p090.C1743;
import p331.C3766;
import p331.C3767;
import p331.C3768;
import p331.C3772;
import p433.C5029;
import p457.AbstractC5359;
import p457.C5357;
import p457.C5363;
import p457.C5368;
import p457.C5369;
import ˆʽ.ᵎˏ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﹳـ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4715 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f18089;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5357 f18090;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3767 f18091;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String f18092;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C1592 f18093;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ArrayList f18094;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final WorkDatabase f18095;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f18096;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3768 f18097;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C5368 f18098;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4736 f18099;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ﹶˆ f18100;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3772 f18101;

    public C4715(C5029 c5029) {
        C3768 c3768 = (C3768) c5029.f19098;
        this.f18097 = c3768;
        this.f18089 = (Context) c5029.f19095;
        String str = c3768.f14575;
        this.f18096 = str;
        this.f18100 = (ﹶˆ) c5029.f19093;
        C5357 c5357 = (C5357) c5029.f19096;
        this.f18090 = c5357;
        this.f18098 = c5357.f20795;
        this.f18099 = (C4736) c5029.f19100;
        WorkDatabase workDatabase = (WorkDatabase) c5029.f19094;
        this.f18095 = workDatabase;
        this.f18101 = workDatabase.mo1374();
        this.f18091 = workDatabase.mo1375();
        ArrayList arrayList = (ArrayList) c5029.f19099;
        this.f18094 = arrayList;
        this.f18092 = ᵎˏ.ˎٴ(AbstractC0002.m50("Work [ id=", str, ", tags={ "), AbstractC1041.m4033(arrayList, ",", null, null, null, 62), " } ]");
        this.f18093 = AbstractC1642.m5281();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m10628(p414.C4715 r19, p185.AbstractC2562 r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p414.C4715.m10628(ﹳـ.ˈٴ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10629(int i) {
        C3772 c3772 = this.f18101;
        String str = this.f18096;
        c3772.m8829(1, str);
        this.f18098.getClass();
        c3772.m8833(str, System.currentTimeMillis());
        c3772.m8824(this.f18097.f14567, str);
        c3772.m8823(str, -1L);
        c3772.m8834(i, str);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10630() {
        this.f18098.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3772 c3772 = this.f18101;
        String str = this.f18096;
        c3772.m8833(str, jCurrentTimeMillis);
        c3772.m8829(1, str);
        WorkDatabase_Impl workDatabase_Impl = c3772.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = c3772.f14595;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4420(1, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
                c3766.m5105(c1743M5108);
                c3772.m8824(this.f18097.f14567, str);
                workDatabase_Impl.m5041();
                C3766 c37662 = c3772.f14602;
                C1743 c1743M51082 = c37662.m5108();
                c1743M51082.mo4420(1, str);
                try {
                    workDatabase_Impl.m5048();
                    try {
                        c1743M51082.m5462();
                        workDatabase_Impl.m5055();
                        c37662.m5105(c1743M51082);
                        c3772.m8823(str, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    c37662.m5105(c1743M51082);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            c3766.m5105(c1743M5108);
            throw th2;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10631(AbstractC5359 abstractC5359) {
        String str = this.f18096;
        ArrayList arrayListM4006 = AbstractC1037.m4006(str);
        while (true) {
            boolean zIsEmpty = arrayListM4006.isEmpty();
            C3772 c3772 = this.f18101;
            if (zIsEmpty) {
                C5363 c5363 = ((C5369) abstractC5359).f20837;
                c3772.m8824(this.f18097.f14567, str);
                c3772.m8826(str, c5363);
                return;
            } else {
                String str2 = (String) AbstractC1052.m4040(arrayListM4006);
                if (c3772.m8836(str2) != 6) {
                    c3772.m8829(4, str2);
                }
                arrayListM4006.addAll(this.f18091.m8804(str2));
            }
        }
    }
}
