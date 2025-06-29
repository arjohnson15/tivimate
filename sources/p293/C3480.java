package p293;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p251.C3136;
import p305.C3542;
import p331.C3759;

/* renamed from: ٴᵎ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3480 extends AbstractC3470 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3136 f13439;

    public C3480(C3136 c3136) {
        super(4);
        this.f13439 = c3136;
    }

    @Override // p293.AbstractC3470
    /* renamed from: ʽᐧ */
    public final C3542[] mo8331(C3469 c3469) {
        if (c3469.f13428.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // p293.AbstractC3470
    /* renamed from: ʿʼ */
    public final void mo8332(C3469 c3469) throws DeadObjectException {
        try {
            m8356(c3469);
        } catch (DeadObjectException e) {
            mo8333(AbstractC3470.m8330(e));
            throw e;
        } catch (RemoteException e2) {
            mo8333(AbstractC3470.m8330(e2));
        } catch (RuntimeException e3) {
            this.f13439.m7703(e3);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8356(C3469 c3469) {
        if (c3469.f13428.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f13439.m7702(Boolean.FALSE);
    }

    @Override // p293.AbstractC3470
    /* renamed from: ˑʽ */
    public final void mo8333(Status status) {
        this.f13439.m7703(new ApiException(status));
    }

    @Override // p293.AbstractC3470
    /* renamed from: ـﹶ */
    public final boolean mo8334(C3469 c3469) {
        if (c3469.f13428.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // p293.AbstractC3470
    /* renamed from: ٴˎ */
    public final /* bridge */ /* synthetic */ void mo8335(C3759 c3759, boolean z) {
    }

    @Override // p293.AbstractC3470
    /* renamed from: ﹳﹳ */
    public final void mo8336(RuntimeException runtimeException) {
        this.f13439.m7703(runtimeException);
    }
}
