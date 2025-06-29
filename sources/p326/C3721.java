package p326;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;
import p018.C1096;
import p018.C1106;
import p018.C1107;
import p018.C1113;
import p018.C1115;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1687;
import p078.EnumC1689;
import p109.EnumC1805;
import p143.C2227;
import p200.C2753;
import p215.EnumC2820;
import p283.InterfaceC3379;
import p296.C3486;
import p309.AbstractC3578;
import p408.C4672;
import p446.AbstractC5160;
import p446.C5169;
import ʿﾞ.ﹳﹳ;

/* renamed from: ᴵـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3721 extends AbstractC3578 implements Closeable {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final EnumSet f14432;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final EnumSet f14433;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C5169 f14434;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f14435;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0559 f14436;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f14437;

    static {
        EnumC1805 enumC1805 = EnumC1805.f6954;
        EnumC1805 enumC18052 = EnumC1805.f6956;
        f14432 = EnumSet.of(enumC1805, enumC18052);
        f14433 = EnumSet.of(enumC1805, enumC18052, EnumC1805.f6957);
        EnumSet.of(enumC1805);
    }

    public C3721(C2227 c2227, C5169 c5169, String str) {
        super(c2227);
        this.f14434 = c5169;
        C3486 c3486 = c2227.f8864;
        this.f14436 = ((C1096) m8472(new C1115((EnumC1689) ((C2753) c3486.f13462.f11939).f10767, c2227.f8865, c5169.f19711.f10817, 3, EnumSet.of(EnumC2820.f10966), null, EnumSet.of(EnumC1687.f6565, EnumC1687.f6567), 4, null, new C4672(c5169.f19718, str)), EnumSet.of(EnumC1805.f6954))).f4674;
        this.f14437 = Math.min(c3486.f13470.f5190, ((C2753) c3486.f13462.f11939).f10766);
        this.f14435 = Math.min(c3486.f13470.f5194, ((C2753) c3486.f13462.f11939).f10768);
        Math.min(c3486.f13470.f5189, ((C2753) c3486.f13462.f11939).f10770);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C5169 c5169 = this.f14434;
        C0559 c0559 = this.f14436;
        c5169.getClass();
        C1106 c1106 = new C1106(24, c5169.f19712, EnumC1683.f6542, c5169.f19710, c5169.f19714, 0);
        c1106.f4702 = c0559;
        c5169.m11457(c1106, "Close", c0559, AbstractC5160.f19709, c5169.f19722);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] m8687() throws IOException {
        C1113 c1113;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        do {
            long j = this.f14434.f19711.f10817;
            c1113 = (C1113) m8472(new C1107(this.f13769, this.f14436, this.f13767, j, 0L, this.f14435), f14433);
            try {
                byteArrayOutputStream.write(c1113.f4720);
            } catch (IOException e) {
                throw new SMBRuntimeException(e);
            }
        } while (EnumC1805.m5549(((C1696) ((InterfaceC3379) ((ﹳﹳ) c1113).ᐧⁱ)).f6598).equals(EnumC1805.f6956));
        return byteArrayOutputStream.toByteArray();
    }
}
