package p374;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p076.C1653;
import p076.C1663;
import p101.C1778;
import p254.C3156;
import p312.C3583;
import p312.C3589;
import p331.C3759;
import p383.AbstractC4470;
import p383.C4457;
import ˉʿ.ˑʽ;
import ـˈ.ˎـ;

/* renamed from: ᵢˎ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4240 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f16456;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1778 f16457;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f16458;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1653 f16459;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1778 f16460;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f16461;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1778 f16462;

    public C4240(C1653 c1653) {
        this.f16459 = c1653;
        int i = c1653.f6445;
        this.f16456 = i;
        this.f16458 = new C4457(32);
        C1778 c1778 = new C1778(i, 0L);
        this.f16462 = c1778;
        this.f16457 = c1778;
        this.f16460 = c1778;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C1778 m9697(C1778 c1778, long j, byte[] bArr, int i) {
        while (j >= c1778.f6897) {
            c1778 = (C1778) c1778.f6899;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c1778.f6897 - j));
            C1663 c1663 = (C1663) c1778.f6898;
            System.arraycopy(c1663.f6499, ((int) (j - c1778.f6900)) + c1663.f6498, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == c1778.f6897) {
                c1778 = (C1778) c1778.f6899;
            }
        }
        return c1778;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C1778 m9698(C1778 c1778, C3589 c3589, ˑʽ r14, C4457 c4457) {
        int iM10100;
        if (c3589.m4401(1073741824)) {
            long j = r14.ʽᐧ;
            c4457.m10099(1);
            C1778 c1778M9697 = m9697(c1778, j, c4457.f17171, 1);
            long j2 = j + 1;
            byte b = c4457.f17171[0];
            boolean z = (b & 128) != 0;
            int i = b & Byte.MAX_VALUE;
            C3583 c3583 = c3589.f13804;
            byte[] bArr = c3583.f13778;
            if (bArr == null) {
                c3583.f13778 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c1778 = m9697(c1778M9697, j2, c3583.f13778, i);
            long j3 = j2 + i;
            if (z) {
                c4457.m10099(2);
                c1778 = m9697(c1778, j3, c4457.f17171, 2);
                j3 += 2;
                iM10100 = c4457.m10100();
            } else {
                iM10100 = 1;
            }
            int[] iArr = c3583.f13781;
            if (iArr == null || iArr.length < iM10100) {
                iArr = new int[iM10100];
            }
            int[] iArr2 = c3583.f13774;
            if (iArr2 == null || iArr2.length < iM10100) {
                iArr2 = new int[iM10100];
            }
            if (z) {
                int i2 = iM10100 * 6;
                c4457.m10099(i2);
                c1778 = m9697(c1778, j3, c4457.f17171, i2);
                j3 += i2;
                c4457.m10108(0);
                for (int i3 = 0; i3 < iM10100; i3++) {
                    iArr[i3] = c4457.m10100();
                    iArr2[i3] = c4457.m10106();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = r14.ـﹶ - ((int) (j3 - r14.ʽᐧ));
            }
            C3156 c3156 = (C3156) r14.ˑʽ;
            int i4 = AbstractC4470.f17202;
            byte[] bArr2 = c3156.f12204;
            byte[] bArr3 = c3583.f13778;
            c3583.f13779 = iM10100;
            c3583.f13781 = iArr;
            c3583.f13774 = iArr2;
            c3583.f13773 = bArr2;
            c3583.f13778 = bArr3;
            int i5 = c3156.f12206;
            c3583.f13777 = i5;
            int i6 = c3156.f12205;
            c3583.f13780 = i6;
            int i7 = c3156.f12207;
            c3583.f13776 = i7;
            MediaCodec.CryptoInfo cryptoInfo = c3583.f13782;
            cryptoInfo.numSubSamples = iM10100;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (AbstractC4470.f17202 >= 24) {
                C3759 c3759 = c3583.f13775;
                c3759.getClass();
                ˎـ.ᵎـ((MediaCodec.CryptoInfo.Pattern) c3759.f14523, i6, i7);
                ˎـ.ˎٴ((MediaCodec.CryptoInfo) c3759.f14522, (MediaCodec.CryptoInfo.Pattern) c3759.f14523);
            }
            long j4 = r14.ʽᐧ;
            int i8 = (int) (j3 - j4);
            r14.ʽᐧ = j4 + i8;
            r14.ـﹶ -= i8;
        }
        if (!c3589.m4401(268435456)) {
            c3589.m8491(r14.ـﹶ);
            return m9699(c1778, r14.ʽᐧ, c3589.f13800, r14.ـﹶ);
        }
        c4457.m10099(4);
        C1778 c1778M96972 = m9697(c1778, r14.ʽᐧ, c4457.f17171, 4);
        int iM10106 = c4457.m10106();
        r14.ʽᐧ += 4;
        r14.ـﹶ -= 4;
        c3589.m8491(iM10106);
        C1778 c1778M9699 = m9699(c1778M96972, r14.ʽᐧ, c3589.f13800, iM10106);
        r14.ʽᐧ += iM10106;
        int i9 = r14.ـﹶ - iM10106;
        r14.ـﹶ = i9;
        ByteBuffer byteBuffer = c3589.f13801;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            c3589.f13801 = ByteBuffer.allocate(i9);
        } else {
            c3589.f13801.clear();
        }
        return m9699(c1778M9699, r14.ʽᐧ, c3589.f13801, r14.ـﹶ);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C1778 m9699(C1778 c1778, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c1778.f6897) {
            c1778 = (C1778) c1778.f6899;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c1778.f6897 - j));
            C1663 c1663 = (C1663) c1778.f6898;
            byteBuffer.put(c1663.f6499, ((int) (j - c1778.f6900)) + c1663.f6498, iMin);
            i -= iMin;
            j += iMin;
            if (j == c1778.f6897) {
                c1778 = (C1778) c1778.f6899;
            }
        }
        return c1778;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9700(long j) {
        C1778 c1778;
        if (j == -1) {
            return;
        }
        while (true) {
            c1778 = this.f16462;
            if (j < c1778.f6897) {
                break;
            }
            C1653 c1653 = this.f16459;
            C1663 c1663 = (C1663) c1778.f6898;
            synchronized (c1653) {
                C1663[] c1663Arr = c1653.f6449;
                int i = c1653.f6446;
                c1653.f6446 = i + 1;
                c1663Arr[i] = c1663;
                c1653.f6450--;
                c1653.notifyAll();
            }
            C1778 c17782 = this.f16462;
            c17782.f6898 = null;
            C1778 c17783 = (C1778) c17782.f6899;
            c17782.f6899 = null;
            this.f16462 = c17783;
        }
        if (this.f16457.f6900 < c1778.f6900) {
            this.f16457 = c1778;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m9701(int i) {
        C1663 c1663;
        C1778 c1778 = this.f16460;
        if (((C1663) c1778.f6898) == null) {
            C1653 c1653 = this.f16459;
            synchronized (c1653) {
                try {
                    int i2 = c1653.f6450 + 1;
                    c1653.f6450 = i2;
                    int i3 = c1653.f6446;
                    if (i3 > 0) {
                        C1663[] c1663Arr = c1653.f6449;
                        int i4 = i3 - 1;
                        c1653.f6446 = i4;
                        c1663 = c1663Arr[i4];
                        c1663.getClass();
                        c1653.f6449[c1653.f6446] = null;
                    } else {
                        C1663 c16632 = new C1663(0, new byte[c1653.f6445]);
                        C1663[] c1663Arr2 = c1653.f6449;
                        if (i2 > c1663Arr2.length) {
                            c1653.f6449 = (C1663[]) Arrays.copyOf(c1663Arr2, c1663Arr2.length * 2);
                        }
                        c1663 = c16632;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1778 c17782 = new C1778(this.f16456, this.f16460.f6897);
            c1778.f6898 = c1663;
            c1778.f6899 = c17782;
        }
        return Math.min(i, (int) (this.f16460.f6897 - this.f16461));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9702(C1778 c1778) {
        if (((C1663) c1778.f6898) == null) {
            return;
        }
        C1653 c1653 = this.f16459;
        synchronized (c1653) {
            C1778 c17782 = c1778;
            while (c17782 != null) {
                try {
                    C1663[] c1663Arr = c1653.f6449;
                    int i = c1653.f6446;
                    c1653.f6446 = i + 1;
                    C1663 c1663 = (C1663) c17782.f6898;
                    c1663.getClass();
                    c1663Arr[i] = c1663;
                    c1653.f6450--;
                    c17782 = (C1778) c17782.f6899;
                    if (c17782 == null || ((C1663) c17782.f6898) == null) {
                        c17782 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1653.notifyAll();
        }
        c1778.f6898 = null;
        c1778.f6899 = null;
    }
}
