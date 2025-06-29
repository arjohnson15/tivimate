package p372;

import android.net.Uri;
import android.support.v4.media.session.AbstractC0001;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C0882;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p033.C1215;
import p036.InterfaceC1239;
import p166.C2431;
import p166.C2433;
import p324.C3709;
import p324.C3712;
import p324.C3715;
import p324.C3716;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˏᵢ.ᵢٴ;
import ᵢ.ʿʼ;

/* renamed from: ᵢˆ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4226 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC0875 f16347;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Uri[] f16348;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f16350;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C1215 f16353;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public Uri f16354;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C2433 f16355;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC0875 f16356;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f16357;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4237 f16358;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2431[] f16359;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3709 f16360;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public BehindLiveWindowException f16361;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f16362;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public InterfaceC1239 f16363;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ʿʼ f16364;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final List f16365;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ʿʼ f16349 = new ʿʼ(3);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public byte[] f16351 = AbstractC4470.f17203;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f16352 = -9223372036854775807L;

    public C4226(InterfaceC4237 interfaceC4237, C3709 c3709, Uri[] uriArr, C2431[] c2431Arr, ᵢٴ r5, InterfaceC0880 interfaceC0880, ʿʼ r7, List list, C1215 c1215) {
        this.f16358 = interfaceC4237;
        this.f16360 = c3709;
        this.f16348 = uriArr;
        this.f16359 = c2431Arr;
        this.f16364 = r7;
        this.f16365 = list;
        this.f16353 = c1215;
        InterfaceC0875 interfaceC0875Mo900 = ((InterfaceC0864) r5.ˆʿ).mo900();
        this.f16347 = interfaceC0875Mo900;
        if (interfaceC0880 != null) {
            interfaceC0875Mo900.mo3678(interfaceC0880);
        }
        this.f16356 = ((InterfaceC0864) r5.ˆʿ).mo900();
        this.f16355 = new C2433("", c2431Arr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c2431Arr[i].f9678 & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C2433 c2433 = this.f16355;
        int[] iArrM3 = AbstractC0001.m3(arrayList);
        C4231 c4231 = new C4231(c2433, iArrM3);
        c4231.f16378 = c4231.mo4439(c2433.f9700[iArrM3[0]]);
        this.f16363 = c4231;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m9674(C4220 c4220) {
        if (c4220.f16292 == -1) {
            return 1;
        }
        C3716 c3716M8670 = this.f16360.m8670(this.f16348[this.f16355.m6544(c4220.f12395)], false);
        c3716M8670.getClass();
        int i = (int) (c4220.f12405 - c3716M8670.f14405);
        if (i < 0) {
            return 1;
        }
        AbstractC3980 abstractC3980 = c3716M8670.f14404;
        AbstractC3980 abstractC39802 = i < abstractC3980.size() ? ((C3712) abstractC3980.get(i)).f14330 : c3716M8670.f14412;
        int size = abstractC39802.size();
        int i2 = c4220.f16292;
        if (i2 >= size) {
            return 2;
        }
        C3715 c3715 = (C3715) abstractC39802.get(i2);
        if (c3715.f14397) {
            return 0;
        }
        return AbstractC4470.m10194(Uri.parse(AbstractC4464.m10145(c3716M8670.f14301, c3715.f14337)), c4220.f12390.f4004) ? 1 : 2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Pair m9675(C4220 c4220, boolean z, C3716 c3716, long j, long j2) {
        boolean z2 = true;
        if (c4220 != null && !z) {
            boolean z3 = c4220.f16285;
            long jMo7892 = c4220.f12405;
            int i = c4220.f16292;
            if (!z3) {
                return new Pair(Long.valueOf(jMo7892), Integer.valueOf(i));
            }
            if (i == -1) {
                jMo7892 = c4220.mo7892();
            }
            return new Pair(Long.valueOf(jMo7892), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = c3716.f14399 + j;
        if (c4220 != null && !this.f16357) {
            j2 = c4220.f12398;
        }
        boolean z4 = c3716.f14406;
        long j4 = c3716.f14405;
        AbstractC3980 abstractC3980 = c3716.f14404;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + abstractC3980.size()), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        int i2 = 0;
        if (this.f16360.f14320 && c4220 != null) {
            z2 = false;
        }
        int iM10212 = AbstractC4470.m10212(abstractC3980, lValueOf, z2);
        long j6 = iM10212 + j4;
        if (iM10212 >= 0) {
            C3712 c3712 = (C3712) abstractC3980.get(iM10212);
            long j7 = c3712.f14332 + c3712.f14334;
            AbstractC3980 abstractC39802 = c3716.f14412;
            AbstractC3980 abstractC39803 = j5 < j7 ? c3712.f14330 : abstractC39802;
            while (true) {
                if (i2 >= abstractC39803.size()) {
                    break;
                }
                C3715 c3715 = (C3715) abstractC39803.get(i2);
                if (j5 >= c3715.f14332 + c3715.f14334) {
                    i2++;
                } else if (c3715.f14396) {
                    j6 += abstractC39803 == abstractC39802 ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p256.InterfaceC3194[] m9676(p372.C4220 r20, long r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.C4226.m9676(ᵢˆ.ˉי, long):יᴵ.ˋⁱ[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4219 m9677(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        ʿʼ r3 = this.f16349;
        byte[] bArr = (byte[]) ((C4236) r3.ˆʿ).remove(uri);
        if (bArr != null) {
            return null;
        }
        C0882 c0882 = new C0882(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        C2431 c2431 = this.f16359[i];
        int iMo4448 = this.f16363.mo4448();
        Object objMo4451 = this.f16363.mo4451();
        byte[] bArr2 = this.f16351;
        C4219 c4219 = new C4219(this.f16356, c0882, 3, c2431, iMo4448, objMo4451, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC4470.f17203;
        }
        c4219.f16266 = bArr2;
        return c4219;
    }
}
