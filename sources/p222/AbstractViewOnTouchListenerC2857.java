package p222;

import android.view.View;
import android.view.ViewConfiguration;
import p320.InterfaceC3653;

/* renamed from: ˏᴵ.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2857 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f11101;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public RunnableC2906 f11102;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f11103;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f11104;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int[] f11105 = new int[2];

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final View f11106;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f11107;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public RunnableC2906 f11108;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f11109;

    public AbstractViewOnTouchListenerC2857(View view) {
        this.f11106 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f11107 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f11101 = tapTimeout;
        this.f11104 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.AbstractViewOnTouchListenerC2857.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f11109 = false;
        this.f11103 = -1;
        RunnableC2906 runnableC2906 = this.f11102;
        if (runnableC2906 != null) {
            this.f11106.removeCallbacks(runnableC2906);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract InterfaceC3653 mo7172();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract boolean mo7173();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7174() {
        RunnableC2906 runnableC2906 = this.f11108;
        View view = this.f11106;
        if (runnableC2906 != null) {
            view.removeCallbacks(runnableC2906);
        }
        RunnableC2906 runnableC29062 = this.f11102;
        if (runnableC29062 != null) {
            view.removeCallbacks(runnableC29062);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean mo7175() {
        InterfaceC3653 interfaceC3653Mo7172 = mo7172();
        if (interfaceC3653Mo7172 == null || !interfaceC3653Mo7172.mo7318()) {
            return true;
        }
        interfaceC3653Mo7172.dismiss();
        return true;
    }
}
