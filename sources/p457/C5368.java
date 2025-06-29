package p457;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Collections;

/* renamed from: ﾞﹶ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5368 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C5368 f20835 = new C5368();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C5368 f20833 = new C5368();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5362 f20834 = new C5362(1);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C5362 f20836 = new C5362(0);

    public C5368() {
        Collections.emptyList();
        Collections.emptyList();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC5366 m12162(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                AbstractC5366 abstractC5366 = (AbstractC5366) Class.forName(str).asSubclass(AbstractC5366.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                if (!abstractC5366.f20829) {
                    return abstractC5366;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                C5391.m12163().m12170(AbstractC5376.f20846, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            C5391.m12163().m12170(AbstractC5376.f20846, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }
}
