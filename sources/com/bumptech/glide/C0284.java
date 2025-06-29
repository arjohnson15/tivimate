package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import p137.C2106;
import p200.C2741;
import p261.C3233;
import p305.C3532;
import p346.C3992;
import ʾי.ˑʽ;
import ˈˉ.ﹳﹳ;

/* renamed from: com.bumptech.glide.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0284 extends ContextWrapper {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C0291 f2345 = new C0291();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3532 f2346;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List f2347;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C3992 f2348;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final ˑʽ f2349;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ﹳﹳ f2350;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2106 f2351;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2741 f2352;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3233 f2353;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ᵔʼ.ˑʽ f2354;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f2355;

    public C0284(Context context, C2106 c2106, C0295 c0295, ﹳﹳ r4, ᵔʼ.ˑʽ r5, C2741 c2741, List list, C3233 c3233, ˑʽ r9, int i) {
        super(context.getApplicationContext());
        this.f2351 = c2106;
        this.f2350 = r4;
        this.f2354 = r5;
        this.f2347 = list;
        this.f2352 = c2741;
        this.f2353 = c3233;
        this.f2349 = r9;
        this.f2355 = i;
        this.f2346 = new C3532(c0295);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0290 m1555() {
        return (C0290) this.f2346.get();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized C3992 m1556() {
        try {
            if (this.f2348 == null) {
                this.f2354.getClass();
                C3992 c3992 = new C3992();
                c3992.f15386 = true;
                this.f2348 = c3992;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2348;
    }
}
