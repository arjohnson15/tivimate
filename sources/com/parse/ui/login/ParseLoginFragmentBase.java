package com.parse.ui.login;

import android.annotation.TargetApi;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import com.parse.Parse;

/* loaded from: classes.dex */
public class ParseLoginFragmentBase extends AbstractComponentCallbacksC0100 {
    protected ParseOnLoadingListener onLoadingListener;

    public void debugLog(int i) {
        debugLog(getString(i));
    }

    public void debugLog(String str) {
        if (Parse.getLogLevel() > 3 || !Log.isLoggable(getLogTag(), 5)) {
            return;
        }
        getLogTag();
    }

    public String getLogTag() {
        return null;
    }

    @TargetApi(17)
    public boolean isActivityDestroyed() {
        AbstractActivityC0113 activity = getActivity();
        return activity == null || activity.isDestroyed();
    }

    public void loadingFinish() {
        ParseOnLoadingListener parseOnLoadingListener = this.onLoadingListener;
        if (parseOnLoadingListener != null) {
            parseOnLoadingListener.onLoadingFinish();
        }
    }

    public void loadingStart() {
        loadingStart(true);
    }

    public void loadingStart(boolean z) {
        ParseOnLoadingListener parseOnLoadingListener = this.onLoadingListener;
        if (parseOnLoadingListener != null) {
            parseOnLoadingListener.onLoadingStart(z);
        }
    }

    public void showToast(int i) {
        showToast(getString(i));
    }

    public void showToast(CharSequence charSequence) {
        AbstractActivityC0113 activity = getActivity();
        if (activity == null || charSequence == null) {
            return;
        }
        Toast.makeText(activity, charSequence, 0).show();
    }
}
