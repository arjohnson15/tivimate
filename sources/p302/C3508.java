package p302;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p043.C1292;
import p103.C1787;
import p103.InterfaceC1788;
import p103.InterfaceC1789;
import p103.InterfaceC1792;
import p191.EnumC2648;

/* renamed from: ᐧʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3508 implements InterfaceC1792 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1787 f13603;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Charset f13604 = Charset.forName("UTF-8");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1787 f13605;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C1292 f13606;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f13607;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3512 f13608 = new C3512(this);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f13609;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public OutputStream f13610;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1292 f13611;

    static {
        C3510 c3510 = new C3510(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3513.class, c3510);
        f13605 = new C1787("key", DesugarCollections.unmodifiableMap(new HashMap(map)));
        C3510 c35102 = new C3510(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3513.class, c35102);
        f13603 = new C1787("value", DesugarCollections.unmodifiableMap(new HashMap(map2)));
        f13606 = new C1292(1);
    }

    public C3508(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C1292 c1292) {
        this.f13610 = byteArrayOutputStream;
        this.f13607 = map;
        this.f13609 = map2;
        this.f13611 = c1292;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m8386(C1787 c1787) {
        InterfaceC3513 interfaceC3513 = (InterfaceC3513) ((Annotation) c1787.f6930.get(InterfaceC3513.class));
        if (interfaceC3513 != null) {
            return ((C3510) interfaceC3513).f13614;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ʽᐧ */
    public final InterfaceC1792 mo4582(C1787 c1787, long j) throws IOException {
        if (j != 0) {
            InterfaceC3513 interfaceC3513 = (InterfaceC3513) ((Annotation) c1787.f6930.get(InterfaceC3513.class));
            if (interfaceC3513 == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            m8389(((C3510) interfaceC3513).f13614 << 3);
            m8388(j);
        }
        return this;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8387(C1787 c1787, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC3513 interfaceC3513 = (InterfaceC3513) ((Annotation) c1787.f6930.get(InterfaceC3513.class));
        if (interfaceC3513 == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m8389(((C3510) interfaceC3513).f13614 << 3);
        m8389(i);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m8388(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f13610.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f13610.write(((int) j) & 127);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m8389(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f13610.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f13610.write(i & 127);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8390(C1787 c1787, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m8389((m8386(c1787) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f13604);
            m8389(bytes.length);
            this.f13610.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m8390(c1787, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8392(f13606, c1787, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m8391(c1787, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m8389((m8386(c1787) << 3) | 5);
            this.f13610.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            InterfaceC3513 interfaceC3513 = (InterfaceC3513) ((Annotation) c1787.f6930.get(InterfaceC3513.class));
            if (interfaceC3513 == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            m8389(((C3510) interfaceC3513).f13614 << 3);
            m8388(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m8387(c1787, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m8389((m8386(c1787) << 3) | 2);
            m8389(bArr.length);
            this.f13610.write(bArr);
            return;
        }
        InterfaceC1789 interfaceC1789 = (InterfaceC1789) this.f13607.get(obj.getClass());
        if (interfaceC1789 != null) {
            m8392(interfaceC1789, c1787, obj, z);
            return;
        }
        InterfaceC1788 interfaceC1788 = (InterfaceC1788) this.f13609.get(obj.getClass());
        if (interfaceC1788 != null) {
            C3512 c3512 = this.f13608;
            c3512.f13618 = false;
            c3512.f13617 = c1787;
            c3512.f13616 = z;
            interfaceC1788.mo4581(obj, c3512);
            return;
        }
        if (obj instanceof EnumC2648) {
            m8387(c1787, ((EnumC2648) obj).f10517, true);
        } else if (obj instanceof Enum) {
            m8387(c1787, ((Enum) obj).ordinal(), true);
        } else {
            m8392(this.f13611, c1787, obj, z);
        }
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ˑʽ */
    public final InterfaceC1792 mo4586(C1787 c1787, int i) {
        m8387(c1787, i, true);
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ـﹶ */
    public final InterfaceC1792 mo4587(C1787 c1787, double d) throws IOException {
        m8391(c1787, d, true);
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ٴˎ */
    public final InterfaceC1792 mo4588(C1787 c1787, boolean z) {
        m8387(c1787, z ? 1 : 0, true);
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ᐧʻ */
    public final InterfaceC1792 mo4589(C1787 c1787, Object obj) {
        m8390(c1787, obj, true);
        return this;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8391(C1787 c1787, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m8389((m8386(c1787) << 3) | 1);
        this.f13610.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m8392(InterfaceC1789 interfaceC1789, C1787 c1787, Object obj, boolean z) throws IOException {
        C3507 c3507 = new C3507();
        c3507.f13602 = 0L;
        try {
            OutputStream outputStream = this.f13610;
            this.f13610 = c3507;
            try {
                interfaceC1789.mo4581(obj, this);
                this.f13610 = outputStream;
                long j = c3507.f13602;
                c3507.close();
                if (z && j == 0) {
                    return;
                }
                m8389((m8386(c1787) << 3) | 2);
                m8388(j);
                interfaceC1789.mo4581(obj, this);
            } catch (Throwable th) {
                this.f13610 = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c3507.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
