package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.יᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0448 extends ContentObserver {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f2752;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f2753;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0448(int i, Object obj) {
        super(null);
        this.f2753 = i;
        this.f2752 = obj;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.f2753) {
            case 0:
                ((AtomicBoolean) ((C0372) this.f2752).f2629).set(true);
                return;
            default:
                C0460 c0460 = (C0460) this.f2752;
                synchronized (c0460.f2776) {
                    c0460.f2780 = null;
                    c0460.f2777.run();
                }
                synchronized (c0460) {
                    try {
                        Iterator it = c0460.f2781.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
