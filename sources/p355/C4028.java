package p355;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p323.C3682;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ᵔˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4028 implements InterfaceC4026 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final int[] f15482 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final int[] f15483 = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3178 f15484;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final byte[] f15485;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f15486;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f15487;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f15488;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C2431 f15489;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3682 f15490;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3177 f15491;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4457 f15492;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f15493;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f15494;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f15495;

    public C4028(InterfaceC3177 interfaceC3177, InterfaceC3178 interfaceC3178, C3682 c3682) throws ParserException {
        this.f15491 = interfaceC3177;
        this.f15484 = interfaceC3178;
        this.f15490 = c3682;
        int i = c3682.f14113;
        int iMax = Math.max(1, i / 10);
        this.f15493 = iMax;
        C4457 c4457 = new C4457((byte[]) c3682.f14114);
        c4457.m10091();
        int iM10091 = c4457.m10091();
        this.f15494 = iM10091;
        int i2 = c3682.f14117;
        int i3 = c3682.f14115;
        int i4 = (((i3 - (i2 * 4)) * 8) / (c3682.f14116 * i2)) + 1;
        if (iM10091 != i4) {
            throw ParserException.m1097("Expected frames per block: " + i4 + "; got: " + iM10091, null);
        }
        int iM10196 = AbstractC4470.m10196(iMax, iM10091);
        this.f15485 = new byte[iM10196 * i3];
        this.f15492 = new C4457(iM10091 * 2 * i2 * iM10196);
        int i5 = ((i3 * i) * 8) / iM10091;
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("audio/raw");
        c2417.f9616 = i5;
        c2417.f9610 = i5;
        c2417.f9605 = iMax * 2 * i2;
        c2417.f9624 = i2;
        c2417.f9600 = i;
        c2417.f9618 = 2;
        this.f15489 = new C2431(c2417);
    }

    @Override // p355.InterfaceC4026
    /* renamed from: ʽᐧ */
    public final void mo3686(int i, long j) {
        this.f15491.mo4858(new C4029(this.f15490, this.f15494, i, j));
        this.f15484.mo7840(this.f15489);
    }

    @Override // p355.InterfaceC4026
    /* renamed from: ˑʽ */
    public final void mo3687(long j) {
        this.f15495 = 0;
        this.f15486 = j;
        this.f15488 = 0;
        this.f15487 = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:6:0x0024->B:13:0x0040], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // p355.InterfaceC4026
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo3688(p254.C3159 r26, long r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p355.C4028.mo3688(יי.ˉⁱ, long):boolean");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9270(int i) {
        long j = this.f15486;
        long j2 = this.f15487;
        C3682 c3682 = this.f15490;
        long j3 = c3682.f14113;
        int i2 = AbstractC4470.f17202;
        long jM10166 = j + AbstractC4470.m10166(j2, 1000000L, j3, RoundingMode.FLOOR);
        int i3 = i * 2 * c3682.f14117;
        this.f15484.mo7842(jM10166, 1, i3, this.f15488 - i3, null);
        this.f15487 += i;
        this.f15488 -= i3;
    }
}
