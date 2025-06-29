package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class FileIdResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final FileIdResponseJs f1845;

    public FileIdResponse(@InterfaceC5065(name = "js") FileIdResponseJs fileIdResponseJs) {
        this.f1845 = fileIdResponseJs;
    }

    public final FileIdResponse copy(@InterfaceC5065(name = "js") FileIdResponseJs fileIdResponseJs) {
        return new FileIdResponse(fileIdResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileIdResponse) && AbstractC1549.m5138(this.f1845, ((FileIdResponse) obj).f1845);
    }

    public final int hashCode() {
        return this.f1845.f1846.hashCode();
    }

    public final String toString() {
        return "FileIdResponse(js=" + this.f1845 + ')';
    }
}
