package com.bumptech.glide.load.engine;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p261.C3247;
import p314.InterfaceC3594;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final StackTraceElement[] f2329 = new StackTraceElement[0];

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public InterfaceC3594 f2330;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f2331;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f2332;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Class f2333;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final List f2334;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public GlideException(String str, List list) {
        this.f2331 = str;
        setStackTrace(f2329);
        this.f2334 = list;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m1545(List list, C3247 c3247) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c3247.append("Cause (");
            int i2 = i + 1;
            c3247.append(String.valueOf(i2));
            c3247.append(" of ");
            c3247.append(String.valueOf(size));
            c3247.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m1548(c3247);
            } else {
                m1546(th, c3247);
            }
            i = i2;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m1546(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m1547(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((GlideException) th).f2334.iterator();
        while (it.hasNext()) {
            m1547((Throwable) it.next(), arrayList);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f2331);
        String str2 = "";
        if (this.f2333 != null) {
            str = ", " + this.f2333;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.f2332;
        sb.append(i != 0 ? ", ".concat(ˉᵎ.ﾞʽ(i)) : "");
        if (this.f2330 != null) {
            str2 = ", " + this.f2330;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        m1547(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        m1548(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        m1548(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        m1548(printWriter);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m1548(Appendable appendable) throws IOException {
        m1546(this, appendable);
        try {
            m1545(this.f2334, new C3247(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m1549() {
        ArrayList arrayList = new ArrayList();
        m1547(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            sb.toString();
            i = i2;
        }
    }
}
