package p345;

import java.util.Map;
import ⁱـ.ˑי;

/* renamed from: ᵎᴵ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3977 extends AbstractC3937 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f15352;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3926 f15353;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f15354;

    public C3977(C3926 c3926, int i) {
        this.f15353 = c3926;
        Object obj = C3926.f15251;
        this.f15354 = c3926.m9130()[i];
        this.f15352 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15354;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C3926 c3926 = this.f15353;
        Map mapM9132 = c3926.m9132();
        if (mapM9132 != null) {
            return mapM9132.get(this.f15354);
        }
        m9201();
        int i = this.f15352;
        if (i == -1) {
            return null;
        }
        return c3926.m9128()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3926 c3926 = this.f15353;
        Map mapM9132 = c3926.m9132();
        Object obj2 = this.f15354;
        if (mapM9132 != null) {
            return mapM9132.put(obj2, obj);
        }
        m9201();
        int i = this.f15352;
        if (i == -1) {
            c3926.put(obj2, obj);
            return null;
        }
        Object obj3 = c3926.m9128()[i];
        c3926.m9128()[this.f15352] = obj;
        return obj3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9201() {
        int i = this.f15352;
        Object obj = this.f15354;
        C3926 c3926 = this.f15353;
        if (i != -1 && i < c3926.size()) {
            if (ˑי.ﹶˆ(obj, c3926.m9130()[this.f15352])) {
                return;
            }
        }
        Object obj2 = C3926.f15251;
        this.f15352 = c3926.m9133(obj);
    }
}
