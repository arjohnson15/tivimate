package p319;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p062.AbstractC1443;
import p293.C3469;
import p305.C3525;
import p305.C3542;
import p331.C3762;
import p349.InterfaceC4000;
import p396.C4554;
import p417.AbstractC4747;
import p417.AbstractC4753;
import p417.C4750;
import p417.C4754;
import ᵢ.ʿʼ;

/* renamed from: ᴵʽ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3638 extends AbstractC4747 implements InterfaceC4000 {

    /* renamed from: יʻ, reason: contains not printable characters */
    public final Set f13894;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final C4754 f13895;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3638(Context context, Looper looper, C3762 c3762, C4754 c4754, C3469 c3469, C3469 c34692) {
        C4750 c4750M10674 = C4750.m10674(context);
        C3525 c3525 = C3525.f13650;
        AbstractC4753.m10683(c3469);
        AbstractC4753.m10683(c34692);
        super(context, looper, c4750M10674, c3525, 270, new C4554(c3469), new ʿʼ(16, c34692), (String) c3762.f14531);
        Set set = (Set) c3762.f14530;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f13894 = set;
        this.f13895 = c4754;
    }

    @Override // p417.AbstractC4747
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final String mo8565() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p417.AbstractC4747
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C3542[] mo8566() {
        return AbstractC1443.f5912;
    }

    @Override // p349.InterfaceC4000
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Set mo8567() {
        return m10664() ? this.f13894 : Collections.emptySet();
    }

    @Override // p417.AbstractC4747
    /* renamed from: ˑי, reason: contains not printable characters */
    public final IInterface mo8568(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C3637 ? (C3637) iInterfaceQueryLocalInterface : new C3637(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // p417.AbstractC4747, p349.InterfaceC4000
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo8569() {
        return 203400000;
    }

    @Override // p417.AbstractC4747
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final Bundle mo8570() {
        this.f13895.getClass();
        return new Bundle();
    }

    @Override // p417.AbstractC4747
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final Account mo8571() {
        return null;
    }

    @Override // p417.AbstractC4747
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final Set mo8572() {
        return this.f13894;
    }

    @Override // p417.AbstractC4747
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean mo8573() {
        return true;
    }

    @Override // p417.AbstractC4747
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final String mo8574() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
}
