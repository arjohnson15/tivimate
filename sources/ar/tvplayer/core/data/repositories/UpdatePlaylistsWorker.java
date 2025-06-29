package ar.tvplayer.core.data.repositories;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import p252.AbstractC3139;

/* loaded from: classes.dex */
public final class UpdatePlaylistsWorker extends CoroutineWorker {
    public UpdatePlaylistsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1367(p330.InterfaceC3746 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ᴵˎ.ᵎˎ
            if (r0 == 0) goto L13
            r0 = r11
            ᴵˎ.ᵎˎ r0 = (ᴵˎ.ᵎˎ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L1a
        L13:
            ᴵˎ.ᵎˎ r0 = new ᴵˎ.ᵎˎ
            ˎʻ.ˑʽ r11 = (p185.AbstractC2562) r11
            r0.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r0.ᐧˋ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ᵢʿ
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ˈⁱ.ˉⁱ.ˆʿ(r11)
            goto L73
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r11)
            ˊﹶ.ˋˉ r11 = p289.AbstractC3407.f13261
            java.lang.String r2 = "UpdatePlaylistsWorker"
            r11.ᴵʼ(r2)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            ˊﹶ.ˋˉ.ﾞᐧ(r5)
            boolean r5 = p252.AbstractC3139.m7731()
            androidx.work.WorkerParameters r6 = r10.f20826
            if (r5 == 0) goto L78
            ﾞﹶ.ˉי r11 = r6.f1753
            java.lang.String r2 = "is_on_app_start"
            boolean r8 = r11.m12157(r2)
            ᴵˎ.ˆ r6 = new ᴵˎ.ˆ
            r11 = 0
            r6.<init>(r8, r10, r11)
            r0.ᵢʿ = r3
            יˑ.ﹳﹳ r11 = p072.AbstractC1586.f6345
            יˑ.ˑʽ r11 = p253.ExecutorC3146.f12150
            ʿʽ.ʻﹳ r2 = p072.C1578.f6332
            ᴵⁱ.ˉי r11 = ᴵﹳ.ٴˎ.ˋⁱ(r11, r2)
            ᴵˎ.ᵔᐧ r2 = new ᴵˎ.ᵔᐧ
            r5 = 0
            r7 = 1
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = p072.AbstractC1642.m5295(r11, r2, r0)
            if (r11 != r1) goto L73
            return r1
        L73:
            ﾞﹶ.ﹳˎ r11 = p457.AbstractC5359.m12154()
            goto L9f
        L78:
            r11.ᴵʼ(r2)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            ˊﹶ.ˋˉ.ﾞᐧ(r0)
            int r0 = r6.f1760
            if (r0 != 0) goto L92
            r11.ᴵʼ(r2)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            ˊﹶ.ˋˉ.ﾞᐧ(r11)
            ﾞﹶ.ᵎˏ r11 = new ﾞﹶ.ᵎˏ
            r11.<init>()
            goto L9f
        L92:
            r11.ᴵʼ(r2)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            ˊﹶ.ˋˉ.ﾞᐧ(r11)
            ﾞﹶ.ˎٴ r11 = new ﾞﹶ.ˎٴ
            r11.<init>()
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdatePlaylistsWorker.mo1367(ᴵⁱ.ʿʼ):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: ٴˎ */
    public final Object mo1369() {
        return AbstractC3139.m7740(4);
    }
}
