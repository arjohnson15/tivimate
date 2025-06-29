package p254;

import java.io.EOFException;
import p166.C2431;
import p166.InterfaceC2442;
import p383.C4457;
import ˆʽ.ᵎˏ;

/* renamed from: יי.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3175 implements InterfaceC3178 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f12271 = new byte[4096];

    @Override // p254.InterfaceC3178
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int mo7839(InterfaceC2442 interfaceC2442, int i, boolean z) throws EOFException {
        byte[] bArr = this.f12271;
        int iMo3679 = interfaceC2442.mo3679(bArr, 0, Math.min(bArr.length, i));
        if (iMo3679 != -1) {
            return iMo3679;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo7840(C2431 c2431) {
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ void mo7841(int i, C4457 c4457) {
        ᵎˏ.ـﹶ(this, c4457, i);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7842(long j, int i, int i2, int i3, C3156 c3156) {
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo7843(InterfaceC2442 interfaceC2442, int i, boolean z) {
        return mo7839(interfaceC2442, i, z);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo7844(C4457 c4457, int i, int i2) {
        c4457.m10085(i);
    }
}
