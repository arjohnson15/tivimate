package p043;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p103.C1787;
import p103.InterfaceC1788;
import p103.InterfaceC1789;
import p103.InterfaceC1791;
import p103.InterfaceC1792;

/* renamed from: ʽי.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1290 implements InterfaceC1792, InterfaceC1791 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final JsonWriter f5300;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1292 f5301;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f5302;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f5303 = true;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f5304;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final HashMap f5305;

    public C1290(Writer writer, HashMap map, HashMap map2, C1292 c1292, boolean z) {
        this.f5300 = new JsonWriter(writer);
        this.f5302 = map;
        this.f5305 = map2;
        this.f5301 = c1292;
        this.f5304 = z;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC1792 mo4582(C1787 c1787, long j) throws IOException {
        String str = c1787.f6931;
        m4584();
        JsonWriter jsonWriter = this.f5300;
        jsonWriter.name(str);
        m4584();
        jsonWriter.value(j);
        return this;
    }

    @Override // p103.InterfaceC1791
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC1791 mo4583(boolean z) throws IOException {
        m4584();
        this.f5300.value(z);
        return this;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m4584() {
        if (!this.f5303) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C1290 m4585(Object obj) throws IOException {
        int i = 0;
        JsonWriter jsonWriter = this.f5300;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m4585(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m4591(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1789 interfaceC1789 = (InterfaceC1789) this.f5302.get(obj.getClass());
            if (interfaceC1789 != null) {
                jsonWriter.beginObject();
                interfaceC1789.mo4581(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1788 interfaceC1788 = (InterfaceC1788) this.f5305.get(obj.getClass());
            if (interfaceC1788 != null) {
                interfaceC1788.mo4581(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f5301.mo4581(obj, this);
                throw null;
            }
            if (obj instanceof InterfaceC1293) {
                int iMo4592 = ((InterfaceC1293) obj).mo4592();
                m4584();
                jsonWriter.value(iMo4592);
            } else {
                String strName = ((Enum) obj).name();
                m4584();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            m4584();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r8[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m4584();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m4585(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m4585(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC1792 mo4586(C1787 c1787, int i) throws IOException {
        String str = c1787.f6931;
        m4584();
        JsonWriter jsonWriter = this.f5300;
        jsonWriter.name(str);
        m4584();
        jsonWriter.value(i);
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1792 mo4587(C1787 c1787, double d) throws IOException {
        String str = c1787.f6931;
        m4584();
        JsonWriter jsonWriter = this.f5300;
        jsonWriter.name(str);
        m4584();
        jsonWriter.value(d);
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC1792 mo4588(C1787 c1787, boolean z) throws IOException {
        String str = c1787.f6931;
        m4584();
        JsonWriter jsonWriter = this.f5300;
        jsonWriter.name(str);
        m4584();
        jsonWriter.value(z);
        return this;
    }

    @Override // p103.InterfaceC1792
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC1792 mo4589(C1787 c1787, Object obj) throws IOException {
        m4591(obj, c1787.f6931);
        return this;
    }

    @Override // p103.InterfaceC1791
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC1791 mo4590(String str) throws IOException {
        m4584();
        this.f5300.value(str);
        return this;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1290 m4591(Object obj, String str) throws IOException {
        boolean z = this.f5304;
        JsonWriter jsonWriter = this.f5300;
        if (z) {
            if (obj != null) {
                m4584();
                jsonWriter.name(str);
                m4585(obj);
            }
            return this;
        }
        m4584();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            m4585(obj);
        }
        return this;
    }
}
