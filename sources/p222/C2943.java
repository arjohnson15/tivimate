package p222;

import android.database.DataSetObserver;

/* renamed from: ˏᴵ.ᵎˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2943 extends DataSetObserver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2959 f11378;

    public C2943(C2959 c2959) {
        this.f11378 = c2959;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C2959 c2959 = this.f11378;
        if (c2959.f11410.isShowing()) {
            c2959.mo7326();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f11378.dismiss();
    }
}
