package p019;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import p192.C2668;
import p192.C2676;
import p250.C3125;
import ᵔᵔ.ٴˎ;
import ﹶˋ.ـﹶ;

/* renamed from: ʻﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1119 extends InputConnectionWrapper {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ٴˎ f4738;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EditText f4739;

    public C1119(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        ٴˎ r0 = new ٴˎ(5);
        super(inputConnection, false);
        this.f4739 = editText;
        this.f4738 = r0;
        if (C2676.f10575 != null) {
            C2676 c2676M6853 = C2676.m6853();
            if (c2676M6853.m6854() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2668 c2668 = c2676M6853.f10577;
            c2668.getClass();
            Bundle bundle = editorInfo.extras;
            C3125 c3125 = (C3125) ((ـﹶ) c2668.f10562).ˆʿ;
            int iM4692 = c3125.m4692(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM4692 != 0 ? ((ByteBuffer) c3125.f5491).getInt(iM4692 + c3125.f5492) : 0);
            Bundle bundle2 = editorInfo.extras;
            ((C2676) c2668.f10563).getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f4739.getEditableText();
        this.f4738.getClass();
        return ٴˎ.ˑי(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f4739.getEditableText();
        this.f4738.getClass();
        return ٴˎ.ˑי(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
