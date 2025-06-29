package p003;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: ʻʾ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0892 implements InterfaceC0889 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Resources f4022;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4023;

    public /* synthetic */ C0892(Resources resources, int i) {
        this.f4023 = i;
        this.f4022 = resources;
    }

    @Override // p003.InterfaceC0889
    /* renamed from: ـﹶ */
    public final InterfaceC0913 mo3711(C0914 c0914) {
        switch (this.f4023) {
            case 0:
                return new C0887(this.f4022, c0914.m3733(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C0887(this.f4022, c0914.m3733(Uri.class, InputStream.class));
            default:
                return new C0887(this.f4022, C0897.f4034);
        }
    }
}
