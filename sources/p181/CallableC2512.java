package p181;

import android.os.Bundle;
import android.os.Parcel;
import com.bumptech.glide.C0295;
import com.google.android.gms.internal.play_billing.AbstractC0591;
import com.google.android.gms.internal.play_billing.C0664;
import com.google.android.gms.internal.play_billing.InterfaceC0600;
import java.util.concurrent.Callable;

/* renamed from: ˋᵔ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2512 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f9989;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f9990;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ String f9991;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2503 f9992;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ String f9993;

    public /* synthetic */ CallableC2512(C2503 c2503, int i, String str, String str2, C0295 c0295, Bundle bundle) {
        this.f9992 = c2503;
        this.f9989 = i;
        this.f9991 = str;
        this.f9993 = str2;
        this.f9990 = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C2503 c2503 = this.f9992;
        int i = this.f9989;
        String str = this.f9991;
        String str2 = this.f9993;
        Bundle bundle = this.f9990;
        InterfaceC0600 interfaceC0600 = c2503.f9949;
        String packageName = c2503.f9935.getPackageName();
        C0664 c0664 = (C0664) interfaceC0600;
        Parcel parcelM2712 = c0664.m2712();
        parcelM2712.writeInt(i);
        parcelM2712.writeString(packageName);
        parcelM2712.writeString(str);
        parcelM2712.writeString(str2);
        parcelM2712.writeString(null);
        int i2 = AbstractC0591.f2956;
        parcelM2712.writeInt(1);
        bundle.writeToParcel(parcelM2712, 0);
        Parcel parcelM2713 = c0664.m2713(parcelM2712, 8);
        Bundle bundle2 = (Bundle) AbstractC0591.m2556(parcelM2713, Bundle.CREATOR);
        parcelM2713.recycle();
        return bundle2;
    }
}
