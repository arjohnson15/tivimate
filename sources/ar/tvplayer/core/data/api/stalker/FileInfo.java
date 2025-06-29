package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class FileInfo {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1851;

    public FileInfo(@InterfaceC5065(name = "id") String str) {
        this.f1851 = str;
    }

    public final FileInfo copy(@InterfaceC5065(name = "id") String str) {
        return new FileInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileInfo) && AbstractC1549.m5138(this.f1851, ((FileInfo) obj).f1851);
    }

    public final int hashCode() {
        return this.f1851.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ˑי(new StringBuilder("FileInfo(id="), this.f1851, ')');
    }
}
