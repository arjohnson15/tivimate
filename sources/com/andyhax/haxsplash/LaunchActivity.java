package com.andyhax.haxsplash;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

/* loaded from: classes.dex */
public class LaunchActivity extends Activity {

    private class BackgroundRunner extends AsyncTask<String, String, String> {
        final /* synthetic */ LaunchActivity this$0;

        private native BackgroundRunner(LaunchActivity launchActivity);

        native /* synthetic */ BackgroundRunner(LaunchActivity launchActivity, AnonymousClass1 anonymousClass1);

        private native void GoToNext();

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ String doInBackground(String[] strArr);

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected native String doInBackground2(String... strArr);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ void onPostExecute(String str);

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected native void onPostExecute2(String str);

        @Override // android.os.AsyncTask
        protected native void onPreExecute();
    }

    @Override // android.app.Activity
    protected native void onCreate(Bundle bundle);
}
