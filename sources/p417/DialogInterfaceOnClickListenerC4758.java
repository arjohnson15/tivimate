package p417;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: ﹳᴵ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC4758 implements DialogInterface.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Intent f18252;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f18253;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f18254;

    public /* synthetic */ DialogInterfaceOnClickListenerC4758(Intent intent, Object obj, int i) {
        this.f18254 = i;
        this.f18252 = intent;
        this.f18253 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                m10692();
            } catch (ActivityNotFoundException e) {
                if (true == Build.FINGERPRINT.contains("generic")) {
                }
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ٴᵎ.ᐧʻ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10692() {
        switch (this.f18254) {
            case 0:
                Intent intent = this.f18252;
                if (intent != null) {
                    ((GoogleApiActivity) this.f18253).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f18252;
                if (intent2 != null) {
                    this.f18253.m8355(intent2, 2);
                    break;
                }
                break;
        }
    }
}
