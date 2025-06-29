package p009;

import android.view.View;
import androidx.fragment.app.AbstractActivityC0113;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ʻˋ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0982 implements InterfaceC0993 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile boolean f4321;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Set f4322 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p009.InterfaceC0993
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo3948(AbstractActivityC0113 abstractActivityC0113) {
        if (!this.f4321 && this.f4322.add(abstractActivityC0113)) {
            View decorView = abstractActivityC0113.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC0999(this, decorView));
        }
    }
}
