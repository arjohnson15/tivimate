package p428;

import android.content.Context;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p065.C1500;
import p084.C1714;
import p122.AbstractC1907;
import p122.C1913;
import p122.C1934;
import p122.C1943;
import p122.C1969;
import p122.C1971;
import p122.C1973;
import p122.C1976;
import p122.C1990;
import p136.C2096;
import p222.C2907;
import p251.C3136;
import p331.C3758;
import p331.C3761;
import p369.C4183;
import p375.C4305;
import ˉˆ.ﹳﹳ;
import ˎˊ.ˏʾ;
import ᵎﹳ.ᐧʻ;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶˊ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC4926 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Throwable f18627;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C4927 f18628;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Thread f18629;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ long f18630;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ C1500 f18631;

    public CallableC4926(C4927 c4927, long j, Throwable th, Thread thread, C1500 c1500) {
        this.f18628 = c4927;
        this.f18630 = j;
        this.f18627 = th;
        this.f18629 = thread;
        this.f18631 = c1500;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C3758 c3758;
        Thread thread;
        long j = this.f18630;
        long j2 = j / 1000;
        C4927 c4927 = this.f18628;
        NavigableSet navigableSetM5947 = ((C2096) c4927.f18637.f16745).m5947();
        String str = !navigableSetM5947.isEmpty() ? (String) navigableSetM5947.first() : null;
        if (str == null) {
            return ˏʾ.ˏᴵ((Object) null);
        }
        c4927.f18641.m2500();
        C4305 c4305 = c4927.f18637;
        c4305.getClass();
        "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        C4936 c4936 = (C4936) c4305.f16748;
        Context context = c4936.f18677;
        int i = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = this.f18627; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        ـﹶ r14 = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            c3758 = c4936.f18678;
            if (zIsEmpty) {
                break;
            }
            Throwable th = (Throwable) stack.pop();
            r14 = new ـﹶ(th.getLocalizedMessage(), th.getClass().getName(), c3758.mo4704(th.getStackTrace()), r14, 3);
        }
        C1943 c1943 = new C1943();
        c1943.f7403 = "crash";
        c1943.f7406 = j2;
        c1943.f7408 = (byte) (c1943.f7408 | 1);
        AbstractC1907 abstractC1907M5436 = C1714.f6684.m5436(context);
        int i2 = ((C1913) abstractC1907M5436).f7256;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListM5434 = C1714.m5434(context);
        byte b = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) r14.ᐧˋ;
        Thread thread2 = this.f18629;
        String name = thread2.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b2 = (byte) 1;
        List listM11060 = C4936.m11060(stackTraceElementArr, 4);
        if (listM11060 == null) {
            throw new NullPointerException("Null frames");
        }
        String str2 = str;
        if (b2 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b2 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
        }
        arrayList.add(new C1990(4, name, listM11060));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key.equals(thread2)) {
                thread = thread2;
            } else {
                StackTraceElement[] stackTraceElementArrMo4704 = c3758.mo4704(entry.getValue());
                String name2 = key.getName();
                if (name2 == null) {
                    throw new NullPointerException("Null name");
                }
                List listM110602 = C4936.m11060(stackTraceElementArrMo4704, 0);
                if (listM110602 == null) {
                    throw new NullPointerException("Null frames");
                }
                if (b2 != 1) {
                    StringBuilder sb2 = new StringBuilder();
                    if (b2 == 0) {
                        sb2.append(" importance");
                    }
                    throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb2));
                }
                thread = thread2;
                arrayList.add(new C1990(0, name2, listM110602));
            }
            thread2 = thread;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        C1971 c1971M11059 = C4936.m11059(r14, 0);
        C1969 c1969M11058 = C4936.m11058();
        List listM11062 = c4936.m11062();
        if (listM11062 == null) {
            throw new NullPointerException("Null binaries");
        }
        C1973 c1973 = new C1973(listUnmodifiableList, c1971M11059, null, c1969M11058, listM11062);
        if (b != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb3));
        }
        c1943.f7405 = new C1934(c1973, null, null, boolValueOf, abstractC1907M5436, arrayListM5434, i);
        c1943.f7409 = c4936.m11061(i);
        C1976 c1976M5638 = c1943.m5638();
        C4183 c4183 = (C4183) c4305.f16750;
        C2907 c2907 = (C2907) c4305.f16746;
        ((C2096) c4305.f16745).m5948(C4305.m9783(C4305.m9788(c1976M5638, c4183, c2907), c2907), str2, true);
        try {
            ﹳﹳ r3 = c4927.f18645;
            String str3 = ".ae" + j;
            r3.getClass();
            if (!new File((File) r3.ˎˑ, str3).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
        }
        C1500 c1500 = this.f18631;
        c4927.m11043(false, c1500);
        new C4933(c4927.f18644);
        C4927.m11042(c4927, C4933.f18665, Boolean.FALSE);
        if (!c4927.f18633.m3801()) {
            return ˏʾ.ˏᴵ((Object) null);
        }
        ExecutorService executorService = (ExecutorService) c4927.f18634.ᐧⁱ;
        return ((C3136) ((AtomicReference) c1500.f6101).get()).f12093.m7691(executorService, new C3761(this, executorService, str2));
    }
}
