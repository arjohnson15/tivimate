package p001;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import p144.C2230;
import p167.C2447;
import p167.C2448;
import p266.C3261;
import p331.C3758;
import ˈˉ.ﹳﹳ;
import ﹶˋ.ـﹶ;

/* renamed from: ʻʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0883 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f4008;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f4009;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public volatile boolean f4010;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f4011;

    public C0883() {
        this.f4008 = new ﹳﹳ(3);
        this.f4009 = new LinkedHashMap();
        this.f4011 = new LinkedHashSet();
    }

    public C0883(C3758 c3758, TreeSet treeSet, Object obj) {
        this.f4010 = false;
        this.f4011 = c3758;
        this.f4008 = treeSet;
        this.f4009 = obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m3701(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m3702() {
        Iterator it = ((TreeSet) this.f4008).iterator();
        while (it.hasNext()) {
            C3261 c3261 = (C3261) it.next();
            Object obj = this.f4009;
            C2230 c2230 = c3261.f12718;
            if (!c2230.isEmpty()) {
                c3261.f12720.mo6452(this, obj, c2230);
            }
        }
        if (this.f4010) {
            return;
        }
        if (!C2447.class.equals(this.f4009.getClass()) && !C2448.class.equals(this.f4009.getClass())) {
            ((ـﹶ) ((C3758) this.f4011).f14519).ᵎـ(new C2447(this.f4009));
        } else {
            if (C2448.class.equals(this.f4009.getClass())) {
                return;
            }
            ((ـﹶ) ((C3758) this.f4011).f14519).ᵎـ(new C2448(this.f4009));
        }
    }
}
