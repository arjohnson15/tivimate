package p341;

import java.util.Arrays;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2417;
import p254.C3175;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.C4457;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵎˑ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3878 implements InterfaceC3891 {

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final byte[] f14891 = {73, 68, 51};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f14893;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public InterfaceC3178 f14894;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f14896;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public long f14897;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f14898;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC3178 f14902;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f14904;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f14905;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f14906;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC3178 f14907;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f14909;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f14910;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f14912;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2324 f14892 = new C2324(7, new byte[7]);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f14903 = new C4457(Arrays.copyOf(f14891, 10));

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f14913 = 0;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f14895 = 0;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f14900 = 256;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f14908 = -1;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f14901 = -1;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f14899 = -9223372036854775807L;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f14911 = -9223372036854775807L;

    public C3878(boolean z, String str, int i) {
        this.f14905 = z;
        this.f14912 = str;
        this.f14893 = i;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f14911 = j;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        this.f14911 = -9223372036854775807L;
        this.f14898 = false;
        this.f14913 = 0;
        this.f14895 = 0;
        this.f14900 = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f4  */
    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9077(p383.C4457 r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3878.mo9077(ᵢᵢ.ˋⁱ):void");
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
        this.f14906 = c3898.f15096;
        c3898.m9091();
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(c3898.f15099, 1);
        this.f14907 = interfaceC3178Mo4851;
        this.f14894 = interfaceC3178Mo4851;
        if (!this.f14905) {
            this.f14902 = new C3175();
            return;
        }
        c3898.m9092();
        c3898.m9091();
        InterfaceC3178 interfaceC3178Mo48512 = interfaceC3177.mo4851(c3898.f15099, 5);
        this.f14902 = interfaceC3178Mo48512;
        C2417 c2417 = new C2417();
        c3898.m9091();
        c2417.f9614 = c3898.f15096;
        c2417.f9602 = AbstractC2435.m6559("application/id3");
        ᐧʻ.ˋˊ(c2417, interfaceC3178Mo48512);
    }
}
