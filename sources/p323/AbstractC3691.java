package p323;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import p034.AbstractC1227;
import p105.C1796;
import p254.InterfaceC3168;
import p254.InterfaceC3173;
import p345.AbstractC3980;
import p380.AbstractC4424;
import p380.C4423;
import p380.C4428;
import p380.C4432;
import p383.AbstractC4464;
import p383.C4457;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ᴵˊ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3691 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f14213 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m8636(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        int[] iArr = f14213;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C4428 m8637(int i, String str, C4457 c4457) {
        int iM10092 = c4457.m10092();
        if (c4457.m10092() == 1684108385 && iM10092 >= 22) {
            c4457.m10085(10);
            int iM10100 = c4457.m10100();
            if (iM10100 > 0) {
                String str2 = ˉᵎ.ˉⁱ("", iM10100);
                int iM101002 = c4457.m10100();
                if (iM101002 > 0) {
                    str2 = str2 + "/" + iM101002;
                }
                return new C4428(str, null, AbstractC3980.m9207(str2));
            }
        }
        AbstractC4464.m10144("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC1227.m4400(i));
        return null;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C4428 m8638(int i, String str, C4457 c4457) {
        int iM10092 = c4457.m10092();
        if (c4457.m10092() == 1684108385) {
            c4457.m10085(8);
            return new C4428(str, null, AbstractC3980.m9207(c4457.m10089(iM10092 - 16)));
        }
        AbstractC4464.m10144("MetadataUtil", "Failed to parse text attribute: " + AbstractC1227.m4400(i));
        return null;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static InterfaceC3173 m8639(InterfaceC3168 interfaceC3168, boolean z, boolean z2) {
        boolean z3;
        long j;
        long jM10094;
        int i;
        C4457 c4457;
        int[] iArr;
        long j2;
        boolean z4 = true;
        long jMo4861 = interfaceC3168.mo4861();
        long j3 = 4096;
        long j4 = -1;
        if (jMo4861 != -1 && jMo4861 <= 4096) {
            j3 = jMo4861;
        }
        int i2 = (int) j3;
        C4457 c44572 = new C4457(64);
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            c44572.m10099(8);
            if (!interfaceC3168.mo4875(c44572.f17171, 0, 8, z4)) {
                break;
            }
            long jM10110 = c44572.m10110();
            int iM10092 = c44572.m10092();
            if (jM10110 == 1) {
                interfaceC3168.mo4853(c44572.f17171, 8, 8);
                i = 16;
                c44572.m10104(16);
                jM10094 = c44572.m10094();
                j = jMo4861;
            } else {
                if (jM10110 == 0) {
                    long jMo48612 = interfaceC3168.mo4861();
                    if (jMo48612 != j4) {
                        jM10110 = (jMo48612 - interfaceC3168.mo4865()) + 8;
                    }
                }
                j = jMo4861;
                jM10094 = jM10110;
                i = 8;
            }
            long j5 = i;
            if (jM10094 < j5) {
                return new C3687();
            }
            i3 += i;
            if (iM10092 == 1836019574) {
                i2 += (int) jM10094;
                if (jMo4861 == -1 || i2 <= j) {
                    j2 = j;
                } else {
                    j2 = j;
                    i2 = (int) j2;
                }
                jMo4861 = j2;
            } else {
                if (iM10092 == 1836019558 || iM10092 == 1836475768) {
                    z3 = true;
                    break;
                }
                if (iM10092 == 1835295092) {
                    z5 = true;
                }
                C4457 c44573 = c44572;
                if ((i3 + jM10094) - j5 >= i2) {
                    break;
                }
                int i4 = (int) (jM10094 - j5);
                i3 += i4;
                if (iM10092 != 1718909296) {
                    c4457 = c44573;
                    if (i4 != 0) {
                        interfaceC3168.mo4870(i4);
                    }
                } else {
                    if (i4 < 8) {
                        return new C3687();
                    }
                    c4457 = c44573;
                    c4457.m10099(i4);
                    interfaceC3168.mo4853(c4457.f17171, 0, i4);
                    if (m8636(c4457.m10092(), z2)) {
                        z5 = true;
                    }
                    c4457.m10085(4);
                    int iM10096 = c4457.m10096() / 4;
                    if (!z5 && iM10096 > 0) {
                        iArr = new int[iM10096];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iM10096) {
                                break;
                            }
                            int iM100922 = c4457.m10092();
                            iArr[i5] = iM100922;
                            if (m8636(iM100922, z2)) {
                                z5 = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (!z5) {
                        C3687 c3687 = new C3687();
                        if (iArr != null) {
                            int i6 = C1796.f6941;
                            if (iArr.length != 0) {
                                new C1796(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i7 = C1796.f6941;
                        }
                        return c3687;
                    }
                }
                c44572 = c4457;
                jMo4861 = j;
            }
            z4 = true;
            j4 = -1;
        }
        z3 = false;
        if (!z5) {
            return C3687.f14194;
        }
        if (z != z3) {
            return z3 ? C3687.f14195 : C3687.f14193;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static ᐧʻ m8640(byte[] bArr) {
        C4457 c4457 = new C4457(bArr);
        if (c4457.f17170 < 32) {
            return null;
        }
        c4457.m10108(0);
        int iM10096 = c4457.m10096();
        int iM10092 = c4457.m10092();
        if (iM10092 != iM10096) {
            AbstractC4464.m10144("PsshAtomUtil", "Advertised atom size (" + iM10092 + ") does not match buffer size: " + iM10096);
            return null;
        }
        int iM100922 = c4457.m10092();
        if (iM100922 != 1886614376) {
            ᵎˏ.ʿˏ(iM100922, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iM4399 = AbstractC1227.m4399(c4457.m10092());
        if (iM4399 > 1) {
            ᵎˏ.ʿˏ(iM4399, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c4457.m10094(), c4457.m10094());
        if (iM4399 == 1) {
            int iM10106 = c4457.m10106();
            UUID[] uuidArr = new UUID[iM10106];
            for (int i = 0; i < iM10106; i++) {
                uuidArr[i] = new UUID(c4457.m10094(), c4457.m10094());
            }
        }
        int iM101062 = c4457.m10106();
        int iM100962 = c4457.m10096();
        if (iM101062 == iM100962) {
            ?? r2 = new byte[iM101062];
            c4457.m10097(r2, 0, iM101062);
            return new ᐧʻ(uuid, iM4399, (Serializable) r2, 11);
        }
        AbstractC4464.m10144("PsshAtomUtil", "Atom data size (" + iM101062 + ") does not match the bytes left: " + iM100962);
        return null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C4423 m8641(int i, C4457 c4457) {
        int iM10092 = c4457.m10092();
        if (c4457.m10092() == 1684108385) {
            c4457.m10085(8);
            String strM10089 = c4457.m10089(iM10092 - 16);
            return new C4423("und", strM10089, strM10089);
        }
        AbstractC4464.m10144("MetadataUtil", "Failed to parse comment attribute: " + AbstractC1227.m4400(i));
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m8642(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m8643(C4457 c4457) {
        int iM10092 = c4457.m10092();
        if (c4457.m10092() == 1684108385) {
            c4457.m10085(8);
            int i = iM10092 - 16;
            if (i == 1) {
                return c4457.m10086();
            }
            if (i == 2) {
                return c4457.m10100();
            }
            if (i == 3) {
                return c4457.m10095();
            }
            if (i == 4 && (c4457.m10078() & 128) == 0) {
                return c4457.m10106();
            }
        }
        AbstractC4464.m10144("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static AbstractC4424 m8644(int i, String str, C4457 c4457, boolean z, boolean z2) {
        int iM8643 = m8643(c4457);
        if (z2) {
            iM8643 = Math.min(1, iM8643);
        }
        if (iM8643 >= 0) {
            return z ? new C4428(str, null, AbstractC3980.m9207(Integer.toString(iM8643))) : new C4423("und", str, Integer.toString(iM8643));
        }
        AbstractC4464.m10144("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC1227.m4400(i));
        return null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C4432 m8645(C4457 c4457) {
        int iM10092 = c4457.m10092();
        if (c4457.m10092() != 1684108385) {
            AbstractC4464.m10144("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM100922 = c4457.m10092() & 16777215;
        String str = iM100922 == 13 ? "image/jpeg" : iM100922 == 14 ? "image/png" : null;
        if (str == null) {
            ᵎˏ.ʿˏ(iM100922, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c4457.m10085(4);
        int i = iM10092 - 16;
        byte[] bArr = new byte[i];
        c4457.m10097(bArr, 0, i);
        return new C4432(str, null, 3, bArr);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static byte[] m8646(UUID uuid, byte[] bArr) {
        ᐧʻ r4 = m8640(bArr);
        if (r4 == null) {
            return null;
        }
        UUID uuid2 = (UUID) r4.ˎˑ;
        if (uuid.equals(uuid2)) {
            return (byte[]) r4.ᐧˋ;
        }
        AbstractC4464.m10144("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
