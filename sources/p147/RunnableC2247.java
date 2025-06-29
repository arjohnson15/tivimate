package p147;

import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import p069.C1541;
import p210.C2804;
import p331.C3761;

/* renamed from: ˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2247 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2250 f8948;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f8949;

    public /* synthetic */ RunnableC2247(C2250 c2250, int i) {
        this.f8949 = i;
        this.f8948 = c2250;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C1541 c1541M12109;
        C1541 c1541M6253;
        switch (this.f8949) {
            case 0:
                this.f8948.m6241();
                return;
            case 1:
                this.f8948.m6241();
                return;
            default:
                C2250 c2250 = this.f8948;
                c2250.getClass();
                synchronized (C2250.f8952) {
                    try {
                        C2804 c2804 = c2250.f8960;
                        c2804.m7085();
                        C3761 c3761M8761 = C3761.m8761(c2804.f10936);
                        try {
                            c1541M12109 = c2250.f8959.m12109();
                            if (c3761M8761 != null) {
                                c3761M8761.m8771();
                            }
                        } catch (Throwable th) {
                            if (c3761M8761 != null) {
                                c3761M8761.m8771();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = c1541M12109.f6260;
                    if (i == 5) {
                        c1541M6253 = c2250.m6253(c1541M12109);
                    } else {
                        if (i == 3) {
                            c1541M6253 = c2250.m6253(c1541M12109);
                        } else if (!c2250.f8963.m6255(c1541M12109)) {
                            return;
                        } else {
                            c1541M6253 = c2250.m6248(c1541M12109);
                        }
                    }
                    c2250.m6250(c1541M6253);
                    c2250.m6245(c1541M12109, c1541M6253);
                    if (c1541M6253.f6260 == 4) {
                        c2250.m6244(c1541M6253.f6263);
                    }
                    int i2 = c1541M6253.f6260;
                    if (i2 == 5) {
                        c2250.m6243(new FirebaseInstallationsException());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        c2250.m6243(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c2250.m6246(c1541M6253);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    c2250.m6243(e);
                    return;
                }
        }
    }
}
