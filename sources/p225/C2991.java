package p225;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p285.C3383;
import p285.InterfaceC3388;

/* renamed from: ˏᵢ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2991 implements InterfaceC3388 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f11508;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11509;

    public C2991(AbstractActivityC3013 abstractActivityC3013) {
        this.f11509 = 0;
        this.f11508 = abstractActivityC3013;
    }

    public C2991(C3383 c3383) {
        this.f11509 = 1;
        this.f11508 = new LinkedHashSet();
        c3383.m8242("androidx.savedstate.Restarter", this);
    }

    @Override // p285.InterfaceC3388
    /* renamed from: ـﹶ */
    public final Bundle mo629() {
        switch (this.f11509) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC3013) this.f11508).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f11508));
                return bundle2;
        }
    }
}
