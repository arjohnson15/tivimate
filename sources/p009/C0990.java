package p009;

import android.content.Context;
import com.bumptech.glide.C0287;
import java.util.HashSet;

/* renamed from: ʻˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0990 implements InterfaceC0981 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0287 f4339;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f4340;

    public C0990(Context context, C0287 c0287) {
        this.f4340 = context.getApplicationContext();
        this.f4339 = c0287;
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˉי */
    public final void mo1559() {
        ˋˊ r0 = ˋˊ.ˏᵢ(this.f4340);
        C0287 c0287 = this.f4339;
        synchronized (r0) {
            ((HashSet) r0.ᐧˋ).add(c0287);
            if (!r0.ˆʿ && !((HashSet) r0.ᐧˋ).isEmpty()) {
                r0.ˆʿ = ((InterfaceC0991) r0.ˎˑ).mo1602();
            }
        }
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˏʾ */
    public final void mo1560() {
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˑʽ */
    public final void mo1562() {
        ˋˊ r0 = ˋˊ.ˏᵢ(this.f4340);
        C0287 c0287 = this.f4339;
        synchronized (r0) {
            ((HashSet) r0.ᐧˋ).remove(c0287);
            if (r0.ˆʿ && ((HashSet) r0.ᐧˋ).isEmpty()) {
                ((InterfaceC0991) r0.ˎˑ).mo1607();
                r0.ˆʿ = false;
            }
        }
    }
}
