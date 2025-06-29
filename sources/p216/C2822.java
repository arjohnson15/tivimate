package p216;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p063.C1447;
import p261.InterfaceC3251;
import p314.C3598;
import p314.C3602;
import p314.InterfaceC3595;
import ˆˑ.ﹳﹳ;

/* renamed from: ˏˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2822 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3602 f10969 = new C3602("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C3602.f13820);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f10970;

    public C2822(Context context) {
        this.f10970 = context.getApplicationContext();
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final boolean mo4999(Object obj, C3598 c3598) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3251 m7099(Uri uri, C3598 c3598) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f10970;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c3598.m8502(f10969) : null;
        Drawable drawable = theme == null ? ﹳﹳ.ˋⁱ(context, contextCreatePackageContext, identifier, (Resources.Theme) null) : ﹳﹳ.ˋⁱ(context, context, identifier, theme);
        if (drawable != null) {
            return new C1447(drawable, 1);
        }
        return null;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final /* bridge */ /* synthetic */ InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        return m7099((Uri) obj, c3598);
    }
}
