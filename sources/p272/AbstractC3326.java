package p272;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: ـᐧ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3326 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f12893 = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m8118(CharSequence charSequence) {
        return f12893.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
