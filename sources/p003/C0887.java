package p003;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.C0274;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p216.C2822;
import p260.C3222;
import p314.C3598;
import p314.InterfaceC3594;
import p354.C4024;

/* renamed from: ʻʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0887 implements InterfaceC0913 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f4013;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f4014;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4015;

    public C0887(Context context, C0907 c0907) {
        this.f4015 = 1;
        this.f4014 = context.getApplicationContext();
        this.f4013 = c0907;
    }

    public C0887(Context context, InterfaceC0913 interfaceC0913) {
        this.f4015 = 4;
        this.f4014 = context.getApplicationContext();
        this.f4013 = interfaceC0913;
    }

    public C0887(Resources resources, InterfaceC0913 interfaceC0913) {
        this.f4015 = 3;
        this.f4013 = resources;
        this.f4014 = interfaceC0913;
    }

    public /* synthetic */ C0887(Object obj, int i, Object obj2) {
        this.f4015 = i;
        this.f4014 = obj;
        this.f4013 = obj2;
    }

    public String toString() {
        switch (this.f4015) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f4014).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0910 mo3705(Object obj, int i, int i2, C3598 c3598) throws NumberFormatException {
        C0274 c0274;
        C0910 c0910Mo3705;
        Uri uri;
        switch (this.f4015) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C4024 c4024 = new C4024(uri2);
                Object obj2 = this.f4013;
                AssetManager assetManager = (AssetManager) this.f4014;
                switch (((C0905) obj2).f4055) {
                    case 0:
                        c0274 = new C0274(assetManager, strSubstring, 0);
                        break;
                    default:
                        c0274 = new C0274(assetManager, strSubstring, 1);
                        break;
                }
                return new C0910(c4024, c0274);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c3598.m8502(C2822.f10969);
                return new C0910(new C4024(num), new C0901(theme, theme != null ? theme.getResources() : ((Context) this.f4014).getResources(), (C0907) this.f4013, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f4014;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC3594 interfaceC3594 = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC0913 interfaceC0913 = (InterfaceC0913) arrayList.get(i3);
                    if (interfaceC0913.mo3706(obj) && (c0910Mo3705 = interfaceC0913.mo3705(obj, i, i2, c3598)) != null) {
                        arrayList2.add(c0910Mo3705.f4067);
                        interfaceC3594 = c0910Mo3705.f4068;
                    }
                }
                if (arrayList2.isEmpty() || interfaceC3594 == null) {
                    return null;
                }
                return new C0910(interfaceC3594, new C0917(arrayList2, (C3222) this.f4013));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f4013;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        String str = "Received invalid resource id: " + num2;
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC0913) this.f4014).mo3705(uri, i, i2, c3598);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                InterfaceC0913 interfaceC09132 = (InterfaceC0913) this.f4013;
                C0910 c0910Mo37052 = null;
                if (size2 == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            c0910Mo37052 = interfaceC09132.mo3705(Integer.valueOf(i4), i, i2, c3598);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            String str2 = "Failed to parse a valid non-0 resource id from: " + uri3;
                        }
                        return c0910Mo37052;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c0910Mo37052;
                        }
                        String str3 = "Failed to parse resource id from: " + uri3;
                        return c0910Mo37052;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    String str4 = "Failed to parse resource uri: " + uri3;
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str5 = pathSegments2.get(0);
                String str6 = pathSegments2.get(1);
                Context context = (Context) this.f4014;
                int identifier = context.getResources().getIdentifier(str6, str5, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC09132.mo3705(Integer.valueOf(identifier), i, i2, c3598);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                String str7 = "Failed to find resource id for: " + uri3;
                return null;
        }
    }

    @Override // p003.InterfaceC0913
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo3706(Object obj) {
        switch (this.f4015) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) this.f4014).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0913) it.next()).mo3706(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if (!"android.resource".equals(uri2.getScheme()) || !((Context) this.f4014).getPackageName().equals(uri2.getAuthority())) {
                }
                break;
        }
        return true;
    }
}
