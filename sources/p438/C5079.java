package p438;

import android.content.Context;
import java.util.HashMap;
import p036.C1237;
import p036.C1255;
import p076.C1660;
import p076.C1665;
import p254.C3161;
import p345.C3932;
import p353.InterfaceC4012;
import p374.C4279;
import p383.C4460;

/* renamed from: ﹶﾞ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C5079 implements InterfaceC4012 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Context f19303;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19304;

    public /* synthetic */ C5079(Context context, int i) {
        this.f19304 = i;
        this.f19303 = context;
    }

    @Override // p353.InterfaceC4012
    public final Object get() {
        C1660 c1660;
        switch (this.f19304) {
            case 0:
                return new C4279(this.f19303, new C3161());
            case 1:
                return new C1255(this.f19303, new C1237(10000, 0.75f));
            default:
                Context context = this.f19303;
                C3932 c3932 = C1660.f6478;
                synchronized (C1660.class) {
                    try {
                        if (C1660.f6481 == null) {
                            C1665 c1665 = new C1665(context);
                            C1660.f6481 = new C1660((Context) c1665.f6503, (HashMap) c1665.f6504, c1665.f6501, (C4460) c1665.f6502, c1665.f6505);
                        }
                        c1660 = C1660.f6481;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1660;
        }
    }
}
