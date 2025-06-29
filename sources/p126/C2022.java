package p126;

import com.bumptech.glide.ˑʽ;
import java.util.regex.Pattern;
import p366.C4143;
import p366.C4149;
import p366.InterfaceC4161;
import p430.AbstractC5001;
import p430.C5002;

/* renamed from: ˈᵔ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2022 extends AbstractC5001 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f7675;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f7676;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC4161 f7677;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f7678;

    public /* synthetic */ C2022(Object obj, long j, InterfaceC4161 interfaceC4161, int i) {
        this.f7678 = i;
        this.f7676 = obj;
        this.f7675 = j;
        this.f7677 = interfaceC4161;
    }

    @Override // p430.AbstractC5001
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5002 mo5666() {
        Object obj = this.f7676;
        switch (this.f7678) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C5002.f18947;
                try {
                    return ˑʽ.ˋⁱ(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (C5002) obj;
        }
    }

    @Override // p430.AbstractC5001
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC4161 mo5667() {
        switch (this.f7678) {
            case 0:
                return (C4149) this.f7677;
            default:
                return (C4143) this.f7677;
        }
    }

    @Override // p430.AbstractC5001
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long mo5668() {
        switch (this.f7678) {
        }
        return this.f7675;
    }
}
