package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p184.C2556;
import p236.C3092;
import p285.C3385;
import p343.C3913;
import p343.C3914;

/* renamed from: androidx.lifecycle.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0236 extends AbstractC0233 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f1268;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final WeakReference f1269;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2556 f1270;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f1271;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3914 f1272;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f1273;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f1274;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public EnumC0230 f1275;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList f1276;

    public C0236(InterfaceC0262 interfaceC0262) {
        this.f1258 = new AtomicReference(null);
        this.f1268 = true;
        this.f1272 = new C3914();
        EnumC0230 enumC0230 = EnumC0230.f1250;
        this.f1275 = enumC0230;
        this.f1276 = new ArrayList();
        this.f1269 = new WeakReference(interfaceC0262);
        this.f1270 = new C2556(enumC0230);
    }

    @Override // androidx.lifecycle.AbstractC0233
    /* renamed from: ʽᐧ */
    public final void mo1031(InterfaceC0222 interfaceC0222) {
        m1038("removeObserver");
        this.f1272.mo9102(interfaceC0222);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m1034(EnumC0247 enumC0247) {
        m1038("handleLifecycleEvent");
        m1036(enumC0247.m1052());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final EnumC0230 m1035(InterfaceC0222 interfaceC0222) {
        C0261 c0261;
        HashMap map = this.f1272.f15219;
        C3913 c3913 = map.containsKey(interfaceC0222) ? ((C3913) map.get(interfaceC0222)).f15217 : null;
        EnumC0230 enumC0230 = (c3913 == null || (c0261 = (C0261) c3913.f15215) == null) ? null : c0261.f1321;
        ArrayList arrayList = this.f1276;
        EnumC0230 enumC02302 = arrayList.isEmpty() ? null : (EnumC0230) ـˈ.ˉᵎ.ﹶˆ(1, arrayList);
        EnumC0230 enumC02303 = this.f1275;
        if (enumC0230 == null || enumC0230.compareTo(enumC02303) >= 0) {
            enumC0230 = enumC02303;
        }
        return (enumC02302 == null || enumC02302.compareTo(enumC0230) >= 0) ? enumC0230 : enumC02302;
    }

    @Override // androidx.lifecycle.AbstractC0233
    /* renamed from: ـﹶ */
    public final void mo1032(InterfaceC0222 interfaceC0222) {
        InterfaceC0213 c0243;
        Object obj;
        InterfaceC0262 interfaceC0262;
        ArrayList arrayList = this.f1276;
        Object obj2 = null;
        int i = 1;
        m1038("addObserver");
        EnumC0230 enumC0230 = this.f1275;
        EnumC0230 enumC02302 = EnumC0230.f1254;
        if (enumC0230 != enumC02302) {
            enumC02302 = EnumC0230.f1250;
        }
        C0261 c0261 = new C0261();
        HashMap map = AbstractC0216.f1231;
        boolean z = interfaceC0222 instanceof InterfaceC0213;
        boolean z2 = interfaceC0222 instanceof InterfaceC0211;
        if (z && z2) {
            c0243 = new C0243((InterfaceC0211) interfaceC0222, i, (InterfaceC0213) interfaceC0222);
        } else if (z2) {
            c0243 = new C0243((InterfaceC0211) interfaceC0222, i, obj2);
        } else if (z) {
            c0243 = (InterfaceC0213) interfaceC0222;
        } else {
            Class<?> cls = interfaceC0222.getClass();
            if (AbstractC0216.m1012(cls) == 2) {
                List list = (List) AbstractC0216.f1230.get(cls);
                if (list.size() == 1) {
                    AbstractC0216.m1013((Constructor) list.get(0), interfaceC0222);
                    throw null;
                }
                int size = list.size();
                InterfaceC0260[] interfaceC0260Arr = new InterfaceC0260[size];
                if (size > 0) {
                    AbstractC0216.m1013((Constructor) list.get(0), interfaceC0222);
                    throw null;
                }
                c0243 = new C3385(i, interfaceC0260Arr);
            } else {
                c0243 = new C0243(interfaceC0222);
            }
        }
        c0261.f1320 = c0243;
        c0261.f1321 = enumC02302;
        C3914 c3914 = this.f1272;
        C3913 c3913Mo9103 = c3914.mo9103(interfaceC0222);
        if (c3913Mo9103 != null) {
            obj = c3913Mo9103.f15215;
        } else {
            HashMap map2 = c3914.f15219;
            C3913 c3913 = new C3913(interfaceC0222, c0261);
            c3914.f15222++;
            C3913 c39132 = c3914.f15220;
            if (c39132 == null) {
                c3914.f15223 = c3913;
                c3914.f15220 = c3913;
            } else {
                c39132.f15216 = c3913;
                c3913.f15217 = c39132;
                c3914.f15220 = c3913;
            }
            map2.put(interfaceC0222, c3913);
            obj = null;
        }
        if (((C0261) obj) == null && (interfaceC0262 = (InterfaceC0262) this.f1269.get()) != null) {
            i = (this.f1273 != 0 || this.f1274) ? 1 : 0;
            EnumC0230 enumC0230M1035 = m1035(interfaceC0222);
            this.f1273++;
            while (c0261.f1321.compareTo(enumC0230M1035) < 0 && this.f1272.f15219.containsKey(interfaceC0222)) {
                arrayList.add(c0261.f1321);
                C0220 c0220 = EnumC0247.Companion;
                EnumC0230 enumC02303 = c0261.f1321;
                c0220.getClass();
                int iOrdinal = enumC02303.ordinal();
                EnumC0247 enumC0247 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0247.ON_RESUME : EnumC0247.ON_START : EnumC0247.ON_CREATE;
                if (enumC0247 == null) {
                    throw new IllegalStateException("no event up from " + c0261.f1321);
                }
                c0261.m1093(interfaceC0262, enumC0247);
                arrayList.remove(arrayList.size() - 1);
                enumC0230M1035 = m1035(interfaceC0222);
            }
            if (i == 0) {
                m1037();
            }
            this.f1273--;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m1036(EnumC0230 enumC0230) {
        EnumC0230 enumC02302 = this.f1275;
        if (enumC02302 == enumC0230) {
            return;
        }
        EnumC0230 enumC02303 = EnumC0230.f1250;
        EnumC0230 enumC02304 = EnumC0230.f1254;
        if (enumC02302 == enumC02303 && enumC0230 == enumC02304) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0230 + ", but was " + this.f1275 + " in component " + this.f1269.get()).toString());
        }
        this.f1275 = enumC0230;
        if (this.f1274 || this.f1273 != 0) {
            this.f1271 = true;
            return;
        }
        this.f1274 = true;
        m1037();
        this.f1274 = false;
        if (this.f1275 == enumC02304) {
            this.f1272 = new C3914();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r11.f1271 = false;
        r11.f1270.m6675(r11.f1275);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1037() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0236.m1037():void");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m1038(String str) {
        if (this.f1268) {
            C3092.m7596().f11933.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(ˆʽ.ᵎˏ.ˑי("Method ", str, " must be called on the main thread").toString());
            }
        }
    }
}
