package com.github.catvod.spider.merge.R;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f491short = {1912, 1900, 1919, 1912, 1914, 1906, 1858, 1893, 1915, 973, 975, 986, 971, 992, 961, 970, 971, 459, 457, 476, 461, 486, 457, 453, 461, 1916, 1918, 1899, 1914, 1873, 1918, 1906, 1914, 1869, 1116, 1118, 1099, 1114, 1142, 1115, 2939, 2937, 2924, 2941, 2897, 2940, 2890, 1396, 1398, 1379, 1394, 1370, 1398, 1401, 1378, 1398, 1403, 2061, 2050, 2055, 2079, 2062, 2073, 2265, 2270, 2268, 2260, 2279, 2270, 2261, 2303, 2270, 2261, 2260, 2998, 2993, 2995, 3003, 2952, 2993, 3002, 2960, 3007, 2995, 3003, 2106, 2109, 2111, 2103, 2052, 2109, 2102, 2076, 2099, 2111, 2103, 2048, 2043, 2044, 2046, 2038, 1989, 2044, 2039, 2010, 2039, 2260, 2259, 2257, 2265, 2282, 2259, 2264, 2293, 2264, 2286, 2481, 2486, 2484, 2492, 2447, 2486, 2493, 2448, 2484, 2494, 2018, 2021, 2023, 2031, 2012, 2021, 2030, 1987, 2023, 2029, 2008, 1649, 1654, 1652, 1660, 1615, 1654, 1661, 1620, 1656, 1643, 1650, 2347, 2348, 2350, 2342, 2325, 2348, 2343, 2318, 2338, 2353, 2344, 2321, 2258, 2256, 2245, 2260, 2276, 2243, 2269, 2642, 2640, 2629, 2644, 2663, 2654, 2645, 2687, 2654, 2645, 2644, 2773, 2775, 2754, 2771, 2784, 2777, 2770, 2808, 2775, 2779, 2771, 2394, 2392, 2381, 2396, 2415, 2390, 2397, 2423, 2392, 2388, 2396, 2411, 1957, 1959, 1970, 1955, 1936, 1961, 1954, 1935, 1954, 3303, 3301, 3312, 3297, 3282, 3307, 3296, 3277, 3296, 3286, 2631, 2629, 2640, 2625, 2674, 2635, 2624, 2669, 2633, 2627, 2200, 2202, 2191, 2206, 2221, 2196, 2207, 2226, 2198, 2204, 2217, 3138, 3136, 3157, 3140, 3191, 3150, 3141, 3180, 3136, 3155, 3146, 460, 462, 475, 458, 505, 448, 459, 482, 462, 477, 452, 509, 2906, 2890, 2923, 2892, 2898, 1791, 1775, 1749, 1780, 1791, 1790, 3324, 3308, 3286, 3321, 3317, 3325, 1855, 1839, 1813, 1850, 1846, 1854, 1801, 2727, 2743, 2698, 2734, 2724, 796, 780, 817, 789, 799, 810, 2183, 2199, 2208, 2178, 2199, 2182, 547, 563, 516, 550, 563, 546, 533, 576, 592, 637, 577, 581, 598, 1150, 1134, 1091, 1151, 1147, 1128, 1096, 2370, 2386, 2407, 2388, 2371, 2375, 317, 301, 280, 299, 316, 312, 267, 2471, 2487, 2446, 2466, 2481, 2472, 3096, 3080, 3121, 3101, 3086, 3095, 3118, 2491, 2475, 2462, 2492, 2475, 2480, 2477, 2500, 2516, 2529, 2499, 2516, 2511, 2514, 2546, 2539, 2555, 2507, 2534, 2557, 2538, 2540, 2555, 2528, 2557, 1384, 1400, 1352, 1381, 1406, 1385, 1391, 1400, 1379, 1406, 1374, 437, 421, 405, 436, 418, 434, 2646, 2630, 2678, 2647, 2625, 2641, 2656, 2985, 3001, 2955, 3007, 2978, 2976, 2947, 2978, 2985, 2984, 1364, 1348, 1398, 1346, 1375, 1373, 1406, 1361, 1373, 1365, 745, 761, 715, 767, 738, 736, 707, 748, 736, 744, 735, 1593, 1577, 1544, 1583, 1585, 1555, 1586, 1593, 1592, 3066, 3050, 3019, 3052, 3058, 3021, 3051, 3068, 3024, 3057, 3066, 3067, 1267, 1251, 1218, 1253, 1275, 1246, 1267, 2789, 2805, 2772, 2803, 2797, 2760, 2789, 2771, 2900, 2884, 2917, 2882, 2908, 2942, 2897, 2909, 2901, 1277, 1261, 1228, 1259, 1269, 1239, 1272, 1268, 1276, 1227, 2541, 2545, 2556, 2532, 2504, 2543, 2545, 3048, 3060, 3065, 3041, 3021, 3065, 2236, 2208, 2221, 2229, 2206, 2217, 2218, 2217, 2238, 2217, 2238, 395, 413, 409, 394, 411, 400, 429, 394, 404, 2482, 2466, 2455, 2478, 2469, 2447, 2478, 2469, 2468, 2778, 2762, 2815, 2758, 2765, 2791, 2760, 2756, 2764, 1096, 1112, 1133, 1108, 1119, 1141, 1114, 1110, 1118, 1129, 2859, 2875, 2830, 2871, 2876, 2833, 2876, 1334, 1318, 1299, 1322, 1313, 1292, 1313, 1303, 1880, 1864, 1917, 1860, 1871, 1890, 1862, 1868, 2027, 2043, 1998, 2039, 2044, 2001, 2037, 2047, 1994, 3182, 3198, 3147, 3186, 3193, 3152, 3196, 3183, 3190, 1311, 1295, 1338, 1283, 1288, 1313, 1293, 1310, 1287, 1342};
    public String A;
    public String B;
    public String C;
    public String D;
    public Pattern E;
    public String F;
    public Pattern G;
    public String H;
    public Pattern I;
    public String J;
    public Pattern K;
    public String L;
    public Pattern M;
    public String N;
    public Pattern O;
    public String P;
    public Pattern Q;
    public String R;
    public Pattern S;
    public String T;
    public Pattern U;
    public String V;
    public String W;
    public Pattern X;
    public String Y;
    public String Z;
    public String a;
    public String a0;
    public String b;
    public Pattern b0;
    public String c;
    public String c0;
    public String d;
    public Pattern d0;
    public Pattern e;
    public String e0;
    public String f;
    public String f0;
    public Pattern g;
    public String g0;
    public final LinkedHashMap h = new LinkedHashMap();
    public String h0;
    public JSONObject i;
    public String i0;
    public String j;
    public String j0;
    public String k;
    public Pattern k0;
    public Pattern l;
    public String l0;
    public String m;
    public Pattern m0;
    public Pattern n;
    public String n0;
    public String o;
    public Pattern o0;
    public Pattern p;
    public String p0;
    public String q;
    public Pattern q0;
    public Pattern r;
    public String s;
    public String t;
    public String u;
    public Pattern v;
    public String w;
    public Pattern x;
    public String y;
    public Pattern z;

    public static String a(String str, Pattern pattern) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcherM6026 = C0034.m6026(pattern, str);
            if (C0003.m1405(matcherM6026)) {
                return C0064.m9640(C0021.m4306(matcherM6026, 1));
            }
        } catch (Exception e) {
            m4979(e);
        }
        return str;
    }

    public static a b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            aVar.a = C0051.m8200(jSONObject, C0015.m3484(m4980(), 0, 2, 1805));
            aVar.b = C0064.m9640(C0051.m8200(jSONObject, C0013.m3106(m4980(), 2, 7, 1815)));
            aVar.c = C0064.m9640(C0051.m8200(jSONObject, C0055.m8814(m4980(), 9, 8, 942)));
            aVar.d = C0064.m9640(C0051.m8200(jSONObject, C0029.m5256(m4980(), 17, 8, 424)));
            aVar.e = C0001.m1229(C0051.m8259(m4980(), 25, 9, 1823), jSONObject);
            aVar.f = C0064.m9640(C0051.m8200(jSONObject, C0043.m7290(m4980(), 34, 6, 1087)));
            aVar.g = C0001.m1229(C0063.m9585(m4980(), 40, 7, 2840), jSONObject);
            JSONObject jSONObjectM7123 = C0042.m7123(jSONObject, C0033.m5852(m4980(), 47, 10, 1303));
            if (jSONObjectM7123 != null) {
                Iterator itM7553 = C0045.m7553(jSONObjectM7123);
                while (C0012.m2962(itM7553)) {
                    String str2 = (String) C0048.m7949(itM7553);
                    C0037.m6362(C0028.m5110(aVar), C0064.m9640(str2), C0064.m9640(C0001.m1212(jSONObjectM7123, str2)));
                }
            }
            aVar.i = C0042.m7123(jSONObject, C0042.m7151(m4980(), 57, 6, 2155));
            aVar.j = C0064.m9640(C0051.m8200(jSONObject, C0022.m4403(m4980(), 63, 11, 2225)));
            aVar.k = C0064.m9640(C0051.m8200(jSONObject, C0046.m7718(m4980(), 74, 11, 3038)));
            aVar.l = C0001.m1229(C0007.m1842(m4980(), 85, 12, 2130), jSONObject);
            aVar.m = C0064.m9640(C0051.m8200(jSONObject, C0060.m9352(m4980(), 97, 9, 1939)));
            aVar.n = C0001.m1229(C0053.m8477(m4980(), 106, 10, 2236), jSONObject);
            aVar.o = C0064.m9640(C0051.m8200(jSONObject, C0033.m5852(m4980(), 116, 10, 2521)));
            aVar.p = C0001.m1229(C0017.m3646(m4980(), 126, 11, 1930), jSONObject);
            aVar.q = C0064.m9640(C0051.m8200(jSONObject, C0060.m9352(m4980(), 137, 11, 1561)));
            aVar.r = C0001.m1229(C0004.m1549(m4980(), 148, 12, 2371), jSONObject);
            aVar.s = C0064.m9640(C0051.m8200(jSONObject, C0003.m1398(m4980(), 160, 7, 2225)));
            aVar.t = C0064.m9640(C0051.m8200(jSONObject, C0051.m8259(m4980(), 167, 11, 2609)));
            aVar.u = C0064.m9640(C0051.m8200(jSONObject, C0058.m9106(m4980(), 178, 11, 2742)));
            aVar.v = C0001.m1229(C0003.m1398(m4980(), 189, 12, 2361), jSONObject);
            aVar.w = C0064.m9640(C0051.m8200(jSONObject, C0010.m2300(m4980(), 201, 9, 1990)));
            aVar.x = C0001.m1229(C0041.m6779(m4980(), 210, 10, 3204), jSONObject);
            aVar.y = C0064.m9640(C0051.m8200(jSONObject, C0033.m5852(m4980(), 220, 10, 2596)));
            aVar.z = C0001.m1229(C0020.m4199(m4980(), 230, 11, 2299), jSONObject);
            aVar.A = C0064.m9640(C0051.m8200(jSONObject, C0001.m1189(m4980(), 241, 11, 3105)));
            C0001.m1229(C0057.m8978(m4980(), 252, 12, 431), jSONObject);
            aVar.B = C0051.m8200(jSONObject, C0027.m5062(m4980(), 264, 5, 2878));
            aVar.C = C0051.m8200(jSONObject, C0010.m2300(m4980(), 269, 6, 1691));
            aVar.D = C0051.m8200(jSONObject, C0019.m4107(m4980(), 275, 6, 3224));
            aVar.E = C0001.m1229(C0022.m4403(m4980(), 281, 7, 1883), jSONObject);
            aVar.F = C0051.m8200(jSONObject, C0043.m7290(m4980(), 288, 5, 2755));
            aVar.G = C0001.m1229(C0061.m9361(m4980(), 293, 6, 888), jSONObject);
            aVar.H = C0051.m8200(jSONObject, C0064.m9599(m4980(), 299, 6, 2275));
            aVar.I = C0001.m1229(C0039.m6551(m4980(), 305, 7, 583), jSONObject);
            aVar.J = C0051.m8200(jSONObject, C0000.m1077(m4980(), 312, 6, 548));
            aVar.K = C0001.m1229(C0019.m4107(m4980(), 318, 7, 1050), jSONObject);
            aVar.L = C0051.m8200(jSONObject, C0002.m1305(m4980(), 325, 6, 2342));
            aVar.M = C0001.m1229(C0048.m7902(m4980(), 331, 7, 345), jSONObject);
            aVar.N = C0051.m8200(jSONObject, C0008.m1970(m4980(), 338, 6, 2499));
            aVar.O = C0001.m1229(C0006.m1774(m4980(), 344, 7, 3196), jSONObject);
            aVar.P = C0051.m8200(jSONObject, C0023.m4536(m4980(), 351, 7, 2527));
            aVar.Q = C0001.m1229(C0006.m1774(m4980(), 358, 8, 2464), jSONObject);
            aVar.R = C0051.m8200(jSONObject, C0056.m8911(m4980(), 366, 10, 2447));
            aVar.S = C0001.m1229(C0011.m2805(m4980(), 376, 11, 1292), jSONObject);
            aVar.T = C0051.m8200(jSONObject, C0055.m8814(m4980(), 387, 6, 465));
            aVar.U = C0001.m1229(C0037.m6307(m4980(), 393, 7, 2610), jSONObject);
            aVar.V = C0051.m8200(jSONObject, C0022.m4403(m4980(), 400, 10, 3021));
            aVar.W = C0051.m8200(jSONObject, C0053.m8477(m4980(), 410, 10, 1328));
            aVar.X = C0001.m1229(C0063.m9585(m4980(), 420, 11, 653), jSONObject);
            aVar.Y = C0051.m8200(jSONObject, C0009.m2037(m4980(), 431, 9, 1629));
            aVar.Z = C0051.m8200(jSONObject, C0033.m5852(m4980(), 440, 12, 2974));
            aVar.a0 = C0051.m8200(jSONObject, C0062.m9389(m4980(), 452, 7, 1175));
            aVar.b0 = C0001.m1229(C0009.m2037(m4980(), 459, 8, 2689), jSONObject);
            aVar.c0 = C0051.m8200(jSONObject, C0039.m6551(m4980(), 467, 9, 2864));
            aVar.d0 = C0001.m1229(C0005.m1645(m4980(), 476, 10, 1177), jSONObject);
            aVar.e0 = C0051.m8200(jSONObject, C0040.m6584(m4980(), 486, 7, 2461));
            aVar.f0 = C0051.m8200(jSONObject, C0047.m7833(m4980(), 493, 6, 2968));
            aVar.g0 = C0051.m8200(jSONObject, C0042.m7151(m4980(), 499, 11, 2252));
            aVar.h0 = C0051.m8200(jSONObject, C0046.m7718(m4980(), 510, 9, 504));
            aVar.i0 = C0064.m9640(C0051.m8200(jSONObject, C0065.m9775(m4980(), 519, 9, 2497)));
            aVar.j0 = C0064.m9640(C0051.m8200(jSONObject, C0057.m8978(m4980(), 528, 9, 2729)));
            aVar.k0 = C0001.m1229(C0033.m5852(m4980(), 537, 10, 1083), jSONObject);
            aVar.l0 = C0064.m9640(C0051.m8200(jSONObject, C0021.m4340(m4980(), 547, 7, 2904)));
            aVar.m0 = C0001.m1229(C0008.m1970(m4980(), 554, 8, 1349), jSONObject);
            aVar.n0 = C0064.m9640(C0051.m8200(jSONObject, C0008.m1970(m4980(), 562, 8, 1835)));
            aVar.o0 = C0001.m1229(C0023.m4536(m4980(), 570, 9, 1944), jSONObject);
            aVar.p0 = C0064.m9640(C0051.m8200(jSONObject, C0027.m5062(m4980(), 579, 9, 3101)));
            aVar.q0 = C0001.m1229(C0040.m6584(m4980(), 588, 10, 1388), jSONObject);
            return aVar;
        } catch (Exception e) {
            m4979(e);
            return null;
        }
    }

    public static Pattern c(String str, JSONObject jSONObject) {
        String strM9640 = C0064.m9640(C0051.m8200(jSONObject, str));
        if (C0057.m8953(strM9640)) {
            return null;
        }
        try {
            return C0005.m1602(strM9640);
        } catch (Exception e) {
            m4979(e);
            return null;
        }
    }

    /* renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4979(Object obj) {
        if (C0001.m1164() < 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۦۣۤ, reason: contains not printable characters */
    public static short[] m4980() {
        if (C0038.m6471() > 0) {
            return f491short;
        }
        return null;
    }
}