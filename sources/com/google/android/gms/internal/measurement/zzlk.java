package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzlk extends IOException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final /* synthetic */ int f2417 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static zzlk m1613() {
        return new zzlk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static zzlk m1614() {
        return new zzlk("Failed to parse the message.");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static zzlk m1615() {
        return new zzlk("Protocol message had invalid UTF-8.");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static zzlk m1616() {
        return new zzlk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
