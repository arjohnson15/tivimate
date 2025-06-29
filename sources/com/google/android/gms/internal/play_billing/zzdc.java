package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzdc extends IOException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final /* synthetic */ int f2951 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static zzdc m2543() {
        return new zzdc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static zzdc m2544() {
        return new zzdc("Failed to parse the message.");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static zzdc m2545() {
        return new zzdc("Protocol message had invalid UTF-8.");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static zzdc m2546() {
        return new zzdc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
