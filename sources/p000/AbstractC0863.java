package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p076.C1660;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0863 implements InterfaceC0875 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f3921 = new ArrayList(1);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3922;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C0882 f3923;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f3924;

    public AbstractC0863(boolean z) {
        this.f3924 = z;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m3673() {
        for (int i = 0; i < this.f3922; i++) {
            ((InterfaceC0880) this.f3921.get(i)).getClass();
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˉי, reason: contains not printable characters */
    public Map mo3674() {
        return Collections.emptyMap();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m3675() {
        C0882 c0882 = this.f3923;
        int i = AbstractC4470.f17202;
        for (int i2 = 0; i2 < this.f3922; i2++) {
            InterfaceC0880 interfaceC0880 = (InterfaceC0880) this.f3921.get(i2);
            boolean z = this.f3924;
            C1660 c1660 = (C1660) interfaceC0880;
            synchronized (c1660) {
                try {
                    C3932 c3932 = C1660.f6478;
                    if (z && (c0882.f4002 & 8) != 8) {
                        AbstractC4464.m10132(c1660.f6491 > 0);
                        c1660.f6489.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - c1660.f6492);
                        c1660.f6494 += i3;
                        long j = c1660.f6484;
                        long j2 = c1660.f6488;
                        c1660.f6484 = j + j2;
                        if (i3 > 0) {
                            c1660.f6483.m5360((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (c1660.f6494 >= 2000 || c1660.f6484 >= 524288) {
                                c1660.f6487 = (long) c1660.f6483.m5359();
                            }
                            c1660.m5338(i3, c1660.f6488, c1660.f6487);
                            c1660.f6492 = jElapsedRealtime;
                            c1660.f6488 = 0L;
                        }
                        c1660.f6491--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f3923 = null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3676(int i) {
        C0882 c0882 = this.f3923;
        int i2 = AbstractC4470.f17202;
        for (int i3 = 0; i3 < this.f3922; i3++) {
            InterfaceC0880 interfaceC0880 = (InterfaceC0880) this.f3921.get(i3);
            boolean z = this.f3924;
            C1660 c1660 = (C1660) interfaceC0880;
            synchronized (c1660) {
                C3932 c3932 = C1660.f6478;
                if (z && (c0882.f4002 & 8) != 8) {
                    c1660.f6488 += i;
                }
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m3677(C0882 c0882) {
        this.f3923 = c0882;
        for (int i = 0; i < this.f3922; i++) {
            InterfaceC0880 interfaceC0880 = (InterfaceC0880) this.f3921.get(i);
            boolean z = this.f3924;
            C1660 c1660 = (C1660) interfaceC0880;
            synchronized (c1660) {
                try {
                    C3932 c3932 = C1660.f6478;
                    if (z && (c0882.f4002 & 8) != 8) {
                        if (c1660.f6491 == 0) {
                            c1660.f6489.getClass();
                            c1660.f6492 = SystemClock.elapsedRealtime();
                        }
                        c1660.f6491++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo3678(InterfaceC0880 interfaceC0880) {
        interfaceC0880.getClass();
        ArrayList arrayList = this.f3921;
        if (arrayList.contains(interfaceC0880)) {
            return;
        }
        arrayList.add(interfaceC0880);
        this.f3922++;
    }
}
