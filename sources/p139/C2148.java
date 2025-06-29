package p139;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.decoder.ffmpeg.C0268;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p291.AbstractC3448;
import p291.RunnableC3441;
import ʻˉ.ᐧˋ;
import ʾˊ.ᴵʿ;

/* renamed from: ˉˋ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2148 extends AbstractC3448 {
    @Override // p291.AbstractC3448
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo6044(Object obj, ArrayList arrayList) {
        AbstractC2160 abstractC2160 = (AbstractC2160) obj;
        if (abstractC2160 == null) {
            return;
        }
        int i = 0;
        if (abstractC2160 instanceof C2122) {
            C2122 c2122 = (C2122) abstractC2160;
            int size = c2122.f8356.size();
            while (i < size) {
                mo6044(c2122.m6000(i), arrayList);
                i++;
            }
            return;
        }
        if (AbstractC3448.m8299(abstractC2160.f8461) && AbstractC3448.m8299(abstractC2160.f8478)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC2160.mo6018((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo6045(ViewGroup viewGroup, Object obj) {
        AbstractC2124.m6024(viewGroup, (AbstractC2160) obj);
    }

    @Override // p291.AbstractC3448
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo6046(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, Object obj, C0268 c0268, RunnableC3441 runnableC3441) {
        mo6048(obj, c0268, null, runnableC3441);
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean mo6047() {
        return true;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void mo6048(Object obj, C0268 c0268, RunnableC0246 runnableC0246, Runnable runnable) {
        AbstractC2160 abstractC2160 = (AbstractC2160) obj;
        C2125 c2125 = new C2125(runnableC0246, abstractC2160, runnable, 0);
        synchronized (c0268) {
            while (c0268.f1399) {
                try {
                    try {
                        c0268.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((C2125) c0268.f1400) != c2125) {
                c0268.f1400 = c2125;
                if (c0268.f1401) {
                    c2125.m6025();
                }
            }
        }
        abstractC2160.m6085(new ᴵʿ(4, runnable));
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean mo6049(Object obj) {
        boolean zMo5998 = ((AbstractC2160) obj).mo5998();
        if (!zMo5998) {
            String str = "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().";
        }
        return zMo5998;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo6050(Object obj, float f) {
        C2154 c2154 = (C2154) obj;
        boolean z = c2154.f8434;
        if (z) {
            C2122 c2122 = c2154.f8436;
            long j = c2122.f8459;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (c2154.f8435 != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j3 = c2154.f8438;
            if (j2 == j3 || !z) {
                return;
            }
            if (!c2154.f8437) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    c2122.mo6021(j2, j3);
                    c2154.f8438 = j2;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ᐧʻ r13 = c2154.f8439;
            int i = (r13.ˆʿ + 1) % 20;
            r13.ˆʿ = i;
            ((long[]) r13.ˎˑ)[i] = jCurrentAnimationTimeMillis;
            ((float[]) r13.ᐧˋ)[i] = j2;
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Object mo6051(Object obj, Object obj2) {
        C2122 c2122 = new C2122();
        if (obj != null) {
            c2122.m6020((AbstractC2160) obj);
        }
        c2122.m6020((AbstractC2160) obj2);
        return c2122;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Object mo6052(Object obj) {
        if (obj != null) {
            return ((AbstractC2160) obj).clone();
        }
        return null;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo6053(Object obj) {
        ((C2154) obj).m6070();
    }

    @Override // p291.AbstractC3448
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo6054(Object obj, View view, ArrayList arrayList) {
        ((AbstractC2160) obj).m6085(new C2126(view, arrayList));
    }

    @Override // p291.AbstractC3448
    /* renamed from: יʻ, reason: contains not printable characters */
    public final Object mo6055(Object obj) {
        if (obj == null) {
            return null;
        }
        C2122 c2122 = new C2122();
        c2122.m6020((AbstractC2160) obj);
        return c2122;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo6056(View view, Object obj) {
        ((AbstractC2160) obj).mo6018(view);
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo6057(Object obj) {
        return obj instanceof AbstractC2160;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final Object mo6058(Object obj, Object obj2, Object obj3) {
        AbstractC2160 abstractC2160 = (AbstractC2160) obj;
        AbstractC2160 abstractC21602 = (AbstractC2160) obj2;
        AbstractC2160 abstractC21603 = (AbstractC2160) obj3;
        if (abstractC2160 != null && abstractC21602 != null) {
            C2122 c2122 = new C2122();
            c2122.m6020(abstractC2160);
            c2122.m6020(abstractC21602);
            c2122.m5996(1);
            abstractC2160 = c2122;
        } else if (abstractC2160 == null) {
            abstractC2160 = abstractC21602 != null ? abstractC21602 : null;
        }
        if (abstractC21603 == null) {
            return abstractC2160;
        }
        C2122 c21222 = new C2122();
        if (abstractC2160 != null) {
            c21222.m6020(abstractC2160);
        }
        c21222.m6020(abstractC21603);
        return c21222;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo6059(View view, Object obj) {
        if (view != null) {
            AbstractC3448.m8298(view, new Rect());
            ((AbstractC2160) obj).mo6006(new C2133());
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo6060(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC2160) obj).m6085(new C2129(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo6061(Object obj, Rect rect) {
        ((AbstractC2160) obj).mo6006(new C2133());
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m6062(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2160 abstractC2160 = (AbstractC2160) obj;
        int i = 0;
        if (abstractC2160 instanceof C2122) {
            C2122 c2122 = (C2122) abstractC2160;
            int size = c2122.f8356.size();
            while (i < size) {
                m6062(c2122.m6000(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (AbstractC3448.m8299(abstractC2160.f8461)) {
            ArrayList arrayList3 = abstractC2160.f8478;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    abstractC2160.mo6018((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC2160.mo6001((View) arrayList.get(size3));
                }
            }
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo6063(Object obj, ᐧˋ r2) {
        C2154 c2154 = (C2154) obj;
        c2154.f8440 = r2;
        if (!c2154.f8434) {
            c2154.f8441 = 2;
        } else {
            c2154.m6071();
            c2154.f8435.m10272(0.0f);
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object mo6064(ViewGroup viewGroup, Object obj) {
        AbstractC2160 abstractC2160 = (AbstractC2160) obj;
        ArrayList arrayList = AbstractC2124.f8365;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC2160.mo5998()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        AbstractC2160 abstractC2160Clone = abstractC2160.clone();
        C2122 c2122 = new C2122();
        c2122.m6020(abstractC2160Clone);
        AbstractC2124.m6023(viewGroup, c2122);
        viewGroup.setTag(R.id._2_res_0x7f0b03ab, null);
        ViewTreeObserverOnPreDrawListenerC2155 viewTreeObserverOnPreDrawListenerC2155 = new ViewTreeObserverOnPreDrawListenerC2155();
        viewTreeObserverOnPreDrawListenerC2155.f8443 = c2122;
        viewTreeObserverOnPreDrawListenerC2155.f8442 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2155);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2155);
        viewGroup.invalidate();
        C2154 c2154 = new C2154(c2122);
        c2122.f8462 = c2154;
        c2122.m6085(c2154);
        return c2122.f8462;
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void mo6065(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C2122 c2122 = (C2122) obj;
        if (c2122 != null) {
            ArrayList arrayList3 = c2122.f8478;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m6062(c2122, arrayList, arrayList2);
        }
    }

    @Override // p291.AbstractC3448
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void mo6066(Object obj, View view, ArrayList arrayList) {
        C2122 c2122 = (C2122) obj;
        ArrayList arrayList2 = c2122.f8478;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC3448.m8300(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo6044(c2122, arrayList);
    }
}
