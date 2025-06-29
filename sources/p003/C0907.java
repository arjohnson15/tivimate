package p003;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import p334.C3789;

/* renamed from: ʻʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0907 implements InterfaceC0889 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f4060;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4061;

    public /* synthetic */ C0907(Context context, int i) {
        this.f4061 = i;
        this.f4060 = context;
    }

    @Override // p003.InterfaceC0889
    /* renamed from: ـﹶ */
    public final InterfaceC0913 mo3711(C0914 c0914) {
        switch (this.f4061) {
            case 0:
                return new C0887(this.f4060, this);
            case 1:
                return new C0887(this.f4060, this);
            case 2:
                return new C0887(this.f4060, this);
            case 3:
                return new C0903(this.f4060, 0);
            case 4:
                return new C0887(this.f4060, c0914.m3733(Integer.class, AssetFileDescriptor.class));
            case 5:
                return new C0887(this.f4060, c0914.m3733(Integer.class, InputStream.class));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0903(this.f4060, 1);
            default:
                return new C0903(this.f4060, 2);
        }
    }
}
