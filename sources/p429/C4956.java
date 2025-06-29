package p429;

import android.app.Application;
import android.content.Context;
import p072.AbstractC1642;
import p210.C2804;
import p322.C3669;
import p330.InterfaceC3747;

/* renamed from: ﹶˎ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4956 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3669 f18741;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2804 f18742;

    public C4956(C2804 c2804, C3669 c3669, InterfaceC3747 interfaceC3747, InterfaceC4980 interfaceC4980) {
        this.f18742 = c2804;
        this.f18741 = c3669;
        c2804.m7085();
        Context applicationContext = c2804.f10936.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C4979.f18817);
            AbstractC1642.m5294(AbstractC1642.m5296(interfaceC3747), null, 0, new C4953(this, interfaceC3747, interfaceC4980, null), 3);
        } else {
            String str = "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.';
        }
    }
}
