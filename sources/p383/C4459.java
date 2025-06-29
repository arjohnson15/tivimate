package p383;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: ᵢᵢ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4459 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4456 f17176;

    public C4459(C4456 c4456) {
        this.f17176 = c4456;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        C4456.m10068(z ? 10 : 5, this.f17176);
    }
}
