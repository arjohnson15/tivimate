package p375;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p005.C0934;
import p115.AbstractC1820;
import p418.EnumC4796;
import ᴵﹳ.ﹶˆ;

/* renamed from: ᵢˏ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4317 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4317 f16771 = new C4317();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicReference f16772 = new AtomicReference(new C4313(new ﹶˆ(12)));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m9804(C4309 c4309) {
        ﹶˆ r0 = new ﹶˆ((C4313) this.f16772.get());
        r0.ˋˉ(c4309);
        this.f16772.set(new C4313(r0));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m9805(C4304 c4304) {
        ﹶˆ r0 = new ﹶˆ((C4313) this.f16772.get());
        r0.ʾʼ(c4304);
        this.f16772.set(new C4313(r0));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m9806(C4307 c4307) {
        ﹶˆ r0 = new ﹶˆ((C4313) this.f16772.get());
        r0.ـˆ(c4307);
        this.f16772.set(new C4313(r0));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC1820 m9807(C4305 c4305) {
        AtomicReference atomicReference = this.f16772;
        C4313 c4313 = (C4313) atomicReference.get();
        c4313.getClass();
        C0934 c0934 = (C0934) c4305.f16745;
        if (!c4313.f16762.containsKey(new C4314(C4305.class, c0934))) {
            try {
                C4299 c4299 = new C4299();
                ((EnumC4796) c4305.f16750).ordinal();
                return c4299;
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e);
            }
        }
        C4313 c43132 = (C4313) atomicReference.get();
        c43132.getClass();
        C4314 c4314 = new C4314(C4305.class, c0934);
        HashMap map = c43132.f16762;
        if (map.containsKey(c4314)) {
            return ((C4309) map.get(c4314)).f16755.mo4102(c4305);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c4314 + " available");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized void m9808(C4300 c4300) {
        ﹶˆ r0 = new ﹶˆ((C4313) this.f16772.get());
        r0.ﾞᐧ(c4300);
        this.f16772.set(new C4313(r0));
    }
}
