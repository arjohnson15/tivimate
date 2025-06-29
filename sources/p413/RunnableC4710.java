package p413;

import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p009.C0995;
import p101.C1778;
import p120.C1865;
import p181.C2514;
import p331.C3759;
import p417.AbstractC4753;
import p438.C5105;
import p447.AbstractC5179;
import p448.C5184;
import p456.AbstractC5248;
import p456.C5235;
import p456.C5236;
import p456.C5244;
import p456.C5245;
import p456.C5250;
import p456.C5255;
import p456.C5259;
import p456.C5272;
import p456.C5273;
import p456.C5289;
import p456.C5292;
import p456.C5301;
import p456.C5316;
import p456.C5325;
import p456.C5340;
import p456.C5348;
import p456.C5352;
import p456.RunnableC5251;
import p456.RunnableC5298;
import p456.RunnableC5300;
import ʿﾞ.ﹳﹳ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﹳי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4710 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ Object f18078;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f18079;

    public /* synthetic */ RunnableC4710(int i) {
        this.f18079 = i;
    }

    public /* synthetic */ RunnableC4710(int i, Object obj) {
        this.f18079 = i;
        this.f18078 = obj;
    }

    public RunnableC4710(C2514 c2514, boolean z) {
        this.f18079 = 3;
        this.f18078 = c2514;
    }

    public RunnableC4710(C5273 c5273, C0995 c0995) {
        this.f18079 = 5;
        this.f18078 = c5273;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f18079) {
            case 0:
                C1865 c1865 = (C1865) this.f18078;
                c1865.f7124 = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1865.f7123;
                C5184 c5184 = bottomSheetBehavior.f3168;
                if (c5184 != null && c5184.m11577()) {
                    c1865.m5630(c1865.f7122);
                    break;
                } else if (bottomSheetBehavior.f3169 == 2) {
                    bottomSheetBehavior.m2812(c1865.f7122);
                    break;
                }
                break;
            case 1:
                ((ThreadLocal) ((ﹶˆ) this.f18078).ᐧˋ).set(Boolean.TRUE);
                break;
            case 2:
                ((C5184) this.f18078).m11579(0);
                break;
            case 3:
                ((C5273) ((C2514) this.f18078).f10000).m11801();
                break;
            case 4:
                RunnableC5251 runnableC5251 = (RunnableC5251) this.f18078;
                C3759 c3759 = runnableC5251.f20312;
                ((C5255) c3759.f14523).m11846();
                C5255 c5255 = (C5255) c3759.f14523;
                c5255.ˏᵢ().f20567.m4533("Application going to the background");
                c5255.ᐧᴵ().f20478.m12011(true);
                c5255.m11846();
                c5255.f20362 = true;
                C5236 c5236 = (C5236) ((ﹳﹳ) c5255).ᐧⁱ;
                if (!c5236.f20123.m11729()) {
                    boolean zM11727 = c5236.f20123.m11727(null, AbstractC5248.f20222);
                    long j = runnableC5251.f20311;
                    C1778 c1778 = c5255.f20363;
                    if (zM11727) {
                        c1778.m5501(j, false, false);
                        ((C5235) c1778.f6898).m11844();
                    } else {
                        ((C5235) c1778.f6898).m11844();
                        c1778.m5501(j, false, false);
                    }
                }
                C5301 c5301 = c5255.ˏᵢ();
                c5301.f20562.m4531(Long.valueOf(runnableC5251.f20313), "Application backgrounded at: timestamp_millis");
                C5245 c5245 = c5236.f20123;
                C5250 c5250 = AbstractC5248.f20211;
                if (c5245.m11727(null, c5250)) {
                    C5244 c5244M11847 = c5255.m11847();
                    c5244M11847.m11846();
                    c5244M11847.m11757();
                    C5236 c52362 = (C5236) ((ﹳﹳ) c5244M11847).ᐧⁱ;
                    if (c52362.f20123.m11727(null, c5250)) {
                        C5272 c5272M11549 = AbstractC5179.m11549(c52362);
                        if (!c5272M11549.m11784() || c5272M11549.ﹶﾞ().m11988() >= 242600) {
                            C5272 c5272M115492 = AbstractC5179.m11549(c52362);
                            c5272M115492.m11785(new RunnableC5300(c5272M115492, c5272M115492.m11777(true), 2));
                            break;
                        }
                    }
                }
                break;
            case 5:
                C5273 c5273 = (C5273) this.f18078;
                c5273.mo11648().m11740();
                c5273.f20447 = new C5325(c5273);
                C5348 c5348 = new C5348(c5273);
                c5348.m11908();
                c5273.f20428 = c5348;
                C5245 c5245M11832 = c5273.m11832();
                C5352 c5352 = c5273.f20436;
                AbstractC4753.m10683(c5352);
                c5245M11832.f20170 = c5352;
                C5289 c5289 = new C5289(c5273);
                c5289.m11908();
                c5273.f20433 = c5289;
                C5340 c5340 = new C5340(c5273);
                c5340.m11908();
                c5273.f20442 = c5340;
                C5292 c5292 = new C5292(c5273, 1);
                c5292.m11908();
                c5273.f20425 = c5292;
                C5259 c5259 = new C5259(c5273);
                c5259.m11908();
                c5273.f20421 = c5259;
                c5273.f20435 = new C2514(c5273);
                if (c5273.f20415 != c5273.f20440) {
                    C5301 c5301Mo11655 = c5273.mo11655();
                    c5301Mo11655.f20571.m4529(Integer.valueOf(c5273.f20415), Integer.valueOf(c5273.f20440), "Not all upload components initialized");
                }
                c5273.f20431 = true;
                c5273.mo11648().m11740();
                C5348 c53482 = c5273.f20428;
                C5273.m11792(c53482);
                c53482.m12058();
                C5348 c53483 = c5273.f20428;
                C5273.m11792(c53483);
                c53483.ʼᵎ();
                c53483.m11909();
                if (c53483.m12079()) {
                    C5250 c52502 = AbstractC5248.f20255;
                    if (((Long) c52502.m11751(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM12074 = c53483.m12074();
                        ((C5236) ((ﹳﹳ) c53483).ᐧⁱ).f20107.getClass();
                        int iDelete = sQLiteDatabaseM12074.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(c52502.m11751(null))});
                        if (iDelete > 0) {
                            C5301 c53012 = c53483.ˏᵢ();
                            c53012.f20566.m4531(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (c5273.f20433.f20526.m11317() == 0) {
                    C5105 c5105 = c5273.f20433.f20526;
                    c5273.mo11653().getClass();
                    c5105.m11314(System.currentTimeMillis());
                }
                c5273.m11801();
                break;
            default:
                C5236 c52363 = (C5236) this.f18078;
                C5316 c5316 = c52363.f20095;
                C5236.m11644(c5316);
                c5316.ʼᵎ();
                if (c5316.m11965() != 1) {
                    C5301 c53013 = c52363.f20110;
                    C5236.m11647(c53013);
                    c53013.f20568.m4533("registerTrigger called but app not eligible");
                    break;
                } else {
                    C5244 c5244 = c52363.f20106;
                    C5236.m11646(c5244);
                    RunnableC5298 runnableC5298 = new RunnableC5298(3);
                    runnableC5298.f20554 = c5244;
                    new Thread(runnableC5298).start();
                    break;
                }
        }
    }
}
