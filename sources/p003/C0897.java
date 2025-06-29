package p003;

import java.io.File;
import p314.C3598;
import p354.C4024;

/* renamed from: ʻʾ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0897 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0897 f4034 = new C0897(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4035;

    public /* synthetic */ C0897(int i) {
        this.f4035 = i;
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f4035) {
            case 0:
                return new C0910(new C4024(obj), new C0888(1, obj));
            case 1:
                File file = (File) obj;
                return new C0910(new C4024(file), new C0888(0, file));
            default:
                return null;
        }
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final boolean mo3706(Object obj) {
        switch (this.f4035) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
