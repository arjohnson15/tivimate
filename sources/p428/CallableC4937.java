package p428;

import android.util.Log;
import com.google.android.gms.internal.measurement.C0559;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import p136.C2096;
import ˉˆ.ﹳﹳ;

/* renamed from: ﹶˊ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC4937 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C4925 f18679;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f18680;

    public /* synthetic */ CallableC4937(C4925 c4925, int i) {
        this.f18680 = i;
        this.f18679 = c4925;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18680) {
            case 0:
                try {
                    C0559 c0559 = this.f18679.f18612;
                    String str = (String) c0559.f2912;
                    ﹳﹳ r1 = (ﹳﹳ) c0559.f2913;
                    r1.getClass();
                    boolean zDelete = new File((File) r1.ˎˑ, str).delete();
                    if (!zDelete) {
                    }
                    return Boolean.valueOf(zDelete);
                } catch (Exception e) {
                    return Boolean.FALSE;
                }
            default:
                C4927 c4927 = this.f18679.f18623;
                C0559 c05592 = c4927.f18641;
                String str2 = (String) c05592.f2912;
                ﹳﹳ r3 = (ﹳﹳ) c05592.f2913;
                r3.getClass();
                boolean z = true;
                if (new File((File) r3.ˎˑ, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    }
                    String str3 = (String) c05592.f2912;
                    r3.getClass();
                    new File((File) r3.ˎˑ, str3).delete();
                } else {
                    NavigableSet navigableSetM5947 = ((C2096) c4927.f18637.f16745).m5947();
                    String str4 = navigableSetM5947.isEmpty() ? null : (String) navigableSetM5947.first();
                    if (str4 == null || !c4927.f18635.m5430(str4)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
