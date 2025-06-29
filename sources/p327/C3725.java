package p327;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p003.C0910;
import p003.InterfaceC0913;
import p314.C3598;
import p354.C4024;
import ʼˉ.ٴˎ;

/* renamed from: ᴵᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3725 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC0913 f14453;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC0913 f14454;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f14455;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Class f14456;

    public C3725(Context context, InterfaceC0913 interfaceC0913, InterfaceC0913 interfaceC09132, Class cls) {
        this.f14455 = context.getApplicationContext();
        this.f14453 = interfaceC0913;
        this.f14454 = interfaceC09132;
        this.f14456 = cls;
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        Uri uri = (Uri) obj;
        return new C0910(new C4024(uri), new C3723(this.f14455, this.f14453, this.f14454, uri, i, i2, c3598, this.f14456));
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final boolean mo3706(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && ٴˎ.ᵎˏ((Uri) obj);
    }
}
