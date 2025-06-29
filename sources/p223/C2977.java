package p223;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ˏᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2977 implements FilenameFilter {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ String f11452;

    public C2977(String str) {
        this.f11452 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f11452 + ".");
    }
}
