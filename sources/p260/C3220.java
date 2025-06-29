package p260;

import com.hierynomus.ntlm.NtlmException;
import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import com.hierynomus.security.SecurityException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import com.hierynomus.spnego.SpnegoException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import p038.C1268;
import p051.C1314;
import p087.C1737;
import p088.C1739;
import p091.C1752;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p117.EnumC1844;
import p117.EnumC1846;
import p154.C2328;
import p180.AbstractC2497;
import p180.AbstractC2500;
import p201.C2760;
import p332.C3776;
import p332.C3779;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p359.C4074;
import p359.C4077;
import p359.C4081;
import p359.EnumC4075;
import p359.EnumC4078;
import p409.InterfaceC4673;
import p409.InterfaceC4674;
import p419.C4852;
import p419.C4853;
import p456.C5349;
import ˈˉ.ﹳﹳ;

/* renamed from: יﹶ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3220 implements InterfaceC3219 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final InterfaceC3918 f12532 = AbstractC3917.m9105(C3220.class);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1737 f12533 = new C1737("1.3.6.1.4.1.311.2.2.10");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public SecureRandom f12534;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f12535;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public InterfaceC4674 f12536;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f12537;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static byte[] m7921(C4074 c4074) throws IOException, SpnegoException {
        C3776 c3776 = new C3776();
        c4074.m9369(c3776);
        if (c4074.f15707) {
            byte[] bArr = c4074.f15710;
            c3776.mo6213(bArr.length, bArr);
        }
        byte[] bArr2 = c4074.f15708;
        c3776.mo6213(bArr2.length, bArr2);
        byte[] bArr3 = c4074.f15713;
        c3776.mo6213(bArr3.length, bArr3);
        byte[] bArr4 = c4074.f15709;
        c3776.mo6213(bArr4.length, bArr4);
        byte[] bArr5 = c4074.f15714;
        c3776.mo6213(bArr5.length, bArr5);
        byte[] bArr6 = c4074.f15711;
        c3776.mo6213(bArr6.length, bArr6);
        byte[] bArr7 = c4074.f15712;
        c3776.mo6213(bArr7.length, bArr7);
        byte[] bArrM8838 = c3776.m8838();
        C3776 c37762 = new C3776();
        ArrayList arrayList = new ArrayList();
        EnumC1844 enumC1844 = EnumC1844.f7069;
        EnumC1846 enumC1846 = EnumC1846.f7088;
        try {
            if (bArrM8838.length > 0) {
                arrayList.add(new C4852(AbstractC1845.m5606(enumC1846, 2).m5607(enumC1844), (AbstractC1841) new C2760(bArrM8838), true));
            }
            C4852 c4852 = new C4852(AbstractC1845.m5606(enumC1846, 1).m5607(enumC1844), (AbstractC1841) new C4853(arrayList), true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1752 c1752 = new C1752(new ﹳﹳ(13), byteArrayOutputStream);
            try {
                c1752.m5468(c4852);
                c1752.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                c37762.mo6213(byteArray.length, byteArray);
                return c37762.m8838();
            } finally {
            }
        } catch (IOException e) {
            throw new SpnegoException("Could not write NegTokenTarg to buffer", e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static byte[] m7922(C4081 c4081) throws SpnegoException {
        C1314 c1314 = new C1314();
        ((ArrayList) c1314.f5359).add(f12533);
        C3776 c3776 = new C3776();
        c3776.m8846("NTLMSSP\u0000", AbstractC2497.f9930);
        c3776.m8844(1L);
        c3776.m8844(c4081.f15751);
        c3776.m8847(0);
        c3776.m8847(0);
        c3776.m8844(0L);
        c3776.m8847(0);
        c3776.m8847(0);
        c3776.m8844(0L);
        c1314.f5361 = c3776.m8838();
        C3776 c37762 = new C3776();
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) c1314.f5359;
            int size = arrayList2.size();
            EnumC1844 enumC1844 = EnumC1844.f7069;
            EnumC1846 enumC1846 = EnumC1846.f7088;
            if (size > 0) {
                arrayList.add(new C4852(AbstractC1845.m5606(enumC1846, 0).m5607(enumC1844), (AbstractC1841) new C4853(new ArrayList(arrayList2)), true));
            }
            byte[] bArr = c1314.f5361;
            if (bArr != null && bArr.length > 0) {
                arrayList.add(new C4852(AbstractC1845.m5606(enumC1846, 2).m5607(enumC1844), (AbstractC1841) new C2760(c1314.f5361), true));
            }
            c1314.mo570(c37762, new C4853(arrayList));
            return c37762.m8838();
        } catch (IOException e) {
            throw new SpnegoException("Unable to write NegTokenInit", e);
        }
    }

    @Override // p260.InterfaceC3219
    /* renamed from: ʽᐧ */
    public final C5349 mo7918(C3222 c3222, byte[] bArr) throws IOException, InvalidKeyException {
        byte[] bArr2;
        int i = 1;
        try {
            C5349 c5349 = new C5349(11);
            if (this.f12537) {
                return null;
            }
            boolean z = this.f12535;
            InterfaceC3918 interfaceC3918 = f12532;
            if (!z) {
                interfaceC3918.mo5517((String) c3222.f12538, "Initialized Authentication of {} using NTLM");
                C4081 c4081 = new C4081();
                c4081.f15751 = C4081.f15750;
                this.f12535 = true;
                c5349.f20756 = m7922(c4081);
                return c5349;
            }
            interfaceC3918.mo5517(AbstractC2500.m6611(bArr), "Received token: {}");
            SecureRandom secureRandom = this.f12534;
            InterfaceC4674 interfaceC4674 = this.f12536;
            C2328 c2328 = new C2328(secureRandom, interfaceC4674);
            C1314 c1314 = new C1314(i, "NegTokenTarg");
            c1314.m4617(bArr);
            C4077 c4077 = new C4077();
            HashMap map = new HashMap();
            c4077.f15733 = map;
            try {
                c4077.m9370(new C3776(c1314.f5361, true, C3779.f14620));
                interfaceC3918.mo5517(c4077.f15741, "Received NTLM challenge from: {}");
                Object obj = map.get(EnumC4078.f15742);
                if (obj != null) {
                    String.valueOf(obj);
                }
                byte[] bArr3 = c4077.f15735;
                String strValueOf = String.valueOf((char[]) c3222.f12540);
                String str = (String) c3222.f12538;
                String str2 = (String) c3222.f12539;
                byte[] bytes = strValueOf == null ? new byte[0] : strValueOf.getBytes(AbstractC2497.f9929);
                try {
                    InterfaceC4673 interfaceC4673M10576 = interfaceC4674.m10576();
                    interfaceC4673M10576.mo6783(bytes);
                    byte[] bArrMo6784 = interfaceC4673M10576.mo6784();
                    String upperCase = str.toUpperCase();
                    byte[] bArrM6414 = c2328.m6414(bArrMo6784, upperCase == null ? new byte[0] : upperCase.getBytes(AbstractC2497.f9929), str2 == null ? new byte[0] : str2.getBytes(AbstractC2497.f9929));
                    byte[] bArrM6415 = c2328.m6415(c4077.f15736);
                    byte[] bArrM64142 = c2328.m6414(bArrM6414, bArr3, bArrM6415);
                    byte[] bArr4 = new byte[bArrM64142.length + bArrM6415.length];
                    System.arraycopy(bArrM64142, 0, bArr4, 0, bArrM64142.length);
                    System.arraycopy(bArrM6415, 0, bArr4, bArrM64142.length, bArrM6415.length);
                    byte[] bArrM64143 = c2328.m6414(bArrM6414, Arrays.copyOfRange(bArr4, 0, 16));
                    EnumSet enumSet = c4077.f15740;
                    if (enumSet.contains(EnumC4075.f15720) && (enumSet.contains(EnumC4075.f15728) || enumSet.contains(EnumC4075.f15725) || enumSet.contains(EnumC4075.f15719))) {
                        byte[] bArr5 = new byte[16];
                        this.f12534.nextBytes(bArr5);
                        try {
                            C1739 c1739M10575 = interfaceC4674.m10575();
                            c1739M10575.m5459(bArrM64143);
                            byte[] bArr6 = new byte[16];
                            try {
                                c1739M10575.m5461(c1739M10575.m5460(bArr5, 16, bArr6), bArr6);
                                c5349.f20757 = bArr5;
                                bArr2 = bArr6;
                            } catch (SecurityException e) {
                                throw new NtlmException(e);
                            }
                        } catch (SecurityException e2) {
                            throw new NtlmException(e2);
                        }
                    } else {
                        c5349.f20757 = bArrM64143;
                        bArr2 = bArrM64143;
                    }
                    this.f12537 = true;
                    Object obj2 = map.get(EnumC4078.f15743);
                    if (!(obj2 instanceof Long) || (((Long) obj2).longValue() & 2) <= 0) {
                        c5349.f20756 = m7921(new C4074(new byte[0], bArr4, str, (String) c3222.f12539, bArr2, AbstractC2500.m6610(enumSet), false));
                        return c5349;
                    }
                    C4074 c4074 = new C4074(new byte[0], bArr4, str, (String) c3222.f12539, bArr2, AbstractC2500.m6610(enumSet), true);
                    C3776 c3776 = new C3776();
                    byte[] bArr7 = c1314.f5361;
                    c3776.mo6213(bArr7.length, bArr7);
                    byte[] bArr8 = c4077.f15735;
                    c3776.mo6213(bArr8.length, bArr8);
                    c4074.m9369(c3776);
                    c4074.f15710 = c2328.m6414(bArrM64143, c3776.m8838());
                    c5349.f20756 = m7921(c4074);
                    return c5349;
                } catch (SecurityException e3) {
                    throw new NtlmException(e3);
                }
            } catch (Buffer$BufferException e4) {
                throw new IOException(e4);
            }
        } catch (SpnegoException e5) {
            throw new SMBRuntimeException(e5);
        }
    }

    @Override // p260.InterfaceC3219
    /* renamed from: ˑʽ */
    public final void mo7919(C1268 c1268) {
        this.f12536 = c1268.f5199;
        this.f12534 = c1268.f5201;
    }

    @Override // p260.InterfaceC3219
    /* renamed from: ـﹶ */
    public final boolean mo7920(C3222 c3222) {
        return c3222.getClass().equals(C3222.class);
    }
}
