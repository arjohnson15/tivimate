package p406;

import android.net.NetworkRequest;

/* renamed from: ﹳʿ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4648 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4648 f17766 = new C4648();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final NetworkRequest m10551(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            builder.addCapability(i);
        }
        for (int i2 : iArr2) {
            builder.addTransportType(i2);
        }
        return builder.build();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4649 m10552(int[] iArr, int[] iArr2) {
        return new C4649(m10551(iArr, iArr2));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m10553(NetworkRequest networkRequest, int i) {
        return networkRequest.hasCapability(i);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m10554(NetworkRequest networkRequest, int i) {
        return networkRequest.hasTransport(i);
    }
}
