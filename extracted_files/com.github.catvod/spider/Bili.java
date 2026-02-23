package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.d;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I.a;
import com.github.catvod.spider.merge.I.b;
import com.github.catvod.spider.merge.I.c;
import com.github.catvod.spider.merge.I.e;
import com.github.catvod.spider.merge.I.g;
import com.github.catvod.spider.merge.I.h;
import com.github.catvod.spider.merge.I.j;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
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
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Bili extends Spider {
    public static String e;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f7short = {2941, 2590, 869, 810, 877, 865, 892, 823, 1763, 1694, 1723, 1726, 1711, 1707, 1726, 1707, 1718, 1712, 1713, 1676, 1722, 1707, 1761, 1749, 1763, 1692, 1712, 1713, 1707, 1722, 1713, 1707, 1692, 1712, 1714, 1711, 1712, 1713, 1722, 1713, 1707, 1791, 1724, 1712, 1713, 1707, 1722, 1713, 1707, 1675, 1702, 1711, 1722, 1762, 1789, 689, 700, 685, 665, 687, 705, 758, 739, 737, 758, 736, 758, 765, 743, 754, 743, 762, 764, 765, 691, 762, 759, 686, 689, 640, 642, 704, 707, 716, 710, 725, 715, 710, 726, 714, 671, 640, 2885, 2887, 2820, 2824, 2819, 2818, 2820, 2836, 2906, 2885, 2574, 2572, 2625, 2629, 2625, 2633, 2680, 2645, 2652, 2633, 2577, 2574, 2776, 2778, 1051, 1096, 1103, 1114, 1097, 1103, 1132, 1106, 1103, 1107, 1128, 1146, 1131, 1030, 1049, 3013, 3033, 3053, 3035, 2981, 2950, 2964, 2946, 2994, 2997, 2987, 3033, 493, 510, 403, 432, 418, 436, 388, 387, 413, 495, 475, 493, 386, 436, 438, 444, 436, 447, 421, 403, 432, 418, 436, 497, 440, 447, 437, 436, 425, 387, 432, 447, 438, 436, 492, 499, 1878, 1866, 1918, 1864, 1853, 1818, 1821, 1792, 1821, 1813, 1816, 1821, 1806, 1813, 1792, 1821, 1819, 1818, 1876, 1798, 1813, 1818, 1811, 1809, 1865, 1878, 3158, 3163, 3146, 3198, 3144, 3163, 3111, 3089, 3091, 3097, 3089, 3098, 3072, 3126, 3093, 3079, 3089, 3146, 3198, 3144, 3163, 3110, 3089, 3076, 3078, 3089, 3079, 3089, 3098, 3072, 3093, 3072, 3101, 3099, 3098, 3146, 3198, 3144, 3163, 3125, 3088, 3093, 3076, 3072, 3093, 3072, 3101, 3099, 3098, 3111, 3089, 3072, 3146, 1886, 1912, 1902, 1913, 1830, 1866, 1900, 1902, 1893, 1919, 2980, 2950, 2963, 2944, 2949, 2949, 2952, 3014, 3036, 3015, 3033, 3017, 3009, 3006, 2944, 2951, 2957, 2950, 2974, 2970, 3017, 2983, 3005, 3017, 3032, 3033, 3015, 3033, 3026, 3017, 3006, 2944, 2951, 3039, 3037, 3026, 3017, 2961, 3039, 3037, 3008, 3017, 2984, 2969, 2969, 2949, 2956, 3006, 2956, 2955, 2978, 2944, 2973, 3014, 3036, 3034, 3038, 3015, 3034, 3039, 3017, 3009, 2978, 2977, 3005, 2980, 2981, 3013, 3017, 2949, 2944, 2946, 2956, 3017, 2990, 2956, 2954, 2946, 2950, 3008, 3017, 2986, 2945, 2971, 2950, 2948, 2956, 3014, 3032, 3035, 3035, 3015, 3033, 3015, 3033, 3015, 3033, 3017, 3002, 2952, 2959, 2952, 2971, 2944, 3014, 3036, 3034, 3038, 3015, 3034, 3039, 615, 592, 595, 592, 583, 592, 583, 653, 657, 657, 661, 662, 735, 714, 714, 658, 658, 658, 715, 647, 652, 649, 652, 647, 652, 649, 652, 715, 646, 650, 648, 1986, 1998, 1998, 1994, 1992, 1988, 1298, 1293, 1280, 1281, 1291, 1214, 1203, 1215, 1201, 1214, 1186, 1259, 1265, 2253, 2250, 2205, 2179, 2190, 2206, 2178, 2263, 2253, 707, 708, 642, 662, 645, 649, 641, 694, 645, 656, 641, 729, 707, 2293, 2290, 2209, 2227, 2208, 2287, 2293, 382, 424, 444, 429, 416, 422, 527, 524, 526, 516, 524, 2191, 2183, 2188, 2190, 2190, 2190, 1109, 1110, 1108, 1109, 1108, 3136, 3138, 3139, 3137, 3137, 3137, 2833, 2834, 2832, 2835, 2836, 2503, 2501, 2497, 2497, 2497, 877, 886, 878, 832, 875, 866, 877, 877, 870, 879, 880, 830, 804, 817, 804, 803, 880, 866, 878, 883, 879, 870, 849, 866, 887, 870, 830, 804, 806, 880, 804, 3050, 3042, 3055, 812, 806, 811, 2859, 2868, 419, 421, 435, 420, 437, 445, 2372, 2402, 2420, 2403, 2364, 2384, 2422, 2420, 2431, 2405, 2364, 2334, 2315, 2328, 2333, 2333, 2320, 2398, 2372, 2399, 2369, 2385, 2393, 2342, 2328, 2335, 2325, 2334, 2310, 2306, 2385, 2367, 2341, 2385, 2368, 2369, 2399, 2369, 2378, 2385, 2342, 2328, 2335, 2375, 2373, 2378, 2385, 2313, 2375, 2373, 2392, 2385, 2352, 2305, 2305, 2333, 2324, 2342, 2324, 2323, 2362, 2328, 2309, 2398, 2372, 2370, 2374, 2399, 2370, 2375, 2385, 2393, 2362, 2361, 2341, 2364, 2365, 2397, 2385, 2333, 2328, 2330, 2324, 2385, 2358, 2324, 2322, 2330, 2334, 2392, 2385, 2354, 2329, 2307, 2334, 2332, 2324, 2398, 2368, 2371, 2371, 2399, 2369, 2399, 2369, 2399, 2369, 2385, 2338, 2320, 2327, 2320, 2307, 2328, 2398, 2372, 2370, 2374, 2399, 2370, 2375, 1659, 1612, 1615, 1612, 1627, 1612, 1627, 634, 614, 614, 610, 609, 552, 573, 573, 613, 613, 613, 572, 624, 635, 638, 635, 624, 635, 638, 635, 572, 625, 637, 639, 2797, 2785, 2785, 2789, 2791, 2795, 2665, 2677, 2677, 2673, 2674, 2619, 2606, 2606, 2656, 2673, 2664, 2607, 2659, 2664, 2669, 2664, 2659, 2664, 2669, 2664, 2607, 2658, 2670, 2668, 2606, 2681, 2606, 2673, 2669, 2656, 2680, 2660, 2675, 2606, 2673, 2669, 2656, 2680, 2676, 2675, 2669, 2622, 2659, 2679, 2664, 2661, 2620, 1157, 1216, 1226, 1223, 1182, 2993, 3046, 3065, 2986, 1632, 1568, 1576, 1584, 1575, 1578, 1659, 1650, 1654, 1650, 1662, 1632, 1568, 1577, 1587, 1588, 1581, 1659, 1655, 2429, 2430, 2428, 2422, 2430, 390, 398, 389, 391, 391, 391, 1802, 1801, 1803, 1802, 1803, 2093, 2095, 2094, 2092, 2092, 2092, 1616, 1619, 1617, 1618, 1621, 1564, 1566, 1562, 1562, 1562, 2181, 2292, 2281, 2301, 2201, 2241, 2260, 2261, 2263, 2250, 2179, 2241, 2250, 2256, 2180, 2203, 2257, 2253, 2253, 2249, 2179, 2198, 2198, 2254, 2254, 2254, 2199, 2254, 2186, 2199, 2262, 2251, 2270, 2198, 2187, 2185, 2185, 2184, 2198, 2273, 2292, 2293, 2282, 2266, 2257, 2268, 2260, 2264, 2196, 2256, 2263, 2250, 2253, 2264, 2263, 2266, 2268, 2203, 2201, 2241, 2260, 2261, 2263, 2250, 2180, 2203, 2252, 2251, 2263, 2179, 2260, 2249, 2268, 2270, 2179, 2269, 2264, 2250, 2257, 2179, 2250, 2266, 2257, 2268, 2260, 2264, 2179, 2260, 2249, 2269, 2179, 2187, 2185, 2184, 2184, 2203, 2201, 2241, 2250, 2256, 2179, 2250, 2266, 2257, 2268, 2260, 2264, 2293, 2262, 2266, 2264, 2253, 2256, 2262, 2263, 2180, 2203, 2252, 2251, 2263, 2179, 2260, 2249, 2268, 2270, 2179, 2269, 2264, 2250, 2257, 2179, 2250, 2266, 2257, 2268, 2260, 2264, 2179, 2260, 2249, 2269, 2179, 2187, 2185, 2184, 2184, 2201, 2301, 2296, 2282, 2289, 2196, 2292, 2281, 2301, 2199, 2241, 2250, 2269, 2203, 2201, 2253, 2240, 2249, 2268, 2180, 2203, 2250, 2253, 2264, 2253, 2256, 2266, 2203, 2201, 2260, 2268, 2269, 2256, 2264, 2281, 2251, 2268, 2250, 2268, 2263, 2253, 2264, 2253, 2256, 2262, 2263, 2301, 2252, 
    2251, 2264, 2253, 2256, 2262, 2263, 2180, 2203, 2281, 2285, 1523, 1410, 1408, 1485, 1481, 1486, 1506, 1493, 1478, 1478, 1477, 1490, 1524, 1481, 1485, 1477, 1437, 1410, 1520, 1524, 1949, 2028, 2030, 1982, 1980, 1953, 1960, 1959, 1954, 1963, 1981, 2035, 2028, 1979, 1980, 1952, 2036, 1955, 1982, 1963, 1961, 2036, 1962, 1967, 1981, 1958, 2036, 1982, 1980, 1953, 1960, 1959, 1954, 1963, 2036, 1959, 1981, 1953, 1960, 1960, 2019, 1953, 1952, 2019, 1962, 1963, 1955, 1967, 1952, 1962, 2036, 2044, 2046, 2047, 2047, 2028, 2032, 1988, 2034, 1950, 1963, 1980, 1959, 1953, 1962, 2030, 1962, 1979, 1980, 1967, 1978, 1959, 1953, 1952, 2035, 2028, 1950, 1946, 507, 394, 392, 475, 476, 457, 474, 476, 405, 394, 504, 508, 408, 507, 394, 406, 418, 2287, 2422, 2368, 2387, 2348, 2329, 2318, 2325, 2323, 2328, 2370, 2422, 2368, 2387, 2353, 2348, 2360, 2370, 2578, 2563, 2563, 2591, 2586, 2576, 2578, 2567, 2586, 2588, 2589, 2652, 2583, 2578, 2560, 2587, 2648, 2571, 2590, 2591, 1855, 1899, 1888, 1911, 1901, 501, 3087, 3083, 3078, 2617, 2599, 2150, 2170, 2170, 2174, 2173, 2100, 2081, 2081, 2159, 2174, 2151, 2080, 2156, 2151, 2146, 2151, 2156, 2151, 2146, 2151, 2080, 2157, 2145, 2147, 2081, 2166, 2081, 2173, 2174, 2159, 2157, 2155, 2081, 2169, 2156, 2151, 2081, 2159, 2172, 2157, 2081, 2173, 2155, 2159, 2172, 2157, 2150, 2097, 1943, 1933, 1928, 1938, 1941, 825, 804, 818, 819, 804, 2984, 2995, 2984, 3005, 2992, 2990, 3005, 2994, 2999, 1437, 1420, 1419, 1432, 1421, 1424, 1430, 1431, 2499, 975, 978, 991, 2629, 2720, 2748, 2748, 2744, 2747, 2802, 2791, 2791, 2729, 2744, 2721, 2790, 2730, 2721, 2724, 2721, 2730, 2721, 2724, 2721, 2790, 2731, 2727, 2725, 2791, 2736, 2791, 2751, 2733, 2730, 2789, 2721, 2726, 2748, 2733, 2746, 2734, 2729, 2731, 2733, 2791, 2747, 2733, 2729, 2746, 2731, 2720, 2791, 2748, 2737, 2744, 2733, 2807, 2747, 2733, 2729, 2746, 2731, 2720, 2711, 2748, 2737, 2744, 2733, 2805, 2750, 2721, 2732, 2733, 2727, 2798, 2723, 2733, 2737, 2751, 2727, 2746, 2732, 2805, 1189, 1260, 1265, 1255, 1254, 1265, 1214, 2228, 2294, 2279, 2272, 2291, 2278, 2299, 2301, 2300, 2223, 3110, 3184, 3169, 3175, 3173, 3133, 2616, 2596, 2596, 2592, 2595, 2666, 2687, 2687, 2609, 2592, 2617, 2686, 2610, 2617, 2620, 2617, 2610, 2617, 2620, 2617, 2686, 2611, 2623, 2621, 2687, 2600, 2687, 2599, 2613, 2610, 2685, 2617, 2622, 2596, 2613, 2594, 2614, 2609, 2611, 2613, 2687, 2622, 2609, 2598, 513, 2172, 2144, 2144, 2148, 2151, 2094, 2107, 2107, 2165, 2148, 2173, 2106, 2166, 2173, 2168, 2173, 2166, 2173, 2168, 2173, 2106, 2167, 2171, 2169, 2107, 2156, 2107, 2147, 2161, 2166, 2105, 2173, 2170, 2144, 2161, 2150, 2162, 2165, 2167, 2161, 2107, 2146, 2173, 2161, 2147, 2091, 2165, 2173, 2160, 2089, 20913, -26705, 444, 416, 416, 420, 423, 494, 507, 507, 437, 420, 445, 506, 438, 445, 440, 445, 438, 445, 440, 445, 506, 439, 443, 441, 507, 428, 507, 420, 440, 437, 429, 433, 422, 507, 420, 440, 437, 429, 417, 422, 440, 491, 437, 418, 445, 432, 489, 499, 438, 444, 433, 488, 2107, 2156, 2163, 2080, 2092, 2095, 2090, 2107, 2171, 2163, 2155, 2172, 2161, 2080, 2089, 2093, 2089, 2085, 2107, 2171, 2162, 2152, 2159, 2166, 2080, 2092, 3263, 1975, 2663, 1576, 1592, 31907, 1261, 1265, 1265, 1269, 1270, 1215, 1194, 1194, 1252, 1269, 1260, 1195, 1255, 1260, 1257, 1260, 1255, 1260, 1257, 1260, 1195, 1254, 1258, 1256, 1194, 1277, 1194, 1266, 1248, 1255, 1192, 1260, 1259, 1265, 1248, 1271, 1251, 1252, 1254, 1248, 1194, 1252, 1271, 1254, 1261, 1260, 1267, 1248, 1194, 1271, 1248, 1257, 1252, 1265, 1248, 1249, 1210, 1255, 1267, 1260, 1249, 1208, 1950, 1947, 1934, 1947, 295, 314, 295, 319, 310, 2147, 2155, 2150, 1247, 1237, 1240, 28704, 22443, 1427, 1427, 1427, 2771, 2762, 2774, 2775, 3288, 3285, 3292, 3273, 2367, -28398, -31953, 2047, 2020, 2047, 2026, 2023, 2041, 2026, 2021, 2016, 28192, 20538, -26626, 28138, 1681, 1694, 1691, 1681, 1689, 25301, 24677, 29609, 23510, 761, 764, 747, 749, 744, 765, 748, 24899, 24409, 22795, 22550, 1702, 1711, 24967, 24477, 25521, -31928, 532, 531, 520, 528, 1225, 1236, 1218, 1219, 1236, 24618, 23863, 21928, -27608, 25218, -28233, 1195, 1269, 1267, 22213, -28453, 18982, 19145, 719, 2965, 2966, 3032, 2960, 2966, 22944, -24642, 2635, 529, 528, 606, 531, 528, 20518, -27080, 1675, 2844, 2845, 22827, -24779, 17864, 17702, 3128, 2825, 2840, 2847, 2828, 2841, 2820, 2818, 2819, 26539, -27490, 2919, 2939, 2939, 2943, 2940, 2869, 2848, 2848, 2926, 2943, 2918, 2849, 2925, 2918, 2915, 2918, 2925, 2918, 2915, 2918, 2849, 2924, 2912, 2914, 2848, 2935, 2848, 2936, 2922, 2925, 2850, 2918, 2913, 2939, 2922, 2941, 2921, 2926, 2924, 2922, 2848, 2943, 2912, 2943, 2938, 2915, 2926, 2941, 2864, 2943, 2940, 2866, 2877, 2879, 3135, 3123, 3123, 3127, 3125, 3129, 1008, 1004, 1004, 1000, 3008, 3019, 3022, 3019, 3008, 3019, 3022, 3019, 2254, 2265, 2266, 2245, 2248, 2207, 2193, 2196, 2200, 2286, 2204, 2207, 2197, 2201, 2280, 2177, 2287, 2197, 2282, 2206, 2177, 2287, 2200, 2197, 2204, 2177, 2281, 2197, 2206, 2281, 2177, 2285, 2204, 2197, 2285, 2286, 2200, 2196, 2282, 2281, 2206, 2202, 2281, 2203, 2205, 2202, 2207, 2202, 2245, 2242, 2250, 2243, 2255, 744, 671, 1337, 1534, 1506, 1506, 1510, 1509, 1452, 1465, 1465, 1527, 1510, 1535, 1464, 1524, 1535, 1530, 1535, 1524, 1535, 1530, 1535, 1464, 1525, 1529, 1531, 1465, 1518, 1465, 1504, 1447, 1465, 1522, 1531, 1465, 1530, 1535, 1509, 1506, 1464, 1509, 1529, 1449, 1529, 1535, 1522, 1451, 1137, 1066, 1057, 1139, 1068, 1063, 1058, 1063, 1128, 1071, 1063, 1066, 1139, 759, 690, 696, 693, 748, 2721, 2806, 2793, 2746, 2974, 3020, 3009, 3016, 3037, 2949, 3029, 3016, 3036, 2637};
    public JsonObject a;
    public boolean b;
    public boolean c;
    public j d;

    public static String a(c cVar, String str) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0058.m9115(cVar));
        C0018.m3933(sb, C0056.m8911(m70(), 0, 1, 2850));
        C0018.m3933(sb, C0047.m7754(cVar));
        String strM7763 = C0047.m7763(sb);
        String str2 = C0024.m4752(C0001.m1150(cVar), C0034.m6001(m70(), 1, 1, 2609))[0];
        String strM3446 = C0015.m3446(C0045.m7617(cVar), C0052.m8337(m70(), 2, 1, 835), C0024.m4740(m70(), 3, 5, 780));
        C0045.m7549();
        String strM9063 = C0058.m9063(cVar);
        String strM5861 = C0033.m5861(cVar);
        String strM1150 = C0001.m1150(cVar);
        String strM3681 = C0017.m3681(cVar);
        String strM4229 = C0020.m4229(C0053.m8414(cVar));
        String strM1661 = C0005.m1661(C0053.m8414(cVar));
        StringBuilder sbM8368 = C0052.m8368(C0018.m3917(m70(), 8, 47, 1759), str2, C0017.m3646(m70(), 55, 24, 659), strM7763, C0043.m7290(m70(), 79, 13, 674));
        C0011.m2747(sbM8368, strM9063, C0056.m8911(m70(), 92, 10, 2919), strM5861, C0060.m9352(m70(), 102, 12, 2604));
        C0011.m2747(sbM8368, strM1150, C0012.m2973(m70(), 114, 2, 2810), str, C0012.m2973(m70(), 116, 15, 1083));
        C0011.m2747(sbM8368, strM3681, C0022.m4403(m70(), 131, 12, 3047), strM3446, C0019.m4107(m70(), 143, 36, 465));
        C0018.m3933(sbM8368, strM4229);
        C0018.m3933(sbM8368, C0015.m3484(m70(), 179, 26, 1908));
        C0018.m3933(sbM8368, strM1661);
        C0018.m3933(sbM8368, C0026.m4951(m70(), 205, 53, 3188));
        return C0047.m7763(sbM8368);
    }

    public static HashMap b() {
        HashMap mapM4127 = C0019.m4127(C0015.m3484(m70(), 258, 10, 1803), C0031.m5565(m70(), 268, 111, 3049), C0000.m1077(m70(), 379, 7, 565), C0048.m7902(m70(), 386, 24, 741));
        String strM8241 = C0051.m8241();
        if (strM8241 != null) {
            C0053.m8424(mapM4127, C0035.m6131(m70(), 410, 6, 1953), strM8241);
        }
        return mapM4127;
    }

    public static String c(c cVar) {
        String strM1327;
        if (C0043.m7277(C0001.m1150(cVar), C0046.m7718(m70(), 416, 5, 1380))) {
            C0045.m7549();
            String strM5841 = C0033.m5841(cVar);
            String strM1845 = C0007.m1845(cVar);
            String strM4742 = C0024.m4742(cVar);
            String strM7426 = C0044.m7426(cVar);
            StringBuilder sbM8368 = C0052.m8368(C0031.m5565(m70(), 421, 8, 1238), strM5841, C0043.m7290(m70(), 429, 9, 2282), strM1845, C0048.m7902(m70(), 438, 13, 740));
            C0018.m3933(sbM8368, strM4742);
            C0018.m3933(sbM8368, C0035.m6131(m70(), 451, 7, 2258));
            C0018.m3933(sbM8368, strM7426);
            C0018.m3933(sbM8368, C0022.m4403(m70(), 458, 1, 345));
            strM1327 = C0047.m7763(sbM8368);
        } else {
            if (!C0043.m7277(C0001.m1150(cVar), C0035.m6131(m70(), 459, 5, 457))) {
                return C0007.m1840();
            }
            HashMap mapM4127 = C0019.m4127(C0052.m8337(m70(), 464, 5, 572), C0031.m5565(m70(), 469, 6, 2238), C0038.m6452(m70(), 475, 5, 1126), C0006.m1774(m70(), 480, 6, 3185));
            C0053.m8424(mapM4127, C0024.m4740(m70(), 486, 5, 2850), C0022.m4403(m70(), 491, 5, 2545));
            strM1327 = C0002.m1327(C0008.m1970(m70(), 496, 31, 771), new Object[]{C0065.m9715(mapM4127, C0058.m9115(cVar))});
        }
        return C0009.m2066(cVar, strM1327);
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = (String) C0062.m9431(map, C0053.m8477(m70(), 527, 3, 2955));
        String str2 = (String) C0062.m9431(map, C0048.m7902(m70(), 530, 3, 847));
        String str3 = (String) C0062.m9431(map, C0050.m8131(m70(), 533, 2, 2906));
        String str4 = (String) C0062.m9431(map, C0045.m7657(m70(), 535, 6, 470));
        HashMap mapM4127 = C0019.m4127(C0002.m1305(m70(), 541, 10, 2321), C0042.m7151(m70(), 551, 111, 2417), C0052.m8337(m70(), 662, 7, 1577), C0042.m7151(m70(), 669, 24, 530));
        C0053.m8424(mapM4127, C0013.m3106(m70(), 693, 6, 2702), new String(C0007.m1882(str4)));
        StringBuilder sb = new StringBuilder(C0013.m3106(m70(), 699, 47, 2561));
        C0018.m3933(sb, str);
        C0011.m2747(sb, C0023.m4536(m70(), 746, 5, 1187), str2, C0027.m5062(m70(), 751, 4, 2967), str3);
        C0018.m3933(sb, C0065.m9775(m70(), 755, 19, 1606));
        a aVarM5397 = C0030.m5397(C0010.m2338(C0002.m1300(C0032.m5769(C0047.m7763(sb), mapM4127))));
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Iterator itM3109 = C0013.m3109(C0033.m5873(aVarM5397));
        while (C0012.m2962(itM3109)) {
            c cVar = (c) C0048.m7949(itM3109);
            HashMap mapM41272 = C0019.m4127(C0064.m9599(m70(), 774, 5, 2382), C0051.m8259(m70(), 779, 6, 439), C0040.m6584(m70(), 785, 5, 1849), C0015.m3484(m70(), 790, 6, 2076));
            C0053.m8424(mapM41272, C0035.m6131(m70(), 796, 5, 1635), C0039.m6551(m70(), 801, 5, 1578));
            Iterator itM5199 = C0029.m5199(C0000.m1121(mapM41272));
            while (C0012.m2962(itM5199)) {
                if (C0007.m1815(C0058.m9115(cVar), (String) C0048.m7949(itM5199))) {
                    C0018.m3933(sb3, C0015.m3441(cVar));
                }
            }
        }
        Iterator itM31092 = C0013.m3109(C0049.m8053(aVarM5397));
        while (C0012.m2962(itM31092)) {
            c cVar2 = (c) C0048.m7949(itM31092);
            if (!C0057.m8953(C0058.m9115(cVar2))) {
                C0018.m3933(sb2, C0015.m3441(cVar2));
            }
        }
        String strM7763 = C0047.m7763(sb2);
        String strM77632 = C0047.m7763(sb3);
        C0045.m7549();
        String strM6390 = C0038.m6390(aVarM5397);
        String strM5736 = C0032.m5736(aVarM5397);
        String strM63902 = C0038.m6390(aVarM5397);
        StringBuilder sbM8368 = C0052.m8368(C0037.m6307(m70(), 806, 204, 2233), strM6390, C0030.m5362(m70(), 1010, 20, 1440), strM5736, C0029.m5256(m70(), 1030, 78, 1998));
        C0011.m2747(sbM8368, strM63902, C0049.m8007(m70(), 1108, 17, 424), strM7763, C0055.m8814(m70(), 1125, 1, 2277));
        return new Object[]{C0011.m2808(200), C0013.m3106(m70(), 1143, 20, 2675), new ByteArrayInputStream(C0050.m8115(C0028.m5188(sbM8368, strM77632, C0055.m8814(m70(), 1126, 17, 2428))))};
    }

    /* renamed from: ۟۠ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonArray m65(Object obj, Object obj2) {
        if (C0054.m8557() < 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m66(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۢ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static JsonElement m67(Object obj) {
        if (C0034.m6048() < 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m68(Object obj) {
        if (C0037.m6350() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static JsonElement m69(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m70() {
        if (C0036.m6252() >= 0) {
            return f7short;
        }
        return null;
    }

    /* renamed from: ۟ۥۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m71(Object obj) {
        if (C0047.m7837() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m72(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۣۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonObject m73(Object obj) {
        if (C0036.m6252() > 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۠ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static List m74(Object obj) {
        if (C0003.m1463() <= 0) {
            return g.a((JsonElement) obj);
        }
        return null;
    }

    /* renamed from: ۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m75(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((b) obj).k();
        }
        return null;
    }

    /* renamed from: ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m76(Object obj, int i) {
        if (C0023.m4566() < 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int m77(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۣۨۧۦ, reason: not valid java name and contains not printable characters */
    public static JsonElement m78(Object obj) {
        if (C0003.m1463() < 0) {
            return ((b) obj).g();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM7763 = str;
        if (C0060.m9349(strM7763, C0038.m6452(m70(), 1163, 5, 1808))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0037.m6362(linkedHashMap, C0048.m7902(m70(), 1169, 3, 3170), C0024.m4752(strM7763, C0013.m3106(m70(), 1168, 1, 474))[0]);
            C0037.m6362(linkedHashMap, C0062.m9389(m70(), 1172, 2, 2633), str2);
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder(C0057.m8978(m70(), 1174, 48, 2062));
            C0018.m3933(sb, C0051.m8212(C0055.m8762(this), linkedHashMap));
            Iterator itM3109 = C0013.m3109(m74(m69(m73(m78(C0010.m2338(C0002.m1300(C0032.m5769(C0047.m7763(sb), C0003.m1400()))))), C0065.m9775(m70(), 1222, 5, 2017))));
            while (C0012.m2962(itM3109)) {
                C0004.m1532(arrayList, C0048.m7936((g) C0048.m7949(itM3109)));
            }
            return C0047.m7783(arrayList);
        }
        String strM9585 = C0063.m9585(m70(), 1227, 5, 854);
        String strM8007 = C0058.m9098(map, strM9585) ? (String) C0065.m9715(map, strM9585) : C0049.m8007(m70(), 1232, 9, 3036);
        String strM3332 = C0014.m3332(m70(), 1241, 8, 1529);
        String strM6307 = C0058.m9098(map, strM3332) ? (String) C0065.m9715(map, strM3332) : C0037.m6307(m70(), 1249, 1, 2547);
        String strM33322 = C0014.m3332(m70(), 1250, 3, 955);
        if (C0058.m9098(map, strM33322)) {
            StringBuilder sbM3016 = C0012.m3016(strM7763, C0034.m6001(m70(), 1253, 1, 2661));
            C0018.m3933(sbM3016, (String) C0065.m9715(map, strM33322));
            strM7763 = C0047.m7763(sbM3016);
        }
        StringBuilder sb2 = new StringBuilder(C0003.m1398(m70(), 1254, 79, 2760));
        C0018.m3933(sb2, C0056.m8909(strM7763));
        C0018.m3933(sb2, C0019.m4107(m70(), 1333, 7, 1155));
        C0018.m3933(sb2, strM8007);
        C0018.m3933(sb2, C0048.m7902(m70(), 1340, 10, 2194));
        h hVarM1300 = C0002.m1300(C0032.m5769(C0038.m6434(sb2, strM6307, C0065.m9775(m70(), 1350, 6, 3072), str2), C0003.m1400()));
        ArrayList arrayList2 = new ArrayList();
        Iterator itM31092 = C0013.m3109(m74(m75(C0010.m2338(hVarM1300))));
        while (C0012.m2962(itM31092)) {
            C0004.m1532(arrayList2, C0048.m7936((g) C0048.m7949(itM31092)));
        }
        return C0047.m7783(arrayList2);
    }

    public String detailContent(List<String> list) {
        String strM6131;
        String strM1774;
        String strM2973;
        if (!C0052.m8313(this)) {
            b bVarM2338 = C0010.m2338(C0002.m1300(C0032.m5769(C0017.m3646(m70(), 1356, 44, 2640), C0003.m1400())));
            this.b = C0036.m6214(bVarM2338);
            this.c = C0007.m1887(bVarM2338);
            this.d = C0048.m7933(bVarM2338);
        }
        String[] strArrM4752 = C0024.m4752((String) C0048.m7915(list, 0), C0033.m5852(m70(), 1400, 1, 577));
        String str = strArrM4752[0];
        String str2 = strArrM4752[1];
        b bVarM23382 = C0010.m2338(C0002.m1300(C0032.m5769(C0026.m4915(C0051.m8259(m70(), 1401, 50, 2068), str2), C0003.m1400())));
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, C0033.m5829(bVarM23382));
        C0005.m1628(mVar, C0018.m3925(bVarM23382));
        C0058.m9085(mVar, C0000.m1060(bVarM23382));
        C0027.m5000(mVar, C0030.m5349(bVarM23382));
        C0058.m9159(mVar, C0027.m5079(C0042.m7141(bVarM23382)));
        StringBuilder sb = new StringBuilder();
        C0058.m9141(sb, C0031.m5649(C0048.m7941(bVarM23382)) / 60);
        C0018.m3933(sb, C0031.m5565(m70(), 1451, 2, 951));
        C0019.m4073(mVar, C0047.m7763(sb));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sbM7672 = C0046.m7672(C0032.m5708(m70(), 1453, 47, 468), str2, C0027.m5062(m70(), 1500, 5, 469));
        C0018.m3933(sbM7672, C0030.m5389(bVarM23382));
        C0018.m3933(sbM7672, C0026.m4951(m70(), 1505, 26, 2077));
        b bVarM23383 = C0010.m2338(C0002.m1300(C0032.m5769(C0047.m7763(sbM7672), C0003.m1400())));
        for (int i = 0; i < C0064.m9636(C0002.m1259(bVarM23383)); i++) {
            int iM4690 = C0024.m4690((Integer) C0048.m7915(C0002.m1259(bVarM23383), i));
            if ((C0052.m8313(this) || iM4690 <= 32) && (C0057.m9006(this) || iM4690 <= 80)) {
                C0004.m1532(arrayList2, (Integer) C0048.m7915(C0002.m1259(bVarM23383), i));
                C0004.m1532(arrayList, (String) C0048.m7915(C0015.m3500(bVarM23383), i));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itM3109 = C0013.m3109(C0032.m5699(bVarM23382));
        while (true) {
            boolean zM2962 = C0012.m2962(itM3109);
            strM6131 = C0035.m6131(m70(), 1531, 1, 3227);
            strM1774 = C0006.m1774(m70(), 1532, 1, 1933);
            strM2973 = C0012.m2973(m70(), 1533, 1, 2636);
            if (!zM2962) {
                break;
            }
            e eVar = (e) C0048.m7949(itM3109);
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0016.m3552(eVar));
            C0018.m3933(sb2, strM6131);
            C0018.m3933(sb2, str2);
            C0018.m3933(sb2, strM2973);
            C0018.m3933(sb2, C0063.m9568(eVar));
            C0018.m3933(sb2, strM2973);
            C0018.m3933(sb2, C0036.m6194(strM1774, arrayList2));
            C0018.m3933(sb2, strM2973);
            C0018.m3933(sb2, C0036.m6194(strM1774, arrayList));
            C0004.m1532(arrayList3, C0047.m7763(sb2));
        }
        String strM1842 = C0007.m1842(m70(), 1534, 1, 1547);
        C0037.m6362(linkedHashMap, C0044.m7509(m70(), 1535, 2, 1658), C0036.m6194(strM1842, arrayList3));
        ArrayList arrayList4 = new ArrayList();
        JsonArray jsonArrayM65 = m65(m73(m67(C0032.m5769(C0026.m4915(C0040.m6584(m70(), 1537, 62, 1157), str), C0003.m1400()))), C0058.m9106(m70(), 1599, 4, 2042));
        for (int i2 = 0; i2 < m66(jsonArrayM65); i2++) {
            JsonObject jsonObjectM73 = m73(m76(jsonArrayM65, i2));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, m71(m69(jsonObjectM73, C0011.m2805(m70(), 1603, 5, 339))));
            C0018.m3933(sb3, strM6131);
            C0036.m6177(sb3, m77(m69(jsonObjectM73, C0004.m1549(m70(), 1608, 3, 2050))));
            C0018.m3933(sb3, strM2973);
            C0036.m6177(sb3, m77(m69(jsonObjectM73, C0041.m6779(m70(), 1611, 3, 1212))));
            C0018.m3933(sb3, strM2973);
            C0018.m3933(sb3, C0036.m6194(strM1774, arrayList2));
            C0018.m3933(sb3, strM2973);
            C0018.m3933(sb3, C0036.m6194(strM1774, arrayList));
            C0004.m1532(arrayList4, C0047.m7763(sb3));
        }
        C0037.m6362(linkedHashMap, C0026.m4951(m70(), 1614, 2, 1752), C0036.m6194(strM1842, arrayList4));
        Set setM3352 = C0014.m3352(linkedHashMap);
        String strM5109 = C0028.m5109(m70(), 1616, 3, 1463);
        C0054.m8596(mVar, C0036.m6194(strM5109, setM3352));
        C0044.m7449(mVar, C0036.m6194(strM5109, C0053.m8457(linkedHashMap)));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        JsonObject jsonObjectM6209 = C0036.m6209(this);
        String strM6188 = C0036.m6188(m70(), 1619, 4, 2745);
        String str = null;
        if (m72(jsonObjectM6209, strM6188)) {
            return C0032.m5769(m71(m69(C0036.m6209(this), strM6188)), null);
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArrM4752 = C0024.m4752(m71(m69(C0036.m6209(this), C0051.m8259(m70(), 1623, 4, 3244))), C0050.m8131(m70(), 1627, 1, 2332));
        int length = strArrM4752.length;
        int i = 0;
        while (i < length) {
            String str2 = strArrM4752[i];
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.b(str2, str2, str));
            ArrayList arrayList2 = new ArrayList();
            C0004.m1532(arrayList2, new d(C0046.m7718(m70(), 1673, 5, 1190), C0054.m8574(m70(), 1678, 2, 952), C0001.m1203(new com.github.catvod.spider.merge.E.c[]{new com.github.catvod.spider.merge.E.c(C0002.m1305(m70(), 1628, 2, 2306), C0049.m8007(m70(), 1630, 9, 1931)), new com.github.catvod.spider.merge.E.c(C0062.m9389(m70(), 1639, 4, 2336), C0024.m4740(m70(), 1643, 5, 1778)), new com.github.catvod.spider.merge.E.c(C0042.m7151(m70(), 1648, 4, 1493), C0032.m5708(m70(), 1652, 7, 649)), new com.github.catvod.spider.merge.E.c(C0000.m1077(m70(), 1659, 4, 1603), C0003.m1398(m70(), 1663, 2, 1730)), new com.github.catvod.spider.merge.E.c(C0016.m3525(m70(), 1665, 4, 1671), C0021.m4340(m70(), 1669, 4, 615))})));
            C0004.m1532(arrayList2, new d(C0001.m1189(m70(), 1715, 8, 2925), C0053.m8477(m70(), 1723, 2, 489), C0001.m1203(new com.github.catvod.spider.merge.E.c[]{new com.github.catvod.spider.merge.E.c(C0046.m7718(m70(), 1680, 4, 1216), C0019.m4107(m70(), 1684, 1, 1179)), new com.github.catvod.spider.merge.E.c(C0016.m3525(m70(), 1685, 6, 1219), C0024.m4740(m70(), 1691, 1, 763)), new com.github.catvod.spider.merge.E.c(C0038.m6452(m70(), 1692, 7, 2982), C0042.m7151(m70(), 1699, 1, 2680)), new com.github.catvod.spider.merge.E.c(C0030.m5362(m70(), 1700, 7, 544), C0033.m5852(m70(), 1707, 1, 1721)), new com.github.catvod.spider.merge.E.c(C0028.m5109(m70(), 1708, 6, 2861), C0044.m7509(m70(), 1714, 1, 3081))})));
            C0037.m6362(linkedHashMap, str2, arrayList2);
            i++;
            str = null;
        }
        return C0015.m3468(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        h hVarM1300 = C0002.m1300(C0032.m5769(C0011.m2805(m70(), 1725, 54, 2831), C0003.m1400()));
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(m74(m78(C0010.m2338(hVarM1300))));
        while (C0012.m2962(itM3109)) {
            C0004.m1532(arrayList, C0048.m7936((g) C0048.m7949(itM3109)));
        }
        return C0047.m7783(arrayList);
    }

    public void init(Context context, String str) {
        JsonObject jsonObjectM68 = m68(str);
        this.a = jsonObjectM68;
        String strM71 = m71(m69(jsonObjectM68, C0015.m3484(m70(), 1779, 6, 3164)));
        e = strM71;
        if (C0043.m7277(strM71, C0035.m6131(m70(), 1785, 4, 920))) {
            e = C0064.m9640(C0032.m5769(C0051.m8241(), null));
        }
        if (C0043.m7327(C0051.m8241())) {
            e = C0058.m9105(C0002.m1247(C0023.m4536(m70(), 1789, 8, 2978)));
        }
        if (C0043.m7327(C0051.m8241())) {
            e = C0012.m2973(m70(), 1797, 53, 2220);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrM4752 = C0024.m4752(str2, C0041.m6779(m70(), 1850, 2, 692));
        String str3 = strArrM4752[0];
        String str4 = strArrM4752[1];
        String str5 = strArrM4752[3];
        String strM4740 = C0024.m4740(m70(), 1852, 1, 1283);
        String[] strArrM47522 = C0024.m4752(str5, strM4740);
        String[] strArrM47523 = C0024.m4752(strArrM4752[2], strM4740);
        ArrayList arrayList = new ArrayList();
        String strM8125 = C0050.m8125(C0063.m9585(m70(), 1853, 45, 1430), str4);
        for (int i = 0; i < strArrM47522.length; i++) {
            C0004.m1532(arrayList, strArrM47522[i]);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0051.m8217());
            C0018.m3933(sb, C0021.m4340(m70(), 1898, 13, 1102));
            C0018.m3933(sb, str3);
            C0018.m3933(sb, C0037.m6307(m70(), 1911, 5, 721));
            C0018.m3933(sb, str4);
            C0018.m3933(sb, C0051.m8259(m70(), 1916, 4, 2695));
            C0018.m3933(sb, strArrM47523[i]);
            C0018.m3933(sb, C0042.m7151(m70(), 1920, 9, 3000));
            C0004.m1532(arrayList, C0047.m7763(sb));
        }
        com.github.catvod.spider.merge.E.g gVar = new com.github.catvod.spider.merge.E.g();
        C0020.m4226(gVar, arrayList);
        C0002.m1282(gVar, strM8125);
        C0034.m6049(gVar);
        C0057.m9029(gVar, C0003.m1400());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0060.m9297(this, str, C0048.m7902(m70(), 1929, 1, 2684), true, new HashMap());
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0060.m9297(this, str, str2, true, new HashMap());
    }
}