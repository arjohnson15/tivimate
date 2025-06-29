package p251;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.leanback.widget.RunnableC0183;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p150.ExecutorC2314;

/* renamed from: יˎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3131 implements InterfaceC3128, InterfaceC3137, InterfaceC3127 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f12087;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Executor f12088;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f12089;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12090;

    public /* synthetic */ C3131(Executor executor, Object obj, C3130 c3130, int i) {
        this.f12090 = i;
        this.f12088 = executor;
        this.f12089 = obj;
        this.f12087 = c3130;
    }

    public C3131(Executor executor, InterfaceC3133 interfaceC3133) {
        this.f12090 = 3;
        this.f12089 = new Object();
        this.f12088 = executor;
        this.f12087 = interfaceC3133;
    }

    public C3131(ExecutorC2314 executorC2314, InterfaceC3127 interfaceC3127) {
        this.f12090 = 2;
        this.f12089 = new Object();
        this.f12088 = executorC2314;
        this.f12087 = interfaceC3127;
    }

    public C3131(ExecutorC2314 executorC2314, InterfaceC3128 interfaceC3128) {
        this.f12090 = 5;
        this.f12089 = new Object();
        this.f12088 = executorC2314;
        this.f12087 = interfaceC3128;
    }

    public C3131(ExecutorC2314 executorC2314, InterfaceC3137 interfaceC3137) {
        this.f12090 = 4;
        this.f12089 = new Object();
        this.f12088 = executorC2314;
        this.f12087 = interfaceC3137;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m7695(C3130 c3130) {
        synchronized (this.f12089) {
            try {
                if (((InterfaceC3133) this.f12087) == null) {
                    return;
                }
                this.f12088.execute(new RunnableC3129(this, 1, c3130));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m7696(C3130 c3130) throws Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException {
        if (c3130.m7685() || c3130.f12086) {
            return;
        }
        synchronized (this.f12089) {
            try {
                if (((InterfaceC3137) this.f12087) == null) {
                    return;
                }
                ExecutorC2314 executorC2314 = (ExecutorC2314) this.f12088;
                RunnableC3129 runnableC3129 = new RunnableC3129(this, 2, c3130);
                executorC2314.getClass();
                runnableC3129.run();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final void m7697(C3130 c3130) throws Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException {
        if (c3130.m7685()) {
            synchronized (this.f12089) {
                try {
                    if (((InterfaceC3128) this.f12087) == null) {
                        return;
                    }
                    ExecutorC2314 executorC2314 = (ExecutorC2314) this.f12088;
                    RunnableC3129 runnableC3129 = new RunnableC3129(this, 3, c3130);
                    executorC2314.getClass();
                    runnableC3129.run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p251.InterfaceC3137
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public void mo7698(Exception exc) {
        switch (this.f12090) {
            case 1:
                ((C3130) this.f12087).m7692(exc);
                break;
            default:
                ((C3130) this.f12087).m7692(exc);
                break;
        }
    }

    @Override // p251.InterfaceC3128
    /* renamed from: ˏᴵ */
    public void mo7675(Object obj) {
        switch (this.f12090) {
            case 1:
                ((C3130) this.f12087).m7688(obj);
                break;
            default:
                ((C3130) this.f12087).m7688(obj);
                break;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7699(C3130 c3130) throws Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException {
        switch (this.f12090) {
            case 0:
                this.f12088.execute(new RunnableC3129(this, 0, c3130));
                return;
            case 1:
                ((ExecutorService) this.f12088).execute(new RunnableC0183(this, c3130));
                return;
            case 2:
                if (c3130.f12086) {
                    synchronized (this.f12089) {
                        try {
                            if (((InterfaceC3127) this.f12087) != null) {
                                ExecutorC2314 executorC2314 = (ExecutorC2314) this.f12088;
                                RunnableC0183 runnableC0183 = new RunnableC0183(19, this);
                                executorC2314.getClass();
                                runnableC0183.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 3:
                m7695(c3130);
                return;
            case 4:
                m7696(c3130);
                return;
            case 5:
                m7697(c3130);
                return;
            default:
                this.f12088.execute(new RunnableC3129(this, 4, c3130));
                return;
        }
    }

    @Override // p251.InterfaceC3127
    /* renamed from: ᴵʿ */
    public void mo7674() {
        switch (this.f12090) {
            case 1:
                ((C3130) this.f12087).m7694();
                break;
            default:
                ((C3130) this.f12087).m7694();
                break;
        }
    }
}
