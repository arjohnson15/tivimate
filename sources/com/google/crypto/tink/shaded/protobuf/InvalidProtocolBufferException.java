package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f3520;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m2921() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m2922() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static InvalidWireTypeException m2923() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m2924() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m2925() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m2926() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m2927() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }
}
