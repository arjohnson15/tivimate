package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p065.BinderC1482;
import p065.RemoteCallbackListC1492;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final LinkedHashMap f1745 = new LinkedHashMap();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final RemoteCallbackListC1492 f1746 = new RemoteCallbackListC1492(this);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final BinderC1482 f1747 = new BinderC1482(this);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f1748;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1747;
    }
}
