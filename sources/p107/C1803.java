package p107;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: ˆᵔ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1803 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f6947 = new HashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f6948;

    public C1803(String str) {
        this.f6948 = str;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m5546(String str, String str2) {
        String strM195 = FileProvider.m195(str);
        String strM1952 = FileProvider.m195(str2);
        if (!strM195.equals(strM1952)) {
            if (!strM195.startsWith(strM1952 + '/')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final File m5547(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f6947.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (m5546(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
