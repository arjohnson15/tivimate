package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p331.C3758;

/* renamed from: com.google.android.gms.internal.measurement.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0504 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f2850;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f2851 = new ArrayList();

    public C0504(int i) {
        this.f2850 = i;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m2338(InterfaceC0489 interfaceC0489, InterfaceC0489 interfaceC04892) {
        InterfaceC0489 c0477;
        InterfaceC0489 c04772;
        while (!interfaceC0489.getClass().equals(interfaceC04892.getClass())) {
            if (((interfaceC0489 instanceof C0550) || (interfaceC0489 instanceof C0385)) && ((interfaceC04892 instanceof C0550) || (interfaceC04892 instanceof C0385))) {
                return true;
            }
            boolean z = interfaceC0489 instanceof C0477;
            if (z && (interfaceC04892 instanceof C0429)) {
                c04772 = new C0477(interfaceC04892.mo1860());
            } else {
                boolean z2 = interfaceC0489 instanceof C0429;
                if (z2 && (interfaceC04892 instanceof C0477)) {
                    c0477 = new C0477(interfaceC0489.mo1860());
                } else if (interfaceC0489 instanceof C0469) {
                    c0477 = new C0477(interfaceC0489.mo1860());
                } else if (interfaceC04892 instanceof C0469) {
                    c04772 = new C0477(interfaceC04892.mo1860());
                } else if ((z2 || z) && (interfaceC04892 instanceof InterfaceC0562)) {
                    c04772 = new C0429(interfaceC04892.mo1876());
                } else {
                    if (!(interfaceC0489 instanceof InterfaceC0562) || (!(interfaceC04892 instanceof C0429) && !(interfaceC04892 instanceof C0477))) {
                        return false;
                    }
                    c0477 = new C0429(interfaceC0489.mo1876());
                }
                interfaceC0489 = c0477;
            }
            interfaceC04892 = c04772;
        }
        if ((interfaceC0489 instanceof C0550) || (interfaceC0489 instanceof C0385)) {
            return true;
        }
        return interfaceC0489 instanceof C0477 ? (Double.isNaN(interfaceC0489.mo1860().doubleValue()) || Double.isNaN(interfaceC04892.mo1860().doubleValue()) || interfaceC0489.mo1860().doubleValue() != interfaceC04892.mo1860().doubleValue()) ? false : true : interfaceC0489 instanceof C0429 ? interfaceC0489.mo1876().equals(interfaceC04892.mo1876()) : interfaceC0489 instanceof C0469 ? interfaceC0489.mo1875().equals(interfaceC04892.mo1875()) : interfaceC0489 == interfaceC04892;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m2339(InterfaceC0489 interfaceC0489, InterfaceC0489 interfaceC04892) {
        if (interfaceC0489 instanceof InterfaceC0562) {
            interfaceC0489 = new C0429(interfaceC0489.mo1876());
        }
        if (interfaceC04892 instanceof InterfaceC0562) {
            interfaceC04892 = new C0429(interfaceC04892.mo1876());
        }
        return (((interfaceC0489 instanceof C0429) && (interfaceC04892 instanceof C0429)) || !(Double.isNaN(interfaceC0489.mo1860().doubleValue()) || Double.isNaN(interfaceC04892.mo1860().doubleValue()))) && !m2343(interfaceC04892, interfaceC0489);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C0420 m2340(ﹶˋ.ـﹶ r5, ArrayList arrayList) {
        AbstractC0543.m2440(EnumC0356.f2547, 2, arrayList);
        InterfaceC0489 interfaceC0489M8736 = ((C3758) r5.ˎˑ).m8736(r5, (InterfaceC0489) arrayList.get(0));
        InterfaceC0489 interfaceC0489M87362 = ((C3758) r5.ˎˑ).m8736(r5, (InterfaceC0489) arrayList.get(1));
        if (!(interfaceC0489M87362 instanceof C0335)) {
            throw new IllegalArgumentException(ᵎﹳ.ᐧʻ.ﾞˊ("FN requires an ArrayValue of parameter names found ", interfaceC0489M87362.getClass().getCanonicalName()));
        }
        ArrayList arrayListM1874 = ((C0335) interfaceC0489M87362).m1874();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C0420(interfaceC0489M8736.mo1876(), arrayListM1874, arrayList2, r5);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static InterfaceC0489 m2341(InterfaceC0485 interfaceC0485, Iterator it, InterfaceC0489 interfaceC0489) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0489 interfaceC04892 = interfaceC0485.mo2292((InterfaceC0489) it.next()).ﾞˊ((C0335) interfaceC0489);
                if (interfaceC04892 instanceof C0421) {
                    C0421 c0421 = (C0421) interfaceC04892;
                    if ("break".equals(c0421.f2715)) {
                        return InterfaceC0489.f2827;
                    }
                    if ("return".equals(c0421.f2715)) {
                        return c0421;
                    }
                }
            }
        }
        return InterfaceC0489.f2827;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static InterfaceC0489 m2342(InterfaceC0485 interfaceC0485, InterfaceC0489 interfaceC0489, InterfaceC0489 interfaceC04892) {
        if (interfaceC0489 instanceof Iterable) {
            return m2341(interfaceC0485, ((Iterable) interfaceC0489).iterator(), interfaceC04892);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m2343(InterfaceC0489 interfaceC0489, InterfaceC0489 interfaceC04892) {
        if (interfaceC0489 instanceof InterfaceC0562) {
            interfaceC0489 = new C0429(interfaceC0489.mo1876());
        }
        if (interfaceC04892 instanceof InterfaceC0562) {
            interfaceC04892 = new C0429(interfaceC04892.mo1876());
        }
        if ((interfaceC0489 instanceof C0429) && (interfaceC04892 instanceof C0429)) {
            return ((C0429) interfaceC0489).f2728.compareTo(((C0429) interfaceC04892).f2728) < 0;
        }
        double dDoubleValue = interfaceC0489.mo1860().doubleValue();
        double dDoubleValue2 = interfaceC04892.mo1860().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:423:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v46, types: [com.google.android.gms.internal.measurement.ʿʼ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.measurement.ʿʼ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0489 m2344(java.lang.String r12, ﹶˋ.ـﹶ r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0504.m2344(java.lang.String, ﹶˋ.ـﹶ, java.util.ArrayList):com.google.android.gms.internal.measurement.ᴵʿ");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m2345(String str) {
        if (!this.f2851.contains(AbstractC0543.m2436(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(ᵎﹳ.ᐧʻ.ﾞˊ("Command not implemented: ", str));
    }
}
