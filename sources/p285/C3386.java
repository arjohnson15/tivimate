package p285;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0262;
import java.util.Map;
import p343.C3915;
import p343.C3916;

/* renamed from: ٴˋ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3386 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3383 f13227 = new C3383();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f13228;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3387 f13229;

    public C3386(InterfaceC3387 interfaceC3387) {
        this.f13229 = interfaceC3387;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8245(Bundle bundle) {
        if (!this.f13228) {
            m8247();
        }
        C0236 c0236 = (C0236) this.f13229.getLifecycle();
        if (c0236.f1275.m1030(EnumC0230.f1253)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0236.f1275).toString());
        }
        C3383 c3383 = this.f13227;
        if (!c3383.f13219) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c3383.f13224) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c3383.f13221 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c3383.f13224 = true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m8246(Bundle bundle) {
        C3383 c3383 = this.f13227;
        c3383.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c3383.f13221;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3915 c3915 = c3383.f13222;
        c3915.getClass();
        C3916 c3916 = new C3916(c3915);
        c3915.f15221.put(c3916, Boolean.FALSE);
        while (c3916.hasNext()) {
            Map.Entry entry = (Map.Entry) c3916.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC3388) entry.getValue()).mo629());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8247() {
        InterfaceC3387 interfaceC3387 = this.f13229;
        AbstractC0233 lifecycle = interfaceC3387.getLifecycle();
        if (((C0236) lifecycle).f1275 != EnumC0230.f1250) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo1032(new C3385(0, interfaceC3387));
        final C3383 c3383 = this.f13227;
        if (c3383.f13219) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.mo1032(new InterfaceC0213() { // from class: ٴˋ.ʽᐧ
            @Override // androidx.lifecycle.InterfaceC0213
            /* renamed from: ـﹶ */
            public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
                EnumC0247 enumC02472 = EnumC0247.ON_START;
                C3383 c33832 = c3383;
                if (enumC0247 == enumC02472) {
                    c33832.f13223 = true;
                } else if (enumC0247 == EnumC0247.ON_STOP) {
                    c33832.f13223 = false;
                }
            }
        });
        c3383.f13219 = true;
        this.f13228 = true;
    }
}
