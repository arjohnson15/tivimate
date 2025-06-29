package com.google.android.gms.internal.measurement;

import com.bumptech.glide.C0295;

/* renamed from: com.google.android.gms.internal.measurement.ʽﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0324 implements InterfaceC0480 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0395 f2441;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C0395 f2442;

    static {
        C0295 c0295 = new C0295(AbstractC0546.m2451("com.google.android.gms.measurement"), "", "", true, true);
        c0295.m1611("measurement.client.sessions.background_sessions_enabled", true);
        f2442 = c0295.m1611("measurement.client.sessions.enable_fix_background_engagement", false);
        c0295.m1611("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f2441 = c0295.m1611("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c0295.m1611("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c0295.m1611("measurement.client.sessions.session_id_enabled", true);
        c0295.m1609("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }
}
