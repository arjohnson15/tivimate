package p061;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: ʾـ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1373 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1428 f5598 = new C1428();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f5596 = false;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5597 = 1;

    /* renamed from: ʽᐧ */
    public long mo2854(int i) {
        return -1L;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4757(int i, int i2, Object obj) {
        this.f5598.m4956(i, i2, obj);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void mo4758(AbstractC1375 abstractC1375) {
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m4759(AbstractC1375 abstractC1375) {
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m4760(boolean z) {
        if (this.f5598.m4953()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f5596 = z;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m4761(AbstractC1375 abstractC1375) {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m4762(AbstractC1375 abstractC1375, int i, List list) {
        mo975(abstractC1375, i);
    }

    /* renamed from: ˑʽ */
    public int mo972(int i) {
        return 0;
    }

    /* renamed from: ـﹶ */
    public abstract int mo974();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4763(int i, int i2) {
        this.f5598.m4951(i, i2);
    }

    /* renamed from: ᐧʻ */
    public abstract void mo975(AbstractC1375 abstractC1375, int i);

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m4764() {
        this.f5597 = 3;
        this.f5598.m4955();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4765() {
        this.f5598.m4950();
    }

    /* renamed from: ﹶˆ */
    public abstract AbstractC1375 mo977(ViewGroup viewGroup, int i);
}
