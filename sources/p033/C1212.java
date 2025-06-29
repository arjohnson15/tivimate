package p033;

import android.view.View;
import p061.AbstractC1375;

/* renamed from: ʼᵎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1212 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f4959;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f4960;

    public /* synthetic */ C1212(int i, int i2) {
        this.f4960 = i;
        this.f4959 = i2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4294(AbstractC1375 abstractC1375) {
        View view = abstractC1375.f5618;
        this.f4960 = view.getLeft();
        this.f4959 = view.getTop();
        view.getRight();
        view.getBottom();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int m4295() {
        int i = this.f4959;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
