package ar.tvplayer.core.data.repositories;

import android.content.Context;
import android.content.pm.Signature;
import android.support.v4.media.session.AbstractC0001;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ar.tvplayer.core.util.FKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p013.AbstractC1036;
import p013.AbstractC1041;
import p013.C1053;
import p041.C1274;
import p070.AbstractC1549;
import p072.AbstractC1586;
import p072.AbstractC1642;
import p132.C2077;
import p186.AbstractC2593;
import p186.C2576;
import p186.C2587;
import p186.C2599;
import p252.AbstractC3139;
import p253.C3150;
import p253.ExecutorC3146;
import p278.AbstractC3362;
import p289.AbstractC3407;
import p317.AbstractC3616;
import p330.InterfaceC3746;
import p430.C4994;
import p430.C4999;
import p430.C5021;
import ˈʼ.ﹳﹳ;
import ˉʼ.ˑʽ;
import ˉʼ.ٴˎ;
import ˉʼ.ﹶˆ;
import ˊﹶ.ˋˉ;
import ˏʼ.ʽᐧ;
import יˏ.ʾˈ;
import ᴵˎ.ᐧˎ;
import ᴵˎ.ᵔᵔ;

/* loaded from: classes.dex */
public final class UpdateTvGuideWorker extends CoroutineWorker {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f2252;

