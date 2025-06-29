package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import p070.AbstractC1549;
import p285.C3383;
import p285.InterfaceC3388;
import p288.C3406;

/* renamed from: androidx.lifecycle.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0212 implements InterfaceC3388 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f1221;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Bundle f1222;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3383 f1223;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3406 f1224;

    public C0212(C3383 c3383, InterfaceC0242 interfaceC0242) {
        this.f1223 = c3383;
        this.f1224 = new C3406(new C0248(0, interfaceC0242));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m1007() {
        if (this.f1221) {
            return;
        }
        Bundle bundleM8243 = this.f1223.m8243("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1222;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM8243 != null) {
            bundle.putAll(bundleM8243);
        }
        this.f1222 = bundle;
        this.f1221 = true;
    }

    @Override // p285.InterfaceC3388
    /* renamed from: ـﹶ */
    public final Bundle mo629() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1222;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C0219) this.f1224.getValue()).f1235.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo629 = ((C0251) entry.getValue()).f1304.mo629();
            if (!AbstractC1549.m5138(bundleMo629, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo629);
            }
        }
        this.f1221 = false;
        return bundle;
    }
}
