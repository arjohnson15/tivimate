package p065;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p034.InterfaceC1225;
import p262.InterfaceC3253;
import p330.InterfaceC3747;

/* renamed from: ʾᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1509 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f6127;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List f6128;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final InterfaceC3747 f6129;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Intent f6130;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean f6131;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Set f6132;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final List f6133;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean f6134;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final File f6135;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Executor f6136;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC1225 f6137;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final Callable f6138;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f6139;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f6140;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f6141;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final String f6142;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean f6143;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final List f6144;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final InterfaceC3253 f6145;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1496 f6146;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Executor f6147;

    public C1509(Context context, String str, InterfaceC1225 interfaceC1225, C1496 c1496, List list, boolean z, int i, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, InterfaceC3253 interfaceC3253, InterfaceC3747 interfaceC3747) {
        this.f6139 = context;
        this.f6127 = str;
        this.f6137 = interfaceC1225;
        this.f6146 = c1496;
        this.f6128 = list;
        this.f6140 = z;
        this.f6141 = i;
        this.f6136 = executor;
        this.f6147 = executor2;
        this.f6130 = intent;
        this.f6134 = z2;
        this.f6131 = z3;
        this.f6132 = set;
        this.f6142 = str2;
        this.f6135 = file;
        this.f6138 = callable;
        this.f6144 = list2;
        this.f6133 = list3;
        this.f6143 = z4;
        this.f6145 = interfaceC3253;
        this.f6129 = interfaceC3747;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m5081(int i, int i2) {
        if ((i > i2 && this.f6131) || !this.f6134) {
            return false;
        }
        Set set = this.f6132;
        return set == null || !set.contains(Integer.valueOf(i));
    }
}
