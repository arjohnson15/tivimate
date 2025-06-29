package p378;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p004.C0923;
import p204.C2772;
import p204.InterfaceC2783;
import p222.C2895;

/* renamed from: ᵢٴ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4345 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Field f16835;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean f16837;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static WeakHashMap f16838;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static ThreadLocal f16841;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int[] f16836 = {R.id._2_res_0x7f0b0016, R.id._2_res_0x7f0b0017, R.id._2_res_0x7f0b0022, R.id._2_res_0x7f0b002d, R.id._2_res_0x7f0b0030, R.id._2_res_0x7f0b0031, R.id._2_res_0x7f0b0032, R.id._2_res_0x7f0b0033, R.id._2_res_0x7f0b0034, R.id._2_res_0x7f0b0035, R.id._2_res_0x7f0b0018, R.id._2_res_0x7f0b0019, R.id._2_res_0x7f0b001a, R.id._2_res_0x7f0b001b, R.id._2_res_0x7f0b001c, R.id._2_res_0x7f0b001d, R.id._2_res_0x7f0b001e, R.id._2_res_0x7f0b001f, R.id._2_res_0x7f0b0020, R.id._2_res_0x7f0b0021, R.id._2_res_0x7f0b0023, R.id._2_res_0x7f0b0024, R.id._2_res_0x7f0b0025, R.id._2_res_0x7f0b0026, R.id._2_res_0x7f0b0027, R.id._2_res_0x7f0b0028, R.id._2_res_0x7f0b0029, R.id._2_res_0x7f0b002a, R.id._2_res_0x7f0b002b, R.id._2_res_0x7f0b002c, R.id._2_res_0x7f0b002e, R.id._2_res_0x7f0b002f};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C4346 f16839 = new C4346();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC4392 f16840 = new ViewTreeObserverOnGlobalLayoutListenerC4392();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m9874(KeyEvent keyEvent, View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C4390.f16916;
        C4390 c4390 = (C4390) view.getTag(R.id._2_res_0x7f0b0380);
        if (c4390 == null) {
            c4390 = new C4390();
            c4390.f16919 = null;
            c4390.f16917 = null;
            c4390.f16918 = null;
            view.setTag(R.id._2_res_0x7f0b0380, c4390);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c4390.f16919;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C4390.f16916;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c4390.f16919 == null) {
                            c4390.f16919 = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C4390.f16916;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c4390.f16919.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c4390.f16919.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM9981 = c4390.m9981(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM9981 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c4390.f16917 == null) {
                    c4390.f16917 = new SparseArray();
                }
                c4390.f16917.put(keyCode, new WeakReference(viewM9981));
            }
        }
        return viewM9981 != null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static ArrayList m9875(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id._2_res_0x7f0b0376);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id._2_res_0x7f0b0376, arrayList2);
        return arrayList2;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m9876(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectM9886 = m9886();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM9886.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM9886.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m9889(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m9889((View) parent2);
            }
        }
        if (z && rectM9886.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM9886);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C4367 m9877(View view, C4367 c4367) {
        if (Log.isLoggable("ViewCompat", 3)) {
            String str = "performReceiveContent: " + c4367 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]";
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC4383.m9972(view, c4367);
        }
        C0923 c0923 = (C0923) view.getTag(R.id._2_res_0x7f0b037b);
        InterfaceC4378 interfaceC4378 = f16839;
        if (c0923 == null) {
            if (view instanceof InterfaceC4378) {
                interfaceC4378 = (InterfaceC4378) view;
            }
            return interfaceC4378.mo7239(c4367);
        }
        C4367 c4367M3777 = C0923.m3777(view, c4367);
        if (c4367M3777 == null) {
            return null;
        }
        if (view instanceof InterfaceC4378) {
            interfaceC4378 = (InterfaceC4378) view;
        }
        return interfaceC4378.mo7239(c4367M3777);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m9878(View view, int i) {
        ArrayList arrayListM9875 = m9875(view);
        for (int i2 = 0; i2 < arrayListM9875.size(); i2++) {
            if (((C2772) arrayListM9875.get(i2)).m7047() == i) {
                arrayListM9875.remove(i2);
                return;
            }
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static void m9879(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        AbstractC4339.m9853(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (AbstractC4339.m9859(view) == null && AbstractC4339.m9865(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m9880(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectM9886 = m9886();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM9886.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM9886.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m9889(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m9889((View) parent2);
            }
        }
        if (z && rectM9886.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM9886);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m9881(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC4371.m9956(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C4369 m9882(View view) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC4372.m9959(view) : AbstractC4339.m9862(view);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m9883(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC4371.m9957(view);
        }
        if (f16837) {
            return null;
        }
        if (f16835 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16835 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16837 = true;
                return null;
            }
        }
        try {
            Object obj = f16835.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16837 = true;
            return null;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m9884(View view, C4332 c4332) {
        if (c4332 == null && (m9883(view) instanceof C4366)) {
            c4332 = new C4332();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c4332 == null ? null : c4332.f16819);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4361 m9885(View view) {
        if (f16838 == null) {
            f16838 = new WeakHashMap();
        }
        C4361 c4361 = (C4361) f16838.get(view);
        if (c4361 != null) {
            return c4361;
        }
        C4361 c43612 = new C4361(view);
        f16838.put(view, c43612);
        return c43612;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Rect m9886() {
        if (f16841 == null) {
            f16841 = new ThreadLocal();
        }
        Rect rect = (Rect) f16841.get();
        if (rect == null) {
            rect = new Rect();
            f16841.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String[] m9887(C2895 c2895) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC4383.m9973(c2895) : (String[]) c2895.getTag(R.id._2_res_0x7f0b037c);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m9888(View view, C2772 c2772, InterfaceC2783 interfaceC2783) {
        C2772 c27722 = new C2772(null, c2772.f10838, null, interfaceC2783, c2772.f10839);
        View.AccessibilityDelegate accessibilityDelegateM9883 = m9883(view);
        C4332 c4332 = accessibilityDelegateM9883 == null ? null : accessibilityDelegateM9883 instanceof C4366 ? ((C4366) accessibilityDelegateM9883).f16868 : new C4332(accessibilityDelegateM9883);
        if (c4332 == null) {
            c4332 = new C4332();
        }
        m9884(view, c4332);
        m9878(view, c27722.m7047());
        m9875(view).add(c27722);
        m9892(view, 0);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m9889(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m9890(View view, CharSequence charSequence) {
        new C4393(R.id._2_res_0x7f0b0379, CharSequence.class, 8, 28, 1).m4694(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC4392 viewTreeObserverOnGlobalLayoutListenerC4392 = f16840;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC4392.f16920.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC4392);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4392);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC4392.f16920.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC4392);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4392);
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static CharSequence m9891(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC4350.m9905(view);
        } else {
            tag = view.getTag(R.id._2_res_0x7f0b0379);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m9892(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m9891(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m9891(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent");
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m9891(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }
}
