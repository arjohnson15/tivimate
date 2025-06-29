package j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5409e implements InterfaceC5410f {
    private final InterfaceC5410f[] a;
    private final boolean b;

    C5409e(ArrayList arrayList, boolean z) {
        this((InterfaceC5410f[]) arrayList.toArray(new InterfaceC5410f[arrayList.size()]), z);
    }

    C5409e(InterfaceC5410f[] interfaceC5410fArr, boolean z) {
        this.a = interfaceC5410fArr;
        this.b = z;
    }

    public final C5409e a() {
        return !this.b ? this : new C5409e(this.a, false);
    }

    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            zVar.g();
        }
        try {
            for (InterfaceC5410f interfaceC5410f : this.a) {
                if (!interfaceC5410f.n(zVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                zVar.a();
            }
            return true;
        } finally {
            if (z) {
                zVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC5410f[] interfaceC5410fArr = this.a;
        if (!z) {
            for (InterfaceC5410f interfaceC5410f : interfaceC5410fArr) {
                i = interfaceC5410f.p(wVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }
        wVar.r();
        int iP = i;
        for (InterfaceC5410f interfaceC5410f2 : interfaceC5410fArr) {
            iP = interfaceC5410f2.p(wVar, charSequence, iP);
            if (iP < 0) {
                wVar.f(false);
                return i;
            }
        }
        wVar.f(true);
        return iP;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC5410f[] interfaceC5410fArr = this.a;
        if (interfaceC5410fArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (InterfaceC5410f interfaceC5410f : interfaceC5410fArr) {
                sb.append(interfaceC5410f);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
