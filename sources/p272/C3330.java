package p272;

import android.content.Context;
import android.widget.FrameLayout;
import com.bumptech.glide.ﹳﹳ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p112.C1808;
import p383.AbstractC4470;

/* renamed from: ـᐧ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3330 extends FrameLayout implements InterfaceC3298 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3331 f12979;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public float f12980;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public List f12981;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3299 f12982;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3336 f12983;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public float f12984;

    public C3330(Context context) {
        super(context, null);
        this.f12981 = Collections.emptyList();
        this.f12982 = C3299.f12841;
        this.f12980 = 0.0533f;
        this.f12984 = 0.08f;
        C3336 c3336 = new C3336(context);
        this.f12983 = c3336;
        C3331 c3331 = new C3331(context, null);
        this.f12979 = c3331;
        c3331.setBackgroundColor(0);
        addView(c3336);
        addView(c3331);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f12981.isEmpty()) {
            return;
        }
        m8141();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m8140(int i, float f) {
        float f2 = ﹳﹳ.ﹳˑ(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (f2 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(f2 / getContext().getResources().getDisplayMetrics().density)};
        int i2 = AbstractC4470.f17202;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8141() {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.C3330.m8141():void");
    }

    @Override // p272.InterfaceC3298
    /* renamed from: ـﹶ */
    public final void mo8105(List list, C3299 c3299, float f, float f2) {
        this.f12982 = c3299;
        this.f12980 = f;
        this.f12984 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1808 c1808 = (C1808) list.get(i);
            if (c1808.f7000 != null) {
                arrayList.add(c1808);
            } else {
                arrayList2.add(c1808);
            }
        }
        if (!this.f12981.isEmpty() || !arrayList2.isEmpty()) {
            this.f12981 = arrayList2;
            m8141();
        }
        this.f12983.mo8105(arrayList, c3299, f, f2);
        invalidate();
    }
}
