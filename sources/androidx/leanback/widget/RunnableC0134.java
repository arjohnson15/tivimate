package androidx.leanback.widget;

import com.google.android.material.datepicker.C0687;
import java.util.ArrayList;
import java.util.List;
import p192.AbstractC2669;
import p293.C3469;
import p371.AbstractC4205;
import p396.C4554;

/* renamed from: androidx.leanback.widget.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0134 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f1024;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f1025;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1026;

    public /* synthetic */ RunnableC0134(int i, int i2, Object obj) {
        this.f1026 = i2;
        this.f1025 = obj;
        this.f1024 = i;
    }

    public RunnableC0134(List list, int i, Throwable th) {
        this.f1026 = 3;
        ˈי.ʾˈ.ʿʼ(list, "initCallbacks cannot be null");
        this.f1025 = new ArrayList(list);
        this.f1024 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1026) {
            case 0:
                SearchBar searchBar = (SearchBar) this.f1025;
                searchBar.f928.play(searchBar.f910.get(this.f1024), 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case 1:
                ((C0687) this.f1025).f3274.mo955(this.f1024);
                break;
            case 2:
                AbstractC4205 abstractC4205 = (AbstractC4205) ((C4554) this.f1025).f17462;
                if (abstractC4205 != null) {
                    abstractC4205.mo7177(this.f1024);
                    break;
                }
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f1025;
                int size = arrayList.size();
                int i = 0;
                if (this.f1024 == 1) {
                    while (i < size) {
                        ((AbstractC2669) arrayList.get(i)).mo4132();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((AbstractC2669) arrayList.get(i)).mo4133();
                        i++;
                    }
                    break;
                }
            default:
                ((C3469) this.f1025).m8329(this.f1024);
                break;
        }
    }
}
