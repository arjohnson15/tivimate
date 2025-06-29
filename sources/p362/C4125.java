package p362;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.leanback.widget.InterfaceC0184;
import androidx.lifecycle.AbstractC0224;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p015.C1067;
import p029.RunnableC1181;
import p033.C1219;
import p034.AbstractC1227;
import p034.C1231;
import p034.InterfaceC1225;
import p034.InterfaceC1229;
import p070.AbstractC1549;
import p071.C1571;
import p071.InterfaceC1566;
import p072.AbstractC1642;
import p084.C1714;
import p090.C1744;
import p112.C1811;
import p123.C1995;
import p139.C2125;
import p166.C2397;
import p166.C2401;
import p166.C2402;
import p166.C2409;
import p166.C2410;
import p166.C2431;
import p166.InterfaceC2446;
import p176.InterfaceC2490;
import p183.InterfaceC2536;
import p191.C2649;
import p222.C2895;
import p251.C3130;
import p251.InterfaceC3134;
import p252.AbstractC3139;
import p306.C3554;
import p306.InterfaceC3549;
import p306.InterfaceC3553;
import p317.AbstractC3625;
import p330.InterfaceC3746;
import p334.C3789;
import p345.C3961;
import p364.InterfaceC4139;
import p375.C4305;
import p378.AbstractC4345;
import p378.C4389;
import p383.InterfaceC4461;
import p383.InterfaceC4462;
import p385.InterfaceC4483;
import p385.InterfaceC4494;
import p395.AbstractC4535;
import p397.C4598;
import p397.C4605;
import p397.C4609;
import p399.C4615;
import p428.C4918;
import p429.C4950;
import p429.C4972;
import p438.SurfaceHolderCallbackC5075;
import p439.InterfaceC5123;
import p444.C5148;
import p444.C5152;
import ˏᵢ.ᵢٴ;
import ᴵﹳ.ﹶˆ;
import ᵢ.ʿʼ;
import ⁱᵢ.ˈٴ;
import ⁱᵢ.ᐧⁱ;
import ﹳᵎ.ˏᵢ;
import ﹳᵎ.ٴˎ;
import ﹶᴵ.ʻﹳ;
import ﹶᴵ.ʾʼ;
import ﹶᴵ.ˊᵔ;
import ﹶᴵ.ˑﾞ;
import ﹶᴵ.ـˆ;
import ﹶᴵ.ᵔٴ;

