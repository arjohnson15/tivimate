package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.app.C0120;
import java.util.ArrayList;
import java.util.List;
import p061.AbstractC1361;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p447.AbstractC5179;

/* renamed from: androidx.leanback.widget.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0180 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f1142;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList f1143;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C0159 f1144;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ʻˋ.ˋˊ f1145;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final InterfaceC0157 f1146;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final ViewOnClickListenerC0202 f1147 = new ViewOnClickListenerC0202(0, this);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C0145 f1148;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ViewOnKeyListenerC0142 f1149;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC0181 f1150;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C0200 f1151;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final VerticalGridView f1152;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C0198 f1153;

    public C0180(ArrayList arrayList, InterfaceC0157 interfaceC0157, C0120 c0120, C0159 c0159, boolean z) {
        this.f1143 = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
        this.f1146 = interfaceC0157;
        this.f1144 = c0159;
        this.f1149 = new ViewOnKeyListenerC0142(this);
        this.f1150 = new ViewOnFocusChangeListenerC0181(this, c0120);
        this.f1148 = new C0145(0, this);
        this.f1153 = new C0198(this);
        this.f1142 = z;
        if (!z) {
            this.f1151 = C0200.f1198;
        }
        this.f1152 = z ? c0159.f1100 : c0159.f1091;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View] */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C0193 m971(TextView textView) {
        VerticalGridView verticalGridView = this.f1152;
        if (!verticalGridView.f1704) {
            return null;
        }
        ViewParent parent = textView.getParent();
        TextView textView2 = textView;
        while (parent != verticalGridView && parent != null) {
            ?? r4 = (View) parent;
            parent = parent.getParent();
            textView2 = r4;
        }
        if (parent != null) {
            return (C0193) verticalGridView.m1331(textView2);
        }
        return null;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int mo972(int i) {
        this.f1144.getClass();
        return 0;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m973(List list) {
        if (!this.f1142) {
            this.f1144.m949(false);
        }
        ViewOnFocusChangeListenerC0181 viewOnFocusChangeListenerC0181 = this.f1150;
        View view = viewOnFocusChangeListenerC0181.f1155;
        if (view != null) {
            C0180 c0180 = viewOnFocusChangeListenerC0181.f1154;
            VerticalGridView verticalGridView = c0180.f1152;
            if (verticalGridView.f1704) {
                AbstractC1375 abstractC1375M1331 = verticalGridView.m1331(view);
                if (abstractC1375M1331 != null) {
                    c0180.f1144.getClass();
                } else {
                    new Throwable();
                }
            }
        }
        C0200 c0200 = this.f1151;
        ArrayList arrayList = this.f1143;
        if (c0200 == null) {
            arrayList.clear();
            arrayList.addAll(list);
            m4765();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(list);
            AbstractC1361.m4729(new C0170(this, arrayList2)).m4808(new ﾞᐧ(10, this));
        }
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int mo974() {
        return this.f1143.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo975(AbstractC1375 abstractC1375, int i) {
        ArrayList arrayList = this.f1143;
        if (i >= arrayList.size()) {
            return;
        }
        C0193 c0193 = (C0193) abstractC1375;
        C0203 c0203 = (C0203) arrayList.get(i);
        C0159 c0159 = this.f1144;
        c0159.getClass();
        c0193.f1184 = c0203;
        TextView textView = c0193.f1179;
        if (textView != null) {
            textView.setInputType(c0203.f1213);
            textView.setText(c0203.f1208);
            textView.setAlpha(c0203.m988() ? c0159.f1104 : c0159.f1099);
            textView.setFocusable(false);
            textView.setClickable(false);
            textView.setLongClickable(false);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                if (c0203.m994()) {
                    AbstractC0138.m905(textView, null);
                } else {
                    AbstractC0138.m905(textView, null);
                }
            } else if (i2 >= 26) {
                AbstractC0138.m904(textView, 2);
            }
        }
        TextView textView2 = c0193.f1182;
        if (textView2 != null) {
            textView2.setInputType(c0203.f1203);
            textView2.setText(c0203.f1212);
            textView2.setVisibility(TextUtils.isEmpty(c0203.f1212) ? 8 : 0);
            textView2.setAlpha(c0203.m988() ? c0159.f1110 : c0159.f1093);
            textView2.setFocusable(false);
            textView2.setClickable(false);
            textView2.setLongClickable(false);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (c0203.f1207 == 2) {
                    AbstractC0138.m905(textView2, null);
                } else {
                    AbstractC0138.m905(textView2, null);
                }
            } else if (i3 >= 26) {
                AbstractC0138.m904(textView, 2);
            }
        }
        ImageView imageView = c0193.f1183;
        if (imageView != 0) {
            if (c0203.f1205 != 0) {
                imageView.setVisibility(0);
                int i4 = c0203.f1205 == -1 ? R.attr.listChoiceIndicatorMultiple : R.attr.listChoiceIndicatorSingle;
                Context context = imageView.getContext();
                TypedValue typedValue = new TypedValue();
                imageView.setImageDrawable(context.getTheme().resolveAttribute(i4, typedValue, true) ? context.getDrawable(typedValue.resourceId) : null);
                if (imageView instanceof Checkable) {
                    ((Checkable) imageView).setChecked(c0203.m990());
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        ImageView imageView2 = c0193.f1177;
        if (imageView2 != null) {
            Drawable drawable = c0203.f1201;
            if (drawable != null) {
                imageView2.setImageLevel(drawable.getLevel());
                imageView2.setImageDrawable(drawable);
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        if ((c0203.f1202 & 2) != 2) {
            if (textView != null) {
                int i5 = c0159.f1095;
                if (i5 == 1) {
                    textView.setSingleLine(true);
                } else {
                    textView.setSingleLine(false);
                    textView.setMaxLines(i5);
                }
            }
            if (textView2 != null) {
                int i6 = c0159.f1098;
                if (i6 == 1) {
                    textView2.setSingleLine(true);
                } else {
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(i6);
                }
            }
        } else if (textView != null) {
            int i7 = c0159.f1105;
            if (i7 == 1) {
                textView.setSingleLine(true);
            } else {
                textView.setSingleLine(false);
                textView.setMaxLines(i7);
            }
            textView.setInputType(textView.getInputType() | 131072);
            if (textView2 != null) {
                textView2.setInputType(textView2.getInputType() | 131072);
                textView2.setMaxHeight((c0159.f1107 - (c0159.f1101 * 2)) - (textView.getLineHeight() * (c0159.f1105 * 2)));
            }
        }
        c0159.m951(c0193, false, false);
        boolean z = (c0203.f1202 & 32) == 32;
        View view = c0193.f5618;
        if (z) {
            view.setFocusable(true);
            ((ViewGroup) view).setDescendantFocusability(131072);
        } else {
            view.setFocusable(false);
            ((ViewGroup) view).setDescendantFocusability(393216);
        }
        TextView textView3 = c0193.f1179;
        EditText editText = textView3 instanceof EditText ? (EditText) textView3 : null;
        if (editText != null) {
            editText.setImeOptions(5);
        }
        TextView textView4 = c0193.f1182;
        EditText editText2 = textView4 instanceof EditText ? (EditText) textView4 : null;
        if (editText2 != null) {
            editText2.setImeOptions(5);
        }
        c0159.m953(c0193);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m976(EditText editText) {
        if (editText != 0) {
            editText.setPrivateImeOptions("escapeNorth");
            C0145 c0145 = this.f1148;
            editText.setOnEditorActionListener(c0145);
            if (editText instanceof InterfaceC0133) {
                ((InterfaceC0133) editText).setImeKeyListener(c0145);
            }
            if (editText instanceof InterfaceC0192) {
                ((InterfaceC0192) editText).setOnAutofillListener(this.f1153);
            }
        }
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        int iM950;
        C0193 c0193;
        C0159 c0159 = this.f1144;
        if (i == 0) {
            c0193 = c0159.m952(viewGroup);
        } else {
            c0159.getClass();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                iM950 = c0159.m950();
            } else {
                if (i != 1) {
                    throw new RuntimeException(AbstractC5179.m11548(i, "ViewType ", " not supported in GuidedActionsStylist"));
                }
                iM950 = org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e00a3;
            }
            c0193 = new C0193(layoutInflaterFrom.inflate(iM950, viewGroup, false), viewGroup == c0159.f1100);
        }
        ViewOnKeyListenerC0142 viewOnKeyListenerC0142 = this.f1149;
        View view = c0193.f5618;
        view.setOnKeyListener(viewOnKeyListenerC0142);
        view.setOnClickListener(this.f1147);
        view.setOnFocusChangeListener(this.f1150);
        TextView textView = c0193.f1179;
        m976(textView instanceof EditText ? (EditText) textView : null);
        TextView textView2 = c0193.f1182;
        m976(textView2 instanceof EditText ? (EditText) textView2 : null);
        return c0193;
    }
}
