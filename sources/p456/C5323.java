package p456;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞⁱ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5323 extends AbstractC5324 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public AccountManager f20643;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f20644;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public String f20645;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Boolean f20646;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f20647;

    @Override // p456.AbstractC5324
    /* renamed from: ᵔˋ */
    public final boolean mo11746() {
        Calendar calendar = Calendar.getInstance();
        this.f20644 = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f20645 = ᐧʻ.ˋⁱ(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final String m11995() {
        m11997();
        return this.f20645;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final long m11996() {
        m11997();
        return this.f20644;
    }
}
