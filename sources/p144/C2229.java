package p144;

import java.lang.ref.WeakReference;

/* renamed from: ˉٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2229 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C2229 f8872;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f8873;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2229 f8874;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f8875;

    public C2229(C2229 c2229, int i) {
        this.f8873 = i;
        this.f8874 = c2229;
        c2229.f8872 = this;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m6215() {
        switch (this.f8873) {
            case 0:
                return this.f8875;
            default:
                return ((WeakReference) this.f8875).get();
        }
    }
}
