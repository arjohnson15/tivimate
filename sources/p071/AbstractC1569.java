package p071;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0002;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0262;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p286.AbstractC3390;
import p387.AbstractC4506;

/* renamed from: ʿʼ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1569 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f6317 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f6314 = new HashMap();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f6316 = new HashMap();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ArrayList f6320 = new ArrayList();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final transient HashMap f6315 = new HashMap();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final HashMap f6318 = new HashMap();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Bundle f6319 = new Bundle();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract void mo5159(int i, AbstractC3390 abstractC3390, Object obj);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5160(String str) {
        HashMap map = this.f6314;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        AbstractC4506.f17324.getClass();
        int iNextInt = AbstractC4506.f17323.mo4528().nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            HashMap map2 = this.f6317;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                AbstractC4506.f17324.getClass();
                iNextInt = AbstractC4506.f17323.mo4528().nextInt(2147418112);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1567 m5161(String str, InterfaceC0262 interfaceC0262, AbstractC3390 abstractC3390, InterfaceC1566 interfaceC1566) {
        AbstractC0233 lifecycle = interfaceC0262.getLifecycle();
        C0236 c0236 = (C0236) lifecycle;
        if (c0236.f1275.m1030(EnumC0230.f1253)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0262 + " is attempting to register while current state is " + c0236.f1275 + ". LifecycleOwners must call register before they are STARTED.");
        }
        m5160(str);
        HashMap map = this.f6316;
        C1573 c1573 = (C1573) map.get(str);
        if (c1573 == null) {
            c1573 = new C1573(lifecycle);
        }
        C1574 c1574 = new C1574(this, str, interfaceC1566, abstractC3390, 0);
        c1573.f6326.mo1032(c1574);
        c1573.f6325.add(c1574);
        map.put(str, c1573);
        return new C1567(this, str, abstractC3390, 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m5162(int i, int i2, Intent intent) {
        InterfaceC1566 interfaceC1566;
        String str = (String) this.f6317.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C1572 c1572 = (C1572) this.f6315.get(str);
        if (c1572 == null || (interfaceC1566 = c1572.f6324) == null || !this.f6320.contains(str)) {
            this.f6318.remove(str);
            this.f6319.putParcelable(str, new C1571(intent, i2));
            return true;
        }
        interfaceC1566.mo4094(c1572.f6323.mo8249(intent, i2));
        this.f6320.remove(str);
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m5163(String str) {
        Integer num;
        if (!this.f6320.contains(str) && (num = (Integer) this.f6314.remove(str)) != null) {
            this.f6317.remove(num);
        }
        this.f6315.remove(str);
        HashMap map = this.f6318;
        if (map.containsKey(str)) {
            StringBuilder sbM50 = AbstractC0002.m50("Dropping pending result for request ", str, ": ");
            sbM50.append(map.get(str));
            sbM50.toString();
            map.remove(str);
        }
        Bundle bundle = this.f6319;
        if (bundle.containsKey(str)) {
            StringBuilder sbM502 = AbstractC0002.m50("Dropping pending result for request ", str, ": ");
            sbM502.append(bundle.getParcelable(str));
            sbM502.toString();
            bundle.remove(str);
        }
        HashMap map2 = this.f6316;
        C1573 c1573 = (C1573) map2.get(str);
        if (c1573 != null) {
            ArrayList arrayList = c1573.f6325;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c1573.f6326.mo1031((InterfaceC0213) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1567 m5164(String str, AbstractC3390 abstractC3390, InterfaceC1566 interfaceC1566) {
        m5160(str);
        this.f6315.put(str, new C1572(abstractC3390, interfaceC1566));
        HashMap map = this.f6318;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC1566.mo4094(obj);
        }
        Bundle bundle = this.f6319;
        C1571 c1571 = (C1571) bundle.getParcelable(str);
        if (c1571 != null) {
            bundle.remove(str);
            interfaceC1566.mo4094(abstractC3390.mo8249(c1571.f6321, c1571.f6322));
        }
        return new C1567(this, str, abstractC3390, 1);
    }
}
