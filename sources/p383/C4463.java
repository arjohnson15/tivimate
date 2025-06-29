package p383;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: ᵢᵢ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4463 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Message f17178;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10121() {
        Message message = this.f17178;
        message.getClass();
        message.sendToTarget();
        m10122();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10122() {
        this.f17178 = null;
        ArrayList arrayList = C4469.f17190;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }
}
