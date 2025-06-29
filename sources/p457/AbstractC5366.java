package p457;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;
import p410.C4681;

/* renamed from: ﾞﹶ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5366 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final WorkerParameters f20826;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AtomicInteger f20827 = new AtomicInteger(-256);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f20828;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f20829;

    public AbstractC5366(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f20828 = context;
        this.f20826 = workerParameters;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m12160() {
        return this.f20826.f1760;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m12161() {
        return this.f20827.get() != -256;
    }

    /* renamed from: ـﹶ */
    public abstract C4681 mo1368();

    /* renamed from: ﹳﹳ */
    public abstract C4681 mo1370();
}
