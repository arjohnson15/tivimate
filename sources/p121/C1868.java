package p121;

import android.support.v4.media.session.AbstractC0002;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: ˈˑ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1868 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f7143;

    public C1868(long j) {
        this.f7143 = j;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1868 m5631(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C1868(Long.parseLong(jsonReader.nextString())) : new C1868(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1868) {
            return this.f7143 == ((C1868) obj).f7143;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7143;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return AbstractC0002.m42(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f7143, "}");
    }
}
