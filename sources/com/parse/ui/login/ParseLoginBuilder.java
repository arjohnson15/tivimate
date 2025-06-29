package com.parse.ui.login;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ParseLoginBuilder {
    private ParseLoginConfig config = new ParseLoginConfig();
    private Context context;

    public ParseLoginBuilder(Context context) {
        this.context = context;
    }

    public Intent build() {
        Intent intent = new Intent(this.context, (Class<?>) ParseLoginActivity.class);
        intent.putExtras(this.config.toBundle());
        return intent;
    }
}
