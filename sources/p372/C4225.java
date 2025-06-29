package p372;

import java.io.EOFException;
import java.util.Arrays;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p166.InterfaceC2442;
import p246.C3116;
import p246.C3117;
import p254.C3156;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ᵢˆ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4225 implements InterfaceC3178 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C2431 f16340;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C2431 f16341;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2431 f16342;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f16343;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2431 f16344;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4228 f16345;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte[] f16346;

    static {
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("application/id3");
        f16340 = new C2431(c2417);
        C2417 c24172 = new C2417();
        c24172.f9602 = AbstractC2435.m6559("application/x-emsg");
        f16341 = new C2431(c24172);
    }

    public C4225(C4228 c4228, int i) {
        this.f16345 = c4228;
        if (i == 1) {
            this.f16342 = f16340;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unknown metadataType: ", i));
            }
            this.f16342 = f16341;
        }
        this.f16346 = new byte[0];
        this.f16343 = 0;
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʽᐧ */
    public final int mo7839(InterfaceC2442 interfaceC2442, int i, boolean z) throws EOFException {
        int i2 = this.f16343 + i;
        byte[] bArr = this.f16346;
        if (bArr.length < i2) {
            this.f16346 = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int iMo3679 = interfaceC2442.mo3679(this.f16346, this.f16343, i);
        if (iMo3679 != -1) {
            this.f16343 += iMo3679;
            return iMo3679;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʿʼ */
    public final void mo7840(C2431 c2431) {
        this.f16344 = c2431;
        this.f16345.mo7840(this.f16342);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ˑʽ */
    public final /* synthetic */ void mo7841(int i, C4457 c4457) {
        ᵎˏ.ـﹶ(this, c4457, i);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ـﹶ */
    public final void mo7842(long j, int i, int i2, int i3, C3156 c3156) {
        this.f16344.getClass();
        int i4 = this.f16343 - i3;
        C4457 c4457 = new C4457(Arrays.copyOfRange(this.f16346, i4 - i2, i4));
        byte[] bArr = this.f16346;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f16343 = i3;
        String str = this.f16344.f9667;
        C2431 c2431 = this.f16342;
        if (!AbstractC4470.m10194(str, c2431.f9667)) {
            if (!"application/x-emsg".equals(this.f16344.f9667)) {
                AbstractC4464.m10144("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f16344.f9667);
                return;
            }
            C3117 c3117M7646 = C3116.m7646(c4457);
            C2431 c2431Mo3977 = c3117M7646.mo3977();
            String str2 = c2431.f9667;
            if (c2431Mo3977 == null || !AbstractC4470.m10194(str2, c2431Mo3977.f9667)) {
                AbstractC4464.m10144("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + c3117M7646.mo3977());
                return;
            }
            byte[] bArrMo3978 = c3117M7646.mo3978();
            bArrMo3978.getClass();
            c4457 = new C4457(bArrMo3978);
        }
        int iM10096 = c4457.m10096();
        C4228 c4228 = this.f16345;
        ᵎˏ.ـﹶ(c4228, c4457, iM10096);
        c4228.mo7842(j, i, iM10096, 0, c3156);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ٴˎ */
    public final int mo7843(InterfaceC2442 interfaceC2442, int i, boolean z) {
        return mo7839(interfaceC2442, i, z);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ﹳﹳ */
    public final void mo7844(C4457 c4457, int i, int i2) {
        int i3 = this.f16343 + i;
        byte[] bArr = this.f16346;
        if (bArr.length < i3) {
            this.f16346 = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c4457.m10097(this.f16346, this.f16343, i);
        this.f16343 += i;
    }
}
