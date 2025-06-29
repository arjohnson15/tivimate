package p435;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.Closeable;
import java.util.Arrays;
import p080.AbstractC1702;
import p331.C3759;

/* renamed from: ﹶᵔ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5050 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int[] f19162;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public String[] f19163;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int[] f19164;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f19165;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public abstract void mo11184();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract void mo11185();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String m11186() {
        return AbstractC5047.m11168(this.f19165, this.f19162, this.f19163, this.f19164);
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void m11187(String str) throws JsonEncodingException {
        StringBuilder sbM5409 = AbstractC1702.m5409(str, " at path ");
        sbM5409.append(m11186());
        throw new JsonEncodingException(sbM5409.toString());
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public abstract int mo11188();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m11189(int i) {
        int i2 = this.f19165;
        int[] iArr = this.f19162;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + m11186());
            }
            this.f19162 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f19163;
            this.f19163 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f19164;
            this.f19164 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f19162;
        int i3 = this.f19165;
        this.f19165 = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public abstract double mo11190();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract boolean mo11191();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract void mo11192();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract void mo11193();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public abstract int mo11194(C3759 c3759);

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public abstract void mo11195();

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public abstract String mo11196();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public abstract void mo11197();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract void mo11198();

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public abstract int mo11199();
}
