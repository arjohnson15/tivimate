package p383;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: ᵢᵢ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4469 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ArrayList f17190 = new ArrayList(50);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Handler f17191;

    public C4469(Handler handler) {
        this.f17191 = handler;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4463 m10156() {
        C4463 c4463;
        ArrayList arrayList = f17190;
        synchronized (arrayList) {
            try {
                c4463 = arrayList.isEmpty() ? new C4463() : (C4463) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4463;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m10157(int i) {
        return this.f17191.sendEmptyMessage(i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m10158(Runnable runnable) {
        return this.f17191.post(runnable);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4463 m10159(int i, Object obj) {
        C4463 c4463M10156 = m10156();
        c4463M10156.f17178 = this.f17191.obtainMessage(i, obj);
        return c4463M10156;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10160(int i) {
        AbstractC4464.m10142(i != 0);
        this.f17191.removeMessages(i);
    }
}
