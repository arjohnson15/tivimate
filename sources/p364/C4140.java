package p364;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p362.C4125;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵔﹳ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4140 extends InputConnectionWrapper {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C4125 f16032;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140(InputConnection inputConnection, C4125 c4125) {
        super(inputConnection, false);
        this.f16032 = c4125;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ᵢٴ r0 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            r0 = new ᵢٴ(18, new C4138(inputContentInfo));
        }
        if (this.f16032.m9443(r0, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
