package p369;

import androidx.work.impl.WorkDatabase;
import com.bumptech.glide.C0295;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p222.C2907;
import p331.C3775;
import p396.C4554;

/* renamed from: ᵢʽ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC4193 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f16161;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f16162;

    public /* synthetic */ CallableC4193(int i, Object obj) {
        this.f16162 = i;
        this.f16161 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Map mapM9623;
        switch (this.f16162) {
            case 0:
                C0295 c0295 = (C0295) this.f16161;
                ((AtomicReference) c0295.f2403).set(null);
                synchronized (c0295) {
                    try {
                        if (((AtomicMarkableReference) c0295.f2402).isMarked()) {
                            mapM9623 = ((C4194) ((AtomicMarkableReference) c0295.f2402).getReference()).m9623();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0295.f2402;
                            atomicMarkableReference.set((C4194) atomicMarkableReference.getReference(), false);
                        } else {
                            mapM9623 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (mapM9623 != null) {
                    C2907 c2907 = (C2907) c0295.f2405;
                    ((C4192) c2907.f11258).m9618((String) c2907.f11257, mapM9623, c0295.f2404);
                }
                return null;
            default:
                WorkDatabase workDatabase = (WorkDatabase) ((C4554) this.f16161).f17462;
                Long lM8743 = workDatabase.mo1378().m8743("next_alarm_manager_id");
                int iLongValue = lM8743 != null ? (int) lM8743.longValue() : 0;
                workDatabase.mo1378().m8725(new C3775("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
        }
    }
}
