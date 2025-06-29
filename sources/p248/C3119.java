package p248;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.C0882;
import p000.InterfaceC0875;
import p014.C1060;
import p036.InterfaceC1239;
import p076.C1654;
import p076.C1671;
import p076.InterfaceC1662;
import p134.C2085;
import p134.C2088;
import p134.C2089;
import p166.C2428;
import p166.C2431;
import p193.C2705;
import p256.AbstractC3191;
import p256.AbstractC3193;
import p256.C3192;
import p256.C3202;
import p256.InterfaceC3194;
import p256.InterfaceC3199;
import p256.InterfaceC3203;
import p293.C3474;
import p323.C3683;
import p323.C3686;
import p323.C3697;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p438.C5077;
import p438.C5085;
import ˆˑ.ﹳﹳ;

/* renamed from: יˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3119 implements InterfaceC3203 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12024;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC1239 f12025;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public BehindLiveWindowException f12026;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3199[] f12027;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1662 f12028;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C2088 f12029;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f12030;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC0875 f12031;

    public C3119(InterfaceC1662 interfaceC1662, C2088 c2088, int i, InterfaceC1239 interfaceC1239, InterfaceC0875 interfaceC0875, C3474 c3474, boolean z) {
        C3686[] c3686Arr;
        this.f12028 = interfaceC1662;
        this.f12029 = c2088;
        this.f12024 = i;
        this.f12025 = interfaceC1239;
        this.f12031 = interfaceC0875;
        C2085 c2085 = c2088.f8250[i];
        this.f12027 = new InterfaceC3199[interfaceC1239.length()];
        for (int i2 = 0; i2 < this.f12027.length; i2++) {
            int iMo4440 = interfaceC1239.mo4440(i2);
            C2431 c2431 = c2085.f8214[iMo4440];
            if (c2431.f9685 != null) {
                C2089 c2089 = c2088.f8246;
                c2089.getClass();
                c3686Arr = c2089.f8254;
            } else {
                c3686Arr = null;
            }
            C3686[] c3686Arr2 = c3686Arr;
            int i3 = c2085.f8222;
            this.f12027[i2] = new C3202(new C3683(c3474, !z ? 35 : 3, null, new C3697(iMo4440, i3, c2085.f8220, -9223372036854775807L, c2088.f8251, c2431, 0, c3686Arr2, i3 == 2 ? 4 : 0, null, null), C3932.f15274, null), c2085.f8222, c2431);
        }
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo7656() {
        for (InterfaceC3199 interfaceC3199 : this.f12027) {
            ((C3202) interfaceC3199).f12461.mo4073();
        }
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int mo7657(long j, List list) {
        return (this.f12026 != null || this.f12025.length() < 2) ? list.size() : this.f12025.mo4441(j, list);
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo7658(long j, AbstractC3191 abstractC3191, List list) {
        if (this.f12026 != null) {
            return false;
        }
        return this.f12025.mo4443(j, abstractC3191, list);
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long mo7659(long j, C5085 c5085) {
        C2085 c2085 = this.f12029.f8250[this.f12024];
        int iM10195 = AbstractC4470.m10195(c2085.f8218, j, true);
        long[] jArr = c2085.f8218;
        long j2 = jArr[iM10195];
        return c5085.m11289(j, j2, (j2 >= j || iM10195 >= c2085.f8217 - 1) ? j2 : jArr[iM10195 + 1]);
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7660() throws BehindLiveWindowException {
        BehindLiveWindowException behindLiveWindowException = this.f12026;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.f12028.mo5333();
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo7661(C5077 c5077, long j, List list, C2428 c2428) {
        int iMo7892;
        long jM5918;
        if (this.f12026 != null) {
            return;
        }
        C2085[] c2085Arr = this.f12029.f8250;
        int i = this.f12024;
        C2085 c2085 = c2085Arr[i];
        if (c2085.f8217 == 0) {
            c2428.f9650 = !r4.f8252;
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        long[] jArr = c2085.f8218;
        if (zIsEmpty) {
            iMo7892 = AbstractC4470.m10195(jArr, j, true);
        } else {
            iMo7892 = (int) (((AbstractC3193) list.get(list.size() - 1)).mo7892() - this.f12030);
            if (iMo7892 < 0) {
                this.f12026 = new BehindLiveWindowException();
                return;
            }
        }
        if (iMo7892 >= c2085.f8217) {
            c2428.f9650 = !this.f12029.f8252;
            return;
        }
        long j2 = c5077.f19296;
        long j3 = j - j2;
        C2088 c2088 = this.f12029;
        if (c2088.f8252) {
            C2085 c20852 = c2088.f8250[i];
            int i2 = c20852.f8217 - 1;
            jM5918 = (c20852.m5918(i2) + c20852.f8218[i2]) - j2;
        } else {
            jM5918 = -9223372036854775807L;
        }
        int length = this.f12025.length();
        InterfaceC3194[] interfaceC3194Arr = new InterfaceC3194[length];
        for (int i3 = 0; i3 < length; i3++) {
            this.f12025.mo4440(i3);
            interfaceC3194Arr[i3] = new C3121(c2085, iMo7892);
        }
        this.f12025.mo4450(j2, j3, jM5918, list, interfaceC3194Arr);
        long j4 = jArr[iMo7892];
        long jM59182 = c2085.m5918(iMo7892) + j4;
        long j5 = list.isEmpty() ? j : -9223372036854775807L;
        int i4 = this.f12030 + iMo7892;
        int iMo4449 = this.f12025.mo4449();
        InterfaceC3199 interfaceC3199 = this.f12027[iMo4449];
        int iMo4440 = this.f12025.mo4440(iMo4449);
        C2431[] c2431Arr = c2085.f8214;
        AbstractC4464.m10132(c2431Arr != null);
        ArrayList arrayList = c2085.f8225;
        AbstractC4464.m10132(arrayList != null);
        AbstractC4464.m10132(iMo7892 < arrayList.size());
        String string = Integer.toString(c2431Arr[iMo4440].f9691);
        String string2 = ((Long) arrayList.get(iMo7892)).toString();
        Uri uriM10126 = AbstractC4464.m10126(c2085.f8215, c2085.f8216.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        SystemClock.elapsedRealtime();
        C2431 c2431Mo4435 = this.f12025.mo4435();
        int iMo4448 = this.f12025.mo4448();
        Object objMo4451 = this.f12025.mo4451();
        Map mapEmptyMap = Collections.emptyMap();
        AbstractC4464.m10136(uriM10126, "The uri must be set.");
        c2428.f9649 = new C3192(this.f12031, new C0882(uriM10126, 1, null, mapEmptyMap, 0L, -1L, null, 0), c2431Mo4435, iMo4448, objMo4451, j4, jM59182, j5, -9223372036854775807L, i4, 1, j4, interfaceC3199);
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo7662(AbstractC3191 abstractC3191, boolean z, C1060 c1060, C2705 c2705) {
        C1671 c1671 = ﹳﹳ.ˏᵢ(this.f12025);
        c2705.getClass();
        C1654 c1654M6867 = C2705.m6867(c1671, c1060);
        if (z && c1654M6867 != null && c1654M6867.f6452 == 2) {
            InterfaceC1239 interfaceC1239 = this.f12025;
            if (interfaceC1239.mo4442(interfaceC1239.mo4439(abstractC3191.f12395), c1654M6867.f6451)) {
                return true;
            }
        }
        return false;
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo7663(AbstractC3191 abstractC3191) {
    }
}
