package com.github.catvod.spider.merge.a0;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.UrlQuerySanitizer;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.github.catvod.spider.merge.a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f721short = {1243, 1238, 1235, 1219, 1231, 1236, 1848, 1893, 1892, 1890, 1879, 1816, 1802, 1802, 1507, 1470, 1454, 1454, 1413, 1496, 1503, 1479, 2865, 2923, 2923, 2930, 2931, 1154, 1155, 1173, 631, 593, 583, 592, 527, 611, 581, 583, 588, 598, 2488, 2458, 2447, 2460, 2457, 2457, 2452, 2522, 2496, 2523, 2501, 2517, 2525, 2466, 2460, 2459, 2449, 2458, 2434, 2438, 2517, 2491, 2465, 2517, 2500, 2501, 2523, 2501, 2510, 2517, 2466, 2460, 2459, 2499, 2497, 2510, 2517, 2445, 2499, 2497, 2524, 2517, 2484, 2437, 2437, 2457, 2448, 2466, 2448, 2455, 2494, 2460, 2433, 2522, 2496, 2502, 2498, 2523, 2502, 2499, 2517, 2525, 2494, 2493, 2465, 2488, 2489, 2521, 2517, 2457, 2460, 2462, 2448, 2517, 2482, 2448, 2454, 2462, 2458, 2524, 2517, 2486, 2461, 2439, 2458, 2456, 2448, 2522, 2500, 2503, 2503, 2523, 2501, 2523, 2501, 2523, 2501, 2517, 2470, 2452, 2451, 2452, 2439, 2460, 2522, 2496, 2502, 2498, 2523, 2502, 2499, 2040, 1999, 1996, 1999, 2008, 1999, 2008, 2076, 2048, 2048, 2052, 2055, 2126, 2139, 2139, 2051, 2051, 2051, 2138, 2069, 2072, 2077, 2061, 2049, 2074, 2064, 2054, 2077, 2050, 2065, 2138, 2071, 2075, 2073, 2139, 1062, 1149, 1142, 1060, 1144, 1141, 1136, 1087, 1133, 1120, 1129, 1148, 1060, 1135, 1136, 1149, 1148, 1142, 1087, 1146, 1144, 1133, 1148, 1060, 1084, 1130, 1087, 1130, 1137, 1144, 1131, 1148, 1104, 1149, 1060, 1084, 1130, 1087, 1151, 1136, 1141, 1148, 1104, 1149, 1060, 1084, 1130, 1087, 1133, 1148, 1140, 1129, 1141, 1144, 1133, 1148, 1104, 1149, 1060, 1084, 1130, 1165, 1167, 1176, 1163, 1172, 1176, 1162, 1874, 1874, 1874, 992, 955, 944, 994, 958, 947, 950, 1017, 939, 934, 943, 954, 994, 940, 938, 957, 1017, 940, 951, 958, 941, 954, 918, 955, 994, 2629, 2565, 2570, 2575, 2566, 2602, 2567, 2654, 1498, 1423, 1485, 1489, 1489, 1423, 1479, 1498, 1490, 1483, 1488, 1479, 1489, 3287, 3294, 3247, 1145, 1125, 1125, 1121, 1122, 2456, 2436, 2436, 2432, 2435, 2506, 2527, 2527, 2449, 2432, 2457, 2526, 2449, 2460, 2457, 2441, 2437, 2462, 2452, 2434, 2457, 2438, 2453, 2526, 2451, 2463, 2461, 2527, 2168, 2522, 2497, 2504, 2468, 2491, 2492, 2495, 1101, 1100, 1118, 1077, 1056, 3179, 3191, 3191, 3187, 3184, 3129, 3116, 3116, 3170, 3187, 3178, 3117, 3195, 3179, 3180, 3173, 3174, 3117, 3191, 3180, 3187, 3116, 3170, 3183, 3178, 3184, 3191, 3116, 3170, 3183, 3178, 3164, 3180, 3187, 3174, 3181, 3116, 2677, 2529, 2522, 2522, 2453, 2552, 2516, 2523, 2508, 2453, 2535, 2512, 2500, 2496, 2512, 2502, 2497, 2502, 28466, 28466, 30020, 22018, -727, 625, 586, 586, 517, 616, 580, 587, 604, 517, 631, 576, 596, 592, 576, 598, 593, 598, 12839, 1562, 1542, 1542, 1538, 1537, 2948, 2968, 2968, 2972, 2975, 3030, 3011, 3011, 2957, 2972, 2949, 3010, 2957, 2944, 2949, 2965, 2969, 2946, 2952, 2974, 2949, 2970, 2953, 3010, 2959, 2947, 2945, 3011, 787, 796, 793, 784, 858, 793, 796, 774, 769, 2823, 2898, 2828, 2839, 2846, 2829, 2842, 2898, 2827, 2832, 2836, 2842, 2833, 758, 643, 749, 719, 704, 719, 732, 727, 3096, 3095, 3090, 3102, 3093, 3087, 3142, 3130, 3093, 3103, 3081, 3092, 3090, 3103, 3159, 3098, 3083, 3083, 3142, 3098, 3103, 3081, 3090, 3085, 3102, 3159, 3085, 3102, 3081, 3080, 3090, 3092, 3093, 3142, 3085, 3151, 3157, 3144, 3157, 3146, 2255, 1269, 1239, 1222, 1170, 1270, 1216, 1243, 1220, 1239, 1170, 1275, 1238, 1180, 1180, 1180, 1824, 1830, 3285, 3273, 3273, 3277, 3278, 3207, 3218, 3218, 3272, 3278, 3288, 3279, 3219, 3292, 3281, 3284, 3268, 3272, 3283, 3289, 3279, 3284, 3275, 3288, 3219, 3294, 3282, 3280, 3218, 3275, 3215, 3218, 3272, 3278, 3288, 3279, 3218, 3290, 3288, 3273, 1288, 1316, 1339, 1330, 1381, 1381, 1381, 2545, 2472, 2552, 2543, 2555, 2559, 2543, 2553, 2558, 2553, 2472, 2480, 2513, 2545, 2472, 2536, 2533, 2542, 2547, 2472, 2480, 2545, 2472, 2540, 2531, 2534, 2543, 2517, 2531, 2542, 2472, 2480, 2472, 2870, 2872, 2870, 2919, 2940, 2933, 2918, 2929, 2891, 2941, 2928, 2870, 2862, 2870, 2740, 2746, 2740, 2807, 2787, 2786, 2809, 2761, 2788, 2803, 2808, 2807, 2811, 2803, 2740, 2732, 2786, 2788, 2787, 2803, 2746, 2740, 2786, 2809, 2761, 2790, 2807, 2788, 2803, 2808, 2786, 2761, 2800, 2815, 2810, 2803, 2761, 2815, 2802, 2740, 2732, 2740, 2788, 2809, 2809, 2786, 2740, 2746, 2740, 2786, 2809, 2761, 2802, 2788, 2815, 2784, 2803, 2761, 2815, 2802, 2740, 2732, 2740, 1158, 1241, 1160, 1158, 1228, 1217, 1221, 1216, 1217, 1238, 1239, 1158, 1182, 1247, 1158, 1255, 1227, 1226, 1232, 1217, 1226, 1232, 1161, 1264, 1245, 1236, 1217, 1158, 1182, 1158, 1221, 1236, 1236, 1224, 1229, 1223, 1221, 1232, 1229, 1227, 1226, 1163, 1230, 1239, 1227, 1226, 1158, 1241, 1160, 1158, 1229, 1216, 1158, 1182, 1158, 1172, 1158, 1160, 1158, 1225, 1217, 1232, 1228, 1227, 1216, 1158, 1182, 1158, 1268, 1259, 1271, 1264, 1158, 1160, 1158, 1233, 1238, 1224, 1158, 1182, 1158, 1163, 1218, 1229, 1224, 1217, 1163, 1223, 1227, 1236, 1245, 1158, 1241, 1273, 1160, 1158, 1238, 1217, 1239, 1227, 1233, 1238, 1223, 1217, 1158, 1182, 1158, 1218, 1229, 1224, 1217, 1158, 1241, 303, 298, 316, 295, 312, 299, 353, 312, 380, 353, 300, 303, 314, 301, 294, 2042, 2040, 2025, 2009, 2034, 2026, 2035, 2033, 2034, 2044, 2041, 1992, 2031, 2033, 1971, 1971, 1971, 2446, 2433, 2436, 2445, 2487, 2433, 2444, 1649, 1639, 1660, 1635, 1648, 1610, 1660, 1649, 697, 676, 684, 693, 686, 697, 643, 687, 697, 703, 2125, 2130, 2119, 2124, 2148, 2123, 2126, 2119, 2061, 2117, 2119, 2134, 2150, 2125, 2133, 2124, 2126, 2125, 2115, 2118, 2167, 2128, 2126, 1290, 1375, 1281, 1306, 1299, 1280, 1303, 1375, 1286, 1309, 1305, 1303, 1308, 2045, 1928, 2022, 1988, 1995, 1988, 2007, 2012, 494, 481, 484, 488, 483, 505, 432, 460, 483, 489, 511, 482, 484, 489, 417, 492, 509, 509, 432, 492, 489, 511, 484, 507, 488, 417, 507, 488, 511, 510, 484, 482, 483, 432, 507, 441, 419, 446, 419, 444, 1368, 2799, 2811, 2810, 2790, 2785, 2812, 2791, 2804, 2799, 2810, 2791, 2785, 2784, 1050, 1474, 2802, 2727, 2789, 2809, 2809, 2727, 2799, 2802, 2810, 2787, 2808, 2799, 2809, 3169, 3130, 3121, 3171, 3135, 3122, 3127, 3192, 3114, 
    3111, 3118, 3131, 3171, 3112, 3127, 3130, 3131, 3121, 3192, 3133, 3135, 3114, 3131, 3171, 3195, 3117, 3192, 3117, 3126, 3135, 3116, 3131, 3095, 3130, 3171, 3195, 3117, 3192, 3128, 3127, 3122, 3131, 3095, 3130, 3171, 3195, 3117, 3192, 3114, 3131, 3123, 3118, 3122, 3135, 3114, 3131, 3095, 3130, 3171, 3195, 3117, 3192, 3123, 3131, 3130, 3127, 3135, 3095, 3130, 3171, 3195, 3117, 1993, 1943, 2001, 1948, 2831, 3135, 3133, 3116, 3166, 3159, 3095, 3097, 3085, 3084, 3088, 3159, 3097, 3085, 3084, 3088, 3095, 3082, 3089, 3074, 3101, 3166, 2268, 2198, 2249, 2185, 2184, 2188, 2190, 2206, 2253, 2186, 2254, 2248, 2198, 2250, 2206, 2250, 2178, 2251, 2191, 2242, 2206, 2253, 2179, 2201, 2242, 2179, 2207, 2243, 2193, 2193, 2195, 2254, 2206, 3012, 3032, 3032, 3036, 3039, 2966, 2947, 2947, 3011, 3036, 3017, 3010, 2945, 3021, 3036, 3013, 2945, 3016, 3038, 3013, 3034, 3017, 2946, 3033, 3023, 2946, 3023, 3010, 2947, 3011, 3021, 3033, 3032, 3012, 2947, 3021, 3033, 3032, 3012, 3011, 3038, 3013, 3030, 3017, 2963, 3038, 3017, 3037, 3059, 3013, 3016, 2961, 825, 894, 892, 892, 890, 876, 876, 832, 875, 880, 884, 890, 881, 802, 825, 894, 879, 879, 832, 873, 890, 877, 802, 814, 817, 809, 817, 807, 825, 891, 890, 873, 886, 892, 890, 832, 886, 891, 802, 2498, 2432, 2433, 2450, 2445, 2439, 2433, 2491, 2438, 2454, 2437, 2442, 2432, 2521, 2450, 2445, 2450, 2443, 2498, 2452, 2440, 2437, 2448, 2434, 2443, 2454, 2441, 2521, 2448, 2450, 2498, 2432, 2433, 2450, 2445, 2439, 2433, 2491, 2442, 2437, 2441, 2433, 2521, 2482, 2518, 2518, 2519, 2524, 2469, 2498, 2432, 2433, 2450, 2445, 2439, 2433, 2491, 2441, 2443, 2432, 2433, 2440, 2521, 2482, 2518, 2518, 2519, 2524, 2469, 2498, 2438, 2449, 2445, 2440, 2432, 2491, 2432, 2433, 2450, 2445, 2439, 2433, 2521, 2482, 2518, 2518, 2519, 2524, 2469, 2498, 2438, 2449, 2445, 2440, 2432, 2491, 2452, 2454, 2443, 2432, 2449, 2439, 2448, 2521, 2482, 2518, 2518, 2519, 2524, 2469, 2498, 2432, 2433, 2450, 2445, 2439, 2433, 2491, 2435, 2452, 2449, 2521, 2469, 2432, 2454, 2433, 2442, 2443, 2511, 2497, 2518, 2524, 2480, 2473, 2497, 2518, 2525, 2511, 2514, 2512, 2516, 2498, 2437, 2439, 2448, 2445, 2450, 2445, 2448, 2461, 2491, 2454, 2433, 2439, 2448, 2521, 2497, 2515, 2470, 2497, 2515, 2464, 2498, 2439, 2444, 2437, 2442, 2442, 2433, 2440, 2521, 2481, 2471, 2480, 2482, 2475, 2466, 2466, 2477, 2471, 2477, 2469, 2472, 2483, 2465, 2470, 2498, 2437, 2449, 2448, 2444, 2491, 2448, 2461, 2452, 2433, 2521, 2439, 2443, 2432, 2433, 2498, 2439, 2440, 2445, 2433, 2442, 2448, 2491, 2445, 2432, 2521, 2513, 2437, 2439, 2434, 2524, 2524, 2518, 2432, 2518, 2515, 2438, 2515, 2512, 2513, 2516, 2518, 2438, 2515, 2516, 2512, 2516, 2438, 2516, 2439, 2514, 2513, 2513, 2517, 2525, 2437, 2437, 2515, 2498, 2455, 2439, 2443, 2452, 2433, 2521, 2442, 2433, 2448, 2432, 2445, 2455, 2447, 2498, 2453, 2454, 2439, 2443, 2432, 2433, 2521, 2517, 2498, 2453, 2454, 2491, 2451, 2445, 2432, 2448, 2444, 2521, 2512, 2514, 2516, 2498, 2453, 2454, 2491, 2444, 2433, 2445, 2435, 2444, 2448, 2521, 2512, 2514, 2516, 540, 570, 556, 571, 612, 520, 558, 556, 551, 573, 1888, 1858, 1879, 1860, 1857, 1857, 1868, 1794, 1816, 1795, 1821, 1805, 1797, 1889, 1860, 1859, 1880, 1877, 1814, 1805, 1912, 1814, 1805, 1900, 1859, 1865, 1887, 1858, 1860, 1865, 1805, 1820, 1823, 1814, 1805, 1879, 1861, 1792, 1870, 1859, 1814, 1805, 1915, 1823, 1823, 1822, 1813, 1900, 1805, 1903, 1880, 1860, 1857, 1865, 1794, 1915, 1817, 1820, 1818, 1892, 1919, 1796, 1805, 1900, 1885, 1885, 1857, 1864, 1914, 1864, 1871, 1894, 1860, 1881, 1794, 1816, 1822, 1822, 1795, 1820, 1805, 1797, 1894, 1893, 1913, 1888, 1889, 1793, 1805, 1857, 1860, 1862, 1864, 1805, 1898, 1864, 1870, 1862, 1858, 1796, 1805, 1888, 1858, 1871, 1860, 1857, 1864, 1805, 1918, 1868, 1867, 1868, 1887, 1860, 1794, 1816, 1822, 1822, 1795, 1820, 2338, 2423, 2346, 2363, 2356, 2423, 2350, 2359, 3153, 3076, 3161, 3144, 3143, 3076, 3165, 3142, 3138, 3148, 3143, 3282, 3294, 3295, 3269, 3284, 3295, 3269, 3228, 3269, 3272, 3265, 3284, 868, 885, 872, 868, 831, 864, 892, 881, 889, 894, 811, 883, 888, 881, 866, 867, 885, 868, 813, 837, 836, 854, 829, 808, 1686, 1731, 1694, 1679, 1664, 1731, 1677, 1666, 1671, 1675, 1664, 1690, 1731, 1671, 1674, 1827, 1911, 1909, 1904, 1838, 1838, 1828, 1906, 1828, 1825, 1908, 1825, 1826, 1827, 1830, 1828, 1908, 1825, 1830, 1826, 1830, 1908, 1830, 1909, 1824, 1827, 1827, 1831, 1839, 1911, 1911, 1825, 407, 403, 387, 404, 415, 441, 402, 393, 397, 387, 392, 3186, 3185, 3164, 3175, 3170, 3191, 3170, 2524, 2526, 2511, 2541, 2514, 2527, 2526, 2516, 2539, 2505, 2526, 2509, 2514, 2526, 2508, 2539, 2519, 2522, 2498, 2546, 2517, 2525, 2516, 2453, 2453, 2453, 671, 656, 661, 668, 678, 656, 669, 2976, 2998, 2989, 2994, 2977, 2971, 2989, 2976, 3147, 3145, 3164, 3149, 3151, 3143, 3162, 3153, 1373, 1368, 1351, 1364, 1390, 1349, 1347, 1360, 1375, 1346, 1362, 1374, 1365, 1368, 1375, 1366, 1120, 1127, 1145, 1098, 1136, 1133, 1125, 1148, 1127, 1136, 1098, 1126, 1136, 1142, 2974, 2945, 2964, 2975, 2999, 2968, 2973, 2964, 3038, 2966, 2964, 2949, 2983, 2968, 2965, 2964, 2974, 2977, 2947, 2964, 2951, 2968, 2964, 2950, 2977, 2973, 2960, 2952, 3000, 2975, 2967, 2974, 1957, 2044, 1964, 1979, 1967, 1921, 1975, 1978, 2044, 2020, 2044, 2717, 2699, 2760, 2689, 2694, 2689, 2716, 2749, 2715, 2701, 2714, 2721, 2694, 2702, 2695, 2758, 2758, 2758, 1360, 1350, 1285, 1350, 1354, 1354, 1358, 1356, 1344, 1285, 1347, 1367, 1354, 1352, 1285, 1344, 1373, 1361, 1285, 1356, 1366, 1285, 1344, 1352, 1365, 1361, 1372, 1291, 1291, 1291, 436, 2256, 2201, 2206, 2201, 2180, 2213, 2195, 2256, 2270, 2270, 2270, 21397, 24549, 2201, 2200, 2190, 2222, 2214, 2273, 20815, 18112, 27744, -31942, -26368, 32438, 14540, 28456, 21364, -26366, 2469, 2483, 2436, 2483, 2495, 2495, 2491, 2489, 2485, 18410, 29610, 1899, 1917, 1917, 1905, 1905, 1909, 1911, 1915, 18724, 32100, 1805, 1820, 1820, 1792, 1797, 1807, 1805, 1816, 1797, 1795, 1794, 1859, 1798, 1823, 1795, 1794, 679, 681, 679, 740, 757, 757, 
    730, 755, 736, 759, 679, 703, 679, 692, 683, 691, 683, 701, 679, 681, 679, 737, 736, 755, 748, 742, 736, 730, 748, 737, 679, 703, 679, 742, 692, 739, 743, 691, 701, 692, 688, 691, 743, 689, 742, 689, 742, 691, 688, 695, 700, 742, 691, 693, 742, 689, 695, 688, 688, 692, 739, 739, 736, 736, 736, 679, 681, 679, 737, 736, 755, 748, 742, 736, 730, 743, 759, 740, 747, 737, 679, 703, 679, 755, 748, 755, 746, 679, 681, 679, 757, 745, 740, 753, 739, 746, 759, 744, 679, 703, 679, 753, 755, 679, 681, 679, 737, 736, 755, 748, 742, 736, 730, 747, 740, 744, 736, 679, 703, 679, 723, 695, 695, 694, 701, 708, 679, 681, 679, 737, 736, 755, 748, 742, 736, 730, 744, 746, 737, 736, 745, 679, 703, 679, 723, 695, 695, 694, 701, 708, 679, 681, 679, 743, 752, 748, 745, 737, 730, 737, 736, 755, 748, 742, 736, 679, 703, 679, 723, 695, 695, 694, 701, 708, 679, 681, 679, 743, 752, 748, 745, 737, 730, 757, 759, 746, 737, 752, 742, 753, 679, 703, 679, 723, 695, 695, 694, 701, 708, 679, 681, 679, 737, 736, 755, 748, 742, 736, 730, 738, 757, 752, 679, 703, 679, 708, 737, 759, 736, 747, 746, 672, 695, 693, 685, 721, 712, 684, 672, 695, 693, 691, 689, 693, 679, 681, 679, 740, 742, 753, 748, 755, 748, 753, 764, 730, 759, 736, 742, 753, 679, 703, 679, 672, 690, 711, 672, 690, 705, 679, 681, 679, 742, 749, 740, 747, 747, 736, 745, 679, 703, 679, 720, 710, 721, 723, 714, 707, 707, 716, 710, 716, 708, 713, 722, 704, 711, 679, 681, 679, 742, 746, 737, 736, 679, 703, 679, 2553, 2470, 867, 895, 895, 891, 817, 804, 804, 874, 891, 866, 805, 878, 883, 895, 888, 872, 889, 878, 878, 869, 805, 872, 868, 870, 804, 894, 872, 879, 889, 866, 893, 878, 804, 895, 868, 864, 878, 869, 1999, 2025, 2047, 2024, 1975, 2011, 2045, 2047, 2036, 2030, 405, 439, 418, 433, 436, 436, 441, 503, 493, 502, 488, 504, 496, 404, 433, 438, 429, 416, 483, 504, 397, 483, 504, 409, 438, 444, 426, 439, 433, 444, 504, 489, 490, 483, 504, 418, 432, 501, 443, 438, 483, 504, 398, 490, 490, 491, 480, 409, 504, 410, 429, 433, 436, 444, 503, 398, 492, 489, 495, 401, 394, 497, 504, 409, 424, 424, 436, 445, 399, 445, 442, 403, 433, 428, 503, 493, 491, 491, 502, 489, 504, 496, 403, 400, 396, 405, 404, 500, 504, 436, 433, 435, 445, 504, 415, 445, 443, 435, 439, 497, 504, 405, 439, 442, 433, 436, 445, 504, 395, 441, 446, 441, 426, 433, 503, 493, 491, 491, 502, 489, 2874, 2838, 2839, 2839, 2844, 2842, 2829, 2832, 2838, 2839, 1101, 1123, 1123, 1142, 1067, 1095, 1130, 1135, 1136, 1123, 1195, 1161, 1161, 1167, 1178, 1182, 1223, 1199, 1156, 1161, 1157, 1166, 1155, 1156, 1165, 2750, 2723, 2736, 2729, 1831, 1803, 1802, 1808, 1793, 1802, 1808, 1865, 1840, 1821, 1812, 1793, 1555, 1538, 1538, 1566, 1563, 1553, 1555, 1542, 1563, 1565, 1564, 1629, 1560, 1537, 1565, 1564, 1609, 1618, 1553, 1562, 1555, 1536, 1537, 1559, 1542, 1615, 1543, 1542, 1556, 1631, 1610, 2213, 2209, 2918, 2915, 2934, 2915, 1077, 1079, 1079, 1073, 1063, 1063, 1035, 1056, 1083, 1087, 1073, 1082, 1874, 1879, 1875, 1879, 1866, 2945, 2970, 2963, 2944, 2967, 2989, 2971, 2966, 1729, 1744, 1731, 1748, 1759, 1733, 1774, 1751, 1752, 1757, 1748, 1774, 1752, 1749, 1342, 1315, 1333, 1332, 1315, 1294, 1331, 1320, 1565, 1554, 1566, 1558, 630, 619, 637, 636, 619, 582, 637, 624, 619, 636, 634, 621, 624, 630, 631, 1918, 1900, 1916, 796, 784, 771, 794, 788, 771, 1485, 1480, 1502, 1477, 1498, 1481, 1411, 1498, 1439, 1411, 1482, 1477, 1472, 1481, 1411, 1472, 1477, 1503, 1496, 787, 794, 793, 785, 784, 775, 1785, 1766, 1771, 1770, 1760, 2587, 2575, 2590, 2579, 2581, 1374, 1346, 1346, 1350, 1349, 2820, 2840, 2840, 2844, 2847, 2902, 2883, 2883, 2819, 2844, 2825, 2818, 2882, 2829, 2816, 2821, 2837, 2841, 2818, 2824, 2846, 2821, 2842, 2825, 2882, 2831, 2819, 2817, 2883, 2829, 2824, 2846, 2821, 2842, 2825, 2883, 2842, 2909, 2882, 2908, 2883, 2506, 2526, 2527, 2499, 2500, 2521, 2498, 2513, 2506, 2527, 2498, 2500, 2501, 2276, 1818, 1807, 1820, 1811, 1801, 1826, 1801, 1796, 1805, 1816, 786, 796, 808, 809, 821, 893, 783, 824, 812, 808, 824, 814, 809, 883, 883, 883, 1265, 1253, 1252, 1272, 1279, 1250, 1273, 1258, 1269, 1205, 1189, 1193, 1206, 1187, 619, 621, 635, 620, 548, 636, 639, 621, 635, 562, 632, 631, 626, 635, 548, 639, 626, 626, 548, 620, 635, 639, 634, 562, 632, 631, 626, 635, 548, 639, 626, 626, 548, 617, 620, 631, 618, 635, 1366, 1354, 1354, 1358, 1357, 1284, 1297, 1297, 1361, 1358, 1371, 1360, 1296, 1375, 1362, 1367, 1351, 1355, 1360, 1370, 1356, 1367, 1352, 1371, 1296, 1373, 1361, 1363, 1297, 1361, 1375, 1355, 1354, 1366, 1297, 1355, 1357, 1371, 1356, 1357, 1297, 1375, 1355, 1354, 1366, 1361, 1356, 1367, 1348, 1371, 1281, 1373, 1362, 1367, 1371, 1360, 1354, 1377, 1367, 1370, 1283, 1289, 1288, 1287, 1295, 1289, 1373, 1373, 1373, 1373, 1370, 1290, 1290, 1290, 1295, 1373, 1293, 1287, 1290, 1291, 1289, 1375, 1294, 1290, 1368, 1288, 1294, 1286, 1290, 1368, 1372, 1292, 1368, 1304, 1356, 1371, 1370, 1367, 1356, 1371, 1373, 1354, 1377, 1355, 1356, 1367, 1283, 1366, 1354, 1354, 1358, 1357, 1284, 1297, 1297, 1375, 1362, 1367, 1357, 1354, 1296, 1360, 1360, 1296, 1373, 1367, 1297, 1354, 1361, 1361, 1362, 1297, 1375, 1362, 1367, 1351, 1355, 1360, 1370, 1356, 1367, 1352, 1371, 1297, 1373, 1375, 1362, 1362, 1372, 1375, 1373, 1365, 1304, 1357, 1373, 1361, 1358, 1371, 1283, 1355, 1357, 1371, 1356, 1284, 1372, 1375, 1357, 1371, 1298, 1368, 1367, 1362, 1371, 1284, 1375, 1362, 1362, 1284, 1356, 1371, 1375, 1370, 1298, 1368, 1367, 1362, 1371, 1284, 1375, 1362, 1362, 1284, 1353, 1356, 1367, 1354, 1371, 1304, 1357, 1354, 1375, 1354, 1371, 
    1283, 2391, 2393, 2413, 2412, 2416, 2360, 2378, 2429, 2428, 2417, 2410, 2429, 2427, 2412, 2358, 2358, 2358, 1989, 1993, 1986, 1987, 2875, 2863, 2862, 2866, 2869, 2856, 2867, 2848, 2875, 2862, 2867, 2869, 2868, 2821, 2873, 2869, 2878, 2879, 1644, 1659, 1656, 1644, 1659, 1645, 1654, 1617, 1646, 1659, 1648, 1610, 1649, 1653, 1659, 1648, 1584, 1584, 1584, 886, 865, 866, 886, 865, 887, 876, 859, 880, 875, 879, 865, 874, 2781, 2758, 2754, 2764, 2759, 1908, 1891, 1888, 1908, 1891, 1909, 1902, 1881, 1906, 1897, 1901, 1891, 1896, 1414, 1425, 1426, 1414, 1425, 1415, 1436, 1461, 1431, 1431, 1425, 1415, 1415, 1440, 1435, 1439, 1425, 1434, 1498, 1498, 1498, 2254, 2258, 2258, 2262, 3276, 3289, 3274, 3269, 3295, 3316, 3295, 3282, 3291, 3278, 3118, 3122, 3122, 3126, 3125, 3196, 3177, 3177, 3111, 3123, 3122, 3118, 3176, 3111, 3114, 3119, 3135, 3123, 3112, 3106, 3124, 3119, 3120, 3107, 3176, 3109, 3113, 3115, 3177, 3120, 3188, 3177, 3111, 3109, 3109, 3113, 3123, 3112, 3122, 3177, 3122, 3113, 3117, 3107, 3112, 2978, 2997, 2998, 2978, 2997, 2979, 3000, 2947, 3000, 2993, 2978, 2997, 2948, 3007, 3003, 2997, 3006, 3070, 3070, 3070, 1631, 1604, 1613, 1630, 1609, 1651, 1605, 1608, 1695, 1668, 1677, 1694, 1673, 1715, 1692, 1691, 1672, 2513, 2453, 2440, 2516, 2511, 2502, 2517, 2498, 2552, 2507, 2510, 2505, 2508, 2440, 2496, 2498, 2515, 2552, 2516, 2511, 2502, 2517, 2498, 2552, 2515, 2504, 2508, 2498, 2505, 18350, 28274, 23886, -2268, -32166, 23086, 18051, 21978, 20761, 28000, 14378, 2330, 2348, 2363, 2367, 2336, 2346, 2348, 2333, 2336, 2346, 2338, 2348, 2365, 2419, 2553, 2498, 2502, 2504, 2499, 2455, -28915, 19129, 28910, -27655, -27638, -27852, 29474, 1510, 1415, 1462, 1462, 1510, 26181, 26121, 19274, 30827, 32122, 490, 495, 506, 495, 436, 487, 483, 495, 489, 491, -29046, 18946, 28757, 1320, 1342, 26390, 32124, 26475, -31368, -30578, -30191, 26357, 25150, -30789, -31452, 2569, 2584, 2584, 27072, 27915, -28788, 19204, 29011, 1038, 1048, 31530, 29347, 1082, 1035, 1035, 26128, 26548, 19191, 31375, 31866};
    public final /* synthetic */ int a;
    public String b;
    public ScheduledExecutorService c;
    public AlertDialog d;
    public final Object e;
    public Serializable f;
    public Serializable g;
    public Serializable h;
    public Serializable i;
    public Object j;
    public Object k;

    public C0246g(int i) {
        this.a = i;
        switch (i) {
            case 1:
                String strM1840 = C0007.m1840();
                this.b = strM1840;
                new HashMap();
                C0001.m1203(new String[]{C0050.m8131(m6991(), 6, 4, 1814), C0025.m4795(m6991(), 10, 4, 1913), C0005.m1645(m6991(), 14, 4, 1485), C0030.m5362(m6991(), 18, 4, 1451), C0056.m8911(m6991(), 22, 5, 2847)});
                new HashMap();
                this.g = strM1840;
                this.h = strM1840;
                this.i = strM1840;
                this.j = strM1840;
                this.k = strM1840;
                C0050.m8082();
                com.github.catvod.spider.merge.P.a aVar = (com.github.catvod.spider.merge.P.a) C0033.m5856(C0058.m9105(C0002.m1247(C0021.m4340(m6991(), 27, 3, 1270))), com.github.catvod.spider.merge.P.a.class);
                this.e = aVar == null ? new com.github.catvod.spider.merge.P.a() : aVar;
                break;
            default:
                C0050.m8082();
                this.i = new ReentrantLock();
                this.h = new ArrayList();
                this.g = new HashMap();
                this.e = new HashMap();
                this.f = new HashMap();
                com.github.catvod.spider.merge.F.c cVar = (com.github.catvod.spider.merge.F.c) C0033.m5856(C0058.m9105(C0002.m1247(C0061.m9361(m6991(), 0, 6, 1210))), com.github.catvod.spider.merge.F.c.class);
                this.j = cVar == null ? new com.github.catvod.spider.merge.F.c() : cVar;
                break;
        }
    }

    public static HashMap f() {
        return C0019.m4127(C0011.m2805(m6991(), 30, 10, 546), C0012.m2973(m6991(), 40, 111, 2549), C0065.m9775(m6991(), 151, 7, 1962), C0022.m4403(m6991(), 158, 28, 2164));
    }

    public static ArrayList i(com.github.catvod.spider.merge.F.j jVar, String str, String str2, boolean z) {
        String strM1571;
        List listM3045 = C0012.m3045(jVar);
        ArrayList arrayList = new ArrayList();
        for (int iM9636 = C0064.m9636(listM3045) - 1; iM9636 >= 0; iM9636--) {
            C0004.m1532(arrayList, C0032.m5692((com.github.catvod.spider.merge.F.k) C0048.m7915(listM3045, iM9636)));
            if (z) {
                String strM5692 = C0032.m5692((com.github.catvod.spider.merge.F.k) C0048.m7915(listM3045, iM9636));
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0051.m8217());
                C0018.m3933(sb, C0011.m2805(m6991(), 186, 61, 1049));
                strM1571 = C0002.m1327(C0047.m7763(sb), new Object[]{C0016.m3525(m6991(), 247, 7, 1277), str, str2, strM5692});
            } else {
                strM1571 = C0004.m1571((com.github.catvod.spider.merge.F.k) C0048.m7915(listM3045, iM9636));
            }
            C0004.m1532(arrayList, strM1571);
        }
        return arrayList;
    }

    public static ArrayList j(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String strM5852 = C0033.m5852(m6991(), 254, 3, 1810);
            if (C0058.m9127(str, strM5852)) {
                String[] strArrM4752 = C0024.m4752(str, strM5852);
                String str2 = strArrM4752[0];
                String str3 = strArrM4752[1];
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0051.m8217());
                C0018.m3933(sb, C0058.m9106(m6991(), 257, 25, 991));
                C0018.m3933(sb, strArr[0]);
                C0018.m3933(sb, C0050.m8131(m6991(), 282, 8, 2659));
                C0018.m3933(sb, strArrM4752[2]);
                String strM7763 = C0047.m7763(sb);
                com.github.catvod.spider.merge.E.h hVar = new com.github.catvod.spider.merge.E.h();
                C0020.m4249(hVar, str2);
                C0036.m6229(hVar, str3);
                C0012.m3013(hVar, strM7763);
                C0004.m1532(arrayList, hVar);
            }
        }
        return arrayList;
    }

    public static boolean n(String str) {
        String strM9261 = C0059.m9261(new UrlQuerySanitizer(str), C0037.m6307(m6991(), 290, 13, 1442));
        return !C0043.m7327(strM9261) && C0008.m2023(strM9261) - (C0009.m2099() / 1000) <= 60;
    }

    public static String q(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0040.m6584(m6991(), 303, 3, 3226)), C0050.m8115(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrM6159) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            return C0047.m7763(sb);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String s(JsonObject jsonObject, String str) {
        String strM8125 = str;
        if (!C0043.m7277(strM8125, C0064.m9599(m6991(), 306, 5, 1041))) {
            strM8125 = C0050.m8125(C0016.m3525(m6991(), 311, 28, 2544), strM8125);
        }
        com.github.catvod.spider.merge.Z.d dVarM7628 = C0045.m7628(strM8125, m6996(jsonObject), C0048.m7911());
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0057.m9021(dVarM7628));
        String strM9585 = C0063.m9585(m6991(), 339, 1, 2132);
        C0018.m3933(sb, strM9585);
        C0018.m3933(sb, strM8125);
        C0018.m3933(sb, strM9585);
        C0018.m3933(sb, C0008.m2029(dVarM7628));
        m6984(C0047.m7763(sb));
        return C0008.m2029(dVarM7628);
    }

    public static String w(String str) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0060.m9352(m6991(), 340, 7, 2441)), C0012.m3018(str, C0055.m8706(C0055.m8814(m6991(), 347, 5, 1048))));
            StringBuilder sb = new StringBuilder(bArrM6159.length * 2);
            for (byte b : bArrM6159) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            return C0047.m7763(sb);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ۟۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6974(Object obj, Object obj2) {
        if (C0014.m3353() <= 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m6975(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return s((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6976(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static void m6977(Object obj, Object obj2, Object obj3) {
        if (C0059.m9257() <= 0) {
            ((JsonObject) obj).addProperty((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣ۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6978(Object obj, Object obj2, Object obj3) {
        if (C0032.m5686() <= 0) {
            ((JsonObject) obj).addProperty((String) obj2, (Number) obj3);
        }
    }

    /* renamed from: ۟ۤ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6979(Object obj, Object obj2, Object obj3) {
        if (C0057.m9017() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۦۡ, reason: not valid java name and contains not printable characters */
    public static Response m6980(Object obj) {
        if (C0022.m4497() > 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m6981(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m6982(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6983(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۟ۦۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m6984(Object obj) {
        if (C0048.m7971() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m6985(Object obj) {
        if (C0044.m7508() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Object m6986(Object obj, Object obj2, Object obj3) {
        if (C0049.m8038() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m6987(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Call m6988(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۢۨۨۡ, reason: not valid java name and contains not printable characters */
    public static Request m6989(Object obj) {
        if (C0044.m7508() < 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static MediaType m6990(Object obj) {
        if (C0029.m5282() > 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۧۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6991() {
        if (C0064.m9659() <= 0) {
            return f721short;
        }
        return null;
    }

    /* renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static RequestBody m6992(Object obj, Object obj2) {
        if (C0062.m9429() > 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۤ, reason: contains not printable characters */
    public static Request m6993(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0059.m9257() <= 0) {
            return com.github.catvod.spider.merge.B0.a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۦۥۡۨ, reason: contains not printable characters */
    public static boolean m6994(Object obj, Object obj2, Object obj3) {
        if (C0031.m5628() > 0) {
            return ((C0246g) obj).a((JsonObject) obj2, (String) obj3);
        }
        return false;
    }

    /* renamed from: ۧ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6995(Object obj) {
        if (C0003.m1463() < 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۧۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m6996(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((JsonElement) obj).toString();
        }
        return null;
    }

    public boolean a(JsonObject jsonObject, String str) {
        String strM8125 = C0050.m8125(C0012.m2973(m6991(), 352, 37, 3075), str);
        com.github.catvod.spider.merge.Z.d dVarM7628 = C0045.m7628(strM8125, m6996(jsonObject), C0048.m7911());
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0057.m9021(dVarM7628));
        String strM3917 = C0018.m3917(m6991(), 389, 1, 2649);
        C0018.m3933(sb, strM3917);
        C0018.m3933(sb, strM8125);
        C0018.m3933(sb, strM3917);
        C0018.m3933(sb, C0008.m2029(dVarM7628));
        m6984(C0047.m7763(sb));
        boolean zM9127 = C0058.m9127(C0008.m2029(dVarM7628), C0051.m8259(m6991(), 390, 17, 2485));
        com.github.catvod.spider.merge.F.c cVar = (com.github.catvod.spider.merge.F.c) C0022.m4433(this);
        if (zM9127) {
            C0038.m6402(C0009.m2037(m6991(), 407, 23, 549));
            C0032.m5757(C0065.m9770(cVar));
            return false;
        }
        com.github.catvod.spider.merge.F.i iVar = (com.github.catvod.spider.merge.F.i) C0033.m5856(C0008.m2029(dVarM7628), com.github.catvod.spider.merge.F.i.class);
        if (iVar == null) {
            iVar = new com.github.catvod.spider.merge.F.i();
        }
        C0039.m6557(cVar, iVar);
        return true;
    }

    public String b(String str, String str2, boolean z) {
        HashMap mapM2076;
        String strM8125 = str;
        if (!C0043.m7277(strM8125, C0050.m8131(m6991(), 430, 5, 1650))) {
            strM8125 = C0050.m8125(C0047.m7833(m6991(), 435, 28, 3052), strM8125);
        }
        if (C0058.m9127(strM8125, C0044.m7509(m6991(), 463, 9, 885))) {
            mapM2076 = C0048.m7911();
            C0053.m8424(mapM2076, C0049.m8007(m6991(), 472, 13, 2943), C0010.m2372((com.github.catvod.spider.merge.F.o) C0052.m8378(this)));
            C0053.m8424(mapM2076, C0022.m4403(m6991(), 485, 8, 686), C0027.m5062(m6991(), 493, 40, 3195));
        } else {
            mapM2076 = C0009.m2076(this);
        }
        com.github.catvod.spider.merge.Z.d dVarM7628 = C0045.m7628(strM8125, str2, mapM2076);
        StringBuilder sb = new StringBuilder();
        int iM9021 = C0057.m9021(dVarM7628);
        C0036.m6177(sb, iM9021);
        String strM2805 = C0011.m2805(m6991(), 533, 1, 2275);
        C0018.m3933(sb, strM2805);
        C0018.m3933(sb, strM8125);
        C0018.m3933(sb, strM2805);
        C0018.m3933(sb, C0008.m2029(dVarM7628));
        m6984(C0047.m7763(sb));
        return (z && iM9021 == 401 && C0047.m7794(this)) ? C0031.m5630(this, strM8125, str2, false) : (z && iM9021 == 429) ? C0031.m5630(this, strM8125, str2, false) : C0008.m2029(dVarM7628);
    }

    public String c(String str, String str2) {
        com.github.catvod.spider.merge.F.c cVar = (com.github.catvod.spider.merge.F.c) C0022.m4433(this);
        if (C0057.m8953(C0027.m5059(C0036.m6172(cVar)))) {
            m6984(C0017.m3646(m6991(), 534, 15, 1202));
            com.github.catvod.spider.merge.F.g gVar = (com.github.catvod.spider.merge.F.g) C0033.m5856(C0031.m5630(this, C0005.m1645(m6991(), 551, 40, 3261), C0017.m3646(m6991(), 549, 2, 1883), true), com.github.catvod.spider.merge.F.g.class);
            if (gVar == null) {
                gVar = new com.github.catvod.spider.merge.F.g();
            }
            C0013.m3125(cVar, gVar);
        }
        StringBuilder sb = new StringBuilder(C0033.m5852(m6991(), 591, 7, 1355));
        C0018.m3933(sb, str2);
        m6984(C0047.m7763(sb));
        return C0000.m1072(C0014.m3329(C0019.m4108((com.github.catvod.spider.merge.F.n) C0033.m5856(C0031.m5630(this, C0037.m6307(m6991(), 821, 15, 334), C0028.m5188(C0052.m8368(C0017.m3646(m6991(), 598, 33, 2442), str2, C0016.m3525(m6991(), 631, 14, 2836), str, C0027.m5062(m6991(), 645, 63, 2710)), C0027.m5059(C0036.m6172(cVar)), C0034.m6001(m6991(), 708, 113, 1188)), true), com.github.catvod.spider.merge.F.n.class))));
    }

    public final void d() {
        switch (C0014.m3282(this)) {
            case 0:
                try {
                    AlertDialog alertDialogM3951 = C0018.m3951(this);
                    if (alertDialogM3951 != null) {
                        C0004.m1577(alertDialogM3951);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    AlertDialog alertDialogM39512 = C0018.m3951(this);
                    if (alertDialogM39512 != null) {
                        C0004.m1577(alertDialogM39512);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }

    public String e(String str, String str2) {
        String strM8337 = C0052.m8337(m6991(), 836, 17, 1949);
        HashMap map = (HashMap) C0044.m7441(this);
        try {
            if (C0058.m9098(map, str2) && C0065.m9715(map, str2) != null && !C0063.m9509((String) C0065.m9715(map, str2))) {
                return (String) C0065.m9715(map, str2);
            }
            C0002.m1292(this, str);
            StringBuilder sb = new StringBuilder(strM8337);
            C0018.m3933(sb, str2);
            m6984(C0047.m7763(sb));
            ArrayList arrayList = (ArrayList) C0014.m3390(this);
            C0063.m9500(arrayList, 0, C0004.m1560(this, str, str2));
            JsonObject jsonObject = new JsonObject();
            m6977(jsonObject, C0053.m8477(m6991(), 853, 7, 2536), (String) C0028.m5167(arrayList, 0));
            m6977(jsonObject, C0016.m3525(m6991(), 860, 8, 1557), C0027.m5059(C0036.m6172((com.github.catvod.spider.merge.F.c) C0022.m4433(this))));
            m6978(jsonObject, C0052.m8337(m6991(), 868, 10, 732), C0011.m2808(900));
            String strM9313 = C0060.m9313((com.github.catvod.spider.merge.F.f) m6986(new Gson(), C0042.m7155(this, C0050.m8131(m6991(), 878, 23, 2082), m6996(jsonObject), true), com.github.catvod.spider.merge.F.f.class));
            C0053.m8424(map, str2, strM9313);
            return strM9313;
        } catch (Exception e) {
            C0049.m7975(e);
            return C0007.m1840();
        } finally {
            C0025.m4829(new RunnableC0244e(this, 0));
        }
    }

    public HashMap g() {
        HashMap mapM7911 = C0048.m7911();
        C0053.m8424(mapM7911, C0033.m5852(m6991(), 901, 13, 1394), C0010.m2372((com.github.catvod.spider.merge.F.o) C0052.m8378(this)));
        C0053.m8424(mapM7911, C0012.m2973(m6991(), 914, 8, 1957), C0032.m5708(m6991(), 922, 40, 397));
        com.github.catvod.spider.merge.F.c cVar = (com.github.catvod.spider.merge.F.c) C0022.m4433(this);
        com.github.catvod.spider.merge.F.p pVarM8638 = C0054.m8638(cVar);
        if (C0004.m1584(C0047.m7809(pVarM8638)) > 0 && C0004.m1584(C0019.m4075(pVarM8638)) > 0) {
            com.github.catvod.spider.merge.F.p pVarM86382 = C0054.m8638(cVar);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0047.m7809(pVarM86382));
            C0018.m3933(sb, C0020.m4199(m6991(), 962, 1, 1400));
            C0018.m3933(sb, C0019.m4075(pVarM86382));
            C0053.m8424(mapM7911, C0056.m8911(m6991(), 963, 13, 2702), C0047.m7763(sb));
        }
        return mapM7911;
    }

    public String h(String str, String str2, String str3) {
        ArrayList arrayListM7563 = C0045.m7563(C0015.m3506(this, str, str2), str, str2, false);
        HashMap map = new HashMap();
        for (int i = 0; i < C0009.m2139(arrayListM7563); i += 2) {
            C0053.m8424(map, (String) C0028.m5167(arrayListM7563, i), (String) C0028.m5167(arrayListM7563, i + 1));
        }
        String str4 = (String) C0065.m9715(map, str3);
        String strM5769 = C0032.m5769(str4, C0048.m7911());
        String strM4403 = C0022.m4403(m6991(), 976, 1, 1040);
        String[] strArrM4752 = C0024.m4752(strM5769, strM4403);
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        String strM3917 = C0018.m3917(m6991(), 977, 1, 1517);
        C0018.m3933(sb, C0054.m8636(str4, 0, C0002.m1279(str4, strM3917)));
        C0018.m3933(sb, strM3917);
        String strM7763 = C0047.m7763(sb);
        int i2 = 0;
        for (String strM1327 : strArrM4752) {
            if (C0058.m9127(strM1327, C0020.m4199(m6991(), 978, 13, 2698))) {
                String strM8599 = C0054.m8599(i2);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, strM7763);
                C0018.m3933(sb2, strM1327);
                C0053.m8424(map2, strM8599, C0047.m7763(sb2));
                String strM85992 = C0054.m8599(i2);
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, C0051.m8217());
                C0018.m3933(sb3, C0053.m8477(m6991(), 991, 72, 3166));
                strM1327 = C0002.m1327(C0047.m7763(sb3), new Object[]{C0034.m6001(m6991(), 1063, 4, 1956), str, str2, str3, strM85992});
                i2++;
            }
            C0004.m1532(arrayList, strM1327);
        }
        C0053.m8424((HashMap) C0017.m3724(this), str2, map2);
        return C0036.m6194(strM4403, arrayList);
    }

    public String k() {
        this.k = C0015.m3446(C0026.m4903(C0055.m8713()), C0052.m8337(m6991(), 1067, 1, 2850), C0007.m1840());
        this.j = C0031.m5627(C0009.m2099());
        StringBuilder sb = new StringBuilder(C0057.m8978(m6991(), 1068, 21, 3192));
        C0018.m3933(sb, (String) C0022.m4433(this));
        C0018.m3933(sb, C0009.m2037(m6991(), 1089, 33, 2298));
        this.i = C0060.m9288(C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, (String) C0052.m8378(this));
        C0018.m3933(sb2, (String) C0022.m4433(this));
        this.g = C0016.m3576(C0047.m7763(sb2));
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        StringBuilder sb3 = new StringBuilder(C0000.m1077(m6991(), 1122, 52, 2988));
        C0018.m3933(sb3, (String) C0044.m7441(this));
        C0018.m3933(sb3, C0033.m5852(m6991(), 1174, 39, 799));
        C0018.m3933(sb3, (String) C0052.m8378(this));
        C0018.m3933(sb3, C0011.m2805(m6991(), 1213, 294, 2532));
        JsonObject jsonObject = (JsonObject) C0033.m5856(m6995(m6985(m6980(m6988(okHttpClient, m6993(m6979(m6979(m6979(m6983(m6976(builder, C0047.m7763(sb3))), C0052.m8337(m6991(), 1507, 10, 585), C0031.m5565(m6991(), 1517, 120, 1837)), C0058.m9106(m6991(), 1637, 8, 2394), (String) C0022.m4433(this)), C0053.m8477(m6991(), 1645, 11, 3113), (String) C0028.m5117(this)), C0031.m5565(m6991(), 1656, 12, 3249), C0054.m8574(m6991(), 1668, 24, 784), C0043.m7290(m6991(), 1692, 15, 1774), C0048.m7902(m6991(), 1707, 32, 1814)))))), JsonObject.class);
        this.h = m6982(m6981(jsonObject, C0004.m1549(m6991(), 1739, 11, 486)));
        return m6982(m6981(jsonObject, C0001.m1189(m6991(), 1750, 7, 3075)));
    }

    public com.github.catvod.spider.merge.F.j l(String str, String str2) {
        com.github.catvod.spider.merge.F.j jVar;
        RunnableC0244e runnableC0244e;
        String strM9352 = C0060.m9352(m6991(), 1757, 26, 2491);
        try {
            try {
                C0002.m1292(this, str);
                StringBuilder sb = new StringBuilder(strM9352);
                C0018.m3933(sb, str2);
                m6984(C0047.m7763(sb));
                ArrayList arrayList = (ArrayList) C0014.m3390(this);
                C0063.m9500(arrayList, 0, C0004.m1560(this, str, str2));
                JsonObject jsonObject = new JsonObject();
                m6977(jsonObject, C0045.m7657(m6991(), 1783, 7, 761), (String) C0028.m5167(arrayList, 0));
                m6977(jsonObject, C0057.m8978(m6991(), 1790, 8, 3012), C0027.m5059(C0036.m6172((com.github.catvod.spider.merge.F.c) C0022.m4433(this))));
                m6977(jsonObject, C0031.m5565(m6991(), 1798, 8, 3112), C0055.m8814(m6991(), 1806, 16, 1329));
                m6978(jsonObject, C0047.m7833(m6991(), 1822, 14, 1045), C0011.m2808(900));
                jVar = C0052.m8292((com.github.catvod.spider.merge.F.l) m6986(new Gson(), C0042.m7155(this, C0026.m4951(m6991(), 1836, 32, 3057), m6996(jsonObject), true), com.github.catvod.spider.merge.F.l.class));
                runnableC0244e = new RunnableC0244e(this, 0);
            } catch (Exception e) {
                C0049.m7975(e);
                jVar = new com.github.catvod.spider.merge.F.j();
                runnableC0244e = new RunnableC0244e(this, 0);
            }
            C0025.m4829(runnableC0244e);
            return jVar;
        } catch (Throwable th) {
            C0025.m4829(new RunnableC0244e(this, 0));
            throw th;
        }
    }

    public void m() {
        int i = 0;
        com.github.catvod.spider.merge.P.a aVar = (com.github.catvod.spider.merge.P.a) C0017.m3724(this);
        String strM5062 = C0027.m5062(m6991(), 1868, 11, 2014);
        try {
            try {
                m6984(C0032.m5708(m6991(), 1879, 18, 2792));
                if (C0048.m7937(new CharSequence[]{C0025.m4793(this)})) {
                    m6984(C0000.m1077(m6991(), 1897, 30, 1317));
                    this.b = C0019.m4104(C0039.m6478(aVar));
                }
                if (C0040.m6623(new CharSequence[]{C0025.m4793(this)}) && C0058.m9127(C0025.m4793(this), C0009.m2037(m6991(), 1927, 1, 465))) {
                    m6984(C0046.m7718(m6991(), 1928, 11, 2288));
                    C0038.m6402(C0020.m4199(m6991(), 1939, 18, 2253));
                    String strM4793 = C0025.m4793(this);
                    C0055.m8717(strM4793);
                    this.b = strM4793;
                    C0040.m6596(aVar, new com.github.catvod.spider.merge.P.b(strM4793));
                    while (C0057.m8953(C0019.m4104(C0039.m6478(aVar)))) {
                        C0060.m9274(250L);
                    }
                    return;
                }
                if (C0048.m7937(new CharSequence[]{C0025.m4793(this)}) && C0048.m7937(new CharSequence[]{(String) C0062.m9437(this)})) {
                    m6984(C0012.m2973(m6991(), 1957, 11, 2512));
                    throw new RuntimeException(C0065.m9775(m6991(), 1968, 10, 1822));
                }
                String str = (String) C0062.m9437(this);
                OkHttpClient okHttpClient = new OkHttpClient();
                MediaType mediaTypeM6990 = m6990(C0011.m2805(m6991(), 1978, 16, 1900));
                StringBuilder sb = new StringBuilder(strM5062);
                C0018.m3933(sb, (String) C0044.m7441(this));
                C0018.m3933(sb, C0021.m4340(m6991(), 1994, 297, 645));
                C0018.m3933(sb, str);
                C0018.m3933(sb, C0040.m6584(m6991(), 2291, 2, 2523));
                String strM6995 = m6995(m6985(m6980(m6988(okHttpClient, m6989(m6979(m6979(m6979(m6979(m6974(m6976(new Request.Builder(), C0010.m2300(m6991(), 2293, 38, 779)), m6992(mediaTypeM6990, C0047.m7763(sb))), C0036.m6188(m6991(), 2331, 10, 1946), C0020.m4199(m6991(), 2341, 120, 472)), C0005.m1645(m6991(), 2461, 10, 2937), C0038.m6452(m6991(), 2471, 10, 1030)), C0009.m2037(m6991(), 2481, 15, 1258), C0038.m6452(m6991(), 2496, 4, 2777)), C0015.m3484(m6991(), 2500, 12, 1892), C0030.m5362(m6991(), 2512, 31, 1650)))))));
                if (C0058.m9127(strM6995, C0010.m2300(m6991(), 2543, 2, 2282))) {
                    String strM6982 = m6982(m6981(m6987((JsonObject) m6986(new Gson(), strM6995, JsonObject.class), C0007.m1842(m6991(), 2545, 4, 2818)), C0041.m6779(m6991(), 2549, 12, 1108)));
                    this.b = strM6982;
                    C0040.m6596(aVar, new com.github.catvod.spider.merge.P.b(strM6982));
                    if (C0057.m8953(C0019.m4104(C0039.m6478(aVar)))) {
                        throw new Exception(C0025.m4793(this));
                    }
                    String strM47932 = C0025.m4793(this);
                    C0055.m8717(strM47932);
                    this.b = strM47932;
                }
                while (C0057.m8953(C0019.m4104(C0039.m6478(aVar)))) {
                    C0060.m9274(250L);
                }
            } catch (Exception e) {
                C0046.m7694(C0039.m6478(aVar));
                C0049.m7975(e);
                C0045.m7576(this);
                C0016.m3575(new RunnableC0234C(this, i));
                while (C0057.m8953(C0019.m4104(C0039.m6478(aVar)))) {
                    C0060.m9274(250L);
                }
            }
        } catch (Throwable th) {
            while (C0057.m8953(C0019.m4104(C0039.m6478(aVar)))) {
                C0060.m9274(250L);
            }
            throw th;
        }
    }

    public void o(String str, com.github.catvod.spider.merge.F.h hVar, ArrayList arrayList, ArrayList arrayList2) {
        C0020.m4273(this, str, hVar, arrayList, arrayList2, C0007.m1840());
    }

    public void p(String str, com.github.catvod.spider.merge.F.h hVar, ArrayList arrayList, ArrayList arrayList2, String str2) {
        ArrayList arrayList3 = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        m6978(jsonObject, C0020.m4199(m6991(), 2561, 5, 1854), C0011.m2808(200));
        m6977(jsonObject, C0025.m4795(m6991(), 2566, 8, 3058), str);
        m6977(jsonObject, C0016.m3525(m6991(), 2574, 14, 1713), C0054.m8607(hVar));
        m6977(jsonObject, C0038.m6452(m6991(), 2588, 8, 1361), C0038.m6452(m6991(), 2596, 4, 1651));
        m6977(jsonObject, C0044.m7509(m6991(), 2600, 15, 537), C0019.m4107(m6991(), 2615, 3, 1855));
        if (C0004.m1584(str2) > 0) {
            m6977(jsonObject, C0003.m1398(m6991(), 2618, 6, 881), str2);
        }
        com.github.catvod.spider.merge.F.h hVar2 = (com.github.catvod.spider.merge.F.h) C0033.m5856(C0031.m5630(this, C0033.m5852(m6991(), 2624, 19, 1452), m6996(jsonObject), true), com.github.catvod.spider.merge.F.h.class);
        Iterator itM3109 = C0013.m3109(C0044.m7418(hVar2));
        while (C0012.m2962(itM3109)) {
            com.github.catvod.spider.merge.F.h hVar3 = (com.github.catvod.spider.merge.F.h) C0048.m7949(itM3109);
            if (C0007.m1815(C0044.m7412(hVar3), C0027.m5062(m6991(), 2643, 6, 885))) {
                C0004.m1532(arrayList3, hVar3);
            } else if (C0007.m1815(C0064.m9660(hVar3), C0061.m9361(m6991(), 2649, 5, 1679)) || C0007.m1815(C0064.m9660(hVar3), C0053.m8477(m6991(), 2654, 5, 2682))) {
                C0004.m1536(hVar3, C0038.m6463(hVar));
                C0004.m1532(arrayList, hVar3);
            } else {
                if (C0021.m4355(C0027.m5030(), C0009.m2086(hVar3))) {
                    C0004.m1532(arrayList2, hVar3);
                }
            }
        }
        if (C0004.m1584(C0010.m2380(hVar2)) > 0) {
            C0020.m4273(this, str, hVar, arrayList, arrayList2, C0010.m2380(hVar2));
        }
        Iterator itM7816 = C0047.m7816(arrayList3);
        while (C0012.m2962(itM7816)) {
            C0045.m7604(this, str, (com.github.catvod.spider.merge.F.h) C0048.m7949(itM7816), arrayList, arrayList2);
        }
    }

    public String r(String str, String str2, boolean z) {
        boolean zM6994;
        String strM8125 = str;
        if (!C0043.m7277(strM8125, C0023.m4536(m6991(), 2659, 5, 1334))) {
            strM8125 = C0050.m8125(C0033.m5852(m6991(), 2664, 41, 2924), strM8125);
        }
        HashMap mapM7911 = C0048.m7911();
        com.github.catvod.spider.merge.F.c cVar = (com.github.catvod.spider.merge.F.c) C0022.m4433(this);
        C0053.m8424(mapM7911, C0010.m2300(m6991(), 2705, 13, 2475), C0011.m2764(C0065.m9770(cVar)));
        com.github.catvod.spider.merge.Z.d dVarM7628 = C0045.m7628(strM8125, str2, mapM7911);
        StringBuilder sb = new StringBuilder();
        int iM9021 = C0057.m9021(dVarM7628);
        C0036.m6177(sb, iM9021);
        String strM6131 = C0035.m6131(m6991(), 2718, 1, 2248);
        C0018.m3933(sb, strM6131);
        C0018.m3933(sb, strM8125);
        C0018.m3933(sb, strM6131);
        C0018.m3933(sb, C0008.m2029(dVarM7628));
        m6984(C0047.m7763(sb));
        if (z && (iM9021 == 400 || iM9021 == 401)) {
            boolean zM8953 = C0057.m8953(C0012.m2986(C0065.m9770(cVar)));
            String strM1398 = C0003.m1398(m6991(), 2719, 10, 1917);
            if (zM8953) {
                m6984(C0008.m1970(m6991(), 2729, 16, 861));
                JsonObject jsonObject = new JsonObject();
                m6978(jsonObject, C0021.m4340(m6991(), 2745, 9, 1168), C0011.m2808(1));
                m6977(jsonObject, C0035.m6131(m6991(), 2754, 5, 1222), C0040.m6584(m6991(), 2759, 38, 542));
                String strM5874 = C0033.m5874((com.github.catvod.spider.merge.F.d) C0033.m5856(C0031.m5630(this, C0025.m4795(m6991(), 2797, 204, 1342), m6996(jsonObject), true), com.github.catvod.spider.merge.F.d.class));
                m6984(C0000.m1077(m6991(), 3001, 17, 2328));
                JsonObject jsonObject2 = new JsonObject();
                String strM1077 = C0000.m1077(m6991(), 3018, 4, 1958);
                m6977(jsonObject2, strM1077, strM5874);
                m6977(jsonObject2, strM1398, C0020.m4199(m6991(), 3022, 18, 2906));
                zM6994 = m6994(this, jsonObject2, strM1077);
            } else {
                m6984(C0050.m8131(m6991(), 3040, 19, 1566));
                JsonObject jsonObject3 = new JsonObject();
                String strM4536 = C0023.m4536(m6991(), 3059, 13, 772);
                m6977(jsonObject3, strM1398, strM4536);
                m6977(jsonObject3, strM4536, C0012.m2986(C0065.m9770(cVar)));
                zM6994 = m6994(this, jsonObject3, C0028.m5109(m6991(), 3072, 5, 2729));
            }
            if (zM6994) {
                return C0042.m7155(this, strM8125, str2, false);
            }
        }
        return C0008.m2029(dVarM7628);
    }

    public boolean t() {
        String strM6551 = C0039.m6551(m6991(), 3077, 13, 1798);
        com.github.catvod.spider.merge.F.c cVar = (com.github.catvod.spider.merge.F.c) C0022.m4433(this);
        try {
            try {
                m6984(C0035.m6131(m6991(), 3090, 21, 1524));
                JsonObject jsonObject = new JsonObject();
                String strM6605 = C0040.m6605(C0054.m8638(cVar));
                if (C0057.m8953(strM6605)) {
                    strM6605 = C0025.m4793(this);
                }
                if (strM6605 != null && C0043.m7277(strM6605, C0028.m5109(m6991(), 3111, 4, 2214))) {
                    strM6605 = C0064.m9640(C0032.m5769(strM6605, null));
                }
                m6977(jsonObject, strM6551, strM6605);
                m6977(jsonObject, C0028.m5109(m6991(), 3115, 10, 3243), strM6551);
                String strM6975 = m6975(jsonObject, C0047.m7833(m6991(), 3125, 45, 3142));
                com.github.catvod.spider.merge.F.p pVar = (com.github.catvod.spider.merge.F.p) m6986(new Gson(), strM6975, com.github.catvod.spider.merge.F.p.class);
                if (pVar == null) {
                    pVar = new com.github.catvod.spider.merge.F.p();
                }
                C0015.m3431(cVar, pVar);
                if (C0057.m8953(C0019.m4075(C0054.m8638(cVar)))) {
                    throw new Exception(strM6975);
                }
                while (C0057.m8953(C0019.m4075(C0054.m8638(cVar)))) {
                    C0060.m9274(250L);
                }
                return true;
            } catch (Exception e) {
                if (e instanceof TimeoutException) {
                    C0045.m7576(this);
                    while (C0057.m8953(C0019.m4075(C0054.m8638(cVar)))) {
                        C0060.m9274(250L);
                    }
                    return false;
                }
                C0053.m8429(C0054.m8638(cVar));
                C0049.m7975(e);
                C0045.m7576(this);
                C0016.m3575(new RunnableC0244e(this, 2));
                while (C0057.m8953(C0019.m4075(C0054.m8638(cVar)))) {
                    C0060.m9274(250L);
                }
                return true;
            }
        } catch (Throwable th) {
            while (C0057.m8953(C0019.m4075(C0054.m8638(cVar)))) {
                C0060.m9274(250L);
            }
            throw th;
        }
    }

    public void u(String str) {
        com.github.catvod.spider.merge.F.o oVar = (com.github.catvod.spider.merge.F.o) C0052.m8378(this);
        if (oVar == null || !C0044.m7380(oVar, str)) {
            m6984(C0012.m2973(m6991(), 3170, 20, 3024));
            JsonObject jsonObject = new JsonObject();
            m6977(jsonObject, C0036.m6188(m6991(), 3190, 8, 1580), str);
            m6977(jsonObject, C0022.m4403(m6991(), 3198, 9, 1772), C0007.m1840());
            com.github.catvod.spider.merge.F.o oVar2 = (com.github.catvod.spider.merge.F.o) C0033.m5856(m6975(jsonObject, C0002.m1305(m6991(), 3207, 29, 2471)), com.github.catvod.spider.merge.F.o.class);
            C0043.m7319(oVar2, str);
            oVar2.q = C0009.m2099() + 3600000;
            this.k = oVar2;
            if (C0057.m8953(C0010.m2372(oVar2))) {
                C0038.m6402(C0062.m9389(m6991(), 3236, 11, 2088));
            }
        }
    }

    public final void v(String str) {
        switch (C0014.m3282(this)) {
            case 0:
                C0048.m7951(C0054.m8638((com.github.catvod.spider.merge.F.c) C0022.m4433(this)), str);
                String strM2037 = C0009.m2037(m6991(), 3261, 6, 2477);
                StringBuilder sb = new StringBuilder(strM2037);
                C0018.m3933(sb, str);
                m6984(C0047.m7763(sb));
                StringBuilder sb2 = new StringBuilder(strM2037);
                C0018.m3933(sb2, str);
                C0038.m6402(C0047.m7763(sb2));
                C0047.m7794(this);
                C0045.m7576(this);
                break;
            default:
                this.f = str;
                String strM1970 = C0008.m1970(m6991(), 3247, 14, 2377);
                StringBuilder sb3 = new StringBuilder(strM1970);
                C0018.m3933(sb3, str);
                m6984(C0047.m7763(sb3));
                StringBuilder sb4 = new StringBuilder(strM1970);
                C0018.m3933(sb4, str);
                C0038.m6402(C0047.m7763(sb4));
                C0056.m8881(this);
                C0045.m7576(this);
                break;
        }
    }

    public void x(com.github.catvod.spider.merge.F.e eVar) {
        try {
            int iM3103 = C0013.m3103(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3103, iM3103);
            ImageView imageView = new ImageView(C0031.m5652());
            C0028.m5147(imageView, C0046.m7662());
            C0022.m4421(imageView, C0008.m2002(iM3103, C0003.m1409(eVar)));
            FrameLayout frameLayout = new FrameLayout(C0031.m5652());
            layoutParams.gravity = 17;
            C0041.m6790(frameLayout, imageView, layoutParams);
            if (C0054.m8632() >= 17) {
                this.d = C0019.m4124(C0060.m9354(C0039.m6476(C0047.m7848(new AlertDialog.Builder(C0022.m4453()), frameLayout), new DialogInterfaceOnCancelListenerC0242c(0, this)), new DialogInterfaceOnDismissListenerC0243d(0, this)));
            }
            Window windowM1119 = C0000.m1119(C0018.m3951(this));
            C0047.m7777(windowM1119);
            C0035.m6135(windowM1119, new ColorDrawable(0));
            C0038.m6402(C0018.m3917(m6991(), 3267, 17, 1478));
        } catch (Exception unused) {
        }
    }

    public void y(String str) {
        int iM7935;
        String strM8890 = str;
        try {
            int iM3103 = C0013.m3103(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3103, iM3103);
            ImageView imageView = new ImageView(C0031.m5652());
            C0028.m5147(imageView, C0046.m7662());
            if (C0043.m7277(strM8890, C0009.m2037(m6991(), 3284, 10, 398)) && (iM7935 = C0048.m7935(strM8890, 44)) != -1) {
                strM8890 = C0056.m8890(strM8890, iM7935 + 1);
            }
            byte[] bArrM1882 = C0007.m1882(strM8890);
            Bitmap bitmapM2357 = C0010.m2357(bArrM1882, 0, bArrM1882.length);
            C0022.m4421(imageView, bitmapM2357);
            FrameLayout frameLayout = new FrameLayout(C0031.m5652());
            layoutParams.gravity = 17;
            C0041.m6790(frameLayout, imageView, layoutParams);
            if (C0054.m8632() >= 17) {
                this.d = C0019.m4124(C0047.m7798(C0043.m7374(C0039.m6476(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0013.m3106(m6991(), 3294, 13, 1405)), frameLayout), new DialogInterfaceOnCancelListenerC0242c(4, this)), new DialogInterfaceOnDismissListenerC0243d(4, this)), C0036.m6188(m6991(), 3307, 7, 2632), null));
            }
            C0002.m1251(C0017.m3703(C0018.m3951(this), -1), new ViewOnClickListenerC0260v(this, bitmapM2357, 1));
            C0038.m6402(C0019.m4107(m6991(), 3314, 15, 1147));
        } catch (Exception unused) {
        }
    }

    public final void z() {
        switch (C0014.m3282(this)) {
            case 0:
                ScheduledExecutorService scheduledExecutorServiceM7552 = C0045.m7552(this);
                if (scheduledExecutorServiceM7552 != null) {
                    C0009.m2093(scheduledExecutorServiceM7552);
                }
                C0016.m3575(new RunnableC0244e(this, 1));
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceM75522 = C0045.m7552(this);
                if (scheduledExecutorServiceM75522 != null) {
                    C0009.m2093(scheduledExecutorServiceM75522);
                }
                C0016.m3575(new RunnableC0234C(this, 1));
                break;
        }
    }
}