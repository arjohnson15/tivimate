package p331;

import java.util.ArrayList;
import p070.AbstractC1549;
import p080.AbstractC1702;
import p447.AbstractC5179;
import p457.C5358;
import p457.C5363;

/* renamed from: ᴵﹳ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3765 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14539;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f14540;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long f14541;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f14542;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int f14543;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final long f14544;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int f14545;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f14546;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5363 f14547;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final ArrayList f14548;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f14549;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f14550;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C5358 f14551;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final long f14552;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final ArrayList f14553;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f14554;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f14555;

    public C3765(String str, int i, C5363 c5363, long j, long j2, long j3, C5358 c5358, int i2, int i3, long j4, long j5, int i4, int i5, long j6, int i6, ArrayList arrayList, ArrayList arrayList2) {
        this.f14549 = str;
        this.f14539 = i;
        this.f14547 = c5363;
        this.f14554 = j;
        this.f14540 = j2;
        this.f14550 = j3;
        this.f14551 = c5358;
        this.f14546 = i2;
        this.f14555 = i3;
        this.f14541 = j4;
        this.f14544 = j5;
        this.f14542 = i4;
        this.f14543 = i5;
        this.f14552 = j6;
        this.f14545 = i6;
        this.f14548 = arrayList;
        this.f14553 = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3765)) {
            return false;
        }
        C3765 c3765 = (C3765) obj;
        return AbstractC1549.m5138(this.f14549, c3765.f14549) && this.f14539 == c3765.f14539 && AbstractC1549.m5138(this.f14547, c3765.f14547) && this.f14554 == c3765.f14554 && this.f14540 == c3765.f14540 && this.f14550 == c3765.f14550 && this.f14551.equals(c3765.f14551) && this.f14546 == c3765.f14546 && this.f14555 == c3765.f14555 && this.f14541 == c3765.f14541 && this.f14544 == c3765.f14544 && this.f14542 == c3765.f14542 && this.f14543 == c3765.f14543 && this.f14552 == c3765.f14552 && this.f14545 == c3765.f14545 && AbstractC1549.m5138(this.f14548, c3765.f14548) && AbstractC1549.m5138(this.f14553, c3765.f14553);
    }

    public final int hashCode() {
        int iHashCode = (this.f14547.hashCode() + ((AbstractC1702.m5411(this.f14539) + (this.f14549.hashCode() * 31)) * 31)) * 31;
        long j = this.f14554;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f14540;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f14550;
        int iM5411 = (AbstractC1702.m5411(this.f14555) + ((((this.f14551.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f14546) * 31)) * 31;
        long j4 = this.f14541;
        int i3 = (iM5411 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f14544;
        int i4 = (((((i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f14542) * 31) + this.f14543) * 31;
        long j6 = this.f14552;
        return this.f14553.hashCode() + ((this.f14548.hashCode() + ((((i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f14545) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.f14549);
        sb.append(", state=");
        sb.append(AbstractC5179.m11553(this.f14539));
        sb.append(", output=");
        sb.append(this.f14547);
        sb.append(", initialDelay=");
        sb.append(this.f14554);
        sb.append(", intervalDuration=");
        sb.append(this.f14540);
        sb.append(", flexDuration=");
        sb.append(this.f14550);
        sb.append(", constraints=");
        sb.append(this.f14551);
        sb.append(", runAttemptCount=");
        sb.append(this.f14546);
        sb.append(", backoffPolicy=");
        int i = this.f14555;
        sb.append(i != 1 ? i != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
        sb.append(", backoffDelayDuration=");
        sb.append(this.f14541);
        sb.append(", lastEnqueueTime=");
        sb.append(this.f14544);
        sb.append(", periodCount=");
        sb.append(this.f14542);
        sb.append(", generation=");
        sb.append(this.f14543);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.f14552);
        sb.append(", stopReason=");
        sb.append(this.f14545);
        sb.append(", tags=");
        sb.append(this.f14548);
        sb.append(", progress=");
        sb.append(this.f14553);
        sb.append(')');
        return sb.toString();
    }
}
