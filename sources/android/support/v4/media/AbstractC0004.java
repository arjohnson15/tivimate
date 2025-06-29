package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0004 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static MediaDescription.Builder m56() {
        return new MediaDescription.Builder();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Bitmap m57(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m58(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m59(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m60(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m61(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m62(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static CharSequence m63(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static CharSequence m64(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m65(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static MediaDescription m66(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Uri m67(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m68(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m69(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Bundle m70(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static CharSequence m71(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }
}
