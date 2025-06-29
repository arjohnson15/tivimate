package p311;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.BinderC0519;
import com.google.android.gms.internal.measurement.C0367;
import com.google.android.gms.internal.measurement.C0424;
import com.google.android.gms.internal.measurement.C0471;
import com.google.android.gms.internal.measurement.C0475;
import com.google.android.gms.internal.measurement.C0501;
import com.google.android.gms.internal.measurement.C0508;
import com.google.android.gms.internal.measurement.C0542;
import com.google.android.gms.internal.measurement.C0584;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p456.InterfaceC5317;

/* renamed from: ᐧי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3582 implements InterfaceC5317 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f13772;

    public C3582(C0367 c0367) {
        this.f13772 = c0367;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ʿʼ */
    public final void mo4145(Bundle bundle) {
        C0367 c0367 = this.f13772;
        c0367.m2048(new C0508(c0367, bundle, 0));
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˉי */
    public final void mo4146(String str) {
        C0367 c0367 = this.f13772;
        c0367.m2048(new C0424(c0367, str, 0));
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˉⁱ */
    public final String mo4147() {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0542(c0367, binderC0519, 0));
        return (String) BinderC0519.m2379(binderC0519.m2380(500L), String.class);
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˋⁱ */
    public final void mo4148(String str, String str2, Bundle bundle) {
        C0367 c0367 = this.f13772;
        c0367.m2048(new C0475(c0367, str, str2, bundle, 1));
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˏʾ */
    public final Map mo4149(String str, String str2, boolean z) {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0584(c0367, str, str2, z, binderC0519));
        Bundle bundleM2380 = binderC0519.m2380(5000L);
        if (bundleM2380 == null || bundleM2380.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleM2380.size());
        for (String str3 : bundleM2380.keySet()) {
            Object obj = bundleM2380.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˏᵢ */
    public final List mo4150(String str, String str2) {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0501(c0367, str, str2, binderC0519));
        List list = (List) BinderC0519.m2379(binderC0519.m2380(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˑʽ */
    public final String mo4151() {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0542(c0367, binderC0519, 4));
        return (String) BinderC0519.m2379(binderC0519.m2380(500L), String.class);
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ـﹶ */
    public final long mo4152() {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0542(c0367, binderC0519, 1));
        Long l = (Long) BinderC0519.m2379(binderC0519.m2380(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNanoTime = System.nanoTime();
        c0367.f2615.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i = c0367.f2620 + 1;
        c0367.f2620 = i;
        return jNextLong + i;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ٴˎ */
    public final int mo4153(String str) {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0471(c0367, str, binderC0519, 1));
        Integer num = (Integer) BinderC0519.m2379(binderC0519.m2380(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ᐧʻ */
    public final void mo4154(String str) {
        C0367 c0367 = this.f13772;
        c0367.m2048(new C0424(c0367, str, 1));
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ᴵʿ */
    public final String mo4155() {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0542(c0367, binderC0519, 3));
        return (String) BinderC0519.m2379(binderC0519.m2380(500L), String.class);
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ﹳﹳ */
    public final void mo4156(String str, String str2, Bundle bundle) {
        C0367 c0367 = this.f13772;
        c0367.m2048(new C0475(c0367, str, str2, bundle, 0));
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ﹶˆ */
    public final String mo4157() {
        C0367 c0367 = this.f13772;
        BinderC0519 binderC0519 = new BinderC0519();
        c0367.m2048(new C0542(c0367, binderC0519, 2));
        return (String) BinderC0519.m2379(binderC0519.m2380(50L), String.class);
    }
}
