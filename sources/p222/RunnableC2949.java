package p222;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import p071.C1572;
import p071.InterfaceC1566;
import p176.InterfaceC2490;
import p226.C3027;
import p307.InterfaceC3555;
import p370.C4198;
import ˏᵢ.ᵢٴ;
import ـˈ.ﹳﹶ;

/* renamed from: ˏᴵ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2949 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f11390;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f11391;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f11392;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11393;

    public RunnableC2949(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f11393 = 6;
        this.f11392 = bottomSheetBehavior;
        this.f11391 = view;
        this.f11390 = i;
    }

    public /* synthetic */ RunnableC2949(Object obj, Object obj2, int i, int i2) {
        this.f11393 = i2;
        this.f11391 = obj;
        this.f11392 = obj2;
        this.f11390 = i;
    }

    public /* synthetic */ RunnableC2949(C3027 c3027, int i, Object obj, int i2) {
        this.f11393 = i2;
        this.f11392 = c3027;
        this.f11390 = i;
        this.f11391 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        InterfaceC1566 interfaceC1566;
        int i = this.f11390;
        Object obj = this.f11391;
        Object obj2 = this.f11392;
        switch (this.f11393) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i);
                break;
            case 1:
                Serializable serializable = (Serializable) ((ᵢٴ) obj).ˆʿ;
                C3027 c3027 = (C3027) obj2;
                String str = (String) c3027.f6317.get(Integer.valueOf(i));
                if (str != null) {
                    C1572 c1572 = (C1572) c3027.f6315.get(str);
                    if (c1572 != null && (interfaceC1566 = c1572.f6324) != null) {
                        if (c3027.f6320.remove(str)) {
                            interfaceC1566.mo4094(serializable);
                            break;
                        }
                    } else {
                        c3027.f6319.remove(str);
                        c3027.f6318.put(str, serializable);
                        break;
                    }
                }
                break;
            case 2:
                ((C3027) obj2).m5162(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                if (((ﹳﹶ) obj).getView() != null) {
                    InterfaceC2490[] interfaceC2490Arr = ﹳﹶ.ʿˊ;
                    ((ﹳﹶ) obj2).ᵎˆ().ʽᐧ.setSelectedPosition(i);
                    break;
                }
                break;
            case 4:
                String[] strArr = (String[]) obj;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj2;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                }
                ((InterfaceC3555) activity).onRequestPermissionsResult(i, strArr, iArr);
                break;
            case 5:
                ((C4198) obj).m9631((Intent) obj2, i);
                break;
            default:
                ((BottomSheetBehavior) obj2).m2820((View) obj, i, false);
                break;
        }
    }
}
