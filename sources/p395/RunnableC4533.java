package p395;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p331.C3758;
import p331.C3762;
import p456.C5349;

/* renamed from: ⁱـ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4533 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f17422;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f17423;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17424;

    public /* synthetic */ RunnableC4533(int i, Object obj, Object obj2, boolean z) {
        this.f17424 = i;
        this.f17423 = obj;
        this.f17422 = obj2;
    }

    public RunnableC4533(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f17424 = 29;
        this.f17423 = swipeDismissBehavior;
        this.f17422 = view;
    }

    public /* synthetic */ RunnableC4533(Object obj, int i, Object obj2) {
        this.f17424 = i;
        this.f17422 = obj;
        this.f17423 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p395.RunnableC4533.run():void");
    }

    public String toString() {
        switch (this.f17424) {
            case 0:
                C3762 c3762 = new C3762(RunnableC4533.class.getSimpleName());
                C3758 c3758 = new C3758(15, false);
                ((C3758) c3762.f14532).f14520 = c3758;
                c3762.f14532 = c3758;
                c3758.f14519 = (C5349) this.f17423;
                return c3762.toString();
            default:
                return super.toString();
        }
    }
}
