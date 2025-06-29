package p376;

import java.io.EOFException;
import p317.AbstractC3625;
import p366.C4143;
import p366.C4172;

/* renamed from: ᵢˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4321 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f16782 = "0123456789abcdef".getBytes(AbstractC3625.f13869);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String m9821(C4143 c4143, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c4143.m9520(j2) == 13) {
                String strM9495 = c4143.m9495(j2, AbstractC3625.f13869);
                c4143.skip(2L);
                return strM9495;
            }
        }
        String strM94952 = c4143.m9495(j, AbstractC3625.f13869);
        c4143.skip(1L);
        return strM94952;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        return r9;
     */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m9822(p366.C4143 r17, p366.C4165 r18, boolean r19) {
        /*
            r0 = r17
            ᵔﾞ.ﾞˊ r0 = r0.f16042
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Ld
            if (r19 == 0) goto Lb
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
        Ld:
            int r3 = r0.f16099
            int r4 = r0.f16101
            r5 = 0
            byte[] r6 = r0.f16102
            r8 = r0
            r7 = 0
            r9 = -1
        L17:
            int r10 = r7 + 1
            r11 = r18
            int[] r12 = r11.f16081
            r13 = r12[r7]
            int r7 = r7 + 2
            r10 = r12[r10]
            if (r10 == r2) goto L26
            r9 = r10
        L26:
            if (r8 != 0) goto L29
            goto L53
        L29:
            r10 = 0
            if (r13 >= 0) goto L6d
            int r13 = r13 * (-1)
            int r14 = r13 + r7
        L30:
            int r13 = r3 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r7 + 1
            r7 = r12[r7]
            if (r3 == r7) goto L3d
            return r9
        L3d:
            if (r15 != r14) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = 0
        L42:
            if (r13 != r4) goto L5d
            ᵔﾞ.ﾞˊ r4 = r8.f16103
            int r6 = r4.f16099
            int r7 = r4.f16101
            byte[] r8 = r4.f16102
            if (r4 != r0) goto L57
            if (r3 == 0) goto L53
            r4 = r7
            r7 = r10
            goto L60
        L53:
            if (r19 == 0) goto L56
            return r1
        L56:
            return r9
        L57:
            r16 = r7
            r7 = r4
            r4 = r16
            goto L60
        L5d:
            r7 = r8
            r8 = r6
            r6 = r13
        L60:
            if (r3 == 0) goto L68
            r3 = r12[r15]
            r1 = r6
            r6 = r8
            r8 = r7
            goto L8e
        L68:
            r3 = r6
            r6 = r8
            r8 = r7
            r7 = r15
            goto L30
        L6d:
            int r14 = r3 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r7 + r13
        L75:
            if (r7 != r15) goto L78
            return r9
        L78:
            r1 = r12[r7]
            if (r3 != r1) goto L95
            int r7 = r7 + r13
            r3 = r12[r7]
            if (r14 != r4) goto L8d
            ᵔﾞ.ﾞˊ r8 = r8.f16103
            int r1 = r8.f16099
            int r4 = r8.f16101
            byte[] r6 = r8.f16102
            if (r8 != r0) goto L8e
            r8 = r10
            goto L8e
        L8d:
            r1 = r14
        L8e:
            if (r3 < 0) goto L91
            return r3
        L91:
            int r7 = -r3
            r3 = r1
            r1 = -2
            goto L17
        L95:
            int r7 = r7 + 1
            r1 = -2
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: p376.AbstractC4321.m9822(ᵔﾞ.ʿʼ, ᵔﾞ.ᵎˏ, boolean):int");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m9823(C4172 c4172, int i, byte[] bArr, int i2) {
        int i3 = c4172.f16101;
        byte[] bArr2 = c4172.f16102;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c4172 = c4172.f16103;
                byte[] bArr3 = c4172.f16102;
                bArr2 = bArr3;
                i = c4172.f16099;
                i3 = c4172.f16101;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
