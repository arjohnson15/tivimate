package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.lsposed.hiddenapibypass.library.R;
import p001.C0884;
import p070.AbstractC1563;
import p072.AbstractC1586;
import p072.AbstractC1642;
import p072.C1613;
import p148.AbstractC2262;
import p253.C3150;
import p285.C3385;
import p285.InterfaceC3387;
import p285.InterfaceC3388;
import p288.C3405;
import p330.C3749;
import p330.InterfaceC3747;
import p458.AbstractC5393;
import p458.C5394;

/* renamed from: androidx.lifecycle.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0224 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ˈˉ.ﹳﹳ f1240 = new ˈˉ.ﹳﹳ(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ᵔʼ.ˑʽ f1237 = new ᵔʼ.ˑʽ();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ᵔᵔ.ٴˎ f1239 = new ᵔᵔ.ٴˎ(1);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final ˈˉ.ﹳﹳ f1241 = new ˈˉ.ﹳﹳ(3);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final ˈˉ.ﹳﹳ f1238 = new ˈˉ.ﹳﹳ(2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0251 m1017(AbstractC5393 abstractC5393) {
        InterfaceC3387 interfaceC3387 = (InterfaceC3387) abstractC5393.mo12171(f1240);
        if (interfaceC3387 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0242 interfaceC0242 = (InterfaceC0242) abstractC5393.mo12171(f1237);
        if (interfaceC0242 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC5393.mo12171(f1239);
        String str = (String) abstractC5393.mo12171(f1238);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC3388 interfaceC3388M8241 = interfaceC3387.getSavedStateRegistry().m8241();
        C0212 c0212 = interfaceC3388M8241 instanceof C0212 ? (C0212) interfaceC3388M8241 : null;
        if (c0212 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C0219 c0219M1022 = m1022(interfaceC0242);
        C0251 c0251 = (C0251) c0219M1022.f1235.get(str);
        if (c0251 != null) {
            return c0251;
        }
        Class[] clsArr = C0251.f1302;
        c0212.m1007();
        Bundle bundle2 = c0212.f1222;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c0212.f1222;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c0212.f1222;
        if (bundle5 != null && bundle5.isEmpty()) {
            c0212.f1222 = null;
        }
        C0251 c0251M1021 = m1021(bundle3, bundle);
        c0219M1022.f1235.put(str, c0251M1021);
        return c0251M1021;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C0227 m1018(InterfaceC0262 interfaceC0262) {
        C0227 c0227;
        AbstractC0233 lifecycle = interfaceC0262.getLifecycle();
        loop0: while (true) {
            AtomicReference atomicReference = lifecycle.f1258;
            c0227 = (C0227) atomicReference.get();
            if (c0227 == null) {
                C1613 c1613M5293 = AbstractC1642.m5293();
                C3150 c3150 = AbstractC1586.f6345;
                c0227 = new C0227(lifecycle, ᴵﹳ.ٴˎ.ˋⁱ(c1613M5293, AbstractC2262.f8994.f10976));
                while (!atomicReference.compareAndSet(null, c0227)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                C3150 c31502 = AbstractC1586.f6345;
                AbstractC1642.m5294(c0227, AbstractC2262.f8994.f10976, 0, new C0250(c0227, null), 2);
                break loop0;
            }
            break;
        }
        return c0227;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m1019(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0253.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C0253());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0206(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m1020(Activity activity, EnumC0247 enumC0247) {
        if (activity instanceof InterfaceC0262) {
            AbstractC0233 lifecycle = ((InterfaceC0262) activity).getLifecycle();
            if (lifecycle instanceof C0236) {
                ((C0236) lifecycle).m1034(enumC0247);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0251 m1021(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C0251();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
            return new C0251(map);
        }
        bundle.setClassLoader(C0251.class.getClassLoader());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C0251(linkedHashMap);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0219 m1022(InterfaceC0242 interfaceC0242) {
        return (C0219) new ﹶˋ.ـﹶ(interfaceC0242.getViewModelStore(), new ˊᵔ(0), interfaceC0242 instanceof InterfaceC0218 ? ((InterfaceC0218) interfaceC0242).getDefaultViewModelCreationExtras() : C5394.f20869).ᴵʿ(AbstractC1563.m5154(C0219.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C0884 m1023(AbstractC0207 abstractC0207) {
        C0884 c0884;
        synchronized (f1241) {
            c0884 = (C0884) abstractC0207.m999("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0884 == null) {
                InterfaceC3747 interfaceC3747 = C3749.f14510;
                try {
                    C3150 c3150 = AbstractC1586.f6345;
                    interfaceC3747 = AbstractC2262.f8994.f10976;
                } catch (IllegalStateException | C3405 unused) {
                }
                C0884 c08842 = new C0884(interfaceC3747.mo3967(AbstractC1642.m5293()));
                abstractC0207.m1000("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c08842);
                c0884 = c08842;
            }
        }
        return c0884;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final void m1024(InterfaceC3387 interfaceC3387) {
        EnumC0230 enumC0230 = ((C0236) interfaceC3387.getLifecycle()).f1275;
        if (enumC0230 != EnumC0230.f1250 && enumC0230 != EnumC0230.f1252) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC3387.getSavedStateRegistry().m8241() == null) {
            C0212 c0212 = new C0212(interfaceC3387.getSavedStateRegistry(), (InterfaceC0242) interfaceC3387);
            interfaceC3387.getSavedStateRegistry().m8242("androidx.lifecycle.internal.SavedStateHandlesProvider", c0212);
            interfaceC3387.getLifecycle().mo1032(new C3385(2, c0212));
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final void m1025(View view, InterfaceC0262 interfaceC0262) {
        view.setTag(R.id._2_res_0x7f0b0420, interfaceC0262);
    }
}
