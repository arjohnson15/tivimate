package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.media.session.AbstractC0002;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import androidx.leanback.widget.C0159;
import androidx.leanback.widget.RunnableC0134;
import com.bumptech.glide.load.data.InterfaceC0270;
import com.bumptech.glide.load.data.InterfaceC0281;
import com.google.android.gms.internal.measurement.C0559;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p003.C0910;
import p019.C1124;
import p019.C1128;
import p033.C1220;
import p052.C1327;
import p052.ExecutorC1321;
import p061.C1410;
import p061.InterfaceC1411;
import p063.C1454;
import p137.C2104;
import p137.InterfaceC2103;
import p141.RunnableC2187;
import p175.C2484;
import p180.AbstractC2500;
import p197.AbstractC2726;
import p197.C2718;
import p234.C3078;
import p261.C3227;
import p261.C3229;
import p261.C3231;
import p261.RunnableC3230;
import p266.C3264;
import p283.C3380;
import p314.InterfaceC3594;
import p319.C3635;
import p329.AbstractC3740;
import p334.C3789;
import p337.InterfaceC3822;
import p361.C4092;
import p362.C4125;
import p368.C4177;
import p374.C4261;
import p374.C4290;
import p374.InterfaceC4286;
import p383.C4457;
import p383.C4469;
import p383.RunnableC4466;
import p385.InterfaceC4485;
import p395.RunnableC4533;
import p396.C4554;
import p396.C4580;
import p396.C4590;
import p396.InterfaceC4575;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import p438.C5074;
import p438.C5088;
import p438.C5120;
import p438.RunnableC5073;
import p438.RunnableC5094;
import p438.RunnableC5095;

