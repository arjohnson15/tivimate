package p003;

import java.io.File;
import p083.C1712;
import p314.C3598;
import p354.C4024;
import p430.C4999;

/* renamed from: ʻʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0915 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f4077;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4078;

    public /* synthetic */ C0915(int i, Object obj) {
        this.f4078 = i;
        this.f4077 = obj;
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f4078) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C0910(new C4024(bArr), new C0900(bArr, 1, (C0902) this.f4077));
            case 1:
                return new C0910(new C4024(obj), new C0906(0, obj.toString(), (C0902) this.f4077));
            case 2:
                File file = (File) obj;
                return new C0910(new C4024(file), new C0906(1, file, (C0902) this.f4077));
            default:
                C0893 c0893 = (C0893) obj;
                return new C0910(c0893, new C1712((C4999) this.f4077, c0893));
        }
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ */
    public final boolean mo3706(Object obj) {
        switch (this.f4078) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }
}
