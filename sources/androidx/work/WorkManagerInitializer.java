package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p098.InterfaceC1770;
import p414.C4722;
import p457.C5357;
import p457.C5391;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC1770 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f1752 = C5391.m12164("WrkMgrInitializer");

    @Override // p098.InterfaceC1770
    /* renamed from: ʽᐧ */
    public final Object mo584(Context context) {
        C5391.m12163().m12168(f1752, "Initializing WorkManager with default configuration.");
        C4722.m10636(context, new C5357());
        return C4722.m10635(context);
    }

    @Override // p098.InterfaceC1770
    /* renamed from: ـﹶ */
    public final List mo586() {
        return Collections.emptyList();
    }
}
