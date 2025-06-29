package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p213.InterfaceC2811;
import p259.C3215;
import p259.InterfaceC3214;
import p259.ViewTreeObserverOnPreDrawListenerC3213;
import p329.AbstractC3740;
import p346.C3993;
import p346.InterfaceC3990;

/* renamed from: com.bumptech.glide.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0286 implements InterfaceC3214 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final View f2358;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3215 f2359;

    public C0286(View view) {
        AbstractC3740.m8706(view, "Argument must not be null");
        this.f2358 = view;
        this.f2359 = new C3215(view);
    }

    public final String toString() {
        return "Target for: " + this.f2358;
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo1557(Drawable drawable) {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo1558(Drawable drawable) {
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo1559() {
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo1560() {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo1561(Drawable drawable) {
        C3215 c3215 = this.f2359;
        ViewTreeObserver viewTreeObserver = c3215.f12523.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c3215.f12522);
        }
        c3215.f12522 = null;
        c3215.f12521.clear();
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo1562() {
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo1563(C3993 c3993) {
        C3215 c3215 = this.f2359;
        View view = c3215.f12523;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM7915 = c3215.m7915(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = c3215.f12523;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iM79152 = c3215.m7915(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM7915 > 0 || iM7915 == Integer.MIN_VALUE) && (iM79152 > 0 || iM79152 == Integer.MIN_VALUE)) {
            c3993.m9254(iM7915, iM79152);
            return;
        }
        ArrayList arrayList = c3215.f12521;
        if (!arrayList.contains(c3993)) {
            arrayList.add(c3993);
        }
        if (c3215.f12522 == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC3213 viewTreeObserverOnPreDrawListenerC3213 = new ViewTreeObserverOnPreDrawListenerC3213(c3215);
            c3215.f12522 = viewTreeObserverOnPreDrawListenerC3213;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3213);
        }
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo1564(C3993 c3993) {
        this.f2359.f12521.remove(c3993);
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC3990 mo1565() {
        Object tag = this.f2358.getTag(R.id._2_res_0x7f0b01a9);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC3990) {
            return (InterfaceC3990) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo1566(InterfaceC3990 interfaceC3990) {
        this.f2358.setTag(R.id._2_res_0x7f0b01a9, interfaceC3990);
    }

    @Override // p259.InterfaceC3214
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo1567(Object obj, InterfaceC2811 interfaceC2811) {
    }
}
