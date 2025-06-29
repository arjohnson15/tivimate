package p291;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p378.AbstractC4339;
import p378.AbstractC4345;

/* renamed from: ٴᐧ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3412 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13270;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13271;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13272;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f13273;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13274;

    public RunnableC3412(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f13274 = i;
        this.f13270 = arrayList;
        this.f13272 = arrayList2;
        this.f13273 = arrayList3;
        this.f13271 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f13274; i++) {
            View view = (View) this.f13270.get(i);
            String str = (String) this.f13272.get(i);
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            AbstractC4339.m9864(view, str);
            AbstractC4339.m9864((View) this.f13273.get(i), (String) this.f13271.get(i));
        }
    }
}
