package p379;

import p158.AbstractC2339;
import p317.AbstractC3625;
import p366.C4155;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢᐧ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4397 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String[] f16934;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String[] f16935;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4155 f16936;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String[] f16937;

    static {
        C4155 c4155 = new C4155("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(AbstractC3625.f13869));
        c4155.f16069 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f16936 = c4155;
        f16934 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f16935 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = AbstractC2339.m6442("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f16937 = strArr;
        String[] strArr2 = f16935;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = ᵎˏ.ˎٴ(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f16935;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = ᵎˏ.ˎٴ(sb, strArr3[i4], "|PADDED");
        }
        int length = f16935.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f16935;
            if (strArr4[i7] == null) {
                strArr4[i7] = f16937[i7];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m9987(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 1
            java.lang.String[] r6 = p379.AbstractC4397.f16934
            int r7 = r6.length
            if (r13 >= r7) goto Le
            r6 = r6[r13]
            goto L1c
        Le:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r6
            java.lang.String r6 = "0x%02x"
            java.lang.String r6 = p158.AbstractC2339.m6442(r6, r7)
        L1c:
            if (r14 != 0) goto L21
            java.lang.String r13 = ""
            goto L67
        L21:
            java.lang.String[] r7 = p379.AbstractC4397.f16937
            if (r13 == r2) goto L65
            if (r13 == r1) goto L65
            if (r13 == r3) goto L5d
            r8 = 6
            if (r13 == r8) goto L5d
            r8 = 7
            if (r13 == r8) goto L65
            r8 = 8
            if (r13 == r8) goto L65
            java.lang.String[] r8 = p379.AbstractC4397.f16935
            int r9 = r8.length
            if (r14 >= r9) goto L3b
            r7 = r8[r14]
            goto L3d
        L3b:
            r7 = r7[r14]
        L3d:
            if (r13 != r0) goto L4c
            r8 = r14 & 4
            if (r8 == 0) goto L4c
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = p317.AbstractC3629.m8559(r7, r13, r14, r4)
            goto L67
        L4c:
            if (r13 != 0) goto L5b
            r13 = r14 & 32
            if (r13 == 0) goto L5b
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = p317.AbstractC3629.m8559(r7, r13, r14, r4)
            goto L67
        L5b:
            r13 = r7
            goto L67
        L5d:
            if (r14 != r5) goto L62
            java.lang.String r13 = "ACK"
            goto L67
        L62:
            r13 = r7[r14]
            goto L67
        L65:
            r13 = r7[r14]
        L67:
            if (r10 == 0) goto L6c
            java.lang.String r10 = "<<"
            goto L6e
        L6c:
            java.lang.String r10 = ">>"
        L6e:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r4] = r10
            r14[r5] = r11
            r14[r2] = r12
            r14[r1] = r6
            r14[r3] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = p158.AbstractC2339.m6442(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.AbstractC4397.m9987(boolean, int, int, int, int):java.lang.String");
    }
}
