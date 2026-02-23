package com.github.catvod.spider.merge.e0;

import android.R;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.k;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.github.catvod.spider.merge.e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288g {
    public WeakReference a;
    public C0285d b;
    public FrameLayout c;
    public C0286e d;
    public WebView e;
    public boolean f = false;
    public float g = -1.0f;
    public float h = -1.0f;
    public final Handler i = new Handler(C0063.m9553());
    public FrameLayout.LayoutParams j;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f781short = {2289, 2273, 2272, 2193, 2198, 2273, 2272, 1069, 1068, 1071, 1064, 1084, 1061, 1085, 1919, 1892, 1900, 1900, 1900, 1900, 1900, 1900, 1900, 1067, 1081, 1086, 1066, 1077, 1081, 1067, 1027, 1070, 1075, 1075, 1064, 1734, 1764, 1779, 1774, 1777, 1774, 1779, 1790, 1703, 1781, 1762, 1761, 1762, 1781, 1762, 1769, 1764, 1762, 1703, 1774, 1780, 1703, 1769, 1768, 1703, 1771, 1768, 1769, 1760, 1762, 1781, 1703, 1777, 1766, 1771, 1774, 1763};
    public static final HashMap k = new HashMap();

    static {
        C0000.m1044(C0062.m9389(m8173(), 0, 7, 2258));
    }

    public C0288g(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public static synchronized C0288g d(Activity activity) {
        return C0037.m6305(activity);
    }

    public static synchronized C0288g e(Activity activity) {
        C0288g c0288g;
        String strM3106 = C0013.m3106(m8173(), 7, 7, 1097);
        synchronized (C0288g.class) {
            HashMap mapM1253 = C0002.m1253();
            c0288g = (C0288g) C0065.m9715(mapM1253, strM3106);
            if (c0288g != null) {
                c0288g.a = new WeakReference(activity);
            } else {
                c0288g = new C0288g(activity);
                C0053.m8424(mapM1253, strM3106, c0288g);
            }
        }
        return c0288g;
    }

    public static boolean f(View view, View view2) {
        if (view == null) {
            return false;
        }
        if (view == view2) {
            return true;
        }
        return C0018.m3972((View) C0030.m5434(view), view2);
    }

    /* renamed from: ۟ۤۡۥۣ, reason: not valid java name and contains not printable characters */
    public static short[] m8173() {
        if (C0057.m9017() > 0) {
            return f781short;
        }
        return null;
    }

    public final void a() {
        try {
            FrameLayout frameLayout = (FrameLayout) C0011.m2778(C0062.m9446(this), R.id.content);
            C0285d c0285dM8766 = C0055.m8766(this);
            if (c0285dM8766 != null && C0030.m5434(c0285dM8766) != null) {
                C0018.m3892((ViewGroup) C0030.m5434(C0055.m8766(this)), C0055.m8766(this));
            }
            C0285d c0285dM87662 = C0055.m8766(this);
            if (c0285dM87662 != null) {
                C0037.m6336(frameLayout, c0285dM87662);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(String str) {
        WebView webViewM1741;
        int i = 1;
        int i2 = 0;
        try {
            C0285d c0285dM8766 = C0055.m8766(this);
            if (c0285dM8766 == null || C0030.m5434(c0285dM8766) == null) {
                Activity activityM9446 = C0062.m9446(this);
                C0285d c0285d = new C0285d(activityM9446, i2);
                this.b = c0285d;
                C0009.m2112(c0285d, new FrameLayout.LayoutParams(-1, -1));
                View view = new View(activityM9446);
                C0048.m7907(view, C0000.m1044(C0027.m5062(m8173(), 14, 9, 1884)));
                C0037.m6336(C0055.m8766(this), view);
                FrameLayout frameLayout = new FrameLayout(activityM9446);
                this.c = frameLayout;
                C0024.m4683(frameLayout, C0029.m5256(m8173(), 23, 12, 1116));
                C0047.m7801(C0032.m5687(this), true);
                C0000.m1065(C0032.m5687(this), true);
                C0040.m6677(C0032.m5687(this));
                GradientDrawable gradientDrawable = new GradientDrawable();
                C0036.m6222(gradientDrawable, -1);
                float fM9512 = C0063.m9512(12 * C0016.m3554(C0007.m1852(C0002.m1335(C0062.m9446(this)))));
                C0060.m9283(gradientDrawable, new float[]{fM9512, fM9512, fM9512, fM9512, 0.0f, 0.0f, 0.0f, 0.0f});
                C0018.m3985(C0032.m5687(this), gradientDrawable);
                C0286e c0286e = new C0286e(this, activityM9446);
                this.d = c0286e;
                C0041.m6790(C0032.m5687(this), c0286e, new FrameLayout.LayoutParams(-1, -1));
                int iM7623 = C0045.m7623(C0007.m1852(C0002.m1335(activityM9446)));
                int iM7678 = C0046.m7678(C0007.m1852(C0002.m1335(activityM9446)));
                float fM5701 = C0032.m5701(this);
                if (fM5701 <= 0.0f) {
                    fM5701 = 0.45f;
                }
                float fM7753 = C0047.m7753(this);
                if (fM7753 <= 0.0f) {
                    fM7753 = 0.6f;
                }
                int i3 = (int) (iM7623 * fM5701);
                int i4 = (int) (iM7678 * fM7753);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
                this.j = layoutParams;
                layoutParams.gravity = 49;
                layoutParams.topMargin = iM7678 - i4;
                WebView webViewM5672 = C0032.m5672(activityM9446);
                this.e = webViewM5672;
                C0047.m7801(webViewM5672, true);
                C0000.m1065(C0013.m3158(this), true);
                C0030.m5436(C0013.m3158(this), 0);
                C0285d c0285d2 = new C0285d(activityM9446, i);
                C0041.m6790(c0285d2, C0013.m3158(this), new FrameLayout.LayoutParams(-1, -1));
                C0041.m6790(C0028.m5196(this), c0285d2, new FrameLayout.LayoutParams(-1, -1));
                C0041.m6790(C0055.m8766(this), C0032.m5687(this), C0031.m5580(this));
                if (str != null) {
                    WebView webViewM17412 = C0006.m1741();
                    if (!C0007.m1815(str, webViewM17412 != null ? C0044.m7510(webViewM17412) : C0057.m8981()) && (webViewM1741 = C0006.m1741()) != null) {
                        C0048.m7899(webViewM1741, str);
                        AbstractC0287f.b = str;
                    }
                }
                C0058.m9072(this);
                C0057.m8960(C0032.m5687(this), new ViewOnFocusChangeListenerC0284c(this, i2));
                C0057.m8960(C0013.m3158(this), new ViewOnFocusChangeListenerC0284c(this, i));
                WebView webViewM3158 = C0013.m3158(this);
                if (webViewM3158 == null) {
                    return;
                }
                C0023.m4575(webViewM3158, new ViewOnKeyListenerC0283b(this));
            }
        } catch (Exception unused) {
        }
    }

    public final Activity c() {
        Activity activity = (Activity) C0010.m2351(C0020.m4279(this));
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0057.m8978(m8173(), 35, 37, 1671));
    }

    public final void g(float f, float f2, boolean z) {
        this.g = f;
        this.h = f2;
        try {
            Activity activityM9446 = C0062.m9446(this);
            C0037.m6386(activityM9446, new k(this, activityM9446, z, f, f2));
        } catch (Exception unused) {
        }
    }
}