package ar.tvplayer.core.util;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import androidx.leanback.widget.RunnableC0183;

/* loaded from: classes.dex */
public final class RestartProcessActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("ar.tvplayer.core.MainProcessId", -1));
        new Handler().postDelayed(new RunnableC0183(20, this), 100L);
    }
}
