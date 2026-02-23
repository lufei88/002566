package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MYzhiqiu extends Spider {
    public static final SecretKeySpec d;
    public static final IvParameterSpec e;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f85short = {2788, 2789, 2807, 2716, 2697, 2914, 2896, 2897, 2921, 2897, 2893, 2936, 2924, 2890, 2905, 2902, 2891, 2897, 2892, 2841, 2841, 1644, 1640, 1662, 390, 421, 444, 433, 432, 423, 399, 445, 444, 388, 444, 416, 406, 435, 434, 500, 732, 728, 731, 711, 711, 707, 668, 647, 669, 642, 641, 669, 643, 651, 645, 665, 1223, 1224, 1220, 1228, 2611, 21413, -28123, 1513, 2395, 1368, 1359, 1346, 1371, 1355, 2395, 2395, 2395, 726, 722, 708, 696, 724, 725, 724, 696, 711, 732, 724, 708, 674, 711, 758, 755, 755, 766, 761, 752, 1356, 1357, 1375, 1332, 1313, 2077, 2108, 2094, 2095, 2103, 2095, 2099, 2075, 2150, 2098, 2100, 2087, 2088, 2101, 2095, 2098, 2051, 2088, 2085, 2100, 2111, 2102, 2098, 2172, 2150, 423, 421, 435, 447, 428, 447, 425, 417, 419, 420, 429, 3271, 3206, 3292, 1488, 1522, 1476, 1512, 1501, 1479, 1525, 1524, 1484, 1524, 1512, 1455, 1453, 1455, 1451, 1468, 1115, 1100, 1100, 1105, 1100, 2224, 2193, 2179, 2178, 2202, 2178, 2206, 2230, 2251, 2235, 2211, 2235, 2257, 2251, 2659, 2657, 2679, 2683, 2664, 2683, 2669, 2661, 2663, 2656, 2665, 2227, 2194, 2176, 2177, 2201, 2177, 2205, 2229, 2248, 2200, 2185, 2202, 2203, 2189, 2221, 2182, 2187, 2234, 2189, 2203, 2200, 2183, 2182, 2203, 2189, 2258, 2248, 2000, 2013, 1505, 1528, 1523, 1480, 1534, 1523, 2423, 2424, 2420, 2428, 1943, 1934, 1925, 1982, 1935, 1920, 1932, 1924, 1813, 1802, 1799, 1798, 1804, 1843, 1802, 1792, 2045, 2020, 2031, 2004, 2043, 2018, 2024, 2111, 2088, 2080, 2092, 2111, 2086, 2110, 3302, 3327, 3316, 3279, 3298, 3317, 3325, 3313, 3298, 3323, 3299, 965, 961, 983, 939, 967, 966, 967, 939, 980, 975, 967, 983, 945, 980, 997, 992, 992, 1005, 1002, 995, 2845, 2844, 2830, 2917, 2928, 2501, 2532, 2550, 2551, 2543, 2551, 2539, 2499, 2494, 2538, 2540, 2559, 2544, 2541, 2551, 2538, 2522, 2555, 2557, 2540, 2535, 2542, 2538, 2468, 2494, 2576, 2614, 2592, 2615, 2664, 2564, 2594, 2592, 2603, 2609, 1780, 1785, 1776, 1765, 1737, 1764, 1438, 1423, 1417, 1419, 1440, 1435, 1411, 1252, 1269, 1267, 1265, 1223, 1277, 1262, 1265, 560, 575, 562, 544, 544, 1802, 1797, 1800, 1818, 1818, 1792, 1807, 1808, 985, 970, 989, 985, 2404, 2424, 2428, 2415, 1654, 1642, 1655, 1649, 1607, 1660, 1467, 1525, 1508, 1533, 1467, 1506, 1445, 1467, 1506, 1533, 1520, 1521, 1531, 1467, 1533, 1530, 1520, 1521, 1516, 3282, 3287, 3266, 3287, 3046, 3043, 3065, 3070, 509, 486, 509, 488, 485, 473, 488, 494, 492, 620, 637, 635, 633, 1567, 1550, 1544, 1546, 1548, 1536, 1562, 1537, 1563, 1111, 1106, 1110, 1106, 1103, 775, 796, 775, 786, 799, 1930, 1927, 2998, 3064, 3049, 3056, 2998, 3055, 2984, 2998, 3055, 3056, 3069, 3068, 3062, 2998, 3055, 3056, 3069, 3068, 3062, 3037, 3068, 3053, 3064, 3056, 3061, 3050, 2936, 2941, 2920, 2941, 2293, 2284, 2279, 2268, 2282, 2279, 2078, 2065, 2077, 2069, 2902, 2895, 2884, 2943, 2894, 2881, 2893, 2885, 3253, 3242, 3239, 3238, 3244, 3219, 3242, 3232, 2506, 2515, 2520, 2531, 2508, 2517, 2527, 278, 281, 276, 262, 262, 284, 275, 268, 1296, 1309, 1300, 1281, 1339, 1290, 1285, 1289, 1281, 1471, 1443, 1447, 1460, 872, 881, 890, 833, 871, 891, 895, 876, 1313, 1330, 1317, 1313, 2575, 2582, 2589, 2598, 2584, 2571, 2588, 2584, 1853, 1834, 1826, 1838, 1853, 1828, 1852, 1216, 1241, 1234, 1257, 1220, 1235, 1243, 1239, 1220, 1245, 1221, 784, 786, 773, 798, 771, 2087, 2110, 2101, 2062, 2096, 2098, 2085, 2110, 2083, 1055, 1042, 1033, 1054, 1048, 1039, 1044, 1033, 627, 618, 609, 602, 609, 620, 631, 608, 614, 625, 618, 631, 26162, -25034, 21286, 19805, 20925, 618, 24667, 19527, 25701, 26162, -25034, 21365, 566, 31511, 31685, 25314, 19533, 19649, 23496, 25413, -698, 22082, 23036, 23602, 31685, -698, -26586, 19520, 25923, -26885, -698, -26586, 20602, 20693, 24666, -693, 1111, 1115, 1114, 1088, 1105, 1114, 1088, 3001, 2976, 2987, 2960, 2988, 2976, 2977, 3003, 2986, 2977, 3003, 1666, 1694, 1683, 1675, 1687, 1664, 1697, 1693, 1671, 1664, 1681, 1687, 406, 401, 388, 401, 384, 2918, 2938, 2912, 2919, 2934, 2928, 2907, 2932, 2936, 2928, 2003, 1999, 2005, 2002, 1987, 1989, 2019, 1999, 1988, 1989, 531, 514, 529, 528, 518, 566, 529, 527, 2876, 2865, 2858, 2877, 2875, 2860, 2564, 2581, 2566, 2567, 2577, 1350, 1363, 1354, 1360, 1356, 1351, 1350, 1360, 3159, 3138, 3163, 3137, 3165, 3158, 3159, 3196, 3155, 3167, 3159, 2763, 2775, 2778, 2754, 2782, 2761, 2808, 2772, 2783, 2782, 3047, 2084, 2084, 2084, 906, 2233, 2143, 2118, 2125, 2166, 2137, 2117, 2120, 2128, 2166, 2127, 2139, 2118, 2116, 2035, 2026, 2017, 2010, 2037, 2025, 2020, 2044, 2010, 2032, 2039, 2025, 2035, 2038, 2028, 2027, 2463, 2500, 2511, 2461, 2005, 2036, 2022, 2023, 2047, 2023, 2043, 2003, 1966, 2046, 2022, 2046, 1952, 785, 779, 1822, 1807, 1820, 1807, 1795, 1821, 1199, 1193, 1740, 1758, 1759, 1735, 1759, 1731, 1669, 2966, 2999, 2981, 2980, 3004, 2980, 3000, 2960, 3053, 2973, 2946, 2974, 2969, 3045, 2987, 2978, 3007, 2976, 3044, 3053, 1498, 1531, 1513, 1512, 1520, 1512, 1524, 1500, 1441, 1521, 1518, 1522, 1525, 1490, 1512, 1510, 1519, 1508, 1509, 1479, 1518, 1523, 1516, 1467, 1441, 1127, 1065, 1080, 1057, 1127, 1086, 1145, 1127, 1086, 1057, 1068, 1069, 1063, 1127, 1067, 1060, 1065, 1083, 1083, 1057, 1070, 1057, 1069, 1083, 2980, 2977, 2996, 2977, 1470, 1457, 1468, 1454, 1454, 1216, 1229, 1678, 1665, 1677, 1669, 2944, 2957, 2948, 2961, 2987, 2973, 2960, 1991, 1994, 1987, 2006, 2028, 2013, 2002, 2014, 2006, 2262, 2251, 2247, 2262, 2269, 2263, 31385, 20841, 1362, 1345, 1366, 1362, 21174, 22204, 2726, 2746, 2750, 2733, 22513, 18296, 2474, 2471, 2472, 2465, -29311, -29588, 3031, 3032, 3037, 3013, 3028, 3011, 3010, 1245, 1171, 1154, 1179, 1245, 1156, 1219, 1245, 1156, 1179, 1174, 1175, 1181, 1245, 1152, 1175, 1169, 1181, 1183, 1183, 1175, 1180, 1174, 1175, 1174, 2337, 2340, 2353, 2340, 2121, 2134, 2139, 2138, 2128, 2124, 3241, 3244, 3254, 3249, 1701, 1699, 2943, 2926, 2941, 2926, 2914, 2940, 3287, 3269, 3268, 3292, 3268, 3288, 3231, 3183, 3170, 3177, 3188, 2866, 2835, 2817, 2816, 2840, 2816, 2844, 2868, 2889, 2873, 2854, 2874, 2877, 
    2881, 2819, 2842, 2822, 2823, 2880, 2889, 664, 692, 693, 687, 702, 693, 687, 758, 655, 674, 683, 702, 984, 969, 969, 981, 976, 986, 984, 973, 976, 982, 983, 918, 979, 970, 982, 983, 898, 921, 986, 977, 984, 971, 970, 988, 973, 900, 972, 973, 991, 916, 897, 279, 310, 292, 293, 317, 293, 313, 273, 364, 316, 291, 319, 312, 287, 293, 299, 290, 297, 296, 262, 319, 291, 290, 374, 364, 1424, 683, 697, 696, 672, 696, 676, 736, 2959, 2952, 2966, 2953, 1212, 1192, 1535, 1502, 1484, 1485, 1493, 1485, 1489, 1529, 1412, 1485, 1482, 1485, 1488, 1438, 1412, 2589, 2619, 2605, 2618, 2661, 2569, 2607, 2605, 2598, 2620, 753, 2195, 2227, 2195, 2227, 2195, 2227, 768, 773, 778, 777, 773, 783, 785, 2577, 2560, 2579, 2578, 2564, 561, 566, 552, 1797, 1817, 1817, 1821, 902, 914, 911, 909, 2051, 2063, 2052, 2053, 2191, 2241, 2256, 2249, 2191, 2262, 2193, 2191, 2256, 2252, 2241, 2265, 2245, 2258, 2191, 2241, 2254, 2241, 2252, 2265, 2259, 2249, 2259, 2293, 2258, 2252, 2153, 2156, 2169, 2156, 2930, 2899, 2881, 2880, 2904, 2880, 2908, 2932, 2825, 2888, 2887, 2888, 2885, 2896, 2906, 2880, 2906, 2940, 2907, 2885, 2835, 2825, 577, 597, 2560, 2573, 2569, 2572, 2573, 2586, 765, 732, 718, 719, 727, 719, 723, 763, 646, 726, 711, 724, 725, 707, 755, 724, 714, 668, 646, 520, 518, 538, 532, 524, 529, 519, 2673, 2656, 2662, 2660, 2639, 2676, 2668, 1218, 1235, 1237, 1239, 1249, 1243, 1224, 1239, 2499, 2445, 2460, 2437, 2499, 2458, 2525, 2499, 2458, 2437, 2440, 2441, 2435, 2499, 2463, 2441, 2445, 2462, 2447, 2436, 961, 964, 977, 964, 839, 834, 856, 863};
    public String a;
    public String b;
    public String c;

    static {
        SecretKeySpec secretKeySpec;
        String strM7509 = C0044.m7509(m476(), 0, 5, 2737);
        IvParameterSpec ivParameterSpec = null;
        try {
            secretKeySpec = new SecretKeySpec(C0021.m4347(C0030.m5362(m476(), 5, 16, 2872), strM7509), C0034.m6001(m476(), 21, 3, 1581));
            try {
                ivParameterSpec = new IvParameterSpec(C0021.m4347(C0061.m9361(m476(), 24, 16, 469), strM7509));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            secretKeySpec = null;
        }
        d = secretKeySpec;
        e = ivParameterSpec;
    }

    public MYzhiqiu() {
        String strM1840 = C0007.m1840();
        this.a = strM1840;
        this.b = strM1840;
        this.c = C0026.m4951(m476(), 40, 13, 691);
    }

    public static void a(JSONArray jSONArray, String str, String str2, String str3) {
        if (str3 == null || C0057.m8953(str3)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C0047.m7743(jSONObject, C0013.m3106(m476(), 53, 3, 736), str);
        C0047.m7743(jSONObject, C0054.m8574(m476(), 56, 4, 1193), str2);
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        String strM7833 = C0047.m7833(m476(), 60, 1, 2653);
        C0047.m7743(jSONObject2, strM7833, C0014.m3332(m476(), 61, 2, 717));
        String strM8007 = C0049.m8007(m476(), 63, 1, 1439);
        C0047.m7743(jSONObject2, strM8007, C0007.m1840());
        C0044.m7459(jSONArray2, jSONObject2);
        for (String str4 : C0024.m4752(str3, C0002.m1305(m476(), 64, 1, 2423))) {
            String strM9640 = C0064.m9640(str4);
            if (!C0057.m8953(strM9640)) {
                JSONObject jSONObject3 = new JSONObject();
                C0047.m7743(jSONObject3, strM7833, strM9640);
                C0047.m7743(jSONObject3, strM8007, strM9640);
                C0044.m7459(jSONArray2, jSONObject3);
            }
        }
        C0047.m7743(jSONObject, C0005.m1645(m476(), 65, 5, 1326), jSONArray2);
        C0044.m7459(jSONArray, jSONObject);
    }

    public static String c(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C0009.m2139(arrayList); i++) {
            if (i > 0) {
                C0018.m3933(sb, C0031.m5565(m476(), 70, 3, 2431));
            }
            C0018.m3933(sb, (String) C0028.m5167(arrayList, i));
        }
        return C0047.m7763(sb);
    }

    public static String d(JSONObject jSONObject) {
        String strM1840;
        JSONObject jSONObject2 = new JSONObject();
        String strM1539 = C0004.m1539(jSONObject);
        try {
            Cipher cipherM4284 = C0020.m4284(C0035.m6131(m476(), 73, 20, 663));
            C0058.m9088(cipherM4284, 1, C0006.m1751(), C0012.m2991());
            strM1840 = C0052.m8364(C0010.m2335(cipherM4284, C0021.m4347(strM1539, C0036.m6188(m476(), 93, 5, 1305))), 2);
        } catch (Exception e2) {
            C0043.m7366(e2, new StringBuilder(C0058.m9106(m476(), 98, 25, 2118)));
            strM1840 = C0007.m1840();
        }
        return C0004.m1539(C0047.m7743(jSONObject2, C0042.m7151(m476(), 123, 11, 458), strM1840));
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            C0047.m7743(jSONObject, C0045.m7657(m476(), 134, 3, 3249), C0019.m4107(m476(), 137, 16, 1437));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject f(String str) {
        String strM5708 = C0032.m5708(m476(), 153, 5, 1086);
        String strM9599 = C0064.m9599(m476(), 158, 14, 2283);
        try {
            if (C0043.m7327(str)) {
                return null;
            }
            String strM2054 = C0009.m2054(new JSONObject(str), C0048.m7902(m476(), 172, 11, 2574), C0007.m1840());
            if (C0043.m7327(strM2054)) {
                return null;
            }
            String strM8968 = C0057.m8968(strM2054);
            if (C0043.m7327(strM8968)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM8968);
            if (!C0063.m9499(jSONObject, strM5708)) {
                return jSONObject;
            }
            StringBuilder sb = new StringBuilder(strM9599);
            C0018.m3933(sb, C0051.m8200(jSONObject, strM5708));
            m477(C0047.m7763(sb));
            return null;
        } catch (Exception e2) {
            C0043.m7366(e2, new StringBuilder(C0057.m8978(m476(), 183, 27, 2280)));
            return null;
        }
    }

    public static JSONObject j(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        C0047.m7743(jSONObject2, C0044.m7509(m476(), 212, 6, 1431), C0054.m8599(C0034.m6036(jSONObject, C0014.m3332(m476(), 210, 2, 1977))));
        C0047.m7743(jSONObject2, C0047.m7833(m476(), 222, 8, 2017), C0051.m8200(jSONObject, C0041.m6779(m476(), 218, 4, 2329)));
        C0047.m7743(jSONObject2, C0013.m3106(m476(), 252, 11, 3216), C0029.m5215(jSONObject, C0027.m5062(m476(), 230, 8, 1891), jSONObject2, C0027.m5062(m476(), 238, 7, 1931), C0044.m7509(m476(), 245, 7, 2125)));
        return jSONObject2;
    }

    public static String k(String str) {
        try {
            Cipher cipherM4284 = C0020.m4284(C0024.m4740(m476(), 263, 20, 900));
            C0058.m9088(cipherM4284, 2, C0006.m1751(), C0012.m2991());
            return new String(C0010.m2335(cipherM4284, C0034.m5997(str, 0)), C0045.m7657(m476(), 283, 5, 2888));
        } catch (Exception e2) {
            C0043.m7366(e2, new StringBuilder(C0064.m9599(m476(), 288, 25, 2462)));
            return C0007.m1840();
        }
    }

    /* renamed from: ۣۢۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m476() {
        if (C0025.m4797() > 0) {
            return f85short;
        }
        return null;
    }

    /* renamed from: ۦۡۢۥ, reason: contains not printable characters */
    public static void m477(Object obj) {
        if (C0029.m5282() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        C0053.m8424(map, C0057.m8978(m476(), 313, 10, 2629), C0062.m9372(this));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        C0037.m6360(jSONObject, C0053.m8477(m476(), 323, 6, 1664), C0038.m6456(str));
        C0037.m6360(jSONObject, C0048.m7902(m476(), 329, 7, 1518), C0038.m6456(str2));
        C0037.m6360(jSONObject, C0024.m4740(m476(), 336, 8, 1172), 40);
        if (map != null) {
            String strM6551 = C0039.m6551(m476(), 344, 5, 595);
            if (C0058.m9098(map, strM6551)) {
                C0047.m7743(jSONObject, C0065.m9775(m476(), 349, 8, 1897), C0065.m9715(map, strM6551));
            }
            String strM5362 = C0030.m5362(m476(), 357, 4, 952);
            if (C0058.m9098(map, strM5362)) {
                C0047.m7743(jSONObject, strM5362, C0065.m9715(map, strM5362));
            }
            String strM6131 = C0035.m6131(m476(), 361, 4, 2333);
            if (C0058.m9098(map, strM6131)) {
                C0047.m7743(jSONObject, strM6131, C0065.m9715(map, strM6131));
            }
            String strM2973 = C0012.m2973(m476(), 365, 6, 1541);
            if (C0058.m9098(map, strM2973)) {
                C0047.m7743(jSONObject, strM2973, C0065.m9715(map, strM2973));
            }
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0030.m5379(this));
        C0018.m3933(sb, C0058.m9106(m476(), 371, 19, 1428));
        JSONObject jSONObjectM7123 = C0042.m7123(new JSONObject(C0041.m6777(this, C0047.m7763(sb), jSONObject)), C0060.m9352(m476(), 390, 4, 3254));
        JSONArray jSONArray = new JSONArray();
        int iM5075 = 1;
        String strM8259 = C0051.m8259(m476(), 394, 4, 2954);
        if (jSONObjectM7123 != null) {
            iM5075 = C0027.m5075(jSONObjectM7123, C0021.m4340(m476(), 398, 9, 393), 1);
            JSONArray jSONArrayM1964 = C0008.m1964(jSONObjectM7123, strM8259);
            if (jSONArrayM1964 != null) {
                for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
                    C0044.m7459(jSONArray, C0016.m3567(C0018.m3923(jSONArrayM1964, i)));
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        C0037.m6360(jSONObject2, C0055.m8814(m476(), 407, 4, 540), C0038.m6456(str2));
        C0037.m6360(jSONObject2, C0047.m7833(m476(), 411, 9, 1647), iM5075);
        C0037.m6360(jSONObject2, C0011.m2805(m476(), 420, 5, 1083), 40);
        C0037.m6360(jSONObject2, C0002.m1305(m476(), 425, 5, 883), iM5075 * 40);
        C0047.m7743(jSONObject2, strM8259, jSONArray);
        return C0004.m1539(jSONObject2);
    }

    public String detailContent(List<String> list) {
        JSONArray jSONArray;
        String str = (String) C0048.m7915(list, 0);
        JSONObject jSONObject = new JSONObject();
        String strM8574 = C0054.m8574(m476(), 430, 2, 2019);
        C0047.m7743(jSONObject, strM8574, str);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0030.m5379(this));
        C0018.m3933(sb, C0007.m1842(m476(), 432, 26, 2969));
        JSONObject jSONObjectM7123 = C0042.m7123(new JSONObject(C0019.m4074(this, C0047.m7763(sb), jSONObject)), C0065.m9775(m476(), 458, 4, 2844));
        if (jSONObjectM7123 == null) {
            return C0007.m1840();
        }
        JSONObject jSONObject2 = new JSONObject();
        C0037.m6360(jSONObject2, C0036.m6188(m476(), 462, 6, 2179), C0034.m6036(jSONObjectM7123, strM8574));
        String strM2973 = C0012.m2973(m476(), 468, 4, 2160);
        C0047.m7743(jSONObject2, C0007.m1842(m476(), 472, 8, 2848), C0051.m8200(jSONObjectM7123, strM2973));
        C0047.m7743(jSONObject2, C0001.m1189(m476(), 503, 9, 1380), C0029.m5215(jSONObjectM7123, C0017.m3646(m476(), 480, 8, 3267), jSONObject2, C0053.m8477(m476(), 488, 7, 2492), C0018.m3917(m476(), 495, 8, 373)));
        C0047.m7743(jSONObject2, C0032.m5708(m476(), 528, 8, 2681), C0029.m5215(jSONObjectM7123, C0039.m6551(m476(), 512, 4, 1478), jSONObject2, C0022.m4403(m476(), 516, 8, 798), C0024.m4740(m476(), 524, 4, 1344)));
        C0047.m7743(jSONObject2, C0021.m4340(m476(), 559, 9, 2129), C0029.m5215(jSONObjectM7123, C0048.m7902(m476(), 536, 7, 1871), jSONObject2, C0003.m1398(m476(), 543, 11, 1206), C0029.m5256(m476(), 554, 5, 881)));
        C0047.m7743(jSONObject2, C0036.m6188(m476(), 576, 12, 517), C0051.m8200(jSONObjectM7123, C0001.m1189(m476(), 568, 8, 1147)));
        StringBuilder sb2 = new StringBuilder(C0000.m1077(m476(), 588, 36, 586));
        C0018.m3933(sb2, C0051.m8200(jSONObjectM7123, C0043.m7290(m476(), 624, 7, 1076)));
        C0047.m7743(jSONObject2, C0004.m1549(m476(), 631, 11, 3023), C0047.m7763(sb2));
        JSONArray jSONArrayM1964 = C0008.m1964(jSONObjectM7123, C0057.m8978(m476(), 642, 12, 1778));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayM1964 != null) {
            int i = 0;
            while (i < C0053.m8396(jSONArrayM1964)) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM1964, i);
                if (C0034.m6036(jSONObjectM3923, C0007.m1842(m476(), 654, 5, 485)) != 1) {
                    jSONArray = jSONArrayM1964;
                } else {
                    String strM8200 = C0051.m8200(jSONObjectM3923, C0030.m5362(m476(), 659, 10, 2837));
                    String strM82002 = C0051.m8200(jSONObjectM3923, C0027.m5062(m476(), 669, 10, 1952));
                    String strM82003 = C0051.m8200(jSONObjectM3923, C0036.m6188(m476(), 679, 8, 611));
                    int iM6036 = C0034.m6036(jSONObjectM3923, C0018.m3917(m476(), 687, 6, 2904));
                    int iM60362 = C0034.m6036(jSONObjectM3923, C0028.m5109(m476(), 693, 5, 2676));
                    C0004.m1532(arrayList, strM8200);
                    JSONArray jSONArrayM19642 = C0008.m1964(jSONObjectM3923, C0025.m4795(m476(), 698, 8, 1315));
                    StringBuilder sb3 = new StringBuilder();
                    if (jSONArrayM19642 != null) {
                        int i2 = 0;
                        while (i2 < C0053.m8396(jSONArrayM19642)) {
                            JSONObject jSONObjectM39232 = C0018.m3923(jSONArrayM19642, i2);
                            String strM82004 = C0051.m8200(jSONObjectM39232, C0015.m3484(m476(), 706, 11, 3122));
                            JSONArray jSONArray2 = jSONArrayM1964;
                            String strM82005 = C0051.m8200(jSONObjectM39232, C0019.m4107(m476(), 717, 10, 2747));
                            if (C0006.m1693(sb3) > 0) {
                                C0018.m3933(sb3, C0048.m7902(m476(), 727, 1, 3012));
                            }
                            StringBuilder sb4 = new StringBuilder();
                            C0018.m3933(sb4, strM82005);
                            String strM5852 = C0033.m5852(m476(), 728, 3, 2136);
                            C0018.m3933(sb4, strM5852);
                            C0018.m3933(sb4, strM82002);
                            C0018.m3933(sb4, strM5852);
                            C0036.m6177(sb4, iM6036);
                            C0018.m3933(sb4, strM5852);
                            C0036.m6177(sb4, iM60362);
                            C0018.m3933(sb4, strM5852);
                            C0018.m3933(sb4, strM82003);
                            String strM7763 = C0047.m7763(sb4);
                            C0018.m3933(sb3, strM82004);
                            C0018.m3933(sb3, C0047.m7833(m476(), 731, 1, 942));
                            StringBuilder sb5 = new StringBuilder();
                            C0018.m3933(sb5, strM7763);
                            String strM9585 = C0063.m9585(m476(), 732, 1, 2247);
                            C0018.m3933(sb5, strM9585);
                            C0018.m3933(sb5, C0051.m8200(jSONObjectM7123, strM2973));
                            C0018.m3933(sb5, strM9585);
                            C0018.m3933(sb5, strM82004);
                            C0018.m3933(sb3, C0047.m7763(sb5));
                            i2++;
                            jSONArrayM1964 = jSONArray2;
                            jSONArrayM19642 = jSONArrayM19642;
                        }
                    }
                    jSONArray = jSONArrayM1964;
                    C0004.m1532(arrayList2, C0047.m7763(sb3));
                }
                i++;
                jSONArrayM1964 = jSONArray;
            }
        }
        C0047.m7743(jSONObject2, C0030.m5362(m476(), 733, 13, 2089), C0057.m9023(arrayList));
        C0047.m7743(jSONObject2, C0044.m7509(m476(), 746, 12, 1925), C0057.m9023(arrayList2));
        JSONArray jSONArray3 = new JSONArray();
        C0044.m7459(jSONArray3, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C0047.m7743(jSONObject3, C0000.m1077(m476(), 758, 4, 1951), jSONArray3);
        return C0004.m1539(jSONObject3);
    }

    public final JSONObject g(String str, JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0032.m5743(this));
            C0018.m3933(sb, C0057.m8978(m476(), 762, 4, 2464));
            C0018.m3933(sb, str);
            return C0052.m8339(C0008.m2029(C0045.m7628(C0047.m7763(sb), C0034.m5981(jSONObject), null)));
        } catch (Exception e2) {
            C0043.m7366(e2, C0046.m7672(C0000.m1077(m476(), 766, 13, 1934), str, C0006.m1774(m476(), 779, 2, 811)));
            return null;
        }
    }

    public final String h(String str, JSONObject jSONObject) {
        JSONObject jSONObjectM7123;
        String strM4340 = C0021.m4340(m476(), 781, 6, 1902);
        String strM5852 = C0033.m5852(m476(), 787, 2, 1236);
        try {
            JSONObject jSONObjectM3530 = C0016.m3530();
            JSONObject jSONObject2 = new JSONObject();
            Iterator itM7553 = C0045.m7553(jSONObject);
            while (C0012.m2962(itM7553)) {
                String str2 = (String) C0048.m7949(itM7553);
                C0047.m7743(jSONObject2, str2, C0000.m1096(C0030.m5409(jSONObject, str2)));
            }
            C0047.m7743(jSONObjectM3530, strM4340, jSONObject2);
            JSONObject jSONObjectM2814 = C0011.m2814(this, C0005.m1645(m476(), 789, 7, 1718), jSONObjectM3530);
            if (jSONObjectM2814 == null || (jSONObjectM7123 = C0042.m7123(jSONObjectM2814, strM4340)) == null) {
                return strM5852;
            }
            HashMap map = new HashMap();
            Iterator itM75532 = C0045.m7553(jSONObjectM7123);
            while (C0012.m2962(itM75532)) {
                String str3 = (String) C0048.m7949(itM75532);
                C0053.m8424(map, str3, C0051.m8200(jSONObjectM7123, str3));
            }
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0008.m1970(m476(), 796, 20, 3021));
            C0018.m3933(sb, str);
            m477(C0047.m7763(sb));
            return C0008.m2029(C0003.m1396(str, map, C0030.m5330(this)));
        } catch (Exception e2) {
            C0043.m7366(e2, new StringBuilder(C0064.m9599(m476(), 816, 25, 1409)));
            return strM5852;
        }
    }

    public String homeContent(boolean z) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM1964 = C0008.m1964(new JSONObject(C0041.m6777(this, C0028.m5188(new StringBuilder(), C0030.m5379(this), C0027.m5062(m476(), 841, 24, 1096)), new JSONObject())), C0009.m2037(m476(), 865, 4, 3008));
        String strM1077 = C0000.m1077(m476(), 869, 5, 1501);
        if (jSONArrayM1964 != null) {
            for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM1964, i);
                String strM8599 = C0054.m8599(C0046.m7710(jSONObjectM3923, C0001.m1189(m476(), 874, 2, 1193)));
                String strM1212 = C0001.m1212(jSONObjectM3923, C0007.m1842(m476(), 876, 4, 1760));
                JSONObject jSONObject2 = new JSONObject();
                C0047.m7743(jSONObject2, C0017.m3646(m476(), 880, 7, 3060), strM8599);
                C0047.m7743(jSONObject2, C0030.m5362(m476(), 887, 9, 1971), strM1212);
                C0044.m7459(jSONArray, jSONObject2);
                if (z) {
                    JSONObject jSONObjectM7123 = C0042.m7123(jSONObjectM3923, C0013.m3106(m476(), 896, 6, 2227));
                    JSONArray jSONArray2 = new JSONArray();
                    if (jSONObjectM7123 != null) {
                        C0063.m9557(jSONArray2, strM1077, C0040.m6584(m476(), 902, 2, 1762), C0051.m8200(jSONObjectM7123, strM1077));
                        String strM1970 = C0008.m1970(m476(), 904, 4, 1331);
                        C0063.m9557(jSONArray2, strM1970, C0022.m4403(m476(), 908, 2, 1414), C0051.m8200(jSONObjectM7123, strM1970));
                        String strM8574 = C0054.m8574(m476(), 910, 4, 2783);
                        C0063.m9557(jSONArray2, strM8574, C0045.m7657(m476(), 914, 2, 2437), C0051.m8200(jSONObjectM7123, strM8574));
                        String strM19702 = C0008.m1970(m476(), 916, 4, 2502);
                        C0063.m9557(jSONArray2, strM19702, C0021.m4340(m476(), 920, 2, 1644), C0051.m8200(jSONObjectM7123, strM19702));
                    }
                    if (C0053.m8396(jSONArray2) > 0) {
                        C0047.m7743(jSONObject, strM8599, jSONArray2);
                    }
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        C0047.m7743(jSONObject3, strM1077, jSONArray);
        if (z && C0014.m3372(jSONObject) > 0) {
            C0047.m7743(jSONObject3, C0021.m4340(m476(), 922, 7, 2993), jSONObject);
        }
        return C0004.m1539(jSONObject3);
    }

    public String homeVideoContent() {
        JSONArray jSONArrayM1964 = C0008.m1964(new JSONObject(C0041.m6777(this, C0028.m5188(new StringBuilder(), C0030.m5379(this), C0061.m9361(m476(), 929, 25, 1266)), new JSONObject())), C0004.m1549(m476(), 954, 4, 2373));
        JSONArray jSONArray = new JSONArray();
        if (jSONArrayM1964 != null) {
            for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
                JSONArray jSONArrayM19642 = C0008.m1964(C0018.m3923(jSONArrayM1964, i), C0053.m8477(m476(), 958, 6, 2111));
                if (jSONArrayM19642 != null) {
                    for (int i2 = 0; i2 < C0053.m8396(jSONArrayM19642); i2++) {
                        C0044.m7459(jSONArray, C0016.m3567(C0018.m3923(jSONArrayM19642, i2)));
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        C0047.m7743(jSONObject, C0029.m5256(m476(), 964, 4, 3269), jSONArray);
        return C0004.m1539(jSONObject);
    }

    public final String i(String str, JSONObject jSONObject) {
        String strM7902 = C0048.m7902(m476(), 968, 2, 1758);
        try {
            JSONObject jSONObjectM3530 = C0016.m3530();
            JSONObject jSONObject2 = new JSONObject();
            Iterator itM7553 = C0045.m7553(jSONObject);
            while (C0012.m2962(itM7553)) {
                String str2 = (String) C0048.m7949(itM7553);
                C0047.m7743(jSONObject2, str2, C0030.m5409(jSONObject, str2));
            }
            C0047.m7743(jSONObjectM3530, C0061.m9361(m476(), 970, 6, 2831), jSONObject2);
            JSONObject jSONObjectM2814 = C0011.m2814(this, C0043.m7290(m476(), 976, 7, 3245), jSONObjectM3530);
            if (jSONObjectM2814 == null) {
                return strM7902;
            }
            String strM2054 = C0009.m2054(jSONObjectM2814, C0034.m6001(m476(), 983, 4, 3085), strM7902);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0021.m4340(m476(), 987, 20, 2921));
            C0018.m3933(sb, str);
            m477(C0047.m7763(sb));
            HashMap mapM5330 = C0030.m5330(this);
            C0053.m8424(mapM5330, C0047.m7833(m476(), 1007, 12, 731), C0061.m9361(m476(), 1019, 31, 953));
            return C0008.m2029(C0045.m7628(str, strM2054, mapM5330));
        } catch (Exception e2) {
            C0043.m7366(e2, new StringBuilder(C0042.m7151(m476(), 1050, 25, 332)));
            return strM7902;
        }
    }

    public void init(Context context, String str) {
        String str2 = str;
        super.init(context, str2);
        boolean zM7327 = C0043.m7327(str2);
        String strM2973 = C0012.m2973(m476(), 1075, 1, 1471);
        String strM1840 = C0007.m1840();
        if (!zM7327) {
            if (!C0043.m7327(strM1840)) {
                str2 = strM1840;
            }
            this.a = str2;
            if (C0060.m9349(str2, strM2973)) {
                this.a = C0054.m8636(C0032.m5743(this), 0, C0004.m1584(r5) - 1);
            }
        }
        try {
            JSONObject jSONObjectM2814 = C0011.m2814(this, C0058.m9106(m476(), 1076, 7, 721), C0016.m3530());
            if (jSONObjectM2814 != null) {
                JSONArray jSONArrayM1964 = C0008.m1964(jSONObjectM2814, C0008.m1970(m476(), 1083, 4, 3066));
                if (jSONArrayM1964 != null && C0053.m8396(jSONArrayM1964) > 0) {
                    String strM4770 = C0025.m4770(jSONArrayM1964, 0);
                    this.b = strM4770;
                    if (C0060.m9349(strM4770, strM2973)) {
                        this.b = C0054.m8636(C0030.m5379(this), 0, C0004.m1584(r6) - 1);
                    }
                }
                String strM2054 = C0009.m2054(jSONObjectM2814, C0036.m6188(m476(), 1087, 2, 1225), strM1840);
                if (C0057.m8953(strM2054)) {
                    return;
                }
                this.c = strM2054;
            }
        } catch (Exception e2) {
            C0043.m7366(e2, new StringBuilder(C0028.m5109(m476(), 1089, 15, 1444)));
        }
    }

    public boolean isVideoFormat(String str) {
        return C0015.m3436(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM8477 = C0053.m8477(m476(), 1104, 10, 2632);
        String[] strArrM4752 = C0024.m4752(str2, C0005.m1645(m476(), 1114, 1, 655));
        String[] strArrM47522 = C0024.m4752(strArrM4752[0], C0060.m9352(m476(), 1115, 6, 2255));
        String strM2827 = C0011.m2827(strArrM47522[0], strArrM4752[1], strArrM4752[2]);
        String str3 = strArrM47522[0];
        int length = strArrM47522.length;
        String strM1840 = C0007.m1840();
        String str4 = length > 1 ? strArrM47522[1] : strM1840;
        int iM6456 = strArrM47522.length > 2 ? C0038.m6456(strArrM47522[2]) : 0;
        if (strArrM47522.length > 3) {
            C0038.m6456(strArrM47522[3]);
        }
        String str5 = strArrM47522.length > 4 ? strArrM47522[4] : strM1840;
        String strM8007 = C0049.m8007(m476(), 1121, 7, 868);
        String strM6779 = C0041.m6779(m476(), 1128, 5, 2657);
        String strM3332 = C0014.m3332(m476(), 1133, 3, 580);
        if (iM6456 == 1 || C0015.m3436(str3)) {
            JSONObject jSONObject = new JSONObject();
            C0037.m6360(jSONObject, strM6779, 0);
            C0047.m7743(jSONObject, strM3332, str3);
            if (strM2827 != null) {
                C0047.m7743(jSONObject, strM8007, strM2827);
            }
            return C0004.m1539(jSONObject);
        }
        boolean zM8953 = C0057.m8953(str4);
        String strM7151 = C0042.m7151(m476(), 1136, 4, 1901);
        if (!zM8953) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                C0047.m7743(jSONObject2, C0045.m7657(m476(), 1140, 4, 992), str4);
                C0047.m7743(jSONObject2, C0013.m3106(m476(), 1144, 4, 2144), str3);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0030.m5379(this));
                C0018.m3933(sb, C0009.m2037(m476(), 1148, 26, 2208));
                String strM2054 = C0009.m2054(new JSONObject(C0019.m4074(this, C0047.m7763(sb), jSONObject2)), C0012.m2973(m476(), 1174, 4, 2061), strM1840);
                if (C0043.m7277(strM2054, strM7151)) {
                    JSONObject jSONObject3 = new JSONObject();
                    C0037.m6360(jSONObject3, strM6779, 0);
                    C0047.m7743(jSONObject3, strM3332, strM2054);
                    if (strM2827 != null) {
                        C0047.m7743(jSONObject3, strM8007, strM2827);
                    }
                    return C0004.m1539(jSONObject3);
                }
            } catch (Exception e2) {
                C0043.m7366(e2, new StringBuilder(C0055.m8814(m476(), 1178, 22, 2857)));
            }
        }
        if (C0043.m7277(str5, strM7151)) {
            try {
                JSONObject jSONObject4 = new JSONObject(C0032.m5769(C0050.m8125(str5, str3), C0030.m5330(this)));
                String strM20542 = C0009.m2054(jSONObject4, strM3332, strM1840);
                if (C0043.m7277(strM20542, strM7151)) {
                    JSONObject jSONObject5 = new JSONObject();
                    C0037.m6360(jSONObject5, strM6779, 0);
                    C0047.m7743(jSONObject5, strM3332, strM20542);
                    String strM20543 = C0009.m2054(jSONObject4, C0039.m6551(m476(), 1200, 2, 564), C0009.m2054(jSONObject4, strM8477, strM1840));
                    if (!C0057.m8953(strM20543)) {
                        JSONObject jSONObject6 = new JSONObject();
                        C0047.m7743(jSONObject6, strM8477, strM20543);
                        C0047.m7743(jSONObject5, C0062.m9389(m476(), 1202, 6, 2664), C0004.m1539(jSONObject6));
                    }
                    if (strM2827 != null) {
                        C0047.m7743(jSONObject5, strM8007, strM2827);
                    }
                    return C0004.m1539(jSONObject5);
                }
            } catch (Exception e3) {
                C0043.m7366(e3, new StringBuilder(C0057.m8978(m476(), 1208, 19, 678)));
            }
        }
        JSONObject jSONObject7 = new JSONObject();
        C0037.m6360(jSONObject7, strM6779, 1);
        C0047.m7743(jSONObject7, strM3332, str3);
        if (strM2827 != null) {
            C0047.m7743(jSONObject7, strM8007, strM2827);
        }
        return C0004.m1539(jSONObject7);
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArrayM1964;
        JSONObject jSONObject = new JSONObject();
        C0047.m7743(jSONObject, C0051.m8259(m476(), 1227, 7, 611), str);
        C0037.m6360(jSONObject, C0033.m5852(m476(), 1234, 7, 2561), 1);
        C0037.m6360(jSONObject, C0055.m8814(m476(), 1241, 8, 1202), 40);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0030.m5379(this));
        C0018.m3933(sb, C0064.m9599(m476(), 1249, 20, 2540));
        JSONObject jSONObjectM7123 = C0042.m7123(new JSONObject(C0041.m6777(this, C0047.m7763(sb), jSONObject)), C0036.m6188(m476(), 1269, 4, 933));
        JSONArray jSONArray = new JSONArray();
        String strM5708 = C0032.m5708(m476(), 1273, 4, 811);
        if (jSONObjectM7123 != null && (jSONArrayM1964 = C0008.m1964(jSONObjectM7123, strM5708)) != null) {
            for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
                C0044.m7459(jSONArray, C0016.m3567(C0018.m3923(jSONArrayM1964, i)));
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        C0047.m7743(jSONObject2, strM5708, jSONArray);
        return C0004.m1539(jSONObject2);
    }
}