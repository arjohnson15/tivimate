package p410;

import p395.C4528;

/* renamed from: ﹳˎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4682 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4681 f17817;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C4680 f17818;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f17819;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f17820;

    public final void finalize() {
        C4680 c4680;
        C4681 c4681 = this.f17817;
        if (c4681 != null) {
            C4678 c4678 = c4681.f17815;
            if (!c4678.isDone()) {
                c4678.mo10583(new C4528("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f17819, 2));
            }
        }
        if (this.f17820 || (c4680 = this.f17818) == null) {
            return;
        }
        c4680.m10591(null);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10584(Throwable th) {
        this.f17820 = true;
        C4681 c4681 = this.f17817;
        if (c4681 == null || !c4681.f17815.mo10583(th)) {
            return;
        }
        this.f17819 = null;
        this.f17817 = null;
        this.f17818 = null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10585(Object obj) {
        this.f17820 = true;
        C4681 c4681 = this.f17817;
        if (c4681 == null || !c4681.f17815.m10591(obj)) {
            return;
        }
        this.f17819 = null;
        this.f17817 = null;
        this.f17818 = null;
    }
}
