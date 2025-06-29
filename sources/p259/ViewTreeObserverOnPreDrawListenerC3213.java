package p259;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p346.C3993;

/* renamed from: יᵢ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3213 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f12518;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12519 = 2;

    public ViewTreeObserverOnPreDrawListenerC3213(CoordinatorLayout coordinatorLayout) {
        this.f12518 = coordinatorLayout;
    }

    public ViewTreeObserverOnPreDrawListenerC3213(C3215 c3215) {
        this.f12518 = new WeakReference(c3215);
    }

    public ViewTreeObserverOnPreDrawListenerC3213(C3217 c3217) {
        this.f12518 = new WeakReference(c3217);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f12519) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                C3215 c3215 = (C3215) ((WeakReference) this.f12518).get();
                if (c3215 != null) {
                    ArrayList arrayList = c3215.f12521;
                    if (!arrayList.isEmpty()) {
                        View view = c3215.f12523;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM7915 = c3215.m7915(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM79152 = c3215.m7915(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM7915 > 0 || iM7915 == Integer.MIN_VALUE) {
                            if (iM79152 > 0 || iM79152 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((C3993) ((InterfaceC3218) it.next())).m9254(iM7915, iM79152);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c3215.f12522);
                                }
                                c3215.f12522 = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    String str2 = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                C3217 c3217 = (C3217) ((WeakReference) this.f12518).get();
                if (c3217 != null) {
                    ArrayList arrayList2 = c3217.f12529;
                    if (!arrayList2.isEmpty()) {
                        ImageView imageView = c3217.f12531;
                        int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        int iM7917 = c3217.m7917(imageView.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        int iM79172 = c3217.m7917(imageView.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iM7917 > 0 || iM7917 == Integer.MIN_VALUE) {
                            if (iM79172 > 0 || iM79172 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((C3993) ((InterfaceC3218) it2.next())).m9254(iM7917, iM79172);
                                }
                                ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(c3217.f12530);
                                }
                                c3217.f12530 = null;
                                arrayList2.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) this.f12518).m187(0);
                break;
        }
        return true;
    }
}
