package p446;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.io.Closeable;
import p018.C1097;
import p018.C1104;
import p018.C1106;
import p018.C1111;
import p078.EnumC1683;
import p193.AbstractC2685;
import p193.C2687;
import p193.C2705;
import p193.InterfaceC2689;
import p193.InterfaceC2692;
import p193.InterfaceC2698;
import p283.C3380;
import p332.C3776;
import p332.C3779;
import p344.AbstractC3917;
import p344.InterfaceC3918;

/* renamed from: ﾞˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5164 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C5168 f19732;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C0559 f19733;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f19734;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3918 f19735 = AbstractC3917.m9105(getClass());

    public AbstractC5164(C0559 c0559, C5168 c5168, String str) {
        this.f19732 = c5168;
        this.f19733 = c0559;
        this.f19734 = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5168 c5168 = this.f19732;
        C0559 c0559 = this.f19733;
        c5168.getClass();
        C1106 c1106 = new C1106(24, c5168.f19712, EnumC1683.f6542, c5168.f19710, c5168.f19714, 0);
        c1106.f4702 = c0559;
        c5168.m11457(c1106, "Close", c0559, AbstractC5160.f19709, c5168.f19722);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final InterfaceC2698 m11460() {
        C5168 c5168 = this.f19732;
        c5168.getClass();
        InterfaceC2689 interfaceC2689M6863 = AbstractC2685.m6863(C2687.class);
        int iMo6865 = interfaceC2689M6863.mo6865();
        C0559 c0559 = this.f19733;
        try {
            return (InterfaceC2698) interfaceC2689M6863.mo6864(new C3776(((C1104) c5168.m11457(new C1111(c5168.f19712, c5168.f19710, c5168.f19714, c0559, iMo6865), "QueryInfo", c0559, InterfaceC5161.f19723, c5168.f19722)).f4700, true, C3779.f14620));
        } catch (Buffer$BufferException e) {
            throw new SMBRuntimeException(e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m11461() throws Throwable {
        C5168 c5168 = this.f19732;
        c5168.getClass();
        C2705 c2705 = new C2705();
        c2705.f10605 = true;
        C3380 c3380 = new C3380();
        InterfaceC2692 interfaceC2692 = (InterfaceC2692) AbstractC2685.f10595.get(C2705.class);
        if (interfaceC2692 == null) {
            throw new IllegalArgumentException("FileInformationClass not supported - " + C2705.class);
        }
        interfaceC2692.mo6866(c2705, c3380);
        int iMo6865 = interfaceC2692.mo6865();
        byte[] bArrM8838 = c3380.m8838();
        C0559 c0559 = this.f19733;
        c5168.m11457(new C1097(c5168.f19712, c5168.f19710, c5168.f19714, c0559, iMo6865, bArrM8838), "SetInfo", c0559, InterfaceC5161.f19723, c5168.f19722);
    }
}
