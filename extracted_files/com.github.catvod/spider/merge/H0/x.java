package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class x {
    public AlertDialog a;
    public EditText b;
    public EditText c;
    public LinearLayout d;
    public int e;
    public int f;

    public final void a() {
        double d;
        DisplayMetrics displayMetricsM1852 = C0007.m1852(C0002.m1335(C0031.m5652()));
        int iM7678 = C0046.m7678(displayMetricsM1852);
        int iM7623 = C0045.m7623(displayMetricsM1852);
        double d2 = 0.9d;
        double d3 = iM7678;
        if (iM7623 > iM7678) {
            C0004.m1564(d3);
            this.e = (int) (d3 * 0.9d);
            d = iM7623;
            d2 = 0.45d;
        } else {
            C0004.m1564(d3);
            this.e = (int) (d3 * 0.5d);
            d = iM7623;
        }
        C0004.m1564(d);
        this.f = (int) (d * d2);
    }

    public final void b() {
        try {
            AlertDialog alertDialogM6522 = C0039.m6522(this);
            if (alertDialogM6522 == null || !C0016.m3578(alertDialogM6522)) {
                return;
            }
            View viewM3365 = C0014.m3365(C0000.m1119(C0039.m6522(this)));
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
            C0044.m7401(translateAnimation, 300L);
            C0033.m5846(translateAnimation, true);
            C0007.m1860(translateAnimation, new AnimationAnimationListenerC0331k(this, viewM3365, 2));
            C0063.m9549(viewM3365, translateAnimation);
        } catch (Exception unused) {
        }
    }

    public final void c() {
        if (C0039.m6522(this) == null) {
            return;
        }
        C0040.m6589(this);
        Window windowM1119 = C0000.m1119(C0039.m6522(this));
        if (windowM1119 != null) {
            C0000.m1046(windowM1119, 80);
            GradientDrawable gradientDrawable = new GradientDrawable();
            C0036.m6222(gradientDrawable, -1);
            C0060.m9283(gradientDrawable, new float[]{C0013.m3103(12), C0013.m3103(12), C0013.m3103(12), C0013.m3103(12), 0.0f, 0.0f, 0.0f, 0.0f});
            C0035.m6135(windowM1119, gradientDrawable);
            WindowManager.LayoutParams layoutParamsM5058 = C0027.m5058(windowM1119);
            layoutParamsM5058.width = C0041.m6818(this);
            layoutParamsM5058.height = -2;
            layoutParamsM5058.verticalMargin = 0.0f;
            layoutParamsM5058.y = 0;
            C0052.m8338(windowM1119, layoutParamsM5058);
        }
    }
}