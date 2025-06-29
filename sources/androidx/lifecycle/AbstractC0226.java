package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0226 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f1244;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f1245 = -1;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0244 f1246;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0221 f1247;

    public AbstractC0226(AbstractC0244 abstractC0244, InterfaceC0221 interfaceC0221) {
        this.f1246 = abstractC0244;
        this.f1247 = interfaceC0221;
    }

    /* renamed from: ʿʼ */
    public boolean mo1008(InterfaceC0262 interfaceC0262) {
        return false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m1028(boolean z) {
        if (z == this.f1244) {
            return;
        }
        this.f1244 = z;
        int i = z ? 1 : -1;
        AbstractC0244 abstractC0244 = this.f1246;
        int i2 = abstractC0244.f1290;
        abstractC0244.f1290 = i + i2;
        if (!abstractC0244.f1294) {
            abstractC0244.f1294 = true;
            while (true) {
                try {
                    int i3 = abstractC0244.f1290;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        abstractC0244.mo1048();
                    } else if (z3) {
                        abstractC0244.mo1045();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    abstractC0244.f1294 = false;
                    throw th;
                }
            }
            abstractC0244.f1294 = false;
        }
        if (this.f1244) {
            abstractC0244.m1046(this);
        }
    }

    /* renamed from: ٴˎ */
    public abstract boolean mo1009();

    /* renamed from: ﹳﹳ */
    public void mo1010() {
    }
}
