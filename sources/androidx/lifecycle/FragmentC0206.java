package androidx.lifecycle;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class FragmentC0206 extends Fragment {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f1216 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ʾי.ˑʽ f1217;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m998(EnumC0247.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m998(EnumC0247.ON_DESTROY);
        this.f1217 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m998(EnumC0247.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ʾי.ˑʽ r0 = this.f1217;
        if (r0 != null) {
            ((C0234) r0.ˆʿ).m1033();
        }
        m998(EnumC0247.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ʾי.ˑʽ r0 = this.f1217;
        if (r0 != null) {
            C0234 c0234 = (C0234) r0.ˆʿ;
            int i = c0234.f1265 + 1;
            c0234.f1265 = i;
            if (i == 1 && c0234.f1264) {
                c0234.f1266.m1034(EnumC0247.ON_START);
                c0234.f1264 = false;
            }
        }
        m998(EnumC0247.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m998(EnumC0247.ON_STOP);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m998(EnumC0247 enumC0247) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC0224.m1020(getActivity(), enumC0247);
        }
    }
}
