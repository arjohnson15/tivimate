package p389;

import android.view.View;
import p361.C4105;
import ˈי.ʾˈ;

/* renamed from: ⁱʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4508 extends ʾˈ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f17333;

    public /* synthetic */ C4508(int i) {
        this.f17333 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final float m10269(C4105 c4105) {
        switch (this.f17333) {
            case 0:
                return ((View) c4105).getAlpha();
            case 1:
                return ((View) c4105).getScaleX();
            case 2:
                return ((View) c4105).getScaleY();
            case 3:
                return ((View) c4105).getRotation();
            case 4:
                return ((View) c4105).getRotationX();
            default:
                return ((View) c4105).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m10270(C4105 c4105, float f) {
        switch (this.f17333) {
            case 0:
                ((View) c4105).setAlpha(f);
                break;
            case 1:
                ((View) c4105).setScaleX(f);
                break;
            case 2:
                ((View) c4105).setScaleY(f);
                break;
            case 3:
                ((View) c4105).setRotation(f);
                break;
            case 4:
                ((View) c4105).setRotationX(f);
                break;
            default:
                ((View) c4105).setRotationY(f);
                break;
        }
    }
}
