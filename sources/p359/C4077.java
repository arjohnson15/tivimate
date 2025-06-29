package p359;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.util.EnumSet;
import java.util.HashMap;
import p180.AbstractC2497;
import p180.AbstractC2500;
import p332.C3776;
import p332.C3779;
import p334.C3789;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p383.C4456;
import ʼˉ.ٴˎ;

/* renamed from: ᵔי.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4077 extends ٴˎ {

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final InterfaceC3918 f15732 = AbstractC3917.m9105(C4077.class);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public HashMap f15733;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f15734;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public byte[] f15735;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public byte[] f15736;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f15737;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f15738;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f15739;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public EnumSet f15740;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public String f15741;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m9370(C3776 c3776) throws Buffer$BufferException {
        c3776.m8840(8, AbstractC2497.f9930);
        c3776.f14613.m8854(c3776);
        C3779 c3779 = c3776.f14613;
        this.f15734 = c3779.m8852(c3776);
        c3776.m8843(2);
        this.f15739 = c3776.m8848();
        this.f15740 = AbstractC2500.m6614(c3779.m8854(c3776), EnumC4075.class);
        byte[] bArr = new byte[8];
        c3776.m8839(8, bArr);
        this.f15735 = bArr;
        c3776.m8843(8);
        if (this.f15740.contains(EnumC4075.f15726)) {
            this.f15737 = c3779.m8852(c3776);
            c3776.m8843(2);
            this.f15738 = c3776.m8848();
        } else {
            c3776.m8843(8);
        }
        boolean zContains = this.f15740.contains(EnumC4075.f15718);
        InterfaceC3918 interfaceC3918 = f15732;
        if (zContains) {
            C4456 c4456 = new C4456();
            c4456.f17163 = (EnumC4080) AbstractC2500.m6613(c3776.m8849(), EnumC4080.class, null);
            c4456.f17164 = (EnumC4076) AbstractC2500.m6613(c3776.m8849(), EnumC4076.class, null);
            c4456.f17161 = c3779.m8852(c3776);
            c3776.m8843(3);
            c4456.f17162 = (EnumC4079) AbstractC2500.m6613(c3776.m8849(), EnumC4079.class, null);
            interfaceC3918.mo5517(c4456, "Windows version = {}");
        } else {
            c3776.m8843(8);
        }
        int i = this.f15734;
        if (i > 0) {
            c3776.f14614 = this.f15739;
            this.f15741 = c3776.m8840(i / 2, AbstractC2497.f9929);
        }
        int i2 = this.f15737;
        if (i2 > 0) {
            c3776.f14614 = this.f15738;
            byte[] bArr2 = new byte[i2];
            c3776.m8839(i2, bArr2);
            this.f15736 = bArr2;
            c3776.f14614 = this.f15738;
            while (true) {
                int iM8852 = c3779.m8852(c3776);
                EnumC4078 enumC4078 = (EnumC4078) AbstractC2500.m6613(iM8852, EnumC4078.class, null);
                interfaceC3918.mo5523("NTLM channel contains {}({}) TargetInfo", enumC4078, Integer.valueOf(iM8852));
                int iM88522 = c3779.m8852(c3776);
                int iOrdinal = enumC4078.ordinal();
                HashMap map = this.f15733;
                switch (iOrdinal) {
                    case 0:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 9:
                        map.put(enumC4078, c3776.m8840(iM88522 / 2, AbstractC2497.f9929));
                        break;
                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                        map.put(enumC4078, Long.valueOf(C3779.f14620.m8854(c3776)));
                        break;
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        map.put(enumC4078, ٴˎ.ﾞʽ(c3776));
                        break;
                    case 8:
                    case 10:
                        break;
                    default:
                        throw new IllegalStateException("Encountered unhandled AvId: " + enumC4078);
                }
            }
        }
    }
}
