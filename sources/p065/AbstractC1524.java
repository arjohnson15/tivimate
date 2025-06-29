package p065;

import android.os.Build;
import androidx.lifecycle.C0248;
import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.spec.SecretKeySpec;
import p013.AbstractC1035;
import p013.AbstractC1041;
import p016.C1078;
import p016.C1083;
import p016.C1093;
import p064.C1459;
import p064.C1467;
import p064.C1469;
import p064.C1471;
import p064.C1472;
import p064.C1473;
import p064.InterfaceC1462;
import p090.C1743;
import p115.AbstractC1835;
import p115.InterfaceC1822;
import p161.C2351;
import p266.C3262;
import p267.C3273;
import p288.C3406;
import p317.AbstractC3616;
import p331.C3768;
import p334.C3789;
import p383.C4456;
import p418.C4782;
import p418.C4784;
import p418.C4789;
import p418.C4795;
import p418.C4804;
import p418.C4805;
import p418.C4809;
import p418.C4817;
import p418.C4826;
import p418.C4830;
import p418.C4840;
import p418.C4846;
import p418.EnumC4796;
import p418.EnumC4813;
import p457.AbstractC5388;
import p457.C5358;
import p457.C5363;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʾᵔ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1524 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f6193;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Serializable f6194;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f6195;

    public AbstractC1524(Class cls) {
        this.f6195 = UUID.randomUUID();
        this.f6193 = new C3768(((UUID) this.f6195).toString(), 0, cls.getName(), (String) null, (C5363) null, (C5363) null, 0L, 0L, 0L, (C5358) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1035.m3985(1));
        linkedHashSet.add(strArr[0]);
        this.f6194 = linkedHashSet;
    }

    public AbstractC1524(Class cls, C1083... c1083Arr) {
        this.f6195 = cls;
        HashMap map = new HashMap();
        for (C1083 c1083 : c1083Arr) {
            boolean zContainsKey = map.containsKey(c1083.f4654);
            Class cls2 = c1083.f4654;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
            map.put(cls2, c1083);
        }
        if (c1083Arr.length > 0) {
            this.f6194 = c1083Arr[0].f4654;
        } else {
            this.f6194 = Void.class;
        }
        this.f6193 = DesugarCollections.unmodifiableMap(map);
    }

    public AbstractC1524(AbstractC1484 abstractC1484) {
        this.f6195 = abstractC1484;
        this.f6193 = new AtomicBoolean(false);
        this.f6194 = new C3406(new C0248(3, this));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public AbstractC5388 m5104() {
        AbstractC5388 abstractC5388Mo5107 = mo5107();
        C5358 c5358 = ((C3768) this.f6193).f14565;
        int i = Build.VERSION.SDK_INT;
        boolean z = (i >= 24 && c5358.m12152()) || c5358.f20799 || c5358.f20801 || (i >= 23 && c5358.f20805);
        C3768 c3768 = (C3768) this.f6193;
        if (c3768.f14580) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c3768.f14577 > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (c3768.f14584 == null) {
            List listM8549 = AbstractC3616.m8549(c3768.f14573, new String[]{"."});
            String strM8524 = listM8549.size() == 1 ? (String) listM8549.get(0) : (String) AbstractC1041.m4034(listM8549);
            if (strM8524.length() > 127) {
                strM8524 = AbstractC3616.m8524(127, strM8524);
            }
            c3768.f14584 = strM8524;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f6195 = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        C3768 c37682 = (C3768) this.f6193;
        this.f6193 = new C3768(string, c37682.f14562, c37682.f14573, c37682.f14582, new C5363(c37682.f14563), new C5363(c37682.f14576), c37682.f14577, c37682.f14572, c37682.f14583, new C5358(c37682.f14565), c37682.f14570, c37682.f14566, c37682.f14568, c37682.f14578, c37682.f14571, c37682.f14574, c37682.f14580, c37682.f14569, c37682.f14579, c37682.f14564, c37682.f14567, c37682.f14585, c37682.f14584, 524288);
        return abstractC5388Mo5107;
    }

    /* renamed from: ʿʼ */
    public int mo4109() {
        return 1;
    }

    /* renamed from: ˉי */
    public abstract EnumC4796 mo4110();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m5105(C1743 c1743) {
        if (c1743 == ((C1743) ((C3406) this.f6194).getValue())) {
            ((AtomicBoolean) this.f6193).set(false);
        }
    }

    /* renamed from: ˋⁱ */
    public abstract void mo4111(AbstractC0758 abstractC0758);

    /* renamed from: ˏʾ */
    public abstract AbstractC0758 mo4112(AbstractC0748 abstractC0748);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract AbstractC1524 mo5106();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract AbstractC5388 mo5107();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C1743 m5108() {
        AbstractC1484 abstractC1484 = (AbstractC1484) this.f6195;
        abstractC1484.m5049();
        if (((AtomicBoolean) this.f6193).compareAndSet(false, true)) {
            return (C1743) ((C3406) this.f6194).getValue();
        }
        String strMo5110 = mo5110();
        abstractC1484.m5049();
        abstractC1484.m5041();
        return abstractC1484.m5044().mo4418().mo4383(strMo5110);
    }

    /* renamed from: ٴˎ */
    public abstract String mo4113();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object m5109(AbstractC0758 abstractC0758, Class cls) throws GeneralSecurityException {
        C1083 c1083 = (C1083) ((Map) this.f6193).get(cls);
        if (c1083 == null) {
            throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
        }
        switch (c1083.f4653) {
            case 0:
                C4809 c4809 = (C4809) abstractC0758;
                return new C1471((InterfaceC1462) new C1078(1).m5109(c4809.m10819(), InterfaceC1462.class), (InterfaceC1822) new C3273().m5109(c4809.m10817(), InterfaceC1822.class), c4809.m10817().m10807().m10874());
            case 1:
                C4795 c4795 = (C4795) abstractC0758;
                return new C1469(c4795.m10774().m10823(), c4795.m10773().m3130());
            case 2:
                C4804 c4804 = (C4804) abstractC0758;
                return new C1459(c4804.m10797().m10779(), c4804.m10799().m3130());
            case 3:
                return new C1467(0, ((C4846) abstractC0758).m10906().m3130());
            case 4:
                return new C2351(((C4826) abstractC0758).m10854().m3130());
            case 5:
                return new C1467(1, ((C4817) abstractC0758).m10834().m3130());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                String strM10811 = ((C4830) abstractC0758).m10868().m10811();
                return AbstractC1835.m5583(strM10811).m8499(strM10811);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C4840 c4840 = (C4840) abstractC0758;
                String strM10912 = c4840.m10880().m10912();
                return new C1093(c4840.m10880().m10914(), AbstractC1835.m5583(strM10912).m8499(strM10912));
            case 8:
                return new C1467(2, ((C4784) abstractC0758).m10734().m3130());
            case 9:
                C4782 c4782 = (C4782) abstractC0758;
                return new C1472(new C3262(c4782.m10729().m3130()), c4782.m10727().m10843());
            case 10:
                C4805 c4805 = (C4805) abstractC0758;
                EnumC4813 enumC4813M10875 = c4805.m10807().m10875();
                SecretKeySpec secretKeySpec = new SecretKeySpec(c4805.m10806().m3130(), "HMAC");
                int iM10874 = c4805.m10807().m10874();
                int iOrdinal = enumC4813M10875.ordinal();
                if (iOrdinal == 1) {
                    return new C1472(new C4456("HMACSHA1", secretKeySpec), iM10874);
                }
                if (iOrdinal == 2) {
                    return new C1472(new C4456("HMACSHA384", secretKeySpec), iM10874);
                }
                if (iOrdinal == 3) {
                    return new C1472(new C4456("HMACSHA256", secretKeySpec), iM10874);
                }
                if (iOrdinal == 4) {
                    return new C1472(new C4456("HMACSHA512", secretKeySpec), iM10874);
                }
                if (iOrdinal == 5) {
                    return new C1472(new C4456("HMACSHA224", secretKeySpec), iM10874);
                }
                throw new GeneralSecurityException("unknown hash");
            default:
                return new C1473(((C4789) abstractC0758).m10740().m3130());
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract String mo5110();

    /* renamed from: ﹶˆ */
    public abstract ﹳﹳ mo4114();
}
