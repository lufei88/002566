package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
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
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Cupfox extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f12short = {2530, 2558, 2558, 2554, 2553, 2480, 2469, 2469, 2557, 2557, 2557, 2468, 2537, 2559, 2554, 2540, 2533, 2546, 2468, 2539, 2531, 2027, 1968, 1981, 1972, 1953, 2027, 2028, 1944, 1952, 2031, 2029, 1944, 2026, 1964, 1968, 1961, 1960, 948, 994, 997, 946, 2339, 2347, 2331, 2308, 2372, 2342, 2343, 2370, 2353, 2371, 2322, 2378, 2328, 2338, 2359, 2360, 2345, 2304, 2329, 2362, 2354, 2336, 2334, 2364, 2326, 2313, 2315, 2346, 2356, 2375, 2352, 2363, 2332, 2374, 2361, 2314, 2325, 2324, 2369, 2321, 2379, 2357, 2367, 2307, 2358, 2309, 2337, 2305, 2368, 2340, 2311, 2341, 2333, 2335, 2306, 2366, 2330, 2327, 2310, 2373, 2320, 2365, 2076, 2119, 2122, 2115, 2134, 2076, 748, 1944, 2014, 1986, 2011, 2010, 555, 525, 539, 524, 595, 575, 537, 539, 528, 522, 2494, 2460, 2441, 2458, 2463, 2463, 2450, 2524, 2502, 2525, 2499, 2515, 2523, 2468, 2458, 2461, 2455, 2460, 2436, 2432, 2515, 2493, 2471, 2515, 2498, 2499, 2525, 2499, 2504, 2515, 2468, 2458, 2461, 2501, 2503, 2504, 2515, 2443, 2501, 2503, 2522, 2515, 2482, 2435, 2435, 2463, 2454, 2468, 2454, 2449, 2488, 2458, 2439, 2524, 2502, 2496, 2500, 2525, 2496, 2501, 2515, 2523, 2488, 2491, 2471, 2494, 2495, 2527, 2515, 2463, 2458, 2456, 2454, 2515, 2484, 2454, 2448, 2456, 2460, 2522, 2515, 2480, 2459, 2433, 2460, 2462, 2454, 2524, 2498, 2497, 2497, 2525, 2499, 2525, 2499, 2525, 2499, 2515, 2464, 2450, 2453, 2450, 2433, 2458, 2524, 2502, 2496, 2500, 2525, 2496, 2501, 3013, 1510, 1489, 1490, 1489, 1478, 1489, 1478, 2376, 2321, 2318, 2381, 2383, 2390, 2377, 2373, 2317, 2388, 2377, 2388, 2380, 2373, 2285, 2227, 2220, 2224, 2231, 2214, 2225, 2275, 2218, 2222, 2212, 2594, 2595, 2610, 3287, 3275, 3275, 3279, 1040, 1101, 1099, 1107, 1107, 1119, 1100, 1095, 1040, 1114, 1115, 1098, 1119, 1111, 1106, 1101, 1130, 1094, 1098, 657, 730, 732, 715, 720, 728, 728, 494, 435, 419, 434, 431, 428, 428, 493, 419, 431, 430, 436, 421, 430, 436, 480, 417, 915, 939, 948, 1019, 946, 3198, 3129, 3134, 3126, 3135, 3197, 3124, 3121, 3108, 3121, 22382, 25478, 2268, 27533, 20673, 2250, 2196, 2184, 2181, 2205, 2235, 2199, 2187, 2193, 2198, 2183, 2177, 2235, 2192, 2181, 2182, 2244, 2250, 2199, 2195, 2189, 2196, 2177, 2198, 2249, 2199, 2184, 2189, 2176, 2177, 2151, 2105, 2085, 2088, 2096, 2070, 2085, 2080, 2106, 2109, 2070, 2091, 2086, 2097, 897, 972, 960, 961, 987, 970, 961, 987, 1008, 991, 963, 974, 982, 963, 966, 988, 987, 911, 963, 966, 911, 974, 1122, 1144, 1135, 1132, 545, 1353, 1290, 1288, 1297, 1294, 1282, 1354, 1291, 1294, 1300, 1299, 1354, 1294, 1299, 1282, 1290, 1274, 1772, 1678, 1699, 1720, 1723, 3115, 3176, 3178, 3187, 3180, 3168, 3112, 3180, 3185, 3168, 3176, 3112, 3179, 3178, 3185, 3168, 1251, 1184, 1186, 1211, 1188, 1192, 1248, 1188, 1209, 1192, 1184, 1248, 1214, 1198, 1186, 1215, 1192, 1664, 1693, 1664, 1688, 1681, 911, 917, 898, 897, 1476, 1473, 1492, 1473, 1421, 1487, 1490, 1481, 1479, 1481, 1486, 1473, 1484, 2633, 2645, 2645, 2641, 2973, 2962, 2949, 3037, 2961, 2974, 3038, 2970, 2951, 2966, 2974, 3038, 2975, 2970, 2944, 2951, 3027, 2962, 1079, 1069, 1082, 1081, 2395, 2328, 2330, 2327, 2332, 2329, 2320, 2392, 2328, 2324, 2332, 2331, 2389, 2395, 2309, 2324, 2331, 2320, 2329, 1852, 1894, 1907, 1904, 1855, 1905, 1917, 1916, 1894, 1911, 1916, 1894, 1783, 1716, 1718, 1711, 1712, 1724, 1780, 1717, 1712, 1706, 1709, 1780, 1712, 1709, 1724, 1716, 1710, 2802, 2704, 2749, 2726, 2725, 2348, 2415, 2413, 2420, 2411, 2407, 2351, 2411, 2422, 2407, 2415, 2351, 2412, 2413, 2422, 2407, 578, 513, 515, 538, 517, 521, 577, 517, 536, 521, 513, 577, 543, 527, 515, 542, 521, 735, 706, 735, 711, 718, 1865, 1875, 1860, 1863, 1259, 1262, 1275, 1262, 1186, 1248, 1277, 1254, 1256, 1254, 1249, 1262, 1251, 890, 870, 870, 866, 2161, 2166, 2152, 2153, 2155, 2144, 2145, 2085, 2080, 2101, 2080, 1503, 1491, 1496, 1497, 879, 845, 856, 843, 846, 846, 835, 781, 791, 780, 786, 770, 778, 885, 843, 844, 838, 845, 853, 849, 770, 876, 886, 770, 787, 786, 780, 786, 793, 770, 885, 843, 844, 788, 790, 793, 770, 858, 788, 790, 779, 770, 867, 850, 850, 846, 839, 885, 839, 832, 873, 843, 854, 781, 791, 785, 789, 780, 785, 788, 770, 778, 873, 874, 886, 879, 878, 782, 770, 846, 843, 841, 839, 770, 869, 839, 833, 841, 845, 779, 770, 865, 842, 848, 845, 847, 839, 781, 787, 784, 784, 780, 786, 780, 786, 780, 786, 770, 881, 835, 836, 835, 848, 843, 781, 791, 785, 789, 780, 785, 788, 2495, 2457, 2447, 2456, 2503, 2475, 2445, 2447, 2436, 2462, 631, 553, 565, 568, 544, 572, 555, 628, 561, 572, 560, 574, 561, 557, 633, 554, 570, 555, 560, 553, 557, 384, 391, 409, 1666, 1694, 1683, 1675, 1687, 1664, 1709, 1683, 1683, 1683, 1683, 1657, 1656, 1642, 1537, 1556, 1044, 1059, 1056, 1059, 1076, 1059, 1076, 1368, 1297, 1304, 1295, 1287, 1307, 1302, 1294, 1368, 1306, 1282, 1310, 1287, 1307, 1302, 1294, 1298, 1285, 1369, 1287, 1311, 1287, 1352, 1281, 1310, 1299, 1354, 2774, 2795, 2800, 2814, 2800, 2807, 584, 573, 578, 629, 609, 613, 629, 611, 612, 629, 628, 573, 583, 633, 612, 632, 1687, 1666, 1667, 1671, 1723, 1723, 1727, 1693, 1706, 1726, 1722, 1706, 1724, 1723, 1343, 1312, 1325, 2297, 2224, 2233, 2222, 2214, 2234, 2231, 2223, 2297, 2231, 2214, 2239, 2296, 2214, 2238, 2214, 2974, 1177, 2209, 2301, 2283, 2287, 2300, 2285, 2278, 2209, 613, 612, 630, 541, 520, 3262, 3262, 3262, 3262, 3262, 3262, 3262, 3262, 3262, 3262, 1703, 1703, 1703, 1700, 1762, 1790, 1767, 1766, 2331, 2371, 2394, 2385, 2328, 2374, 2384, 2388, 2375, 2390, 2397, 2328, 2393, 2396, 2374, 2369, 2325, 2331, 2391, 2394, 2381, 1823, 1872, 1821, 1809, 1800, 1819, 1804, 1875, 1810, 1815, 1808, 1813, 833, 803, 782, 789, 790, 1294, 1357, 1359, 1366, 1353, 1349, 1293, 1364, 1353, 1364, 1356, 1349, 3309, 3246, 3244, 3253, 3242, 3238, 3310, 3242, 3255, 3238, 3246, 3310, 3245, 3244, 3255, 3238, 2346, 2409, 2401, 2416, 2405, 2346, 2403, 2401, 2416, 2411, 
    2420, 777, 787, 772, 775, 2771, 2774, 2755, 2774, 2714, 2776, 2757, 2782, 2768, 2782, 2777, 2774, 2779, 2359, 2347, 2347, 2351};
    public String a = C0050.m8131(m94(), 0, 21, 2442);
    public final Pattern b = C0005.m1602(C0022.m4403(m94(), 21, 17, 1988));

    class Decode1 {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f13short = {3090, 1431, 1414, 1424, 1431};

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            r3 = com.github.catvod.spider.merge.Z.C0038.m6456((java.lang.String) com.github.catvod.spider.merge.b0.C0045.m7624(r5));
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(com.google.gson.JsonObject r59, com.google.gson.JsonObject r60, java.lang.String r61) {
            /*
                r10 = r61
                r9 = r60
                r8 = r59
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            Lc:
                int r2 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1584(r10)
                if (r1 >= r2) goto L74
                char r2 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1823(r10, r1)
                boolean r3 = com.github.catvod.spider.merge.i0.C0055.m8799(r2)
                if (r3 == 0) goto L6e
                java.lang.String r3 = com.github.catvod.spider.merge.i0.C0055.m8763(r2)
                java.util.Set r4 = m99(r8)
                java.util.Iterator r4 = com.github.catvod.spider.merge.S0.C0029.m5199(r4)
            L28:
                boolean r5 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2962(r4)
                r6 = -1
                if (r5 == 0) goto L51
                java.lang.Object r5 = com.github.catvod.spider.merge.d0.C0048.m7949(r4)
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r7 = com.github.catvod.spider.merge.Z.C0039.m6540(r5)
                com.google.gson.JsonElement r7 = (com.google.gson.JsonElement) r7
                java.lang.String r7 = m100(r7)
                boolean r7 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1815(r7, r3)
                if (r7 == 0) goto L28
                java.lang.Object r3 = com.github.catvod.spider.merge.b0.C0045.m7624(r5)     // Catch: java.lang.NumberFormatException -> L50
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L50
                int r3 = com.github.catvod.spider.merge.Z.C0038.m6456(r3)     // Catch: java.lang.NumberFormatException -> L50
                goto L52
            L50:
            L51:
                r3 = -1
            L52:
                if (r3 == r6) goto L6e
                java.lang.String r4 = com.github.catvod.spider.merge.h.C0054.m8599(r3)
                boolean r4 = m102(r9, r4)
                if (r4 == 0) goto L6e
                java.lang.String r2 = com.github.catvod.spider.merge.h.C0054.m8599(r3)
                com.google.gson.JsonElement r2 = m98(r9, r2)
                java.lang.String r2 = m100(r2)
                com.github.catvod.spider.merge.F0.C0018.m3933(r0, r2)
                goto L71
            L6e:
                com.github.catvod.spider.merge.v.C0062.m9399(r0, r2)
            L71:
                int r1 = r1 + 1
                goto Lc
            L74:
                java.lang.String r8 = com.github.catvod.spider.merge.d.C0047.m7763(r0)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Cupfox.Decode1.a(com.google.gson.JsonObject, com.google.gson.JsonObject, java.lang.String):java.lang.String");
        }

        public static String b(String str) {
            String strM1840 = C0007.m1840();
            String strM7290 = C0043.m7290(m96(), 0, 1, 3133);
            try {
                String strM9162 = C0058.m9162(str);
                String strM4413 = C0022.m4413(C0005.m1645(m96(), 1, 4, 1507));
                int iM1584 = C0004.m1584(strM4413);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < C0004.m1584(strM9162); i++) {
                    C0062.m9399(sb, (char) (C0007.m1823(strM4413, i % iM1584) ^ C0007.m1823(strM9162, i)));
                }
                String[] strArrM4752 = C0024.m4752(C0058.m9162(C0047.m7763(sb)), strM7290);
                if (strArrM4752.length < 3) {
                    return strM1840;
                }
                String str2 = strArrM4752[0];
                String str3 = strArrM4752[1];
                CharSequence[] charSequenceArr = (CharSequence[]) C0024.m4732(strArrM4752, 2, strArrM4752.length);
                StringBuilder sb2 = new StringBuilder();
                if (charSequenceArr.length > 0) {
                    C0056.m8896(sb2, charSequenceArr[0]);
                    for (int i2 = 1; i2 < charSequenceArr.length; i2++) {
                        C0056.m8896(sb2, strM7290);
                        C0056.m8896(sb2, charSequenceArr[i2]);
                    }
                }
                return m101(m97(C0058.m9162(str3)), m97(C0058.m9162(str2)), C0058.m9162(C0047.m7763(sb2)));
            } catch (Exception e) {
                C0049.m7975(e);
                return strM1840;
            }
        }

        /* renamed from: ۟۠ۥۣۡ, reason: not valid java name and contains not printable characters */
        public static short[] m96() {
            if (C0041.m6823() <= 0) {
                return f13short;
            }
            return null;
        }

        /* renamed from: ۟۠ۨۧۡ, reason: not valid java name and contains not printable characters */
        public static JsonObject m97(Object obj) {
            if (C0027.m5017() >= 0) {
                return AbstractC0308c.i((String) obj);
            }
            return null;
        }

        /* renamed from: ۣ۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
        public static JsonElement m98(Object obj, Object obj2) {
            if (C0051.m8216() <= 0) {
                return ((JsonObject) obj).get((String) obj2);
            }
            return null;
        }

        /* renamed from: ۟ۧۡۧۢ, reason: not valid java name and contains not printable characters */
        public static Set m99(Object obj) {
            if (C0008.m1975() > 0) {
                return ((JsonObject) obj).entrySet();
            }
            return null;
        }

        /* renamed from: ۦۡۦۤ, reason: contains not printable characters */
        public static String m100(Object obj) {
            if (C0013.m3167() > 0) {
                return ((JsonElement) obj).getAsString();
            }
            return null;
        }

        /* renamed from: ۦۥ۠ۦ, reason: contains not printable characters */
        public static String m101(Object obj, Object obj2, Object obj3) {
            if (C0059.m9257() <= 0) {
                return a((JsonObject) obj, (JsonObject) obj2, (String) obj3);
            }
            return null;
        }

        /* renamed from: ۧۦۦ۠, reason: not valid java name and contains not printable characters */
        public static boolean m102(Object obj, Object obj2) {
            if (C0064.m9659() <= 0) {
                return ((JsonObject) obj).has((String) obj2);
            }
            return false;
        }
    }

    public static String b(String str) {
        String strM1840 = C0007.m1840();
        return (str == null || C0057.m8953(str)) ? strM1840 : new String(C0007.m1882(C0015.m3446(str, C0060.m9352(m94(), 38, 4, 1007), strM1840)));
    }

    public static String c(String str) {
        if (str == null || C0057.m8953(str)) {
            return C0007.m1840();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < 62; i++) {
            String strM5565 = C0031.m5565(m94(), 42, 62, 2419);
            C0053.m8424(map, C0006.m1775(C0007.m1823(strM5565, i)), C0006.m1775(C0007.m1823(strM5565, (i + 59) % 62)));
        }
        String strM9162 = C0058.m9162(str);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 < C0004.m1584(strM9162); i2 += 3) {
            char cM1823 = C0007.m1823(strM9162, i2);
            Character ch = (Character) C0065.m9715(map, C0006.m1775(cM1823));
            if (ch != null) {
                cM1823 = C0011.m2779(ch);
            }
            C0062.m9399(sb, cM1823);
        }
        return C0047.m7763(sb);
    }

    /* renamed from: ۟۠ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m88(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m89(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m90(Object obj) {
        if (C0030.m5375() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m91(Object obj) {
        if (C0000.m1116() <= 0) {
            return Decode1.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m92(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۥۡۢ, reason: contains not printable characters */
    public static String m93(Object obj) {
        if (C0005.m1599() < 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۥۦۡۢ, reason: contains not printable characters */
    public static short[] m94() {
        if (C0063.m9589() <= 0) {
            return f12short;
        }
        return null;
    }

    /* renamed from: ۦۥۧۧ, reason: contains not printable characters */
    public static JsonObject m95(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0008.m1954(this));
            C0018.m3933(sb, C0057.m8978(m94(), 104, 6, 2099));
            C0018.m3933(sb, str);
            C0018.m3933(sb, C0033.m5852(m94(), 110, 1, 705));
            C0018.m3933(sb, str2);
            C0018.m3933(sb, C0051.m8259(m94(), 111, 5, 1974));
            arrayList = C0036.m6202(this, C0032.m5769(C0047.m7763(sb), C0004.m1504(this)));
        } catch (Exception e) {
            C0049.m7975(e);
        }
        g gVar = new g();
        C0049.m7974(gVar, C0038.m6456(str2), 999, 0, 0);
        C0045.m7632(gVar, arrayList);
        return C0033.m5828(gVar);
    }

    public final HashMap d() {
        HashMap mapM4251 = C0020.m4251(C0008.m1970(m94(), 116, 10, 638), C0039.m6551(m94(), 126, 111, 2547));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m1954(this));
        C0018.m3933(sb, C0055.m8814(m94(), 237, 1, 3050));
        C0053.m8424(mapM4251, C0039.m6551(m94(), 238, 7, 1460), C0047.m7763(sb));
        return mapM4251;
    }

    public String detailContent(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            String str = (String) C0048.m7915(list, 0);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0008.m1954(this));
            C0018.m3933(sb, str);
            h hVarM3577 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0004.m1504(this)));
            m mVar = new m();
            C0011.m2828(mVar, str);
            com.github.catvod.spider.merge.T0.m mVarM6243 = C0036.m6243(hVarM3577, C0039.m6551(m94(), 245, 14, 2336));
            if (mVarM6243 != null) {
                C0005.m1628(mVar, C0064.m9640(C0064.m9669(mVarM6243)));
            }
            com.github.catvod.spider.merge.T0.m mVarM62432 = C0036.m6243(hVarM3577, C0016.m3525(m94(), 259, 11, 2243));
            if (mVarM62432 != null) {
                String strM2339 = C0010.m2339(mVarM62432, C0013.m3106(m94(), 270, 3, 2641));
                if (strM2339 != null && !C0057.m8953(strM2339) && !C0043.m7277(strM2339, C0045.m7657(m94(), 273, 4, 3263))) {
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0008.m1954(this));
                    C0018.m3933(sb2, strM2339);
                    strM2339 = C0047.m7763(sb2);
                }
                C0026.m4947(mVar, strM2339);
            }
            com.github.catvod.spider.merge.T0.m mVarM62433 = C0036.m6243(hVarM3577, C0055.m8814(m94(), 277, 19, 1086));
            if (mVarM62433 != null) {
                com.github.catvod.spider.merge.T0.m mVarM4922 = C0026.m4922(mVarM62433);
                C0028.m5130(C0030.m5333(mVarM4922, C0064.m9599(m94(), 296, 7, 703)));
                C0027.m5000(mVar, C0064.m9640(C0064.m9669(mVarM4922)));
            }
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0042.m7151(m94(), 303, 17, 448)));
            while (true) {
                if (!C0012.m2962(itM7807)) {
                    break;
                }
                String strM9640 = C0064.m9640(C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)));
                if (C0064.m9686(strM9640, C0052.m8337(m94(), 320, 5, 975))) {
                    C0022.m4432(mVar, strM9640);
                    break;
                }
            }
            Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0042.m7151(m94(), 325, 10, 3152)));
            while (C0012.m2962(itM78072)) {
                com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78072);
                String strM9669 = C0064.m9669(mVar2);
                boolean zM9127 = C0058.m9127(strM9669, C0043.m7290(m94(), 335, 2, 3218));
                String strM9361 = C0061.m9361(m94(), 337, 1, 2237);
                if (zM9127) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator itM78073 = C0047.m7807(C0030.m5333(mVar2, strM9361));
                    while (C0012.m2962(itM78073)) {
                        C0004.m1532(arrayList2, C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78073)));
                    }
                    C0058.m9159(mVar, C0063.m9518(arrayList2));
                } else if (C0058.m9127(strM9669, C0040.m6584(m94(), 338, 2, 1177))) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator itM78074 = C0047.m7807(C0030.m5333(mVar2, strM9361));
                    while (C0012.m2962(itM78074)) {
                        C0004.m1532(arrayList3, C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78074)));
                    }
                    C0058.m9152(mVar, C0063.m9518(arrayList3));
                }
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator itM78075 = C0047.m7807(C0030.m5333(hVarM3577, C0033.m5852(m94(), 340, 30, 2276)));
            while (C0012.m2962(itM78075)) {
                com.github.catvod.spider.merge.T0.m mVarM49222 = C0026.m4922((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78075));
                C0028.m5130(C0065.m9765(mVarM49222));
                C0004.m1532(arrayList4, C0064.m9640(C0064.m9669(mVarM49222)));
            }
            Iterator itM78076 = C0047.m7807(C0030.m5333(hVarM3577, C0010.m2300(m94(), 370, 14, 2121)));
            while (C0012.m2962(itM78076)) {
                com.github.catvod.spider.merge.T0.m mVar3 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78076);
                ArrayList arrayList6 = new ArrayList();
                Iterator itM78077 = C0047.m7807(C0030.m5333(mVar3, C0018.m3917(m94(), 384, 22, 943)));
                while (C0012.m2962(itM78077)) {
                    com.github.catvod.spider.merge.T0.m mVar4 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78077);
                    String strM96402 = C0064.m9640(C0064.m9669(mVar4));
                    String strM23392 = C0010.m2339(mVar4, C0006.m1774(m94(), 406, 4, 1034));
                    StringBuilder sb3 = new StringBuilder();
                    C0018.m3933(sb3, strM96402);
                    C0018.m3933(sb3, C0001.m1189(m94(), 410, 1, 517));
                    C0018.m3933(sb3, strM23392);
                    C0004.m1532(arrayList6, C0047.m7763(sb3));
                }
                C0004.m1532(arrayList5, C0042.m7156(arrayList6));
            }
            C0054.m8596(mVar, C0048.m7957(arrayList4));
            C0044.m7449(mVar, C0048.m7957(arrayList5));
            C0004.m1532(arrayList, mVar);
        } catch (Exception e) {
            C0049.m7975(e);
        }
        return C0047.m7783(arrayList);
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(str), C0052.m8337(m94(), 411, 16, 1383)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            com.github.catvod.spider.merge.T0.m mVarM7303 = C0043.m7303(C0030.m5333(mVar, C0034.m6001(m94(), 427, 1, 1179)));
            com.github.catvod.spider.merge.T0.m mVarM73032 = C0043.m7303(C0030.m5333(mVar, C0053.m8477(m94(), 428, 5, 1730)));
            com.github.catvod.spider.merge.T0.m mVarM73033 = C0043.m7303(C0030.m5333(mVar, C0042.m7151(m94(), 433, 16, 3077)));
            com.github.catvod.spider.merge.T0.m mVarM73034 = C0043.m7303(C0030.m5333(mVar, C0033.m5852(m94(), 449, 17, 1229)));
            if (mVarM7303 != null) {
                String strM2339 = C0010.m2339(mVarM7303, C0010.m2300(m94(), 466, 5, 1780));
                String strM23392 = C0010.m2339(mVarM7303, C0045.m7657(m94(), 471, 4, 999));
                String strM1840 = C0007.m1840();
                String strM23393 = mVarM73032 != null ? C0010.m2339(mVarM73032, C0012.m2973(m94(), 475, 13, 1440)) : strM1840;
                if (strM23393 != null && !C0057.m8953(strM23393) && !C0043.m7277(strM23393, C0001.m1189(m94(), 488, 4, 2593))) {
                    strM23393 = C0028.m5188(new StringBuilder(), C0008.m1954(this), strM23393);
                }
                if (mVarM73033 != null) {
                    strM1840 = C0064.m9640(C0064.m9669(mVarM73033));
                }
                if (C0057.m8953(strM1840) && mVarM73034 != null) {
                    strM1840 = C0064.m9640(C0064.m9669(mVarM73034));
                }
                if (strM2339 != null && !C0057.m8953(strM2339) && strM23392 != null && !C0057.m8953(strM23392)) {
                    C0055.m8732(strM23392, strM2339, strM23393, strM1840, arrayList);
                }
            }
        }
        return arrayList;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0008.m1954(this), C0004.m1504(this))), C0037.m6307(m94(), 492, 18, 3059)));
            while (C0012.m2962(itM7807)) {
                com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
                String strM9640 = C0064.m9640(C0064.m9669(mVar));
                Matcher matcherM6026 = C0034.m6026(C0021.m4385(this), C0010.m2339(mVar, C0036.m6188(m94(), 510, 4, 1119)));
                if (C0003.m1405(matcherM6026)) {
                    C0004.m1532(arrayList, new b(C0021.m4306(matcherM6026, 1), strM9640, null));
                }
            }
        } catch (Exception e) {
            C0049.m7975(e);
        }
        return C0025.m4831(arrayList, new ArrayList());
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        try {
            h hVarM3577 = C0016.m3577(C0032.m5769(C0008.m1954(this), C0004.m1504(this)));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0062.m9389(m94(), 514, 19, 2421)));
            while (C0012.m2962(itM7807)) {
                com.github.catvod.spider.merge.T0.m mVarM7303 = C0043.m7303(C0030.m5333((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807), C0044.m7509(m94(), 533, 12, 1810)));
                if (mVarM7303 != null) {
                    Iterator itM78072 = C0047.m7807(C0030.m5333(mVarM7303, C0030.m5362(m94(), 545, 16, 1753)));
                    while (C0012.m2962(itM78072)) {
                        com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78072);
                        com.github.catvod.spider.merge.T0.m mVarM73032 = C0043.m7303(C0030.m5333(mVar, C0007.m1842(m94(), 561, 1, 1743)));
                        com.github.catvod.spider.merge.T0.m mVarM73033 = C0043.m7303(C0030.m5333(mVar, C0048.m7902(m94(), 562, 5, 2780)));
                        com.github.catvod.spider.merge.T0.m mVarM73034 = C0043.m7303(C0030.m5333(mVar, C0016.m3525(m94(), 567, 16, 2306)));
                        com.github.catvod.spider.merge.T0.m mVarM73035 = C0043.m7303(C0030.m5333(mVar, C0007.m1842(m94(), 583, 17, 620)));
                        if (mVarM73032 != null) {
                            String strM2339 = C0010.m2339(mVarM73032, C0062.m9389(m94(), 600, 5, 683));
                            String strM23392 = C0010.m2339(mVarM73032, C0056.m8911(m94(), 605, 4, 1825));
                            String strM1840 = C0007.m1840();
                            String strM23393 = mVarM73033 != null ? C0010.m2339(mVarM73033, C0049.m8007(m94(), 609, 13, 1167)) : strM1840;
                            if (strM23393 != null && !C0057.m8953(strM23393) && !C0043.m7277(strM23393, C0014.m3332(m94(), 622, 4, 786))) {
                                StringBuilder sb = new StringBuilder();
                                C0018.m3933(sb, C0008.m1954(this));
                                C0018.m3933(sb, strM23393);
                                strM23393 = C0047.m7763(sb);
                            }
                            if (mVarM73034 != null) {
                                strM1840 = C0064.m9640(C0064.m9669(mVarM73034));
                            }
                            if (C0057.m8953(strM1840) && mVarM73035 != null) {
                                strM1840 = C0064.m9640(C0064.m9669(mVarM73035));
                            }
                            if (strM2339 != null && !C0057.m8953(strM2339) && strM23392 != null && !C0057.m8953(strM23392) && !C0036.m6244(linkedHashSet, strM23392)) {
                                C0018.m3918(linkedHashSet, strM23392);
                                C0004.m1532(arrayList, new m(strM23392, strM2339, strM23393, strM1840));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C0049.m7975(e);
        }
        return C0047.m7783(arrayList);
    }

    public void init(Context context, String str) {
        if (str == null || C0057.m8953(str)) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM8477;
        String strM93;
        String strM1774 = C0006.m1774(m94(), 626, 7, 2052);
        String strM8007 = C0049.m8007(m94(), 633, 4, 2113);
        String strM6452 = C0038.m6452(m94(), 637, 4, 1468);
        String strM3525 = C0016.m3525(m94(), 641, 111, 802);
        String strM6779 = C0041.m6779(m94(), 752, 10, 2538);
        String strM1840 = C0007.m1840();
        try {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0008.m1954(this));
            C0018.m3933(sb, str2);
            Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0004.m1504(this))), C0065.m9775(m94(), 762, 21, 601)));
            while (true) {
                boolean zM2962 = C0012.m2962(itM7807);
                strM8477 = C0053.m8477(m94(), 783, 3, 501);
                if (!zM2962) {
                    strM93 = strM1840;
                    break;
                }
                String strM1081 = C0000.m1081((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807));
                if (strM1081 != null && C0058.m9127(strM1081, C0028.m5109(m94(), 786, 11, 1778))) {
                    int iM7935 = C0048.m7935(strM1081, 123);
                    int iM5416 = C0030.m5416(strM1081, 125);
                    if (iM7935 > -1 && iM5416 > iM7935) {
                        try {
                            JsonObject jsonObjectM90 = m90(C0054.m8636(strM1081, iM7935, iM5416 + 1));
                            if (m92(jsonObjectM90, strM8477)) {
                                strM93 = m93(m89(jsonObjectM90, strM8477));
                                break;
                            }
                            continue;
                        } catch (Exception e) {
                            C0049.m7975(e);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            C0049.m7975(e2);
        }
        if (C0057.m8953(strM93)) {
            g gVar = new g();
            C0006.m1720(gVar, 0);
            C0017.m3667(gVar, strM1840);
            return C0033.m5828(gVar);
        }
        String strM8202 = C0051.m8202(strM93, C0064.m9599(m94(), 797, 5, 1580));
        HashMap map = new HashMap();
        C0053.m8424(map, strM6779, strM3525);
        String strM9585 = C0063.m9585(m94(), 802, 7, 1094);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0008.m1954(this));
        C0018.m3933(sb2, C0005.m1645(m94(), 809, 27, 1399));
        C0018.m3933(sb2, strM8202);
        C0053.m8424(map, strM9585, C0047.m7763(sb2));
        C0053.m8424(map, C0060.m9352(m94(), 836, 6, 2713), C0008.m1954(this));
        C0053.m8424(map, C0036.m6188(m94(), 842, 16, 528), C0015.m3484(m94(), 858, 14, 1743));
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0053.m8477(m94(), 872, 3, 1353), strM8202);
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, C0008.m1954(this));
        C0018.m3933(sb3, C0022.m4403(m94(), 875, 16, 2262));
        JsonObject jsonObjectM902 = m90(C0008.m2029(C0003.m1396(C0047.m7763(sb3), map2, map)));
        if (m92(jsonObjectM902, strM6452) && m88(m89(jsonObjectM902, strM6452)) == 200 && m92(jsonObjectM902, strM8007)) {
            JsonObject jsonObjectM95 = m95(jsonObjectM902, strM8007);
            if (m92(jsonObjectM95, strM8477) && m92(jsonObjectM95, strM1774)) {
                String strM932 = m93(m89(jsonObjectM95, strM8477));
                int iM88 = m88(m89(jsonObjectM95, strM1774));
                if (iM88 == 1) {
                    strM932 = m91(strM932);
                } else if (iM88 == 2) {
                    strM932 = C0037.m6358(strM932);
                }
                HashMap map3 = new HashMap();
                C0053.m8424(map3, strM6779, strM3525);
                g gVar2 = new g();
                C0006.m1720(gVar2, 0);
                C0017.m3667(gVar2, strM932);
                C0057.m9029(gVar2, map3);
                return C0033.m5828(gVar2);
            }
        }
        g gVar3 = new g();
        C0006.m1720(gVar3, 0);
        C0017.m3667(gVar3, strM1840);
        return C0033.m5828(gVar3);
    }

    public String searchContent(String str, boolean z) {
        return C0033.m5855(this, str, z, C0051.m8259(m94(), 891, 1, 2991));
    }

    public String searchContent(String str, boolean z, String str2) {
        String strM6307;
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            strM6307 = str2;
        } else {
            try {
                strM6307 = C0037.m6307(m94(), 892, 1, 1192);
            } catch (Exception e) {
                C0049.m7975(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m1954(this));
        C0018.m3933(sb, C0018.m3917(m94(), 893, 8, 2190));
        C0018.m3933(sb, C0051.m8202(str, C0053.m8477(m94(), 901, 5, 560)));
        C0018.m3933(sb, C0016.m3525(m94(), 906, 10, 3219));
        C0018.m3933(sb, strM6307);
        C0018.m3933(sb, C0011.m2805(m94(), 916, 8, 1674));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0004.m1504(this))), C0033.m5852(m94(), 924, 21, 2357)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            com.github.catvod.spider.merge.T0.m mVarM7303 = C0043.m7303(C0030.m5333(mVar, C0034.m6001(m94(), 945, 12, 1918)));
            com.github.catvod.spider.merge.T0.m mVarM73032 = C0043.m7303(C0030.m5333(mVar, C0034.m6001(m94(), 957, 5, 879)));
            com.github.catvod.spider.merge.T0.m mVarM73033 = C0043.m7303(C0030.m5333(mVar, C0050.m8131(m94(), 962, 12, 1312)));
            com.github.catvod.spider.merge.T0.m mVarM73034 = C0043.m7303(C0030.m5333(mVar, C0024.m4740(m94(), 974, 16, 3267)));
            com.github.catvod.spider.merge.T0.m mVarM73035 = C0043.m7303(C0030.m5333(mVar, C0048.m7902(m94(), 990, 11, 2308)));
            if (mVarM7303 != null && mVarM73033 != null) {
                String strM9640 = C0064.m9640(C0064.m9669(mVarM73033));
                String strM2339 = C0010.m2339(mVarM7303, C0045.m7657(m94(), 1001, 4, 865));
                String strM1840 = C0007.m1840();
                String strM23392 = mVarM73032 != null ? C0010.m2339(mVarM73032, C0051.m8259(m94(), 1005, 13, 2743)) : strM1840;
                if (strM23392 != null && !C0057.m8953(strM23392) && !C0043.m7277(strM23392, C0033.m5852(m94(), 1018, 4, 2399))) {
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0008.m1954(this));
                    C0018.m3933(sb2, strM23392);
                    strM23392 = C0047.m7763(sb2);
                }
                if (mVarM73034 != null) {
                    strM1840 = C0064.m9640(C0064.m9669(mVarM73034));
                }
                if (C0057.m8953(strM1840) && mVarM73035 != null) {
                    strM1840 = C0064.m9640(C0064.m9669(mVarM73035));
                }
                if (!C0057.m8953(strM9640) && !C0057.m8953(strM2339)) {
                    C0004.m1532(arrayList, new m(strM2339, strM9640, strM23392, strM1840));
                }
            }
        }
        g gVar = new g();
        C0049.m7974(gVar, C0038.m6456(str2), 1, 0, 0);
        C0045.m7632(gVar, arrayList);
        return C0033.m5828(gVar);
    }
}