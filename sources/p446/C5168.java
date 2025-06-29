package p446;

import com.hierynomus.mssmb2.SMBApiException;
import com.hierynomus.smbj.paths.PathResolveException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import p018.C1096;
import p055.InterfaceC1332;
import p078.EnumC1681;
import p078.EnumC1683;
import p078.EnumC1687;
import p109.EnumC1805;
import p143.C2227;
import p180.AbstractC2500;
import p202.C2766;
import p215.EnumC2820;
import p266.C3262;
import p266.C3264;
import p293.C3474;
import p342.EnumC3910;
import p344.InterfaceC3918;
import p408.C4672;

/* renamed from: ﾞˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5168 extends AbstractC5160 {

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final InterfaceC1332 f19754;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static final C3474 f19753 = new C3474(14);

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final C3264 f19752 = new C3264(15);

    public C5168(C4672 c4672, C2766 c2766, InterfaceC1332 interfaceC1332) {
        super(c4672, c2766);
        this.f19754 = interfaceC1332;
    }

    public final String toString() {
        return C5168.class.getSimpleName() + "[" + this.f19718 + "]";
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList m11465(String str) {
        EnumSet enumSetOf = EnumSet.of(EnumC2820.f10960, EnumC2820.f10963, EnumC2820.f10965);
        Set set = EnumC1687.f6566;
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC1681.class);
        enumSetNoneOf.add(EnumC1681.f6535);
        enumSetNoneOf.remove(EnumC1681.f6536);
        EnumSet enumSetNoneOf2 = EnumSet.noneOf(EnumC3910.class);
        enumSetNoneOf2.add(EnumC3910.f15207);
        C5157 c5157 = (C5157) m11468(str, enumSetOf, enumSetNoneOf2, set, 2, enumSetNoneOf);
        InterfaceC3918 interfaceC3918 = c5157.f19735;
        try {
            ArrayList arrayList = new ArrayList();
            C5165 c5165 = new C5165(c5157, "*");
            while (c5165.hasNext()) {
                arrayList.add(c5165.next());
            }
            try {
                c5157.close();
            } catch (Exception e) {
                interfaceC3918.mo5507(c5157.f19734, c5157.f19732, c5157.f19733, e);
            }
            return arrayList;
        } finally {
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m11466(String str) {
        try {
            AbstractC5164 abstractC5164M11468 = m11468(str, EnumSet.of(EnumC2820.f10961), EnumSet.of(EnumC3910.f15210), EnumSet.of(EnumC1687.f6568, EnumC1687.f6567, EnumC1687.f6565), 2, EnumSet.of(EnumC1681.f6536));
            try {
                abstractC5164M11468.m11461();
                abstractC5164M11468.close();
            } finally {
            }
        } catch (SMBApiException e) {
            if (!f19752.mo8056(e.f3661)) {
                throw e;
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C5158 m11467(String str, EnumSet enumSet, EnumSet enumSet2, int i, EnumSet enumSet3) {
        Set set = EnumC1687.f6566;
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC1681.class);
        enumSetCopyOf.add(EnumC1681.f6536);
        enumSetCopyOf.remove(EnumC1681.f6535);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC3910.class);
        enumSetCopyOf2.remove(EnumC3910.f15207);
        return (C5158) m11468(str, enumSet, enumSetCopyOf2, set, i, enumSetCopyOf);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AbstractC5164 m11468(String str, EnumSet enumSet, EnumSet enumSet2, Set set, int i, EnumSet enumSet3) {
        C2227 c2227M6211 = this.f19717;
        C4672 c4672 = new C4672(this.f19718, str);
        try {
            C4672 c4672Mo4643 = this.f19754.mo4643(c2227M6211, c4672);
            String str2 = c4672.f17810;
            if (!(c4672Mo4643 != null && AbstractC2500.m6612(str2, c4672Mo4643.f17810))) {
                c2227M6211 = c2227M6211.m6211(c4672Mo4643);
            }
            C3262 c3262M11469 = ((c4672Mo4643 != null && AbstractC2500.m6612(str2, c4672Mo4643.f17810) && AbstractC2500.m6612(c4672.f17808, c4672Mo4643.f17808)) ? this : (C5168) c2227M6211.m6208(c4672Mo4643.f17808)).m11469(c4672Mo4643, enumSet, enumSet2, set, i, enumSet3);
            C1096 c1096 = (C1096) c3262M11469.f12726;
            boolean zContains = c1096.f4673.contains(EnumC3910.f15207);
            C4672 c46722 = (C4672) c3262M11469.f12725;
            C5168 c5168 = (C5168) c3262M11469.f12724;
            return zContains ? new C5157(c1096.f4674, c5168, c46722.m10573()) : new C5158(c1096.f4674, c5168, c46722.m10573());
        } catch (PathResolveException e) {
            long j = EnumC1805.m5549(e.f3664).f6959;
            EnumC1683 enumC1683 = EnumC1683.f6540;
            throw new SMBApiException(j, "Cannot resolve path " + c4672, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: PathResolveException -> 0x0093, TryCatch #0 {PathResolveException -> 0x0093, blocks: (B:3:0x0035, B:5:0x003b, B:11:0x004d, B:13:0x0053, B:15:0x005d, B:19:0x0072, B:21:0x0078, B:18:0x0069, B:8:0x0047), top: B:28:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: PathResolveException -> 0x0093, TryCatch #0 {PathResolveException -> 0x0093, blocks: (B:3:0x0035, B:5:0x003b, B:11:0x004d, B:13:0x0053, B:15:0x005d, B:19:0x0072, B:21:0x0078, B:18:0x0069, B:8:0x0047), top: B:28:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: PathResolveException -> 0x0093, TRY_LEAVE, TryCatch #0 {PathResolveException -> 0x0093, blocks: (B:3:0x0035, B:5:0x003b, B:11:0x004d, B:13:0x0053, B:15:0x005d, B:19:0x0072, B:21:0x0078, B:18:0x0069, B:8:0x0047), top: B:28:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p266.C3262 m11469(p408.C4672 r23, java.util.EnumSet r24, java.util.EnumSet r25, java.util.Set r26, int r27, java.util.EnumSet r28) {
        /*
            r22 = this;
            r8 = r22
            r6 = r23
            ˉـ.ˑʽ r0 = r8.f19717
            ʻⁱ.ﹳﹳ r2 = new ʻⁱ.ﹳﹳ
            long r11 = r8.f19710
            r15 = 0
            ʿˋ.ˑʽ r10 = r8.f19712
            long r13 = r8.f19714
            r9 = r2
            r16 = r24
            r17 = r25
            r18 = r26
            r19 = r27
            r20 = r28
            r21 = r23
            r9.<init>(r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            ʾˆ.ـﹶ r9 = r8.f19754
            ﾞˉ.ˋⁱ r5 = r9.mo4645()
            long r10 = r8.f19722
            java.lang.String r3 = "Create"
            r1 = r22
            r4 = r23
            r12 = r6
            r6 = r10
            ʿˋ.ˋⁱ r1 = r1.m11457(r2, r3, r4, r5, r6)
            ʻⁱ.ʿʼ r1 = (p018.C1096) r1
            ﹳˈ.ـﹶ r14 = r9.mo4644(r0, r1, r12)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            if (r14 == 0) goto L47
            java.lang.String r2 = r12.f17810     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            java.lang.String r3 = r14.f17810     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            boolean r2 = p180.AbstractC2500.m6612(r2, r3)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            if (r2 == 0) goto L4a
            r2 = 1
            goto L4b
        L47:
            r23.getClass()     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L51
            ˉـ.ˑʽ r0 = r0.m6211(r14)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
        L51:
            if (r14 == 0) goto L69
            java.lang.String r2 = r12.f17810     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            java.lang.String r3 = r14.f17810     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            boolean r2 = p180.AbstractC2500.m6612(r2, r3)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            if (r2 == 0) goto L69
            java.lang.String r2 = r12.f17808     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            java.lang.String r3 = r14.f17808     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            boolean r2 = p180.AbstractC2500.m6612(r2, r3)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            if (r2 == 0) goto L69
            r13 = r8
            goto L72
        L69:
            java.lang.String r2 = r14.f17808     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            ﾞˉ.ˉⁱ r0 = r0.m6208(r2)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            ﾞˉ.ﹳﹳ r0 = (p446.C5168) r0     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            r13 = r0
        L72:
            boolean r0 = r12.equals(r14)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            if (r0 != 0) goto L87
            r15 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            ـˊ.ˑʽ r0 = r13.m11469(r14, r15, r16, r17, r18, r19)     // Catch: com.hierynomus.smbj.paths.PathResolveException -> L93
            return r0
        L87:
            ـˊ.ˑʽ r0 = new ـˊ.ˑʽ
            r0.<init>()
            r0.f12726 = r1
            r0.f12725 = r12
            r0.f12724 = r8
            return r0
        L93:
            r0 = move-exception
            com.hierynomus.mssmb2.SMBApiException r1 = new com.hierynomus.mssmb2.SMBApiException
            ʿˋ.ˉי r2 = p078.EnumC1683.f6540
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot resolve path "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            long r3 = r0.f3664
            r1.<init>(r3, r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p446.C5168.m11469(ﹳˈ.ـﹶ, java.util.EnumSet, java.util.EnumSet, java.util.Set, int, java.util.EnumSet):ـˊ.ˑʽ");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m11470(String str) {
        EnumSet enumSetOf = EnumSet.of(EnumC1681.f6536);
        C3474 c3474 = f19753;
        try {
            m11468(str, EnumSet.of(EnumC2820.f10963), EnumSet.of(EnumC3910.f15210), EnumC1687.f6566, 2, enumSetOf).close();
            return true;
        } catch (SMBApiException e) {
            if (c3474.mo8056(e.f3661)) {
                return false;
            }
            throw e;
        }
    }
}
