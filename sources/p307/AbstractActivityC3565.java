package p307;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.FragmentC0206;
import androidx.lifecycle.InterfaceC0262;
import com.bumptech.glide.ˑʽ;
import p200.C2755;
import p378.InterfaceC4391;

/* renamed from: ᐧˋ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3565 extends Activity implements InterfaceC0262, InterfaceC4391 {
    private final C2755 extraDataMap = new C2755(0);
    private final C0236 lifecycleRegistry = new C0236(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (ˑʽ.ˉי(keyEvent, decorView)) {
            return true;
        }
        return ˑʽ.ˏʾ(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (ˑʽ.ˉי(keyEvent, getWindow().getDecorView())) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0206.f1216;
        AbstractC0224.m1019(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0236 c0236 = this.lifecycleRegistry;
        EnumC0230 enumC0230 = EnumC0230.f1252;
        c0236.m1038("setCurrentState");
        c0236.m1036(enumC0230);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5c
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L5c
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L4c;
                case 100470631: goto L3c;
                case 472614934: goto L33;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5c
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L5c
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L5c
        L21:
            r1 = 1
            goto L5c
        L23:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L2c
            goto L5c
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L5c
            goto L21
        L33:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L3c:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L45:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L5c
            goto L21
        L4c:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L55
            goto L5c
        L55:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L5c
            goto L21
        L5c:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p307.AbstractActivityC3565.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // p378.InterfaceC4391
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
