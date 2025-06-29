package p285;

import android.os.Bundle;
import androidx.lifecycle.C0229;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p070.AbstractC1549;
import p225.C2991;
import p343.C3911;
import p343.C3913;
import p343.C3915;

/* renamed from: ٴˋ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3383 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f13219;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C2991 f13220;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Bundle f13221;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3915 f13222 = new C3915();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f13223 = true;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f13224;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3388 m8241() {
        String str;
        InterfaceC3388 interfaceC3388;
        Iterator it = this.f13222.iterator();
        do {
            C3911 c3911 = (C3911) it;
            if (!c3911.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c3911.next();
            str = (String) entry.getKey();
            interfaceC3388 = (InterfaceC3388) entry.getValue();
        } while (!AbstractC1549.m5138(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC3388;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8242(String str, InterfaceC3388 interfaceC3388) {
        Object obj;
        C3915 c3915 = this.f13222;
        C3913 c3913Mo9103 = c3915.mo9103(str);
        if (c3913Mo9103 != null) {
            obj = c3913Mo9103.f15215;
        } else {
            C3913 c3913 = new C3913(str, interfaceC3388);
            c3915.f15222++;
            C3913 c39132 = c3915.f15220;
            if (c39132 == null) {
                c3915.f15223 = c3913;
                c3915.f15220 = c3913;
            } else {
                c39132.f15216 = c3913;
                c3913.f15217 = c39132;
                c3915.f15220 = c3913;
            }
            obj = null;
        }
        if (((InterfaceC3388) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Bundle m8243(String str) {
        if (!this.f13224) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f13221;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f13221;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f13221;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f13221 = null;
        }
        return bundle2;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8244() throws NoSuchMethodException, SecurityException {
        if (!this.f13223) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C2991 c2991 = this.f13220;
        if (c2991 == null) {
            c2991 = new C2991(this);
        }
        this.f13220 = c2991;
        try {
            C0229.class.getDeclaredConstructor(null);
            C2991 c29912 = this.f13220;
            if (c29912 != null) {
                ((LinkedHashSet) c29912.f11508).add(C0229.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0229.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
