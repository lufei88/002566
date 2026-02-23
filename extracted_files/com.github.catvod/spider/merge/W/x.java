package com.github.catvod.spider.merge.W;

import android.R;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x {
    public WeakReference a;
    public FrameLayout b;
    public WebView c;
    public ImageButton d;
    public ImageButton e;
    public FrameLayout f;
    public boolean g = false;
    public Handler h = new Handler(C0063.m9553());
    public FrameLayout.LayoutParams i;
    public final String j;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f661short = {1925, 1924, 1927, 1920, 1940, 1933, 1941, 3302, 3268, 3283, 3278, 3281, 3278, 3283, 3294, 3207, 3285, 3266, 3265, 3266, 3285, 3266, 3273, 3268, 3266, 3207, 3278, 3284, 3207, 3273, 3272, 3207, 3275, 3272, 3273, 3264, 3266, 3285, 3207, 3281, 3270, 3275, 3278, 3267, 1693, 1674, 1678, 1671, 1672, 1784, 1784};
    public static final HashMap k = new HashMap();

    public x(Activity activity, String str) {
        this.a = new WeakReference(activity);
        this.j = str;
    }

    public static synchronized x d(Activity activity) {
        x xVar;
        boolean zM7946;
        String strM7509 = C0044.m7509(m5948(), 0, 7, 2017);
        synchronized (x.class) {
            try {
                x xVar2 = (x) C0065.m9715(C0004.m1575(), strM7509);
                if (xVar2 != null && !(zM7946 = C0048.m7946(xVar2)) && !zM7946) {
                    xVar2.g = true;
                    C0037.m6386(C0039.m6491(xVar2), new com.github.catvod.spider.merge.F.b(7, xVar2));
                }
                HashMap mapM1575 = C0004.m1575();
                xVar = (x) C0065.m9715(mapM1575, strM7509);
                if (xVar == null || C0048.m7946(xVar)) {
                    xVar = new x(activity, strM7509);
                    C0053.m8424(mapM1575, strM7509, xVar);
                } else {
                    xVar.a = new WeakReference(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    /* renamed from: ۠۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5948() {
        if (C0030.m5375() > 0) {
            return f661short;
        }
        return null;
    }

    public final void a() {
        try {
            FrameLayout frameLayout = (FrameLayout) C0011.m2778(C0039.m6491(this), R.id.content);
            WebView webViewM4665 = C0024.m4665(this);
            if (webViewM4665 != null && C0030.m5434(webViewM4665) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0024.m4665(this)), C0024.m4665(this));
            }
            FrameLayout frameLayoutM1156 = C0001.m1156(this);
            if (frameLayoutM1156 != null && C0030.m5434(frameLayoutM1156) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0001.m1156(this)), C0001.m1156(this));
            }
            FrameLayout frameLayoutM11562 = C0001.m1156(this);
            if (frameLayoutM11562 != null) {
                C0041.m6790(frameLayout, frameLayoutM11562, C0057.m9012(this));
            }
            WebView webViewM46652 = C0024.m4665(this);
            if (webViewM46652 == null || C0001.m1156(this) == null || C0030.m5434(webViewM46652) == C0001.m1156(this)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C0029.m5228(this, 35);
            C0041.m6790(C0001.m1156(this), C0024.m4665(this), layoutParams);
        } catch (Exception unused) {
        }
    }

    public final int b(int i) {
        return C0063.m9512(i * C0016.m3554(C0007.m1852(C0002.m1335(C0039.m6491(this)))));
    }

    public final Activity c() {
        Activity activity = (Activity) C0010.m2351(C0060.m9333(this));
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0047.m7833(m5948(), 7, 37, 3239));
    }

    public final void e(ImageButton imageButton, int i) {
        Drawable drawableM5748 = C0032.m5748(C0002.m1335(C0039.m6491(this)), i);
        C0001.m1142(drawableM5748, -1, C0035.m6139());
        C0044.m7400(imageButton, drawableM5748);
        C0048.m7907(imageButton, 0);
        C0016.m3608(imageButton, C0029.m5228(this, 8), C0029.m5228(this, 8), C0029.m5228(this, 8), C0029.m5228(this, 8));
        C0028.m5147(imageButton, C0046.m7705());
    }

    public final void f() {
        Activity activityM6491 = C0039.m6491(this);
        FrameLayout frameLayout = new FrameLayout(activityM6491);
        this.f = frameLayout;
        C0048.m7907(frameLayout, C0000.m1044(C0041.m6779(m5948(), 44, 7, 1726)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C0029.m5228(this, 35));
        layoutParams.gravity = 80;
        C0041.m6790(C0001.m1156(this), C0065.m9719(this), layoutParams);
        ImageButton imageButton = new ImageButton(activityM6491);
        this.d = imageButton;
        C0040.m6631(this, imageButton, R.drawable.ic_menu_revert);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0029.m5228(this, 25), C0029.m5228(this, 25));
        layoutParams2.gravity = 8388627;
        layoutParams2.leftMargin = C0029.m5228(this, 16);
        C0041.m6790(C0065.m9719(this), C0033.m5825(this), layoutParams2);
        ImageButton imageButton2 = new ImageButton(activityM6491);
        this.e = imageButton2;
        C0040.m6631(this, imageButton2, R.drawable.ic_menu_close_clear_cancel);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C0029.m5228(this, 25), C0029.m5228(this, 25));
        layoutParams3.gravity = 8388629;
        layoutParams3.rightMargin = C0029.m5228(this, 16);
        C0041.m6790(C0065.m9719(this), C0040.m6637(this), layoutParams3);
        C0002.m1251(C0033.m5825(this), new j(this, 0));
        C0002.m1251(C0040.m6637(this), new j(this, 1));
    }
}