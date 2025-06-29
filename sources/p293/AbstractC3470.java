package p293;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p305.C3542;
import p331.C3759;

/* renamed from: ٴᵎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3470 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f13429;

    public AbstractC3470(int i) {
        this.f13429 = i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Status m8330(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract C3542[] mo8331(C3469 c3469);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract void mo8332(C3469 c3469);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract void mo8333(Status status);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract boolean mo8334(C3469 c3469);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public abstract void mo8335(C3759 c3759, boolean z);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract void mo8336(RuntimeException runtimeException);
}
