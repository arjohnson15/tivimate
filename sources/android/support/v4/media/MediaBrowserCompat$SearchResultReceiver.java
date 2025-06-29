package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0001;
import java.util.ArrayList;
import p045.C1302;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C1302 {
    @Override // p045.C1302
    /* renamed from: ـﹶ */
    public final void mo0(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = AbstractC0001.m9(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
