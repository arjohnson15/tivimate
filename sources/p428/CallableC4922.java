package p428;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p007.C0937;
import p065.C1500;
import p136.C2096;
import p251.C3130;
import p251.C3136;
import p331.C3759;
import p417.AbstractC4753;
import p456.BinderC5240;
import p456.C5253;
import p456.C5273;
import p456.C5309;
import p456.C5348;
import p456.C5349;
import p456.C5356;
import p456.EnumC5341;
import ˉˆ.ﹳﹳ;
import ˎˊ.ˏʾ;

/* renamed from: ﹶˊ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC4922 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f18602;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f18603;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f18604;

    public /* synthetic */ CallableC4922(Object obj, int i, Object obj2) {
        this.f18604 = i;
        this.f18603 = obj;
        this.f18602 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f18604) {
            case 0:
                Boolean bool = (Boolean) this.f18602;
                boolean zBooleanValue = bool.booleanValue();
                C5349 c5349 = (C5349) this.f18603;
                if (zBooleanValue) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    boolean zBooleanValue2 = bool.booleanValue();
                    C0937 c0937 = ((C4927) c5349.f20757).f18633;
                    if (!zBooleanValue2) {
                        c0937.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    ((C3136) c0937.f4129).m7702(null);
                    ExecutorService executorService = (ExecutorService) ((C4927) c5349.f20757).f18634.ᐧⁱ;
                    return ((C3130) c5349.f20756).m7691(executorService, new C3759(18, this, executorService, false));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                }
                C4927 c4927 = (C4927) c5349.f20757;
                Iterator it = ﹳﹳ.ﹶˆ(((File) c4927.f18645.ˎˑ).listFiles(C4927.f18632)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                C4927 c49272 = (C4927) c5349.f20757;
                ﹳﹳ r1 = ((C2096) c49272.f18637.f16745).f8291;
                C2096.m5944(ﹳﹳ.ﹶˆ(((File) r1.ˆᵔ).listFiles()));
                C2096.m5944(ﹳﹳ.ﹶˆ(((File) r1.ᵢʿ).listFiles()));
                C2096.m5944(ﹳﹳ.ﹶˆ(((File) r1.ﹳﹶ).listFiles()));
                c49272.f18647.m7702(null);
                return ˏʾ.ˏᴵ((Object) null);
            case 1:
                C4927.m11042((C4927) this.f18603, (String) this.f18602, Boolean.FALSE);
                return null;
            case 2:
                return C4925.m11038((C4925) this.f18603, (C1500) this.f18602);
            case 3:
                BinderC5240 binderC5240 = (BinderC5240) this.f18603;
                binderC5240.f20139.m11819();
                return new C5309(binderC5240.f20139.m11797(((C5253) this.f18602).f20334));
            case 4:
                BinderC5240 binderC52402 = (BinderC5240) this.f18603;
                binderC52402.f20139.m11819();
                C5348 c5348 = binderC52402.f20139.f20428;
                C5273.m11792(c5348);
                return c5348.m12075((String) this.f18602);
            default:
                C5253 c5253 = (C5253) this.f18602;
                String str = c5253.f20334;
                AbstractC4753.m10683(str);
                C5273 c5273 = (C5273) this.f18603;
                C5356 c5356M11838 = c5273.m11838(str);
                EnumC5341 enumC5341 = EnumC5341.f20711;
                if (c5356M11838.m12151(enumC5341) && C5356.m12140(100, c5253.f20323).m12151(enumC5341)) {
                    return c5273.m11804(c5253).m11622();
                }
                c5273.mo11655().f20566.m4533("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
