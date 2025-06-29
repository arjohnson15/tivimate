package p003;

import android.content.Context;
import android.net.Uri;
import p074.C1650;
import p188.C2619;
import p314.C3598;
import p354.C4024;
import ʼˉ.ٴˎ;

/* renamed from: ʻʾ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0903 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f4049;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4050;

    public C0903(Context context, int i) {
        this.f4050 = i;
        switch (i) {
            case 1:
                this.f4049 = context.getApplicationContext();
                break;
            case 2:
                this.f4049 = context.getApplicationContext();
                break;
            default:
                this.f4049 = context;
                break;
        }
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        Long l;
        switch (this.f4050) {
            case 0:
                Uri uri = (Uri) obj;
                return new C0910(new C4024(uri), new C0900(this.f4049, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C4024 c4024 = new C4024(uri2);
                Context context = this.f4049;
                return new C0910(c4024, C0906.m3725(context, uri2, new C1650(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c3598.m8502(C2619.f10403)) == null || l.longValue() != -1) {
                    return null;
                }
                C4024 c40242 = new C4024(uri3);
                Context context2 = this.f4049;
                return new C0910(c40242, C0906.m3725(context2, uri3, new C1650(context2.getContentResolver(), 1)));
        }
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final boolean mo3706(Object obj) {
        switch (this.f4050) {
            case 0:
                return ٴˎ.ᵎˏ((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return ٴˎ.ᵎˏ(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return ٴˎ.ᵎˏ(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
