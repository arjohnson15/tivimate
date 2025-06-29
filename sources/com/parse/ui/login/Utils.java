package com.parse.ui.login;

import android.text.TextUtils;
import com.parse.Parse;

/* loaded from: classes.dex */
abstract class Utils {
    public static String getCorrectedUsernameOrEmail(String str) {
        String strTrim = str.trim();
        return (TextUtils.isEmpty(strTrim) || strTrim.charAt(0) == '\"') ? strTrim : strTrim.replaceAll(". ", ".");
    }

    public static boolean isCompanionApp() {
        return Parse.getApplicationContext().getPackageName().startsWith("ar.tvplayer.companion");
    }
}
