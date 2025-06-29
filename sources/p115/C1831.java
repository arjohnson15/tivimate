package p115;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0735;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Map;
import p065.AbstractC1524;
import p331.C3762;
import p375.AbstractC4315;
import p418.C4780;
import p418.C4792;
import p418.C4794;
import p418.C4801;
import p418.C4802;
import p418.C4816;
import p418.C4848;
import p418.EnumC4778;
import p418.EnumC4796;
import p418.EnumC4829;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˈʽ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1831 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1831 f7052;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1831 f7053;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1831 f7054;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f7055;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f7056;

    static {
        int i = 0;
        f7053 = new C1831(i, "ENABLED");
        f7054 = new C1831(i, "DISABLED");
        f7052 = new C1831(i, "DESTROYED");
    }

    public /* synthetic */ C1831(int i, Object obj) {
        this.f7056 = i;
        this.f7055 = obj;
    }

    public C1831(AbstractC1524 abstractC1524, Class cls) {
        this.f7056 = 2;
        if (((Map) abstractC1524.f6193).keySet().contains(cls) || Void.class.equals(cls)) {
            this.f7055 = abstractC1524;
            return;
        }
        throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1524.toString() + " does not support primitive class " + cls.getName());
    }

    public String toString() {
        switch (this.f7056) {
            case 0:
                return (String) this.f7055;
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public synchronized C4780 m5567(C4801 c4801, EnumC4778 enumC4778) {
        C4816 c4816M10716;
        int iM5573 = m5573();
        if (enumC4778 == EnumC4778.f18314) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        c4816M10716 = C4780.m10716();
        c4816M10716.m2948();
        C4780.m10713((C4780) c4816M10716.f3527, c4801);
        c4816M10716.m2948();
        C4780.m10714((C4780) c4816M10716.f3527, iM5573);
        c4816M10716.m2948();
        C4780.m10712((C4780) c4816M10716.f3527);
        c4816M10716.m2948();
        C4780.m10715((C4780) c4816M10716.f3527, enumC4778);
        return (C4780) c4816M10716.m2947();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public synchronized C4780 m5568(C4794 c4794) {
        return m5567(AbstractC1833.m5576(c4794), c4794.m10764());
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public synchronized void m5569(int i) {
        for (int i2 = 0; i2 < ((C4792) ((C4802) this.f7055).f3527).m10752(); i2++) {
            try {
                C4780 c4780M10750 = ((C4792) ((C4802) this.f7055).f3527).m10750(i2);
                if (c4780M10750.m10719() == i) {
                    if (!c4780M10750.m10718().equals(EnumC4829.f18342)) {
                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                    }
                    C4802 c4802 = (C4802) this.f7055;
                    c4802.m2948();
                    C4792.m10745((C4792) c4802.f3527, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public synchronized C3762 m5570() {
        return C3762.m8776((C4792) ((C4802) this.f7055).m2947());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public synchronized void m5571(C4794 c4794) {
        C4780 c4780M5568 = m5568(c4794);
        C4802 c4802 = (C4802) this.f7055;
        c4802.m2948();
        C4792.m10748((C4792) c4802.f3527, c4780M5568);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4801 m5572(AbstractC0748 abstractC0748) throws GeneralSecurityException {
        AbstractC1524 abstractC1524 = (AbstractC1524) this.f7055;
        try {
            ﹳﹳ r1 = abstractC1524.mo4114();
            AbstractC0758 abstractC0758 = r1.ⁱⁱ(abstractC0748);
            r1.ʽⁱ(abstractC0758);
            AbstractC0758 abstractC07582 = r1.ᵎـ(abstractC0758);
            C4848 c4848M10780 = C4801.m10780();
            String strMo4113 = abstractC1524.mo4113();
            c4848M10780.m2948();
            C4801.m10782((C4801) c4848M10780.f3527, strMo4113);
            try {
                int iMo3166 = ((AbstractC0785) abstractC07582).mo3166(null);
                byte[] bArr = new byte[iMo3166];
                C0735 c0735 = new C0735(iMo3166, bArr);
                abstractC07582.mo3167(c0735);
                if (c0735.f3550 - c0735.f3548 != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C0762 c0762 = new C0762(bArr);
                c4848M10780.m2948();
                C4801.m10784((C4801) c4848M10780.f3527, c0762);
                EnumC4796 enumC4796Mo4110 = abstractC1524.mo4110();
                c4848M10780.m2948();
                C4801.m10781((C4801) c4848M10780.f3527, enumC4796Mo4110);
                return (C4801) c4848M10780.m2947();
            } catch (IOException e) {
                throw new RuntimeException(abstractC07582.m3164("ByteString"), e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public synchronized int m5573() {
        int iM9803;
        iM9803 = AbstractC4315.m9803();
        while (m5574(iM9803)) {
            iM9803 = AbstractC4315.m9803();
        }
        return iM9803;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public synchronized boolean m5574(int i) {
        Iterator it = DesugarCollections.unmodifiableList(((C4792) ((C4802) this.f7055).f3527).m10749()).iterator();
        while (it.hasNext()) {
            if (((C4780) it.next()).m10719() == i) {
                return true;
            }
        }
        return false;
    }
}
