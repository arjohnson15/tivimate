package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import p266.C3262;

/* renamed from: androidx.lifecycle.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0257 extends Service implements InterfaceC0262 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3262 f1316;

    public AbstractServiceC0257() {
        C3262 c3262 = new C3262();
        c3262.f12726 = new C0236(this);
        c3262.f12724 = new Handler();
        this.f1316 = c3262;
    }

    @Override // androidx.lifecycle.InterfaceC0262
    public final AbstractC0233 getLifecycle() {
        return (C0236) this.f1316.f12726;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f1316.m8028(EnumC0247.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1316.m8028(EnumC0247.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0247 enumC0247 = EnumC0247.ON_STOP;
        C3262 c3262 = this.f1316;
        c3262.m8028(enumC0247);
        c3262.m8028(EnumC0247.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f1316.m8028(EnumC0247.ON_START);
        super.onStart(intent, i);
    }
}
