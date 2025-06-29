package p417;

import android.os.Bundle;
import p305.C3524;

/* renamed from: ﹳᴵ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4761 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f18255;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Bundle f18256;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4747 f18257;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Boolean f18258;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4747 f18259;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f18260;

    public AbstractC4761(AbstractC4747 abstractC4747, int i, Bundle bundle) {
        this.f18259 = abstractC4747;
        Boolean bool = Boolean.TRUE;
        this.f18257 = abstractC4747;
        this.f18258 = bool;
        this.f18255 = false;
        this.f18260 = i;
        this.f18256 = bundle;
    }

    /* renamed from: ʽᐧ */
    public abstract boolean mo10677();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10694() {
        synchronized (this) {
            this.f18258 = null;
        }
    }

    /* renamed from: ـﹶ */
    public abstract void mo10678(C3524 c3524);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10695() {
        m10694();
        synchronized (this.f18257.f18206) {
            this.f18257.f18206.remove(this);
        }
    }
}
