package p341;

import java.util.concurrent.atomic.AtomicInteger;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p254.C3170;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.C4457;

/* renamed from: ᵎˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3896 implements InterfaceC3891 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public String f15073;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f15074;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f15075;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f15076;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C2431 f15077;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f15079;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f15080;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4457 f15082;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3178 f15083;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f15086;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f15087;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f15084 = 0;

    /* renamed from: ˑי, reason: contains not printable characters */
    public long f15081 = -9223372036854775807L;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AtomicInteger f15072 = new AtomicInteger();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f15085 = -1;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f15078 = -1;

    public C3896(int i, int i2, String str) {
        this.f15082 = new C4457(new byte[i2]);
        this.f15080 = str;
        this.f15086 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m9089(C4457 c4457, byte[] bArr, int i) {
        int iMin = Math.min(c4457.m10096(), i - this.f15079);
        c4457.m10097(bArr, this.f15079, iMin);
        int i2 = this.f15079 + iMin;
        this.f15079 = i2;
        return i2 == i;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f15081 = j;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9090(C3170 c3170) {
        int i;
        int i2 = c3170.f12257;
        if (i2 == -2147483647 || (i = c3170.f12258) == -1) {
            return;
        }
        C2431 c2431 = this.f15077;
        String str = c3170.f12259;
        if (c2431 != null && i == c2431.f9662 && i2 == c2431.f9681 && str.equals(c2431.f9667)) {
            return;
        }
        C2431 c24312 = this.f15077;
        C2417 c2417 = c24312 == null ? new C2417() : c24312.m6541();
        c2417.f9614 = this.f15073;
        c2417.f9602 = AbstractC2435.m6559(str);
        c2417.f9624 = i;
        c2417.f9600 = i2;
        c2417.f9625 = this.f15080;
        c2417.f9615 = this.f15086;
        C2431 c24313 = new C2431(c2417);
        this.f15077 = c24313;
        this.f15083.mo7840(c24313);
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        this.f15084 = 0;
        this.f15079 = 0;
        this.f15087 = 0;
        this.f15081 = -9223372036854775807L;
        this.f15072.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04ab  */
    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9077(p383.C4457 r38) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3896.mo9077(ᵢᵢ.ˋⁱ):void");
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ */
    public final void mo9078(boolean z) {
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        c3898.m9092();
        c3898.m9091();
        this.f15073 = c3898.f15096;
        c3898.m9091();
        this.f15083 = interfaceC3177.mo4851(c3898.f15099, 1);
    }
}
