package com.github.catvod.spider.merge.a0;

import com.github.catvod.crawler.SpiderDebug;
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
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.google.gson.Gson;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.a0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f704short = {3146, 3144, 3079, 3151, 3161, 3146, 3144, 3157, 3100, 3164, 3144, 3079, 3146, 3161, 2238, 2275, 2274, 2276, 2136, 2071, 2053, 2053, 652, 721, 705, 705, 1658, 1575, 1568, 1592, 934, 1020, 1020, 997, 996, 2561, 2571, 2589, 2591, 465, 469, 449, 466, 459, 2070, 2068, 2139, 2067, 2053, 2070, 2068, 2057, 2112, 2048, 2068, 2139, 2070, 2053, 2143, 2050, 2051, 2053, 2368, 2319, 2333, 2333, 426, 503, 487, 487, 423, 506, 509, 485, 2289, 2219, 2219, 2226, 2227, 2226, 2232, 2222, 2220, 3082, 3080, 3097, 2743, 2731, 2731, 2735, 2732, 2789, 2800, 2800, 2747, 2733, 2742, 2729, 2746, 2802, 2735, 2748, 2801, 2734, 2730, 2750, 2733, 2740, 2801, 2748, 2737, 2800, 2798, 2800, 2748, 2739, 2736, 2730, 2747, 2747, 2733, 2742, 2729, 2746, 2800, 968, 1022, 1007, 950, 984, 1012, 1012, 1008, 1010, 1022, 953, 953, 918, 915, 915, 917, 987, 974, 957, 952, 989, 955, 973, 975, 499, 499, 499, 1000, 1000, 967, 962, 962, 964, 906, 2520, 2520, 2551, 2546, 2546, 2548, 2490, 2524, 2521, 2492, 2522, 2476, 946, 982, 982, 1017, 1020, 1020, 1018, 948, 1395, 1378, 1403, 1330, 1399, 1376, 1376, 1405, 1376, 1330, 1393, 1405, 1398, 1399, 1320, 1653, 1658, 1663, 1654, 1596, 1632, 1660, 1633, 1639, 1580, 2239, 2281, 2301, 2288, 2283, 2246, 2303, 2288, 2301, 2212, 2692, 2813, 2770, 2755, 2757, 2759, 2719, 2707, 2692, 2813, 2769, 2763, 2776, 2759, 2719, 2704, 2706, 2706, 2692, 2813, 2769, 2765, 2768, 2774, 2719, 2756, 2763, 2766, 2759, 2813, 2774, 2779, 2770, 2759, 2712, 2755, 2769, 2753, 2702, 2775, 2770, 2758, 2755, 2774, 2759, 2758, 2813, 2755, 2774, 2712, 2758, 2759, 2769, 2753, 3318, 3316, 3301, 1870, 1867, 1886, 1867, 2969, 2972, 2950, 2945, 704, 719, 706, 1242, 1240, 1231, 1234, 1236, 1237, 1252, 1231, 1218, 1227, 1246, 2101, 784, 799, 794, 787, 794, 799, 773, 770, 1564, 1537, 1562, 1557, 1548, 1565, 1564, 1574, 1567, 1552, 1565, 1546, 2912, 2929, 2932, 2920, 2925, 2919, 2917, 2928, 2913, 2852, 2927, 2913, 2941, 2878, 2852, 2401, 2416, 2416, 2412, 2409, 2403, 2401, 2420, 2409, 2415, 2414, 2351, 2410, 2419, 2415, 2414, 1255, 1275, 1275, 1279, 1276, 1205, 1184, 1184, 1259, 1277, 1254, 1273, 1258, 1186, 1279, 1260, 1185, 1278, 1274, 1262, 1277, 1252, 1185, 1260, 1249, 1184, 1214, 1184, 1260, 1251, 1248, 1274, 1259, 1259, 1277, 1254, 1273, 1258, 1184, 1257, 1254, 1251, 1258, 1184, 1259, 1258, 1251, 1258, 1275, 1258, 1200, 1279, 1277, 1202, 1274, 1260, 1279, 1277, 1248, 1193, 1257, 1277, 1202, 1279, 1260, 1193, 1274, 1260, 1232, 1279, 1262, 1277, 1262, 1250, 1232, 1276, 1275, 1277, 1202, 2223, 2185, 2207, 2184, 2263, 2235, 2205, 2207, 2196, 2190, 2508, 2542, 2555, 2536, 2541, 2541, 2528, 2478, 2484, 2479, 2481, 2465, 2473, 2509, 2536, 2543, 2548, 2553, 2490, 2465, 2516, 2490, 2465, 2496, 2543, 2533, 2547, 2542, 2536, 2533, 2465, 2480, 2483, 2490, 2465, 2555, 2537, 2476, 2498, 2511, 2490, 2465, 2508, 2504, 2465, 2489, 2465, 2514, 2500, 2465, 2499, 2548, 2536, 2541, 2533, 2478, 2514, 2513, 2480, 2496, 2479, 2483, 2480, 2481, 2489, 2480, 2483, 2479, 2481, 2481, 2482, 2472, 2465, 2496, 2545, 2545, 2541, 2532, 2518, 2532, 2531, 2506, 2536, 2549, 2478, 2484, 2482, 2486, 2479, 2482, 2487, 2465, 2473, 2506, 2505, 2517, 2508, 2509, 2477, 2465, 2541, 2536, 2538, 2532, 2465, 2502, 2532, 2530, 2538, 2542, 2472, 2465, 2519, 2532, 2547, 2546, 2536, 2542, 2543, 2478, 2485, 2479, 2481, 2465, 2498, 2537, 2547, 2542, 2540, 2532, 2478, 2480, 2483, 2482, 2479, 2481, 2479, 2487, 2482, 2480, 2483, 2479, 2489, 2481, 2465, 2512, 2548, 2528, 2547, 2538, 2478, 2486, 2479, 2489, 2479, 2480, 2479, 2486, 2484, 2480, 2465, 2508, 2542, 2531, 2536, 2541, 2532, 2465, 2514, 2528, 2535, 2528, 2547, 2536, 2478, 2484, 2482, 2486, 2479, 2482, 2487, 562, 528, 528, 534, 515, 519, 606, 566, 541, 528, 540, 535, 538, 541, 532, 2268, 2241, 2258, 2251, 1714, 1694, 1695, 1669, 1684, 1695, 1669, 1756, 1701, 1672, 1665, 1684, 2244, 2259, 2256, 2259, 2244, 2259, 2244, 2866, 2862, 2862, 2858, 2857, 2912, 2933, 2933, 2858, 2875, 2868, 2932, 2859, 2863, 2875, 2856, 2865, 2932, 2873, 2868, 2933, 1913, 1909, 1908, 1902, 1919, 1908, 1902, 1847, 1902, 1891, 1898, 1919, 1092, 1109, 1109, 1097, 1100, 1094, 1092, 1105, 1100, 1098, 1099, 1034, 1103, 1110, 1098, 1099, 1054, 1029, 1094, 1101, 1092, 1111, 1110, 1088, 1105, 1048, 1104, 1105, 1091, 1032, 1053, 1830, 1802, 1802, 1806, 1804, 1792, 1375, 1358, 1355, 1367, 1362, 1368, 1370, 1359, 1374, 1307, 1360, 1374, 1346, 1281, 1307, 2096, 2101, 2080, 2101, 2277, 2532, 2544, 2557, 2534, 2507, 2546, 2557, 2544, 689, 702, 699, 690, 760, 676, 696, 677, 675, 744, 3215, 3289, 3277, 3264, 3291, 3318, 3279, 3264, 3277, 3220, 3225, 3215, 3318, 3289, 3272, 3278, 3276, 3220, 3224, 3215, 3318, 3290, 3264, 3283, 3276, 3220, 3227, 3225, 3225, 3215, 3318, 3290, 3270, 3291, 3293, 3220, 3279, 3264, 3269, 3276, 3318, 3293, 3280, 3289, 3276, 3219, 3272, 3290, 3274, 3205, 3292, 3289, 3277, 3272, 3293, 3276, 3277, 3318, 3272, 3293, 3219, 3277, 3276, 3290, 3274, 505, 507, 490, 1993, 1990, 1987, 1994, 2032, 1985, 1998, 1986, 1994, 2621, 2610, 2623, 277, 272, 266, 269, 2878, 2865, 2868, 2877, 2919, 777, 772, 799, 818, 797, 780, 793, 773, 442, 439, 428, 385, 439, 432, 439, 426, 385, 434, 433, 445, 437, 1528, 1535, 1522, 1517, 1531, 1173, 1162, 1174, 1169, 3191, 3180, 3173, 3190, 3169, 3115, 3191, 3180, 3173, 3190, 3169, 3188, 3173, 3171, 3169, 3115, 3191, 3173, 3186, 3169, 3131, 1763, 1764, 1791, 1787, 1781, 1790, 2188, 2179, 2190, 2229, 2182, 2179, 2201, 2206, 669, 658, 671, 676, 655, 660, 656, 670, 661, 676, 663, 658, 648, 655, 2839, 2828, 2876, 2835, 2823, 2826, 2833, 2876, 2821, 2826, 2823, 2952, 2959, 2972, 2983, 2961, 2972, 1475, 1491, 1493, 1502, 1493, 1390, 1387, 1388, 1385, 3278, 3281, 3277, 3274, 2792, 2813, 2799, 2807, 2755, 2805, 2808, 278, 259, 273, 265, 349, 2461, 2511, 2522, 2504, 2512, 2532, 2514, 2527, 2438, 850, 774, 785, 768, 774, 781, 811, 797, 794, 784, 785, 780, 841, 624, 626, 611, 2499, 2513, 2502, 2517, 
    2543, 2513, 2499, 2387, 2369, 2390, 2373, 2431, 2369, 2387, 2431, 2388, 2383, 2384, 2431, 2374, 2377, 2372, 2387, 1584, 1599, 1594, 1587, 1657, 1586, 1593, 1569, 1592, 1594, 1593, 1591, 1586, 1641, 2408, 2363, 2349, 2321, 2366, 2351, 2364, 2351, 2339, 2321, 2365, 2362, 2364, 2419, 3150, 3137, 3148, 3163, 2765, 2770, 2766, 2761, 1143, 1148, 1124, 1149, 1151, 1148, 1138, 1143, 1100, 1126, 1121, 1151, 1923, 1957, 1971, 1956, 2043, 1943, 1969, 1971, 1976, 1954, 2162, 2128, 2117, 2134, 2131, 2131, 2142, 2064, 2058, 2065, 2063, 2079, 2071, 2152, 2134, 2129, 2139, 2128, 2120, 2124, 2079, 2161, 2155, 2079, 2062, 2063, 2065, 2063, 2052, 2079, 2152, 2134, 2129, 2057, 2059, 2052, 2079, 2119, 2057, 2059, 2070, 2079, 2174, 2127, 2127, 2131, 2138, 2152, 2138, 2141, 2164, 2134, 2123, 2064, 2058, 2060, 2056, 2065, 2060, 2057, 2079, 2071, 2164, 2167, 2155, 2162, 2163, 2067, 2079, 2131, 2134, 2132, 2138, 2079, 2168, 2138, 2140, 2132, 2128, 2070, 2079, 2126, 2122, 2142, 2125, 2132, 2066, 2140, 2131, 2128, 2122, 2139, 2066, 2139, 2125, 2134, 2121, 2138, 2064, 2061, 2065, 2058, 2065, 2061, 2063, 2079, 2172, 2135, 2125, 2128, 2130, 2138, 2064, 2062, 2063, 2063, 2065, 2063, 2065, 2059, 2055, 2054, 2057, 2065, 2062, 2057, 2063, 2079, 2170, 2131, 2138, 2140, 2123, 2125, 2128, 2129, 2064, 2062, 2055, 2065, 2060, 2065, 2058, 2065, 2059, 2066, 2141, 2059, 2056, 2055, 2059, 2054, 2062, 2062, 2063, 2063, 2079, 2156, 2142, 2137, 2142, 2125, 2134, 2064, 2058, 2060, 2056, 2065, 2060, 2057, 2079, 2172, 2135, 2142, 2129, 2129, 2138, 2131, 2064, 2127, 2140, 2132, 2132, 2144, 2128, 2123, 2135, 2138, 2125, 2144, 2140, 2135, 1562, 1581, 1582, 1581, 1594, 1581, 1594, 792, 772, 772, 768, 771, 842, 863, 863, 768, 785, 798, 862, 769, 773, 785, 770, 795, 862, 787, 798, 863, 2338, 2318, 2319, 2325, 2308, 2319, 2325, 2380, 2357, 2328, 2321, 2308, 996, 1013, 1013, 1001, 1004, 998, 996, 1009, 1004, 1002, 1003, 938, 1007, 1014, 1002, 1003, 1547, 1575, 1575, 1571, 1569, 1581, 2867, 2836, 2824, 2831, 420, 434, 425, 438, 421, 493, 432, 419, 494, 433, 437, 417, 434, 427, 494, 419, 430, 2905, 2882, 2891, 2904, 2895, 2821, 2905, 2882, 2891, 2904, 2895, 2906, 2891, 2893, 2895, 2821, 2910, 2885, 2881, 2895, 2884, 2837, 2481, 2486, 2469, 2462, 2472, 2469, 668, 653, 671, 671, 655, 643, 648, 649, 647, 662, 659, 655, 650, 640, 642, 663, 646, 707, 648, 646, 666, 729, 707, 887, 872, 884, 883, 686, 683, 702, 683, 1447, 1440, 1467, 1471, 1457, 1466, 2687, 2649, 2639, 2648, 2567, 2667, 2637, 2639, 2628, 2654, 2505, 2517, 2517, 2513, 2514, 2459, 2446, 2446, 2513, 2496, 2511, 2557, 2447, 2512, 2516, 2496, 2515, 2506, 2557, 2447, 2498, 2511, 2446, 2514, 2446, 2441, 2554, 2559, 2557, 2557, 2525, 2434, 2446, 2556, 2442, 2440, 2667, 2529, 2457, 454, 433, 454, 433, 2842, 2877, 2849, 2854, 1772, 1728, 1729, 1755, 1738, 1729, 1755, 1666, 1787, 1750, 1759, 1738, 1452, 1422, 1435, 1416, 1421, 1421, 1408, 1486, 1492, 1487, 1489, 1473, 1481, 1452, 1408, 1410, 1416, 1423, 1429, 1422, 1426, 1417, 1498, 1473, 1448, 1423, 1429, 1412, 1421, 1473, 1452, 1408, 1410, 1473, 1454, 1458, 1473, 1465, 1473, 1488, 1489, 1470, 1488, 1492, 1470, 1494, 1480, 1473, 1440, 1425, 1425, 1421, 1412, 1462, 1412, 1411, 1450, 1416, 1429, 1486, 1492, 1490, 1494, 1487, 1490, 1495, 1473, 1481, 1450, 1449, 1461, 1452, 1453, 1485, 1473, 1421, 1416, 1418, 1412, 1473, 1446, 1412, 1410, 1418, 1422, 1480, 1473, 1424, 1428, 1408, 1427, 1418, 1484, 1410, 1421, 1422, 1428, 1413, 1484, 1413, 1427, 1416, 1431, 1412, 1486, 1490, 1487, 1489, 1487, 1488, 1473, 1442, 1417, 1427, 1422, 1420, 1412, 1486, 1488, 1489, 1489, 1487, 1489, 1487, 1493, 1497, 1496, 1495, 1487, 1488, 1495, 1489, 1473, 1444, 1421, 1412, 1410, 1429, 1427, 1422, 1423, 1486, 1488, 1497, 1487, 1490, 1487, 1492, 1487, 1488, 1491, 1484, 1408, 1489, 1490, 1497, 1415, 1494, 1411, 1494, 1496, 1497, 1473, 1458, 1408, 1415, 1408, 1427, 1416, 1486, 1492, 1490, 1494, 1487, 1490, 1495, 1473, 1442, 1417, 1408, 1423, 1423, 1412, 1421, 1486, 1425, 1410, 1418, 1418, 1470, 1422, 1429, 1417, 1412, 1427, 1470, 1410, 1417, 1917, 1909, 1917, 1906, 1909, 1890, 1839, 1888, 1890, 1837, 1893, 1907, 1888, 1890, 1919, 1846, 1910, 1890, 1837, 1888, 1907, 1846, 1893, 1907, 1871, 1888, 1905, 1890, 1905, 1917, 1871, 1891, 1892, 1890, 1837, 1846, 1910, 1909, 1892, 1907, 1912, 1871, 1891, 1893, 1906, 1891, 1907, 1890, 1913, 1906, 1909, 1837, 1892, 1890, 1893, 1909, 1846, 1871, 1907, 1912, 1837, 1912, 1919, 1917, 1909, 1846, 1910, 1909, 1892, 1907, 1912, 1871, 1913, 1908, 1909, 1918, 1892, 1913, 1892, 1897, 1837, 1892, 1890, 1893, 1909, 1854, 1852, 1837, 713, 716, 729, 716, 1194, 1186, 1194, 1189, 1186, 1205, 1176, 1203, 1214, 1207, 1186, 1284, 1307, 1282, 2072, 2175, 2165, 2147, 2145, 2072, 2073, 2118, 2140, 2113, 2142, 2119, 412, 390, 426, 418, 21106, 988, 984, 972, 991, 966, 26071, 1460, 3058, 3058, 3058, 21219, 23184, 17738, 32003, 1590, 1593, 1596, 1589, 524, 521, 540, 521, 717, 714, 721, 725, 731, 720, 2029, 1940, 1976, 1954, 1969, 1966, 2038, 2041, 2043, 2043, 2029, 1940, 1976, 1956, 1977, 1983, 2038, 1965, 1954, 1959, 1966, 1940, 1983, 1970, 1979, 1966, 2033, 1962, 1976, 1960, 2023, 1965, 1954, 1959, 1966, 1940, 1957, 1962, 1958, 1966, 2033, 1962, 1976, 1960, 809, 818, 827, 808, 831, 885, 809, 818, 827, 808, 831, 810, 827, 829, 831, 885, 830, 831, 814, 827, 819, 822, 869, 1727, 1769, 1774, 1789, 1734, 1776, 1789, 1700, 1438, 1483, 1484, 1495, 1491, 1501, 1494, 1413, 1226, 1227, 1241, 1202, 1191, 1878, 1792, 1812, 1817, 1794, 1839, 1814, 1817, 1812, 1869, 2362, 2426, 2419, 2414, 2431, 2425, 2337, 2348, 2362, 2371, 2412, 2429, 2427, 2425, 2337, 922, 920, 905, 1185, 1188, 1214, 1209, 1857, 1868, 1879, 1923, 1948, 1937, 1936, 1946, 1822, 1811, 1819, 1838, 1810, 1808, 1797, 1812, 1814, 1822, 1795, 1800, 721, 715, 728, 711, 1234, 1247, 1238, 1219, 816, 1235, 1244, 1241, 1232, 1258, 1243, 1236, 1240, 1232, 2626, 2634, 2651, 2638, 2635, 2638, 2651, 
    2638, 1732, 1775, 1780, 1775, 1786, 1783, 2855, 2856, 2853, 1683, 1684, 1683, 1678, 1711, 1673, 1695, 1672, 1715, 1684, 1692, 1685, 1748, 1748, 1748, 810, 873, 869, 869, 865, 867, 879, 810, 876, 888, 869, 871, 810, 879, 882, 894, 810, 867, 889, 810, 879, 871, 890, 894, 883, 804, 804, 804, 3047, 3047, 3016, 3021, 3019};
    public String a;
    public final HashMap b;
    public final String c;
    public final List d;
    public final HashMap e;
    public String f;
    public final String g;
    public boolean h;
    public final com.github.catvod.spider.merge.L.a i;
    public boolean j;

    public C0232A() {
        this.a = C0007.m1840();
        this.b = new HashMap();
        this.c = C0042.m7151(m6845(), 0, 14, 3130);
        this.d = C0001.m1203(new String[]{C0039.m6551(m6845(), 14, 4, 2192), C0011.m2805(m6845(), 18, 4, 2166), C0034.m6001(m6845(), 22, 4, 674), C0045.m7657(m6845(), 26, 4, 1620), C0058.m9106(m6845(), 30, 5, 904)});
        this.e = new HashMap();
        this.f = null;
        this.g = C0000.m1077(m6845(), 35, 4, 2633);
        this.h = false;
        this.j = true;
        C0050.m8082();
        com.github.catvod.spider.merge.L.a aVar = (com.github.catvod.spider.merge.L.a) C0033.m5856(C0058.m9105(C0002.m1247(C0058.m9106(m6845(), 39, 5, 416))), com.github.catvod.spider.merge.L.a.class);
        this.i = aVar == null ? new com.github.catvod.spider.merge.L.a() : aVar;
    }

    public C0232A(int i) {
        this.a = C0007.m1840();
        this.b = new HashMap();
        this.c = C0058.m9106(m6845(), 44, 14, 2150);
        this.d = C0001.m1203(new String[]{C0041.m6779(m6845(), 58, 4, 2161), C0058.m9106(m6845(), 62, 4, 2414), C0028.m5109(m6845(), 66, 4, 388), C0015.m3484(m6845(), 70, 4, 393), C0053.m8477(m6845(), 74, 5, 2271)});
        this.e = new HashMap();
        this.f = null;
        this.g = C0006.m1774(m6845(), 79, 4, 2298);
        this.h = false;
        this.j = true;
        this.i = null;
    }

    /* renamed from: ۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6840(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() >= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Call m6841(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Response m6842(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return com.github.catvod.spider.merge.Z.c.g((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static Response m6843(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6844(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6845() {
        if (C0038.m6471() >= 0) {
            return f704short;
        }
        return null;
    }

    /* renamed from: ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Request m6846(Object obj) {
        if (C0057.m9017() > 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m6847(Object obj) {
        if (C0020.m4210() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۢۧۥۣ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6848(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static MediaType m6849(Object obj) {
        if (C0018.m3956() >= 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۨ۟۟, reason: not valid java name and contains not printable characters */
    public static RequestBody m6850(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۧۤۨ, reason: contains not printable characters */
    public static String m6851(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final String a(String str, Map map, Map map2, Integer num, String str2) throws InterruptedException {
        String strM7763;
        int iM4690 = C0024.m4690(num);
        boolean zM1815 = C0007.m1815(C0014.m3332(m6845(), 83, 3, 3149), str2);
        String strM6307 = C0037.m6307(m6845(), 86, 39, 2783);
        com.github.catvod.spider.merge.Z.d dVarM1803 = zM1815 ? C0007.m1803(C0026.m4915(strM6307, str), map, C0028.m5143(this)) : C0045.m7628(C0026.m4915(strM6307, str), C0041.m6815(map2), C0028.m5143(this));
        Map mapM6192 = C0036.m6192(dVarM1803);
        String strM7290 = C0043.m7290(m6845(), 125, 10, 923);
        if (C0062.m9431(mapM6192, strM7290) != null) {
            String strM5852 = C0033.m5852(m6845(), 135, 14, 998);
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(strM5852), C0032.m5761((Iterable) C0062.m9431(mapM6192, strM7290), C0016.m3525(m6845(), 149, 3, 456)));
            if (C0003.m1405(matcherM6026)) {
                Matcher matcherM60262 = C0034.m6026(C0005.m1602(strM5852), C0033.m5799(this));
                if (!C0003.m1405(matcherM60262) || C0007.m1815(C0021.m4306(matcherM60262, 1), C0021.m4306(matcherM6026, 1))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0033.m5799(this));
                    C0018.m3933(sb, C0039.m6551(m6845(), 171, 8, 905));
                    C0018.m3933(sb, C0021.m4306(matcherM6026, 1));
                    strM7763 = C0047.m7763(sb);
                } else {
                    String strM5799 = C0033.m5799(this);
                    StringBuilder sb2 = new StringBuilder(C0048.m7902(m6845(), 152, 7, 951));
                    C0018.m3933(sb2, C0021.m4306(matcherM6026, 1));
                    strM7763 = C0025.m4800(strM5799, C0041.m6779(m6845(), 159, 12, 2439), C0047.m7763(sb2));
                }
                this.a = strM7763;
            }
        }
        int iM9021 = C0057.m9021(dVarM1803);
        if (iM9021 == 200 || iM4690 <= 0) {
            return C0008.m2029(dVarM1803);
        }
        StringBuilder sb3 = new StringBuilder(C0042.m7151(m6845(), 179, 15, 1298));
        C0036.m6177(sb3, iM9021);
        m6847(C0047.m7763(sb3));
        C0011.m2785(1000L);
        return C0008.m1993(this, str, map, map2, C0011.m2808(iM4690 - 1), str2);
    }

    public final void b() {
        StringBuilder sb = new StringBuilder(C0001.m1189(m6845(), 194, 10, 1555));
        C0018.m3933(sb, C0055.m8806(this));
        C0018.m3933(sb, C0064.m9599(m6845(), 204, 10, 2201));
        Map map = (Map) C0029.m5275(C0008.m1993(this, C0028.m5188(sb, C0010.m2371(this), C0049.m8007(m6845(), 214, 54, 2722)), C0023.m4581(), C0023.m4581(), C0011.m2808(0), C0016.m3525(m6845(), 268, 3, 3249)), Map.class);
        String strM7718 = C0046.m7718(m6845(), 271, 4, 1834);
        if (C0062.m9431(map, strM7718) != null) {
            Map map2 = (Map) C0062.m9431(map, strM7718);
            String strM4199 = C0020.m4199(m6845(), 275, 4, 3061);
            if (C0064.m9636((List) C0062.m9431(map2, strM4199)) > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator itM3109 = C0013.m3109((List) C0062.m9431((Map) C0062.m9431(map, strM7718), strM4199));
                while (C0012.m2962(itM3109)) {
                    C0004.m1532(arrayList, (String) C0062.m9431((Map) C0048.m7949(itM3109), C0050.m8131(m6845(), 279, 3, 678)));
                }
                OkHttpClient okHttpClient = new OkHttpClient();
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(C0031.m5565(m6845(), 282, 11, 1211), C0026.m4951(m6845(), 293, 1, 2055)), new AbstractMap.SimpleEntry(C0017.m3646(m6845(), 294, 8, 886), arrayList), new AbstractMap.SimpleEntry(C0000.m1077(m6845(), 302, 12, 1657), C0008.m1961())};
                HashMap map3 = new HashMap(3);
                for (int i = 0; i < 3; i++) {
                    Map.Entry entry = entryArr[i];
                    Object objM7624 = C0045.m7624(entry);
                    if (C0044.m7425(objM7624, entry, map3, objM7624) != null) {
                        throw new IllegalArgumentException(C0002.m1280(objM7624, C0015.m3484(m6845(), 314, 15, 2820)));
                    }
                }
                String strM6851 = m6851(new Gson(), C0001.m1184(map3));
                String strM6779 = C0041.m6779(m6845(), 329, 16, 2304);
                m6843(m6841(okHttpClient, m6846(m6840(m6840(m6840(m6840(m6840(m6840(m6848(m6844(new Request.Builder(), C0004.m1549(m6845(), 345, 79, 1167)), m6850(m6849(strM6779), strM6851)), C0065.m9775(m6845(), 424, 10, 2298), C0012.m2973(m6845(), 434, 181, 2433)), C0052.m8337(m6845(), 615, 15, 627), C0004.m1549(m6845(), 630, 4, 2235)), C0062.m9389(m6845(), 634, 12, 1777), strM6779), C0031.m5565(m6845(), 646, 7, 2230), C0055.m8814(m6845(), 653, 21, 2906)), C0062.m9389(m6845(), 674, 12, 1818), C0054.m8574(m6845(), 686, 31, 1061)), C0011.m2805(m6845(), 717, 6, 1893), C0033.m5799(this)))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x025a A[EDGE_INSN: B:86:0x025a->B:32:0x025a BREAK  A[LOOP:1: B:55:0x03f4->B:67:0x04f5]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0500  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.a0.C0232A.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final HashMap d() {
        HashMap mapM4127 = C0019.m4127(C0064.m9599(m6845(), 1067, 10, 2006), C0062.m9389(m6845(), 1077, 192, 2111), C0008.m1970(m6845(), 1269, 7, 1608), C0022.m4403(m6845(), 1276, 21, 880));
        C0053.m8424(mapM4127, C0055.m8814(m6845(), 1297, 12, 2401), C0027.m5062(m6845(), 1309, 16, 901));
        C0053.m8424(mapM4127, C0038.m6452(m6845(), 1325, 6, 1608), C0033.m5799(this));
        C0053.m8424(mapM4127, C0029.m5256(m6845(), 1331, 4, 2939), C0002.m1305(m6845(), 1335, 17, 448));
        return mapM4127;
    }

    public final void e(com.github.catvod.spider.merge.E.j jVar) {
        HashMap mapM8159 = C0050.m8159(this);
        if (C0058.m9098(mapM8159, C0045.m7548(jVar))) {
            return;
        }
        String strM7548 = C0045.m7548(jVar);
        C0013.m3121(mapM8159, strM7548);
        StringBuilder sb = new StringBuilder(C0033.m5852(m6845(), 1352, 22, 2858));
        C0018.m3933(sb, C0055.m8806(this));
        String strM7763 = C0047.m7763(sb);
        Map mapM4581 = C0023.m4581();
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(C0017.m3646(m6845(), 1374, 6, 2497), strM7548), new AbstractMap.SimpleEntry(C0057.m8978(m6845(), 1380, 8, 748), C0007.m1840())};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object objM7624 = C0045.m7624(entry);
            if (C0044.m7425(objM7624, entry, map, objM7624) != null) {
                throw new IllegalArgumentException(C0002.m1280(objM7624, C0044.m7509(m6845(), 1388, 15, 739)));
            }
        }
        Map map2 = (Map) C0029.m5275(C0008.m1993(this, strM7763, mapM4581, C0001.m1184(map), C0011.m2808(0), C0040.m6584(m6845(), 1403, 4, 807)), Map.class);
        String strM5852 = C0033.m5852(m6845(), 1407, 4, 714);
        if (C0024.m4748(map2, strM5852) && C0024.m4748((Map) C0062.m9431(map2, strM5852), C0025.m4795(m6845(), 1411, 6, 1492))) {
            C0053.m8424(mapM8159, strM7548, (Map) C0062.m9431(map2, strM5852));
        }
    }

    public final boolean f() {
        com.github.catvod.spider.merge.E.j jVar;
        String strM1305 = C0002.m1305(m6845(), 1417, 10, 2602);
        if (!C0042.m7138(this)) {
            return C0051.m8183(this);
        }
        this.j = false;
        try {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0000.m1077(m6845(), 1427, 36, 2465)), C0034.m6033(C0035.m6110()));
            if (C0003.m1405(matcherM6026)) {
                jVar = new com.github.catvod.spider.merge.E.j(1, C0021.m4306(matcherM6026, 1), C0036.m6188(m6845(), 1463, 1, 2651));
            } else {
                jVar = null;
            }
            String[] strArrM4752 = C0024.m4752(C0024.m4752(C0035.m6167(C0045.m7562(this, jVar)), C0015.m3484(m6845(), 1464, 2, 2493))[1], C0042.m7151(m6845(), 1466, 4, 410));
            String str = strArrM4752[0];
            String str2 = strArrM4752[1];
            String str3 = strArrM4752[2];
            String str4 = strArrM4752[3];
            String str5 = strArrM4752[4];
            String strM7569 = C0045.m7569(this, str3, str4, str, str2);
            HashMap mapM5143 = C0028.m5143(this);
            C0013.m3121(mapM5143, C0029.m5256(m6845(), 1470, 4, 2898));
            C0013.m3121(mapM5143, C0044.m7509(m6845(), 1474, 12, 1711));
            C0013.m3121(mapM5143, strM1305);
            C0053.m8424(mapM5143, strM1305, C0060.m9352(m6845(), 1486, 198, 1505));
            m6842(strM7569, mapM5143);
        } catch (Exception unused) {
        }
        try {
            return C0058.m9127((String) C0062.m9431((Map) C0062.m9431((Map) C0029.m5275(C0008.m1993(this, C0054.m8574(m6845(), 1684, 85, 1808), null, null, C0011.m2808(0), C0009.m2037(m6845(), 1769, 3, 1913)), Map.class), C0023.m4536(m6845(), 1772, 4, 685)), C0024.m4740(m6845(), 1776, 11, 1223)), C0001.m1189(m6845(), 1787, 3, 1362));
        } catch (Exception unused2) {
            return C0051.m8183(this);
        }
    }

    public final com.github.catvod.spider.merge.E.m g(com.github.catvod.spider.merge.E.j jVar) {
        C0053.m8460(this, jVar);
        ArrayList arrayList = new ArrayList();
        C0032.m5682(this, jVar, arrayList, new ArrayList(), C0045.m7548(jVar), C0055.m8812(jVar), C0011.m2808(1));
        boolean zM3650 = C0017.m3650(C0023.m4536(m6845(), 1790, 12, 2103));
        String strM1842 = C0007.m1842(m6845(), 1802, 5, 493);
        String strM8574 = C0054.m8574(m6845(), 1807, 6, 941);
        List listM1203 = zM3650 ? C0010.m2306() ? C0001.m1203(new String[]{strM8574, strM1842}) : C0001.m1203(new String[]{strM8574}) : C0051.m8183(this) ? C0010.m2306() ? C0001.m1203(new String[]{strM8574, strM1842}) : C0001.m1203(new String[]{strM8574}) : C0010.m2306() ? C0001.m1203(new String[]{strM8574, strM1842}) : C0001.m1203(new String[]{strM8574});
        ArrayList arrayList2 = new ArrayList();
        Iterator itM3109 = C0013.m3109(listM1203);
        while (C0012.m2962(itM3109)) {
            C0004.m1532(arrayList2, (String) C0048.m7949(itM3109));
        }
        ArrayList arrayList3 = new ArrayList();
        if (C0007.m1817(arrayList)) {
            return null;
        }
        for (int i = 0; i < C0023.m4568((com.github.catvod.spider.merge.L.b) C0028.m5167(arrayList, C0009.m2139(arrayList) - 1)); i++) {
            for (int i2 = 0; i2 < C0009.m2139(arrayList2); i2++) {
                ArrayList arrayList4 = new ArrayList();
                Iterator itM7816 = C0047.m7816(arrayList);
                while (C0012.m2962(itM7816)) {
                    com.github.catvod.spider.merge.L.b bVar = (com.github.catvod.spider.merge.L.b) C0048.m7949(itM7816);
                    if (C0023.m4568(bVar) == i + 1) {
                        C0004.m1532(arrayList4, C0022.m4475(bVar));
                    }
                }
                C0004.m1532(arrayList3, C0036.m6194(C0011.m2805(m6845(), 1813, 1, 1431), arrayList4));
            }
        }
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        String strM1840 = C0007.m1840();
        C0011.m2828(mVar, strM1840);
        C0027.m5000(mVar, strM1840);
        C0026.m4947(mVar, strM1840);
        C0005.m1628(mVar, strM1840);
        String strM4795 = C0025.m4795(m6845(), 1814, 3, 3030);
        C0044.m7449(mVar, C0036.m6194(strM4795, arrayList3));
        C0054.m8596(mVar, C0036.m6194(strM4795, arrayList2));
        C0058.m9085(mVar, C0031.m5565(m6845(), 1817, 4, 3035));
        return mVar;
    }

    public final List h(com.github.catvod.spider.merge.E.j jVar, ArrayList arrayList, ArrayList arrayList2, String str, String str2, Integer num) {
        List list;
        ArrayList arrayList3;
        Iterator it;
        String strM1774 = C0006.m1774(m6845(), 1821, 4, 1616);
        String strM8911 = C0056.m8911(m6845(), 1825, 4, 616);
        String strM5362 = C0030.m5362(m6845(), 1829, 6, 702);
        String strM1842 = C0007.m1842(m6845(), 1835, 44, 1995);
        String strM2300 = C0010.m2300(m6845(), 1879, 23, 858);
        int iM4690 = num != null ? C0024.m4690(num) : 1;
        Integer numM2808 = C0011.m2808(iM4690);
        try {
            StringBuilder sb = new StringBuilder(strM2300);
            C0018.m3933(sb, C0055.m8806(this));
            C0018.m3933(sb, C0014.m3332(m6845(), 1902, 8, 1689));
            C0018.m3933(sb, str);
            C0018.m3933(sb, C0063.m9585(m6845(), 1910, 8, 1464));
            HashMap mapM8159 = C0050.m8159(this);
            String strM8202 = (String) C0062.m9431((Map) C0065.m9715(mapM8159, str), strM5362);
            try {
                strM8202 = C0051.m8202(strM8202, C0042.m7151(m6845(), 1918, 5, 1183));
            } catch (Exception unused) {
            }
            C0018.m3933(sb, strM8202);
            C0018.m3933(sb, C0023.m4536(m6845(), 1923, 10, 1904));
            C0018.m3933(sb, str2);
            C0018.m3933(sb, C0063.m9585(m6845(), 1933, 15, 2332));
            C0016.m3605(sb, numM2808);
            C0018.m3933(sb, strM1842);
            Map map = (Map) C0029.m5275(C0008.m1993(this, C0047.m7763(sb), C0023.m4581(), C0023.m4581(), C0011.m2808(0), C0020.m4199(m6845(), 1948, 3, 989)), Map.class);
            if (C0062.m9431(map, strM8911) != null && (list = (List) C0062.m9431((Map) C0062.m9431(map, strM8911), C0043.m7290(m6845(), 1951, 4, 1229))) != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator itM3109 = C0013.m3109(list);
                while (C0012.m2962(itM3109)) {
                    Map map2 = (Map) C0048.m7949(itM3109);
                    Boolean boolM1129 = C0000.m1129();
                    if (C0034.m6042(boolM1129, C0062.m9431(map2, C0003.m1398(m6845(), 1955, 3, 1829)))) {
                        C0004.m1532(arrayList4, map2);
                    } else if (!C0034.m6042(boolM1129, C0062.m9431(map2, strM1774)) || !C0007.m1815(C0015.m3484(m6845(), 1958, 5, 2037), C0062.m9431(map2, C0002.m1305(m6845(), 1963, 12, 1905)))) {
                        if (C0007.m1815(strM1774, C0062.m9431(map2, C0052.m8337(m6845(), 1979, 4, 1190)))) {
                            List listM3661 = C0017.m3661(this);
                            StringBuilder sb2 = new StringBuilder();
                            it = itM3109;
                            C0018.m3933(sb2, C0028.m5109(m6845(), 1983, 1, 798));
                            C0018.m3933(sb2, C0004.m1522((String) C0062.m9431(map2, C0023.m4536(m6845(), 1984, 9, 1205))));
                            if (C0021.m4355(listM3661, C0047.m7763(sb2))) {
                                C0004.m1532(arrayList2, C0005.m1631(C0045.m7548(jVar), map2));
                            }
                        }
                        itM3109 = it;
                    } else if (C0032.m5676((Double) C0062.m9431(map2, C0026.m4951(m6845(), 1975, 4, 674))) >= 5242880.0d) {
                        C0006.m1755(map2, strM5362, C0062.m9431((Map) C0065.m9715(mapM8159, C0045.m7548(jVar)), strM5362));
                        C0004.m1532(arrayList, C0005.m1631(C0045.m7548(jVar), map2));
                    }
                    it = itM3109;
                    itM3109 = it;
                }
                double d = iM4690;
                double dM5676 = C0032.m5676((Double) C0062.m9431((Map) C0062.m9431(map, C0065.m9775(m6845(), 1993, 8, 2607)), C0001.m1189(m6845(), 2001, 6, 1691)));
                double d2 = 200;
                C0004.m1564(d2);
                if (d < C0001.m1140(dM5676 / d2)) {
                    arrayList3 = arrayList4;
                    C0045.m7603(list, C0032.m5682(this, jVar, arrayList, arrayList2, str, str2, C0011.m2808(iM4690 + 1)));
                } else {
                    arrayList3 = arrayList4;
                }
                Iterator itM7816 = C0047.m7816(arrayList3);
                while (C0012.m2962(itM7816)) {
                    C0045.m7603(list, C0032.m5682(this, jVar, arrayList, arrayList2, str, C0037.m6312(C0062.m9431((Map) C0048.m7949(itM7816), C0046.m7718(m6845(), 2007, 3, 2881))), null));
                }
                return list;
            }
            return C0008.m1961();
        } catch (Exception unused2) {
            return C0008.m1961();
        }
    }

    public final void i(String str) {
        if (C0040.m6623(new CharSequence[]{str})) {
            this.a = str;
            try {
                m6847(C0043.m7290(m6845(), 2010, 15, 1786));
                if (C0048.m7937(new CharSequence[]{C0033.m5799(this)})) {
                    m6847(C0038.m6452(m6845(), 2025, 28, 778));
                    this.a = C0059.m9206(C0029.m5266(C0019.m4038(this)));
                }
                if (C0040.m6623(new CharSequence[]{C0033.m5799(this)}) && C0058.m9127(C0033.m5799(this), C0054.m8574(m6845(), 2053, 5, 3000))) {
                    String strM5799 = C0033.m5799(this);
                    C0055.m8717(strM5799);
                    this.a = strM5799;
                    this.h = C0045.m7619(this);
                }
            } catch (Exception unused) {
            }
        }
    }
}