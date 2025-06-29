package p456;

import android.content.SharedPreferences;
import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5329 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f20669;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C5280 f20670;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f20671;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f20672;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f20673;

    public C5329(C5280 c5280, String str, boolean z) {
        this.f20670 = c5280;
        AbstractC4753.m10688(str);
        this.f20672 = str;
        this.f20669 = z;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m12010() {
        if (!this.f20671) {
            this.f20671 = true;
            this.f20673 = this.f20670.m11856().getBoolean(this.f20672, this.f20669);
        }
        return this.f20673;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m12011(boolean z) {
        SharedPreferences.Editor editorEdit = this.f20670.m11856().edit();
        editorEdit.putBoolean(this.f20672, z);
        editorEdit.apply();
        this.f20673 = z;
    }
}
