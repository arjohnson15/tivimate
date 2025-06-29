package p456;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0380;
import com.google.android.gms.internal.measurement.C0397;
import p061.C1424;
import p200.C2741;
import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5275 extends C1424 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ C5352 f20452;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5275(C5352 c5352) {
        super(20);
        this.f20452 = c5352;
    }

    @Override // p061.C1424
    /* renamed from: ˑʽ */
    public final Object mo4938(Object obj) {
        String str = (String) obj;
        AbstractC4753.m10688(str);
        C5352 c5352 = this.f20452;
        c5352.m11909();
        AbstractC4753.m10688(str);
        if (!TextUtils.isEmpty(str)) {
            C2741 c2741 = c5352.f20763;
            C0380 c0380 = (C0380) c2741.get(str);
            if (c0380 != null && c0380.m2102() != 0) {
                if (!c2741.containsKey(str) || c2741.get(str) == null) {
                    c5352.m12131(str);
                } else {
                    c5352.m12125(str, (C0380) c2741.get(str));
                }
                return (C0397) c5352.f20768.m4942().get(str);
            }
        }
        return null;
    }
}
