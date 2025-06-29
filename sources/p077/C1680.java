package p077;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC0083;
import androidx.datastore.preferences.protobuf.C0040;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p080.AbstractC1702;
import p164.C2372;
import p334.C3782;
import p334.C3783;
import p334.C3784;
import p334.C3786;
import p334.C3787;
import p334.C3789;

/* renamed from: ʿˊ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1680 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1680 f6534 = new C1680();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5365(Object obj, C2372 c2372) throws IOException {
        AbstractC0083 abstractC0083M280;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C1672) obj).f6523);
        C3784 c3784M8862 = C3782.m8862();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C1673 c1673 = (C1673) entry.getKey();
            Object value = entry.getValue();
            String str = c1673.f6524;
            if (value instanceof Boolean) {
                C3783 c3783M8874 = C3789.m8874();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c3783M8874.m281();
                C3789.m8871((C3789) c3783M8874.f364, zBooleanValue);
                abstractC0083M280 = c3783M8874.m280();
            } else if (value instanceof Float) {
                C3783 c3783M88742 = C3789.m8874();
                float fFloatValue = ((Number) value).floatValue();
                c3783M88742.m281();
                C3789.m8875((C3789) c3783M88742.f364, fFloatValue);
                abstractC0083M280 = c3783M88742.m280();
            } else if (value instanceof Double) {
                C3783 c3783M88743 = C3789.m8874();
                double dDoubleValue = ((Number) value).doubleValue();
                c3783M88743.m281();
                C3789.m8870((C3789) c3783M88743.f364, dDoubleValue);
                abstractC0083M280 = c3783M88743.m280();
            } else if (value instanceof Integer) {
                C3783 c3783M88744 = C3789.m8874();
                int iIntValue = ((Number) value).intValue();
                c3783M88744.m281();
                C3789.m8873((C3789) c3783M88744.f364, iIntValue);
                abstractC0083M280 = c3783M88744.m280();
            } else if (value instanceof Long) {
                C3783 c3783M88745 = C3789.m8874();
                long jLongValue = ((Number) value).longValue();
                c3783M88745.m281();
                C3789.m8877((C3789) c3783M88745.f364, jLongValue);
                abstractC0083M280 = c3783M88745.m280();
            } else if (value instanceof String) {
                C3783 c3783M88746 = C3789.m8874();
                c3783M88746.m281();
                C3789.m8869((C3789) c3783M88746.f364, (String) value);
                abstractC0083M280 = c3783M88746.m280();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(AbstractC1549.m5144(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                C3783 c3783M88747 = C3789.m8874();
                C3786 c3786M8866 = C3787.m8866();
                c3786M8866.m281();
                C3787.m8867((C3787) c3786M8866.f364, (Set) value);
                c3783M88747.m281();
                C3789.m8872((C3789) c3783M88747.f364, c3786M8866);
                abstractC0083M280 = c3783M88747.m280();
            }
            c3784M8862.getClass();
            c3784M8862.m281();
            C3782.m8863((C3782) c3784M8862.f364).put(str, (C3789) abstractC0083M280);
        }
        C3782 c3782 = (C3782) c3784M8862.m280();
        int iMo481 = c3782.mo481();
        Logger logger = C0040.f433;
        if (iMo481 > 4096) {
            iMo481 = 4096;
        }
        C0040 c0040 = new C0040(c2372, iMo481);
        c3782.mo480(c0040);
        if (c0040.f437 > 0) {
            c0040.m433();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1672 m5366(FileInputStream fileInputStream) throws CorruptionException {
        try {
            C3782 c3782M8861 = C3782.m8861(fileInputStream);
            C1672 c1672 = new C1672(false);
            AbstractC1677[] abstractC1677Arr = (AbstractC1677[]) Arrays.copyOf(new AbstractC1677[0], 0);
            if (c1672.f6522.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (abstractC1677Arr.length > 0) {
                AbstractC1677 abstractC1677 = abstractC1677Arr[0];
                throw null;
            }
            for (Map.Entry entry : c3782M8861.m8864().entrySet()) {
                String str = (String) entry.getKey();
                C3789 c3789 = (C3789) entry.getValue();
                int iM8884 = c3789.m8884();
                switch (iM8884 == 0 ? -1 : AbstractC1674.f6525[AbstractC1702.m5411(iM8884)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        c1672.m5362(new C1673(str), Boolean.valueOf(c3789.m8881()));
                        break;
                    case 2:
                        c1672.m5362(new C1673(str), Float.valueOf(c3789.m8882()));
                        break;
                    case 3:
                        c1672.m5362(new C1673(str), Double.valueOf(c3789.m8880()));
                        break;
                    case 4:
                        c1672.m5362(new C1673(str), Integer.valueOf(c3789.m8883()));
                        break;
                    case 5:
                        c1672.m5362(new C1673(str), Long.valueOf(c3789.m8878()));
                        break;
                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                        c1672.m5362(new C1673(str), c3789.m8879());
                        break;
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        c1672.m5362(new C1673(str), AbstractC1041.m4029(c3789.m8885().m8868()));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new C1672(new LinkedHashMap(DesugarCollections.unmodifiableMap(c1672.f6523)), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }
}