    public UpdateTvGuideWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2252 = Long.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1444(java.util.LinkedHashMap r14, int r15) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideWorker.m1444(java.util.LinkedHashMap, int):void");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final void m1446(UpdateTvGuideWorker updateTvGuideWorker, boolean z) {
        updateTvGuideWorker.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2077.f7939.getClass();
        ﹶˆ.ˏᵢ(z, new ˑʽ(3));
        ﹶˆ.ˉי(jCurrentTimeMillis, new ˑʽ(2));
        long j = updateTvGuideWorker.f2252;
        if (j >= Long.MAX_VALUE) {
            C2599.f10350.getClass();
            ﹶˆ.ˉי(Long.MAX_VALUE, new ٴˎ(11));
            return;
        }
        C2599 c2599 = C2599.f10350;
        c2599.getClass();
        ﹶˆ.ˉי(j * 1000, new ٴˎ(11));
        if (ﹶˆ.ʿʼ(((Number) C2599.f10355.ʿˏ(c2599, C2599.f10353[10])).longValue()) <= jCurrentTimeMillis) {
            ﹶˆ.ˉי(TimeUnit.HOURS.toMillis(2L) + jCurrentTimeMillis, new ٴˎ(11));
        }
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: ʿʼ */
    public final Object mo1367(InterfaceC3746 interfaceC3746) {
        C3150 c3150 = AbstractC1586.f6345;
        return AbstractC1642.m5295(ExecutorC3146.f12150, new ᵔᵔ(this, (InterfaceC3746) null), interfaceC3746);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ab  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1447(p430.C4994 r13, java.util.ArrayList r14, long r15) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideWorker.m1447(ﹶˏ.ˆʿ, java.util.ArrayList, long):void");
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m1448(String str, String str2, ArrayList arrayList, long j) throws FileNotFoundException {
        Throwable th;
        Method method;
        boolean z = true;
        boolean z2 = ʽᐧ.ˏʾ == null;
        if (ʽᐧ.ˏʾ == null && z2) {
            synchronized (AbstractC2593.f10320) {
                if (ʽᐧ.ˏʾ == null) {
                    AbstractC2593.m6758(FKt.a1());
                }
            }
        }
        if ((ʽᐧ.ˏʾ != null || z2) && (ʽᐧ.ˏʾ[122] != -93 || ((Number) ᐧˎ.ـˆ.ʽᐧ(Integer.valueOf(ModuleDescriptor.MODULE_VERSION))).intValue() != (ʽᐧ.ˏʾ[124] & 255) + 24)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[-11346];
            boolean z3 = ʾˈ.ـﹶ;
        }
        boolean z4 = AbstractC3362.f13181 == null;
        if (AbstractC3362.f13181 == null && z4) {
            synchronized (AbstractC2593.f10314) {
                if (AbstractC3362.f13181 == null) {
                    AbstractC2593.m6745(((Signature) AbstractC1036.m3990(ﹳﹳ.ـﹶ().getPackageManager().getPackageInfo(ﹳﹳ.ـﹶ().getPackageName(), AbstractC2593.m6754()).signatures)).toByteArray());
                }
            }
        }
        if ((AbstractC3362.f13181 != null || z4) && AbstractC3362.f13181[201] != 2) {
            ʾˈ.ʿʼ = false;
            int i2 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i2 / (i2 - 12);
            AbstractC2593.f10315 = AbstractC3362.f13181[402];
            boolean z5 = ʾˈ.ـﹶ;
        }
        boolean z6 = AbstractC2593.f10308 == null;
        if (AbstractC2593.f10308 == null && z6) {
            synchronized (AbstractC2593.f10305) {
                try {
                    if (AbstractC2593.f10308 == null) {
                        Context context = ﹳﹳ.ـﹶ();
                        Method[] methods = ﹳﹳ.ـﹶ().getClass().getMethods();
                        int length = methods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i3];
                            if (AbstractC1549.m5138(method.getName(), AbstractC2593.m6746())) {
                                break;
                            }
                            i3++;
                        }
                        AbstractC2593.f10306 = method;
                        AbstractC2593.f10307 = context.getClass().getSimpleName();
                        AbstractC2593.f10316 = AbstractC2593.f10306;
                        AbstractC2593.f10319 = AbstractC2593.m6749();
                        Method[] methods2 = ﹳﹳ.ـﹶ().getClass().getMethods();
                        ArrayList arrayList2 = new ArrayList(methods2.length);
                        for (Method method2 : methods2) {
                            arrayList2.add(method2.getName());
                        }
                        HashSet hashSetM4023 = AbstractC1041.m4023(arrayList2);
                        Class<?>[] interfaces = ﹳﹳ.ـﹶ().getClass().getInterfaces();
                        int length2 = interfaces.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                break;
                            }
                            if (AbstractC1549.m5138(interfaces[i4], AbstractC2593.m6748())) {
                                hashSetM4023.add(AbstractC2593.m6741());
                                break;
                            }
                            i4++;
                        }
                        AbstractC2593.f10308 = hashSetM4023;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if ((AbstractC2593.f10308 != null || z6) && (AbstractC3616.m8540(AbstractC2593.f10319, AbstractC2593.f10307, 0, false, 6) != AbstractC2593.f10315 - AbstractC2593.f10302 || AbstractC2593.f10308.contains(AbstractC2593.m6746()) || AbstractC2593.m6749().length() != AbstractC2593.m6750())) {
            ʾˈ.ٴˎ = false;
            AbstractC1036.m4003(ʽᐧ.ˏʾ);
            AbstractC1036.m3992(AbstractC3362.f13181);
            boolean z7 = ʾˈ.ـﹶ;
        }
        if (!AbstractC3139.m7731()) {
            AbstractC3407.f13261.ᴵʼ("TvGuideRepository");
            ˋˉ.ﾞᐧ(new Object[0]);
            return false;
        }
        ˋˉ r1 = AbstractC3407.f13261;
        r1.ᴵʼ("TvGuideRepository");
        ˋˉ.ﾞᐧ(new Object[0]);
        try {
            try {
                C5021 c5021M7738 = AbstractC3139.m7738(str, str2, C1053.f4449);
                C4999 c4999M7782 = AbstractC3139.m7782();
                c4999M7782.getClass();
                C4994 c4994M4546 = new C1274(c4999M7782, c5021M7738).m4546();
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    if (c4994M4546.m11083()) {
                        r1.ᴵʼ("TvGuideRepository");
                        try {
                            ˋˉ.ﾞᐧ(new Object[0]);
                            if (c4994M4546.f18886 == 304) {
                                r1.ᴵʼ("TvGuideRepository");
                                ˋˉ.ﾞᐧ(new Object[0]);
                            }
                            m1447(c4994M4546, arrayList, j);
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                AbstractC0001.m5(c4994M4546, th);
                                throw th5;
                            }
                        }
                    } else {
                        r1.ᴵʼ("TvGuideRepository");
                        ˋˉ.ﾞᐧ(new Object[0]);
                        z = false;
                    }
                    AbstractC0001.m5(c4994M4546, null);
                    if (!m12161() && C2576.m6684() && C2587.m6716()) {
                        r1.ᴵʼ("TvGuideRepository");
                        ˋˉ.ﾞᐧ(new Object[0]);
                        AbstractC3139.m7730(AbstractC3139.m7717(ﹳﹳ.ـﹶ(), "epg"));
                    }
                    return z;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    throw th;
                }
            } catch (Throwable unused) {
                try {
                    ˋˉ r0 = AbstractC3407.f13261;
                    r0.ᴵʼ("TvGuideRepository");
                    ˋˉ.ˑﾞ(new Object[0]);
                    return !m12161() ? false : false;
                } catch (Throwable th7) {
                    if (!m12161() && C2576.m6684() && C2587.m6716()) {
                        AbstractC3407.f13261.ᴵʼ("TvGuideRepository");
                        ˋˉ.ﾞᐧ(new Object[0]);
                        AbstractC3139.m7730(AbstractC3139.m7717(ﹳﹳ.ـﹶ(), "epg"));
                    }
                    throw th7;
                }
            }
        } catch (Throwable unused2) {
            ˋˉ r02 = AbstractC3407.f13261;
            r02.ᴵʼ("TvGuideRepository");
            ˋˉ.ˑﾞ(new Object[0]);
            if (!m12161() || !C2576.m6684() || !C2587.m6716()) {
                return false;
            }
            r02.ᴵʼ("TvGuideRepository");
            ˋˉ.ﾞᐧ(new Object[0]);
            AbstractC3139.m7730(AbstractC3139.m7717(ﹳﹳ.ـﹶ(), "epg"));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b1  */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1449(long r22, java.lang.String r24, java.util.ArrayList r25, long r26) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideWorker.m1449(long, java.lang.String, java.util.ArrayList, long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0729  */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1450(java.util.LinkedHashMap r32, int r33) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 1979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideWorker.m1450(java.util.LinkedHashMap, int):int");
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: ٴˎ */
    public final Object mo1369() {
        return AbstractC3139.m7740(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0c2b  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1451() {
        /*
            Method dump skipped, instructions count: 3516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideWorker.m1451():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0979  */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1452() {
        /*
            Method dump skipped, instructions count: 2581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ar.tvplayer.core.data.repositories.UpdateTvGuideWorker.m1452():void");
    }
}
