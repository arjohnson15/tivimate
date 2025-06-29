package p444;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j$.util.Objects;
import p123.C1995;
import p306.C3554;
import p306.InterfaceC3553;
import p362.C4125;
import p438.C5087;
import p439.InterfaceC5122;

/* renamed from: ﾞˆ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5147 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C1995 f19673;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f19674;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f19675;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C5152 f19676;

    public /* synthetic */ RunnableC5147(C5152 c5152, C1995 c1995, int i, Runnable runnable) {
        this.f19676 = c5152;
        this.f19673 = c1995;
        this.f19674 = i;
        this.f19675 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1995 c1995 = this.f19673;
        int i = this.f19674;
        Runnable runnable = this.f19675;
        C5152 c5152 = this.f19676;
        InterfaceC5122 interfaceC5122 = c5152.f19694;
        try {
            try {
                InterfaceC3553 interfaceC3553 = c5152.f19692;
                Objects.requireNonNull(interfaceC3553);
                ((C3554) interfaceC5122).m8436(new C4125(22, interfaceC3553));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) c5152.f19693.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((C3554) interfaceC5122).m8436(new C5087(c5152, c1995, i));
                } else {
                    c5152.m11455(c1995, i);
                }
            } catch (SynchronizationException unused) {
                c5152.f19696.m11453(c1995, i + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
