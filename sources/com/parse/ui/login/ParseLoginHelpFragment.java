package com.parse.ui.login;

import android.app.Activity;
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
import com.parse.RequestPasswordResetCallback;
import com.parse.ui.R$id;
import com.parse.ui.R$layout;
import com.parse.ui.R$string;

/* loaded from: classes.dex */
public class ParseLoginHelpFragment extends ParseLoginFragmentBase implements View.OnClickListener {
    private ParseLoginConfig config;
    private EditText emailField;
    private boolean emailSent = false;
    private TextView instructionsTextView;
    private ParseOnLoginHelpSuccessListener onLoginHelpSuccessListener;
    private Button submitButton;

    public interface ParseOnLoginHelpSuccessListener {
        void onLoginHelpSuccess();
    }

    public static ParseLoginHelpFragment newInstance(Bundle bundle) {
        ParseLoginHelpFragment parseLoginHelpFragment = new ParseLoginHelpFragment();
        parseLoginHelpFragment.setArguments(bundle);
        return parseLoginHelpFragment;
    }

    @Override // com.parse.ui.login.ParseLoginFragmentBase
    public String getLogTag() {
        return "ParseLoginHelpFragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ParseOnLoadingListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoadingListener");
        }
        this.onLoadingListener = (ParseOnLoadingListener) activity;
        if (!(activity instanceof ParseOnLoginHelpSuccessListener)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoginHelpSuccessListener");
        }
        this.onLoginHelpSuccessListener = (ParseOnLoginHelpSuccessListener) activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.emailSent) {
            this.onLoginHelpSuccessListener.onLoginHelpSuccess();
            return;
        }
        String correctedUsernameOrEmail = Utils.getCorrectedUsernameOrEmail(this.emailField.getText().toString());
        if (correctedUsernameOrEmail.length() == 0) {
            showToast(R$string.com_parse_ui_no_email_toast);
        } else {
            loadingStart();
            ParseUser.requestPasswordResetInBackground(correctedUsernameOrEmail.toLowerCase(), new RequestPasswordResetCallback() { // from class: com.parse.ui.login.ParseLoginHelpFragment.1
                @Override // com.parse.ParseCallback1
                public void done(ParseException parseException) {
                    if (ParseLoginHelpFragment.this.isActivityDestroyed()) {
                        return;
                    }
                    ParseLoginHelpFragment.this.loadingFinish();
                    if (parseException == null) {
                        ParseLoginHelpFragment.this.instructionsTextView.setText(R$string.com_parse_ui_login_help_email_sent);
                        ParseLoginHelpFragment.this.emailField.setVisibility(4);
                        ParseLoginHelpFragment.this.submitButton.setText(R$string.com_parse_ui_login_help_login_again_button_label);
                        ParseLoginHelpFragment.this.emailSent = true;
                        return;
                    }
                    ParseLoginHelpFragment.this.debugLog(ParseLoginHelpFragment.this.getString(R$string.com_parse_ui_login_warning_password_reset_failed) + parseException.toString());
                    if (parseException.getCode() == 125 || parseException.getCode() == 205) {
                        ParseLoginHelpFragment.this.showToast(R$string.com_parse_ui_invalid_email_toast);
                        return;
                    }
                    ParseLoginHelpFragment.this.showToast(R$string.com_parse_ui_login_help_submit_failed_unknown);
                    if (parseException.getCode() == 209) {
                        ParseUser.logOutInBackground();
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.config = ParseLoginConfig.fromBundle(getArguments(), getActivity());
        View viewInflate = layoutInflater.inflate(R$layout.com_parse_ui_parse_login_help_fragment, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.app_logo);
        this.instructionsTextView = (TextView) viewInflate.findViewById(R$id.login_help_instructions);
        this.emailField = (EditText) viewInflate.findViewById(R$id.login_help_email_input);
        this.submitButton = (Button) viewInflate.findViewById(R$id.login_help_submit);
        if (imageView != null && this.config.getAppLogo() != null) {
            imageView.setImageResource(this.config.getAppLogo().intValue());
        }
        this.submitButton.setOnClickListener(this);
        return viewInflate;
    }
}
