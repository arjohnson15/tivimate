package p279;

import android.content.Context;
import java.util.LinkedHashSet;
import p013.AbstractC1041;
import p106.ExecutorC1797;
import ʻˉ.ᐧˋ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ٴ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3370 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f13190;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f13191;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﹶˆ f13193;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f13192 = new Object();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final LinkedHashSet f13194 = new LinkedHashSet();

    public AbstractC3370(Context context, ﹶˆ r2) {
        this.f13193 = r2;
        this.f13190 = context.getApplicationContext();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8227(Object obj) {
        synchronized (this.f13192) {
            Object obj2 = this.f13191;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f13191 = obj;
                ((ExecutorC1797) this.f13193.ᐧˋ).execute(new ᐧˋ(AbstractC1041.m4016(this.f13194), 13, this));
            }
        }
    }

    /* renamed from: ˑʽ */
    public abstract void mo8225();

    /* renamed from: ـﹶ */
    public abstract Object mo8223();

    /* renamed from: ﹳﹳ */
    public abstract void mo8226();
}
