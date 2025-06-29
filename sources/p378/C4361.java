package p378;

import android.view.View;
import java.lang.ref.WeakReference;
import p139.C2137;

/* renamed from: ᵢٴ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4361 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final WeakReference f16865;

    public C4361(View view) {
        this.f16865 = new WeakReference(view);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9938() {
        View view = (View) this.f16865.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9939(float f) {
        View view = (View) this.f16865.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9940(long j) {
        View view = (View) this.f16865.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9941(float f) {
        View view = (View) this.f16865.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9942(InterfaceC4360 interfaceC4360) {
        View view = (View) this.f16865.get();
        if (view != null) {
            if (interfaceC4360 != null) {
                view.animate().setListener(new C2137(interfaceC4360, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }
}
