package p065;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: ʾᵔ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RemoteCallbackListC1492 extends RemoteCallbackList {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ MultiInstanceInvalidationService f6075;

    public RemoteCallbackListC1492(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f6075 = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.f6075.f1745.remove((Integer) obj);
    }
}
