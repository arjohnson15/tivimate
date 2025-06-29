package p049;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import p312.AbstractC3587;

/* renamed from: ʽﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1309 extends Thread {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f5350;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5351 = 0;

    public C1309(HashMap map) {
        this.f5350 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309(AbstractC3587 abstractC3587) {
        super("ExoPlayer:SimpleDecoder");
        this.f5350 = abstractC3587;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f5351) {
            case 0:
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap map = (HashMap) this.f5350;
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                            sb.append("Received non-success response code ");
                            sb.append(responseCode);
                            sb.append(" from pinging URL: ");
                            sb.append(string);
                            sb.toString();
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb2.append("Error while pinging URL: ");
                    sb2.append(string);
                    sb2.append(". ");
                    sb2.append(message);
                    sb2.toString();
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    String message2 = e2.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message2);
                    sb3.toString();
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    String message3 = e.getMessage();
                    StringBuilder sb22 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb22.append("Error while pinging URL: ");
                    sb22.append(string);
                    sb22.append(". ");
                    sb22.append(message3);
                    sb22.toString();
                    return;
                } finally {
                }
            default:
                AbstractC3587 abstractC3587 = (AbstractC3587) this.f5350;
                abstractC3587.getClass();
                do {
                    try {
                    } catch (InterruptedException e4) {
                        throw new IllegalStateException(e4);
                    }
                } while (abstractC3587.m8488());
                return;
        }
    }
}
