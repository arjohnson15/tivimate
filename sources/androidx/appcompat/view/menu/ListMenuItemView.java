package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import org.lsposed.hiddenapibypass.library.R;
import p300.AbstractC3505;
import p320.C3644;
import p320.InterfaceC3645;
import p331.C3762;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC3645, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Context f57;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ImageView f58;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public CheckBox f59;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ImageView f60;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public RadioButton f61;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public LayoutInflater f62;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Drawable f63;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f64;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public LinearLayout f65;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public TextView f66;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3644 f67;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Drawable f68;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f69;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public TextView f70;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final boolean f71;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ImageView f72;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int f73;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3762 c3762M8778 = C3762.m8778(getContext(), attributeSet, AbstractC3505.f13581, R.attr._2_res_0x7f0403a1);
        this.f68 = c3762M8778.m8784(5);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        this.f73 = typedArray.getResourceId(1, -1);
        this.f64 = typedArray.getBoolean(7, false);
        this.f57 = context;
        this.f63 = c3762M8778.m8784(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr._2_res_0x7f0401fc, 0);
        this.f71 = typedArrayObtainStyledAttributes.hasValue(0);
        c3762M8778.m8783();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f62 == null) {
            this.f62 = LayoutInflater.from(getContext());
        }
        return this.f62;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f72;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f60;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f60.getLayoutParams();
        rect.top = this.f60.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p320.InterfaceC3645
    public C3644 getItemData() {
        return this.f67;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f68);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f66 = textView;
        int i = this.f73;
        if (i != -1) {
            textView.setTextAppearance(this.f57, i);
        }
        this.f70 = (TextView) findViewById(R.id._2_res_0x7f0b0344);
        ImageView imageView = (ImageView) findViewById(R.id._2_res_0x7f0b0370);
        this.f72 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f63);
        }
        this.f60 = (ImageView) findViewById(R.id._2_res_0x7f0b01b0);
        this.f65 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f58 != null && this.f64) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f58.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f61 == null && this.f59 == null) {
            return;
        }
        if ((this.f67.f13952 & 4) != 0) {
            if (this.f61 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout._2_res_0x7f0e0011, (ViewGroup) this, false);
                this.f61 = radioButton;
                LinearLayout linearLayout = this.f65;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f61;
            view = this.f59;
        } else {
            if (this.f59 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout._2_res_0x7f0e000e, (ViewGroup) this, false);
                this.f59 = checkBox;
                LinearLayout linearLayout2 = this.f65;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f59;
            view = this.f61;
        }
        if (z) {
            compoundButton.setChecked(this.f67.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f59;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f61;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f67.f13952 & 4) != 0) {
            if (this.f61 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout._2_res_0x7f0e0011, (ViewGroup) this, false);
                this.f61 = radioButton;
                LinearLayout linearLayout = this.f65;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f61;
        } else {
            if (this.f59 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout._2_res_0x7f0e000e, (ViewGroup) this, false);
                this.f59 = checkBox;
                LinearLayout linearLayout2 = this.f65;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f59;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f69 = z;
        this.f64 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f60;
        if (imageView != null) {
            imageView.setVisibility((this.f71 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f67.f13945.getClass();
        boolean z = this.f69;
        if (z || this.f64) {
            ImageView imageView = this.f58;
            if (imageView == null && drawable == null && !this.f64) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout._2_res_0x7f0e000f, (ViewGroup) this, false);
                this.f58 = imageView2;
                LinearLayout linearLayout = this.f65;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f64) {
                this.f58.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f58;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f58.getVisibility() != 0) {
                this.f58.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f66.getVisibility() != 8) {
                this.f66.setVisibility(8);
            }
        } else {
            this.f66.setText(charSequence);
            if (this.f66.getVisibility() != 0) {
                this.f66.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // p320.InterfaceC3645
    /* renamed from: ˑʽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo106(p320.C3644 r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo106(ᴵʿ.ˉⁱ):void");
    }
}
