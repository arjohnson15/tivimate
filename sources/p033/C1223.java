package p033;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p007.C0952;
import p166.AbstractC2394;
import p166.C2412;
import p166.C2434;
import p374.C4290;

/* renamed from: ʼᵎ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1223 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C0952 f5024 = new C0952(1);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Random f5025 = new Random();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f5030;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1213 f5032;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2434 f5029 = new C2434();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2412 f5026 = new C2412();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f5028 = new HashMap();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public AbstractC2394 f5027 = AbstractC2394.f9448;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f5031 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m4373(C1218 c1218) {
        C1213 c1213;
        try {
            String str = this.f5030;
            if (str != null) {
                C1216 c1216 = (C1216) this.f5028.get(str);
                c1216.getClass();
                m4376(c1216);
            }
            Iterator it = this.f5028.values().iterator();
            while (it.hasNext()) {
                C1216 c12162 = (C1216) it.next();
                it.remove();
                if (c12162.f4992 && (c1213 = this.f5032) != null) {
                    c1213.m4300(c1218, c12162.f4994);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4374(C1218 c1218) {
        C4290 c4290;
        boolean zM6477 = c1218.f5000.m6477();
        HashMap map = this.f5028;
        if (zM6477) {
            String str = this.f5030;
            if (str != null) {
                C1216 c1216 = (C1216) map.get(str);
                c1216.getClass();
                m4376(c1216);
                return;
            }
            return;
        }
        C1216 c12162 = (C1216) map.get(this.f5030);
        int i = c1218.f5004;
        C4290 c42902 = c1218.f5008;
        this.f5030 = m4375(i, c42902).f4994;
        m4377(c1218);
        if (c42902 == null || !c42902.m9753()) {
            return;
        }
        long j = c42902.f16694;
        if (c12162 != null && c12162.f4993 == j && (c4290 = c12162.f4997) != null && c4290.f16690 == c42902.f16690 && c4290.f16692 == c42902.f16692) {
            return;
        }
        m4375(i, new C4290(j, c42902.f16693));
        this.f5032.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p033.C1216 m4375(int r17, p374.C4290 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashMap r3 = r0.f5028
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r4.next()
            ʼᵎ.ˏᵢ r8 = (p033.C1216) r8
            long r9 = r8.f4993
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L52
            int r9 = r8.f4991
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            ʼᵎ.ﹶˆ r9 = r8.f4996
            java.util.HashMap r10 = r9.f5028
            java.lang.String r13 = r9.f5030
            java.lang.Object r10 = r10.get(r13)
            ʼᵎ.ˏᵢ r10 = (p033.C1216) r10
            if (r10 == 0) goto L45
            long r13 = r10.f4993
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f5031
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f16694
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 < 0) goto L52
            r8.f4993 = r9
        L52:
            ᵢˎ.ﹳˑ r9 = r8.f4997
            if (r2 != 0) goto L5b
            int r10 = r8.f4991
            if (r1 != r10) goto L16
            goto L7e
        L5b:
            long r13 = r2.f16694
            if (r9 != 0) goto L6c
            boolean r10 = r18.m9753()
            if (r10 != 0) goto L16
            long r11 = r8.f4993
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L7e
        L6c:
            long r10 = r9.f16694
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 != 0) goto L16
            int r10 = r2.f16690
            int r11 = r9.f16690
            if (r10 != r11) goto L16
            int r10 = r2.f16692
            int r11 = r9.f16692
            if (r10 != r11) goto L16
        L7e:
            long r10 = r8.f4993
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L98
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8b
            goto L98
        L8b:
            if (r12 != 0) goto L16
            int r10 = p383.AbstractC4470.f17202
            ᵢˎ.ﹳˑ r10 = r5.f4997
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L98:
            r5 = r8
            r6 = r10
            goto L16
        L9c:
            if (r5 != 0) goto Lae
            ʻˉ.ˑʽ r4 = p033.C1223.f5024
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            ʼᵎ.ˏᵢ r5 = new ʼᵎ.ˏᵢ
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p033.C1223.m4375(int, ᵢˎ.ﹳˑ):ʼᵎ.ˏᵢ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4376(C1216 c1216) {
        long j = c1216.f4993;
        if (j != -1) {
            this.f5031 = j;
        }
        this.f5030 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m4377(p033.C1218 r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033.C1223.m4377(ʼᵎ.ـﹶ):void");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final synchronized void m4378(C1218 c1218, int i) {
        try {
            this.f5032.getClass();
            boolean z = i == 0;
            Iterator it = this.f5028.values().iterator();
            while (it.hasNext()) {
                C1216 c1216 = (C1216) it.next();
                if (c1216.m4332(c1218)) {
                    it.remove();
                    if (c1216.f4992) {
                        boolean zEquals = c1216.f4994.equals(this.f5030);
                        if (z && zEquals) {
                            boolean z2 = c1216.f4995;
                        }
                        if (zEquals) {
                            m4376(c1216);
                        }
                        this.f5032.m4300(c1218, c1216.f4994);
                    }
                }
            }
            m4374(c1218);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized String m4379(AbstractC2394 abstractC2394, C4290 c4290) {
        return m4375(abstractC2394.mo6479(c4290.f16693, this.f5026).f9576, c4290).f4994;
    }
}
