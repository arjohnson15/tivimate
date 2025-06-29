package p456;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import p417.AbstractC4753;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5254 extends AbstractC5257 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public String f20346;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f20347;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f20348;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public String f20349;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public String f20350;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public String f20351;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public String f20352;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public List f20353;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public String f20354;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public String f20355;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public String f20356;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public long f20357;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f20358;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f20359;

    /* renamed from: יˊ, reason: contains not printable characters */
    public final void m11752() {
        String str;
        m11846();
        if (ᐧᴵ().m11855().m12151(EnumC5341.f20711)) {
            byte[] bArr = new byte[16];
            ﹶﾞ().m11956().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            ˏᵢ().f20567.m4533("Analytics Storage consent is not granted");
            str = null;
        }
        ˏᵢ().f20567.m4533("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f20351 = str;
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        this.f20357 = System.currentTimeMillis();
    }

    @Override // p456.AbstractC5257
    /* renamed from: ᴵˋ */
    public final boolean mo11715() {
        return true;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final String m11753() {
        m11757();
        AbstractC4753.m10683(this.f20349);
        return this.f20349;
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final String m11754() {
        m11846();
        m11757();
        AbstractC4753.m10683(this.f20346);
        return this.f20346;
    }
}
