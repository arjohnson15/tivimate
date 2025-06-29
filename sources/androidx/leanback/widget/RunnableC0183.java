package androidx.leanback.widget;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.C0101;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import androidx.leanback.widget.picker.DatePicker;
import androidx.lifecycle.AbstractC0244;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ar.tvplayer.core.util.RestartProcessActivity;
import com.bumptech.glide.ComponentCallbacks2C0294;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.ReferenceQueue;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import p004.C0928;
import p004.ViewOnTouchListenerC0920;
import p014.C1060;
import p061.C1368;
import p142.C2221;
import p149.AbstractC2282;
import p149.C2309;
import p149.C2311;
import p150.ExecutorC2314;
import p181.AbstractC2507;
import p181.AbstractC2508;
import p181.C2510;
import p181.ServiceConnectionC2505;
import p222.C2882;
import p222.C2908;
import p227.C3053;
import p251.AbstractC3132;
import p251.C3130;
import p251.C3131;
import p251.InterfaceC3127;
import p251.InterfaceC3128;
import p251.InterfaceC3137;
import p252.AbstractC3139;
import p261.C3226;
import p266.C3262;
import p293.AbstractDialogInterfaceOnCancelListenerC3482;
import p293.C3469;
import p334.C3789;
import p349.InterfaceC4000;
import p363.AbstractC4133;
import p363.C4131;
import p363.C4132;
import p378.AbstractC4345;
import p396.C4554;

