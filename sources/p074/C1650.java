package p074;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: ʿʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1650 implements InterfaceC1648 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String[] f6437 = {"_data"};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final String[] f6438 = {"_data"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ContentResolver f6439;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6440;

    public /* synthetic */ C1650(ContentResolver contentResolver, int i) {
        this.f6440 = i;
        this.f6439 = contentResolver;
    }

    @Override // p074.InterfaceC1648
    /* renamed from: ـﹶ */
    public final Cursor mo5319(Uri uri) {
        switch (this.f6440) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f6439.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6437, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f6439.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6438, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
