package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᵢᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0666 implements InterfaceC0647 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m2714(byte[] bArr, int i, int i2) {
        int iM2549;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iM2549 = 0;
        } else {
            while (i < i2) {
                int i3 = i + 1;
                iM2549 = bArr[i];
                if (iM2549 < 0) {
                    if (iM2549 >= -32) {
                        if (iM2549 >= -16) {
                            if (i3 < i2 - 2) {
                                int i4 = i + 2;
                                byte b = bArr[i3];
                                if (b <= -65) {
                                    if ((((b + 112) + (iM2549 << 28)) >> 30) == 0) {
                                        int i5 = i + 3;
                                        if (bArr[i4] <= -65) {
                                            i += 4;
                                            if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
                                iM2549 = -1;
                                break;
                            }
                            iM2549 = AbstractC0585.m2549(bArr, i3, i2);
                            break;
                        }
                        if (i3 < i2 - 1) {
                            int i6 = i + 2;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((iM2549 != -32 || b2 >= -96) && (iM2549 != -19 || b2 < -96))) {
                                i += 3;
                                if (bArr[i6] > -65) {
                                }
                            }
                            iM2549 = -1;
                            break;
                        }
                        iM2549 = AbstractC0585.m2549(bArr, i3, i2);
                        break;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    if (iM2549 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iM2549 = -1;
                    break;
                }
                i = i3;
            }
            iM2549 = 0;
        }
        return iM2549 == 0;
    }
}
