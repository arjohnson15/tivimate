package p327;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import p003.C0914;
import p003.InterfaceC0889;
import p003.InterfaceC0913;

/* renamed from: ᴵᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3722 implements InterfaceC0889 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Class f14438;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f14439;

    public C3722(Context context, Class cls) {
        this.f14439 = context;
        this.f14438 = cls;
    }

    @Override // p003.InterfaceC0889
    /* renamed from: ـﹶ */
    public final InterfaceC0913 mo3711(C0914 c0914) {
        Class cls = this.f14438;
        return new C3725(this.f14439, c0914.m3733(File.class, cls), c0914.m3733(Uri.class, cls), cls);
    }
}
