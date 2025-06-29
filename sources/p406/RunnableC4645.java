package p406;

import android.app.job.JobParameters;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p061.C1440;
import p166.AbstractC2394;
import p166.C2412;
import p331.C3760;
import p374.C4290;
import p383.AbstractC4464;
import p395.AbstractC4535;
import p414.C4722;
import p414.C4736;
import p414.InterfaceC4712;
import p438.C5076;
import p438.C5108;
import p438.C5110;
import p438.C5118;
import p438.C5119;
import p438.C5120;

/* renamed from: ﹳʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4645 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f17758;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17759;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17760;

    public /* synthetic */ RunnableC4645(Object obj, int i, Object obj2) {
        this.f17760 = i;
        this.f17758 = obj;
        this.f17759 = obj2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m10550() {
        C5108 c5108 = (C5108) this.f17759;
        ((C5076) this.f17758).getClass();
        try {
            synchronized (c5108) {
            }
            try {
                c5108.f19442.mo1125(c5108.f19445, c5108.f19439);
            } finally {
                c5108.m11320(true);
            }
        } catch (ExoPlaybackException e) {
            AbstractC4464.m10147("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        long j2;
        boolean z2 = true;
        switch (this.f17760) {
            case 0:
                AbstractC4535.m10357((C4722) this.f17758, ((UUID) this.f17759).toString());
                return;
            case 1:
                C4736 c4736 = (C4736) this.f17758;
                C3760 c3760 = (C3760) this.f17759;
                synchronized (c4736.f18165) {
                    try {
                        Iterator it = c4736.f18164.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC4712) it.next()).mo1386(c3760, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                C5118 c5118 = (C5118) this.f17758;
                C1440 c1440 = (C1440) this.f17759;
                int i = c5118.f19551 - c1440.f5905;
                c5118.f19551 = i;
                if (c1440.f5910) {
                    c5118.f19552 = c1440.f5906;
                    c5118.f19550 = true;
                }
                if (i == 0) {
                    AbstractC2394 abstractC2394 = ((C5110) c1440.f5909).f19459;
                    if (!c5118.f19520.f19459.m6477() && abstractC2394.m6477()) {
                        c5118.f19531 = -1;
                        c5118.f19537 = 0L;
                    }
                    if (!abstractC2394.m6477()) {
                        List listAsList = Arrays.asList(((C5120) abstractC2394).f19587);
                        AbstractC4464.m10132(listAsList.size() == c5118.f19570.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((C5119) c5118.f19570.get(i2)).f19581 = (AbstractC2394) listAsList.get(i2);
                        }
                    }
                    if (c5118.f19550) {
                        if (((C5110) c1440.f5909).f19448.equals(c5118.f19520.f19448) && ((C5110) c1440.f5909).f19466 == c5118.f19520.f19463) {
                            z2 = false;
                        }
                        if (z2) {
                            if (abstractC2394.m6477() || ((C5110) c1440.f5909).f19448.m9753()) {
                                j2 = ((C5110) c1440.f5909).f19466;
                            } else {
                                C5110 c5110 = (C5110) c1440.f5909;
                                C4290 c4290 = c5110.f19448;
                                long j3 = c5110.f19466;
                                Object obj = c4290.f16693;
                                C2412 c2412 = c5118.f19545;
                                abstractC2394.mo6479(obj, c2412);
                                j2 = j3 + c2412.f9575;
                            }
                            z = z2;
                            j = j2;
                        } else {
                            j = -9223372036854775807L;
                            z = z2;
                        }
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    c5118.f19550 = false;
                    c5118.m11380((C5110) c1440.f5909, 1, z, c5118.f19552, j, -1, false);
                    return;
                }
                return;
            case 3:
                m10550();
                return;
            default:
                int i3 = JobInfoSchedulerService.f2407;
                ((JobInfoSchedulerService) this.f17758).jobFinished((JobParameters) this.f17759, false);
                return;
        }
    }
}
