package p192;

import android.os.Build;
import androidx.leanback.widget.RunnableC0134;
import java.util.ArrayList;
import p260.C3222;
import p278.AbstractC3362;
import ˏʼ.ʽᐧ;
import ﹶˋ.ـﹶ;

/* renamed from: ˎˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2654 extends ʽᐧ {

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final /* synthetic */ C2668 f10529;

    public C2654(C2668 c2668) {
        this.f10529 = c2668;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m6831(ـﹶ r7) {
        C2668 c2668 = this.f10529;
        c2668.f10562 = r7;
        ـﹶ r1 = (ـﹶ) c2668.f10562;
        C2676 c2676 = (C2676) c2668.f10563;
        c2668.f10564 = new C3222(r1, c2676.f10582, c2676.f10584, Build.VERSION.SDK_INT >= 34 ? AbstractC2659.m6836() : AbstractC3362.m8190());
        C2676 c26762 = (C2676) c2668.f10563;
        c26762.getClass();
        ArrayList arrayList = new ArrayList();
        c26762.f10580.writeLock().lock();
        try {
            c26762.f10579 = 1;
            arrayList.addAll(c26762.f10576);
            c26762.f10576.clear();
            c26762.f10580.writeLock().unlock();
            c26762.f10583.post(new RunnableC0134(arrayList, c26762.f10579, (Throwable) null));
        } catch (Throwable th) {
            c26762.f10580.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m6832(Throwable th) {
        ((C2676) this.f10529.f10563).m6858(th);
    }
}
