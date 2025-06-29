package p417;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.leanback.widget.RunnableC0183;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p049.C1310;
import p293.C3469;
import p305.C3524;
import p305.C3536;
import p305.C3542;
import ˏᵢ.ᵢٴ;
import ᵢ.ʿʼ;

/* renamed from: ﹳᴵ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4747 {

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final C3542[] f18201 = new C3542[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C1310 f18202;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3536 f18203;

    /* renamed from: ˉי, reason: contains not printable characters */
    public InterfaceC4774 f18205;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ServiceConnectionC4762 f18208;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final String f18209;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public IInterface f18210;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final InterfaceC4746 f18211;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Context f18213;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final InterfaceC4760 f18214;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final HandlerC4777 f18216;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public volatile String f18219;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int f18220;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4750 f18222;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C4756 f18223;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public volatile String f18215 = null;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f18217 = new Object();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Object f18212 = new Object();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList f18206 = new ArrayList();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f18218 = 1;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public C3524 f18221 = null;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f18204 = false;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public volatile C4767 f18207 = null;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final AtomicInteger f18224 = new AtomicInteger(0);

    public AbstractC4747(Context context, Looper looper, C4750 c4750, C3536 c3536, int i, InterfaceC4746 interfaceC4746, InterfaceC4760 interfaceC4760, String str) {
        AbstractC4753.m10689(context, "Context must not be null");
        this.f18213 = context;
        AbstractC4753.m10689(looper, "Looper must not be null");
        AbstractC4753.m10689(c4750, "Supervisor must not be null");
        this.f18222 = c4750;
        AbstractC4753.m10689(c3536, "API availability must not be null");
        this.f18203 = c3536;
        this.f18216 = new HandlerC4777(this, looper);
        this.f18220 = i;
        this.f18211 = interfaceC4746;
        this.f18214 = interfaceC4760;
        this.f18209 = str;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ void m10656(AbstractC4747 abstractC4747) {
        int i;
        int i2;
        synchronized (abstractC4747.f18217) {
            i = abstractC4747.f18218;
        }
        if (i == 3) {
            abstractC4747.f18204 = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        HandlerC4777 handlerC4777 = abstractC4747.f18216;
        handlerC4777.sendMessage(handlerC4777.obtainMessage(i2, abstractC4747.f18224.get(), 16));
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m10657(AbstractC4747 abstractC4747, int i, int i2, IInterface iInterface) {
        synchronized (abstractC4747.f18217) {
            try {
                if (abstractC4747.f18218 != i) {
                    return false;
                }
                abstractC4747.m10661(i2, iInterface);
                return true;
            } finally {
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10658(InterfaceC4759 interfaceC4759, Set set) {
        Bundle bundleMo8570 = mo8570();
        String str = this.f18219;
        int i = C3536.f13676;
        Scope[] scopeArr = C4765.f18271;
        Bundle bundle = new Bundle();
        int i2 = this.f18220;
        C3542[] c3542Arr = C4765.f18270;
        C4765 c4765 = new C4765(6, i2, i, null, null, scopeArr, bundle, null, c3542Arr, c3542Arr, true, 0, false, str);
        c4765.f18280 = this.f18213.getPackageName();
        c4765.f18284 = bundleMo8570;
        if (set != null) {
            c4765.f18283 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m10664()) {
            Account accountMo8571 = mo8571();
            if (accountMo8571 == null) {
                accountMo8571 = new Account("<<default account>>", "com.google");
            }
            c4765.f18275 = accountMo8571;
            if (interfaceC4759 != null) {
                c4765.f18274 = interfaceC4759.asBinder();
            }
        }
        c4765.f18279 = f18201;
        c4765.f18282 = mo8566();
        try {
            synchronized (this.f18212) {
                try {
                    C4756 c4756 = this.f18223;
                    if (c4756 != null) {
                        c4756.m10691(new BinderC4776(this, this.f18224.get()), c4765);
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            int i3 = this.f18224.get();
            HandlerC4777 handlerC4777 = this.f18216;
            handlerC4777.sendMessage(handlerC4777.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            int i4 = this.f18224.get();
            C4773 c4773 = new C4773(this, 8, null, null);
            HandlerC4777 handlerC47772 = this.f18216;
            handlerC47772.sendMessage(handlerC47772.obtainMessage(1, i4, -1, c4773));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            int i42 = this.f18224.get();
            C4773 c47732 = new C4773(this, 8, null, null);
            HandlerC4777 handlerC477722 = this.f18216;
            handlerC477722.sendMessage(handlerC477722.obtainMessage(1, i42, -1, c47732));
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10659(ᵢٴ r4) {
        ((C3469) r4.ˆʿ).f13426.f13406.post(new RunnableC0183(26, r4));
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final IInterface m10660() {
        IInterface iInterface;
        synchronized (this.f18217) {
            try {
                if (this.f18218 == 5) {
                    throw new DeadObjectException();
                }
                if (!m10668()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f18210;
                AbstractC4753.m10689(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m10661(int i, IInterface iInterface) {
        C1310 c1310;
        AbstractC4753.m10685((i == 4) == (iInterface != null));
        synchronized (this.f18217) {
            try {
                this.f18218 = i;
                this.f18210 = iInterface;
                if (i == 1) {
                    ServiceConnectionC4762 serviceConnectionC4762 = this.f18208;
                    if (serviceConnectionC4762 != null) {
                        C4750 c4750 = this.f18222;
                        String str = this.f18202.f5353;
                        AbstractC4753.m10683(str);
                        this.f18202.getClass();
                        if (this.f18209 == null) {
                            this.f18213.getClass();
                        }
                        c4750.m10675(str, serviceConnectionC4762, this.f18202.f5352);
                        this.f18208 = null;
                    }
                } else if (i == 2 || i == 3) {
                    ServiceConnectionC4762 serviceConnectionC47622 = this.f18208;
                    if (serviceConnectionC47622 != null && (c1310 = this.f18202) != null) {
                        String str2 = "Calling connect() while still connected, missing disconnect() for " + c1310.f5353 + " on com.google.android.gms";
                        C4750 c47502 = this.f18222;
                        String str3 = this.f18202.f5353;
                        AbstractC4753.m10683(str3);
                        this.f18202.getClass();
                        if (this.f18209 == null) {
                            this.f18213.getClass();
                        }
                        c47502.m10675(str3, serviceConnectionC47622, this.f18202.f5352);
                        this.f18224.incrementAndGet();
                    }
                    ServiceConnectionC4762 serviceConnectionC47623 = new ServiceConnectionC4762(this, this.f18224.get());
                    this.f18208 = serviceConnectionC47623;
                    String strMo8574 = mo8574();
                    boolean zMo8573 = mo8573();
                    this.f18202 = new C1310(strMo8574, zMo8573, 3);
                    if (zMo8573 && mo8569() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f18202.f5353)));
                    }
                    C4750 c47503 = this.f18222;
                    String str4 = this.f18202.f5353;
                    AbstractC4753.m10683(str4);
                    this.f18202.getClass();
                    String name = this.f18209;
                    if (name == null) {
                        name = this.f18213.getClass().getName();
                    }
                    if (!c47503.m10676(new C4755(str4, this.f18202.f5352), serviceConnectionC47623, name, null)) {
                        String str5 = "unable to connect to service: " + this.f18202.f5353 + " on com.google.android.gms";
                        int i2 = this.f18224.get();
                        C4751 c4751 = new C4751(this, 16);
                        HandlerC4777 handlerC4777 = this.f18216;
                        handlerC4777.sendMessage(handlerC4777.obtainMessage(7, i2, -1, c4751));
                    }
                } else if (i == 4) {
                    AbstractC4753.m10683(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m10662(InterfaceC4774 interfaceC4774) {
        this.f18205 = interfaceC4774;
        m10661(2, null);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m10663() {
        this.f18224.incrementAndGet();
        synchronized (this.f18206) {
            try {
                int size = this.f18206.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC4761) this.f18206.get(i)).m10694();
                }
                this.f18206.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f18212) {
            this.f18223 = null;
        }
        m10661(1, null);
    }

    /* renamed from: ˋˊ */
    public abstract String mo8565();

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean m10664() {
        return false;
    }

    /* renamed from: ˎٴ */
    public C3542[] mo8566() {
        return f18201;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final String m10665() {
        return this.f18215;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m10666() {
        int iM8426 = this.f18203.m8426(this.f18213, mo8569());
        if (iM8426 == 0) {
            m10662(new ʿʼ(15, this));
            return;
        }
        m10661(1, null);
        this.f18205 = new ʿʼ(15, this);
        int i = this.f18224.get();
        HandlerC4777 handlerC4777 = this.f18216;
        handlerC4777.sendMessage(handlerC4777.obtainMessage(3, i, iM8426, null));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3542[] m10667() {
        C4767 c4767 = this.f18207;
        if (c4767 == null) {
            return null;
        }
        return c4767.f18293;
    }

    /* renamed from: ˑי */
    public abstract IInterface mo8568(IBinder iBinder);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m10668() {
        boolean z;
        synchronized (this.f18217) {
            z = this.f18218 == 4;
        }
        return z;
    }

    /* renamed from: ٴˎ */
    public abstract int mo8569();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m10669() {
        boolean z;
        synchronized (this.f18217) {
            int i = this.f18218;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: ᵎˏ */
    public Bundle mo8570() {
        return new Bundle();
    }

    /* renamed from: ᵎـ */
    public Account mo8571() {
        return null;
    }

    /* renamed from: ﹳˎ */
    public Set mo8572() {
        return Collections.emptySet();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10670(String str) {
        this.f18215 = str;
        m10663();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m10671() {
        if (!m10668() || this.f18202 == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* renamed from: ﾞʽ */
    public boolean mo8573() {
        return mo8569() >= 211700000;
    }

    /* renamed from: ﾞˊ */
    public abstract String mo8574();
}
