package com.bumptech.glide.load.data;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0280 extends AbstractC0269 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final UriMatcher f2325;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f2325 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC0269
    /* renamed from: ᐧʻ */
    public final void mo1530(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // com.bumptech.glide.load.data.AbstractC0269
    /* renamed from: ﹶˆ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1532(android.net.Uri r4, android.content.ContentResolver r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.C0280.f2325
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 3
            if (r0 == r2) goto L14
            r2 = 5
            if (r0 == r2) goto L19
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L23
        L14:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L23
        L19:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L3a
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L23:
            if (r5 == 0) goto L26
            return r5
        L26:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InputStream is null for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L3a:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.C0280.mo1532(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }
}
