package p430;

import com.bumptech.glide.ˑʽ;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p158.AbstractC2339;
import p366.C4143;
import p366.InterfaceC4160;

/* renamed from: ﹶˏ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4998 extends AbstractC4996 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5002 f18912;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f18913;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f18914;

    static {
        Pattern pattern = C5002.f18947;
        f18912 = ˑʽ.ˋⁱ("application/x-www-form-urlencoded");
    }

    public C4998(ArrayList arrayList, ArrayList arrayList2) {
        this.f18914 = AbstractC2339.m6432(arrayList);
        this.f18913 = AbstractC2339.m6432(arrayList2);
    }

    @Override // p430.AbstractC4996
    public final long contentLength() {
        return m11087(null, true);
    }

    @Override // p430.AbstractC4996
    public final C5002 contentType() {
        return f18912;
    }

    @Override // p430.AbstractC4996
    public final void writeTo(InterfaceC4160 interfaceC4160) throws EOFException {
        m11087(interfaceC4160, false);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m11087(InterfaceC4160 interfaceC4160, boolean z) throws EOFException {
        C4143 c4143 = z ? new C4143() : interfaceC4160.mo9532();
        List list = this.f18914;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c4143.m9509(38);
            }
            c4143.m9496((String) list.get(i));
            c4143.m9509(61);
            c4143.m9496((String) this.f18913.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c4143.f16041;
        c4143.m9508();
        return j;
    }
}
