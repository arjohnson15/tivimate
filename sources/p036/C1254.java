package p036;

import android.media.Spatializer;
import p345.AbstractC3925;

/* renamed from: ʼﹶ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1254 implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1255 f5149;

    public C1254(C1255 c1255) {
        this.f5149 = c1255;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        C1255 c1255 = this.f5149;
        AbstractC3925 abstractC3925 = C1255.f5150;
        c1255.m4485();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        C1255 c1255 = this.f5149;
        AbstractC3925 abstractC3925 = C1255.f5150;
        c1255.m4485();
    }
}
