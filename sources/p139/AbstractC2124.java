package p139;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.lsposed.hiddenapibypass.library.R;
import p200.C2741;

/* renamed from: ˉˋ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2124 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2142 f8366 = new C2142();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ThreadLocal f8364 = new ThreadLocal();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ArrayList f8365 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2741 m6022() {
        C2741 c2741;
        ThreadLocal threadLocal = f8364;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2741 = (C2741) weakReference.get()) != null) {
            return c2741;
        }
        C2741 c27412 = new C2741(0);
        threadLocal.set(new WeakReference(c27412));
        return c27412;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m6023(ViewGroup viewGroup, AbstractC2160 abstractC2160) {
        ArrayList arrayList = (ArrayList) m6022().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2160) it.next()).mo5997(viewGroup);
            }
        }
        if (abstractC2160 != null) {
            abstractC2160.m6083(viewGroup, true);
        }
        if (viewGroup.getTag(R.id._2_res_0x7f0b03ab) != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m6024(ViewGroup viewGroup, AbstractC2160 abstractC2160) {
        ArrayList arrayList = f8365;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC2160 == null) {
            abstractC2160 = f8366;
        }
        AbstractC2160 abstractC2160Clone = abstractC2160.clone();
        m6023(viewGroup, abstractC2160Clone);
        viewGroup.setTag(R.id._2_res_0x7f0b03ab, null);
        ViewTreeObserverOnPreDrawListenerC2155 viewTreeObserverOnPreDrawListenerC2155 = new ViewTreeObserverOnPreDrawListenerC2155();
        viewTreeObserverOnPreDrawListenerC2155.f8443 = abstractC2160Clone;
        viewTreeObserverOnPreDrawListenerC2155.f8442 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2155);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2155);
    }
}
