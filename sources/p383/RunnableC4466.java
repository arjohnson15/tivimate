package p383;

import android.util.Pair;
import com.google.android.gms.internal.measurement.C0559;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p033.C1220;
import p361.C4092;
import p374.C4257;
import p374.C4290;
import p385.C4480;
import p404.InterfaceC4634;

/* renamed from: ᵢᵢ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4466 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f17183;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17184;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f17185;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17186;

    public /* synthetic */ RunnableC4466(Object obj, int i, Object obj2, int i2) {
        this.f17186 = i2;
        this.f17184 = obj;
        this.f17183 = i;
        this.f17185 = obj2;
    }

    public /* synthetic */ RunnableC4466(Object obj, Object obj2, int i, int i2) {
        this.f17186 = i2;
        this.f17184 = obj;
        this.f17185 = obj2;
        this.f17183 = i;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, ᵢﹶ.ˏʾ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17186) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f17184).iterator();
                while (it.hasNext()) {
                    C4455 c4455 = (C4455) it.next();
                    if (!c4455.f17159) {
                        int i = this.f17183;
                        if (i != -1) {
                            c4455.f17156.m6528(i);
                        }
                        c4455.f17157 = true;
                        ((InterfaceC4461) this.f17185).mo4092(c4455.f17158);
                    }
                }
                break;
            case 1:
                C4480 c4480 = (C4480) this.f17184;
                int i2 = c4480.f17252;
                ?? r2 = this.f17185;
                r2.getClass();
                r2.mo2499(i2, c4480.f17250, this.f17183);
                break;
            case 2:
                ((InterfaceC4634) ((C4257) this.f17184).f16541).m10540(this.f17183, (Serializable) this.f17185);
                break;
            default:
                C1220 c1220 = (C1220) ((C4092) ((C0559) this.f17184).f2913).f15797;
                Pair pair = (Pair) this.f17185;
                c1220.mo2499(((Integer) pair.first).intValue(), (C4290) pair.second, this.f17183);
                break;
        }
    }
}
