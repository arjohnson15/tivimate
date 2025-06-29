package p446;

import com.google.android.gms.internal.measurement.C0559;
import p153.C2324;
import p193.C2687;
import p344.AbstractC3917;
import ˆʽ.ᵎˏ;

/* renamed from: ﾞˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5158 extends AbstractC5164 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C5162 f19707;

    static {
        AbstractC3917.m9105(C5158.class);
    }

    public C5158(C0559 c0559, C5168 c5168, String str) {
        super(c0559, c5168, str);
        C5162 c5162 = new C5162();
        c5162.f19727 = c5168;
        c5162.f19725 = c0559;
        c5162.f19726 = str;
        this.f19707 = c5162;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("File{fileId=");
        sb.append(this.f19733);
        sb.append(", fileName='");
        return ᵎˏ.ˎٴ(sb, this.f19734, "'}");
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final C5163 m11456(boolean z) {
        long j = z ? ((C2687) m11460()).f10597 : 0L;
        C5162 c5162 = this.f19707;
        c5162.getClass();
        int i = c5162.f19727.f19713;
        C5163 c5163 = new C5163();
        c5163.f19729 = false;
        c5163.f19731 = c5162;
        C5167 c5167 = new C5167();
        C2324 c2324 = new C2324(4);
        c2324.f9219 = new byte[i];
        c5167.f19751 = c2324;
        c5167.f11097 = j;
        c5163.f19730 = c5167;
        return c5163;
    }
}
