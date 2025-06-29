package p435;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.math.BigDecimal;
import p317.AbstractC3625;
import p334.C3789;
import p366.C4143;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶᵔ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5042 extends AbstractC5044 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f19136;

    public /* synthetic */ C5042(int i) {
        this.f19136 = i;
    }

    public final String toString() {
        switch (this.f19136) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "JsonAdapter(Integer)";
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws NumberFormatException, EOFException, JsonEncodingException {
        long jLongValueExact;
        switch (this.f19136) {
            case 0:
                return abstractC5050.mo11196();
            case 1:
                C5053 c5053 = (C5053) abstractC5050;
                int iM11206 = c5053.f19182;
                if (iM11206 == 0) {
                    iM11206 = c5053.m11206();
                }
                boolean z = false;
                if (iM11206 == 5) {
                    c5053.f19182 = 0;
                    int[] iArr = c5053.f19164;
                    int i = c5053.f19165 - 1;
                    iArr[i] = iArr[i] + 1;
                    z = true;
                } else {
                    if (iM11206 != 6) {
                        throw new JsonDataException("Expected a boolean but was " + ᐧʻ.ˈٴ(c5053.mo11199()) + " at path " + c5053.m11186());
                    }
                    c5053.f19182 = 0;
                    int[] iArr2 = c5053.f19164;
                    int i2 = c5053.f19165 - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) AbstractC5047.m11167(abstractC5050, "a byte", -128, 255));
            case 3:
                String strMo11196 = abstractC5050.mo11196();
                if (strMo11196.length() <= 1) {
                    return Character.valueOf(strMo11196.charAt(0));
                }
                throw new JsonDataException("Expected a char but was " + ("\"" + strMo11196 + '\"') + " at path " + abstractC5050.m11186());
            case 4:
                return Double.valueOf(abstractC5050.mo11190());
            case 5:
                float fMo11190 = (float) abstractC5050.mo11190();
                if (!Float.isInfinite(fMo11190)) {
                    return Float.valueOf(fMo11190);
                }
                throw new JsonDataException("JSON forbids NaN and infinities: " + fMo11190 + " at path " + abstractC5050.m11186());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(abstractC5050.mo11188());
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C5053 c50532 = (C5053) abstractC5050;
                int iM112062 = c50532.f19182;
                if (iM112062 == 0) {
                    iM112062 = c50532.m11206();
                }
                if (iM112062 == 16) {
                    c50532.f19182 = 0;
                    int[] iArr3 = c50532.f19164;
                    int i3 = c50532.f19165 - 1;
                    iArr3[i3] = iArr3[i3] + 1;
                    jLongValueExact = c50532.f19178;
                } else {
                    if (iM112062 == 17) {
                        long j = c50532.f19179;
                        C4143 c4143 = c50532.f19181;
                        c4143.getClass();
                        c50532.f19180 = c4143.m9495(j, AbstractC3625.f13869);
                    } else if (iM112062 == 9 || iM112062 == 8) {
                        String strM11204 = iM112062 == 9 ? c50532.m11204(C5053.f19172) : c50532.m11204(C5053.f19176);
                        c50532.f19180 = strM11204;
                        try {
                            jLongValueExact = Long.parseLong(strM11204);
                            c50532.f19182 = 0;
                            int[] iArr4 = c50532.f19164;
                            int i4 = c50532.f19165 - 1;
                            iArr4[i4] = iArr4[i4] + 1;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (iM112062 != 11) {
                        throw new JsonDataException("Expected a long but was " + ᐧʻ.ˈٴ(c50532.mo11199()) + " at path " + c50532.m11186());
                    }
                    c50532.f19182 = 11;
                    try {
                        jLongValueExact = new BigDecimal(c50532.f19180).longValueExact();
                        c50532.f19180 = null;
                        c50532.f19182 = 0;
                        int[] iArr5 = c50532.f19164;
                        int i5 = c50532.f19165 - 1;
                        iArr5[i5] = iArr5[i5] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new JsonDataException("Expected a long but was " + c50532.f19180 + " at path " + c50532.m11186());
                    }
                }
                return Long.valueOf(jLongValueExact);
            default:
                return Short.valueOf((short) AbstractC5047.m11167(abstractC5050, "a short", -32768, 32767));
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        switch (this.f19136) {
            case 0:
                abstractC5048.mo11181((String) obj);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C5061 c5061 = (C5061) abstractC5048;
                if (c5061.f19157) {
                    throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c5061.m11182());
                }
                c5061.m11219();
                c5061.m11222();
                c5061.f19206.mo9525(zBooleanValue ? "true" : "false");
                int[] iArr = c5061.f19159;
                int i = c5061.f19160 - 1;
                iArr[i] = iArr[i] + 1;
                return;
            case 2:
                abstractC5048.mo11175(((Byte) obj).intValue() & 255);
                return;
            case 3:
                abstractC5048.mo11181(((Character) obj).toString());
                return;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                C5061 c50612 = (C5061) abstractC5048;
                c50612.getClass();
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
                if (c50612.f19157) {
                    c50612.f19157 = false;
                    c50612.mo11174(Double.toString(dDoubleValue));
                    return;
                }
                c50612.m11219();
                c50612.m11222();
                c50612.f19206.mo9525(Double.toString(dDoubleValue));
                int[] iArr2 = c50612.f19159;
                int i2 = c50612.f19160 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                abstractC5048.mo11180(f);
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                abstractC5048.mo11175(((Integer) obj).intValue());
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                abstractC5048.mo11175(((Long) obj).longValue());
                return;
            default:
                abstractC5048.mo11175(((Short) obj).intValue());
                return;
        }
    }
}
