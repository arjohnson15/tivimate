package ar.tvplayer.core.data.repositories;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class UpdateTvGuideForChannelWorker extends CoroutineWorker {
    public UpdateTvGuideForChannelWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1443(ar.tvplayer.core.data.repositories.UpdateTvGuideForChannelWorker r10, p185.AbstractC2562 r11) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof ᴵˎ.ʿᵎ
            if (r0 == 0) goto L16
            r0 = r11
            ᴵˎ.ʿᵎ r0 = (ᴵˎ.ʿᵎ) r0
            int r1 = r0.ˋˉ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.ˋˉ = r1
            goto L1b
        L16:
            ᴵˎ.ʿᵎ r0 = new ᴵˎ.ʿᵎ
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.ᵢʿ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ˋˉ
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            long r1 = r0.ˆᵔ
            ar.tvplayer.core.data.repositories.UpdateTvGuideForChannelWorker r10 = r0.ᐧˋ
            ˈⁱ.ˉⁱ.ˆʿ(r11)
            goto L70
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            ˈⁱ.ˉⁱ.ˆʿ(r11)
            androidx.work.WorkerParameters r11 = r10.f20826
            ﾞﹶ.ˉי r11 = r11.f1753
            java.lang.String r2 = "tvg_source_id"
            long r6 = r11.m12158(r2)
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 == 0) goto L52
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r6)
            goto L53
        L52:
            r11 = r5
        L53:
            if (r11 == 0) goto Lb6
            long r6 = r11.longValue()
            r0.ᐧˋ = r10
            r0.ˆᵔ = r6
            r0.ˋˉ = r4
            יˑ.ﹳﹳ r11 = p072.AbstractC1586.f6345
            יˑ.ˑʽ r11 = p253.ExecutorC3146.f12150
            ᴵˎ.יـ r2 = new ᴵˎ.יـ
            r2.<init>(r6, r5)
            java.lang.Object r11 = p072.AbstractC1642.m5295(r11, r2, r0)
            if (r11 != r1) goto L6f
            goto Lb7
        L6f:
            r1 = r6
        L70:
            ˉﾞ.יˆ r11 = (ˉﾞ.יˆ) r11
            if (r11 == 0) goto Lb6
            java.lang.String r11 = r11.ʿʼ
            if (r11 != 0) goto L79
            goto Lb6
        L79:
            ٴˑ.ﹶˆ r0 = p325.AbstractC3720.f14431
            java.lang.Object r0 = r0.getValue()
            j$.util.concurrent.ConcurrentHashMap r0 = (j$.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            ٴˑ.ﹶˆ r6 = p325.AbstractC3720.f14430
            java.lang.Object r6 = r6.getValue()
            j$.util.concurrent.ConcurrentHashMap r6 = (j$.util.concurrent.ConcurrentHashMap) r6
            java.lang.Object r11 = r6.get(r11)
            ᴵˎ.ﹶⁱ r11 = (ᴵˎ.ﹶⁱ) r11
            if (r0 == 0) goto La4
            if (r11 == 0) goto La4
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "assign_epg"
            java.io.File r6 = p252.AbstractC3139.m7733(r6)
            r5.<init>(r6, r0)
        La4:
            if (r5 == 0) goto Lb6
            boolean r0 = r5.exists()
            if (r0 != r4) goto Lb6
            if (r11 == 0) goto Lb6
            ˈᐧ.ᵎʽ r0 = new ˈᐧ.ᵎʽ
            r0.<init>(r10, r1)
            p325.AbstractC3720.m8685(r5, r11, r0)
        Lb6:
            r1 = r3
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideForChannelWorker.m1443(ar.tvplayer.core.data.repositories.UpdateTvGuideForChannelWorker, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1367(p330.InterfaceC3746 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ᴵˎ.ˑʿ
            if (r0 == 0) goto L13
            r0 = r6
            ᴵˎ.ˑʿ r0 = (ᴵˎ.ˑʿ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L1a
        L13:
            ᴵˎ.ˑʿ r0 = new ᴵˎ.ˑʿ
            ˎʻ.ˑʽ r6 = (p185.AbstractC2562) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.ᐧˋ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ᵢʿ
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            יˑ.ﹳﹳ r6 = p072.AbstractC1586.f6345
            יˑ.ˑʽ r6 = p253.ExecutorC3146.f12150
            ᴵˎ.ʽٴ r2 = new ᴵˎ.ʽٴ
            r4 = 0
            r2.<init>(r5, r4)
            r0.ᵢʿ = r3
            java.lang.Object r6 = p072.AbstractC1642.m5295(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideForChannelWorker.mo1367(ᴵⁱ.ʿʼ):java.lang.Object");
    }
}
