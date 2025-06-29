package com.parse;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.parse.Parse;
import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p016.C1072;
import p094.AbstractC1760;

/* loaded from: classes.dex */
class ParseRESTUserCommand extends ParseRESTCommand {
    private String captchaToken;
    private final boolean isRevocableSessionEnabled;
    private int statusCode;
    private String userToken;
    private static final String HEADER_REVOCABLE_SESSION = AbstractC1760.m5477(7605834831163633339L);
    private static final String HEADER_TM_TOKEN = AbstractC1760.m5477(7605834977192521403L);
    private static final String HEADER_G_CAPTCHA_TOKEN = AbstractC1760.m5477(7605834904178077371L);
    private static final String HEADER_H_CAPTCHA_TOKEN = AbstractC1760.m5477(7605835007257292475L);
    private static final String HEADER_TRUE = AbstractC1760.m5477(7605835247775461051L);

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        this(str, method, map, str2, false);
    }

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2, boolean z) {
        super(str, method, map, str2);
        this.userToken = null;
        this.captchaToken = null;
        this.isRevocableSessionEnabled = z;
    }

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2, boolean z, String str3, String str4) {
        super(str, method, map, str2);
        this.isRevocableSessionEnabled = z;
        this.userToken = str3;
        this.captchaToken = str4;
    }

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2, boolean z, String str3, String str4) {
        super(str, method, jSONObject, str2);
        this.isRevocableSessionEnabled = z;
        this.userToken = str3;
        this.captchaToken = str4;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private static String calculateUserToken(String str, String str2) {
        int i;
        Parse.UserTokenCalculator userTokenCalculator = Parse.userTokenCalculator;
        if (userTokenCalculator != null) {
            return ((C1072) userTokenCalculator).m4104(str, str2);
        }
        Context context = Parse.context;
        if (context == null) {
            return AbstractC1760.m5477(7605836480431075003L);
        }
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            String str3 = ((Object) new StringBuilder(str).reverse()) + str2;
            int i2 = 0;
            for (int i3 = 0; i3 < str3.length(); i3++) {
                char cCharAt = str3.charAt(i3);
                if (cCharAt == '+') {
                    i = ˆʽ.ᵎˏ.ˉי(i3, 44, byteArray[19], Integer.parseInt(AbstractC1760.m5477(7605836411711598267L)));
                } else if (cCharAt == '@') {
                    i = ˆʽ.ᵎˏ.ˉי(i3, 29, byteArray[176], Integer.parseInt(AbstractC1760.m5477(7605834685134745275L)));
                } else if (cCharAt == '_') {
                    i = ˆʽ.ᵎˏ.ˉי(i3, 42, byteArray[7], Integer.parseInt(AbstractC1760.m5477(7605836364466958011L)));
                } else if (cCharAt == '-') {
                    i = ˆʽ.ᵎˏ.ˉי(i3, 45, byteArray[216], Integer.parseInt(AbstractC1760.m5477(7605834788213960379L)));
                } else if (cCharAt != '.') {
                    switch (cCharAt) {
                        case '0':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 92, byteArray[14], Integer.parseInt(AbstractC1760.m5477(7605836420301532859L)));
                            break;
                        case '1':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 33, byteArray[15], Integer.parseInt(AbstractC1760.m5477(7605836424596500155L)));
                            break;
                        case '2':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 84, byteArray[99], Integer.parseInt(AbstractC1760.m5477(7605834539105857211L)));
                            break;
                        case '3':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 25, byteArray[28], Integer.parseInt(AbstractC1760.m5477(7605834388782001851L)));
                            break;
                        case '4':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 65, byteArray[111], Integer.parseInt(AbstractC1760.m5477(7605834564875660987L)));
                            break;
                        case '5':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 74, byteArray[32], Integer.parseInt(AbstractC1760.m5477(7605834375897099963L)));
                            break;
                        case '6':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 85, byteArray[42], Integer.parseInt(AbstractC1760.m5477(7605834436026642107L)));
                            break;
                        case '7':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 26, byteArray[52], Integer.parseInt(AbstractC1760.m5477(7605834324357492411L)));
                            break;
                        case '8':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 22, byteArray[67], Integer.parseInt(AbstractC1760.m5477(7605834315767557819L)));
                            break;
                        case '9':
                            i = ˆʽ.ᵎˏ.ˉי(i3, 33, byteArray[83], Integer.parseInt(AbstractC1760.m5477(7605834341537361595L)));
                            break;
                        default:
                            switch (cCharAt) {
                                case 'a':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 38, byteArray[74], Integer.parseInt(AbstractC1760.m5477(7605834354422263483L)));
                                    break;
                                case 'b':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 18, byteArray[60], Integer.parseInt(AbstractC1760.m5477(7605834328652459707L)));
                                    break;
                                case 'c':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 85, byteArray[90], Integer.parseInt(AbstractC1760.m5477(7605834345832328891L)));
                                    break;
                                case 'd':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 74, byteArray[34], Integer.parseInt(AbstractC1760.m5477(7605834380192067259L)));
                                    break;
                                case 'e':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 87, byteArray[104], Integer.parseInt(AbstractC1760.m5477(7605834509041086139L)));
                                    break;
                                case 'f':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 80, byteArray[114], Integer.parseInt(AbstractC1760.m5477(7605834569170628283L)));
                                    break;
                                case 'g':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 17, byteArray[120], Integer.parseInt(AbstractC1760.m5477(7605834556285726395L)));
                                    break;
                                case 'h':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 61, byteArray[124], Integer.parseInt(AbstractC1760.m5477(7605834457501478587L)));
                                    break;
                                case 'i':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 12, byteArray[132], Integer.parseInt(AbstractC1760.m5477(7605834444616576699L)));
                                    break;
                                case 'j':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 56, byteArray[137], Integer.parseInt(AbstractC1760.m5477(7605834448911543995L)));
                                    break;
                                case 'k':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 25, byteArray[139], Integer.parseInt(AbstractC1760.m5477(7605834504746118843L)));
                                    break;
                                case 'l':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 67, byteArray[169], Integer.parseInt(AbstractC1760.m5477(7605834698019647163L)));
                                    break;
                                case 'm':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 26, byteArray[153], Integer.parseInt(AbstractC1760.m5477(7605834667954876091L)));
                                    break;
                                case 'n':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 70, byteArray[161], Integer.parseInt(AbstractC1760.m5477(7605834672249843387L)));
                                    break;
                                case 'o':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 21, byteArray[163], Integer.parseInt(AbstractC1760.m5477(7605834659364941499L)));
                                    break;
                                case 'p':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 54, byteArray[224], Integer.parseInt(AbstractC1760.m5477(7605834848343502523L)));
                                    break;
                                case 'q':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 49, byteArray[182], Integer.parseInt(AbstractC1760.m5477(7605834689429712571L)));
                                    break;
                                case 'r':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 70, byteArray[48], Integer.parseInt(AbstractC1760.m5477(7605834405961871035L)));
                                    break;
                                case 's':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 18, byteArray[192], Integer.parseInt(AbstractC1760.m5477(7605834577760562875L)));
                                    break;
                                case 't':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 93, byteArray[198], Integer.parseInt(AbstractC1760.m5477(7605834633595137723L)));
                                    break;
                                case 'u':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 48, byteArray[201], Integer.parseInt(AbstractC1760.m5477(7605834637890105019L)));
                                    break;
                                case 'v':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 56, byteArray[206], Integer.parseInt(AbstractC1760.m5477(7605834625005203131L)));
                                    break;
                                case 'w':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 81, byteArray[210], Integer.parseInt(AbstractC1760.m5477(7605834801098862267L)));
                                    break;
                                case 'x':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 53, byteArray[185], Integer.parseInt(AbstractC1760.m5477(7605834607825333947L)));
                                    break;
                                case 'y':
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 17, byteArray[217], Integer.parseInt(AbstractC1760.m5477(7605834792508927675L)));
                                    break;
                                case ModuleDescriptor.MODULE_VERSION /* 122 */:
                                    i = ˆʽ.ᵎˏ.ˉי(i3, 74, byteArray[147], Integer.parseInt(AbstractC1760.m5477(7605834474681347771L)));
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                    }
                } else {
                    i = ˆʽ.ᵎˏ.ˉי(i3, 16, byteArray[4], Integer.parseInt(AbstractC1760.m5477(7605836394531729083L)));
                }
                i2 += i;
            }
            return i2 + AbstractC1760.m5477(7605834818278731451L);
        } catch (Exception unused) {
            return AbstractC1760.m5477(7605836385941794491L);
        }
    }

    private static String calculateUserToken(JSONObject jSONObject) {
        return calculateUserToken(jSONObject.optString(AbstractC1760.m5477(7605836265682710203L)), jSONObject.optString(AbstractC1760.m5477(7605836433186434747L)));
    }

    public static ParseRESTUserCommand logInUserCommand(String str, String str2, String str3, boolean z) {
        HashMap map = new HashMap();
        map.put(AbstractC1760.m5477(7605835514063433403L), str);
        map.put(AbstractC1760.m5477(7605835458228858555L), str2);
        return new ParseRESTUserCommand(AbstractC1760.m5477(7605835625732583099L), ParseHttpRequest.Method.GET, map, (String) null, z, calculateUserToken(str, str2), str3);
    }

    public static ParseRESTUserCommand resetPasswordResetCommand(String str) {
        HashMap map = new HashMap();
        map.put(AbstractC1760.m5477(7605835741696700091L), str);
        return new ParseRESTUserCommand(AbstractC1760.m5477(7605835904905457339L), ParseHttpRequest.Method.POST, map, null);
    }

    public static ParseRESTUserCommand serviceLogInUserCommand(JSONObject jSONObject, String str, boolean z) {
        return new ParseRESTUserCommand(AbstractC1760.m5477(7605835703041994427L), ParseHttpRequest.Method.POST, jSONObject, str, z, calculateUserToken(jSONObject), AbstractC1760.m5477(7605835728811798203L));
    }

    public static ParseRESTUserCommand signUpUserCommand(JSONObject jSONObject, String str, boolean z, String str2) {
        return new ParseRESTUserCommand(AbstractC1760.m5477(7605835522653367995L), ParseHttpRequest.Method.POST, jSONObject, str, z, calculateUserToken(jSONObject), str2);
    }

    @Override // com.parse.ParseRESTCommand
    public void addAdditionalHeaders(ParseHttpRequest.Builder builder) {
        super.addAdditionalHeaders(builder);
        if (this.isRevocableSessionEnabled) {
            builder.addHeader(AbstractC1760.m5477(7605835814711144123L), AbstractC1760.m5477(7605836063819247291L));
        }
        if (this.userToken != null) {
            builder.addHeader(AbstractC1760.m5477(7605835969329966779L), this.userToken);
        }
        String str = this.captchaToken;
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.captchaToken.startsWith(AbstractC1760.m5477(7605836188373298875L))) {
            builder.addHeader(AbstractC1760.m5477(7605836166898462395L), this.captchaToken.substring(4));
        } else if (this.captchaToken.startsWith(AbstractC1760.m5477(7605836132538724027L))) {
            builder.addHeader(AbstractC1760.m5477(7605836300042448571L), this.captchaToken.substring(4));
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // com.parse.ParseRESTCommand, com.parse.ParseRequest
    public Task<JSONObject> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback) {
        this.statusCode = parseHttpResponse.getStatusCode();
        return super.onResponseAsync(parseHttpResponse, progressCallback);
    }
}
