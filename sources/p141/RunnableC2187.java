package p141;

import android.database.Cursor;
import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.window.SurfaceSyncGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0091;
import androidx.fragment.app.C0102;
import androidx.fragment.app.C0107;
import androidx.lifecycle.AbstractC0254;
import androidx.lifecycle.C0259;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.C0559;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p009.C0995;
import p015.C1067;
import p033.C1220;
import p065.AbstractC1502;
import p065.C1529;
import p070.AbstractC1547;
import p116.AbstractC1836;
import p166.C2412;
import p166.InterfaceC2419;
import p175.C2484;
import p192.C2661;
import p192.C2665;
import p192.C2672;
import p192.InterfaceC2663;
import p200.C2741;
import p251.C3130;
import p251.C3136;
import p272.C3302;
import p272.RunnableC3324;
import p291.AbstractC3436;
import p291.C3449;
import p331.C3760;
import p331.C3767;
import p331.C3772;
import p334.C3789;
import p338.InterfaceC3865;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;
import p361.C4092;
import p374.C4290;
import p375.C4305;
import p383.AbstractC4464;
import p385.C4480;
import p395.AbstractC4535;
import p396.C4580;
import p396.C4586;
import p396.InterfaceC4576;
import p406.C4665;
import p410.C4681;
import p410.C4682;
import p414.C4715;
import p414.C4722;
import p414.C4736;
import p414.C4737;
import p414.InterfaceC4712;
import p428.C4931;
import p428.CallableC4922;
import p438.C5097;
import p438.C5118;
import p456.C5349;
import p457.C5362;
import p457.C5368;
import p457.C5386;
import p457.C5391;
import ˎˊ.ˆʿ;
import ˏʼ.ʽᐧ;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉˑ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2187 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f8594;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8595;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f8596;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f8597;

    public /* synthetic */ RunnableC2187(Object obj, Object obj2, Object obj3, int i) {
        this.f8597 = i;
        this.f8594 = obj;
        this.f8595 = obj2;
        this.f8596 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC2187(AtomicBoolean atomicBoolean, C4682 c4682, InterfaceC3865 interfaceC3865) {
        this.f8597 = 17;
        this.f8594 = atomicBoolean;
        this.f8595 = c4682;
        this.f8596 = (AbstractC1547) interfaceC3865;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m6112() {
        boolean zBooleanValue;
        C4736 c4736 = (C4736) this.f8594;
        C4681 c4681 = (C4681) this.f8595;
        C4715 c4715 = (C4715) this.f8596;
        c4736.getClass();
        try {
            zBooleanValue = ((Boolean) c4681.f17815.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        synchronized (c4736.f18165) {
            try {
                C3760 c3760 = ـﹶ.ˋˊ(c4715.f18097);
                String str = c3760.f14526;
                if (c4736.m10654(str) == c4715) {
                    c4736.m10647(str);
                }
                C5391.m12163().m12168(C4736.f18161, C4736.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                Iterator it = c4736.f18164.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4712) it.next()).mo1386(c3760, zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [ʿ.ˉי, ᵎˈ.ـﹶ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ᵢˎ.ᵢʿ] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, ᵢﹶ.ˏʾ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8597) {
            case 0:
                C1067 c1067 = ((C2205) this.f8594).f8678;
                String str = (String) this.f8595;
                C2211 c2211 = (C2211) c1067.f4608;
                c2211.f8757 = str;
                InterfaceC2215 interfaceC2215 = (InterfaceC2215) this.f8596;
                C2212 c2212Mo6178 = interfaceC2215.mo6178();
                C2210 c2210 = c2211.f8759;
                if (c2212Mo6178 != null) {
                    C2209 c2209 = c2210.f8745;
                    int iMo6176 = interfaceC2215.mo6176();
                    C2203 c2203 = c2209.f8724;
                    c2203.f8666.put(Integer.valueOf(iMo6176), c2212Mo6178);
                    c2210.f8738 = true;
                }
                c2210.m6172();
                return;
            case 1:
                C0995 c0995 = (C0995) this.f8594;
                ʽᐧ r1 = (ʽᐧ) this.f8595;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f8596;
                c0995.getClass();
                try {
                    C2672 c2672 = ˆʿ.ʿʼ(c0995.f4341);
                    if (c2672 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C2665 c2665 = (C2665) ((InterfaceC2663) c2672.f5785);
                    synchronized (c2665.f10559) {
                        c2665.f10557 = threadPoolExecutor;
                    }
                    ((InterfaceC2663) c2672.f5785).mo3956(new C2661(r1, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    r1.ﹳˎ(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                C3302 c3302 = (C3302) this.f8594;
                c3302.getClass();
                AttachedSurfaceControl rootSurfaceControl = ((SurfaceView) this.f8595).getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return;
                }
                SurfaceSyncGroup surfaceSyncGroupM5591 = AbstractC1836.m5591();
                c3302.f12850 = surfaceSyncGroupM5591;
                AbstractC4464.m10132(surfaceSyncGroupM5591.add(rootSurfaceControl, new RunnableC3324(0)));
                ((Runnable) this.f8596).run();
                rootSurfaceControl.applyTransactionOnDraw(AbstractC0254.m1061());
                return;
            case 3:
                ((ViewGroup) this.f8594).endViewTransition((View) this.f8595);
                C0102 c0102 = (C0102) this.f8596;
                c0102.f593.f657.m602(c0102);
                return;
            case 4:
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = ((C0091) this.f8594).f555;
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((C0091) this.f8595).f555;
                C0107 c0107 = (C0107) this.f8596;
                C2741 c2741 = c0107.f669;
                C3449 c3449 = AbstractC3436.f13331;
                if (c0107.f663) {
                    abstractComponentCallbacksC01002.getEnterTransitionCallback();
                    return;
                } else {
                    abstractComponentCallbacksC0100.getEnterTransitionCallback();
                    return;
                }
            case 5:
                ᐧʻ r0 = (ᐧʻ) this.f8594;
                int i = r0.ˆʿ;
                this.f8595.mo2488(i, (C4290) r0.ˎˑ, (C2484) this.f8596);
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                C4480 c4480 = (C4480) this.f8594;
                int i2 = c4480.f17252;
                this.f8595.mo2483(i2, c4480.f17250, (Exception) this.f8596);
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C4580 c4580 = (C4580) ((C3767) this.f8594).f14558;
                boolean zMo10462 = c4580.f17526.mo10462();
                InterfaceC4576 interfaceC4576 = (InterfaceC4576) this.f8595;
                if (zMo10462) {
                    interfaceC4576.mo7069(new IOException("Canceled"));
                    return;
                } else {
                    interfaceC4576.mo7070(c4580, (C4586) this.f8596);
                    return;
                }
            case 8:
                Object obj = ((C3767) this.f8594).f14558;
                ((InterfaceC4576) this.f8595).mo7069((Throwable) this.f8596);
                return;
            case 9:
                C3772 c3772Mo1374 = ((WorkDatabase) this.f8594).mo1374();
                c3772Mo1374.getClass();
                TreeMap treeMap = C1529.f6210;
                C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                c1529M5069.mo4420(1, (String) this.f8595);
                WorkDatabase_Impl workDatabase_Impl = c3772Mo1374.f14601;
                workDatabase_Impl.m5041();
                Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorM5052.getCount());
                    while (cursorM5052.moveToNext()) {
                        arrayList.add(cursorM5052.getString(0));
                    }
                    cursorM5052.close();
                    c1529M5069.m5111();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC4535.m10357((C4722) this.f8596, (String) it.next());
                    }
                    return;
                } catch (Throwable th2) {
                    cursorM5052.close();
                    c1529M5069.m5111();
                    throw th2;
                }
            case 10:
                m6112();
                return;
            case 11:
                ((C4736) ((C5349) this.f8594).f20756).m10655((C4737) this.f8595, (C5368) this.f8596);
                return;
            case 12:
                CallableC4922 callableC4922 = (CallableC4922) this.f8594;
                ExecutorService executorService = (ExecutorService) this.f8595;
                C3136 c3136 = (C3136) this.f8596;
                try {
                    ((C3130) callableC4922.call()).m7690(executorService, new C4931(c3136, 2));
                    return;
                } catch (Exception e) {
                    c3136.f12093.m7692(e);
                    return;
                }
            case 13:
                C5097 c5097 = (C5097) this.f8594;
                c5097.getClass();
                C3932 c3932M9167 = ((C3961) this.f8595).m9167();
                C1220 c1220 = c5097.f19392;
                InterfaceC2419 interfaceC2419 = c1220.f5019;
                interfaceC2419.getClass();
                C4305 c4305 = c1220.f5016;
                c4305.getClass();
                c4305.f16745 = AbstractC3980.m9209(c3932M9167);
                if (!c3932M9167.isEmpty()) {
                    c4305.f16746 = (C4290) c3932M9167.get(0);
                    C4290 c4290 = (C4290) this.f8596;
                    c4290.getClass();
                    c4305.f16749 = c4290;
                }
                if (((C4290) c4305.f16750) == null) {
                    c4305.f16750 = C4305.m9787(interfaceC2419, (AbstractC3980) c4305.f16745, (C4290) c4305.f16746, (C2412) c4305.f16748);
                }
                c4305.m9796(((C5118) interfaceC2419).m11369());
                return;
            case 14:
                C1220 c12202 = (C1220) ((C4092) ((C0559) this.f8594).f2913).f15797;
                Pair pair = (Pair) this.f8595;
                c12202.mo2483(((Integer) pair.first).intValue(), (C4290) pair.second, (Exception) this.f8596);
                return;
            case 15:
                C4682 c4682 = (C4682) this.f8595;
                C4665 c4665 = (C4665) this.f8596;
                if (((AtomicBoolean) this.f8594).get()) {
                    return;
                }
                try {
                    c4665.mo1053();
                    c4682.m10585(null);
                    return;
                } catch (Throwable th3) {
                    c4682.m10584(th3);
                    return;
                }
            case 16:
                InterfaceC3865 interfaceC3865 = (InterfaceC3865) this.f8594;
                C0259 c0259 = (C0259) this.f8595;
                C4682 c46822 = (C4682) this.f8596;
                try {
                    interfaceC3865.mo1053();
                    C5362 c5362 = C5368.f20834;
                    c0259.m1050(c5362);
                    c46822.m10585(c5362);
                    return;
                } catch (Throwable th4) {
                    c0259.m1050(new C5386(th4));
                    c46822.m10584(th4);
                    return;
                }
            default:
                C4682 c46823 = (C4682) this.f8595;
                ?? r12 = (AbstractC1547) this.f8596;
                if (((AtomicBoolean) this.f8594).get()) {
                    return;
                }
                try {
                    c46823.m10585(r12.mo1053());
                    return;
                } catch (Throwable th5) {
                    c46823.m10584(th5);
                    return;
                }
        }
    }
}
