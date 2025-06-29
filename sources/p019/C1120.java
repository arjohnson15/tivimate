package p019;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p260.C3222;
import ﹳᴵ.ˉי;

/* renamed from: ʻﹳ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1120 implements KeyListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˉי f4740;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final KeyListener f4741;

    public C1120(KeyListener keyListener) {
        ˉי r0 = new ˉי(5);
        this.f4741 = keyListener;
        this.f4740 = r0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f4741.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f4741.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f4740.getClass();
        if (i != 67 ? i != 112 ? false : C3222.m7924(editable, keyEvent, true) : C3222.m7924(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f4741.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4741.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f4741.onKeyUp(view, editable, i, keyEvent);
    }
}
