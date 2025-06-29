package com.parse.ui.login;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.ui.R$id;
import com.parse.ui.R$layout;
import com.parse.ui.R$plurals;
import com.parse.ui.R$string;
import com.parse.ui.captcha.CaptchaProcessor;
import p015.C1067;

/* loaded from: classes.dex */
public class ParseSignupFragment extends ParseLoginFragmentBase implements View.OnClickListener {
    private ParseLoginConfig config;
    private EditText confirmPasswordField;
    private Button createAccountButton;
    private EditText emailField;
    private int minPasswordLength;
    private EditText nameField;
    private ParseOnLoginSuccessListener onLoginSuccessListener;
    private EditText passwordField;
    private EditText usernameField;

    private String getEnteredEmail() {
        if (this.config.isParseLoginEmailAsUsername()) {
            return Utils.getCorrectedUsernameOrEmail(this.usernameField.getText().toString());
        }
        EditText editText = this.emailField;
        if (editText != null) {
            return Utils.getCorrectedUsernameOrEmail(editText.getText().toString());
        }
        return null;
    }

    private String getEnteredName() {
        EditText editText = this.nameField;
        if (editText != null) {
            return editText.getText().toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signup$0(ParseException parseException) {
        if (isActivityDestroyed()) {
            return;
        }
        loadingFinish();
        if (parseException == null) {
            signupSuccess();
            return;
        }
        debugLog(getString(R$string.com_parse_ui_login_warning_parse_signup_failed) + parseException);
        int code = parseException.getCode();
        if (code == -2) {
            showToast(R$string.com_parse_ui_update_app);
            return;
        }
        if (code == 125) {
            showToast(R$string.com_parse_ui_invalid_email_toast);
            return;
        }
        if (code == 202) {
            showToast(R$string.com_parse_ui_username_taken_toast);
            return;
        }
        if (code == 203) {
            showToast(R$string.com_parse_ui_email_taken_toast);
            return;
        }
        showToast(R$string.com_parse_ui_signup_failed_unknown_toast);
        if (parseException.getCode() == 209) {
            ParseUser.logOutInBackground();
        }
    }

    public static ParseSignupFragment newInstance(Bundle bundle, String str, String str2) {
        ParseSignupFragment parseSignupFragment = new ParseSignupFragment();
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("com.parse.ui.login.ParseSignupFragment.USERNAME", str);
        bundle2.putString("com.parse.ui.login.ParseSignupFragment.PASSWORD", str2);
        parseSignupFragment.setArguments(bundle2);
        return parseSignupFragment;
    }

    private void signup(String str, String str2, String str3, String str4, String str5) {
        ParseUser parseUser = (ParseUser) ParseObject.create(ParseUser.class);
        parseUser.setUsername(str.toLowerCase());
        parseUser.setPassword(str4);
        parseUser.setEmail(str2 != null ? str2.toLowerCase() : null);
        if (str3 != null && str3.length() != 0 && this.config.isParseSignupNameFieldEnabled().booleanValue()) {
            parseUser.put("name", str3);
        }
        loadingStart();
        parseUser.signUpInBackground(str5, new C1067(24, this));
    }

    private void signupSuccess() {
        this.onLoginSuccessListener.onLoginSuccess();
    }

    @Override // com.parse.ui.login.ParseLoginFragmentBase
    public String getLogTag() {
        return "ParseSignupFragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ParseOnLoginSuccessListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoginSuccessListener");
        }
        this.onLoginSuccessListener = (ParseOnLoginSuccessListener) activity;
        if (!(activity instanceof ParseOnLoadingListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoadingListener");
        }
        this.onLoadingListener = (ParseOnLoadingListener) activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String correctedUsernameOrEmail = Utils.getCorrectedUsernameOrEmail(this.usernameField.getText().toString());
        String string = this.passwordField.getText().toString();
        String string2 = this.confirmPasswordField.getText().toString();
        String enteredEmail = getEnteredEmail();
        String enteredName = getEnteredName();
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
            return;
        }
        if (string.length() < this.minPasswordLength) {
            Resources resources = getResources();
            int i = R$plurals.com_parse_ui_password_too_short_toast;
            int i2 = this.minPasswordLength;
            showToast(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
            return;
        }
        if (string2.length() == 0) {
            showToast(R$string.com_parse_ui_reenter_password_toast);
            return;
        }
        if (!string.equals(string2)) {
            showToast(R$string.com_parse_ui_mismatch_confirm_password_toast);
            this.confirmPasswordField.selectAll();
            this.confirmPasswordField.requestFocus();
        } else {
            if (enteredEmail != null && enteredEmail.length() == 0) {
                showToast(R$string.com_parse_ui_no_email_toast);
                return;
            }
            if (enteredName != null && enteredName.length() == 0 && this.config.isParseSignupNameFieldEnabled().booleanValue()) {
                showToast(R$string.com_parse_ui_no_name_toast);
            } else if (!Utils.isCompanionApp()) {
                signup(correctedUsernameOrEmail, enteredEmail, enteredName, string, "");
            } else {
                CaptchaProcessor.Factory.get(getActivity());
                showToast(R$string.com_parse_ui_signup_failed_unknown_toast);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        ParseLoginConfig parseLoginConfigFromBundle = ParseLoginConfig.fromBundle(arguments, getActivity());
        this.config = parseLoginConfigFromBundle;
        this.minPasswordLength = 6;
        if (parseLoginConfigFromBundle.getParseSignupMinPasswordLength() != null) {
            this.minPasswordLength = this.config.getParseSignupMinPasswordLength().intValue();
        }
        String string = arguments.getString("com.parse.ui.login.ParseSignupFragment.USERNAME");
        String string2 = arguments.getString("com.parse.ui.login.ParseSignupFragment.PASSWORD");
        View viewInflate = layoutInflater.inflate(R$layout.com_parse_ui_parse_signup_fragment, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.app_logo);
        this.usernameField = (EditText) viewInflate.findViewById(R$id.signup_username_input);
        this.passwordField = (EditText) viewInflate.findViewById(R$id.signup_password_input);
        this.confirmPasswordField = (EditText) viewInflate.findViewById(R$id.signup_confirm_password_input);
        this.emailField = (EditText) viewInflate.findViewById(R$id.signup_email_input);
        this.nameField = (EditText) viewInflate.findViewById(R$id.signup_name_input);
        if (!this.config.isParseSignupNameFieldEnabled().booleanValue()) {
            this.nameField.setVisibility(4);
        }
        this.createAccountButton = (Button) viewInflate.findViewById(R$id.create_account);
        this.usernameField.setText(string);
        this.passwordField.setText(string2);
        if (imageView != null && this.config.getAppLogo() != null) {
            imageView.setImageResource(this.config.getAppLogo().intValue());
        }
        if (this.config.isParseLoginEmailAsUsername()) {
            this.usernameField.setHint(R$string.com_parse_ui_email_input_hint);
            EditText editText = this.emailField;
            if (editText != null) {
                editText.setVisibility(8);
            }
        }
        if (this.config.getParseSignupSubmitButtonText() != null) {
            this.createAccountButton.setText(this.config.getParseSignupSubmitButtonText());
        }
        this.createAccountButton.setOnClickListener(this);
        return viewInflate;
    }
}
