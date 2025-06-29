package p021;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p200.C2741;
import p293.C3474;
import p417.AbstractC4753;
import p456.C5236;
import p456.C5241;
import p456.C5244;
import p456.C5247;
import p456.C5290;
import p456.C5297;
import p456.C5301;
import p456.C5316;
import p456.C5328;
import p456.RunnableC5347;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ˑˉ;

/* renamed from: ʼʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1130 extends AbstractC1132 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5244 f4759;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5236 f4760;

    public C1130(C5236 c5236) {
        AbstractC4753.m10683(c5236);
        this.f4760 = c5236;
        C5244 c5244 = c5236.f20106;
        C5236.m11646(c5244);
        this.f4759 = c5244;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo4145(Bundle bundle) {
        C5244 c5244 = this.f4759;
        ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20107.getClass();
        c5244.m11719(bundle, System.currentTimeMillis());
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo4146(String str) {
        C5236 c5236 = this.f4760;
        C5241 c5241M11651 = c5236.m11651();
        c5236.f20107.getClass();
        c5241M11651.m11690(str, SystemClock.elapsedRealtime());
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String mo4147() {
        return (String) this.f4759.f20164.get();
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo4148(String str, String str2, Bundle bundle) {
        C5244 c5244 = this.f4759;
        ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20107.getClass();
        c5244.m11710(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Map mo4149(String str, String str2, boolean z) {
        C5244 c5244 = this.f4759;
        if (c5244.ʽᐧ().m11741()) {
            c5244.ˏᵢ().f20571.m4533("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C3474.m8337()) {
            c5244.ˏᵢ().f20571.m4533("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        C5247 c5247 = ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20115;
        C5236.m11647(c5247);
        c5247.m11749(atomicReference, 5000L, "get user properties", new RunnableC5347(c5244, atomicReference, str, str2, z, 0));
        List<C5290> list = (List) atomicReference.get();
        if (list == null) {
            C5301 c5301 = c5244.ˏᵢ();
            c5301.f20571.m4531(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C2741 c2741 = new C2741(list.size());
        for (C5290 c5290 : list) {
            Object objM11869 = c5290.m11869();
            if (objM11869 != null) {
                c2741.put(c5290.f20532, objM11869);
            }
        }
        return c2741;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final List mo4150(String str, String str2) {
        C5244 c5244 = this.f4759;
        if (c5244.ʽᐧ().m11741()) {
            c5244.ˏᵢ().f20571.m4533("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C3474.m8337()) {
            c5244.ˏᵢ().f20571.m4533("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C5247 c5247 = ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20115;
        C5236.m11647(c5247);
        c5247.m11749(atomicReference, 5000L, "get conditional user properties", new ˑˉ(c5244, atomicReference, str, str2, 4));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C5316.m11932(list);
        }
        c5244.ˏᵢ().f20571.m4531(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String mo4151() {
        C5328 c5328 = ((C5236) ((ﹳﹳ) this.f4759).ᐧⁱ).f20121;
        C5236.m11646(c5328);
        C5297 c5297 = c5328.f20662;
        if (c5297 != null) {
            return c5297.f20551;
        }
        return null;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long mo4152() {
        C5316 c5316 = this.f4760.f20095;
        C5236.m11644(c5316);
        return c5316.m11962();
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo4153(String str) {
        AbstractC4753.m10688(str);
        return 25;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo4154(String str) {
        C5236 c5236 = this.f4760;
        C5241 c5241M11651 = c5236.m11651();
        c5236.f20107.getClass();
        c5241M11651.m11689(str, SystemClock.elapsedRealtime());
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final String mo4155() {
        C5328 c5328 = ((C5236) ((ﹳﹳ) this.f4759).ᐧⁱ).f20121;
        C5236.m11646(c5328);
        C5297 c5297 = c5328.f20662;
        if (c5297 != null) {
            return c5297.f20548;
        }
        return null;
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo4156(String str, String str2, Bundle bundle) {
        C5244 c5244 = this.f4760.f20106;
        C5236.m11646(c5244);
        c5244.m11708(str, str2, bundle);
    }

    @Override // p456.InterfaceC5317
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String mo4157() {
        return (String) this.f4759.f20164.get();
    }
}
