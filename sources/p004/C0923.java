package p004;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p378.C4367;
import p378.InterfaceC4334;

/* renamed from: ʻʿ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0923 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4367 m3777(View view, C4367 c4367) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            String str = "onReceive: " + c4367;
        }
        if (c4367.f16869.mo9843() == 2) {
            return c4367;
        }
        InterfaceC4334 interfaceC4334 = c4367.f16869;
        ClipData clipDataMo9844 = interfaceC4334.mo9844();
        int iMo9845 = interfaceC4334.mo9845();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataMo9844.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataMo9844.getItemAt(i);
            if ((iMo9845 & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
