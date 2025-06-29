package p139;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ˉˋ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2155 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ViewGroup f8442;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public AbstractC2160 f8443;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e0 A[EDGE_INSN: B:153:0x01e0->B:88:0x01e0 BREAK  A[LOOP:1: B:19:0x0087->B:87:0x01d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0206  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139.ViewTreeObserverOnPreDrawListenerC2155.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f8442;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC2124.f8365;
        ViewGroup viewGroup2 = this.f8442;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) AbstractC2124.m6022().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC2160) it.next()).mo6007(viewGroup2);
            }
        }
        this.f8443.m6088(true);
    }
}