/* renamed from: androidx.leanback.widget.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0183 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f1158;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1159;

    public /* synthetic */ RunnableC0183(int i, Object obj) {
        this.f1159 = i;
        this.f1158 = obj;
    }

    public RunnableC0183(C3131 c3131, C3130 c3130) {
        this.f1159 = 18;
        this.f1158 = c3131;
    }

    public RunnableC0183(AbstractDialogInterfaceOnCancelListenerC3482 abstractDialogInterfaceOnCancelListenerC3482, C1060 c1060) {
        this.f1159 = 27;
        this.f1158 = c1060;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m978() {
        synchronized (this) {
            ((PreferenceGroup) this.f1158).f1582.clear();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m979() {
        synchronized (((C3131) this.f1158).f12089) {
            try {
                InterfaceC3127 interfaceC3127 = (InterfaceC3127) ((C3131) this.f1158).f12087;
                if (interfaceC3127 != null) {
                    interfaceC3127.mo7674();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m980() {
        Object obj;
        synchronized (((AbstractC0244) this.f1158).f1291) {
            obj = ((AbstractC0244) this.f1158).f1292;
            ((AbstractC0244) this.f1158).f1292 = AbstractC0244.f1285;
        }
        ((AbstractC0244) this.f1158).m1044(obj);
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, ʿˉ.ᴵʿ] */
    @Override // java.lang.Runnable
    public final void run() {
        ʾי.ˑʽ r0;
        C2908 c2908;
        boolean z;
        boolean z2;
        AbstractC4133 abstractC4133M9485;
        long jNanoTime;
        switch (this.f1159) {
            case 0:
                ((GridLayoutManager) this.f1158).m4838();
                return;
            case 1:
                ﾞᐧ r02 = ((SearchEditText) this.f1158).f930;
                if (r02 == null || (r0 = ((SearchBar) r02.ˆʿ).f919) == null) {
                    return;
                }
                AbstractActivityC0113 activity = ((ʽᵔ.ﾞﾞ) r0.ˆʿ).getActivity();
                ـˈ.ˑʽ r4 = activity instanceof ـˈ.ˑʽ ? (ـˈ.ˑʽ) activity : null;
                if (r4 != null) {
                    r4.ˏʾ(false);
                    return;
                }
                return;
            case 2:
                m980();
                return;
            case 3:
                ComponentCallbacks2C0294 componentCallbacks2C0294 = (ComponentCallbacks2C0294) this.f1158;
                componentCallbacks2C0294.f2395.mo3952(componentCallbacks2C0294);
                return;
            case 4:
                ViewOnTouchListenerC0920 viewOnTouchListenerC0920 = (ViewOnTouchListenerC0920) this.f1158;
                if (viewOnTouchListenerC0920.f4104) {
                    boolean z3 = viewOnTouchListenerC0920.f4097;
                    C0928 c0928 = viewOnTouchListenerC0920.f4100;
                    if (z3) {
                        viewOnTouchListenerC0920.f4097 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0928.f4115 = jCurrentAnimationTimeMillis;
                        c0928.f4120 = -1L;
                        c0928.f4119 = jCurrentAnimationTimeMillis;
                        c0928.f4116 = 0.5f;
                    }
                    if ((c0928.f4120 > 0 && AnimationUtils.currentAnimationTimeMillis() > c0928.f4120 + c0928.f4122) || !viewOnTouchListenerC0920.m3758()) {
                        viewOnTouchListenerC0920.f4104 = false;
                        return;
                    }
                    boolean z4 = viewOnTouchListenerC0920.f4096;
                    ListView listView = viewOnTouchListenerC0920.f4094;
                    if (z4) {
                        viewOnTouchListenerC0920.f4096 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0928.f4119 == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM3787 = c0928.m3787(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c0928.f4119;
                    c0928.f4119 = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0920.f4102.scrollListBy((int) (j * ((fM3787 * 4.0f) + ((-4.0f) * fM3787 * fM3787)) * c0928.f4121));
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                C1368 c1368 = (C1368) this.f1158;
                int i = c1368.f5558;
                ValueAnimator valueAnimator = c1368.f5578;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c1368.f5558 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                ((StaggeredGridLayoutManager) this.f1158).m1339();
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f1158.mo5357();
                return;
            case 8:
                C2221 c2221 = (C2221) this.f1158;
                c2221.m6207(true);
                c2221.invalidateSelf();
                return;
            case 9:
                ((C2309) this.f1158).m6356();
                return;
            case 10:
                RecyclerView recyclerView = ((AbstractC2282) this.f1158).f9037;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 11:
                m978();
                return;
            case 12:
                ((C2311) this.f1158).m6362();
                return;
            case 13:
                ServiceConnectionC2505 serviceConnectionC2505 = (ServiceConnectionC2505) this.f1158;
                serviceConnectionC2505.f9957.f9947 = 0;
                serviceConnectionC2505.f9957.f9949 = null;
                C2510 c2510 = AbstractC2507.f9964;
                serviceConnectionC2505.f9957.m6618(AbstractC2508.m6628(24, 6, c2510));
                serviceConnectionC2505.m6625(c2510);
                return;
            case 14:
                C2882 c2882 = (C2882) this.f1158;
                c2882.f11154 = null;
                c2882.drawableStateChanged();
                return;
            case 15:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f1158;
                if (searchView$SearchAutoComplete.f161) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f161 = false;
                    return;
                }
                return;
            case 16:
                ActionMenuView actionMenuView = ((Toolbar) this.f1158).f235;
                if (actionMenuView == null || (c2908 = actionMenuView.f141) == null) {
                    return;
                }
                c2908.m7254();
                return;
            case 17:
                DatePicker datePicker = (DatePicker) this.f1158;
                int[] iArr = {datePicker.f986, datePicker.f995, datePicker.f987};
                boolean z5 = true;
                boolean z6 = true;
                for (int i2 = 2; i2 >= 0; i2--) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        int i4 = DatePicker.f982[i2];
                        C3053 c3053M890 = datePicker.m890(i3);
                        if (z5) {
                            int i5 = datePicker.f985.get(i4);
                            if (i5 != c3053M890.f11756) {
                                c3053M890.f11756 = i5;
                                z = true;
                            }
                            z = false;
                        } else {
                            int actualMinimum = datePicker.f988.getActualMinimum(i4);
                            if (actualMinimum != c3053M890.f11756) {
                                c3053M890.f11756 = actualMinimum;
                                z = true;
                            }
                            z = false;
                        }
                        if (z6) {
                            int i6 = datePicker.f994.get(i4);
                            if (i6 != c3053M890.f11758) {
                                c3053M890.f11758 = i6;
                                z2 = true;
                            }
                            z2 = false;
                        } else {
                            int actualMaximum = datePicker.f988.getActualMaximum(i4);
                            if (actualMaximum != c3053M890.f11758) {
                                c3053M890.f11758 = actualMaximum;
                                z2 = true;
                            }
                            z2 = false;
                        }
                        boolean z7 = z | z2;
                        z5 &= datePicker.f988.get(i4) == datePicker.f985.get(i4);
                        z6 &= datePicker.f988.get(i4) == datePicker.f994.get(i4);
                        if (z7) {
                            datePicker.m893(iArr[i2], c3053M890);
                        }
                        datePicker.m887(iArr[i2], datePicker.f988.get(i4));
                    }
                }
                return;
            case 18:
                C3131 c3131 = (C3131) this.f1158;
                try {
                    C3130 c3130 = (C3130) ((Callable) ((C4554) c3131.f12089).f17462).call();
                    if (c3130 == null) {
                        c3131.mo7698(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC2314 executorC2314 = AbstractC3132.f12091;
                    C3131 c31312 = new C3131(executorC2314, (InterfaceC3128) c3131);
                    ʻˋ.ˋˊ r5 = c3130.f12081;
                    r5.ᴵʿ(c31312);
                    c3130.m7687();
                    r5.ᴵʿ(new C3131(executorC2314, (InterfaceC3137) c3131));
                    c3130.m7687();
                    r5.ᴵʿ(new C3131(executorC2314, (InterfaceC3127) c3131));
                    c3130.m7687();
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        ((C3130) c3131.f12087).m7692((Exception) e.getCause());
                        return;
                    } else {
                        ((C3130) c3131.f12087).m7692(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((C3130) c3131.f12087).m7692(e2);
                    return;
                }
            case 19:
                m979();
                return;
            case 20:
                RestartProcessActivity restartProcessActivity = (RestartProcessActivity) this.f1158;
                AbstractC3139.m7737(restartProcessActivity, true);
                restartProcessActivity.finish();
                return;
            case 21:
                C3262 c3262 = (C3262) this.f1158;
                c3262.getClass();
                while (true) {
                    try {
                        c3262.m8042((C3226) ((ReferenceQueue) c3262.f12724).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 22:
                DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116 = (DialogInterfaceOnCancelListenerC0116) this.f1158;
                dialogInterfaceOnCancelListenerC0116.f703.onDismiss(dialogInterfaceOnCancelListenerC0116.f694);
                return;
            case 23:
                C0101 c0101 = (C0101) this.f1158;
                if (c0101.f588.isEmpty()) {
                    return;
                }
                c0101.m619();
                return;
            case 24:
                ((AbstractC0104) this.f1158).m644(true);
                return;
            case 25:
                ((C3469) this.f1158).m8321();
                return;
            case 26:
                InterfaceC4000 interfaceC4000 = ((C3469) ((ˏᵢ.ᵢٴ) this.f1158).ˆʿ).f13418;
                interfaceC4000.m9265(interfaceC4000.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 27:
                throw null;
            case 28:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1158).f3424.f15622;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
        }
        while (true) {
            C4132 c4132 = (C4132) this.f1158;
            synchronized (c4132) {
                abstractC4133M9485 = c4132.m9485();
            }
            if (abstractC4133M9485 == null) {
                return;
            }
            C4131 c4131 = abstractC4133M9485.f16026;
            C4132 c41322 = (C4132) this.f1158;
            boolean zIsLoggable = C4132.f16017.isLoggable(Level.FINE);
            if (zIsLoggable) {
                ˊﹶ.ˋˉ r03 = c4131.f16013.f16021;
                jNanoTime = System.nanoTime();
                ˎˊ.ˏʾ.ʽᐧ(abstractC4133M9485, c4131, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C4132.m9482(c41322, abstractC4133M9485);
                if (zIsLoggable) {
                    ˊﹶ.ˋˉ r04 = c4131.f16013.f16021;
                    ˎˊ.ˏʾ.ʽᐧ(abstractC4133M9485, c4131, "finished run in ".concat(ˎˊ.ˏʾ.ˑי(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) c41322.f16021.ˆʿ).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        ˊﹶ.ˋˉ r2 = c4131.f16013.f16021;
                        ˎˊ.ˏʾ.ʽᐧ(abstractC4133M9485, c4131, "failed a run in ".concat(ˎˊ.ˏʾ.ˑי(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
