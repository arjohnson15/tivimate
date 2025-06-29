package p324;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import p014.C1060;
import p076.C1654;
import p076.C1671;
import p193.C2705;
import p383.AbstractC4470;

/* renamed from: ᴵˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3711 implements InterfaceC3710 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C3709 f14328;

    public C3711(C3709 c3709) {
        this.f14328 = c3709;
    }

    @Override // p324.InterfaceC3710
    /* renamed from: ـﹶ */
    public final void mo8671() {
        this.f14328.f14316.remove(this);
    }

    @Override // p324.InterfaceC3710
    /* renamed from: ﹳﹳ */
    public final boolean mo8672(Uri uri, C1060 c1060, boolean z) {
        HashMap map;
        C3701 c3701;
        C3709 c3709 = this.f14328;
        if (c3709.f14314 == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C3704 c3704 = c3709.f14324;
            int i = AbstractC4470.f17202;
            List list = c3704.f14291;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = c3709.f14322;
                if (i2 >= size) {
                    break;
                }
                C3701 c37012 = (C3701) map.get(((C3706) list.get(i2)).f14305);
                if (c37012 != null && jElapsedRealtime < c37012.f14275) {
                    i3++;
                }
                i2++;
            }
            C1671 c1671 = new C1671(1, 0, c3709.f14324.f14291.size(), i3);
            c3709.f14318.getClass();
            C1654 c1654M6867 = C2705.m6867(c1671, c1060);
            if (c1654M6867 != null && c1654M6867.f6452 == 2 && (c3701 = (C3701) map.get(uri)) != null) {
                C3701.m8660(c3701, c1654M6867.f6451);
            }
        }
        return false;
    }
}
