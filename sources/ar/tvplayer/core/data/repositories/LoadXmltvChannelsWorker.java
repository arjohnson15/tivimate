package ar.tvplayer.core.data.repositories;

import android.content.Context;
import android.support.v4.media.session.AbstractC0001;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import p070.C1556;
import p252.AbstractC3139;
import p288.C3406;
import p289.AbstractC3407;
import p325.AbstractC3720;
import p366.C4144;
import p430.C4994;
import ˈʼ.ﹳﹳ;
import ˉᵢ.ˑʽ;
import ˊﹶ.ˋˉ;
import ˏʼ.ʽᐧ;
import ᴵˎ.ˑˈ;
import ᴵˎ.ᴵʽ;
import ᴵˎ.ﹶⁱ;
import ᴵﹳ.ﹶˆ;

/* loaded from: classes.dex */
public final class LoadXmltvChannelsWorker extends CoroutineWorker {
    public LoadXmltvChannelsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
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
            boolean r0 = r6 instanceof ᴵˎ.יי
            if (r0 == 0) goto L13
            r0 = r6
            ᴵˎ.יי r0 = (ᴵˎ.יי) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L1a
        L13:
            ᴵˎ.יי r0 = new ᴵˎ.יי
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
            ᴵˎ.ˆˎ r2 = new ᴵˎ.ˆˎ
            r4 = 0
            r2.<init>(r5, r4)
            r0.ᵢʿ = r3
            java.lang.Object r6 = p072.AbstractC1642.m5295(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.LoadXmltvChannelsWorker.mo1367(ᴵⁱ.ʿʼ):java.lang.Object");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m1441(String str, C4994 c4994) {
        ˋˉ r0 = AbstractC3407.f13261;
        r0.ᴵʼ("TvGuideRepository");
        ˋˉ.ﾞᐧ(new Object[0]);
        String string = UUID.randomUUID().toString();
        File file = new File(AbstractC3139.m7717(ﹳﹳ.ـﹶ(), "assign_epg"), string);
        C4144 c4144 = new C4144(ʽᐧ.ﹳˑ(file));
        try {
            c4144.m9536(c4994.f18890.mo5667());
            AbstractC0001.m5(c4144, null);
            r0.ᴵʼ("TvGuideRepository");
            ˋˉ.ﾞᐧ(new Object[0]);
            if (m12161()) {
                r0.ᴵʼ("TvGuideRepository");
                ˋˉ.ﾞᐧ(new Object[0]);
            } else {
                ﹶⁱ r9 = AbstractC3720.m8686(c4994);
                ((ConcurrentHashMap) AbstractC3720.f14431.getValue()).put(str, string);
                ((ConcurrentHashMap) AbstractC3720.f14430.getValue()).put(str, r9);
                AbstractC3720.m8685(file, r9, new ˑˈ(this, str, 1));
            }
        } finally {
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m1442(InputStream inputStream, String str) {
        ˋˉ r0 = AbstractC3407.f13261;
        r0.ᴵʼ("TvGuideRepository");
        ˋˉ.ﾞᐧ(new Object[0]);
        ArrayList arrayList = new ArrayList();
        ˑʽ.ʽᐧ(inputStream, false, false, this.f20826.f1753.m12157("is_full_scan"), new ﹶˆ(new HashSet(), arrayList, new C1556(), this));
        if (!m12161()) {
            C3406 c3406 = ᴵʽ.ـﹶ;
            ((ConcurrentHashMap) ᴵʽ.ـﹶ.getValue()).put(str, arrayList);
        }
        r0.ᴵʼ("TvGuideRepository");
        ˋˉ.ﾞᐧ(new Object[0]);
    }
}
