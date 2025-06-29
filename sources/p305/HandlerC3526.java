package p305;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.HandlerC0413;
import p195.AbstractC2709;

/* renamed from: ᐧˆ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerC3526 extends HandlerC0413 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3525 f13651;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f13652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3526(C3525 c3525, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f13651 = c3525;
        this.f13652 = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            String str = "Don't know how to handle this message: " + i;
            return;
        }
        int i2 = C3536.f13676;
        C3525 c3525 = this.f13651;
        Context context = this.f13652;
        int iM8426 = c3525.m8426(context, i2);
        int i3 = AbstractC3537.f13678;
        if (iM8426 == 1 || iM8426 == 2 || iM8426 == 3 || iM8426 == 9) {
            Intent intentM8427 = c3525.m8427(iM8426, context, "n");
            c3525.m8410(context, iM8426, intentM8427 == null ? null : PendingIntent.getActivity(context, 0, intentM8427, AbstractC2709.f10607 | 134217728));
        }
    }
}
