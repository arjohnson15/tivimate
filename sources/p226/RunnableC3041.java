package p226;

import android.text.TextUtils;

/* renamed from: ˑʽ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3041 implements Runnable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC3030 f11736;

    public RunnableC3041(AbstractActivityC3030 abstractActivityC3030) {
        this.f11736 = abstractActivityC3030;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }
}
