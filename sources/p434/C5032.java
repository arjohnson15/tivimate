package p434;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p457.C5368;
import p457.C5391;

/* renamed from: ﹶᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5032 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String f19102 = C5391.m12164("SystemJobInfoConverter");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5368 f19103;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f19104;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ComponentName f19105;

    public C5032(Context context, C5368 c5368, boolean z) {
        this.f19103 = c5368;
        this.f19105 = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f19104 = z;
    }
}
