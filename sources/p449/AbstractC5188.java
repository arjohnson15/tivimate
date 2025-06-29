package p449;

import java.io.IOException;
import java.util.EnumSet;
import p180.AbstractC2500;
import p405.C4640;
import p405.C4643;
import p456.C5349;
import ʾי.ˑʽ;
import ˈי.ʾˈ;

/* renamed from: ﾞˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5188 extends ʾˈ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public EnumSet f20000;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public EnumC5189 f20005;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public byte f19999 = 5;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public byte f20002 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public byte[] f20003 = {16, 0, 0, 0};

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public short f20004 = 16;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public short f20001 = 0;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f20006 = 0;

    /* renamed from: ˋˊ */
    public void mo5657(ˑʽ r3) throws IOException {
        if (this.f20005 == null) {
            throw new IllegalStateException("Invalid PDU type: " + this.f20005);
        }
        if (this.f20000 == null) {
            throw new IllegalStateException("Invalid PFC flag(s): " + this.f20000);
        }
        r3.ᐧˋ(this.f19999);
        r3.ᐧˋ(this.f20002);
        r3.ᐧˋ((byte) this.f20005.f20014);
        r3.ᐧˋ((byte) AbstractC2500.m6610(this.f20000));
        ((C4643) r3.ˆʿ).write(this.f20003);
        r3.ᵢʿ(this.f20004);
        r3.ᵢʿ(0);
        r3.ˆᵔ(this.f20006);
    }

    /* renamed from: ﾞˊ */
    public void mo5656(C5349 c5349) throws IOException {
        this.f19999 = c5349.m12111();
        byte bM12111 = c5349.m12111();
        this.f20002 = bM12111;
        if (5 != this.f19999 || bM12111 != 0) {
            throw new IOException(String.format("Version mismatch: %d.%d != 5.0", Byte.valueOf(this.f19999), Byte.valueOf(this.f20002)));
        }
        EnumC5189 enumC5189 = (EnumC5189) AbstractC2500.m6613(c5349.m12111(), EnumC5189.class, null);
        if (enumC5189 == null) {
            throw new IOException(String.format("PDU type invalid: %d", enumC5189));
        }
        this.f20005 = enumC5189;
        this.f20000 = AbstractC2500.m6614(c5349.m12111(), EnumC5186.class);
        byte[] bArr = new byte[4];
        C4640 c4640 = (C4640) c5349.f20757;
        c4640.readFully(bArr);
        if (bArr[0] != 16) {
            throw new IOException(String.format("Integer and Character representation mismatch: %d", Byte.valueOf(bArr[0])));
        }
        if (bArr[1] != 0) {
            throw new IOException(String.format("Floating-Point representation mismatch: %d", Byte.valueOf(bArr[1])));
        }
        this.f20003 = bArr;
        this.f20004 = (short) c4640.readUnsignedShort();
        this.f20001 = (short) c4640.readUnsignedShort();
        this.f20006 = c4640.readInt();
    }
}
