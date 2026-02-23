package com.github.catvod.spider.p000mergexbpq.j;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class k {
    private static CookieManager a = null;
    private static View b = null;
    private static WebView c = null;
    private static EditText d = null;
    private static Activity e = null;
    private static AlertDialog f = null;
    private static Button g = null;
    private static Button h = null;
    public static String i = "";
    private static int j;
    private static long k;
    private static long l;
    private static boolean m;
    private static boolean n;
    private static FrameLayout o;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f352short = {-26149, -30570, 31574, 22103, 26633, 32082, 24230, 1959, 777, 773, 775, 827, 780, 781, 791, 784, 779, 790, 797, 827, 777, 796, 788, 790, 779, 857, 831, 826, 863, 825, 847, 859, 863, 2602, 585, 585, 585, 3069, 2576, 2420, 1392, 1404, 1406, 1346, 1397, 1396, 1390, 1385, 1394, 1391, 1380, 1346, 1392, 1381, 1389, 1391, 1394, 1312, 1350, 1347, 1318, 1344, 1334, 1314, 1318, 2617, 1761, 1761, 1761, 2626, 2115, 2112, 2125, 2135, 2134, 2072, 2112, 2126, 2115, 2124, 2121, -27950, -31841, 28767, 676, 8231, 11820, 1922, 1925, 1947, 1950, 1951, 1972, 1926, 1934, 1951, 1923, 1924, 1935};

    public static void A(String str, String str2, String str3, j jVar) {
        a bVar;
        String strM7902 = C0048.m7902(m3057(), 0, 3, 855);
        try {
            Activity activityM4453 = C0022.m4453();
            e = activityM4453;
            if (C0023.m4565(C0009.m2062(C0035.m6093(activityM4453))) - C0014.m3313(C0009.m2062(C0035.m6093(m3066()))) < 0) {
                n = true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(m3066());
            if (C0059.m9178(C0015.m3451(), strM7902) >= 0) {
                C0036.m6223(builder, str);
                C0047.m7848(builder, (LinearLayout) C0054.m8562(m3066(), str2, str3));
                C0003.m1403(builder, C0040.m6584(m3057(), 3, 2, 1409), m3063());
                C0047.m7798(builder, C0050.m8131(m3057(), 5, 2, 1340), new c(str2, jVar));
                bVar = new a(jVar);
            } else {
                C0047.m7848(builder, (FrameLayout) C0054.m8562(m3066(), str2, str3));
                bVar = new b(str2, jVar);
            }
            C0039.m6476(builder, bVar);
            AlertDialog alertDialogM7328 = C0043.m7328(builder);
            f = alertDialogM7328;
            C0025.m4769(alertDialogM7328, m3053());
            C0007.m1816(m3060());
            C0052.m8329(m3060(), false);
            C0002.m1301(m3060(), false);
            if (C0059.m9178(C0015.m3451(), strM7902) < 0) {
                C0035.m6135(C0000.m1119(m3060()), new ColorDrawable(0));
                m3064();
            }
        } catch (Exception e2) {
            C0049.m7975(e2);
        }
    }

    public static /* synthetic */ void b(String str, j jVar, DialogInterface dialogInterface) {
        C0012.m2992(m3054());
        C0003.m1412(m3054());
        if (C0054.m8632() < 21) {
            C0015.m3414(C0001.m1171());
        } else {
            C0044.m7417(m3054());
        }
        String strM4207 = C0020.m4207(C0050.m8148(m3052()));
        String strM3981 = C0018.m3981(m3054(), str);
        String strM1840 = C0007.m1840();
        if (strM3981 != null && C0004.m1584(strM3981) > 1) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, strM3981);
            String strM8259 = C0051.m8259(m3057(), 7, 1, 1948);
            C0018.m3933(sb, strM8259);
            String strM4800 = C0025.m4800(C0047.m7763(sb), C0040.m6584(m3057(), 8, 25, 868), strM1840);
            if (C0060.m9349(strM4800, strM8259)) {
                strM4800 = C0054.m8636(strM4800, 0, C0004.m1584(strM4800) - 1);
            }
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, strM4207);
            C0018.m3933(sb2, C0008.m1970(m3057(), 33, 1, 2569));
            C0018.m3933(sb2, strM4800);
            C0018.m3933(sb2, C0028.m5109(m3057(), 34, 3, 621));
            strM1840 = C0047.m7763(sb2);
        }
        if (jVar != null) {
            EditText editTextM3065 = m3065();
            String strM1842 = (editTextM3065 == null || C0041.m6749(editTextM3065) <= 1) ? C0007.m1842(m3057(), 37, 1, 3020) : C0037.m6312(C0065.m9797(m3065()));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM1840);
            C0018.m3933(sb3, strM1842);
            C0054.m8597(jVar, C0047.m7763(sb3));
        }
        m3055();
        C0013.m3142(dialogInterface);
    }

    public static /* synthetic */ void c(j jVar, DialogInterface dialogInterface) {
        if (jVar != null) {
            C0054.m8597(jVar, C0026.m4951(m3057(), 38, 1, 2592));
        }
        m3055();
        C0013.m3142(dialogInterface);
    }

    public static /* synthetic */ void d(String str, j jVar, DialogInterface dialogInterface) {
        C0012.m2992(m3054());
        C0003.m1412(m3054());
        if (C0054.m8632() < 21) {
            C0015.m3414(C0001.m1171());
        } else {
            C0044.m7417(m3054());
        }
        String strM4207 = C0020.m4207(C0050.m8148(m3052()));
        String strM3981 = C0018.m3981(m3054(), str);
        String strM1840 = C0007.m1840();
        if (strM3981 != null && C0004.m1584(strM3981) > 1) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, strM3981);
            String strM5565 = C0031.m5565(m3057(), 39, 1, 2383);
            C0018.m3933(sb, strM5565);
            String strM4800 = C0025.m4800(C0047.m7763(sb), C0026.m4951(m3057(), 40, 25, 1309), strM1840);
            if (C0060.m9349(strM4800, strM5565)) {
                strM4800 = C0054.m8636(strM4800, 0, C0004.m1584(strM4800) - 1);
            }
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, strM4207);
            C0018.m3933(sb2, C0006.m1774(m3057(), 65, 1, 2586));
            C0018.m3933(sb2, strM4800);
            C0018.m3933(sb2, C0043.m7290(m3057(), 66, 3, 1733));
            strM1840 = C0047.m7763(sb2);
        }
        if (jVar != null) {
            EditText editTextM3065 = m3065();
            String strM7290 = (editTextM3065 == null || C0041.m6749(editTextM3065) <= 1) ? C0043.m7290(m3057(), 69, 1, 2675) : C0037.m6312(C0065.m9797(m3065()));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, strM1840);
            C0018.m3933(sb3, strM7290);
            C0054.m8597(jVar, C0047.m7763(sb3));
        }
        m3055();
        C0013.m3142(dialogInterface);
    }

    static /* synthetic */ int j() {
        int iM3069 = m3069();
        j = iM3069 + 1;
        return iM3069;
    }

    private static void x() {
        WebView webViewM3052 = m3052();
        if (webViewM3052 != null) {
            C0044.m7396(webViewM3052);
            C0010.m2369(m3052());
            C0049.m8033(m3052(), true);
            C0048.m7899(m3052(), C0010.m2300(m3057(), 70, 11, 2082));
            C0042.m7131(m3052());
            C0031.m5563(m3052());
            C0062.m9409(m3052());
            C0003.m1436(m3052());
        }
    }

    public static Object y(Context context, String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        o = new FrameLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        String strM3451 = C0015.m3451();
        String strM3106 = C0013.m3106(m3057(), 81, 3, 2142);
        if (C0059.m9178(strM3451, strM3106) >= 0) {
            C0032.m5684(linearLayout, 1);
            C0009.m2112(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            C0014.m3381(linearLayout, 17);
        } else {
            C0009.m2112(linearLayout, new LinearLayout.LayoutParams(-1, -1));
            C0009.m2112(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            C0048.m7907(frameLayout, 0);
            C0009.m2112(m3062(), new FrameLayout.LayoutParams(-1, -1));
            C0048.m7907(m3062(), 0);
            C0010.m2319(m3062(), 8);
            C0009.m2112(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
            C0012.m2988(linearLayout2, 262144);
        }
        WebView webView = new WebView(context);
        c = webView;
        C0062.m9371(webView, new f());
        C0037.m6361(m3052(), new g());
        C0045.m7564(m3052(), 0);
        C0047.m7801(m3052(), true);
        C0000.m1065(m3052(), true);
        C0044.m7378(m3052(), true);
        WebSettings webSettingsM8148 = C0050.m8148(m3052());
        if (C0054.m8632() >= 21) {
            C0027.m5069(webSettingsM8148, 0);
        }
        C0033.m5807(webSettingsM8148, false);
        C0044.m7416(webSettingsM8148, true);
        C0050.m8114(webSettingsM8148, true);
        C0005.m1664(webSettingsM8148, true);
        C0057.m9025(webSettingsM8148, true);
        C0024.m4692(webSettingsM8148, C0052.m8361());
        C0006.m1768(webSettingsM8148, C0024.m4741());
        C0024.m4714(webSettingsM8148, C0006.m1761());
        C0015.m3502(webSettingsM8148, true);
        C0064.m9603(webSettingsM8148, true);
        C0014.m3317(webSettingsM8148, true);
        C0019.m4050(webSettingsM8148, true);
        C0017.m3728(webSettingsM8148, 66);
        C0048.m7899(m3052(), str);
        if (C0004.m1584(C0047.m7785()) > 1) {
            C0027.m5043(webSettingsM8148, C0047.m7785());
        }
        C0029.m5211(context);
        CookieManager cookieManagerM1175 = C0001.m1175();
        a = cookieManagerM1175;
        C0026.m4970(cookieManagerM1175, true);
        C0003.m1412(m3054());
        C0012.m2992(m3054());
        if (C0004.m1584(str2) > 0) {
            for (String str3 : C0024.m4752(str2, C0039.m6551(m3057(), 84, 1, 671))) {
                C0049.m8014(m3054(), str, str3);
            }
            if (C0054.m8632() < 21) {
                C0015.m3414(C0001.m1171());
            } else {
                C0044.m7417(m3054());
            }
        }
        EditText editText = new EditText(context);
        d = editText;
        C0009.m2052(editText, C0015.m3451());
        C0026.m4877(m3065(), -12303292);
        C0026.m4878(m3065(), -16777216);
        C0047.m7801(m3065(), true);
        C0000.m1065(m3065(), true);
        if (C0059.m9178(C0015.m3451(), strM3106) >= 0) {
            C0037.m6336(linearLayout, m3052());
            C0037.m6336(linearLayout, m3065());
            C0009.m2112(m3065(), new LinearLayout.LayoutParams(-1, -2));
            C0049.m8044(m3052(), new LinearLayout.LayoutParams(-1, -2));
            return linearLayout;
        }
        C0010.m2319(linearLayout, 8);
        Display displayM2062 = C0009.m2062(C0035.m6093(m3066()));
        WebView webViewM3052 = m3052();
        double dM4565 = C0023.m4565(displayM2062);
        C0004.m1564(dM4565);
        double dM3313 = C0014.m3313(displayM2062);
        C0004.m1564(dM3313);
        C0049.m8044(webViewM3052, new FrameLayout.LayoutParams((int) (dM4565 * 0.75d), (int) (dM3313 * 0.9d)));
        Button button = new Button(context, null, 0);
        g = button;
        C0016.m3608(button, 20, 20, 0, 0);
        C0044.m7378(m3058(), true);
        C0047.m7801(m3058(), true);
        C0000.m1065(m3058(), true);
        C0042.m7106(m3058(), C0017.m3646(m3057(), 85, 1, 1415));
        C0026.m4878(m3058(), -3355444);
        C0019.m4048(m3058(), 5.0f, 5.0f, 5.0f, -7829368);
        C0009.m2112(m3058(), new FrameLayout.LayoutParams(C0002.m1249(30), C0002.m1249(30)));
        C0002.m1251(m3058(), new h());
        Button button2 = new Button(context, null, 0);
        h = button2;
        C0016.m3608(button2, 30, 20, 0, 0);
        C0044.m7378(m3067(), true);
        C0047.m7801(m3067(), true);
        C0000.m1065(m3067(), true);
        C0042.m7106(m3067(), C0048.m7902(m3057(), 86, 1, 2110));
        C0026.m4878(m3067(), -3355444);
        C0019.m4048(m3067(), 4.0f, 4.0f, 4.0f, -7829368);
        C0009.m2112(m3067(), new FrameLayout.LayoutParams(C0002.m1249(30), C0002.m1249(30)));
        C0002.m1251(m3067(), new i());
        C0037.m6336(linearLayout2, m3067());
        C0037.m6336(linearLayout2, m3058());
        C0037.m6336(frameLayout, m3065());
        C0037.m6336(frameLayout, m3062());
        C0037.m6336(frameLayout, m3052());
        C0037.m6336(frameLayout, linearLayout2);
        C0040.m6677(m3052());
        C0010.m2333((InputMethodManager) C0011.m2781(context, C0042.m7151(m3057(), 87, 12, 2027)), m3052(), 2);
        return frameLayout;
    }

    private static void z() {
        Display displayM2062 = C0009.m2062(C0035.m6093(m3066()));
        WindowManager.LayoutParams layoutParamsM5058 = C0027.m5058(C0000.m1119(m3060()));
        double dM4565 = C0023.m4565(displayM2062);
        C0004.m1564(dM4565);
        C0004.m1564(dM4565);
        layoutParamsM5058.width = (int) (dM4565 * 0.75d);
        double dM3313 = C0014.m3313(displayM2062);
        C0004.m1564(dM3313);
        C0004.m1564(dM3313);
        layoutParamsM5058.height = (int) (dM3313 * 0.9d);
        C0052.m8338(C0000.m1119(m3060()), layoutParamsM5058);
    }

    /* renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static WebView m3052() {
        if (C0006.m1726() < 0) {
            return c;
        }
        return null;
    }

    /* renamed from: ۟ۡۤۦۢ, reason: not valid java name and contains not printable characters */
    public static e m3053() {
        if (C0040.m6582() > 0) {
            return e.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static CookieManager m3054() {
        if (C0009.m2047() >= 0) {
            return a;
        }
        return null;
    }

    /* renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m3055() {
        if (C0034.m6048() <= 0) {
            x();
        }
    }

    /* renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3056() {
        if (C0021.m4379() > 0) {
            return m;
        }
        return false;
    }

    /* renamed from: ۟ۤۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3057() {
        if (C0017.m3633() < 0) {
            return f352short;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۥۣ, reason: not valid java name and contains not printable characters */
    public static Button m3058() {
        if (C0013.m3167() >= 0) {
            return g;
        }
        return null;
    }

    /* renamed from: ۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static View m3059() {
        if (C0020.m4210() < 0) {
            return b;
        }
        return null;
    }

    /* renamed from: ۠ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m3060() {
        if (C0032.m5686() <= 0) {
            return f;
        }
        return null;
    }

    /* renamed from: ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3061() {
        if (C0029.m5282() > 0) {
            return n;
        }
        return false;
    }

    /* renamed from: ۢۦۢ۠, reason: not valid java name and contains not printable characters */
    public static FrameLayout m3062() {
        if (C0027.m5017() > 0) {
            return o;
        }
        return null;
    }

    /* renamed from: ۣۣۦۡ, reason: not valid java name and contains not printable characters */
    public static d m3063() {
        if (C0055.m8740() > 0) {
            return d.a;
        }
        return null;
    }

    /* renamed from: ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3064() {
        if (C0047.m7837() > 0) {
            z();
        }
    }

    /* renamed from: ۤۤۧۡ, reason: not valid java name and contains not printable characters */
    public static EditText m3065() {
        if (C0050.m8121() < 0) {
            return d;
        }
        return null;
    }

    /* renamed from: ۥۡ۟۠, reason: contains not printable characters */
    public static Activity m3066() {
        if (C0009.m2047() > 0) {
            return e;
        }
        return null;
    }

    /* renamed from: ۦ۠ۦ, reason: contains not printable characters */
    public static Button m3067() {
        if (C0005.m1599() <= 0) {
            return h;
        }
        return null;
    }

    /* renamed from: ۦۧۢۡ, reason: contains not printable characters */
    public static long m3068() {
        if (C0037.m6350() <= 0) {
            return l;
        }
        return 0L;
    }

    /* renamed from: ۨ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3069() {
        if (C0019.m4065() < 0) {
            return j;
        }
        return 0;
    }

    /* renamed from: ۨ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static long m3070() {
        if (C0050.m8121() < 0) {
            return k;
        }
        return 0L;
    }
}