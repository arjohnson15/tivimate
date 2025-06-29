package p188;

import android.util.Log;
import androidx.leanback.widget.ﾞᐧ;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p046.C1304;
import p137.C2106;
import p314.InterfaceC3603;
import p329.AbstractC3740;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˎʾ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2621 implements InterfaceC3603 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f10408 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f10407 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m6799(InterfaceC2615 interfaceC2615, C2106 c2106) {
        try {
            int iMo4606 = interfaceC2615.mo4606();
            if (!((iMo4606 & 65496) == 65496 || iMo4606 == 19789 || iMo4606 == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    String str = "Parser doesn't handle magic number: " + iMo4606;
                }
                return -1;
            }
            int iM6802 = m6802(interfaceC2615);
            if (iM6802 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                }
                return -1;
            }
            byte[] bArr = (byte[]) c2106.m5971(iM6802, byte[].class);
            try {
                return m6800(interfaceC2615, bArr, iM6802);
            } finally {
                c2106.m5966(bArr);
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m6800(InterfaceC2615 interfaceC2615, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo4605 = interfaceC2615.mo4605(i, bArr);
        if (iMo4605 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str = "Unable to read exif segment data, length: " + i + ", actually read: " + iMo4605;
            }
            return -1;
        }
        short s = 1;
        int i2 = 0;
        byte[] bArr2 = f10408;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            int i3 = 0;
            while (true) {
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            }
            return -1;
        }
        C2637 c2637 = new C2637(i, bArr);
        short sM6820 = c2637.m6820(6);
        if (sM6820 != 18761) {
            if (sM6820 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str2 = "Unknown endianness = " + ((int) sM6820);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        ByteBuffer byteBuffer = c2637.f10446;
        byteBuffer.order(byteOrder);
        int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sM68202 = c2637.m6820(i4 + 6);
        while (i2 < sM68202) {
            int i5 = (i2 * 12) + i4 + 8;
            short sM68203 = c2637.m6820(i5);
            if (sM68203 == 274) {
                short sM68204 = c2637.m6820(i5 + 2);
                if (sM68204 >= s && sM68204 <= 12) {
                    int i6 = i5 + 4;
                    int i7 = byteBuffer.remaining() - i6 >= 4 ? byteBuffer.getInt(i6) : -1;
                    if (i7 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb = ᐧʻ.ᵎـ("Got tagIndex=", i2, " tagType=", sM68203, " formatCode=");
                            sb.append((int) sM68204);
                            sb.append(" componentCount=");
                            sb.append(i7);
                            sb.toString();
                        }
                        int i8 = i7 + f10407[sM68204];
                        if (i8 <= 4) {
                            int i9 = i5 + 8;
                            if (i9 < 0 || i9 > byteBuffer.remaining()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    String str3 = "Illegal tagValueOffset=" + i9 + " tagType=" + ((int) sM68203);
                                }
                            } else {
                                if (i8 >= 0 && i8 + i9 <= byteBuffer.remaining()) {
                                    return c2637.m6820(i9);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    String str4 = "Illegal number of bytes for TI tag data tagType=" + ((int) sM68203);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            String str5 = "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM68204);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    String str6 = "Got invalid format code = " + ((int) sM68204);
                }
            }
            i2++;
            s = 1;
        }
        return -1;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m6801(InterfaceC2615 interfaceC2615) {
        try {
            int iMo4606 = interfaceC2615.mo4606();
            if (iMo4606 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo4604 = (iMo4606 << 8) | interfaceC2615.mo4604();
            if (iMo4604 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo46042 = (iMo4604 << 8) | interfaceC2615.mo4604();
            if (iMo46042 == -1991225785) {
                interfaceC2615.skip(21L);
                try {
                    return interfaceC2615.mo4604() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo46042 == 1380533830) {
                interfaceC2615.skip(4L);
                if (((interfaceC2615.mo4606() << 16) | interfaceC2615.mo4606()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo46062 = (interfaceC2615.mo4606() << 16) | interfaceC2615.mo4606();
                if ((iMo46062 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo46062 & 255;
                if (i == 88) {
                    interfaceC2615.skip(4L);
                    short sMo4604 = interfaceC2615.mo4604();
                    return (sMo4604 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo4604 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC2615.skip(4L);
                return (interfaceC2615.mo4604() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC2615.mo4606() << 16) | interfaceC2615.mo4606()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo46063 = (interfaceC2615.mo4606() << 16) | interfaceC2615.mo4606();
            if (iMo46063 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo46063 == 1635150182;
            interfaceC2615.skip(4L);
            int i3 = iMo46042 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo46064 = (interfaceC2615.mo4606() << 16) | interfaceC2615.mo4606();
                    if (iMo46064 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo46064 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m6802(InterfaceC2615 interfaceC2615) {
        short sMo4604;
        int iMo4606;
        long j;
        long jSkip;
        do {
            short sMo46042 = interfaceC2615.mo4604();
            if (sMo46042 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    String str = "Unknown segmentId=" + ((int) sMo46042);
                }
                return -1;
            }
            sMo4604 = interfaceC2615.mo4604();
            if (sMo4604 == 218) {
                return -1;
            }
            if (sMo4604 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                }
                return -1;
            }
            iMo4606 = interfaceC2615.mo4606() - 2;
            if (sMo4604 == 225) {
                return iMo4606;
            }
            j = iMo4606;
            jSkip = interfaceC2615.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb = ᐧʻ.ᵎـ("Unable to skip enough data, type: ", sMo4604, ", wanted to skip: ", iMo4606, ", but actually skipped: ");
            sb.append(jSkip);
            sb.toString();
        }
        return -1;
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ʽᐧ */
    public final int mo6795(InputStream inputStream, C2106 c2106) {
        ﾞᐧ r0 = new ﾞᐧ(23, inputStream);
        AbstractC3740.m8706(c2106, "Argument must not be null");
        return m6799(r0, c2106);
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ˑʽ */
    public final int mo6796(ByteBuffer byteBuffer, C2106 c2106) {
        C1304 c1304 = new C1304(1, byteBuffer);
        AbstractC3740.m8706(c2106, "Argument must not be null");
        return m6799(c1304, c2106);
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ـﹶ */
    public final ImageHeaderParser$ImageType mo6797(ByteBuffer byteBuffer) {
        AbstractC3740.m8706(byteBuffer, "Argument must not be null");
        return m6801(new C1304(1, byteBuffer));
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ﹳﹳ */
    public final ImageHeaderParser$ImageType mo6798(InputStream inputStream) {
        return m6801(new ﾞᐧ(23, inputStream));
    }
}
