package p181;

import java.util.concurrent.Callable;
import p393.C4523;
import p456.BinderC5240;
import p456.C5343;

/* renamed from: ˋᵔ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2516 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public /* synthetic */ Object f10001;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10002;

    public /* synthetic */ CallableC2516() {
        this.f10002 = 2;
    }

    public /* synthetic */ CallableC2516(int i, Object obj) {
        this.f10002 = i;
        this.f10001 = obj;
    }

    public CallableC2516(BinderC5240 binderC5240, C5343 c5343, String str) {
        this.f10002 = 3;
        this.f10001 = binderC5240;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final Object m6639() {
        synchronized (((C4523) this.f10001)) {
            try {
                C4523 c4523 = (C4523) this.f10001;
                if (c4523.f17397 == null) {
                    return null;
                }
                c4523.m10297();
                if (((C4523) this.f10001).m10293()) {
                    ((C4523) this.f10001).m10292();
                    ((C4523) this.f10001).f17403 = 0;
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p181.CallableC2516.call():java.lang.Object");
    }
}
