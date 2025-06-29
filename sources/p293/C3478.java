package p293;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import p251.AbstractC3132;
import p251.C3130;
import p251.C3131;
import p251.C3136;
import p305.C3542;
import p331.C3759;
import p331.C3761;
import ʻˋ.ˋˊ;

/* renamed from: ٴᵎ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3478 extends AbstractC3470 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˋˊ f13433;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3136 f13434;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3474 f13435;

    public C3478(ˋˊ r2, C3136 c3136, C3474 c3474) {
        super(2);
        this.f13434 = c3136;
        this.f13433 = r2;
        this.f13435 = c3474;
        if (r2.ˆʿ) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p293.AbstractC3470
    /* renamed from: ʽᐧ */
    public final C3542[] mo8331(C3469 c3469) {
        return (C3542[]) this.f13433.ˎˑ;
    }

    @Override // p293.AbstractC3470
    /* renamed from: ʿʼ */
    public final void mo8332(C3469 c3469) throws DeadObjectException {
        C3136 c3136 = this.f13434;
        try {
            this.f13433.ʿʼ(c3469.f13418, c3136);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo8333(AbstractC3470.m8330(e2));
        } catch (RuntimeException e3) {
            c3136.m7703(e3);
        }
    }

    @Override // p293.AbstractC3470
    /* renamed from: ˑʽ */
    public final void mo8333(Status status) {
        this.f13435.getClass();
        this.f13434.m7703(status.f2413 != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // p293.AbstractC3470
    /* renamed from: ـﹶ */
    public final boolean mo8334(C3469 c3469) {
        return this.f13433.ˆʿ;
    }

    @Override // p293.AbstractC3470
    /* renamed from: ٴˎ */
    public final void mo8335(C3759 c3759, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) c3759.f14523;
        C3136 c3136 = this.f13434;
        map.put(c3136, boolValueOf);
        C3761 c3761 = new C3761(12, c3759, c3136, false);
        C3130 c3130 = c3136.f12093;
        c3130.getClass();
        c3130.f12081.ᴵʿ(new C3131(AbstractC3132.f12092, c3761));
        c3130.m7687();
    }

    @Override // p293.AbstractC3470
    /* renamed from: ﹳﹳ */
    public final void mo8336(RuntimeException runtimeException) {
        this.f13434.m7703(runtimeException);
    }
}
