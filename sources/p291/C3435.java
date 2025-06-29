package p291;

import android.graphics.Rect;
import android.transition.Transition;
import androidx.leanback.widget.C0159;
import com.google.android.gms.internal.measurement.C0559;

/* renamed from: ٴᐧ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3435 extends Transition.EpicenterCallback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f13328;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f13329;

    public /* synthetic */ C3435(int i, Object obj) {
        this.f13329 = i;
        this.f13328 = obj;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f13329) {
            case 0:
                return (Rect) this.f13328;
            case 1:
                Rect rect = (Rect) this.f13328;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
            default:
                C0559 c0559 = (C0559) this.f13328;
                int height = (int) ((((C0159) c0559.f2913).f1108 * r0.f1091.getHeight()) / 100.0f);
                Rect rect2 = (Rect) c0559.f2912;
                rect2.set(0, height, 0, height);
                return rect2;
        }
    }
}
