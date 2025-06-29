package p070;

import java.io.Serializable;
import ˆʽ.ᵎˏ;

/* renamed from: ʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1557 implements InterfaceC1559, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Class f6295;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f6296 = false;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f6297;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f6298;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f6299;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f6300;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f6301;

    public AbstractC1557(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f6299 = obj;
        this.f6295 = cls;
        this.f6297 = str;
        this.f6298 = str2;
        this.f6300 = i;
        this.f6301 = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1557)) {
            return false;
        }
        AbstractC1557 abstractC1557 = (AbstractC1557) obj;
        return this.f6296 == abstractC1557.f6296 && this.f6300 == abstractC1557.f6300 && this.f6301 == abstractC1557.f6301 && this.f6299.equals(abstractC1557.f6299) && this.f6295.equals(abstractC1557.f6295) && this.f6297.equals(abstractC1557.f6297) && this.f6298.equals(abstractC1557.f6298);
    }

    public final int hashCode() {
        return ((((ᵎˏ.ˏʾ(ᵎˏ.ˏʾ((this.f6295.hashCode() + (this.f6299.hashCode() * 31)) * 31, 31, this.f6297), 31, this.f6298) + (this.f6296 ? 1231 : 1237)) * 31) + this.f6300) * 31) + this.f6301;
    }

    public final String toString() {
        AbstractC1563.f6304.getClass();
        return C1546.m5136(this);
    }

    @Override // p070.InterfaceC1559
    /* renamed from: ˑʽ */
    public final int mo5137() {
        return this.f6300;
    }
}
