package p101;

import java.util.Arrays;
import p166.C2431;
import p254.AbstractC3152;
import p254.C3179;
import p331.C3761;
import p383.C4457;
import p456.C5349;

/* renamed from: ˆˏ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1782 extends AbstractC1783 {

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C1778 f6907;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C3179 f6908;

    @Override // p101.AbstractC1783
    /* renamed from: ʽᐧ */
    public final long mo5496(C4457 c4457) {
        byte[] bArr = c4457.f17171;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c4457.m10085(4);
            c4457.m10080();
        }
        int iM7821 = AbstractC3152.m7821(i, c4457);
        c4457.m10108(0);
        return iM7821;
    }

    @Override // p101.AbstractC1783
    /* renamed from: ˑʽ */
    public final boolean mo5497(C4457 c4457, long j, C5349 c5349) {
        byte[] bArr = c4457.f17171;
        C3179 c3179 = this.f6908;
        if (c3179 == null) {
            C3179 c31792 = new C3179(17, bArr);
            this.f6908 = c31792;
            c5349.f20756 = c31792.m7848(Arrays.copyOfRange(bArr, 9, c4457.f17170), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            C1778 c1778 = this.f6907;
            if (c1778 != null) {
                c1778.f6900 = j;
                c5349.f20757 = c1778;
            }
            ((C2431) c5349.f20756).getClass();
            return false;
        }
        C3761 c3761M7804 = AbstractC3152.m7804(c4457);
        C3179 c31793 = new C3179(c3179.f12283, c3179.f12276, c3179.f12282, c3179.f12286, c3179.f12277, c3179.f12285, c3179.f12281, c3179.f12278, c3761M7804, c3179.f12279);
        this.f6908 = c31793;
        C1778 c17782 = new C1778();
        c17782.f6898 = c31793;
        c17782.f6899 = c3761M7804;
        c17782.f6900 = -1L;
        c17782.f6897 = -1L;
        this.f6907 = c17782;
        return true;
    }

    @Override // p101.AbstractC1783
    /* renamed from: ﹳﹳ */
    public final void mo5499(boolean z) {
        super.mo5499(z);
        if (z) {
            this.f6908 = null;
            this.f6907 = null;
        }
    }
}
