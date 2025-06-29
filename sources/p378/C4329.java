package p378;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p007.AbstractC0968;
import p421.C4861;

/* renamed from: ᵢٴ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4329 extends WindowInsetsAnimation.Callback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public List f16809;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ArrayList f16810;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4389 f16811;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final HashMap f16812;

    public C4329(C4389 c4389) {
        super(0);
        this.f16812 = new HashMap();
        this.f16811 = c4389;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C4389 c4389 = this.f16811;
        m9824(windowInsetsAnimation);
        ((View) c4389.f16911).setTranslationY(0.0f);
        this.f16812.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C4389 c4389 = this.f16811;
        m9824(windowInsetsAnimation);
        View view = (View) c4389.f16911;
        int[] iArr = (int[]) c4389.f16915;
        view.getLocationOnScreen(iArr);
        c4389.f16912 = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f16810;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f16810 = arrayList2;
            this.f16809 = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM3908 = AbstractC0968.m3908(list.get(size));
            C4394 c4394M9824 = m9824(windowInsetsAnimationM3908);
            c4394M9824.f16922.mo9965(windowInsetsAnimationM3908.getFraction());
            this.f16810.add(c4394M9824);
        }
        C4389 c4389 = this.f16811;
        C4369 c4369M9950 = C4369.m9950(null, windowInsets);
        c4389.m9980(c4369M9950, this.f16809);
        return c4369M9950.m9954();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C4389 c4389 = this.f16811;
        m9824(windowInsetsAnimation);
        C4861 c4861M10936 = C4861.m10936(bounds.getLowerBound());
        C4861 c4861M109362 = C4861.m10936(bounds.getUpperBound());
        View view = (View) c4389.f16911;
        int[] iArr = (int[]) c4389.f16915;
        view.getLocationOnScreen(iArr);
        int i = c4389.f16912 - iArr[1];
        c4389.f16913 = i;
        view.setTranslationY(i);
        AbstractC0968.m3924();
        return AbstractC0968.m3916(c4861M10936.m10938(), c4861M109362.m10938());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4394 m9824(WindowInsetsAnimation windowInsetsAnimation) {
        C4394 c4394 = (C4394) this.f16812.get(windowInsetsAnimation);
        if (c4394 == null) {
            c4394 = new C4394(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c4394.f16922 = new C4381(windowInsetsAnimation);
            }
            this.f16812.put(windowInsetsAnimation, c4394);
        }
        return c4394;
    }
}
