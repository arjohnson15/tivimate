package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.HandlerC0413;
import p293.C3464;
import p305.C3524;
import p305.C3525;
import p417.AbstractC4753;
import ˆʽ.ᵎˏ;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f2408 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f2409 = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2409 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C3464 c3464M8309 = C3464.m8309(this);
                if (i2 == -1) {
                    HandlerC0413 handlerC0413 = c3464M8309.f13406;
                    handlerC0413.sendMessage(handlerC0413.obtainMessage(3));
                } else if (i2 == 0) {
                    c3464M8309.m8312(new C3524(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f2409 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2409 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2409 = bundle.getInt("resolution");
        }
        if (this.f2409 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                AbstractC4753.m10683(num);
                C3525.f13650.m8409(this, num.intValue(), this);
                this.f2409 = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f2409 = 1;
            } catch (ActivityNotFoundException e) {
                if (extras.getBoolean("notify_manager", true)) {
                    C3464.m8309(this).m8312(new C3524(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = ᵎˏ.ˑי("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.f2409 = 1;
                finish();
            } catch (IntentSender.SendIntentException e2) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2409);
        super.onSaveInstanceState(bundle);
    }
}
