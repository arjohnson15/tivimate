package com.parse.ui.login;

import android.R;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.C0105;
import com.parse.Parse;
import com.parse.ui.R$string;
import com.parse.ui.login.ParseLoginFragment;
import com.parse.ui.login.ParseLoginHelpFragment;
import p225.AbstractActivityC3013;

/* loaded from: classes.dex */
public class ParseLoginActivity extends AbstractActivityC3013 implements ParseLoginFragment.ParseLoginFragmentListener, ParseLoginHelpFragment.ParseOnLoginHelpSuccessListener, ParseOnLoginSuccessListener, ParseOnLoadingListener {
    private Bundle configOptions;
    private ProgressDialog progressDialog;
    private final int fragmentContainer = R.id.content;
    private boolean destroyed = false;

    private Context adjustResources(Context context) {
        if (context == null) {
            return null;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.densityDpi = Math.round((context.getResources().getDisplayMetrics().heightPixels / 540.0f) * 160.0f);
        return context.createConfigurationContext(configuration);
    }

    private Bundle getMergedOptions() throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo;
        Bundle bundle;
        try {
            activityInfo = getPackageManager().getActivityInfo(getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            if (Parse.getLogLevel() <= 6 && Log.isLoggable("ParseLoginActivity", 5)) {
                e.getMessage();
            }
            activityInfo = null;
        }
        Bundle bundle2 = new Bundle();
        if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
            bundle2.putAll(bundle);
        }
        if (getIntent().getExtras() != null) {
            bundle2.putAll(getIntent().getExtras());
        }
        return bundle2;
    }

    @Override // p225.AbstractActivityC3013, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (TextUtils.equals(context.getPackageName(), "ar.tvplayer.tv")) {
            super.attachBaseContext(adjustResources(context));
        } else {
            super.attachBaseContext(context);
        }
    }

    @Override // android.app.Activity
    @TargetApi(17)
    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, p226.AbstractActivityC3030, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0113, p226.AbstractActivityC3030, p307.AbstractActivityC3565, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.configOptions = getMergedOptions();
        if (bundle == null) {
            AbstractC0104 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0105 c0105 = new C0105(supportFragmentManager);
            c0105.m705(R.id.content, ParseLoginFragment.newInstance(this.configOptions), null, 1);
            c0105.m697(false);
        }
    }

    @Override // p225.AbstractActivityC3013, androidx.fragment.app.AbstractActivityC0113, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.destroyed = true;
    }

    @Override // com.parse.ui.login.ParseOnLoadingListener
    public void onLoadingFinish() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // com.parse.ui.login.ParseOnLoadingListener
    public void onLoadingStart(boolean z) {
        if (z) {
            this.progressDialog = ProgressDialog.show(this, null, getString(R$string.com_parse_ui_progress_dialog_text), true, false);
        }
    }

    @Override // com.parse.ui.login.ParseLoginFragment.ParseLoginFragmentListener
    public void onLoginHelpClicked() {
        AbstractC0104 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0105 c0105 = new C0105(supportFragmentManager);
        c0105.m700(R.id.content, ParseLoginHelpFragment.newInstance(this.configOptions), null);
        c0105.m702(null);
        c0105.m697(true);
    }

    @Override // com.parse.ui.login.ParseLoginHelpFragment.ParseOnLoginHelpSuccessListener
    public void onLoginHelpSuccess() {
        getSupportFragmentManager().m694();
    }

    @Override // com.parse.ui.login.ParseOnLoginSuccessListener
    public void onLoginSuccess() {
        setResult(-1);
        finish();
    }

    @Override // com.parse.ui.login.ParseLoginFragment.ParseLoginFragmentListener
    public void onSignUpClicked(String str, String str2) {
        AbstractC0104 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0105 c0105 = new C0105(supportFragmentManager);
        c0105.m700(R.id.content, ParseSignupFragment.newInstance(this.configOptions, str, str2), null);
        c0105.m702(null);
        c0105.m697(false);
    }
}