/* renamed from: ᵔᵢ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4125 implements InterfaceC4113, InterfaceC4494, InterfaceC4462, InterfaceC1566, InterfaceC1225, InterfaceC3134, InterfaceC2536, InterfaceC0184, InterfaceC4461, InterfaceC5123 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f15928;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f15929;

    public /* synthetic */ C4125(int i, Object obj) {
        this.f15929 = i;
        this.f15928 = obj;
    }

    @Override // p183.InterfaceC2536
    public Object apply(Object obj) {
        ((ʿʼ) this.f15928).getClass();
        String str = C4950.f18724.ˎٴ((C4972) obj);
        "Session Event: ".concat(str);
        return str.getBytes(AbstractC3625.f13869);
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj;
        switch (this.f15929) {
            case 13:
                interfaceC2446.mo4372((C2410) this.f15928);
                break;
            case 14:
                interfaceC2446.mo4371((C2397) this.f15928);
                break;
            case 15:
                interfaceC2446.mo4351((C2409) this.f15928);
                break;
            case 16:
                interfaceC2446.mo4370((C1811) this.f15928);
                break;
            case 17:
                interfaceC2446.mo4372(((SurfaceHolderCallbackC5075) this.f15928).f19247.f19574);
                break;
            case 18:
                interfaceC2446.mo4368((C2401) this.f15928);
                break;
            default:
                interfaceC2446.mo4347((List) this.f15928);
                break;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean m9443(ᵢٴ r7, int i, Bundle bundle) {
        ᵢٴ c4389;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC4139) r7.ˆʿ).mo8796();
                Parcelable parcelable = (Parcelable) ((InterfaceC4139) r7.ˆʿ).mo8779();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                return false;
            }
        }
        ClipDescription clipDescriptionMo8789 = ((InterfaceC4139) r7.ˆʿ).mo8789();
        InterfaceC4139 interfaceC4139 = (InterfaceC4139) r7.ˆʿ;
        ClipData clipData = new ClipData(clipDescriptionMo8789, new ClipData.Item(interfaceC4139.mo8787()));
        if (i2 >= 31) {
            c4389 = new ᵢٴ(clipData, 2);
        } else {
            c4389 = new C4389();
            c4389.f16910 = clipData;
            c4389.f16912 = 2;
        }
        c4389.mo9929(interfaceC4139.mo8780());
        c4389.mo9931(bundle);
        return AbstractC4345.m9877((C2895) this.f15928, c4389.mo9932()) == null;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, ٴˑ.ˑʽ] */
    @Override // p071.InterfaceC1566
    /* renamed from: ˉי */
    public void mo4094(Object obj) {
        C1571 c1571 = (C1571) obj;
        switch (this.f15929) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                C4615 c4615 = (C4615) this.f15928;
                c4615.getClass();
                if (c1571.f6322 == -1) {
                    ᐧⁱ r1 = c4615.m10500();
                    String stringExtra = c1571.f6321.getStringExtra("ar.tvplayer.tv.settings.TvGuideUrl");
                    r1.getClass();
                    AbstractC1642.m5294(AbstractC0224.m1023(r1), null, 0, new ˈٴ(stringExtra, (InterfaceC3746) null), 3);
                    c4615.f17650 = Long.MAX_VALUE;
                    break;
                }
                break;
            default:
                ﹳᵎ.ʿʼ r0 = (ﹳᵎ.ʿʼ) this.f15928;
                r0.getClass();
                if (c1571.f6322 == -1) {
                    ˏᵢ r6 = (ˏᵢ) r0.ˑﾞ.getValue();
                    r6.getClass();
                    AbstractC4535.f17426 = true;
                    AbstractC1642.m5294(AbstractC0224.m1023(r6), null, 0, new ٴˎ(r6, (InterfaceC3746) null), 3);
                    break;
                }
                break;
        }
    }

    @Override // p251.InterfaceC3134
    /* renamed from: ˏʾ */
    public Object mo7700(C3130 c3130) {
        boolean z;
        switch (this.f15929) {
            case 9:
                ((C4305) this.f15928).getClass();
                if (c3130.m7685()) {
                    C4918 c4918 = (C4918) c3130.m7689();
                    C1714 c1714 = C1714.f6685;
                    c1714.m5437("Crashlytics report successfully enqueued to DataTransport: " + c4918.f18593);
                    File file = c4918.f18594;
                    if (file.delete()) {
                        c1714.m5437("Deleted report file: " + file.getPath());
                    } else {
                        c1714.m5439("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z = true;
                } else {
                    c3130.m7684();
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((CountDownLatch) this.f15928).countDown();
                return null;
        }
    }

    @Override // p383.InterfaceC4462
    /* renamed from: ˑʽ */
    public void mo4264(Object obj) {
        C4598 c4598 = (C4598) obj;
        switch (this.f15929) {
            case 4:
                C4605 c4605 = (C4605) this.f15928;
                c4605.getClass();
                C4609 c4609 = new C4609(c4598.f17598, ٴᐧ.ᐧⁱ.ˑי(c4598.f17600, c4598.f17599));
                c4605.f17620.add(c4609);
                long j = c4605.f17618;
                if (j == -9223372036854775807L || c4598.f17598 >= j) {
                    c4605.m10492(c4609);
                    break;
                }
                break;
            default:
                ((C3961) this.f15928).m9172(c4598);
                break;
        }
    }

    @Override // p034.InterfaceC1225
    /* renamed from: ˑי */
    public InterfaceC1229 mo4395(C1231 c1231) {
        AbstractC1227 abstractC1227 = c1231.f5039;
        String str = c1231.f5037;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C1744((Context) this.f15928, str, abstractC1227, true, true);
    }

    @Override // p439.InterfaceC5123
    /* renamed from: ـﹶ */
    public Object mo4249() {
        SQLiteDatabase sQLiteDatabaseM8438;
        Object obj = this.f15928;
        switch (this.f15929) {
            case 21:
                C3554 c3554 = (C3554) ((InterfaceC3549) obj);
                c3554.getClass();
                int i = C2649.f10518;
                ﹶˆ r3 = new ﹶˆ();
                r3.ᐧⁱ = null;
                r3.ˆʿ = new ArrayList();
                r3.ˎˑ = null;
                r3.ᐧˋ = "";
                HashMap map = new HashMap();
                sQLiteDatabaseM8438 = c3554.m8438();
                sQLiteDatabaseM8438.beginTransaction();
                try {
                    C2649 c2649 = (C2649) C3554.m8433(sQLiteDatabaseM8438.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C2125(c3554, map, r3, 3));
                    sQLiteDatabaseM8438.setTransactionSuccessful();
                    return c2649;
                } finally {
                }
            case 22:
                C3554 c35542 = (C3554) ((InterfaceC3553) obj);
                long jM6468 = c35542.f13719.m6468() - c35542.f13722.f13716;
                sQLiteDatabaseM8438 = c35542.m8438();
                sQLiteDatabaseM8438.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jM6468)};
                    C3554.m8433(sQLiteDatabaseM8438.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C1067(23, c35542));
                    int iDelete = sQLiteDatabaseM8438.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM8438.setTransactionSuccessful();
                    sQLiteDatabaseM8438.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 23:
                C3554 c35543 = (C3554) ((C5152) obj).f19697;
                sQLiteDatabaseM8438 = c35543.m8438();
                sQLiteDatabaseM8438.beginTransaction();
                try {
                    sQLiteDatabaseM8438.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM8438.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c35543.f13719.m6468()).execute();
                    sQLiteDatabaseM8438.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                C5148 c5148 = (C5148) obj;
                Iterator it = ((Iterable) ((C3554) c5148.f19677).m8437(new C1219(28))).iterator();
                while (it.hasNext()) {
                    c5148.f19678.m11453((C1995) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // androidx.leanback.widget.InterfaceC0184
    /* renamed from: ٴˎ */
    public void mo981(View view, int i) {
        ˑﾞ r3;
        InterfaceC2490[] interfaceC2490Arr = ʻﹳ.ˉᵎ;
        ʻﹳ r2 = (ʻﹳ) this.f15928;
        ʾʼ adapter = r2.ᵔˋ().ˏᵢ.getAdapter();
        ʾʼ r12 = adapter instanceof ʾʼ ? adapter : null;
        if (r12 != null) {
            int selectedPosition = r2.ᵔˋ().ˏᵢ.getSelectedPosition();
            if (r12.ﹳﹳ.size() != 0 && selectedPosition != -1 && !r2.ᵔˋ().ˏᵢ.m1299()) {
                r12.m4757(0, r12.ﹳﹳ.size(), ـˆ.ᐧⁱ);
                int selectedPosition2 = r2.ᵔˋ().ﹶˆ.getSelectedPosition();
                if (selectedPosition2 != -1) {
                    ᵔٴ adapter2 = r2.ᵔˋ().ﹶˆ.getAdapter();
                    ᵔٴ r32 = adapter2 instanceof ᵔٴ ? adapter2 : null;
                    if (r32 != null && (r3 = r32.ˏᴵ(selectedPosition2)) != null) {
                        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochSecond(r3.ʽᐧ.ʽᐧ), ZoneId.systemDefault()).c();
                        LocalDate localDate2 = (LocalDate) r12.ﹳﹳ.get(selectedPosition);
                        if (!AbstractC1549.m5138(localDate, localDate2)) {
                            long epochSecond = localDate2.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
                            ᵔٴ adapter3 = r2.ᵔˋ().ﹶˆ.getAdapter();
                            ᵔٴ r122 = adapter3 instanceof ᵔٴ ? adapter3 : null;
                            if (r122 != null) {
                                int size = r122.ﹳﹳ.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        break;
                                    }
                                    ˑﾞ r7 = r122.ˏᴵ(i2);
                                    if (r7 != null && r7.ـﹶ != 2 && r7.ʽᐧ.ʽᐧ >= epochSecond) {
                                        AbstractC1642.m5294(AbstractC3139.m7770(r2), null, 0, new ˊᵔ(r2, i2, (InterfaceC3746) null), 3);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
        }
        View view2 = r2.getView();
        if (view2 != null) {
            view2.post(new RunnableC1181(r2, r2, view, 6, false));
        }
    }

    @Override // p362.InterfaceC4113
    /* renamed from: ᐧʻ */
    public int mo8485(Object obj) {
        C4116 c4116 = (C4116) obj;
        c4116.getClass();
        C2431 c2431 = (C2431) this.f15928;
        String str = c2431.f9667;
        String str2 = c4116.f15898;
        return ((str2.equals(str) || str2.equals(AbstractC4130.m9467(c2431))) && c4116.m9436(c2431, false)) ? 1 : 0;
    }

    @Override // p385.InterfaceC4494
    /* renamed from: ﹳﹳ */
    public InterfaceC4483 mo5480(C2402 c2402) {
        return (InterfaceC4483) this.f15928;
    }
}
