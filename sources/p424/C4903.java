package p424;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.C0876;
import p076.InterfaceC1668;
import p353.AbstractC4010;

/* renamed from: ﹶʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4903 implements InterfaceC1668 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final Pattern f18562 = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // p076.InterfaceC1668
    /* renamed from: ʿˏ */
    public final Object mo5358(Uri uri, C0876 c0876) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(c0876, AbstractC4010.f15450)).readLine();
        try {
            Matcher matcher = f18562.matcher(line);
            if (!matcher.matches()) {
                throw ParserException.m1095("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw ParserException.m1095(null, e);
        }
    }
}
