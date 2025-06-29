package p337;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.C0372;
import p166.C2397;

/* renamed from: ᵎˆ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3848 extends ContentObserver {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Uri f14862;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C0372 f14863;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ContentResolver f14864;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3848(C0372 c0372, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14863 = c0372;
        this.f14864 = contentResolver;
        this.f14862 = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C0372 c0372 = this.f14863;
        c0372.m2083(C3835.m8980((Context) c0372.f2629, (C2397) c0372.f2631, (C3818) c0372.f2638));
    }
}
