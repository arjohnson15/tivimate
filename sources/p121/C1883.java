package p121;

import java.util.Arrays;

/* renamed from: ˈˑ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1883 extends AbstractC1890 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f7176;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f7177;

    public C1883(byte[] bArr, byte[] bArr2) {
        this.f7177 = bArr;
        this.f7176 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1890)) {
            return false;
        }
        AbstractC1890 abstractC1890 = (AbstractC1890) obj;
        boolean z = abstractC1890 instanceof C1883;
        if (Arrays.equals(this.f7177, z ? ((C1883) abstractC1890).f7177 : ((C1883) abstractC1890).f7177)) {
            if (Arrays.equals(this.f7176, z ? ((C1883) abstractC1890).f7176 : ((C1883) abstractC1890).f7176)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f7177) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7176);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f7177) + ", encryptedBlob=" + Arrays.toString(this.f7176) + "}";
    }
}
