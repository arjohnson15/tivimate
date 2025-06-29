package p181;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.AbstractC0632;
import com.google.android.gms.internal.play_billing.C0611;
import com.google.android.gms.internal.play_billing.ˎˑ;
import p007.C0937;
import p331.C3767;
import p417.AbstractC4753;
import p456.C5273;

/* renamed from: ˋᵔ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2514 extends BroadcastReceiver {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f9997;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f9998;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9999 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f10000;

    public C2514(C0937 c0937, boolean z) {
        this.f10000 = c0937;
        this.f9998 = z;
    }

    public C2514(C5273 c5273) {
        AbstractC4753.m10683(c5273);
        this.f10000 = c5273;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p181.C2514.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m6636() {
        C5273 c5273 = (C5273) this.f10000;
        c5273.m11794();
        c5273.mo11648().m11740();
        c5273.mo11648().m11740();
        if (this.f9997) {
            c5273.mo11655().f20566.m4533("Unregistering connectivity change receiver");
            this.f9997 = false;
            this.f9998 = false;
            try {
                c5273.f20418.f20114.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c5273.mo11655().f20571.m4531(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m6637(Bundle bundle, C2510 c2510, int i) {
        AbstractC0632 abstractC0632;
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            ((C3767) ((C0937) this.f10000).f4127).m8803(AbstractC2508.m6628(23, i, c2510));
            return;
        }
        try {
            C3767 c3767 = (C3767) ((C0937) this.f10000).f4127;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = AbstractC0632.f3015;
            synchronized (AbstractC0632.class) {
                int i3 = AbstractC0632.f3015;
                abstractC0632 = ˎˑ.ᐧⁱ();
                int i4 = AbstractC0632.f3015;
            }
            c3767.m8803(C0611.m2610(byteArray, abstractC0632));
        } catch (Throwable unused) {
            AbstractC0629.m2646("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public synchronized void m6638(Context context, IntentFilter intentFilter) {
        try {
            if (this.f9997) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f9998 ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f9997 = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
