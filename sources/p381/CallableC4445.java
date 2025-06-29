package p381;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p331.C3759;
import p414.C4736;
import ʻˉ.ᐧˋ;
import ᵢ.ʿʼ;

/* renamed from: ᵢᵎ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC4445 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f17129;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f17130;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f17131;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f17132;

    public /* synthetic */ CallableC4445(Object obj, Object obj2, Object obj3, int i) {
        this.f17131 = i;
        this.f17129 = obj;
        this.f17130 = obj2;
        this.f17132 = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17131) {
            case 0:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446 = (ScheduledExecutorServiceC4446) this.f17129;
                scheduledExecutorServiceC4446.getClass();
                return scheduledExecutorServiceC4446.f17134.submit(new ᐧˋ((Callable) this.f17130, 26, (ʿʼ) this.f17132));
            default:
                WorkDatabase workDatabase = ((C4736) this.f17129).f18163;
                C3759 c3759Mo1376 = workDatabase.mo1376();
                String str = (String) this.f17132;
                ((ArrayList) this.f17130).addAll(c3759Mo1376.m8756(str));
                return workDatabase.mo1374().m8822(str);
        }
    }
}
