package p323;

import androidx.media3.common.ParserException;
import p254.AbstractC3152;
import p383.C4457;

/* renamed from: ᴵˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3690 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f14204;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f14205;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f14206;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f14207;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f14208;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4457 f14209;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4457 f14210;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f14211;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f14212;

    public C3690(C4457 c4457, C4457 c44572, boolean z) throws ParserException {
        this.f14210 = c4457;
        this.f14209 = c44572;
        this.f14205 = z;
        c44572.m10108(12);
        this.f14208 = c44572.m10106();
        c4457.m10108(12);
        this.f14212 = c4457.m10106();
        AbstractC3152.m7803("first_chunk must be 1", c4457.m10092() == 1);
        this.f14204 = -1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m8635() {
        int i = this.f14204 + 1;
        this.f14204 = i;
        if (i == this.f14208) {
            return false;
        }
        boolean z = this.f14205;
        C4457 c4457 = this.f14209;
        this.f14211 = z ? c4457.m10082() : c4457.m10110();
        if (this.f14204 == this.f14206) {
            C4457 c44572 = this.f14210;
            this.f14207 = c44572.m10106();
            c44572.m10085(4);
            int i2 = this.f14212 - 1;
            this.f14212 = i2;
            this.f14206 = i2 > 0 ? c44572.m10106() - 1 : -1;
        }
        return true;
    }
}
