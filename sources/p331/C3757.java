package p331;

import android.net.NetworkRequest;
import android.os.Build;
import android.support.v4.media.session.AbstractC0001;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p013.AbstractC1041;
import p065.AbstractC1484;
import p065.AbstractC1524;
import p080.AbstractC1702;
import p090.C1743;
import p406.C4648;
import p406.C4649;
import p406.C4653;
import p447.AbstractC5179;
import p457.C5358;
import p457.C5363;
import p457.C5387;
import ˏʼ.ʽᐧ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ᴵﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3757 extends AbstractC1524 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f14518;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3757(AbstractC1484 abstractC1484, int i) {
        super(abstractC1484);
        this.f14518 = i;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8720(Object obj) {
        C1743 c1743M5108 = m5108();
        try {
            m8721(c1743M5108, obj);
            c1743M5108.f6755.executeInsert();
        } finally {
            m5105(c1743M5108);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m8721(C1743 c1743, Object obj) {
        int i;
        int i2;
        int[] iArrM4013;
        int[] iArrM40132;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 5;
        switch (this.f14518) {
            case 0:
                C3769 c3769 = (C3769) obj;
                c1743.mo4420(1, c3769.f14587);
                c1743.mo4420(2, c3769.f14586);
                return;
            case 1:
                C3775 c3775 = (C3775) obj;
                c1743.mo4420(1, c3775.f14612);
                c1743.mo4419(2, c3775.f14611.longValue());
                return;
            case 2:
                c1743.mo4420(1, ((C3770) obj).f14590);
                c1743.mo4419(2, r1.f14588);
                c1743.mo4419(3, r1.f14589);
                return;
            case 3:
                C3764 c3764 = (C3764) obj;
                c1743.mo4420(1, c3764.f14538);
                c1743.mo4420(2, c3764.f14537);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                C3768 c3768 = (C3768) obj;
                c1743.mo4420(1, c3768.f14575);
                c1743.mo4419(2, ᵢʿ.ﹳˑ(c3768.f14562));
                c1743.mo4420(3, c3768.f14573);
                c1743.mo4420(4, c3768.f14582);
                C5363 c5363 = c3768.f14563;
                C5363 c53632 = C5363.f20820;
                c1743.mo4423(5, ʽᐧ.ˆᵔ(c5363));
                c1743.mo4423(6, ʽᐧ.ˆᵔ(c3768.f14576));
                c1743.mo4419(7, c3768.f14577);
                c1743.mo4419(8, c3768.f14572);
                c1743.mo4419(9, c3768.f14583);
                c1743.mo4419(10, c3768.f14570);
                int iM5411 = AbstractC1702.m5411(c3768.f14566);
                if (iM5411 == 0) {
                    i = 0;
                } else {
                    if (iM5411 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 1;
                }
                c1743.mo4419(11, i);
                c1743.mo4419(12, c3768.f14568);
                c1743.mo4419(13, c3768.f14578);
                c1743.mo4419(14, c3768.f14571);
                c1743.mo4419(15, c3768.f14574);
                c1743.mo4419(16, c3768.f14580 ? 1L : 0L);
                int iM54112 = AbstractC1702.m5411(c3768.f14569);
                if (iM54112 == 0) {
                    i2 = 0;
                } else {
                    if (iM54112 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 1;
                }
                c1743.mo4419(17, i2);
                c1743.mo4419(18, c3768.f14579);
                c1743.mo4419(19, c3768.f14581);
                c1743.mo4419(20, c3768.f14564);
                c1743.mo4419(21, c3768.f14567);
                c1743.mo4419(22, c3768.f14585);
                String str = c3768.f14584;
                if (str == null) {
                    c1743.mo4421(23);
                } else {
                    c1743.mo4420(23, str);
                }
                C5358 c5358 = c3768.f14565;
                int i4 = c5358.f20802;
                int iM54113 = AbstractC1702.m5411(i4);
                if (iM54113 == 0) {
                    i3 = 0;
                } else if (iM54113 == 1) {
                    i3 = 1;
                } else if (iM54113 == 2) {
                    i3 = 2;
                } else if (iM54113 == 3) {
                    i3 = 3;
                } else if (iM54113 == 4) {
                    i3 = 4;
                } else if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                    throw new IllegalArgumentException("Could not convert " + AbstractC5179.m11552(i4) + " to int");
                }
                c1743.mo4419(24, i3);
                C4649 c4649 = c5358.f20798;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) c4649.f17767;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            C4648 c4648 = C4648.f17766;
                            C4653 c4653 = C4653.f17774;
                            try {
                                if (i5 >= 31) {
                                    iArrM4013 = c4653.m10556(networkRequest);
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i6 = 0; i6 < 9; i6++) {
                                        int i7 = iArr[i6];
                                        if (c4648.m10554(networkRequest, i7)) {
                                            arrayList.add(Integer.valueOf(i7));
                                        }
                                    }
                                    iArrM4013 = AbstractC1041.m4013(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrM40132 = c4653.m10557(networkRequest);
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    int i8 = 0;
                                    for (int i9 = 29; i8 < i9; i9 = 29) {
                                        int i10 = iArr2[i8];
                                        if (c4648.m10553(networkRequest, i10)) {
                                            arrayList2.add(Integer.valueOf(i10));
                                        }
                                        i8++;
                                    }
                                    iArrM40132 = AbstractC1041.m4013(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrM4013.length);
                                for (int i11 : iArrM4013) {
                                    objectOutputStream.writeInt(i11);
                                }
                                objectOutputStream.writeInt(iArrM40132.length);
                                for (int i12 : iArrM40132) {
                                    objectOutputStream.writeInt(i12);
                                }
                                AbstractC0001.m5(objectOutputStream, null);
                                AbstractC0001.m5(byteArrayOutputStream, null);
                                byteArray = byteArrayOutputStream.toByteArray();
                            } finally {
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
                c1743.mo4423(25, byteArray);
                c1743.mo4419(26, c5358.f20801 ? 1L : 0L);
                c1743.mo4419(27, c5358.f20805 ? 1L : 0L);
                c1743.mo4419(28, c5358.f20799 ? 1L : 0L);
                c1743.mo4419(29, c5358.f20803 ? 1L : 0L);
                c1743.mo4419(30, c5358.f20804);
                c1743.mo4419(31, c5358.f20800);
                Set<C5387> set = c5358.f20806;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (C5387 c5387 : set) {
                                objectOutputStream2.writeUTF(c5387.f20860.toString());
                                objectOutputStream2.writeBoolean(c5387.f20859);
                            }
                            AbstractC0001.m5(objectOutputStream2, null);
                            AbstractC0001.m5(byteArrayOutputStream2, null);
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                        } finally {
                        }
                    } finally {
                    }
                }
                c1743.mo4423(32, byteArray2);
                return;
            default:
                C3774 c3774 = (C3774) obj;
                c1743.mo4420(1, c3774.f14610);
                c1743.mo4420(2, c3774.f14609);
                return;
        }
    }

    @Override // p065.AbstractC1524
    /* renamed from: ﹳﹳ */
    public final String mo5110() {
        switch (this.f14518) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
