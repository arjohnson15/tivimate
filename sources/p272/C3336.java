package p272;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ـᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3336 extends View implements InterfaceC3298 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public List f13024;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public float f13025;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public float f13026;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3299 f13027;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f13028;

    public C3336(Context context) {
        super(context, null);
        this.f13028 = new ArrayList();
        this.f13024 = Collections.emptyList();
        this.f13026 = 0.0533f;
        this.f13027 = C3299.f12841;
        this.f13025 = 0.08f;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.C3336.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // p272.InterfaceC3298
    /* renamed from: ـﹶ */
    public final void mo8105(List list, C3299 c3299, float f, float f2) {
        this.f13024 = list;
        this.f13027 = c3299;
        this.f13026 = f;
        this.f13025 = f2;
        while (true) {
            ArrayList arrayList = this.f13028;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C3341(getContext()));
        }
    }
}
