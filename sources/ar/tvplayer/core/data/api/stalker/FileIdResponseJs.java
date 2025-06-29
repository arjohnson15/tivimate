package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class FileIdResponseJs {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1846;

    public FileIdResponseJs(@InterfaceC5065(name = "data") List<FileInfo> list) {
        this.f1846 = list;
    }

    public final FileIdResponseJs copy(@InterfaceC5065(name = "data") List<FileInfo> list) {
        return new FileIdResponseJs(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileIdResponseJs) && AbstractC1549.m5138(this.f1846, ((FileIdResponseJs) obj).f1846);
    }

    public final int hashCode() {
        return this.f1846.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("FileIdResponseJs(files="), this.f1846, ')');
    }
}
