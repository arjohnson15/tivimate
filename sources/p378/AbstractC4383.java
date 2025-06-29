package p378;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
import ᵢ.ʿʼ;

/* renamed from: ᵢٴ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4383 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4367 m9972(View view, C4367 c4367) {
        ContentInfo contentInfoMo9842 = c4367.f16869.mo9842();
        Objects.requireNonNull(contentInfoMo9842);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo9842);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo9842 ? c4367 : new C4367(new ʿʼ(contentInfoPerformReceiveContent));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String[] m9973(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
