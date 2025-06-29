package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.bumptech.glide.ﹳﹳ;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p031.C1185;
import p031.C1194;
import p031.C1198;
import p031.C1199;
import p031.C1200;
import p032.InterfaceC1205;
import p032.InterfaceC1206;
import p032.InterfaceC1207;
import p032.InterfaceC1208;
import p310.C3581;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1199 f3653 = new C1199(new C1198(2));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1199 f3651 = new C1199(new C1198(3));

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1199 f3652 = new C1199(new C1198(4));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1199 f3654 = new C1199(new C1198(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1200 c1200 = new C1200(InterfaceC1207.class, ScheduledExecutorService.class);
        C1200[] c1200Arr = {new C1200(InterfaceC1207.class, ExecutorService.class), new C1200(InterfaceC1207.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c1200);
        for (C1200 c12002 : c1200Arr) {
            ﹳﹳ.ᐧʻ(c12002, "Null interface");
        }
        Collections.addAll(hashSet, c1200Arr);
        C1194 c1194 = new C1194(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C3581(23), hashSet3);
        C1200 c12003 = new C1200(InterfaceC1205.class, ScheduledExecutorService.class);
        C1200[] c1200Arr2 = {new C1200(InterfaceC1205.class, ExecutorService.class), new C1200(InterfaceC1205.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c12003);
        for (C1200 c12004 : c1200Arr2) {
            ﹳﹳ.ᐧʻ(c12004, "Null interface");
        }
        Collections.addAll(hashSet4, c1200Arr2);
        C1194 c11942 = new C1194(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C3581(24), hashSet6);
        C1200 c12005 = new C1200(InterfaceC1206.class, ScheduledExecutorService.class);
        C1200[] c1200Arr3 = {new C1200(InterfaceC1206.class, ExecutorService.class), new C1200(InterfaceC1206.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c12005);
        for (C1200 c12006 : c1200Arr3) {
            ﹳﹳ.ᐧʻ(c12006, "Null interface");
        }
        Collections.addAll(hashSet7, c1200Arr3);
        C1194 c11943 = new C1194(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C3581(25), hashSet9);
        C1185 c1185M4245 = C1194.m4245(new C1200(InterfaceC1208.class, Executor.class));
        c1185M4245.f4906 = new C3581(26);
        return Arrays.asList(c1194, c11942, c11943, c1185M4245.m4238());
    }
}
