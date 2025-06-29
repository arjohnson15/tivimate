package androidx.lifecycle;

import android.os.Looper;
import androidx.leanback.widget.RunnableC0183;
import java.util.Map;
import p236.C3092;
import p343.C3913;
import p343.C3915;
import p343.C3916;
import p457.C5362;
import p457.C5368;

/* renamed from: androidx.lifecycle.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0244 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final Object f1285 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3915 f1286;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public volatile Object f1287;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final RunnableC0183 f1288;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f1289;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f1290;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f1291;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public volatile Object f1292;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f1293;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f1294;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f1295;

    public AbstractC0244() {
        this.f1291 = new Object();
        this.f1286 = new C3915();
        this.f1290 = 0;
        Object obj = f1285;
        this.f1292 = obj;
        this.f1288 = new RunnableC0183(2, this);
        this.f1287 = obj;
        this.f1293 = -1;
    }

    public AbstractC0244(int i) {
        C5362 c5362 = C5368.f20836;
        this.f1291 = new Object();
        this.f1286 = new C3915();
        this.f1290 = 0;
        this.f1292 = f1285;
        this.f1288 = new RunnableC0183(2, this);
        this.f1287 = c5362;
        this.f1293 = 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m1040(String str) {
        C3092.m7596().f11933.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(ˆʽ.ᵎˏ.ˑי("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m1041(AbstractC0226 abstractC0226) {
        if (abstractC0226.f1244) {
            if (!abstractC0226.mo1009()) {
                abstractC0226.m1028(false);
                return;
            }
            int i = abstractC0226.f1245;
            int i2 = this.f1293;
            if (i >= i2) {
                return;
            }
            abstractC0226.f1245 = i2;
            abstractC0226.f1247.mo1011(this.f1287);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m1042(InterfaceC0262 interfaceC0262, InterfaceC0221 interfaceC0221) {
        Object obj;
        m1040("observe");
        if (((C0236) interfaceC0262.getLifecycle()).f1275 == EnumC0230.f1254) {
            return;
        }
        C0214 c0214 = new C0214(this, interfaceC0262, interfaceC0221);
        C3915 c3915 = this.f1286;
        C3913 c3913Mo9103 = c3915.mo9103(interfaceC0221);
        if (c3913Mo9103 != null) {
            obj = c3913Mo9103.f15215;
        } else {
            C3913 c3913 = new C3913(interfaceC0221, c0214);
            c3915.f15222++;
            C3913 c39132 = c3915.f15220;
            if (c39132 == null) {
                c3915.f15223 = c3913;
                c3915.f15220 = c3913;
            } else {
                c39132.f15216 = c3913;
                c3913.f15217 = c39132;
                c3915.f15220 = c3913;
            }
            obj = null;
        }
        AbstractC0226 abstractC0226 = (AbstractC0226) obj;
        if (abstractC0226 != null && !abstractC0226.mo1008(interfaceC0262)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0226 != null) {
            return;
        }
        interfaceC0262.getLifecycle().mo1032(c0214);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m1043(InterfaceC0221 interfaceC0221) {
        m1040("removeObserver");
        AbstractC0226 abstractC0226 = (AbstractC0226) this.f1286.mo9102(interfaceC0221);
        if (abstractC0226 == null) {
            return;
        }
        abstractC0226.mo1010();
        abstractC0226.m1028(false);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m1044(Object obj) {
        m1040("setValue");
        this.f1293++;
        this.f1287 = obj;
        m1046(null);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void mo1045() {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m1046(AbstractC0226 abstractC0226) {
        if (this.f1289) {
            this.f1295 = true;
            return;
        }
        this.f1289 = true;
        do {
            this.f1295 = false;
            if (abstractC0226 != null) {
                m1041(abstractC0226);
                abstractC0226 = null;
            } else {
                C3915 c3915 = this.f1286;
                c3915.getClass();
                C3916 c3916 = new C3916(c3915);
                c3915.f15221.put(c3916, Boolean.FALSE);
                while (c3916.hasNext()) {
                    m1041((AbstractC0226) ((Map.Entry) c3916.next()).getValue());
                    if (this.f1295) {
                        break;
                    }
                }
            }
        } while (this.f1295);
        this.f1289 = false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m1047(InterfaceC0221 interfaceC0221) {
        Object obj;
        m1040("observeForever");
        C0245 c0245 = new C0245(this, interfaceC0221);
        C3915 c3915 = this.f1286;
        C3913 c3913Mo9103 = c3915.mo9103(interfaceC0221);
        if (c3913Mo9103 != null) {
            obj = c3913Mo9103.f15215;
        } else {
            C3913 c3913 = new C3913(interfaceC0221, c0245);
            c3915.f15222++;
            C3913 c39132 = c3915.f15220;
            if (c39132 == null) {
                c3915.f15223 = c3913;
                c3915.f15220 = c3913;
            } else {
                c39132.f15216 = c3913;
                c3913.f15217 = c39132;
                c3915.f15220 = c3913;
            }
            obj = null;
        }
        AbstractC0226 abstractC0226 = (AbstractC0226) obj;
        if (abstractC0226 instanceof C0214) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0226 != null) {
            return;
        }
        c0245.m1028(true);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void mo1048() {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object m1049() {
        Object obj = this.f1287;
        if (obj != f1285) {
            return obj;
        }
        return null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m1050(Object obj) {
        boolean z;
        synchronized (this.f1291) {
            z = this.f1292 == f1285;
            this.f1292 = obj;
        }
        if (z) {
            C3092.m7596().m7597(this.f1288);
        }
    }
}
