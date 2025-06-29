package p222;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import p004.C0923;
import p004.InterfaceC0925;
import p036.C1262;
import p378.AbstractC4345;
import p378.C4367;
import p378.C4389;
import p378.InterfaceC4378;
import ˈⁱ.ˉⁱ;
import ˏᵢ.ᵢٴ;

/* renamed from: ˏᴵ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2895 extends EditText implements InterfaceC4378, InterfaceC0925 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2941 f11214;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2883 f11215;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2883 f11216;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0923 f11217;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1262 f11218;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C2875 f11219;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2902.m7248(context);
        AbstractC2873.m7187(getContext(), this);
        C1262 c1262 = new C1262(this);
        this.f11218 = c1262;
        c1262.m4491(attributeSet, i);
        C2941 c2941 = new C2941(this);
        this.f11214 = c2941;
        c2941.m7308(attributeSet, i);
        c2941.m7301();
        C2883 c2883 = new C2883();
        c2883.f11167 = this;
        this.f11216 = c2883;
        this.f11217 = new C0923();
        C2883 c28832 = new C2883(this);
        this.f11215 = c28832;
        c28832.mo7192(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM7206 = c28832.m7206(keyListener);
        if (keyListenerM7206 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM7206);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C2875 getSuperCaller() {
        if (this.f11219 == null) {
            this.f11219 = new C2875(this);
        }
        return this.f11219;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            c1262.m4520();
        }
        C2941 c2941 = this.f11214;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ˉⁱ.ˆᵔ(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11214.m7311();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11214.m7302();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2883 c2883;
        if (Build.VERSION.SDK_INT >= 28 || (c2883 = this.f11216) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2883.f11168;
        return textClassifier == null ? AbstractC2951.m7317((TextView) c2883.f11167) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
  0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            ˏᴵ.ᵎʽ r1 = r7.f11214
            r1.getClass()
            p222.C2941.m7299(r8, r0, r7)
            ˈⁱ.ﹳﹳ.ˆᵔ(r8, r0, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = p378.AbstractC4345.m9887(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            p364.AbstractC4137.m9490(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            ᵔᵢ.ᵎˏ r2 = new ᵔᵢ.ᵎˏ
            r6 = 1
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            ᵔﹳ.ﹳﹳ r1 = new ᵔﹳ.ﹳﹳ
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = p364.AbstractC4136.f16030
            if (r1 < r5) goto L59
            java.lang.String[] r1 = p364.AbstractC4137.m9489(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            ᵔﹳ.ʿʼ r1 = new ᵔﹳ.ʿʼ
            r1.<init>(r0, r2)
            goto L4b
        L77:
            ˏᴵ.ˈٴ r1 = r7.f11215
            ʻﹳ.ʽᐧ r8 = r1.m7205(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.C2895.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zM7247 = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC4345.m9887(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                String str = "Can't handle drop: no activity: view=" + this;
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM7247 = AbstractC2901.m7247(dragEvent, this, activity);
            }
        }
        if (zM7247) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ᵢٴ c4389;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC4345.m9887(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c4389 = new ᵢٴ(primaryClip, 1);
            } else {
                c4389 = new C4389();
                c4389.f16910 = primaryClip;
                c4389.f16912 = 1;
            }
            c4389.mo9930(i == 16908322 ? 0 : 1);
            AbstractC4345.m9877(this, c4389.mo9932());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11214;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11214;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f11215.m7207(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11215.m7206(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11218;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2941 c2941 = this.f11214;
        c2941.m7304(colorStateList);
        c2941.m7301();
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2941 c2941 = this.f11214;
        c2941.m7305(mode);
        c2941.m7301();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2941 c2941 = this.f11214;
        if (c2941 != null) {
            c2941.m7309(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2883 c2883;
        if (Build.VERSION.SDK_INT >= 28 || (c2883 = this.f11216) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2883.f11168 = textClassifier;
        }
    }

    @Override // p378.InterfaceC4378
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4367 mo7239(C4367 c4367) {
        this.f11217.getClass();
        return C0923.m3777(this, c4367);
    }
}
