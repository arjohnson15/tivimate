package p029;

import android.animation.ValueAnimator;
import android.os.RemoteException;
import android.view.View;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p061.RunnableC1432;
import p331.C3759;
import p378.C4394;
import p396.C4554;
import p417.AbstractC4753;
import p456.C5247;
import p456.C5253;
import p456.C5272;
import p456.C5318;
import p456.EnumC5341;
import p456.InterfaceC5311;

/* renamed from: ʼˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1181 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f4882;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f4883;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f4884;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4885;

    public /* synthetic */ RunnableC1181(int i) {
        this.f4885 = i;
    }

    public RunnableC1181(View view, C4394 c4394, C3759 c3759, ValueAnimator valueAnimator) {
        this.f4885 = 5;
        this.f4882 = view;
        this.f4883 = c3759;
        this.f4884 = valueAnimator;
    }

    public /* synthetic */ RunnableC1181(Object obj, Object obj2, Object obj3, int i) {
        this.f4885 = i;
        this.f4884 = obj;
        this.f4882 = obj2;
        this.f4883 = obj3;
    }

    public /* synthetic */ RunnableC1181(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f4885 = i;
        this.f4882 = obj;
        this.f4883 = obj2;
        this.f4884 = obj3;
    }

    public RunnableC1181(C5318 c5318, String str, URL url, C4554 c4554) {
        this.f4885 = 11;
        this.f4884 = c5318;
        AbstractC4753.m10688(str);
        this.f4882 = url;
        this.f4883 = c4554;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m4233() {
        synchronized (((AtomicReference) this.f4882)) {
            try {
                try {
                } catch (RemoteException e) {
                    ((C5272) this.f4884).ˏᵢ().f20571.m4531(e, "Failed to get app instance id");
                }
                if (!((C5272) this.f4884).ᐧᴵ().m11855().m12151(EnumC5341.f20711)) {
                    ((C5272) this.f4884).ˏᵢ().f20573.m4533("Analytics storage consent denied; will not get app instance id");
                    ((C5272) this.f4884).m11847().m11714(null);
                    ((C5272) this.f4884).ᐧᴵ().f20468.m1604(null);
                    ((AtomicReference) this.f4882).set(null);
                    return;
                }
                C5272 c5272 = (C5272) this.f4884;
                InterfaceC5311 interfaceC5311 = c5272.f20411;
                if (interfaceC5311 == null) {
                    c5272.ˏᵢ().f20571.m4533("Failed to get app instance id");
                    return;
                }
                ((AtomicReference) this.f4882).set(interfaceC5311.mo11686((C5253) this.f4883));
                String str = (String) ((AtomicReference) this.f4882).get();
                if (str != null) {
                    ((C5272) this.f4884).m11847().m11714(str);
                    ((C5272) this.f4884).ᐧᴵ().f20468.m1604(str);
                }
                ((C5272) this.f4884).m11776();
                ((AtomicReference) this.f4882).notify();
            } finally {
                ((AtomicReference) this.f4882).notify();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p029.RunnableC1181.run():void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4234(int i, IOException iOException, byte[] bArr, Map map) {
        C5247 c5247 = ((C5318) this.f4884).ʽᐧ();
        RunnableC1432 runnableC1432 = new RunnableC1432(2);
        runnableC1432.f5862 = this;
        runnableC1432.f5865 = i;
        runnableC1432.f5864 = iOException;
        runnableC1432.f5863 = bArr;
        c5247.m11743(runnableC1432);
    }
}
