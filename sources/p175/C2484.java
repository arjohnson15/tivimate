package p175;

import p141.C2193;
import p166.C2431;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4470;

/* renamed from: ˋˏ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2484 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f9896;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9897;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f9898;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f9899;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f9900;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f9901;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f9902;

    public C2484(int i, int i2, C2431 c2431, int i3, Object obj, long j, long j2) {
        this.f9899 = i;
        this.f9896 = i2;
        this.f9900 = c2431;
        this.f9898 = i3;
        this.f9901 = obj;
        this.f9902 = j;
        this.f9897 = j2;
    }

    public C2484(C2193 c2193) {
        this.f9900 = c2193;
        this.f9902 = -9223372036854775807L;
        this.f9896 = -1;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public void mo6599(long j) {
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 2);
        this.f9901 = interfaceC3178Mo4851;
        int i2 = AbstractC4470.f17202;
        interfaceC3178Mo4851.mo7840(((C2193) this.f9900).f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public void mo6601(long j, long j2) {
        this.f9902 = j;
        this.f9897 = j2;
        this.f9898 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6602(p383.C4457 r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f9901
            יי.ᵢʿ r5 = (p254.InterfaceC3178) r5
            p383.AbstractC4464.m10146(r5)
            int r5 = r0.f9896
            r6 = -1
            if (r5 == r6) goto L2d
            int r5 = p141.C2217.m6189(r5)
            if (r2 == r5) goto L2d
            int r7 = p383.AbstractC4470.f17202
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r8 = "; received: "
            java.lang.String r9 = ". Dropping packet."
            java.lang.String r5 = ـˈ.ˉᵎ.ˋⁱ(r7, r5, r8, r2, r9)
            java.lang.String r7 = "RtpMpeg4Reader"
            p383.AbstractC4464.m10144(r7, r5)
        L2d:
            int r5 = r24.m10096()
            java.lang.Object r7 = r0.f9901
            יי.ᵢʿ r7 = (p254.InterfaceC3178) r7
            r7.mo7841(r5, r1)
            int r7 = r0.f9898
            r8 = 0
            if (r7 != 0) goto L71
            byte[] r7 = r1.f17171
            byte[] r9 = new byte[r3]
            r9 = {x00ae: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            java.lang.String r10 = "array"
            ﹶⁱ.ـﹶ.ˏᵢ(r7, r10)
            r10 = 0
        L4a:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L5e
            r11 = 0
        L50:
            if (r11 >= r3) goto L5f
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L5c
            int r10 = r10 + r4
            goto L4a
        L5c:
            int r11 = r11 + r4
            goto L50
        L5e:
            r10 = -1
        L5f:
            if (r10 == r6) goto L6e
            int r10 = r10 + r3
            r1.m10108(r10)
            int r1 = r24.m10078()
            int r1 = r1 >> 6
            if (r1 != 0) goto L6e
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r0.f9899 = r4
        L71:
            int r1 = r0.f9898
            int r1 = r1 + r5
            r0.f9898 = r1
            if (r28 == 0) goto Lab
            long r3 = r0.f9902
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L87
            r0.f9902 = r3
        L87:
            long r9 = r0.f9897
            long r13 = r0.f9902
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = ˈי.ʾˈ.ᵎـ(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f9901
            r16 = r1
            יי.ᵢʿ r16 = (p254.InterfaceC3178) r16
            int r1 = r0.f9899
            int r3 = r0.f9898
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.mo7842(r17, r19, r20, r21, r22)
            r0.f9898 = r8
        Lab:
            r0.f9896 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175.C2484.mo6602(ᵢᵢ.ˋⁱ, long, int, boolean):void");
    }
}
