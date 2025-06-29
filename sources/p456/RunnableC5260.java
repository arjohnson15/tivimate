package p456;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.InterfaceC0511;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ﾞⁱ.ˉʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5260 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ String f20372;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20373;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ String f20374;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5253 f20375;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20376 = 0;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20377;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f20378;

    public RunnableC5260(C5272 c5272, String str, String str2, C5253 c5253, boolean z, InterfaceC0511 interfaceC0511) {
        this.f20372 = str;
        this.f20374 = str2;
        this.f20375 = c5253;
        this.f20373 = z;
        this.f20378 = interfaceC0511;
        this.f20377 = c5272;
    }

    public RunnableC5260(C5272 c5272, AtomicReference atomicReference, String str, String str2, C5253 c5253, boolean z) {
        this.f20378 = atomicReference;
        this.f20372 = str;
        this.f20374 = str2;
        this.f20375 = c5253;
        this.f20373 = z;
        this.f20377 = c5272;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00eb -> B:53:0x00f2). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        C5272 c5272;
        InterfaceC5311 interfaceC5311;
        switch (this.f20376) {
            case 0:
                C5253 c5253 = this.f20375;
                String str = this.f20372;
                InterfaceC0511 interfaceC0511 = (InterfaceC0511) this.f20378;
                C5272 c52722 = this.f20377;
                Bundle bundle = new Bundle();
                try {
                    InterfaceC5311 interfaceC53112 = c52722.f20411;
                    String str2 = this.f20374;
                    if (interfaceC53112 == null) {
                        c52722.ˏᵢ().f20571.m4529(str, str2, "Failed to get user properties; not connected to service");
                    } else {
                        bundle = C5316.m11934(interfaceC53112.mo11670(str, str2, this.f20373, c5253));
                        c52722.m11776();
                        c52722.ﹶﾞ().m11968(interfaceC0511, bundle);
                    }
                } catch (RemoteException e) {
                    c52722.ˏᵢ().f20571.m4529(str, e, "Failed to get user properties; remote exception");
                } finally {
                    c52722.ﹶﾞ().m11968(interfaceC0511, bundle);
                }
                return;
            default:
                synchronized (((AtomicReference) this.f20378)) {
                    try {
                        try {
                            c5272 = this.f20377;
                            interfaceC5311 = c5272.f20411;
                        } catch (RemoteException e2) {
                            this.f20377.ˏᵢ().f20571.m4530("(legacy) Failed to get user properties; remote exception", null, this.f20372, e2);
                            ((AtomicReference) this.f20378).set(Collections.emptyList());
                        }
                        if (interfaceC5311 == null) {
                            c5272.ˏᵢ().f20571.m4530("(legacy) Failed to get user properties; not connected to service", null, this.f20372, this.f20374);
                            ((AtomicReference) this.f20378).set(Collections.emptyList());
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.f20378).set(interfaceC5311.mo11670(this.f20372, this.f20374, this.f20373, this.f20375));
                        } else {
                            ((AtomicReference) this.f20378).set(interfaceC5311.mo11681(null, this.f20372, this.f20374, this.f20373));
                        }
                        this.f20377.m11776();
                        ((AtomicReference) this.f20378).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f20378).notify();
                    }
                }
        }
    }
}
