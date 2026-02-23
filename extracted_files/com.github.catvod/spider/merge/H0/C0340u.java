package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340u {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f822short = {611, 627, 518, 629, 625, 514, 629, 2522, 2492, 2505, 2492, 2505, 2492, 2505, 556, 586, 575, 586, 575, 586, 575, -31988, -30872, 22942, 27879, 30169, 22920, -25131, -31946, 25214, 26410, 22372, 29612, 21543, 31623, 25288, -31257, 23313, 22547, 24185, 28264, 30550, 21837, 21537, 22160, 22524, 28085, 29835, 26177, 32639, 19568, 627, 627, 627, 26473, 32003, 26282, -27389, 23144, -24842, -28821, 31675, 443, 418, 425, 402, 419, 428, 416, 424, 2288, 2281, 2274, 2265, 2287, 2274};
    public AlertDialog a;
    public EditText b;
    public LinearLayout c;
    public LinearLayout d;
    public HorizontalScrollView e;
    public final HashMap f = new HashMap();
    public String g;
    public int h;
    public int i;
    public LinearLayout j;

    public static void d(Button button) {
        int iM3103 = C0013.m3103(12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        C0036.m6222(gradientDrawable, C0000.m1044(C0012.m2973(m8674(), 0, 7, 576)));
        float f = iM3103;
        C0029.m5216(gradientDrawable, f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        C0036.m6222(gradientDrawable2, C0000.m1044(C0001.m1189(m8674(), 7, 7, 2553)));
        C0029.m5216(gradientDrawable2, f);
        C0047.m7801(button, true);
        C0018.m3985(button, gradientDrawable2);
        C0057.m8960(button, new ViewOnFocusChangeListenerC0326f(button, gradientDrawable, gradientDrawable2, 1));
    }

    public static void h(Button button, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        C0029.m5216(gradientDrawable, C0013.m3103(10));
        String strM2300 = C0010.m2300(m8674(), 14, 7, 527);
        if (z) {
            C0026.m4878(button, -1);
            C0036.m6222(gradientDrawable, C0000.m1044(strM2300));
            C0027.m5070(button, C0013.m3103(2));
        } else {
            C0026.m4878(button, -16777216);
            C0036.m6222(gradientDrawable, C0000.m1044(strM2300));
            C0035.m6166(button);
        }
        C0018.m3985(button, gradientDrawable);
    }

    /* renamed from: ۡۢۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m8674() {
        if (C0057.m9017() > 0) {
            return f822short;
        }
        return null;
    }

    public final void a() {
        double d;
        DisplayMetrics displayMetricsM1852 = C0007.m1852(C0002.m1335(C0031.m5652()));
        int iM7678 = C0046.m7678(displayMetricsM1852);
        int iM7623 = C0045.m7623(displayMetricsM1852);
        double d2 = 0.9d;
        double d3 = iM7678;
        if (iM7623 > iM7678) {
            C0004.m1564(d3);
            this.h = (int) (d3 * 0.9d);
            d = iM7623;
            d2 = 0.45d;
        } else {
            C0004.m1564(d3);
            this.h = (int) (d3 * 0.5d);
            d = iM7623;
        }
        C0004.m1564(d);
        this.i = (int) (d * d2);
    }

    public final void b() {
        if (C0014.m3296(this) == null) {
            return;
        }
        C0029.m5273(this);
        Window windowM1119 = C0000.m1119(C0014.m3296(this));
        if (windowM1119 != null) {
            C0000.m1046(windowM1119, 80);
            GradientDrawable gradientDrawable = new GradientDrawable();
            C0036.m6222(gradientDrawable, -1);
            C0060.m9283(gradientDrawable, new float[]{C0013.m3103(12), C0013.m3103(12), C0013.m3103(12), C0013.m3103(12), 0.0f, 0.0f, 0.0f, 0.0f});
            C0035.m6135(windowM1119, gradientDrawable);
            WindowManager.LayoutParams layoutParamsM5058 = C0027.m5058(windowM1119);
            layoutParamsM5058.width = C0025.m4857(this);
            layoutParamsM5058.height = -2;
            layoutParamsM5058.verticalMargin = 0.0f;
            layoutParamsM5058.y = 0;
            C0052.m8338(windowM1119, layoutParamsM5058);
        }
    }

    public final void c() {
        String strM9640 = C0064.m9640(C0037.m6312(C0065.m9797(C0049.m8034(this))));
        if (C0057.m8953(strM9640)) {
            C0038.m6402(C0032.m5708(m8674(), 21, 8, 2299));
            return;
        }
        C0031.m5563(C0053.m8472(this));
        C0031.m5563(C0024.m4753(this));
        C0062.m9402(C0064.m9692(this));
        this.g = null;
        C0010.m2319(C0012.m2967(this), 0);
        C0025.m4829(new RunnableC0336p(this, strM9640, 1));
    }

    public final void e() {
        TextView textView = new TextView(C0031.m5652());
        C0042.m7106(textView, C0045.m7657(m8674(), 29, 7, 1364));
        C0039.m6563(textView, 16.0f);
        C0026.m4878(textView, -7829368);
        C0017.m3709(textView, 0, C0013.m3103(24), 0, C0013.m3103(24));
        C0024.m4681(textView, 17);
        C0009.m2112(textView, new LinearLayout.LayoutParams(-1, -2));
        C0037.m6336(C0053.m8472(this), textView);
    }

    public final void f() {
        try {
            C0333m c0333m = new C0333m(this, C0031.m5652(), 1);
            C0016.m3608(c0333m, C0013.m3103(16), C0013.m3103(16), C0013.m3103(16), C0013.m3103(0));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            C0012.m2963(layoutParams, C0013.m3103(8), C0013.m3103(4), C0013.m3103(8), C0013.m3103(8));
            C0009.m2112(c0333m, layoutParams);
            C0019.m4040(c0333m);
            LinearLayout linearLayout = new LinearLayout(C0031.m5652());
            C0032.m5684(linearLayout, 1);
            C0009.m2112(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(C0031.m5652());
            C0032.m5684(linearLayout2, 0);
            C0016.m3608(linearLayout2, 0, 0, 0, C0013.m3103(8));
            Button button = new Button(C0031.m5652());
            EditText editText = new EditText(C0031.m5652());
            this.b = editText;
            C0009.m2052(editText, C0000.m1077(m8674(), 36, 8, 2676));
            C0039.m6563(C0049.m8034(this), 16.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            C0047.m7801(C0049.m8034(this), true);
            C0000.m1065(C0049.m8034(this), true);
            C0000.m1114(C0049.m8034(this), true);
            C0039.m6494(C0049.m8034(this), true);
            C0053.m8441(C0049.m8034(this), true);
            C0057.m8960(C0049.m8034(this), new com.github.catvod.spider.merge.W.z(2, this));
            layoutParams2.rightMargin = C0013.m3103(8);
            C0009.m2112(C0049.m8034(this), layoutParams2);
            C0037.m6336(linearLayout2, C0049.m8034(this));
            C0042.m7106(button, C0031.m5565(m8674(), 44, 4, 2473));
            C0039.m6563(button, 14.0f);
            C0009.m2112(button, new LinearLayout.LayoutParams(-2, C0013.m3103(38)));
            C0045.m7580(button);
            C0002.m1251(button, new r(0, this));
            C0037.m6336(linearLayout2, button);
            C0037.m6336(linearLayout, linearLayout2);
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(C0031.m5652());
            this.e = horizontalScrollView;
            C0010.m2284(horizontalScrollView, false);
            C0054.m8629(C0056.m8934(this), 2);
            C0037.m6336(linearLayout, C0056.m8934(this));
            LinearLayout linearLayout3 = new LinearLayout(C0031.m5652());
            this.d = linearLayout3;
            C0032.m5684(linearLayout3, 0);
            C0016.m3608(C0024.m4753(this), 0, 0, C0013.m3103(4), C0013.m3103(0));
            C0014.m3381(C0024.m4753(this), 16);
            C0005.m1627(C0056.m8934(this), C0024.m4753(this));
            ScrollView scrollView = new ScrollView(C0031.m5652());
            C0016.m3608(scrollView, C0013.m3103(4), C0013.m3103(2), C0013.m3103(4), C0013.m3103(4));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            C0012.m2963(layoutParams3, C0013.m3103(8), C0013.m3103(2), C0013.m3103(8), C0013.m3103(8));
            C0009.m2112(scrollView, layoutParams3);
            LinearLayout linearLayout4 = new LinearLayout(C0031.m5652());
            this.c = linearLayout4;
            C0032.m5684(linearLayout4, 1);
            C0014.m3381(C0053.m8472(this), 1);
            C0037.m6336(linearLayout, scrollView);
            C0042.m7107(scrollView, C0053.m8472(this));
            LinearLayout linearLayout5 = new LinearLayout(C0031.m5652());
            this.j = linearLayout5;
            C0032.m5684(linearLayout5, 0);
            C0014.m3381(C0012.m2967(this), 17);
            C0016.m3608(C0012.m2967(this), 0, C0013.m3103(16), 0, C0013.m3103(16));
            ProgressBar progressBar = new ProgressBar(C0031.m5652());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C0013.m3103(24), C0013.m3103(24));
            layoutParams4.rightMargin = C0013.m3103(8);
            C0009.m2112(progressBar, layoutParams4);
            TextView textView = new TextView(C0031.m5652());
            C0042.m7106(textView, C0022.m4403(m8674(), 48, 6, 605));
            C0039.m6563(textView, 14.0f);
            C0026.m4878(textView, -7829368);
            C0037.m6336(C0012.m2967(this), progressBar);
            C0037.m6336(C0012.m2967(this), textView);
            C0010.m2319(C0012.m2967(this), 8);
            C0037.m6336(linearLayout, C0012.m2967(this));
            C0037.m6336(c0333m, linearLayout);
            AlertDialog alertDialogM7328 = C0043.m7328(C0020.m4201(C0003.m1403(C0047.m7798(C0047.m7848(new AlertDialog.Builder(C0022.m4453()), c0333m), C0005.m1645(m8674(), 54, 4, 1282), new DialogInterfaceOnClickListenerC0338s(this, 0)), C0032.m5708(m8674(), 58, 2, 2843), new DialogInterfaceOnClickListenerC0338s(this, 1)), C0008.m1970(m8674(), 60, 2, 1237), new com.github.catvod.spider.merge.b0.b(3)));
            this.a = alertDialogM7328;
            C0007.m1816(alertDialogM7328);
            C0059.m9263(this);
            View viewM3365 = C0014.m3365(C0000.m1119(C0014.m3296(this)));
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
            C0044.m7401(translateAnimation, 300L);
            C0033.m5846(translateAnimation, true);
            C0063.m9549(viewM3365, translateAnimation);
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }

    public final void g(String str) {
        this.g = str;
        C0031.m5563(C0053.m8472(this));
        for (int i = 0; i < C0026.m4897(C0024.m4753(this)); i++) {
            View viewM8237 = C0051.m8237(C0024.m4753(this), i);
            if (viewM8237 instanceof Button) {
                Button button = (Button) viewM8237;
                C0038.m6460(button, C0007.m1815(C0011.m2774(C0023.m4571(button)), str));
            }
        }
        List list = (List) C0065.m9715(C0064.m9692(this), str);
        if (list == null || C0035.m6132(list)) {
            C0021.m4374(this);
            return;
        }
        LinearLayout linearLayout = new LinearLayout(C0031.m5652());
        C0032.m5684(linearLayout, 1);
        C0016.m3608(linearLayout, C0013.m3103(8), C0013.m3103(16), C0013.m3103(12), C0013.m3103(0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        C0009.m2112(linearLayout, layoutParams);
        C0037.m6336(C0053.m8472(this), linearLayout);
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            JSONObject jSONObject = (JSONObject) C0048.m7949(itM3109);
            try {
                Button button2 = new Button(C0031.m5652());
                C0042.m7106(button2, C0001.m1212(jSONObject, C0051.m8259(m8674(), 62, 8, 461)));
                C0039.m6563(button2, 12.0f);
                C0026.m4878(button2, -16777216);
                C0024.m4681(button2, 17);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C0013.m3103(30));
                C0012.m2963(layoutParams2, 0, C0013.m3103(6), 0, C0013.m3103(6));
                C0009.m2112(button2, layoutParams2);
                C0016.m3608(button2, C0013.m3103(2), C0013.m3103(2), C0013.m3103(2), C0013.m3103(2));
                C0045.m7580(button2);
                C0002.m1251(button2, new ViewOnClickListenerC0330j(this, str, C0001.m1212(jSONObject, C0027.m5062(m8674(), 70, 6, 2182)), jSONObject));
                C0037.m6336(linearLayout, button2);
            } catch (Exception e) {
                C0049.m7975(e);
            }
        }
    }
}