package p279;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* renamed from: ٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3369 extends AbstractC3372 {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ int f13189;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3369(Context context, ﹶˆ r2, int i) {
        super(context, r2);
        this.f13189 = i;
    }

    @Override // p279.AbstractC3372
    /* renamed from: ʿʼ */
    public final IntentFilter mo8222() {
        switch (this.f13189) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                if (Build.VERSION.SDK_INT >= 23) {
                    intentFilter.addAction("android.os.action.CHARGING");
                    intentFilter.addAction("android.os.action.DISCHARGING");
                } else {
                    intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                    intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                }
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // p279.AbstractC3370
    /* renamed from: ـﹶ */
    public final Object mo8223() {
        int intExtra;
        switch (this.f13189) {
            case 0:
                Intent intentRegisterReceiver = this.f13190.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    C5391.m12163().m12167(AbstractC3363.f13182, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                boolean z = true;
                if (Build.VERSION.SDK_INT < 23 ? intentRegisterReceiver.getIntExtra("plugged", 0) == 0 : (intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = this.f13190.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    C5391.m12163().m12167(AbstractC3368.f13188, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z2 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                Intent intentRegisterReceiver3 = this.f13190.registerReceiver(null, mo8222());
                boolean z3 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z3 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // p279.AbstractC3372
    /* renamed from: ٴˎ */
    public final void mo8224(Intent intent) {
        switch (this.f13189) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    C5391.m12163().m12168(AbstractC3363.f13182, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                m8227(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                m8227(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                m8227(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                m8227(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                if (intent.getAction() != null) {
                    C5391.m12163().m12168(AbstractC3368.f13188, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode == -1980154005) {
                            if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                m8227(Boolean.TRUE);
                                break;
                            }
                        } else if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                            m8227(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    C5391.m12163().m12168(AbstractC3366.f13185, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int iHashCode2 = action3.hashCode();
                        if (iHashCode2 == -1181163412) {
                            if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                m8227(Boolean.FALSE);
                                break;
                            }
                        } else if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            m8227(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
