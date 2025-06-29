package j$.time;

import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.k("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.k("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.k("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.k("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.k("AST", "America/Anchorage"), j$.com.android.tools.r8.a.k("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.k("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.k("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.k("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.k("CST", "America/Chicago"), j$.com.android.tools.r8.a.k("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.k("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.k("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.k("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.k("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.k("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.k("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.k("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.k("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.k("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.k("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.k("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.k("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.k("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.k("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.k("EST", "-05:00"), j$.com.android.tools.r8.a.k("MST", "-07:00"), j$.com.android.tools.r8.a.k("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != y.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId S(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.A(j$.time.temporal.l.k());
        if (zoneId != null) {
            return zoneId;
        }
        throw new c("Unable to obtain ZoneId from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    static ZoneId U(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        return (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) ? ZoneOffset.b0(str) : (str.startsWith("UTC") || str.startsWith("GMT")) ? W(str, 3, z) : str.startsWith("UT") ? W(str, 2, z) : y.Y(str, z);
    }

    public static ZoneId V(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.a0() != 0) {
            str = str.concat(zoneOffset.m());
        }
        return new y(str, j$.time.zone.f.i(zoneOffset));
    }

    private static ZoneId W(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return V(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return y.Y(str, z);
        }
        try {
            ZoneOffset zoneOffsetB0 = ZoneOffset.b0(str.substring(i));
            return zoneOffsetB0 == ZoneOffset.UTC ? V(strSubstring, zoneOffsetB0) : V(strSubstring, zoneOffsetB0);
        } catch (c e) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId of(String str) {
        return U(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = a;
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id, "defaultObj");
        }
        return of((String) objRequireNonNull);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    public abstract j$.time.zone.f T();

    abstract void X(ObjectOutput objectOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return m().equals(((ZoneId) obj).m());
        }
        return false;
    }

    public int hashCode() {
        return m().hashCode();
    }

    public abstract String m();

    public String toString() {
        return m();
    }
}
