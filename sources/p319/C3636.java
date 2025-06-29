package p319;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.C0559;
import com.google.android.gms.internal.measurement.HandlerC0413;
import p062.AbstractC1443;
import p251.C3130;
import p251.C3136;
import p266.C3264;
import p293.C3463;
import p293.C3464;
import p293.C3474;
import p293.C3478;
import p293.C3479;
import p305.C3542;
import p349.C3997;
import p417.AbstractC4753;
import p417.C4752;
import p417.C4754;
import ʻˋ.ˋˊ;
import ˊﹶ.ˋˉ;
import ˏᵢ.ᵢٴ;

/* renamed from: ᴵʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3636 {

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C0559 f13883 = new C0559(new C3635(), new C3264(3));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f13884;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3463 f13885;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3464 f13886;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0559 f13887;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f13888;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f13889;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3474 f13890;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4754 f13891;

    public C3636(Context context, C0559 c0559, C3997 c3997) {
        C4754 c4754 = C4754.f18241;
        AbstractC4753.m10689(context, "Null context is not permitted.");
        AbstractC4753.m10689(c0559, "Api must not be null.");
        AbstractC4753.m10689(c3997, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC4753.m10689(applicationContext, "The provided context did not have an application context.");
        this.f13888 = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f13884 = attributionTag;
        this.f13887 = c0559;
        this.f13891 = c4754;
        this.f13885 = new C3463(c0559, attributionTag);
        C3464 c3464M8309 = C3464.m8309(applicationContext);
        this.f13886 = c3464M8309;
        this.f13889 = c3464M8309.f13403.getAndIncrement();
        this.f13890 = c3997.f15436;
        HandlerC0413 handlerC0413 = c3464M8309.f13406;
        handlerC0413.sendMessage(handlerC0413.obtainMessage(7, this));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3130 m8564(C4752 c4752) {
        ˋˉ r1 = new ˋˉ(17, false);
        C3542[] c3542Arr = {AbstractC1443.f5913};
        r1.ˆʿ = new ᵢٴ(10, c4752);
        ˋˊ r6 = new ˋˊ(r1, c3542Arr, false);
        C3136 c3136 = new C3136();
        C3464 c3464 = this.f13886;
        c3464.getClass();
        C3479 c3479 = new C3479(new C3478(r6, c3136, this.f13890), c3464.f13407.get(), this);
        HandlerC0413 handlerC0413 = c3464.f13406;
        handlerC0413.sendMessage(handlerC0413.obtainMessage(4, c3479));
        return c3136.f12093;
    }
}
