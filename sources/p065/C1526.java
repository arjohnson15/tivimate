package p065;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p072.InterfaceC1594;

/* renamed from: ʾᵔ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1526 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1500 f6199;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C1497 f6202;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Context f6203;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f6204;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f6205;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC1513 f6206;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC1594 f6207;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AtomicBoolean f6200 = new AtomicBoolean(true);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final BinderC1519 f6208 = new BinderC1519(this);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ServiceConnectionC1518 f6201 = new ServiceConnectionC1518(0, this);

    public C1526(Context context, String str, C1500 c1500) {
        this.f6204 = str;
        this.f6199 = c1500;
        this.f6203 = context.getApplicationContext();
        this.f6207 = ((AbstractC1484) c1500.f6097).m5043();
        this.f6202 = new C1497(this, (String[]) c1500.f6093);
    }
}
