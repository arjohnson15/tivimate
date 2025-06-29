package p210;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p200.C2758;

/* renamed from: ˏʼ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2800 extends BroadcastReceiver {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AtomicReference f10916 = new AtomicReference();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f10917;

    public C2800(Context context) {
        this.f10917 = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C2804.f10930) {
            try {
                Iterator it = ((C2758) C2804.f10929.values()).iterator();
                while (it.hasNext()) {
                    ((C2804) it.next()).m7083();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10917.unregisterReceiver(this);
    }
}
