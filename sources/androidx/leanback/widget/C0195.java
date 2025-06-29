package androidx.leanback.widget;

import android.graphics.Color;

/* renamed from: androidx.leanback.widget.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0195 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f1185;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f1186;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final /* synthetic */ PagingIndicator f1187;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f1188 = 1.0f;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f1189;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public float f1190;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f1191;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f1192;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f1193;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f1194;

    public C0195(PagingIndicator pagingIndicator) {
        this.f1187 = pagingIndicator;
        this.f1194 = pagingIndicator.f881 ? 1.0f : -1.0f;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m984() {
        this.f1189 = 0.0f;
        this.f1193 = 0.0f;
        PagingIndicator pagingIndicator = this.f1187;
        this.f1186 = pagingIndicator.f871;
        float f = pagingIndicator.f875;
        this.f1191 = f;
        this.f1192 = f * pagingIndicator.f873;
        this.f1190 = 0.0f;
        m985();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m985() {
        int iRound = Math.round(this.f1190 * 255.0f);
        PagingIndicator pagingIndicator = this.f1187;
        this.f1185 = Color.argb(iRound, Color.red(pagingIndicator.f876), Color.green(pagingIndicator.f876), Color.blue(pagingIndicator.f876));
    }
}
