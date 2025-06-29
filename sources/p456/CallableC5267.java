package p456;

import com.google.android.gms.internal.measurement.C0320;
import com.google.android.gms.internal.measurement.C0453;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p331.C3761;

/* renamed from: ﾞⁱ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC5267 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public /* synthetic */ C5352 f20399;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public /* synthetic */ String f20400;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f20401;

    public /* synthetic */ CallableC5267(int i) {
        this.f20401 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20401) {
            case 0:
                C3761 c3761 = new C3761(20, this.f20399, this.f20400, false);
                C0320 c0320 = new C0320("internal.remoteConfig", 1);
                c0320.f2644.put("getValue", new C0453(c3761));
                return c0320;
            case 1:
                C5348 c5348M12023 = this.f20399.m12023();
                String str = this.f20400;
                C5231 c5231M12069 = c5348M12023.m12069(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                map.put("gmp_version", 102001L);
                if (c5231M12069 != null) {
                    String strM11613 = c5231M12069.m11613();
                    if (strM11613 != null) {
                        map.put("app_version", strM11613);
                    }
                    map.put("app_version_int", Long.valueOf(c5231M12069.m11635()));
                    map.put("dynamite_version", Long.valueOf(c5231M12069.m11616()));
                }
                return map;
            default:
                CallableC5267 callableC5267 = new CallableC5267(1);
                callableC5267.f20399 = this.f20399;
                callableC5267.f20400 = this.f20400;
                return new C0453(callableC5267);
        }
    }
}
