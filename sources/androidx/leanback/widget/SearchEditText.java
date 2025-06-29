package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public class SearchEditText extends AbstractC0144 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC0185 f930;

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.f930 != null) {
            post(new RunnableC0183(1, this));
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // androidx.leanback.widget.AbstractC0144, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public void setOnKeyboardDismissListener(InterfaceC0185 interfaceC0185) {
        this.f930 = interfaceC0185;
    }
}
