package p197;

import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: ˎˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2726 implements Cloneable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ArrayList f10677 = null;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ArrayList f10675 = null;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public ArrayList f10676 = null;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m6927(InterfaceC2725 interfaceC2725) {
        C2723 c2723M6926 = C2723.m6926();
        ArrayList arrayList = c2723M6926.f10672;
        int size = arrayList.size();
        ChoreographerFrameCallbackC2712 choreographerFrameCallbackC2712 = c2723M6926.f10674;
        if (size == 0) {
            choreographerFrameCallbackC2712.getClass();
            Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC2712);
        }
        if (!arrayList.contains(interfaceC2725)) {
            arrayList.add(interfaceC2725);
        }
        choreographerFrameCallbackC2712.getClass();
    }

    public abstract void cancel();

    /* renamed from: ʿˏ */
    public abstract void mo6887(boolean z);

    /* renamed from: ˉי */
    public abstract void mo6890();

    /* renamed from: ˉⁱ */
    public abstract long mo6891();

    /* renamed from: ˋⁱ */
    public abstract boolean mo6894();

    /* renamed from: ˎٴ */
    public abstract void mo6896(C2729 c2729);

    /* renamed from: ˏᴵ */
    public abstract boolean mo6897(long j);

    /* renamed from: ˑי */
    public abstract void mo6899();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m6928(InterfaceC2732 interfaceC2732) {
        if (this.f10677 == null) {
            this.f10677 = new ArrayList();
        }
        this.f10677.add(interfaceC2732);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m6929(InterfaceC2713 interfaceC2713) {
        if (this.f10676 == null) {
            this.f10676 = new ArrayList();
        }
        this.f10676.add(interfaceC2713);
    }

    /* renamed from: ᴵʿ */
    public abstract boolean mo6905();

    /* renamed from: ᵎˏ */
    public abstract void mo6906(boolean z);

    /* renamed from: ᵎـ */
    public abstract AbstractC2726 mo6907(long j);

    /* renamed from: ﹳˎ */
    public abstract void mo6909();

    /* renamed from: ﹶˆ */
    public AbstractC2726 mo6910() {
        try {
            AbstractC2726 abstractC2726 = (AbstractC2726) super.clone();
            if (this.f10677 != null) {
                abstractC2726.f10677 = new ArrayList(this.f10677);
            }
            if (this.f10675 != null) {
                abstractC2726.f10675 = new ArrayList(this.f10675);
            }
            return abstractC2726;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
