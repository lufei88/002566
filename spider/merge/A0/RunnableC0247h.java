package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.github.catvod.spider.merge.a0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0247h implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f722short = {1195, 1165, 1179, 1164, 1235, 1215, 1177, 1179, 1168, 1162, 2976, 2946, 2967, 2948, 2945, 2945, 2956, 3010, 3032, 3011, 3037, 3021, 3013, 3002, 2948, 2947, 2953, 2946, 2970, 2974, 3021, 2979, 3001, 3021, 3036, 3037, 3011, 3037, 3030, 3021, 3002, 2948, 2947, 3035, 3033, 3030, 3021, 2965, 3035, 3033, 3012, 3021, 2988, 2973, 2973, 2945, 2952, 3002, 2952, 2959, 2982, 2948, 2969, 3010, 3032, 3038, 3034, 3011, 3038, 3035, 3021, 3013, 2982, 2981, 3001, 2976, 2977, 3009, 3021, 2945, 2948, 2950, 2952, 3021, 2986, 2952, 2958, 2950, 2946, 3012, 3021, 2990, 2949, 2975, 2946, 2944, 2952, 3010, 3036, 3036, 3034, 3011, 3037, 3011, 3037, 3011, 3037, 3021, 3006, 2956, 2955, 2956, 2975, 2948, 3010, 3032, 3038, 3034, 3011, 3038, 3035, 1523, 1476, 1479, 1476, 1491, 1476, 1491, 721, 717, 717, 713, 714, 643, 662, 662, 713, 728, 727, 663, 731, 728, 720, 733, 716, 663, 730, 726, 724, 662, 606, 633, 613, 610, 1919, 1902, 1916, 1916, 1919, 1888, 1917, 1915, 1825, 1901, 1902, 1894, 1899, 1914, 1825, 1900, 1888, 1890, 2159, 2163, 2163, 2167, 2164, 2109, 2088, 2088, 2167, 2150, 2164, 2164, 2167, 2152, 2165, 2163, 2089, 2149, 2150, 2158, 2147, 2162, 2089, 2148, 2152, 2154, 2088, 2161, 2101, 2088, 2150, 2167, 2158, 2088, 2144, 2146, 2163, 2166, 2165, 2148, 2152, 2147, 2146, 2104, 2155, 2167, 2106, 2167, 2148, 2081, 2166, 2165, 2155, 2152, 2144, 2158, 2153, 2145, 2165, 2152, 2154, 2106, 2167, 2148, 1295, 1301, 1307, 1298, 1098, 1102, 1092, 1110, 1105, 1103, -29144, -30132, 21690, 29601, 23417, 1535, 1468, 1456, 1456, 1460, 1462, 1466, 26908, 29558, 23124, -31962, 25613, 24881, 28768, 22862, 1595, -29204, 20787, 30884, -29708, 18486, -29275, 31093, 22717, 28867, 2650, 2630, 2630, 2626, 2625, 2568, 2589, 2589, 2626, 2643, 2625, 2625, 2626, 2653, 2624, 2630, 2588, 2640, 2643, 2651, 2646, 2631, 2588, 2641, 2653, 2655, 2589, 2641, 2650, 2643, 2652, 2652, 2647, 2654, 2589, 2631, 2652, 2651, 2641, 2643, 2625, 2630, 2573, 2641, 2650, 2643, 2652, 2652, 2647, 2654, 2669, 2651, 2646, 2575, 3151, 3177, 3199, 3176, 3127, 3163, 3197, 3199, 3188, 3182, 2133, 2167, 2146, 2161, 2164, 2164, 2169, 2103, 2093, 2102, 2088, 2104, 2096, 2127, 2161, 2166, 2172, 2167, 2159, 2155, 2104, 2134, 2124, 2104, 2089, 2088, 2102, 2088, 2083, 2104, 2127, 2161, 2166, 2094, 2092, 2083, 2104, 2144, 2094, 2092, 2097, 2104, 2137, 2152, 2152, 2164, 2173, 2127, 2173, 2170, 2131, 2161, 2156, 2103, 2093, 2091, 2095, 2102, 2091, 2094, 2104, 2096, 2131, 2128, 2124, 2133, 2132, 2100, 2104, 2164, 2161, 2163, 2173, 2104, 2143, 2173, 2171, 2163, 2167, 2097, 2104, 2139, 2160, 2154, 2167, 2165, 2173, 2103, 2089, 2089, 2095, 2102, 2088, 2102, 2088, 2102, 2088, 2104, 2123, 2169, 2174, 2169, 2154, 2161, 2103, 2093, 2091, 2095, 2102, 2091, 2094, 964, 1011, 1008, 1011, 996, 1011, 996, 2781, 2753, 2753, 2757, 2758, 2703, 2714, 2714, 2757, 2772, 2779, 2715, 2775, 2772, 2780, 2769, 2752, 2715, 2774, 2778, 2776, 2714, 1299, 1332, 1320, 1327, 1186, 1203, 1185, 1185, 1186, 1213, 1184, 1190, 1276, 1200, 1203, 1211, 1206, 1191, 1276, 1201, 1213, 1215, 418, 499, 500, 481, 500, 501, 499, 476, 418, 442, 433, 2310, 2317, 2308, 2315, 2315, 2304, 2313, 2362, 2323, 1981, 1388, 1370, 1357, 1353, 1366, 1372, 1370, 1387, 1366, 1372, 1364, 1370, 1355, 1285};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0254o b;

    public /* synthetic */ RunnableC0247h(C0254o c0254o, int i) {
        this.a = i;
        this.b = c0254o;
    }

    public /* synthetic */ RunnableC0247h(C0254o c0254o, HashMap map) {
        this.a = 4;
        this.b = c0254o;
    }

    /* renamed from: ۟۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m6997(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6998(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6999(Object obj) {
        if (C0030.m5375() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۟ۦۣۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7000() {
        if (C0007.m1886() > 0) {
            return f722short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0010.m2291(this)) {
            case 0:
                StringBuilder sb = new StringBuilder(C0014.m3332(m7000(), 276, 54, 2610));
                C0254o c0254oM8008 = C0049.m8008(this);
                C0018.m3933(sb, C0002.m1283(c0254oM8008));
                String strM7763 = C0047.m7763(sb);
                HashMap mapM4127 = C0019.m4127(C0003.m1398(m7000(), 330, 10, 3098), C0034.m6001(m7000(), 340, 111, 2072), C0033.m5852(m7000(), 451, 7, 918), C0035.m6131(m7000(), 458, 22, 2741));
                C0053.m8424(mapM4127, C0000.m1077(m7000(), 480, 4, 1371), C0054.m8574(m7000(), 484, 18, 1234));
                String strM5769 = C0032.m5769(strM7763, mapM4127);
                if (!C0058.m9127(strM5769, C0014.m3332(m7000(), 502, 11, 384))) {
                    String strM6998 = m6998(m6997((JsonObject) C0033.m5856(m6998(m6997((JsonObject) C0033.m5856(strM5769, JsonObject.class), C0051.m8259(m7000(), 513, 9, 2405))), JsonObject.class), C0037.m6307(m7000(), 522, 1, 1995)));
                    c0254oM8008.i = strM6998;
                    String strM1645 = C0005.m1645(m7000(), 523, 14, 1343);
                    StringBuilder sb2 = new StringBuilder(strM1645);
                    C0018.m3933(sb2, strM6998);
                    m6999(C0047.m7763(sb2));
                    StringBuilder sb3 = new StringBuilder(strM1645);
                    C0018.m3933(sb3, strM6998);
                    C0038.m6402(C0047.m7763(sb3));
                    C0002.m1252(c0254oM8008);
                    C0024.m4709(c0254oM8008);
                    break;
                }
                break;
            case 1:
                C0254o c0254oM80082 = C0049.m8008(this);
                C0047.m7777(c0254oM80082);
                try {
                    if (C0034.m6024(c0254oM80082)) {
                        C0038.m6402(C0002.m1305(m7000(), 260, 16, 1563));
                    } else {
                        int iM3103 = C0013.m3103(16);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                        C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                        EditText editText = new EditText(C0031.m5652());
                        C0041.m6790(frameLayout, editText, layoutParams);
                        AlertDialog alertDialogM7328 = C0043.m7328(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0035.m6131(m7000(), 246, 12, 1503)), frameLayout), C0065.m9775(m7000(), 258, 2, 2935), new DialogInterfaceOnClickListenerC0248i(c0254oM80082, 0)), R.string.cancel, new DialogInterfaceOnClickListenerC0248i(c0254oM80082, 1)), R.string.ok, new DialogInterfaceOnClickListenerC0227c(c0254oM80082, editText, 2)));
                        c0254oM80082.e = alertDialogM7328;
                        C0025.m4769(alertDialogM7328, new DialogInterfaceOnDismissListenerC0250k(0, c0254oM80082));
                        C0007.m1816(C0004.m1490(c0254oM80082));
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                C0056.m8936(C0049.m8008(this));
                break;
            case 3:
                C0254o c0254oM80083 = C0049.m8008(this);
                C0047.m7777(c0254oM80083);
                HashMap map = new HashMap();
                C0053.m8424(map, C0042.m7151(m7000(), 0, 10, 1278), C0023.m4536(m7000(), 10, 111, 3053));
                C0053.m8424(map, C0050.m8131(m7000(), 121, 7, 1441), C0036.m6188(m7000(), 128, 22, 697));
                C0053.m8424(map, C0028.m5109(m7000(), 150, 4, 534), C0013.m3106(m7000(), 154, 18, 1807));
                JsonObject jsonObject = (JsonObject) C0033.m5856(C0032.m5769(C0030.m5362(m7000(), 172, 64, 2055), map), JsonObject.class);
                c0254oM80083.f = m6998(m6997(jsonObject, C0005.m1645(m7000(), 236, 4, 1404)));
                C0016.m3575(new RunnableC0249j(c0254oM80083, m6998(m6997(jsonObject, C0044.m7509(m7000(), 240, 6, 1059))), 1));
                break;
            default:
                C0254o c0254oM80084 = C0049.m8008(this);
                C0047.m7777(c0254oM80084);
                ScheduledExecutorService scheduledExecutorServiceM3101 = C0013.m3101(1);
                c0254oM80084.d = scheduledExecutorServiceM3101;
                C0060.m9344(scheduledExecutorServiceM3101, new RunnableC0247h(c0254oM80084, 0), 1L, 3L, C0050.m8151());
                break;
        }
    }
}