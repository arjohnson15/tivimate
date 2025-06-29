package p065;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import com.bumptech.glide.C0295;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p013.AbstractC1035;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p013.C1034;
import p013.C1038;
import p013.C1053;
import p034.InterfaceC1224;
import p034.InterfaceC1226;
import p034.InterfaceC1229;
import p061.AbstractC1420;
import p070.AbstractC1563;
import p070.C1545;
import p070.InterfaceC1564;
import p072.AbstractC1642;
import p072.InterfaceC1594;
import p140.InterfaceC2162;
import p148.C2267;
import p176.InterfaceC2487;
import p185.AbstractC2562;
import p262.InterfaceC3254;
import p262.InterfaceC3255;
import p266.C3262;
import p280.C3374;
import p280.C3375;
import p288.C3405;
import p330.InterfaceC3747;
import p338.InterfaceC3864;
import ﹶⁱ.ـﹶ;

/* renamed from: ʾᵔ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1484 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3747 f6048;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1514 f6049;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final LinkedHashMap f6050;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f6051;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Executor f6052;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2267 f6053;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1500 f6054;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3262 f6055;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ExecutorC1522 f6056;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ThreadLocal f6057;

    public AbstractC1484() {
        ᐧˋ r9 = new ᐧˋ(0, this, AbstractC1484.class, "onClosed", "onClosed()V", 0, 0);
        C3262 c3262 = new C3262();
        c3262.f12726 = r9;
        C3374 c3374 = new C3374();
        c3374.f13199 = 0;
        c3262.f12724 = c3374;
        C3375 c3375 = new C3375();
        c3375.f13201 = 0;
        c3262.f12725 = c3375;
        this.f6055 = c3262;
        this.f6057 = new ThreadLocal();
        this.f6050 = new LinkedHashMap();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5041() {
        if (!m5044().mo4418().mo4382() && this.f6057.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: ʿʼ */
    public List mo1436(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1035.m3985(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((InterfaceC1564) ((InterfaceC2487) entry.getKey())).mo5134(), entry.getValue());
        }
        return mo1383();
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final Object m5042(Callable callable) {
        m5048();
        try {
            Object objCall = callable.call();
            m5055();
            return objCall;
        } finally {
            m5046();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final InterfaceC1594 m5043() {
        C2267 c2267 = this.f6053;
        if (c2267 == null) {
            return null;
        }
        return c2267;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final InterfaceC1229 m5044() {
        C1514 c1514 = this.f6049;
        if (c1514 == null) {
            c1514 = null;
        }
        InterfaceC1229 interfaceC1229M5093 = c1514.m5093();
        if (interfaceC1229M5093 != null) {
            return interfaceC1229M5093;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m5045(Runnable runnable) {
        m5048();
        try {
            runnable.run();
            m5055();
        } finally {
            m5046();
        }
    }

    /* renamed from: ˋⁱ */
    public Set mo1437() {
        Set setMo1382 = mo1382();
        ArrayList arrayList = new ArrayList(AbstractC1039.m4012(setMo1382, 10));
        Iterator it = setMo1382.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1563.m5154((Class) it.next()));
        }
        return AbstractC1041.m4029(arrayList);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m5046() {
        m5044().mo4418().mo4385();
        if (m5044().mo4418().mo4382()) {
            return;
        }
        C1500 c1500M5047 = m5047();
        ((C1512) c1500M5047.f6096).m5090((C1501) c1500M5047.f6100, (C1501) c1500M5047.f6094);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C1500 m5047() {
        C1500 c1500 = this.f6054;
        if (c1500 == null) {
            return null;
        }
        return c1500;
    }

    /* renamed from: ˏᴵ */
    public LinkedHashMap mo1438() {
        Set<Map.Entry> setEntrySet = mo1380().entrySet();
        int iM3985 = AbstractC1035.m3985(AbstractC1039.m4012(setEntrySet, 10));
        if (iM3985 < 16) {
            iM3985 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM3985);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            C1545 c1545M5154 = AbstractC1563.m5154(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1039.m4012(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1563.m5154((Class) it.next()));
            }
            linkedHashMap.put(c1545M5154, arrayList);
        }
        return linkedHashMap;
    }

    /* renamed from: ˏᵢ */
    public InterfaceC1229 mo1379(C1509 c1509) {
        throw new C3405();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5048() {
        m5049();
        m5049();
        InterfaceC1224 interfaceC1224Mo4418 = m5044().mo4418();
        if (!interfaceC1224Mo4418.mo4382()) {
            C1500 c1500M5047 = m5047();
            c1500M5047.getClass();
            AbstractC1642.m5302(new C1516(c1500M5047, null));
        }
        if (interfaceC1224Mo4418.mo4394()) {
            interfaceC1224Mo4418.mo4384();
        } else {
            interfaceC1224Mo4418.mo4386();
        }
    }

    /* renamed from: ˑי */
    public Map mo1380() {
        return C1034.f4436;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5049() {
        if (this.f6051) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: ٴˎ */
    public abstract C1500 mo1381();

    /* renamed from: ᐧʻ */
    public AbstractC1420 mo1439() {
        throw new C3405();
    }

    /* renamed from: ᴵʿ */
    public Set mo1382() {
        return C1038.f4437;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m5050(InterfaceC3255 interfaceC3255) {
        C1500 c1500M5047 = m5047();
        C1512 c1512 = (C1512) c1500M5047.f6096;
        c1512.getClass();
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108("PRAGMA query_only");
        try {
            interfaceC3254Mo6108.mo6098();
            if (!interfaceC3254Mo6108.mo6106()) {
                ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA temp_store = MEMORY");
                ـﹶ.ﹳˎ(interfaceC3255, "PRAGMA recursive_triggers = 1");
                ـﹶ.ﹳˎ(interfaceC3255, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                C0295 c0295 = c1512.f6156;
                ReentrantLock reentrantLock = (ReentrantLock) c0295.f2402;
                reentrantLock.lock();
                try {
                    c0295.f2404 = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (c1500M5047.f6101) {
                if (((C1526) c1500M5047.f6095) == null && ((C1530) c1500M5047.f6099) != null) {
                    c1500M5047.m5064();
                }
            }
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean m5051() {
        C1514 c1514 = this.f6049;
        if (c1514 == null) {
            c1514 = null;
        }
        return c1514.m5093() != null;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final Cursor m5052(InterfaceC1226 interfaceC1226, CancellationSignal cancellationSignal) {
        m5049();
        m5041();
        return cancellationSignal != null ? m5044().mo4418().mo4380(interfaceC1226, cancellationSignal) : m5044().mo4418().mo4388(interfaceC1226);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5053() {
        if (m5051()) {
            C1514 c1514 = this.f6049;
            if (c1514 == null) {
                c1514 = null;
            }
            InterfaceC1224 interfaceC1224 = (InterfaceC1224) c1514.f6166;
            if (!(interfaceC1224 != null ? interfaceC1224.isOpen() : false)) {
                return;
            }
        }
        C3262 c3262 = this.f6055;
        synchronized (c3262) {
            C3375 c3375 = (C3375) c3262.f12725;
            c3375.getClass();
            if (C3375.f13200.compareAndSet(c3375, 0, 1)) {
                while (((C3374) c3262.f12724).f13199 != 0) {
                }
                ((ᐧˋ) c3262.f12726).ـﹶ();
            }
        }
    }

    /* renamed from: ﹶˆ */
    public List mo1383() {
        return C1053.f4449;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final Object m5054(boolean z, InterfaceC3864 interfaceC3864, AbstractC2562 abstractC2562) {
        C1514 c1514 = this.f6049;
        if (c1514 == null) {
            c1514 = null;
        }
        return ((InterfaceC2162) c1514.f6170).mo6091(z, interfaceC3864, abstractC2562);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m5055() {
        m5044().mo4418().mo4390();
    }
}
