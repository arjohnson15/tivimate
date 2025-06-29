package ar.tvplayer.tv;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$G extends Activity implements View.OnClickListener {
    private static final AtomicInteger geHl = new AtomicInteger(1);
    private static final Pattern lEg = Pattern.compile("^\\s*((\\d+)?\\.?(\\d*)?)\\s*([a-zA-Z]+)?\\s*$");
    private Integer A;
    private String Bj;
    private String Bvu;
    private String Enp;
    private String HI;
    private int HeD;
    private Float ccy;
    private String cpy;
    private int dGc;
    private int dpReason;
    private int[] gB;
    private String gxll;
    private String iy;
    private Drawable kBCc;
    private Float ks;
    private String lvy;
    private String ob;
    private int[] uces;
    private String vqfA;
    private String vza;
    private Integer wruj;
    private String z;
    private String ziC;
    private String ziD;
    private boolean c = false;
    private Uri iGje = null;

    private Drawable C(String... strArr) {
        String packageName = getPackageName();
        for (String str : strArr) {
            int identifier = getResources().getIdentifier(str, "drawable", packageName);
            if (identifier != 0) {
                return rGv(identifier);
            }
            int identifier2 = getResources().getIdentifier(str, "mipmap", packageName);
            if (identifier2 != 0) {
                return rGv(identifier2);
            }
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Drawable drawableLoadIcon = getApplicationInfo().loadIcon(getPackageManager());
        drawableLoadIcon.setColorFilter(colorMatrixColorFilter);
        return drawableLoadIcon;
    }

    private String CC() {
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i);
    }

    private Spanned Di(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 63) : Html.fromHtml(str);
    }

    private Integer FgC(String str, String... strArr) {
        try {
            int identifier = getResources().getIdentifier(str, "color", getPackageName());
            if (identifier != 0) {
                return Integer.valueOf(p(identifier));
            }
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    return Integer.valueOf(Color.parseColor(str2));
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private String H() {
        return "SSID";
    }

    private Float eody(String str) throws NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Matcher matcher = lEg.matcher(str);
        if (!matcher.matches() || matcher.groupCount() < 4 || matcher.group(1) == null) {
            return null;
        }
        float f = Float.parseFloat(matcher.group(1));
        if (matcher.group(4) == null) {
            return Float.valueOf(f);
        }
        String lowerCase = matcher.group(4).toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "in":
                return Float.valueOf(TypedValue.applyDimension(4, f, displayMetrics));
            case "mm":
                return Float.valueOf(TypedValue.applyDimension(5, f, displayMetrics));
            case "pt":
                return Float.valueOf(TypedValue.applyDimension(3, f, displayMetrics));
            case "px":
                return Float.valueOf(TypedValue.applyDimension(0, f, displayMetrics));
            case "sp":
                return Float.valueOf(TypedValue.applyDimension(2, f, displayMetrics));
            case "dip":
                return Float.valueOf(TypedValue.applyDimension(1, f, displayMetrics));
            default:
                return null;
        }
    }

    private static int gj() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = geHl;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    private void k(LinearLayout linearLayout) {
        byte[] bArrBiI = BiI();
        if (bArrBiI != null) {
            Bitmap bitmapGbH = ProtectedTvPlayerApplication.f.GbH(bArrBiI, ProtectedTvPlayerApplication.f.esm, true, 256, 256);
            ImageView imageView = new ImageView(this);
            imageView.setImageBitmap(bitmapGbH);
            imageView.setPadding(20, 20, 20, 20);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.addView(imageView);
        }
    }

    private void mC() {
        this.iy = qja("crash_activity_ok", "", getString(R.string.ok));
        this.vqfA = qja("crash_activity_cancel", "", getString(R.string.cancel));
        this.gxll = qja("crash_activity_accept", "", getString(R.string.ok));
        this.vza = qja("crash_activity_1", "<p style=\"text-align: right\">WARNING: {0} detected. The environment is not secure and your data may be at risk.</p><p style=\"text-align: center\">ID: {1}</p><br/><p style=\"text-align: center\">To run anyway, press [{2}], then relaunch the app. To exit, press [{3}]</p>");
        this.lvy = qja("crash_activity_2", "<p style=\"text-align: center\">This app cannot run because the environment is not secure and your data may be at risk.</p>");
        this.ziD = qja("crash_activity_3", "<p style=\"text-align: center\">This app cannot run because it was not installed from an official platform. Please reinstall from an approved vendor (e.g. Google Play).</p>");
        this.ob = qja("crash_activity_4", "<p style=\"text-align: center\">This app cannot be run on an emulator. Please use an official device.</p>");
        this.ziC = qja("crash_activity_5", "<p style=\"text-align: center\">This app stopped because it is not compatible with your device.<br/>Please try updating the app.</p>");
        this.Enp = qja("crash_activity_6", "<p style=\"text-align: center\";>This device does not currently meet the security requirements to use <b>{appName}</b>.</p><br/><p style=\"text-align: center\">Please share the QR code below with our support team.</p>");
        this.Bvu = qja("crash_activity_ok_link", "");
        int[] iArrMlt = mlt("crash_activity_btn_color1", "crash_activity_btn_color2");
        this.uces = iArrMlt;
        if (iArrMlt == null || iArrMlt.length == 0) {
            this.uces = n("");
        }
        this.A = FgC("crash_activity_btn_text_color", "");
        this.ccy = r("crash_activity_btn_text_size", "");
        int[] iArrMlt2 = mlt("crash_activity_bg_color1", "crash_activity_bg_color2");
        this.gB = iArrMlt2;
        if (iArrMlt2 == null || iArrMlt2.length == 0) {
            this.gB = n("");
        }
        this.wruj = FgC("crash_activity_text_color", "");
        this.ks = r("crash_activity_text_size", "");
        this.cpy = qja("crash_activity_root", "<i>Rooted device</i>");
        this.Bj = qja("crash_activity_emulator", "<i>Emulator</i>");
        this.z = qja("crash_activity_custom_firmware", "<i>Custom firmware</i>");
        this.HI = qja("crash_activity_xposed", "<i>Xposed framework</i>");
        this.kBCc = C("crash_activity_icon", "");
    }

    private int[] mlt(String... strArr) {
        String packageName = getPackageName();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int identifier = getResources().getIdentifier(str, "color", packageName);
            if (identifier != 0) {
                arrayList.add(Integer.valueOf(p(identifier)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            arrayList.add((Integer) arrayList.get(0));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    private int[] n(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    String[] strArrSplit = str.split(",");
                    int iMax = Math.max(2, strArrSplit.length);
                    int[] iArr = new int[iMax];
                    for (int i = 0; i < strArrSplit.length; i++) {
                        iArr[i] = Color.parseColor(strArrSplit[i]);
                    }
                    for (int length = strArrSplit.length; length < iMax; length++) {
                        iArr[length] = iArr[0];
                    }
                    return iArr;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private int p(int i) {
        return getResources().getColor(i);
    }

    private String qja(String str, String... strArr) {
        int identifier = getResources().getIdentifier(str, "string", getPackageName());
        if (identifier != 0) {
            return getString(identifier);
        }
        for (String str2 : strArr) {
            if (str2 != null && !str2.isEmpty()) {
                return str2;
            }
        }
        return "";
    }

    private Float r(String str, String str2) {
        int identifier = getResources().getIdentifier(str, "dimen", getPackageName());
        if (identifier != 0) {
            return Float.valueOf(getResources().getDimension(identifier));
        }
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        return eody(str2);
    }

    byte[] BiI() {
        String strKyqf = kyqf("889335cace362f753ea0273a38f1a549");
        String strKyqf2 = kyqf("8755547bec4ecdf36a656d8e58a50fcd");
        if (!strKyqf.contains("DP: ")) {
            return strKyqf2.getBytes(StandardCharsets.UTF_8);
        }
        return (strKyqf2 + "\n" + strKyqf.split("DP: ")[1]).getBytes(StandardCharsets.UTF_8);
    }

    String kyqf(String str) {
        return getIntent().hasExtra(str) ? String.valueOf(getIntent().getExtras().get(str)) : "-";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws IOException {
        if (this.c && view.getId() == this.HeD) {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = getApplicationContext().openFileOutput("rtc", 0);
                try {
                    int i = this.dGc;
                    fileOutputStreamOpenFileOutput.write(new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)});
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        if (this.c || this.iGje == null) {
            finish();
        } else {
            startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", this.iGje), null));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws NumberFormatException {
        String str;
        String string;
        GradientDrawable gradientDrawable;
        super.onCreate(bundle);
        setTheme(R.style.Theme.Light);
        mC();
        RelativeLayout relativeLayout = new RelativeLayout(this);
        int[] iArr = this.gB;
        if (iArr != null && iArr.length > 0) {
            relativeLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.gB));
        }
        relativeLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        ScrollView scrollView = new ScrollView(this);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        ImageView imageView = new ImageView(this);
        imageView.setId(gj());
        imageView.setImageDrawable(this.kBCc);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(this);
        textView.setPadding(24, 24, 24, 24);
        textView.setId(gj());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (getIntent().hasExtra("19f845a48c6ece2d1eee2fa9d62b8498")) {
            textView.setText(Di(this.Enp.replace("{appName}", CC())));
        } else {
            String str2 = "";
            if (getIntent().hasExtra("889335cace362f753ea0273a38f1a549") && (string = getIntent().getExtras().getString("889335cace362f753ea0273a38f1a549")) != null) {
                str2 = string;
            }
            boolean zContains = str2.contains("DP: ");
            StringBuilder sb = new StringBuilder("<p style=\"text-align: center\">This app stopped with ");
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                str = "an unknown error";
            } else {
                str = "the following error: <i>" + str2 + "</i>";
            }
            sb.append(str);
            sb.append(".<br/>Please try updating the app.</p>");
            String string2 = sb.toString();
            String str3 = this.Bvu;
            if (str3 != null && !str3.isEmpty()) {
                this.iGje = Uri.parse(this.Bvu);
            }
            if (zContains) {
                int i = Integer.parseInt(str2.substring(str2.indexOf("DP:") + 4).split(" ")[0]);
                this.dGc = i;
                boolean z = i > 4096;
                this.c = z;
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((this.dGc & 4104) == 4104) {
                        sb2.append(this.cpy);
                        sb2.append(", ");
                    }
                    if ((this.dGc & 4097) == 4097) {
                        sb2.append(this.Bj);
                        sb2.append(", ");
                    }
                    if ((this.dGc & 4098) == 4098) {
                        sb2.append(this.z);
                        sb2.append(", ");
                    }
                    if ((this.dGc & 4100) == 4100) {
                        sb2.append(this.HI);
                        sb2.append(", ");
                    }
                    String string3 = sb2.toString();
                    if (string3.endsWith(", ")) {
                        string3 = string3.substring(0, string3.lastIndexOf(", "));
                    }
                    string2 = MessageFormat.format(this.vza, string3, String.valueOf(this.dGc), this.gxll, this.vqfA);
                } else if (i <= 700 || i >= 800) {
                    string2 = this.ziC;
                } else {
                    string2 = this.lvy;
                    if (i == 773) {
                        string2 = this.ziD;
                    }
                    if (i >= 754 && i <= 757) {
                        string2 = this.ob;
                    }
                }
            }
            textView.setText(Di(string2));
        }
        Float f = this.ks;
        if (f != null) {
            textView.setTextSize(0, f.floatValue());
        }
        Integer num = this.wruj;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(1);
        int[] iArr2 = this.uces;
        boolean z2 = iArr2 != null && iArr2.length > 0;
        if (z2) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.uces);
            gradientDrawable.setCornerRadius(18.0f);
        } else {
            gradientDrawable = null;
        }
        Button button = new Button(this);
        int iGj = gj();
        this.HeD = iGj;
        button.setId(iGj);
        button.setText(Di(this.c ? this.gxll : this.iy));
        button.setOnClickListener(this);
        if (z2) {
            button.setBackground(gradientDrawable);
            button.setPadding(30, 10, 30, 10);
        }
        Float f2 = this.ccy;
        if (f2 != null) {
            button.setTextSize(0, f2.floatValue());
        }
        Integer num2 = this.A;
        if (num2 != null) {
            button.setTextColor(num2.intValue());
        }
        linearLayout2.addView(button);
        if (this.c) {
            Button button2 = new Button(this);
            button2.setId(gj());
            button2.setText(Di(this.vqfA));
            button2.setOnClickListener(this);
            if (z2) {
                button2.setPadding(30, 10, 30, 10);
                button2.setBackground(gradientDrawable);
                Space space = new Space(this);
                space.setMinimumWidth(30);
                space.setMinimumHeight(10);
                linearLayout2.addView(space);
            }
            Float f3 = this.ccy;
            if (f3 != null) {
                button2.setTextSize(0, f3.floatValue());
            }
            Integer num3 = this.A;
            if (num3 != null) {
                button2.setTextColor(num3.intValue());
            }
            linearLayout2.addView(button2);
        }
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        linearLayout.addView(linearLayout2);
        k(linearLayout);
        scrollView.addView(linearLayout, layoutParams3);
        relativeLayout.addView(scrollView, layoutParams2);
        addContentView(relativeLayout, layoutParams);
    }

    Drawable rGv(int i) {
        return getResources().getDrawable(i, getTheme());
    }
}
