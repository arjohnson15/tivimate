package p457;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;
import p013.C1038;
import p070.AbstractC1549;
import p080.AbstractC1702;
import p406.C4649;
import p447.AbstractC5179;

/* renamed from: ﾞﹶ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5358 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C5358 f20797 = new C5358();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4649 f20798;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f20799;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f20800;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f20801;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f20802;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f20803;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f20804;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f20805;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Set f20806;

    public C5358() {
        C1038 c1038 = C1038.f4437;
        this.f20798 = new C4649(null);
        this.f20802 = 1;
        this.f20801 = false;
        this.f20805 = false;
        this.f20799 = false;
        this.f20803 = false;
        this.f20804 = -1L;
        this.f20800 = -1L;
        this.f20806 = c1038;
    }

    public C5358(C4649 c4649, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, LinkedHashSet linkedHashSet) {
        this.f20798 = c4649;
        this.f20802 = i;
        this.f20801 = z;
        this.f20805 = z2;
        this.f20799 = z3;
        this.f20803 = z4;
        this.f20804 = j;
        this.f20800 = j2;
        this.f20806 = linkedHashSet;
    }

    public C5358(C5358 c5358) {
        this.f20801 = c5358.f20801;
        this.f20805 = c5358.f20805;
        this.f20798 = c5358.f20798;
        this.f20802 = c5358.f20802;
        this.f20799 = c5358.f20799;
        this.f20803 = c5358.f20803;
        this.f20806 = c5358.f20806;
        this.f20804 = c5358.f20804;
        this.f20800 = c5358.f20800;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5358.class.equals(obj.getClass())) {
            return false;
        }
        C5358 c5358 = (C5358) obj;
        if (this.f20801 == c5358.f20801 && this.f20805 == c5358.f20805 && this.f20799 == c5358.f20799 && this.f20803 == c5358.f20803 && this.f20804 == c5358.f20804 && this.f20800 == c5358.f20800 && AbstractC1549.m5138(m12153(), c5358.m12153()) && this.f20802 == c5358.f20802) {
            return AbstractC1549.m5138(this.f20806, c5358.f20806);
        }
        return false;
    }

    public final int hashCode() {
        int iM5411 = ((((((((AbstractC1702.m5411(this.f20802) * 31) + (this.f20801 ? 1 : 0)) * 31) + (this.f20805 ? 1 : 0)) * 31) + (this.f20799 ? 1 : 0)) * 31) + (this.f20803 ? 1 : 0)) * 31;
        long j = this.f20804;
        int i = (iM5411 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f20800;
        int iHashCode = (this.f20806.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestM12153 = m12153();
        return iHashCode + (networkRequestM12153 != null ? networkRequestM12153.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + AbstractC5179.m11552(this.f20802) + ", requiresCharging=" + this.f20801 + ", requiresDeviceIdle=" + this.f20805 + ", requiresBatteryNotLow=" + this.f20799 + ", requiresStorageNotLow=" + this.f20803 + ", contentTriggerUpdateDelayMillis=" + this.f20804 + ", contentTriggerMaxDelayMillis=" + this.f20800 + ", contentUriTriggers=" + this.f20806 + ", }";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m12152() {
        return Build.VERSION.SDK_INT < 24 || !this.f20806.isEmpty();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final NetworkRequest m12153() {
        return (NetworkRequest) this.f20798.f17767;
    }
}
