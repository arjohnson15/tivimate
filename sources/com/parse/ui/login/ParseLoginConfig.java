package com.parse.ui.login;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.parse.Parse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class ParseLoginConfig {
    private Integer appLogo;
    private CharSequence facebookLoginButtonText;
    private Boolean facebookLoginEnabled;
    private Collection<String> facebookLoginPermissions;
    private CharSequence parseLoginButtonText;
    private Boolean parseLoginEmailAsUsername;
    private Boolean parseLoginEnabled;
    private CharSequence parseLoginHelpText;
    private CharSequence parseLoginInvalidCredentialsToastText;
    private CharSequence parseSignupButtonText;
    private Integer parseSignupMinPasswordLength;
    private Boolean parseSignupNameFieldEnabled;
    private CharSequence parseSignupSubmitButtonText;
    private CharSequence twitterLoginButtonText;
    private Boolean twitterLoginEnabled;

    public static ParseLoginConfig fromBundle(Bundle bundle, Context context) {
        ParseLoginConfig parseLoginConfig = new ParseLoginConfig();
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.APP_LOGO")) {
            parseLoginConfig.setAppLogo(Integer.valueOf(bundle.getInt("com.parse.ui.login.ParseLoginActivity.APP_LOGO")));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_ENABLED")) {
            parseLoginConfig.setParseLoginEnabled(bundle.getBoolean("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_ENABLED"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_BUTTON_TEXT")) {
            parseLoginConfig.setParseLoginButtonText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_BUTTON_TEXT"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_BUTTON_TEXT")) {
            parseLoginConfig.setParseSignupButtonText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_BUTTON_TEXT"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_HELP_TEXT")) {
            parseLoginConfig.setParseLoginHelpText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_HELP_TEXT"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_INVALID_CREDENTIALS_TEXT")) {
            parseLoginConfig.setParseLoginInvalidCredentialsToastText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_INVALID_CREDENTIALS_TEXT"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_EMAIL_AS_USERNAME")) {
            parseLoginConfig.setParseLoginEmailAsUsername(bundle.getBoolean("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_EMAIL_AS_USERNAME"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_MIN_PASSWORD_LENGTH")) {
            parseLoginConfig.setParseSignupMinPasswordLength(Integer.valueOf(bundle.getInt("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_MIN_PASSWORD_LENGTH")));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_SUBMIT_BUTTON_TEXT")) {
            parseLoginConfig.setParseSignupSubmitButtonText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_SUBMIT_BUTTON_TEXT"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_NAME_FIELD_ENABLED")) {
            parseLoginConfig.setParseSignupNameFieldEnabled(Boolean.valueOf(bundle.getBoolean("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_NAME_FIELD_ENABLED")));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_ENABLED")) {
            parseLoginConfig.setFacebookLoginEnabled(bundle.getBoolean("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_ENABLED"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_BUTTON_TEXT")) {
            parseLoginConfig.setFacebookLoginButtonText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_BUTTON_TEXT"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_PERMISSIONS") && bundle.getInt("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_PERMISSIONS") != 0) {
            try {
                parseLoginConfig.setFacebookLoginPermissions(stringArrayToCollection(context.getResources().getStringArray(bundle.getInt("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_PERMISSIONS"))));
            } catch (Resources.NotFoundException unused) {
                if (Parse.getLogLevel() <= 6) {
                }
            }
        } else if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_PERMISSIONS_STRING_ARRAY")) {
            parseLoginConfig.setFacebookLoginPermissions(stringArrayToCollection(bundle.getStringArray("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_PERMISSIONS_STRING_ARRAY")));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.TWITTER_LOGIN_ENABLED")) {
            parseLoginConfig.setTwitterLoginEnabled(bundle.getBoolean("com.parse.ui.login.ParseLoginActivity.TWITTER_LOGIN_ENABLED"));
        }
        if (setKeySet.contains("com.parse.ui.login.ParseLoginActivity.TWITTER_LOGIN_BUTTON_TEXT")) {
            parseLoginConfig.setTwitterLoginButtonText(bundle.getCharSequence("com.parse.ui.login.ParseLoginActivity.TWITTER_LOGIN_BUTTON_TEXT"));
        }
        return parseLoginConfig;
    }

    private static Collection<String> stringArrayToCollection(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public Integer getAppLogo() {
        return this.appLogo;
    }

    public CharSequence getParseLoginButtonText() {
        return this.parseLoginButtonText;
    }

    public CharSequence getParseLoginHelpText() {
        return this.parseLoginHelpText;
    }

    public CharSequence getParseLoginInvalidCredentialsToastText() {
        return this.parseLoginInvalidCredentialsToastText;
    }

    public CharSequence getParseSignupButtonText() {
        return this.parseSignupButtonText;
    }

    public Integer getParseSignupMinPasswordLength() {
        return this.parseSignupMinPasswordLength;
    }

    public CharSequence getParseSignupSubmitButtonText() {
        return this.parseSignupSubmitButtonText;
    }

    public boolean isParseLoginEmailAsUsername() {
        Boolean bool = this.parseLoginEmailAsUsername;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean isParseLoginEnabled() {
        Boolean bool = this.parseLoginEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public Boolean isParseSignupNameFieldEnabled() {
        Boolean bool = this.parseSignupNameFieldEnabled;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void setAppLogo(Integer num) {
        this.appLogo = num;
    }

    public void setFacebookLoginButtonText(CharSequence charSequence) {
        this.facebookLoginButtonText = charSequence;
    }

    public void setFacebookLoginEnabled(boolean z) {
        this.facebookLoginEnabled = Boolean.valueOf(z);
    }

    public void setFacebookLoginPermissions(Collection<String> collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.facebookLoginPermissions = arrayList;
            arrayList.addAll(collection);
        }
    }

    public void setParseLoginButtonText(CharSequence charSequence) {
        this.parseLoginButtonText = charSequence;
    }

    public void setParseLoginEmailAsUsername(boolean z) {
        this.parseLoginEmailAsUsername = Boolean.valueOf(z);
    }

    public void setParseLoginEnabled(boolean z) {
        this.parseLoginEnabled = Boolean.valueOf(z);
    }

    public void setParseLoginHelpText(CharSequence charSequence) {
        this.parseLoginHelpText = charSequence;
    }

    public void setParseLoginInvalidCredentialsToastText(CharSequence charSequence) {
        this.parseLoginInvalidCredentialsToastText = charSequence;
    }

    public void setParseSignupButtonText(CharSequence charSequence) {
        this.parseSignupButtonText = charSequence;
    }

    public void setParseSignupMinPasswordLength(Integer num) {
        this.parseSignupMinPasswordLength = num;
    }

    public void setParseSignupNameFieldEnabled(Boolean bool) {
        this.parseSignupNameFieldEnabled = bool;
    }

    public void setParseSignupSubmitButtonText(CharSequence charSequence) {
        this.parseSignupSubmitButtonText = charSequence;
    }

    public void setTwitterLoginButtonText(CharSequence charSequence) {
        this.twitterLoginButtonText = charSequence;
    }

    public void setTwitterLoginEnabled(boolean z) {
        this.twitterLoginEnabled = Boolean.valueOf(z);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        Integer num = this.appLogo;
        if (num != null) {
            bundle.putInt("com.parse.ui.login.ParseLoginActivity.APP_LOGO", num.intValue());
        }
        Boolean bool = this.parseLoginEnabled;
        if (bool != null) {
            bundle.putBoolean("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_ENABLED", bool.booleanValue());
        }
        CharSequence charSequence = this.parseLoginButtonText;
        if (charSequence != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_BUTTON_TEXT", charSequence);
        }
        CharSequence charSequence2 = this.parseSignupButtonText;
        if (charSequence2 != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_BUTTON_TEXT", charSequence2);
        }
        CharSequence charSequence3 = this.parseLoginHelpText;
        if (charSequence3 != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_HELP_TEXT", charSequence3);
        }
        CharSequence charSequence4 = this.parseLoginInvalidCredentialsToastText;
        if (charSequence4 != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_INVALID_CREDENTIALS_TEXT", charSequence4);
        }
        Boolean bool2 = this.parseLoginEmailAsUsername;
        if (bool2 != null) {
            bundle.putBoolean("com.parse.ui.login.ParseLoginActivity.PARSE_LOGIN_EMAIL_AS_USERNAME", bool2.booleanValue());
        }
        Integer num2 = this.parseSignupMinPasswordLength;
        if (num2 != null) {
            bundle.putInt("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_MIN_PASSWORD_LENGTH", num2.intValue());
        }
        CharSequence charSequence5 = this.parseSignupSubmitButtonText;
        if (charSequence5 != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_SUBMIT_BUTTON_TEXT", charSequence5);
        }
        Boolean bool3 = this.parseSignupNameFieldEnabled;
        if (bool3 != null) {
            bundle.putBoolean("com.parse.ui.login.ParseLoginActivity.PARSE_SIGNUP_NAME_FIELD_ENABLED", bool3.booleanValue());
        }
        Boolean bool4 = this.facebookLoginEnabled;
        if (bool4 != null) {
            bundle.putBoolean("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_ENABLED", bool4.booleanValue());
        }
        CharSequence charSequence6 = this.facebookLoginButtonText;
        if (charSequence6 != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_BUTTON_TEXT", charSequence6);
        }
        Collection<String> collection = this.facebookLoginPermissions;
        if (collection != null) {
            bundle.putStringArray("com.parse.ui.login.ParseLoginActivity.FACEBOOK_LOGIN_PERMISSIONS_STRING_ARRAY", (String[]) collection.toArray(new String[0]));
        }
        Boolean bool5 = this.twitterLoginEnabled;
        if (bool5 != null) {
            bundle.putBoolean("com.parse.ui.login.ParseLoginActivity.TWITTER_LOGIN_ENABLED", bool5.booleanValue());
        }
        CharSequence charSequence7 = this.twitterLoginButtonText;
        if (charSequence7 != null) {
            bundle.putCharSequence("com.parse.ui.login.ParseLoginActivity.TWITTER_LOGIN_BUTTON_TEXT", charSequence7);
        }
        return bundle;
    }
}
