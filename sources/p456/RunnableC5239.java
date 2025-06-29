package p456;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.InterfaceC0511;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ﾞⁱ.ʼﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5239 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ String f20131;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20132;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ String f20133;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5253 f20134;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20135 = 0;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f20136;

    public RunnableC5239(C5272 c5272, String str, String str2, C5253 c5253, InterfaceC0511 interfaceC0511) {
        this.f20131 = str;
        this.f20133 = str2;
        this.f20134 = c5253;
        this.f20136 = interfaceC0511;
        this.f20132 = c5272;
    }

    public RunnableC5239(C5272 c5272, AtomicReference atomicReference, String str, String str2, C5253 c5253) {
        this.f20136 = atomicReference;
        this.f20131 = str;
        this.f20133 = str2;
        this.f20134 = c5253;
        this.f20132 = c5272;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e5 -> B:50:0x00ec). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        C5272 c5272;
        InterfaceC5311 interfaceC5311;
        switch (this.f20135) {
            case 0:
                C5253 c5253 = this.f20134;
                String str = this.f20133;
                String str2 = this.f20131;
                InterfaceC0511 interfaceC0511 = (InterfaceC0511) this.f20136;
                C5272 c52722 = this.f20132;
                ArrayList arrayList = new ArrayList();
                try {
                    InterfaceC5311 interfaceC53112 = c52722.f20411;
                    if (interfaceC53112 == null) {
                        c52722.ˏᵢ().f20571.m4529(str2, str, "Failed to get conditional properties; not connected to service");
                    } else {
                        arrayList = C5316.m11932(interfaceC53112.mo11663(str2, str, c5253));
                        c52722.m11776();
                        c52722.ﹶﾞ().m11973(interfaceC0511, arrayList);
                    }
                } catch (RemoteException e) {
                    c52722.ˏᵢ().f20571.m4530("Failed to get conditional properties; remote exception", str2, str, e);
                } finally {
                    c52722.ﹶﾞ().m11973(interfaceC0511, arrayList);
                }
                return;
            default:
                synchronized (((AtomicReference) this.f20136)) {
                    try {
                        try {
                            c5272 = this.f20132;
                            interfaceC5311 = c5272.f20411;
                        } catch (RemoteException e2) {
                            this.f20132.ˏᵢ().f20571.m4530("(legacy) Failed to get conditional properties; remote exception", null, this.f20131, e2);
                            ((AtomicReference) this.f20136).set(Collections.emptyList());
                        }
                        if (interfaceC5311 == null) {
                            c5272.ˏᵢ().f20571.m4530("(legacy) Failed to get conditional properties; not connected to service", null, this.f20131, this.f20133);
                            ((AtomicReference) this.f20136).set(Collections.emptyList());
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.f20136).set(interfaceC5311.mo11663(this.f20131, this.f20133, this.f20134));
                        } else {
                            ((AtomicReference) this.f20136).set(interfaceC5311.mo11664(null, this.f20131, this.f20133));
                        }
                        this.f20132.m11776();
                        ((AtomicReference) this.f20136).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f20136).notify();
                    }
                }
        }
    }
}
