package p009;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Process;
import androidx.leanback.widget.ʿˏ;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p123.AbstractC2007;
import p123.C1999;
import p138.C2111;
import p141.RunnableC2187;
import p192.InterfaceC2663;
import p192.ThreadFactoryC2667;
import p238.AbstractC3095;
import p266.C3262;
import p266.C3263;
import p329.InterfaceC3741;
import p331.C3758;
import p331.C3762;
import p411.C4691;
import p452.InterfaceC5193;
import ˉˆ.ﹳﹳ;
import ˊﹶ.ˋˉ;
import ˏʼ.ʽᐧ;
import ٴᐧ.ᐧⁱ;
import ﹶˋ.ـﹶ;

/* renamed from: ʻˋ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0995 implements InterfaceC3741, InterfaceC2663 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Context f4341;

    public /* synthetic */ C0995(Context context, boolean z) {
        this.f4341 = context;
    }

    @Override // p329.InterfaceC3741
    public Object get() {
        return (ConnectivityManager) this.f4341.getSystemService("connectivity");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C1999 m3954() {
        Context context = this.f4341;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C1999 c1999 = new C1999();
        c1999.f7606 = C4691.m10598(AbstractC2007.f7635);
        C3263 c3263 = new C3263();
        c3263.f12727 = context;
        c1999.f7602 = c3263;
        c1999.f7604 = C4691.m10598(new C3758(c3263, 7, new C2111(c3263, 0)));
        C3263 c32632 = c1999.f7602;
        c1999.f7605 = new ˋˉ(20, c32632);
        InterfaceC5193 interfaceC5193M10598 = C4691.m10598(new C3758(c1999.f7605, 13, C4691.m10598(new C2111(c32632, 1))));
        c1999.f7603 = interfaceC5193M10598;
        ᐧⁱ r2 = new ᐧⁱ(13);
        C3263 c32633 = c1999.f7602;
        C3262 c3262 = new C3262(false, c32633, interfaceC5193M10598, r2);
        InterfaceC5193 interfaceC5193 = c1999.f7606;
        InterfaceC5193 interfaceC51932 = c1999.f7604;
        c1999.f7607 = C4691.m10598(new C3762(new ʿˏ(interfaceC5193, interfaceC51932, c3262, interfaceC5193M10598, interfaceC5193M10598), new ﹳﹳ(c32633, interfaceC51932, interfaceC5193M10598, c3262, interfaceC5193, interfaceC5193M10598, interfaceC5193M10598), new ـﹶ(interfaceC5193, interfaceC5193M10598, c3262, interfaceC5193M10598, 15), 5));
        return c1999;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public PackageInfo m3955(int i, String str) {
        return this.f4341.getPackageManager().getPackageInfo(str, i);
    }

    @Override // p192.InterfaceC2663
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo3956(ʽᐧ r10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2667("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC2187(this, r10, threadPoolExecutor, 1));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean m3957() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f4341;
        if (callingUid == iMyUid) {
            return ﹶⁱ.ـﹶ.ᐧⁱ(context);
        }
        if (!AbstractC3095.m7610() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
