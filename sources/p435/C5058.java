package p435;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import p169.AbstractC2458;
import p331.C3759;
import p366.C4165;

/* renamed from: ﹶᵔ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5058 extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String[] f19195;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Enum[] f19196;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f19197;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3759 f19198;

    public C5058(Class cls) throws NoSuchFieldException {
        this.f19197 = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f19196 = enumArr;
            this.f19195 = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.f19196;
                if (i >= enumArr2.length) {
                    this.f19198 = C3759.m8745(this.f19195);
                    return;
                }
                String strName = enumArr2[i].name();
                String[] strArr = this.f19195;
                Field field = cls.getField(strName);
                Set set = AbstractC2458.f9787;
                InterfaceC5065 interfaceC5065 = (InterfaceC5065) field.getAnnotation(InterfaceC5065.class);
                if (interfaceC5065 != null) {
                    String strName2 = interfaceC5065.name();
                    if (!"\u0000".equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i] = strName;
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f19197.getName() + ")";
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws EOFException, JsonEncodingException {
        int iM11205;
        C5053 c5053 = (C5053) abstractC5050;
        int iM11206 = c5053.f19182;
        if (iM11206 == 0) {
            iM11206 = c5053.m11206();
        }
        if (iM11206 < 8 || iM11206 > 11) {
            iM11205 = -1;
        } else {
            C3759 c3759 = this.f19198;
            if (iM11206 == 11) {
                iM11205 = c5053.m11205(c5053.f19180, c3759);
            } else {
                int iMo9510 = c5053.f19177.mo9510((C4165) c3759.f14523);
                if (iMo9510 != -1) {
                    c5053.f19182 = 0;
                    int[] iArr = c5053.f19164;
                    int i = c5053.f19165 - 1;
                    iArr[i] = iArr[i] + 1;
                    iM11205 = iMo9510;
                } else {
                    String strMo11196 = c5053.mo11196();
                    int iM112052 = c5053.m11205(strMo11196, c3759);
                    if (iM112052 == -1) {
                        c5053.f19182 = 11;
                        c5053.f19180 = strMo11196;
                        c5053.f19164[c5053.f19165 - 1] = r1[r0] - 1;
                    }
                    iM11205 = iM112052;
                }
            }
        }
        if (iM11205 != -1) {
            return this.f19196[iM11205];
        }
        String strM11186 = abstractC5050.m11186();
        throw new JsonDataException("Expected one of " + Arrays.asList(this.f19195) + " but was " + abstractC5050.mo11196() + " at path " + strM11186);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        abstractC5048.mo11181(this.f19195[((Enum) obj).ordinal()]);
    }
}
