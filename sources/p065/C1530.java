package p065;

import android.content.Context;
import android.content.Intent;
import p070.AbstractC1549;
import ˆʽ.ᵎˏ;

/* renamed from: ʾᵔ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1530 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f6219;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Intent f6220;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f6221;

    public C1530(Context context, String str, Intent intent) {
        this.f6221 = context;
        this.f6219 = str;
        this.f6220 = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1530)) {
            return false;
        }
        C1530 c1530 = (C1530) obj;
        return AbstractC1549.m5138(this.f6221, c1530.f6221) && AbstractC1549.m5138(this.f6219, c1530.f6219) && AbstractC1549.m5138(this.f6220, c1530.f6220);
    }

    public final int hashCode() {
        return this.f6220.hashCode() + ᵎˏ.ˏʾ(this.f6221.hashCode() * 31, 31, this.f6219);
    }

    public final String toString() {
        return "MultiInstanceClientInitState(context=" + this.f6221 + ", name=" + this.f6219 + ", serviceIntent=" + this.f6220 + ')';
    }
}
