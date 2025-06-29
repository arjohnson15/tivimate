package com.parse.ui.login;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.ui.R$id;
import com.parse.ui.R$layout;
import com.parse.ui.R$string;
import p226.InterfaceC3048;
import ᐧᵔ.ʽᐧ;
import ᐧᵔ.ـﹶ;

/* loaded from: classes.dex */
public class ParseLoginFragment extends ParseLoginFragmentBase {
    private ParseLoginConfig config;
    private Button facebookLoginButton;
    private ParseLoginFragmentListener loginFragmentListener;
    private ParseOnLoginSuccessListener onLoginSuccessListener;
    private View parseLogin;
    private Button parseLoginButton;
    private TextView parseLoginHelpButton;
    private Button parseSignupButton;
    private EditText passwordField;
    private Button twitterLoginButton;
    private EditText usernameField;

    public interface ParseLoginFragmentListener {
        void onLoginHelpClicked();

        void onSignUpClicked(String str, String str2);
    }

    private boolean allowParseLoginAndSignup() {
        boolean z = false;
        if (!this.config.isParseLoginEnabled()) {
            return false;
        }
        if (this.usernameField == null) {
            debugLog(R$string.com_parse_ui_login_warning_layout_missing_username_field);
        }
        if (this.passwordField == null) {
            debugLog(R$string.com_parse_ui_login_warning_layout_missing_password_field);
        }
        if (this.parseLoginButton == null) {
            debugLog(R$string.com_parse_ui_login_warning_layout_missing_login_button);
        }
        if (this.parseSignupButton == null) {
            debugLog(R$string.com_parse_ui_login_warning_layout_missing_signup_button);
        }
        if (this.parseLoginHelpButton == null) {
            debugLog(R$string.com_parse_ui_login_warning_layout_missing_login_help_button);
        }
        if (this.usernameField != null && this.passwordField != null && this.parseLoginButton != null && this.parseSignupButton != null && this.parseLoginHelpButton != null) {
            z = true;
        }
        if (!z) {
            debugLog(R$string.com_parse_ui_login_warning_disabled_username_password_login);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$login$3(ParseUser parseUser, ParseException parseException) {
        if (isActivityDestroyed()) {
            return;
        }
        loadingFinish();
        if (parseUser != null) {
            loginSuccess();
            return;
        }
        if (parseException != null) {
            debugLog(getString(R$string.com_parse_ui_login_warning_parse_login_failed) + parseException);
            if (parseException.getCode() == 101) {
                if (this.config.getParseLoginInvalidCredentialsToastText() != null) {
                    showToast(this.config.getParseLoginInvalidCredentialsToastText());
                } else {
                    showToast(R$string.com_parse_ui_parse_login_invalid_credentials_toast);
                }
                this.passwordField.selectAll();
                this.passwordField.requestFocus();
                return;
            }
            if (parseException.getCode() == -2) {
                showToast(R$string.com_parse_ui_update_app);
                return;
            }
            showToast(R$string.com_parse_ui_parse_login_failed_unknown_toast);
            if (parseException.getCode() == 209) {
                ParseUser.logOutInBackground();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpParseLoginAndSignup$0(View view) {
        String correctedUsernameOrEmail = Utils.getCorrectedUsernameOrEmail(this.usernameField.getText().toString());
        String string = this.passwordField.getText().toString();
        if (correctedUsernameOrEmail.length() == 0) {
            if (this.config.isParseLoginEmailAsUsername()) {
                showToast(R$string.com_parse_ui_no_email_toast);
                return;
            } else {
                showToast(R$string.com_parse_ui_no_username_toast);
                return;
            }
        }
        if (string.length() == 0) {
            showToast(R$string.com_parse_ui_no_password_toast);
        } else if (Utils.isCompanionApp()) {
            login(correctedUsernameOrEmail, string, "[h]:");
        } else {
            login(correctedUsernameOrEmail, string, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpParseLoginAndSignup$1(View view) {
        this.loginFragmentListener.onSignUpClicked(this.usernameField.getText().toString(), this.passwordField.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpParseLoginAndSignup$2(View view) {
        this.loginFragmentListener.onLoginHelpClicked();
    }

    private void login(String str, String str2, String str3) {
        loadingStart(true);
        ParseUser.logInInBackground(str.toLowerCase(), str2, str3, new ʽᐧ(this));
    }

    private void loginSuccess() {
        this.onLoginSuccessListener.onLoginSuccess();
    }

    public static ParseLoginFragment newInstance(Bundle bundle) {
        ParseLoginFragment parseLoginFragment = new ParseLoginFragment();
        parseLoginFragment.setArguments(bundle);
        return parseLoginFragment;
    }

    private void setUpParseLoginAndSignup() {
        this.parseLogin.setVisibility(0);
        if (this.config.isParseLoginEmailAsUsername()) {
            this.usernameField.setHint(R$string.com_parse_ui_email_input_hint);
        }
        if (this.config.getParseLoginButtonText() != null) {
            this.parseLoginButton.setText(this.config.getParseLoginButtonText());
        }
        this.parseLoginButton.setOnClickListener(new ـﹶ(this, 0));
        if (this.config.getParseSignupButtonText() != null) {
            this.parseSignupButton.setText(this.config.getParseSignupButtonText());
        }
        this.parseSignupButton.setOnClickListener(new ـﹶ(this, 1));
        if (this.config.getParseLoginHelpText() != null) {
            this.parseLoginHelpButton.setText(this.config.getParseLoginHelpText());
        }
        this.parseLoginHelpButton.setOnClickListener(new ـﹶ(this, 2));
    }

    @Override // com.parse.ui.login.ParseLoginFragmentBase
    public String getLogTag() {
        return "ParseLoginFragment";
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onAttach(Context context) {
        super.onAttach(context);
        InterfaceC3048 activity = getActivity();
        if (!(activity instanceof ParseLoginFragmentListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseLoginFragmentListener");
        }
        this.loginFragmentListener = (ParseLoginFragmentListener) activity;
        if (!(activity instanceof ParseOnLoginSuccessListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoginSuccessListener");
        }
        this.onLoginSuccessListener = (ParseOnLoginSuccessListener) activity;
        if (!(activity instanceof ParseOnLoadingListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoadingListener");
        }
        this.onLoadingListener = (ParseOnLoadingListener) activity;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.config = ParseLoginConfig.fromBundle(getArguments(), getActivity());
        View viewInflate = layoutInflater.inflate(R$layout.com_parse_ui_parse_login_fragment, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.app_logo);
        this.parseLogin = viewInflate.findViewById(R$id.parse_login);
        this.usernameField = (EditText) viewInflate.findViewById(R$id.login_username_input);
        this.passwordField = (EditText) viewInflate.findViewById(R$id.login_password_input);
        this.parseLoginHelpButton = (Button) viewInflate.findViewById(R$id.parse_login_help);
        this.parseLoginButton = (Button) viewInflate.findViewById(R$id.parse_login_button);
        this.parseSignupButton = (Button) viewInflate.findViewById(R$id.parse_signup_button);
        this.facebookLoginButton = (Button) viewInflate.findViewById(R$id.facebook_login);
        this.twitterLoginButton = (Button) viewInflate.findViewById(R$id.twitter_login);
        if (imageView != null && this.config.getAppLogo() != null) {
            imageView.setImageResource(this.config.getAppLogo().intValue());
        }
        if (allowParseLoginAndSignup()) {
            setUpParseLoginAndSignup();
        }
        return viewInflate;
    }
}
