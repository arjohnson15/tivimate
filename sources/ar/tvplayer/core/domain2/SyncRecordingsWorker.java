package ar.tvplayer.core.domain2;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ar.tvplayer.core.data.db.entities.RecordingForPush;
import java.util.List;
import p070.AbstractC1549;
import p252.AbstractC3139;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class SyncRecordingsWorker extends CoroutineWorker {

    @InterfaceC5046(generateAdapter = true)
    public static final class RecordingsIndex {

        /* renamed from: ʽᐧ, reason: contains not printable characters */
        public final List f2263;

        /* renamed from: ـﹶ, reason: contains not printable characters */
        public final int f2264;

        public RecordingsIndex(@InterfaceC5065(name = "v") int i, @InterfaceC5065(name = "r") List<RecordingForPush> list) {
            this.f2264 = i;
            this.f2263 = list;
        }

        public final RecordingsIndex copy(@InterfaceC5065(name = "v") int i, @InterfaceC5065(name = "r") List<RecordingForPush> list) {
            return new RecordingsIndex(i, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecordingsIndex)) {
                return false;
            }
            RecordingsIndex recordingsIndex = (RecordingsIndex) obj;
            return this.f2264 == recordingsIndex.f2264 && AbstractC1549.m5138(this.f2263, recordingsIndex.f2263);
        }

        public final int hashCode() {
            return this.f2263.hashCode() + (this.f2264 * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecordingsIndex(version=");
            sb.append(this.f2264);
            sb.append(", recordings=");
            return ˉᵎ.ᵎـ(sb, this.f2263, ')');
        }
    }

    public SyncRecordingsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1465(p070.C1561 r5, p185.AbstractC2562 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ᵢˈ.ˎˉ
            if (r0 == 0) goto L13
            r0 = r6
            ᵢˈ.ˎˉ r0 = (ᵢˈ.ˎˉ) r0
            int r1 = r0.ﹳﹶ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ﹳﹶ = r1
            goto L18
        L13:
            ᵢˈ.ˎˉ r0 = new ᵢˈ.ˎˉ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.ᵢʿ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ﹳﹶ
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ʿ.ᵎˏ r5 = r0.ˆᵔ
            ʿ.ᵎˏ r0 = r0.ᐧˋ
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            java.lang.Object r6 = r5.f6302
            if (r6 != 0) goto L58
            ᴵˎ.ᴵˋ r6 = ᴵˎ.ᴵˋ.ـﹶ
            r0.ᐧˋ = r5
            r0.ˆᵔ = r5
            r0.ﹳﹶ = r3
            יˑ.ﹳﹳ r6 = p072.AbstractC1586.f6345
            יˑ.ˑʽ r6 = p253.ExecutorC3146.f12150
            ᴵˎ.ˑﾞ r2 = new ᴵˎ.ˑﾞ
            r3 = 2
            r4 = 0
            r2.<init>(r3, r4)
            java.lang.Object r6 = p072.AbstractC1642.m5295(r6, r2, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            r5.f6302 = r6
            r5 = r0
        L58:
            java.lang.Object r5 = r5.f6302
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1465(ʿ.ᵎˏ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1466(p070.C1561 r4, p070.C1561 r5, p185.AbstractC2562 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ᵢˈ.ʻﹳ
            if (r0 == 0) goto L13
            r0 = r6
            ᵢˈ.ʻﹳ r0 = (ᵢˈ.ʻﹳ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L18
        L13:
            ᵢˈ.ʻﹳ r0 = new ᵢˈ.ʻﹳ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.ˆᵔ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ᵢʿ
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ʿ.ᵎˏ r4 = r0.ᐧˋ
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            java.lang.Object r6 = r4.f6302
            if (r6 != 0) goto L68
            r0.ᐧˋ = r4
            r0.ᵢʿ = r3
            java.lang.Object r6 = m1465(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.util.List r6 = (java.util.List) r6
            ˎٴ.ᵎـ r5 = new ˎٴ.ᵎـ
            int r0 = r6.size()
            r5.<init>(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.next()
            ˉﾞ.ʿʼ r0 = (ˉﾞ.ʿʼ) r0
            java.lang.String r1 = r0.ﹳﹳ
            r5.m7024(r1, r0)
            goto L54
        L66:
            r4.f6302 = r5
        L68:
            java.lang.Object r4 = r4.f6302
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1466(ʿ.ᵎˏ, ʿ.ᵎˏ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1467(p070.C1561 r7, p185.AbstractC2562 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof ᵢˈ.ˈﹳ
            if (r0 == 0) goto L13
            r0 = r8
            ᵢˈ.ˈﹳ r0 = (ᵢˈ.ˈﹳ) r0
            int r1 = r0.ﹳﹶ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ﹳﹶ = r1
            goto L18
        L13:
            ᵢˈ.ˈﹳ r0 = new ᵢˈ.ˈﹳ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.ᵢʿ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ﹳﹶ
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ʿ.ᵎˏ r7 = r0.ˆᵔ
            ʿ.ᵎˏ r0 = r0.ᐧˋ
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            goto L53
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            java.lang.Object r8 = r7.f6302
            if (r8 != 0) goto L8b
            r0.ᐧˋ = r7
            r0.ˆᵔ = r7
            r0.ﹳﹶ = r4
            יˑ.ﹳﹳ r8 = p072.AbstractC1586.f6345
            יˑ.ˑʽ r8 = p253.ExecutorC3146.f12150
            ᴵˎ.ʼʾ r2 = new ᴵˎ.ʼʾ
            r4 = 2
            r2.<init>(r4, r3)
            java.lang.Object r8 = p072.AbstractC1642.m5295(r8, r2, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r0 = r7
        L53:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L5e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r8.next()
            ˉﾞ.ˎˉ r2 = (ˉﾞ.ˎˉ) r2
            java.lang.Object r4 = r2.ˎᵔ
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L81
            java.lang.String r4 = r2.ˑʽ
            long r5 = r2.ـﹶ
            ar.tvplayer.core.data.api.xtreamcodes.XtreamCodes$Params r2 = ᵔʼ.ˑʽ.ᵎˏ(r4, r5)
            goto L82
        L81:
            r2 = r3
        L82:
            if (r2 == 0) goto L5e
            r1.add(r2)
            goto L5e
        L88:
            r7.f6302 = r1
            r7 = r0
        L8b:
            java.lang.Object r7 = r7.f6302
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1467(ʿ.ᵎˏ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1468(p070.C1561 r5, p070.C1561 r6, p185.AbstractC2562 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ᵢˈ.יˋ
            if (r0 == 0) goto L13
            r0 = r7
            ᵢˈ.יˋ r0 = (ᵢˈ.יˋ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L18
        L13:
            ᵢˈ.יˋ r0 = new ᵢˈ.יˋ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.ˆᵔ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ᵢʿ
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ʿ.ᵎˏ r5 = r0.ᐧˋ
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            java.lang.Object r7 = r5.f6302
            if (r7 != 0) goto L74
            r0.ᐧˋ = r5
            r0.ᵢʿ = r3
            java.lang.Object r7 = m1465(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.util.List r7 = (java.util.List) r7
            ˎٴ.ᵎـ r6 = new ˎٴ.ᵎـ
            int r0 = r7.size()
            r6.<init>(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r7.next()
            ˉﾞ.ʿʼ r0 = (ˉﾞ.ʿʼ) r0
            ٴˑ.ʿʼ r1 = new ٴˑ.ʿʼ
            long r2 = r0.ˑʽ
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            java.lang.Integer r2 = r0.ʽᐧ
            r1.<init>(r4, r2)
            r6.m7024(r1, r0)
            goto L54
        L72:
            r5.f6302 = r6
        L74:
            java.lang.Object r5 = r5.f6302
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1468(ʿ.ᵎˏ, ʿ.ᵎˏ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r6 == r5) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e1 -> B:36:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0128 -> B:48:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0197 -> B:63:0x0198). Please report as a decompilation issue!!! */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1469(ar.tvplayer.core.domain2.SyncRecordingsWorker r38, p185.AbstractC2562 r39) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1469(ar.tvplayer.core.domain2.SyncRecordingsWorker, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x065f A[LOOP:3: B:233:0x0659->B:235:0x065f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01d0 -> B:65:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01fc -> B:64:0x0200). Please report as a decompilation issue!!! */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1470(ar.tvplayer.core.domain2.SyncRecordingsWorker r44, p185.AbstractC2562 r45) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1470(ar.tvplayer.core.domain2.SyncRecordingsWorker, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1471(p070.C1561 r18, p070.C1561 r19, p070.C1561 r20, p070.C1561 r21, ar.tvplayer.core.data.db.entities.RecordingForPush r22, p185.AbstractC2562 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.m1471(ʿ.ᵎˏ, ʿ.ᵎˏ, ʿ.ᵎˏ, ʿ.ᵎˏ, ar.tvplayer.core.data.db.entities.RecordingForPush, ˎʻ.ˑʽ):java.lang.Object");
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
            boolean r0 = r6 instanceof ᵢˈ.ᵎʽ
            if (r0 == 0) goto L13
            r0 = r6
            ᵢˈ.ᵎʽ r0 = (ᵢˈ.ᵎʽ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L1a
        L13:
            ᵢˈ.ᵎʽ r0 = new ᵢˈ.ᵎʽ
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
            ᵢˈ.ʿˊ r2 = new ᵢˈ.ʿˊ
            r4 = 0
            r2.<init>(r5, r4)
            r0.ᵢʿ = r3
            java.lang.Object r6 = p072.AbstractC1642.m5295(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.domain2.SyncRecordingsWorker.mo1367(ᴵⁱ.ʿʼ):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: ٴˎ */
    public final Object mo1369() {
        return AbstractC3139.m7740(3);
    }
}
