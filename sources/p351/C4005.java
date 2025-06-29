package p351;

import android.os.Bundle;
import android.util.Log;
import androidx.leanback.widget.ﾞᐧ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p002.InterfaceC0886;
import p006.C0935;
import p006.InterfaceC0936;
import p084.C1714;
import p150.C2313;
import p150.InterfaceC2315;
import p192.C2668;
import p331.C3767;
import p428.C4930;
import p450.InterfaceC5190;
import p450.InterfaceC5191;
import ʾי.ˑʽ;
import ᴵﹳ.ﹶˆ;
import ᵔᵔ.ٴˎ;

/* renamed from: ᵔʼ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4005 implements InterfaceC0936, InterfaceC0886, InterfaceC5191 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C2668 f15442;

    public /* synthetic */ C4005(C2668 c2668) {
        this.f15442 = c2668;
    }

    @Override // p006.InterfaceC0936
    /* renamed from: ـﹶ */
    public void mo3800(C4930 c4930) {
        C2668 c2668 = this.f15442;
        synchronized (c2668) {
            if (((InterfaceC0936) c2668.f10562) instanceof C0935) {
                ((ArrayList) c2668.f10563).add(c4930);
            }
            ((InterfaceC0936) c2668.f10562).mo3800(c4930);
        }
    }

    @Override // p450.InterfaceC5191
    /* renamed from: ᐧʻ */
    public void mo4097(InterfaceC5190 interfaceC5190) {
        C2668 c2668 = this.f15442;
        c2668.getClass();
        C1714 c1714 = C1714.f6685;
        c1714.m5437("AnalyticsConnector now available.");
        InterfaceC2315 interfaceC2315 = (InterfaceC2315) interfaceC5190.get();
        ﾞᐧ r2 = new ﾞᐧ(3, interfaceC2315);
        C3767 c3767 = new C3767(15, false);
        C2313 c2313 = (C2313) interfaceC2315;
        ٴˎ r4 = c2313.m6363("clx", c3767);
        if (r4 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            ٴˎ r8 = c2313.m6363("crash", c3767);
            if (r8 != null) {
            }
            r4 = r8;
        }
        if (r4 == null) {
            c1714.m5439("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c1714.m5437("Registered Firebase Analytics listener.");
        ˑʽ r82 = new ˑʽ(5, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ﹶˆ r1 = new ﹶˆ();
        r1.ˎˑ = new Object();
        r1.ᐧⁱ = r2;
        r1.ˆʿ = timeUnit;
        synchronized (c2668) {
            try {
                Iterator it = ((ArrayList) c2668.f10563).iterator();
                while (it.hasNext()) {
                    r82.ـﹶ((C4930) it.next());
                }
                c3767.f14558 = r82;
                c3767.f14557 = r1;
                c2668.f10562 = r82;
                c2668.f10564 = r1;
            } finally {
            }
        }
    }

    @Override // p002.InterfaceC0886
    /* renamed from: ᐧⁱ */
    public void mo3704(Bundle bundle) {
        ((InterfaceC0886) this.f15442.f10564).mo3704(bundle);
    }
}
