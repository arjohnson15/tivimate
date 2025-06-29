package p003;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p334.C3789;

/* renamed from: ʻʾ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0890 implements InterfaceC0889 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0890 f4018 = new C0890(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4019;

    public /* synthetic */ C0890(int i) {
        this.f4019 = i;
    }

    @Override // p003.InterfaceC0889
    /* renamed from: ـﹶ */
    public final InterfaceC0913 mo3711(C0914 c0914) {
        switch (this.f4019) {
            case 0:
                return C0897.f4034;
            case 1:
                return new C0915(0, new C0902(0));
            case 2:
                return new C0915(0, new C0902(1));
            case 3:
                return new C0897(1);
            case 4:
                return new ᐧⁱ(c0914.m3733(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new ᐧⁱ(c0914.m3733(Uri.class, ParcelFileDescriptor.class), 0);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ᐧⁱ(c0914.m3733(Uri.class, InputStream.class), 0);
            default:
                return new C0912(c0914.m3733(C0893.class, InputStream.class));
        }
    }
}
