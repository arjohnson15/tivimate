package androidx.leanback.widget;

import android.content.Context;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.util.ArrayList;
import p254.C3159;
import p383.C4457;

/* renamed from: androidx.leanback.widget.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0153 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f1071;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f1072;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f1073;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f1074;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f1075;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f1076;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f1077;

    public C0153() {
        this.f1075 = new int[255];
        this.f1076 = new C4457(255);
    }

    public C0153(Context context) {
        this.f1073 = 0;
        this.f1077 = 1;
        this.f1072 = 0;
        this.f1075 = context;
        this.f1074 = 112;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m930(int i) {
        this.f1072 = i;
        if (this.f1073 != 0) {
            throw new IllegalArgumentException("Editable actions cannot also be in check sets");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r10.f12217 >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r10.m7826(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        return false;
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m931(p254.C3159 r10, long r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            long r0 = r10.f12217
            long r2 = r10.mo4865()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            p383.AbstractC4464.m10142(r0)
            java.lang.Object r0 = r9.f1076
            ᵢᵢ.ˋⁱ r0 = (p383.C4457) r0
            r1 = 4
            r0.m10099(r1)
        L1a:
            r2 = -1
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 == 0) goto L29
            long r2 = r10.f12217
            r7 = 4
            long r2 = r2 + r7
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 >= 0) goto L49
        L29:
            byte[] r2 = r0.f17171
            boolean r2 = r10.mo4875(r2, r4, r1, r5)     // Catch: java.io.EOFException -> L30
            goto L32
        L30:
            r2 = 0
        L32:
            if (r2 == 0) goto L49
            r0.m10108(r4)
            long r2 = r0.m10110()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L45
            r10.f12219 = r4
            return r5
        L45:
            r10.mo4854(r5)
            goto L1a
        L49:
            if (r6 == 0) goto L51
            long r0 = r10.f12217
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L59
        L51:
            int r0 = r10.m7826(r5)
            r1 = -1
            if (r0 == r1) goto L59
            goto L49
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0153.m931(יי.ˉⁱ, long):boolean");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m932(boolean z) {
        this.f1074 = ((z ? 1 : 0) & 1) | (this.f1074 & (~1));
        if (this.f1073 != 0) {
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C0203 m933() {
        C0203 c0203 = new C0203();
        c0203.f1209 = -1L;
        new ArrayList();
        c0203.f1209 = this.f1071;
        c0203.f1208 = (String) this.f1076;
        c0203.f1210 = null;
        c0203.f1212 = null;
        c0203.f1211 = null;
        c0203.f1201 = null;
        c0203.f1207 = this.f1073;
        c0203.f1213 = 524289;
        c0203.f1203 = 524289;
        c0203.f1206 = 1;
        c0203.f1204 = this.f1077;
        c0203.f1202 = this.f1074;
        c0203.f1205 = this.f1072;
        return c0203;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m934(int i) {
        this.f1076 = ((Context) this.f1075).getString(i);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean m935(C3159 c3159, boolean z) throws ParserException, EOFException {
        boolean zMo4875;
        boolean zMo48752;
        this.f1074 = 0;
        this.f1071 = 0L;
        this.f1073 = 0;
        this.f1077 = 0;
        this.f1072 = 0;
        C4457 c4457 = (C4457) this.f1076;
        c4457.m10099(27);
        try {
            zMo4875 = c3159.mo4875(c4457.f17171, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo4875 = false;
        }
        if (!zMo4875 || c4457.m10110() != 1332176723) {
            return false;
        }
        if (c4457.m10086() != 0) {
            if (z) {
                return false;
            }
            throw ParserException.m1096("unsupported bit stream revision");
        }
        this.f1074 = c4457.m10086();
        this.f1071 = c4457.m10090();
        c4457.m10087();
        c4457.m10087();
        c4457.m10087();
        int iM10086 = c4457.m10086();
        this.f1073 = iM10086;
        this.f1077 = iM10086 + 27;
        c4457.m10099(iM10086);
        try {
            zMo48752 = c3159.mo4875(c4457.f17171, 0, this.f1073, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zMo48752 = false;
        }
        if (!zMo48752) {
            return false;
        }
        for (int i = 0; i < this.f1073; i++) {
            int iM100862 = c4457.m10086();
            ((int[]) this.f1075)[i] = iM100862;
            this.f1072 += iM100862;
        }
        return true;
    }
}
