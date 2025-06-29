package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p013.C1053;
import p098.C1771;
import p098.InterfaceC1770;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1770 {
    @Override // p098.InterfaceC1770
    /* renamed from: ʽᐧ */
    public final Object mo584(Context context) {
        if (!C1771.m5485(context).f6849.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0256.f1315.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0249());
        }
        C0234 c0234 = C0234.f1259;
        c0234.getClass();
        c0234.f1261 = new Handler();
        c0234.f1266.m1034(EnumC0247.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0235(c0234));
        return c0234;
    }

    @Override // p098.InterfaceC1770
    /* renamed from: ـﹶ */
    public final List mo586() {
        return C1053.f4449;
    }
}
