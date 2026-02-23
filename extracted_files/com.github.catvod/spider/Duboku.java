package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
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
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
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
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class Duboku extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f19short = {2907, 2134, 1044, 831, 533, 532, 518, 621, 632, 1521, 1730, 580, 520, 530, 540, 533, 582, 2243, 2193, 2186, 2190, 2176, 2187, 2264, 2812, 2729, 2729, 2739, 2750, 2791, 2165, 2166, 2167, 2160, 2161, 2162, 2163, 2172, 2173, 2174, 2175, 2168, 2169, 2170, 2171, 2148, 2149, 2150, 2151, 2144, 2145, 2146, 2147, 2156, 2157, 2158, 2133, 2134, 2135, 2128, 2129, 2130, 2131, 2140, 2141, 2142, 2143, 2136, 2137, 2138, 2139, 2116, 2117, 2118, 2119, 2112, 2113, 2114, 2115, 2124, 2125, 2126, 2084, 2085, 2086, 2087, 2080, 2081, 2082, 2083, 2092, 2093, 2738, 2691, 2693, 2699, 2700, 2691, 2710, 2699, 2701, 2700, 2734, 2699, 2705, 2710, 1251, 1264, 1255, 1251, 1816, 1796, 1817, 1823, 26185, -27061, 2051, 2060, 2049, 2067, 2067, 1789, 1776, 1791, 1782, 675, 682, 699, 699, 682, 701, 2497, 2513, 2515, 2502, 2893, 2656, 2684, 2680, 2667, 933, 953, 953, 957, 958, 1015, 994, 994, 940, 957, 932, 995, 937, 943, 930, 934, 952, 953, 955, 995, 942, 930, 928, 994, 955, 930, 937, 958, 933, 930, 954, 994, 1933, 1295, 1334, 1341, 1301, 1328, 1322, 1325, 1187, 1164, 1152, 1160, 2774, 2791, 2779, 2806, 2766, 2755, 2798, 2183, 2237, 2202, 2231, 1277, 1224, 1230, 1355, 1382, 1391, 1402, 2938, 2909, 2888, 2907, 2909, 2924, 2887, 2893, 774, 799, 818, 2273, 2244, 2296, 2261, 2195, 2216, 2223, 2226, 2228, 2192, 2209, 2215, 2213, 2127, 758, 746, 746, 750, 749, 676, 689, 689, 767, 750, 759, 688, 762, 764, 753, 757, 747, 746, 744, 688, 765, 753, 755, 2287, 2240, 2252, 2244, 2346, 2326, 2331, 2307, 2326, 2323, 2313, 2318, 2854, 2835, 2826, 2832, 2828, 2823, 2822, 2861, 2818, 2830, 2822, 2140, 2115, 2158, 929, 1170, 2397, 2407, 2368, 2413, -28991, 22275, -1505, 696, 651, 670, 643, 644, 653, 3070, 3017, 3008, 3017, 3021, 3039, 3017, 3061, 3017, 3021, 3038, 1506, 1493, 1495, 1497, 1503, 1502, 891, 857, 846, 853, 840, 3139, 2778, 2807, 2796, 2811, 2813, 2794, 2801, 2796, 1756, 1789, 1771, 1787, 1770, 1777, 1768, 1772, 1777, 1783, 1782, 29932, 25261, 22675, 922, 3042, 3008, 3019, 3031, 3008, 2826, 2874, 2876, 2871, 2872, 2859, 2864, 2870, 645, 680, 679, 686, 700, 680, 686, 684, 23167, -25601, 1269, 1226, 1230, 1235, 1237, 1236, 1270, 1235, 1225, 1230, 1068, 1027, 1030, 1054, 1039, 1048, 1062, 1027, 1049, 1054, 2822, -30520, 31227, 21873, 344, 30487, -29807, 1058, 30979, 21319, 2172, 20790, 27829, 2893, 2897, 2897, 2901, 2902, 2847, 2826, 2826, 2884, 2901, 2892, 2827, 2881, 2887, 2890, 2894, 2896, 2897, 2899, 2827, 2886, 2890, 2888, 2826, 2899, 2890, 2881, 2902, 2893, 2890, 2898, 2826, 2390, 2390, 2390, 2390, 2390, 2390, 2390, 2390, 2390, 2390, 2390, 2573, 2594, 2607, 2621, 2621, -30381, -30530, 32049, 22209, 25788, 22945, 21880, 17905, 24436, 28654, 20803, 21833, 21302, 24980, 2355, 2351, 2354, 2356, 3041, 3057, 3059, 3046, 1224, 1217, 1232, 1232, 1217, 1238, 2270, 2259, 2268, 2261, 3015, 3035, 3039, 3020, 3193, 3178, 3197, 3193, 1065, 1062, 1067, 1081, 1081, 975, 1008, 1012, 1001, 1007, 1006, 3054, 3058, 3058, 3062, 3061, 3004, 2985, 2985, 3047, 3062, 3055, 2984, 3042, 3044, 3049, 3053, 3059, 3058, 3056, 2984, 3045, 3049, 3051, 2985, 3054, 3049, 3051, 3043, 733, 740, 751, 711, 738, 760, 767, 1036, 1085, 1025, 1068, 273, 284, 305, 3172, 3147, 3143, 3151, 2149, 2143, 2168, 2133, 1070, 1051, 1053, 949, 915, 901, 914, 973, 929, 903, 901, 910, 916, 475, 505, 492, 511, 506, 506, 503, 441, 419, 440, 422, 438, 446, 449, 511, 504, 498, 505, 481, 485, 438, 472, 450, 438, 423, 422, 440, 422, 429, 438, 449, 511, 504, 416, 418, 429, 438, 494, 416, 418, 447, 1978, 1942, 1943, 1943, 1948, 1946, 1933, 1936, 1942, 1943, 533, 571, 571, 558, 627, 543, 562, 567, 552, 571, 1798, 1841, 1842, 1841, 1830, 1841, 1830, 1578, 1590, 1590, 1586, 1585, 1656, 1645, 1645, 1589, 1589, 1589, 1644, 1574, 1591, 1568, 1581, 1577, 1591, 1644, 1590, 1588, 1645, 2610, 2574, 2578, 2578, 2582, 2581, 2652, 2633, 2633, 2567, 2582, 2575, 2632, 2562, 2564, 2569, 2573, 2579, 2578, 2576, 2632, 2565, 2569, 2571, 1106, 1140, 1122, 1141, 1066, 1094, 1120, 1122, 1129, 1139, 1133, 1103, 1114, 1097, 1100, 1100, 1089, 1039, 1045, 1038, 1040, 1024, 1032, 1143, 1097, 1102, 1092, 1103, 1111, 1107, 1024, 1134, 1140, 1024, 1041, 1040, 1038, 1040, 1051, 1024, 1143, 1097, 1102, 1046, 1044, 1051, 1024, 1112, 1046, 1044, 1033, 1024, 1121, 1104, 1104, 1100, 1093, 1143, 1093, 1090, 1131, 1097, 1108, 1039, 1045, 1043, 1047, 1038, 1043, 1046, 1024, 1032, 1131, 1128, 1140, 1133, 1132, 1036, 1024, 1100, 1097, 1099, 1093, 1024, 1127, 1093, 1091, 1099, 1103, 1033, 1024, 1123, 1096, 1106, 1103, 1101, 1093, 1039, 1041, 1042, 1041, 1038, 1040, 1038, 1040, 1038, 1040, 1024, 1139, 1089, 1094, 1089, 1106, 1097, 1039, 1045, 1043, 1047, 1038, 1043, 1046, 2128, 2162, 2162, 2164, 2145, 2149, 2108, 2132, 2175, 2162, 2174, 2165, 2168, 2175, 2166, 2070, 2059, 2072, 2049, 2141, 2129, 2069, 2068, 2071, 2077, 2064, 2053, 2068, 3029, 3016, 3027, 3037, 3027, 3028, 433, 429, 429, 425, 426, 483, 502, 502, 430, 503, 445, 428, 443, 438, 434, 428, 503, 432, 438, 820, 803, 800, 803, 820, 803, 820, 1827, 1855, 1855, 1851, 1848, 1905, 1892, 1892, 1852, 1893, 1839, 1854, 1833, 1828, 1824, 1854, 1893, 1826, 1828, 1892, 528, 530, 521, 527, 530, 521, 532, 537, 2612, 2684, 2672, 2669, 2657, 2600, 815, 814, 771, 2191, 2352, 2348, 2348, 2344, 2347, 2402, 2423, 2423, 2361, 2344, 2353, 2422, 2364, 2362, 2359, 2355, 2349, 2348, 2350, 2422, 2363, 2359, 2357, 2423, 2350, 2359, 2364, 2347, 2365, 2361, 2346, 2363, 2352, 1206, 1255, 1268, 1197, 1290, 1291, 1305, 1394, 1383, 1598, 1551, 1587, 1566, 3086, 3075, 3118, 2618, 2581, 2585, 2577, 929, 923, 956, 913, 2715, 2734, 2728, 2647, 2677, 2658, 2681, 2660, 2718, 2733, 2744, 2725, 2722, 2731, 2378};
    public HashMap a;

    public static String b(String str) {
        String strM1840 = C0007.m1840();
        if (str != null && !C0057.m8953(str)) {
            String strM3446 = C0015.m3446(C0015.m3446(str, C0061.m9361(m121(), 0, 1, 2940), strM1840), C0032.m5708(m121(), 1, 1, 2164), strM1840);
            if (C0057.m8953(strM3446)) {
                return strM1840;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < C0004.m1584(strM3446)) {
                int i2 = i + 10;
                C0056.m8896(sb, C0030.m5371(new StringBuilder(C0054.m8636(strM3446, i, C0051.m8186(i2, C0004.m1584(strM3446))))));
                i = i2;
            }
            try {
                return new String(C0034.m5997(C0015.m3446(C0047.m7763(sb), C0020.m4199(m121(), 2, 1, 1082), C0023.m4536(m121(), 3, 1, 770)), 0), C0031.m5565(m121(), 4, 5, 576));
            } catch (Exception e) {
                m115(e);
            }
        }
        return strM1840;
    }

    public static String c(String str) {
        int iM4817 = C0025.m4817(new Random(), 800000001);
        int i = 100000000 + iM4817;
        int i2 = 900000000 - iM4817;
        String strM5627 = C0031.m5627(C0009.m2099() / 1000);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0054.m8599(i));
        C0018.m3933(sb, C0054.m8599(i2));
        String strM7763 = C0047.m7763(sb);
        StringBuilder sb2 = new StringBuilder();
        int iM8186 = C0051.m8186(C0004.m1584(strM7763), C0004.m1584(strM5627));
        for (int i3 = 0; i3 < iM8186; i3++) {
            C0062.m9399(sb2, C0007.m1823(strM7763, i3));
            C0062.m9399(sb2, C0007.m1823(strM5627, i3));
        }
        C0018.m3933(sb2, C0056.m8890(strM7763, iM8186));
        C0018.m3933(sb2, C0056.m8890(strM5627, iM8186));
        String strM3446 = C0015.m3446(C0052.m8364(C0050.m8115(C0047.m7763(sb2)), 2), C0020.m4199(m121(), 9, 1, 1484), C0054.m8574(m121(), 10, 1, 1772));
        String strM8419 = C0053.m8419(60);
        String strM84192 = C0053.m8419(38);
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, str);
        C0018.m3933(sb3, C0049.m8007(m121(), 11, 6, 635));
        C0018.m3933(sb3, strM8419);
        C0018.m3933(sb3, C0035.m6131(m121(), 17, 7, 2277));
        C0018.m3933(sb3, strM84192);
        return C0028.m5188(sb3, C0013.m3106(m121(), 24, 6, 2778), strM3446);
    }

    public static String d(int i) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            C0062.m9399(sb, C0007.m1823(C0062.m9389(m121(), 30, 62, 2068), C0025.m4817(random, 62)));
        }
        return C0047.m7763(sb);
    }

    /* renamed from: ۟۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m111(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((JsonElement) obj).isJsonArray();
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static String m112(Object obj, Object obj2, Object obj3) {
        if (C0056.m8886() <= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۧۤۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m113(Object obj) {
        if (C0041.m6823() <= 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static JsonObject m114(Object obj) {
        if (C0043.m7332() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m115(Object obj) {
        if (C0026.m4977() < 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۠۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m116(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۠ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m117(Object obj, Object obj2) {
        if (C0056.m8886() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m118(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۡۡۦ, reason: not valid java name and contains not printable characters */
    public static JsonArray m119(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((JsonElement) obj).getAsJsonArray();
        }
        return null;
    }

    /* renamed from: ۣۣۦۡ, reason: not valid java name and contains not printable characters */
    public static JsonArray m120(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m121() {
        if (C0054.m8557() <= 0) {
            return f19short;
        }
        return null;
    }

    /* renamed from: ۣۤۡۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m122(Object obj, int i) {
        if (C0027.m5017() >= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۤۧۢۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m123(Object obj) {
        if (C0004.m1557() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۨۧۢۦ, reason: not valid java name and contains not printable characters */
    public static int m124(Object obj) {
        if (C0049.m8038() < 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r68, java.lang.String r69, boolean r70, java.util.HashMap<java.lang.String, java.lang.String> r71) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Duboku.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        String strM112;
        String str = (String) C0048.m7915(list, 0);
        StringBuilder sb = new StringBuilder(C0057.m8978(m121(), 227, 23, 670));
        C0018.m3933(sb, str);
        JsonObject jsonObjectM114 = m114(C0032.m5769(C0040.m6649(C0047.m7763(sb)), C0029.m5241(this)));
        m mVar = new m();
        C0011.m2828(mVar, str);
        String strM8131 = C0050.m8131(m121(), 250, 4, 2209);
        String strM1840 = C0007.m1840();
        C0005.m1628(mVar, m112(jsonObjectM114, strM8131, strM1840));
        ArrayList arrayList = new ArrayList();
        String strM7902 = C0048.m7902(m121(), 254, 8, 2426);
        if (m117(jsonObjectM114, strM7902)) {
            JsonArray jsonArrayM120 = m120(jsonObjectM114, strM7902);
            for (int i = 0; i < m124(jsonArrayM120); i++) {
                JsonObject jsonObjectM123 = m123(m122(jsonArrayM120, i));
                String strM1122 = m112(jsonObjectM123, C0048.m7902(m121(), 262, 11, 2915), strM1840);
                String strM6175 = C0036.m6175(m112(jsonObjectM123, C0012.m2973(m121(), 273, 3, 2058), strM1840));
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, strM1122);
                C0018.m3933(sb2, C0064.m9599(m121(), 276, 1, 901));
                C0018.m3933(sb2, strM6175);
                String strM9352 = C0060.m9352(m121(), 277, 1, 1260);
                C0018.m3933(sb2, strM9352);
                C0018.m3933(sb2, m112(jsonObjectM114, strM8131, strM1840));
                C0018.m3933(sb2, strM9352);
                C0018.m3933(sb2, strM1122);
                C0004.m1532(arrayList, C0047.m7763(sb2));
            }
        }
        C0026.m4947(mVar, C0036.m6175(m112(jsonObjectM114, C0024.m4740(m121(), 278, 4, 2313), strM1840)));
        StringBuilder sb3 = new StringBuilder(C0034.m6001(m121(), 282, 3, 1285));
        C0018.m3933(sb3, m112(jsonObjectM114, C0001.m1189(m121(), 285, 6, 746), strM1840));
        C0019.m4073(mVar, C0047.m7763(sb3));
        C0022.m4432(mVar, m112(jsonObjectM114, C0051.m8259(m121(), 291, 11, 2988), strM1840));
        C0017.m3671(mVar, m112(jsonObjectM114, C0023.m4536(m121(), 302, 6, 1456), strM1840));
        String strM3646 = C0017.m3646(m121(), 308, 5, 826);
        boolean zM117 = m117(jsonObjectM114, strM3646);
        String strM1970 = C0008.m1970(m121(), 313, 1, 3183);
        if (!zM117) {
            strM112 = strM1840;
        } else if (m111(m118(jsonObjectM114, strM3646))) {
            JsonArray jsonArrayM1202 = m120(jsonObjectM114, strM3646);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < m124(jsonArrayM1202); i2++) {
                C0004.m1532(arrayList2, m116(m122(jsonArrayM1202, i2)));
            }
            strM112 = C0036.m6194(strM1970, arrayList2);
        } else {
            strM112 = m112(jsonObjectM114, strM3646, strM1840);
        }
        C0058.m9152(mVar, strM112);
        C0058.m9159(mVar, m112(jsonObjectM114, C0000.m1077(m121(), 314, 8, 2718), strM1840));
        C0027.m5000(mVar, m112(jsonObjectM114, C0052.m8337(m121(), 322, 11, 1688), strM1840));
        C0054.m8596(mVar, C0031.m5565(m121(), 333, 3, 1536));
        C0044.m7449(mVar, C0036.m6194(C0016.m3525(m121(), 336, 1, 953), arrayList));
        StringBuilder sb4 = new StringBuilder();
        C0018.m3933(sb4, m112(jsonObjectM114, C0048.m7902(m121(), 337, 5, 2981), strM1840));
        C0018.m3933(sb4, strM1970);
        C0018.m3933(sb4, m112(jsonObjectM114, C0033.m5852(m121(), 342, 8, 2905), strM1840));
        C0018.m3933(sb4, strM1970);
        C0018.m3933(sb4, m112(jsonObjectM114, C0026.m4951(m121(), 350, 8, 713), strM1840));
        C0058.m9085(mVar, C0047.m7763(sb4));
        return C0053.m8428(mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r72) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Duboku.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        JsonObject jsonObjectM114 = m114(C0032.m5769(C0040.m6649(C0003.m1398(m121(), 492, 28, 2950)), C0029.m5241(this)));
        ArrayList arrayList = new ArrayList();
        if (m111(jsonObjectM114)) {
            JsonArray jsonArrayM119 = m119(jsonObjectM114);
            for (int i = 0; i < m124(jsonArrayM119); i++) {
                JsonObject jsonObjectM123 = m123(m122(jsonArrayM119, i));
                String strM7290 = C0043.m7290(m121(), 520, 7, 651);
                if (m117(jsonObjectM123, strM7290)) {
                    JsonArray jsonArrayM120 = m120(jsonObjectM123, strM7290);
                    for (int i2 = 0; i2 < m124(jsonArrayM120); i2++) {
                        JsonObject jsonObjectM1232 = m123(m122(jsonArrayM120, i2));
                        String strM8574 = C0054.m8574(m121(), 527, 4, 1096);
                        String strM1840 = C0007.m1840();
                        C0004.m1532(arrayList, new m(C0036.m6175(m112(jsonObjectM1232, C0044.m7509(m121(), 531, 3, 341), m112(jsonObjectM1232, strM8574, strM1840))), m112(jsonObjectM1232, C0045.m7657(m121(), 534, 4, 3114), strM1840), C0036.m6175(m112(jsonObjectM1232, C0063.m9585(m121(), 538, 4, 2097), strM1840)), m112(jsonObjectM1232, C0024.m4740(m121(), 542, 3, 1146), strM1840)));
                    }
                }
            }
        }
        return C0047.m7783(arrayList);
    }

    public void init(Context context) {
        HashMap map = new HashMap();
        this.a = map;
        C0053.m8424(map, C0004.m1549(m121(), 545, 10, 992), C0061.m9361(m121(), 555, 41, 406));
        C0053.m8424(C0029.m5241(this), C0015.m3484(m121(), 596, 10, 2041), C0010.m2300(m121(), 606, 10, 606));
        C0053.m8424(C0029.m5241(this), C0004.m1549(m121(), 616, 7, 1876), C0018.m3917(m121(), 623, 22, 1602));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrM4752 = C0024.m4752(str2, C0002.m1305(m121(), 645, 1, 2636));
        String str3 = strArrM4752[0];
        String strM2827 = C0011.m2827(str3, strArrM4752[1], strArrM4752[2]);
        StringBuilder sb = new StringBuilder(C0039.m6551(m121(), 646, 23, 2662));
        C0018.m3933(sb, str3);
        JsonObject jsonObjectM114 = m114(C0032.m5769(C0040.m6649(C0047.m7763(sb)), C0029.m5241(this)));
        HashMap mapM4127 = C0019.m4127(C0020.m4199(m121(), 669, 10, 1031), C0039.m6551(m121(), 679, 111, 1056), C0053.m8477(m121(), 790, 15, 2065), C0037.m6307(m121(), 805, 13, 2161));
        C0053.m8424(mapM4127, C0011.m2805(m121(), 818, 6, 3002), C0060.m9352(m121(), 824, 19, 473));
        C0053.m8424(mapM4127, C0035.m6131(m121(), 843, 7, 838), C0034.m6001(m121(), 850, 20, 1867));
        C0053.m8424(mapM4127, C0055.m8814(m121(), 870, 8, 608), C0037.m6307(m121(), 878, 6, 2625));
        String strM6175 = C0036.m6175(m112(jsonObjectM114, C0043.m7290(m121(), 884, 3, 871), C0007.m1840()));
        g gVar = new g();
        C0017.m3667(gVar, strM6175);
        C0002.m1282(gVar, strM2827);
        C0057.m9029(gVar, mapM4127);
        C0006.m1720(gVar, 0);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0045.m7610(this, str, z, C0039.m6551(m121(), 887, 1, 2238));
    }

    public String searchContent(String str, boolean z, String str2) {
        StringBuilder sbM3016 = C0012.m3016(C0040.m6649(C0025.m4795(m121(), 888, 33, 2392)), C0022.m4403(m121(), 921, 4, 1168));
        C0018.m3933(sbM3016, C0051.m8202(str, C0060.m9352(m121(), 925, 5, 1375)));
        JsonElement jsonElementM113 = m113(C0032.m5769(C0047.m7763(sbM3016), C0029.m5241(this)));
        ArrayList arrayList = new ArrayList();
        if (jsonElementM113 != null && m111(jsonElementM113)) {
            JsonArray jsonArrayM119 = m119(jsonElementM113);
            for (int i = 0; i < m124(jsonArrayM119); i++) {
                JsonObject jsonObjectM123 = m123(m122(jsonArrayM119, i));
                String strM4951 = C0026.m4951(m121(), 930, 4, 1658);
                String strM1840 = C0007.m1840();
                String strM6175 = C0036.m6175(m112(jsonObjectM123, C0062.m9389(m121(), 934, 3, 3146), m112(jsonObjectM123, strM4951, strM1840)));
                String strM112 = m112(jsonObjectM123, C0003.m1398(m121(), 937, 4, 2676), strM1840);
                String strM61752 = C0036.m6175(m112(jsonObjectM123, C0039.m6551(m121(), 941, 4, 1013), strM1840));
                String strM1122 = m112(jsonObjectM123, C0019.m4107(m121(), 945, 3, 2767), strM1840);
                String strM1123 = m112(jsonObjectM123, C0060.m9352(m121(), 948, 5, 2582), strM1840);
                String strM1124 = m112(jsonObjectM123, C0001.m1189(m121(), 953, 6, 2764), strM1840);
                m mVar = new m(strM6175, strM112, strM61752, strM1122);
                C0058.m9152(mVar, strM1123);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, strM1122);
                C0018.m3933(sb, C0057.m8978(m121(), 959, 1, 2410));
                C0018.m3933(sb, strM1124);
                C0019.m4073(mVar, C0047.m7763(sb));
                C0004.m1532(arrayList, mVar);
            }
        }
        return C0047.m7783(arrayList);
    }
}