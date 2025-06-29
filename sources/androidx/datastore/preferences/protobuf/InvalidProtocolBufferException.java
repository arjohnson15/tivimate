package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static InvalidWireTypeException m218() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m219() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m220() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m221() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m222() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static InvalidProtocolBufferException m223() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
