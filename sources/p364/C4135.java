package p364;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p362.C4125;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵔﹳ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4135 extends InputConnectionWrapper {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C4125 f16029;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4135(InputConnection inputConnection, C4125 c4125) {
        super(inputConnection, false);
        this.f16029 = c4125;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        C4125 c4125 = this.f16029;
        boolean zM9443 = false;
        zM9443 = false;
        zM9443 = false;
        zM9443 = false;
        if (bundle != null) {
            if (!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str);
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            } catch (Throwable th) {
                th = th;
                resultReceiver = null;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    zM9443 = c4125.m9443(new ᵢٴ(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(zM9443 ? 1 : 0, null);
                }
            } catch (Throwable th2) {
                th = th2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        }
        if (zM9443) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
