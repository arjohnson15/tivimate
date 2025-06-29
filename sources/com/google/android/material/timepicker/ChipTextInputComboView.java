package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0246;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EditText f3472;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Chip f3473;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e00e9, (ViewGroup) this, false);
        this.f3473 = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e00ea, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3472 = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C0715(this));
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id._2_res_0x7f0b0270);
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m2912(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3473.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3472.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.f3473;
        chip.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.f3472;
        editText.setVisibility(i);
        chip.setVisibility(z ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new RunnableC0246(6, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3473.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f3473.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f3473.toggle();
    }
}
