package p261;

import androidx.datastore.preferences.protobuf.C0054;
import com.bumptech.glide.C0284;
import com.bumptech.glide.C0290;
import com.bumptech.glide.EnumC0293;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p003.C0910;
import p003.InterfaceC0913;
import p035.C1234;
import p304.C3522;
import p305.C3532;
import p314.C3598;
import p314.InterfaceC3594;
import p314.InterfaceC3596;
import p329.C3734;
import p329.C3738;

/* renamed from: ـ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3237 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f12618;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C3738 f12619;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f12620;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f12621;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f12622;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public Class f12623;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public EnumC0293 f12624;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C3532 f12625;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C0284 f12626;

    /* renamed from: ˑי, reason: contains not printable characters */
    public C3231 f12627;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f12629;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Class f12630;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public InterfaceC3594 f12631;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f12632;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f12633;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C3598 f12634;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f12628 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f12617 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList m7990() {
        boolean z = this.f12620;
        ArrayList arrayList = this.f12628;
        if (!z) {
            this.f12620 = true;
            arrayList.clear();
            List listM1592 = this.f12626.m1555().m1592(this.f12633);
            int size = listM1592.size();
            for (int i = 0; i < size; i++) {
                C0910 c0910Mo3705 = ((InterfaceC0913) listM1592.get(i)).mo3705(this.f12633, this.f12618, this.f12629, this.f12634);
                if (c0910Mo3705 != null) {
                    arrayList.add(c0910Mo3705);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC3596 m7991(Class cls) {
        InterfaceC3596 interfaceC3596 = (InterfaceC3596) this.f12619.get(cls);
        if (interfaceC3596 == null) {
            Iterator it = ((C0054) this.f12619.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC3596 = (InterfaceC3596) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC3596 != null) {
            return interfaceC3596;
        }
        if (!this.f12619.isEmpty() || !this.f12632) {
            return C3522.f13643;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3232 m7992(Class cls) {
        C3232 c3232;
        C0290 c0290M1555 = this.f12626.m1555();
        Class cls2 = this.f12630;
        Class cls3 = this.f12623;
        C1234 c1234 = c0290M1555.f2384;
        C3734 c3734 = (C3734) c1234.f5046.getAndSet(null);
        if (c3734 == null) {
            c3734 = new C3734();
        }
        c3734.f14491 = cls;
        c3734.f14489 = cls2;
        c3734.f14490 = cls3;
        synchronized (c1234.f5047) {
            c3232 = (C3232) c1234.f5047.get(c3734);
        }
        c1234.f5046.set(c3734);
        c0290M1555.f2384.getClass();
        if (C1234.f5045.equals(c3232)) {
            return null;
        }
        if (c3232 != null) {
            return c3232;
        }
        ArrayList arrayListM1583 = c0290M1555.m1583(cls, cls2, cls3);
        C3232 c32322 = arrayListM1583.isEmpty() ? null : new C3232(cls, cls2, cls3, arrayListM1583, c0290M1555.f2377);
        c0290M1555.f2384.m4430(cls, cls2, cls3, c32322);
        return c32322;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList m7993() {
        boolean z = this.f12621;
        ArrayList arrayList = this.f12617;
        if (!z) {
            this.f12621 = true;
            arrayList.clear();
            ArrayList arrayListM7990 = m7990();
            int size = arrayListM7990.size();
            for (int i = 0; i < size; i++) {
                C0910 c0910 = (C0910) arrayListM7990.get(i);
                if (!arrayList.contains(c0910.f4068)) {
                    arrayList.add(c0910.f4068);
                }
                int i2 = 0;
                while (true) {
                    List list = c0910.f4066;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add((InterfaceC3594) list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.f5048;
     */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p314.InterfaceC3593 m7994(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.ʿʼ r0 = r5.f12626
            com.bumptech.glide.ˏᵢ r0 = r0.m1555()
            ʼʾ.ᴵʿ r0 = r0.f2375
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f4789     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            ʼⁱ.ـﹶ r3 = (p035.C1235) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.f5049     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            ᐧᵢ.ʽᐧ r1 = r3.f5048     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L4a
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find source encoder for data class: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p261.C3237.m7994(java.lang.Object):ᐧᵢ.ʽᐧ");
    }
}
