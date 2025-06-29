package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0001;
import p045.C1302;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C1302 {
    @Override // p045.C1302
    /* renamed from: ـﹶ */
    public final void mo0(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = AbstractC0001.m9(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