/* renamed from: com.google.android.gms.internal.measurement.ﹳﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0559 implements InterfaceC0387, InterfaceC4602, InterfaceC0281, InterfaceC4575, InterfaceC4286, InterfaceC4485 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C0559 f2911;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f2912;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f2913;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f2914;

    public C0559(int i) {
        this.f2914 = i;
        switch (i) {
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f2912 = new C2104(null);
                this.f2913 = new HashMap();
                break;
            case 11:
                this.f2912 = new C4457();
                this.f2913 = new C3078();
                break;
            case 16:
                this.f2912 = new HashMap();
                this.f2913 = new C1454(1);
                break;
            default:
                this.f2912 = null;
                this.f2913 = null;
                break;
        }
    }

    public /* synthetic */ C0559(int i, Object obj, Object obj2, boolean z) {
        this.f2914 = i;
        this.f2913 = obj;
        this.f2912 = obj2;
    }

    public /* synthetic */ C0559(int i, boolean z) {
        this.f2914 = i;
    }

    public C0559(Context context) {
        this.f2914 = 0;
        this.f2912 = context;
        ˎـ r0 = new ˎـ((Handler) null, 0);
        this.f2913 = r0;
        context.getContentResolver().registerContentObserver(AbstractC0573.f2936, true, r0);
    }

    public C0559(Handler handler, InterfaceC3822 interfaceC3822) {
        this.f2914 = 14;
        if (interfaceC3822 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f2912 = handler;
        this.f2913 = interfaceC3822;
    }

    public C0559(EditText editText) {
        this.f2914 = 3;
        this.f2912 = editText;
        C1128 c1128 = new C1128(editText);
        this.f2913 = c1128;
        editText.addTextChangedListener(c1128);
        if (C1124.f4747 == null) {
            synchronized (C1124.f4749) {
                try {
                    if (C1124.f4747 == null) {
                        C1124 c1124 = new C1124();
                        try {
                            C1124.f4748 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1124.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C1124.f4747 = c1124;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C1124.f4747);
    }

    public C0559(C0159 c0159) {
        this.f2914 = 1;
        this.f2913 = c0159;
        this.f2912 = new Rect();
    }

    public /* synthetic */ C0559(Object obj) {
        this.f2914 = 18;
        this.f2913 = obj;
        this.f2912 = new ArrayList();
    }

    public /* synthetic */ C0559(Object obj, int i, Object obj2) {
        this.f2914 = i;
        this.f2912 = obj;
        this.f2913 = obj2;
    }

    public C0559(InterfaceC1411 interfaceC1411) {
        this.f2914 = 5;
        this.f2912 = interfaceC1411;
        C1410 c1410 = new C1410();
        c1410.f5763 = 0;
        this.f2913 = c1410;
    }

    public C0559(C2718 c2718, AbstractC2726 abstractC2726) {
        this.f2914 = 10;
        this.f2913 = c2718;
        c2718.f10638 = true;
        this.f2912 = c2718.m6903(abstractC2726);
    }

    public C0559(C3635 c3635, C3264 c3264) {
        this.f2914 = 15;
        this.f2913 = "ClientTelemetry.API";
        this.f2912 = c3635;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static synchronized void m2478() {
        Context context;
        try {
            C0559 c0559 = f2911;
            if (c0559 != null && (context = (Context) c0559.f2912) != null && ((ˎـ) c0559.f2913) != null) {
                context.getContentResolver().unregisterContentObserver((ˎـ) f2911.f2913);
            }
            f2911 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        switch (this.f2914) {
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SMB2FileId{persistentHandle=" + AbstractC2500.m6611((byte[]) this.f2912) + '}';
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C2104 c2104 = (C2104) this.f2912;
                C2104 c21042 = c2104.f8311;
                boolean z = false;
                while (!c21042.equals(c2104)) {
                    sb.append('{');
                    sb.append(c21042.f8312);
                    sb.append(':');
                    ArrayList arrayList = c21042.f8310;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c21042 = c21042.f8311;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 18:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f2913.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList2 = (ArrayList) this.f2912;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList2.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // p396.InterfaceC4575
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Type mo2479() {
        return (Type) this.f2912;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ʿʼ */
    public void mo1540(Object obj) {
        C3229 c3229 = (C3229) this.f2913;
        C0910 c0910 = (C0910) this.f2912;
        C0910 c09102 = c3229.f12552;
        if (c09102 == null || c09102 != c0910) {
            return;
        }
        C3229 c32292 = (C3229) this.f2913;
        C0910 c09103 = (C0910) this.f2912;
        C3231 c3231 = c32292.f12551.f12627;
        if (obj != null && c3231.m7978(c09103.f4067.mo1531())) {
            c32292.f12548 = obj;
            c32292.f12547.m7969(2);
        } else {
            RunnableC3230 runnableC3230 = c32292.f12547;
            InterfaceC3594 interfaceC3594 = c09103.f4068;
            InterfaceC0270 interfaceC0270 = c09103.f4067;
            runnableC3230.mo7959(interfaceC3594, obj, interfaceC0270, interfaceC0270.mo1531(), c32292.f12553);
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean m2480(View view) {
        InterfaceC1411 interfaceC1411 = (InterfaceC1411) this.f2912;
        int iM4900 = interfaceC1411.m4900();
        int iM4897 = interfaceC1411.m4897();
        int iM4898 = interfaceC1411.m4898(view);
        int iM4896 = interfaceC1411.m4896(view);
        C1410 c1410 = (C1410) this.f2913;
        c1410.f5760 = iM4900;
        c1410.f5762 = iM4897;
        c1410.f5764 = iM4898;
        c1410.f5761 = iM4896;
        c1410.f5763 = 24579;
        return c1410.m4892();
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public void mo2481(int i, C4290 c4290, C2484 c2484) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5073(this, pairM2504, c2484, 0));
        }
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public void mo2482(int i, C4290 c4290, C4261 c4261, C2484 c2484) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5094(this, pairM2504, c4261, c2484, 0));
        }
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public void mo2483(int i, C4290 c4290, Exception exc) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC2187(this, pairM2504, exc, 14));
        }
    }

    @Override // p396.InterfaceC4575
    /* renamed from: ˉי, reason: contains not printable characters */
    public Object mo2484(C4590 c4590) {
        Executor executor = (Executor) this.f2913;
        return executor == null ? c4590 : new C4580(executor, c4590);
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void mo2485(int i, C4290 c4290, C4261 c4261, C2484 c2484) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5094(this, pairM2504, c4261, c2484, 2));
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public void m2486(C1327 c1327) {
        int i = c1327.f5389;
        ExecutorC1321 executorC1321 = (ExecutorC1321) this.f2913;
        C4554 c4554 = (C4554) this.f2912;
        if (i != 0) {
            executorC1321.execute(new RunnableC0134(i, 2, c4554));
        } else {
            executorC1321.execute(new RunnableC4533(c4554, 4, c1327.f5390));
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m2487(Object obj, String str) {
        ((ArrayList) this.f2912).add(ᵎﹳ.ᐧʻ.ˋⁱ(str, "=", String.valueOf(obj)));
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public void mo2488(int i, C4290 c4290, C2484 c2484) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5073(this, pairM2504, c2484, 1));
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long[] m2489(int i) {
        Semaphore semaphore = (Semaphore) this.f2913;
        try {
            if (!semaphore.tryAcquire(i, 5000L, TimeUnit.MILLISECONDS)) {
                throw new SMBRuntimeException("Not enough credits (" + semaphore.availablePermits() + " available) to hand out " + i + " sequence numbers");
            }
            long j = i;
            long andAdd = ((AtomicLong) this.f2912).getAndAdd(j);
            int i2 = (int) ((j + andAdd) - andAdd);
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = i3 + andAdd;
            }
            return jArr;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            StringBuilder sbM40 = AbstractC0002.m40(i, "Got interrupted waiting for ", " to be available. Credits available at this moment: ");
            sbM40.append(semaphore.availablePermits());
            throw new SMBRuntimeException(sbM40.toString());
        }
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int mo2490() {
        return 1;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m2491(C5074 c5074) {
        synchronized (c5074) {
        }
        Handler handler = (Handler) this.f2912;
        if (handler != null) {
            handler.post(new ʻˉ.ᐧˋ(this, 20, c5074));
        }
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC4599 mo2492(byte[] bArr, int i, int i2) {
        return ᵎﹳ.ᐧʻ.ʽᐧ(this, bArr, i2);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0281
    /* renamed from: ˑʽ */
    public void mo1541(Exception exc) {
        C3229 c3229 = (C3229) this.f2913;
        C0910 c0910 = (C0910) this.f2912;
        C0910 c09102 = c3229.f12552;
        if (c09102 == null || c09102 != c0910) {
            return;
        }
        C3229 c32292 = (C3229) this.f2913;
        C0910 c09103 = (C0910) this.f2912;
        RunnableC3230 runnableC3230 = c32292.f12547;
        C3227 c3227 = c32292.f12553;
        InterfaceC0270 interfaceC0270 = c09103.f4067;
        runnableC3230.mo7961(c3227, exc, interfaceC0270, interfaceC0270.mo1531());
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public View m2493(int i, int i2, int i3, int i4) {
        InterfaceC1411 interfaceC1411 = (InterfaceC1411) this.f2912;
        int iM4900 = interfaceC1411.m4900();
        int iM4897 = interfaceC1411.m4897();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewM4899 = interfaceC1411.m4899(i);
            int iM4898 = interfaceC1411.m4898(viewM4899);
            int iM4896 = interfaceC1411.m4896(viewM4899);
            C1410 c1410 = (C1410) this.f2913;
            c1410.f5760 = iM4900;
            c1410.f5762 = iM4897;
            c1410.f5764 = iM4898;
            c1410.f5761 = iM4896;
            if (i3 != 0) {
                c1410.f5763 = i3;
                if (c1410.m4892()) {
                    return viewM4899;
                }
            }
            if (i4 != 0) {
                c1410.f5763 = i4;
                if (c1410.m4892()) {
                    view = viewM4899;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // p374.InterfaceC4286
    /* renamed from: יʻ, reason: contains not printable characters */
    public void mo2494(int i, C4290 c4290, final C4261 c4261, final C2484 c2484, final IOException iOException, final boolean z) {
        final Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            final int i2 = 1;
            ((C4469) ((C4092) this.f2913).f15788).m10158(new Runnable() { // from class: ᵢˎ.ˎˑ
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᵢˎ.ᵢʿ] */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            ᐧʻ r0 = (ᐧʻ) this;
                            int i3 = r0.ˆʿ;
                            pairM2504.mo2494(i3, (C4290) r0.ˎˑ, c4261, c2484, iOException, z);
                            break;
                        default:
                            C1220 c1220 = (C1220) ((C4092) ((C0559) this).f2913).f15797;
                            Pair pair = (Pair) pairM2504;
                            c1220.mo2494(((Integer) pair.first).intValue(), (C4290) pair.second, c4261, c2484, iOException, z);
                            break;
                    }
                }
            });
        }
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public /* synthetic */ void mo2495() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        r3 = false;
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0387
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo2109(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object r1 = r9.f2912
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L9b
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC0549.m2471()
            if (r2 == 0) goto L60
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC0549.f2898
            r3 = 1
            if (r2 == 0) goto L13
            goto L5b
        L13:
            java.lang.Class<com.google.android.gms.internal.measurement.ﹳˋ> r2 = com.google.android.gms.internal.measurement.AbstractC0549.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC0549.f2898     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L5b
        L1c:
            r10 = move-exception
            goto L5e
        L1e:
            r4 = 1
        L1f:
            r5 = 2
            r6 = 0
            r7 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.AbstractC0549.f2899     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L30
            java.lang.Object r5 = android.support.v4.media.AbstractC0005.m91(r1)     // Catch: java.lang.Throwable -> L1c
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.measurement.AbstractC0549.f2899 = r5     // Catch: java.lang.Throwable -> L1c
        L30:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.AbstractC0549.f2899     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L35
            goto L56
        L35:
            boolean r8 = com.google.android.gms.internal.measurement.AbstractC0513.m2374(r5)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L46
            if (r8 != 0) goto L52
            android.os.UserHandle r8 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L46
            boolean r1 = r5.isUserRunning(r8)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L46
            if (r1 != 0) goto L51
            goto L52
        L46:
            r5 = move-exception
            java.lang.String r7 = "DirectBootUtils"
            java.lang.String r8 = "Failed to check if user is unlocked."
            com.google.android.gms.internal.measurement.AbstractC0549.f2899 = r6     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto L1f
        L51:
            r3 = 0
        L52:
            if (r3 == 0) goto L56
            com.google.android.gms.internal.measurement.AbstractC0549.f2899 = r6     // Catch: java.lang.Throwable -> L1c
        L56:
            if (r3 == 0) goto L5a
            com.google.android.gms.internal.measurement.AbstractC0549.f2898 = r3     // Catch: java.lang.Throwable -> L1c
        L5a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
        L5b:
            if (r3 != 0) goto L60
            goto L9b
        L5e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r10
        L60:
            com.google.android.gms.internal.measurement.ﹳﾞ r1 = new com.google.android.gms.internal.measurement.ﹳﾞ     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            r2 = 2
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            r1.f2912 = r9     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            r1.f2913 = r10     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            java.lang.Object r1 = r1.m2503()     // Catch: java.lang.SecurityException -> L70 java.lang.NullPointerException -> L7f java.lang.IllegalStateException -> L83
            goto L7b
        L70:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            java.lang.Object r1 = r1.m2503()     // Catch: java.lang.Throwable -> L85
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
        L7b:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            r0 = r1
            goto L9b
        L7f:
            r1 = move-exception
            goto L8a
        L81:
            r1 = move-exception
            goto L8a
        L83:
            r1 = move-exception
            goto L8a
        L85:
            r1 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
            throw r1     // Catch: java.lang.NullPointerException -> L7f java.lang.SecurityException -> L81 java.lang.IllegalStateException -> L83
        L8a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to read GServices for: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.lang.String r2 = "GservicesLoader"
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0559.mo2109(java.lang.String):java.lang.Object");
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void mo2496(int i, C4290 c4290) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5095(this, pairM2504, 1));
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public void m2497(C3380 c3380) {
        byte[] bArr = (byte[]) this.f2912;
        c3380.mo6213(bArr.length, bArr);
        byte[] bArr2 = (byte[]) this.f2913;
        c3380.mo6213(bArr2.length, bArr2);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object m2498() {
        C2104 c2104 = (C2104) this.f2912;
        C2104 c21042 = c2104.f8313;
        while (true) {
            if (c21042.equals(c2104)) {
                return null;
            }
            ArrayList arrayList = c21042.f8310;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c21042.f8310.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C2104 c21043 = c21042.f8313;
            c21043.f8311 = c21042.f8311;
            c21042.f8311.f8313 = c21043;
            HashMap map = (HashMap) this.f2913;
            InterfaceC2103 interfaceC2103 = c21042.f8312;
            map.remove(interfaceC2103);
            interfaceC2103.mo5953();
            c21042 = c21042.f8313;
        }
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public void mo2499(int i, C4290 c4290, int i2) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC4466(this, pairM2504, i2, 3));
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m2500() throws IOException {
        String str = (String) this.f2912;
        try {
            ˉˆ.ﹳﹳ r1 = (ˉˆ.ﹳﹳ) this.f2913;
            r1.getClass();
            new File((File) r1.ˎˑ, str).createNewFile();
        } catch (IOException e) {
            "Error creating marker: ".concat(str);
        }
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void mo2501(int i, C4290 c4290) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5095(this, pairM2504, 2));
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public Object m2502(InterfaceC2103 interfaceC2103) {
        HashMap map = (HashMap) this.f2913;
        C2104 c2104 = (C2104) map.get(interfaceC2103);
        if (c2104 == null) {
            c2104 = new C2104(interfaceC2103);
            map.put(interfaceC2103, c2104);
        } else {
            interfaceC2103.mo5953();
        }
        C2104 c21042 = c2104.f8313;
        c21042.f8311 = c2104.f8311;
        c2104.f8311.f8313 = c21042;
        C2104 c21043 = (C2104) this.f2912;
        c2104.f8313 = c21043;
        C2104 c21044 = c21043.f8311;
        c2104.f8311 = c21044;
        c21044.f8313 = c2104;
        c2104.f8313.f8311 = c2104;
        ArrayList arrayList = c2104.f8310;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c2104.f8310.remove(size - 1);
        }
        return null;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object m2503() {
        C0559 c0559 = (C0559) this.f2912;
        String str = (String) this.f2913;
        ContentResolver contentResolver = ((Context) c0559.f2912).getContentResolver();
        C0372 c0372 = AbstractC0544.f2886;
        if (contentResolver == null) {
            c0372.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (c0372) {
            try {
                if (((HashMap) c0372.f2633) == null) {
                    ((AtomicBoolean) c0372.f2629).set(false);
                    c0372.f2633 = new HashMap(16, 1.0f);
                    c0372.f2632 = new Object();
                    contentResolver.registerContentObserver(AbstractC0573.f2936, true, new C0448(0, c0372));
                } else if (((AtomicBoolean) c0372.f2629).getAndSet(false)) {
                    ((HashMap) c0372.f2633).clear();
                    ((HashMap) c0372.f2637).clear();
                    ((HashMap) c0372.f2630).clear();
                    ((HashMap) c0372.f2635).clear();
                    ((HashMap) c0372.f2636).clear();
                    c0372.f2632 = new Object();
                    c0372.f2634 = false;
                }
                Object obj = c0372.f2632;
                if (((HashMap) c0372.f2633).containsKey(str)) {
                    String str2 = (String) ((HashMap) c0372.f2633).get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : (String[]) c0372.f2638) {
                    if (str.startsWith(str3)) {
                        if (!c0372.f2634) {
                            String[] strArr = (String[]) c0372.f2638;
                            try {
                                C0553 c0553 = (C0553) c0372.f2631;
                                C0553 c05532 = new C0553(2);
                                c0553.getClass();
                                HashMap mapM2472 = C0553.m2472(contentResolver, strArr, c05532);
                                if (!mapM2472.isEmpty()) {
                                    Set setKeySet = mapM2472.keySet();
                                    setKeySet.removeAll(((HashMap) c0372.f2637).keySet());
                                    setKeySet.removeAll(((HashMap) c0372.f2630).keySet());
                                    setKeySet.removeAll(((HashMap) c0372.f2635).keySet());
                                    setKeySet.removeAll(((HashMap) c0372.f2636).keySet());
                                }
                                if (!mapM2472.isEmpty()) {
                                    if (((HashMap) c0372.f2633).isEmpty()) {
                                        c0372.f2633 = mapM2472;
                                    } else {
                                        ((HashMap) c0372.f2633).putAll(mapM2472);
                                    }
                                }
                                c0372.f2634 = true;
                            } catch (zzhx unused) {
                            }
                            if (((HashMap) c0372.f2633).containsKey(str)) {
                                String str4 = (String) ((HashMap) c0372.f2633).get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    ((C0553) c0372.f2631).getClass();
                    String strM2476 = C0553.m2476(contentResolver, str);
                    if (strM2476 != null && strM2476.equals(null)) {
                        strM2476 = null;
                    }
                    synchronized (c0372) {
                        try {
                            if (obj == c0372.f2632) {
                                ((HashMap) c0372.f2633).put(str, strM2476);
                            }
                        } finally {
                        }
                    }
                    if (strM2476 != null) {
                        return strM2476;
                    }
                    return null;
                } catch (zzhx unused2) {
                    return null;
                }
            } finally {
            }
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public Pair m2504(int i, C4290 c4290) {
        C4290 c4290M9754;
        C5088 c5088 = (C5088) this.f2912;
        C4290 c42902 = null;
        if (c4290 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= c5088.f19336.size()) {
                    c4290M9754 = null;
                    break;
                }
                if (((C4290) c5088.f19336.get(i2)).f16694 == c4290.f16694) {
                    Object obj = c5088.f19334;
                    int i3 = C5120.f19583;
                    c4290M9754 = c4290.m9754(Pair.create(obj, c4290.f16693));
                    break;
                }
                i2++;
            }
            if (c4290M9754 == null) {
                return null;
            }
            c42902 = c4290M9754;
        }
        return Pair.create(Integer.valueOf(i + c5088.f19338), c42902);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public void m2505(String str) {
        C4177 c4177;
        synchronized (this) {
            try {
                c4177 = (C4177) ((HashMap) this.f2912).get(str);
                AbstractC3740.m8706(c4177, "Argument must not be null");
                int i = c4177.f16121;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c4177.f16121);
                }
                int i2 = i - 1;
                c4177.f16121 = i2;
                if (i2 == 0) {
                    C4177 c41772 = (C4177) ((HashMap) this.f2912).remove(str);
                    if (!c41772.equals(c4177)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c4177 + ", but actually removed: " + c41772 + ", safeKey: " + str);
                    }
                    ((C1454) this.f2913).m5008(c41772);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c4177.f16122.unlock();
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public /* synthetic */ void mo2506(byte[] bArr, C4601 c4601, C4125 c4125) {
        ᵎﹳ.ᐧʻ.ـﹶ(this, bArr, c4601, c4125);
    }

    @Override // p385.InterfaceC4485
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public void mo2507(int i, C4290 c4290) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5095(this, pairM2504, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a7, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // p397.InterfaceC4602
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2508(byte[] r20, int r21, int r22, p397.C4601 r23, p383.InterfaceC4462 r24) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0559.mo2508(byte[], int, int, ⁱᵎ.ˉⁱ, ᵢᵢ.ˑʽ):void");
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public void m2509(InterfaceC2103 interfaceC2103, Object obj) {
        HashMap map = (HashMap) this.f2913;
        C2104 c2104 = (C2104) map.get(interfaceC2103);
        if (c2104 == null) {
            c2104 = new C2104(interfaceC2103);
            c2104.f8313 = c2104;
            C2104 c21042 = (C2104) this.f2912;
            c2104.f8313 = c21042.f8313;
            c2104.f8311 = c21042;
            c21042.f8313 = c2104;
            c2104.f8313.f8311 = c2104;
            map.put(interfaceC2103, c2104);
        } else {
            interfaceC2103.mo5953();
        }
        if (c2104.f8310 == null) {
            c2104.f8310 = new ArrayList();
        }
        c2104.f8310.add(obj);
    }

    @Override // p374.InterfaceC4286
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public void mo2510(int i, C4290 c4290, C4261 c4261, C2484 c2484) {
        Pair pairM2504 = m2504(i, c4290);
        if (pairM2504 != null) {
            ((C4469) ((C4092) this.f2913).f15788).m10158(new RunnableC5094(this, pairM2504, c4261, c2484, 1));
        }
    }
}
