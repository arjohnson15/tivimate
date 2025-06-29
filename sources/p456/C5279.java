package p456;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p091.C1753;
import p177.AbstractC2491;
import p417.C4749;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞⁱ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5279 extends AbstractC2491 implements Iterable {
    public static final Parcelable.Creator<C5279> CREATOR = new C4749(8);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Bundle f20460;

    public C5279(Bundle bundle) {
        this.f20460 = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1753(this);
    }

    public final String toString() {
        return this.f20460.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˉⁱ.ˑﾞ(parcel, 20293);
        ˉⁱ.ﹳﹶ(parcel, 2, m11851());
        ˉⁱ.ˑⁱ(parcel, i2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Bundle m11851() {
        return new Bundle(this.f20460);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String m11852() {
        return this.f20460.getString("currency");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Double m11853() {
        return Double.valueOf(this.f20460.getDouble("value"));
    }
}
