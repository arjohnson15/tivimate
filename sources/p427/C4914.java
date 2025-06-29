package p427;

import java.io.IOException;
import java.util.Locale;
import p034.InterfaceC1224;
import p262.InterfaceC3255;
import p317.AbstractC3616;

/* renamed from: ﹶˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4914 implements InterfaceC3255 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1224 f18587;

    public C4914(InterfaceC1224 interfaceC1224) {
        this.f18587 = interfaceC1224;
    }

    @Override // p262.InterfaceC3255
    public final void close() throws IOException {
        this.f18587.close();
    }

    @Override // p262.InterfaceC3255
    /* renamed from: ـﹶ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4916 mo6108(String str) {
        String upperCase;
        int iHashCode;
        String string = AbstractC3616.m8539(str).toString();
        int length = string.length();
        InterfaceC1224 interfaceC1224 = this.f18587;
        if (length < 3 || ((iHashCode = (upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT)).hashCode()) == 79487 ? !upperCase.equals("PRA") : iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
            return new C4915(interfaceC1224, str);
        }
        C4912 c4912 = new C4912(interfaceC1224, str);
        c4912.f18580 = new int[0];
        c4912.f18576 = new long[0];
        c4912.f18578 = new double[0];
        c4912.f18579 = new String[0];
        c4912.f18577 = new byte[0][];
        return c4912;
    }
}
