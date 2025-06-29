package p220;

import android.view.View;
import java.util.WeakHashMap;
import p378.AbstractC4345;
import p378.AbstractC4362;

/* renamed from: ˏٴ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2852 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
