package p136;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ˉˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C2098 implements FilenameFilter {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f8296;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f8296) {
            case 0:
                return str.startsWith("event");
            case 1:
                return str.startsWith("event") && !str.endsWith("_");
            case 2:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}
