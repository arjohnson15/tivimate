package p101;

import java.util.ArrayList;
import java.util.Arrays;
import p166.AbstractC2435;
import p166.C2401;
import p166.C2417;
import p166.C2431;
import p254.AbstractC3152;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.C4457;
import p456.C5349;

/* renamed from: ˆˏ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1777 extends AbstractC1783 {

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final byte[] f6894 = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final byte[] f6895 = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f6896;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m5500(C4457 c4457, byte[] bArr) {
        if (c4457.m10096() < bArr.length) {
            return false;
        }
        int i = c4457.f17169;
        byte[] bArr2 = new byte[bArr.length];
        c4457.m10097(bArr2, 0, bArr.length);
        c4457.m10108(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p101.AbstractC1783
    /* renamed from: ʽᐧ */
    public final long mo5496(C4457 c4457) {
        byte[] bArr = c4457.f17171;
        return (this.f6921 * AbstractC3152.m7806(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p101.AbstractC1783
    /* renamed from: ˑʽ */
    public final boolean mo5497(C4457 c4457, long j, C5349 c5349) {
        if (m5500(c4457, f6894)) {
            byte[] bArrCopyOf = Arrays.copyOf(c4457.f17171, c4457.f17170);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM7813 = AbstractC3152.m7813(bArrCopyOf);
            if (((C2431) c5349.f20756) != null) {
                return true;
            }
            C2417 c2417 = new C2417();
            c2417.f9602 = AbstractC2435.m6559("audio/opus");
            c2417.f9624 = i;
            c2417.f9600 = 48000;
            c2417.f9609 = arrayListM7813;
            c5349.f20756 = new C2431(c2417);
            return true;
        }
        if (!m5500(c4457, f6895)) {
            AbstractC4464.m10146((C2431) c5349.f20756);
            return false;
        }
        AbstractC4464.m10146((C2431) c5349.f20756);
        if (this.f6896) {
            return true;
        }
        this.f6896 = true;
        c4457.m10085(8);
        C2401 c2401M7819 = AbstractC3152.m7819(AbstractC3980.m9210((String[]) AbstractC3152.m7807(c4457, false, false).ˆʿ));
        if (c2401M7819 == null) {
            return true;
        }
        C2417 c2417M6541 = ((C2431) c5349.f20756).m6541();
        c2417M6541.f9601 = c2401M7819.m6492(((C2431) c5349.f20756).f9670);
        c5349.f20756 = new C2431(c2417M6541);
        return true;
    }

    @Override // p101.AbstractC1783
    /* renamed from: ﹳﹳ */
    public final void mo5499(boolean z) {
        super.mo5499(z);
        if (z) {
            this.f6896 = false;
        }
    }
}
