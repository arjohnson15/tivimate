package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p334.C3789;

/* renamed from: androidx.datastore.preferences.protobuf.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0066 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final /* synthetic */ int f487 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f488;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0034 f489 = new C0034(16);

    static {
        new C0066(0);
    }

    public C0066() {
    }

    public C0066(int i) {
        m501();
        m501();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m500(C0040 c0040, EnumC0059 enumC0059, int i, Object obj) throws IOException {
        if (enumC0059 == EnumC0059.f474) {
            c0040.m411(i, 3);
            ((AbstractC0052) obj).mo480(c0040);
            c0040.m411(i, 4);
            return;
        }
        c0040.m411(i, enumC0059.f476);
        switch (enumC0059.ordinal()) {
            case 0:
                c0040.m413(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0040.m418(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0040.m426(((Long) obj).longValue());
                break;
            case 3:
                c0040.m426(((Long) obj).longValue());
                break;
            case 4:
                c0040.m434(((Integer) obj).intValue());
                break;
            case 5:
                c0040.m413(((Long) obj).longValue());
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                c0040.m418(((Integer) obj).intValue());
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                c0040.m432(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0056)) {
                    c0040.m424((String) obj);
                    break;
                } else {
                    c0040.m435((C0056) obj);
                    break;
                }
            case 9:
                ((AbstractC0052) obj).mo480(c0040);
                break;
            case 10:
                AbstractC0052 abstractC0052 = (AbstractC0052) obj;
                c0040.getClass();
                c0040.m412(abstractC0052.mo481());
                abstractC0052.mo480(c0040);
                break;
            case 11:
                if (!(obj instanceof C0056)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0040.m412(length);
                    c0040.m410(bArr, 0, length);
                    break;
                } else {
                    c0040.m435((C0056) obj);
                    break;
                }
            case 12:
                c0040.m412(((Integer) obj).intValue());
                break;
            case 13:
                c0040.m434(((Integer) obj).intValue());
                break;
            case 14:
                c0040.m418(((Integer) obj).intValue());
                break;
            case 15:
                c0040.m413(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0040.m412((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0040.m426((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final Object clone() {
        C0066 c0066 = new C0066();
        C0034 c0034 = this.f489;
        if (c0034.f404.size() > 0) {
            Map.Entry entryM349 = c0034.m349(0);
            if (entryM349.getKey() != null) {
                throw new ClassCastException();
            }
            entryM349.getValue();
            throw null;
        }
        Iterator it = c0034.m347().iterator();
        if (!it.hasNext()) {
            return c0066;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0066) {
            return this.f489.equals(((C0066) obj).f489);
        }
        return false;
    }

    public final int hashCode() {
        return this.f489.hashCode();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m501() {
        if (this.f488) {
            return;
        }
        C0034 c0034 = this.f489;
        if (!c0034.f407) {
            if (c0034.f404.size() > 0) {
                c0034.m349(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0034.m347().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0034.f407) {
            c0034.f406 = c0034.f406.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c0034.f406);
            c0034.f409 = c0034.f409.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c0034.f409);
            c0034.f407 = true;
        }
        this.f488 = true;
    }
}
