package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
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
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MyCloud extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f89short = {3324, 1937, 1941, 1921, 1938, 1931, 2576, 2578, 2565, 2582, 2569, 2565, 2583, 2623, 2581, 2578, 2572, 289, 289, 289, 289, 373, 277, 277, 373, 316, 316, 376, 272, 272, 354, 309, 309, 354, 299, 299, 374, 267, 267, 267, 666, 728, 725, 718, 729, 735, 712, 725, 723, 722, 641, 733, 730, 712, 729, 718, 666, 730, 723, 718, 721, 733, 712, 641, 1309, 1380, 1355, 1370, 1372, 1374, 1286, 2303, 2780, 2780, 2780, 2780, 2696, 2792, 2792, 2696, 2753, 2753, 2693, 2797, 2797, 2719, 2760, 2760, 2719, 2774, 2774, 573, 2446, 2450, 2447, 2455, 2456, 2452, 2459, 2451, 2454, 2470, 2467, 2487, 2482, 2471, 2486, 2487, 2444, 2482, 2471, 2332, 2325, 2312, 2327, 2331, 2318, 2341, 2318, 2307, 2314, 2335, 947, 956, 953, 944, 906, 955, 948, 952, 944, 722, 733, 720, 589, 584, 605, 584, 1939, 1940, 1921, 1940, 1941, 1939, 579, 2068, 2075, 2078, 2071, 2098, 2088, 2107, 2084, 3298, 3303, 3325, 3322, 2221, 2208, 2235, 844, 840, 860, 847, 854, 893, 25214, 29487, 23041, 2041, 2045, 2025, 2042, 2019, 1992, 1976, 1992, 2028, 2017, 2042, -32500, 24019, 30122, 21954, -32443, 30101, 17622, 31872, 21934, 30122, 31779, 2005, 1993, 1993, 1997, 1998, 1927, 1938, 1938, 2010, 2004, 1997, 1998, 1935, 1939, 2015, 2012, 2004, 2009, 1992, 1939, 2014, 2002, 2000, 1938, 2004, 1993, 1938, 1992, 1920, 1934, 1925, 1935, 1931, 1924, 1934, 1932, 1928, 1935, 1931, 1937, 1932, 1935, 1932, 1925, 1932, 1933, 1931, 1925, 1932, 1932, 1947, 2011, 2000, 1920, 1934, 1933, 1934, 1933, 1947, 2012, 1997, 1997, 1920, 1934, 1933, 1934, 1933, 1947, 1998, 2004, 1991, 2008, 1920, 1999, 2008, 1934, 1937, 1935, 1947, 1996, 1920, 1930, 1928, 1947, 2003, 1920, 1933, 1947, 2010, 1920, 1929, 2003, 1947, 2011, 1920, 2039, 2029, 2040, 2042, 1947, 2011, 2000, 1993, 1920, 2012, 1992, 1993, 2002, 1947, 2000, 2012, 1989, 2002, 1999, 2004, 2001, 2008, 2003, 1935, 2005, 2008, 2004, 2014, 1920, 1935, 1933, 1933, 1933, 1933, 1933, 1933, 1922, 1998, 1920, 1933, 1924, 2044, 1930, 1930, 1930, 1934, 1935, 1924, 1928, 1935, 1929, 1930, 1930, 1933, 1932, 1928, 2046, 1928, 1934, 1929, 1924, 1929, 1930, 1933, 1935, 1933, 1933, 2040, 1933, 2040, 1935, 3078, 3074, 3094, 3077, 3100, 3127, 3143, 3127, 3091, 3102, 3077, 2407, 2427, 2427, 2431, 2428, 2357, 2336, 2336, 2411, 2429, 2406, 2425, 2410, 2338, 2431, 2412, 2337, 2430, 2426, 2414, 2429, 2404, 2337, 2412, 2401, 2336, 2366, 2336, 2412, 2403, 2400, 2426, 2411, 2411, 2429, 2406, 2425, 2410, 2336, 2409, 2406, 2403, 2410, 2336, 2428, 2400, 2429, 2427, 2352, 2431, 2429, 2354, 2426, 2412, 2431, 2429, 2400, 2345, 2409, 2429, 2354, 2431, 2412, 2345, 2426, 2412, 2384, 2431, 2414, 2429, 2414, 2402, 2384, 2428, 2427, 2429, 2354, 2345, 2431, 2411, 2406, 2429, 2384, 2409, 2406, 2411, 2354, 2515, 2474, 2438, 2460, 2447, 2448, 2504, 2500, 2501, 2501, 2501, 2515, 2474, 2451, 2448, 2433, 2454, 2461, 2474, 2433, 2458, 2433, 2452, 2457, 2504, 2500, 2515, 2474, 2451, 2448, 2433, 2454, 2461, 2474, 2438, 2432, 2455, 2474, 2449, 2460, 2439, 2438, 2504, 2501, 2515, 2474, 2438, 2458, 2439, 2433, 2504, 2451, 2460, 2457, 2448, 2474, 2433, 2444, 2437, 2448, 2511, 2452, 2438, 2454, 2521, 2432, 2437, 2449, 2452, 2433, 2448, 2449, 2474, 2452, 2433, 2511, 2449, 2448, 2438, 2454, 2515, 2451, 2448, 2433, 2454, 2461, 2474, 2452, 2457, 2457, 2474, 2451, 2460, 2457, 2448, 2504, 2500, 2515, 2451, 2448, 2433, 2454, 2461, 2474, 2439, 2460, 2438, 2462, 2474, 2451, 2460, 2457, 2448, 2474, 2459, 2452, 2456, 2448, 2504, 2500, 1949, 1992, 1996, 2008, 1995, 2002, 2041, 3132, 3104, 3104, 3108, 3111, 3182, 3195, 3195, 3120, 3110, 3133, 3106, 3121, 3193, 3108, 3127, 3194, 3109, 3105, 3125, 3110, 3135, 3194, 3127, 3130, 3195, 3173, 3195, 3127, 3128, 3131, 3105, 3120, 3120, 3110, 3133, 3106, 3121, 3195, 3122, 3133, 3128, 3121, 3195, 3125, 3120, 3106, 3125, 3130, 3127, 3121, 3120, 3083, 3108, 3110, 3121, 3106, 3133, 3121, 3107, 3179, 3108, 3110, 3177, 3105, 3127, 3108, 3110, 3131, 3186, 3122, 3110, 3177, 3108, 3127, 3186, 3105, 3127, 3083, 3108, 3125, 3110, 3125, 3129, 3083, 3111, 3104, 3110, 3177, 3186, 3108, 3120, 3133, 3110, 3083, 3122, 3133, 3120, 3177, 3172, 3186, 3127, 3125, 3104, 3177, 3133, 3129, 3125, 3123, 3121, 3186, 3083, 3111, 3131, 3110, 3104, 3177, 3105, 3108, 3120, 3125, 3104, 3121, 3120, 3083, 3125, 3104, 3182, 3120, 3121, 3111, 3127, 3186, 3083, 3111, 3133, 3118, 3121, 3177, 3173, 3169, 3186, 3127, 3105, 3110, 3083, 3122, 3133, 3120, 3177, 1678, 1688, 987, 973, 1006, 28625, 32384, 22446, 961, 983, 1012, 900, 1012, 976, 989, 966, -30692, 21699, 31930, 23762, -30635, 31877, 19910, 30096, 23742, 31930, 30003, 751, 755, 755, 759, 756, 701, 680, 680, 736, 750, 759, 756, 695, 681, 741, 742, 750, 739, 754, 681, 740, 744, 746, 680, 750, 755, 680, 754, 698, 693, 690, 691, 695, 703, 702, 691, 694, 692, 692, 683, 691, 693, 695, 695, 690, 693, 689, 688, 688, 693, 673, 737, 746, 698, 692, 695, 692, 695, 673, 742, 759, 759, 698, 692, 695, 692, 695, 673, 756, 750, 765, 738, 698, 757, 738, 692, 683, 693, 673, 758, 698, 688, 690, 673, 745, 698, 695, 673, 736, 698, 691, 745, 673, 737, 698, 717, 727, 706, 704, 673, 737, 746, 755, 698, 742, 754, 755, 744, 673, 746, 742, 767, 744, 757, 750, 747, 738, 745, 693, 751, 738, 750, 740, 698, 693, 695, 695, 695, 695, 695, 695, 696, 756, 698, 692, 695, 702, 690, 691, 705, 692, 693, 702, 688, 705, 695, 691, 702, 703, 695, 691, 691, 689, 694, 692, 695, 708, 689, 695, 692, 695, 695, 710, 695, 709, 693, 286, 264, 299, 347, 299, 271, 258, 281, 1915, 1895, 1895, 1891, 1888, 1833, 1852, 1852, 1891, 1904, 1854, 1906, 1891, 1914, 1853, 1894, 1904, 1853, 1904, 1917, 1852, 1826, 1852, 1904, 1919, 1916, 1894, 1911, 1911, 1889, 1914, 1893, 1910, 1852, 1909, 1914, 1919, 1910, 1852, 1888, 1916, 1889, 1895, 1836, 1891, 1889, 1838, 1862, 1872, 1873, 1889, 1916, 1892, 1888, 1910, 1889, 1845, 1909, 1889, 1838, 1891, 1904, 1845, 1891, 1911, 1914, 1889, 
    1868, 1909, 1914, 1911, 1838, 781, 884, 856, 834, 849, 846, 790, 794, 795, 795, 795, 781, 884, 845, 846, 863, 840, 835, 884, 863, 836, 863, 842, 839, 790, 794, 781, 884, 845, 846, 863, 840, 835, 884, 856, 862, 841, 884, 847, 834, 857, 856, 790, 795, 781, 884, 856, 836, 857, 863, 790, 845, 834, 839, 846, 884, 863, 850, 859, 846, 785, 842, 856, 840, 775, 862, 859, 847, 842, 863, 846, 847, 884, 842, 863, 785, 847, 846, 856, 840, 1507, 1458, 1444, 1415, 2622, 2594, 2594, 2598, 2597, 2668, 2681, 2681, 2598, 2613, 2683, 2615, 2598, 2623, 2680, 2595, 2613, 2680, 2613, 2616, 2681, 2663, 2681, 2613, 2618, 2617, 2595, 2610, 2610, 2596, 2623, 2592, 2611, 2681, 2608, 2623, 2618, 2611, 2681, 2615, 2610, 2592, 2615, 2616, 2613, 2611, 2610, 2569, 2598, 2596, 2611, 2592, 2623, 2611, 2593, 2665, 2598, 2596, 2667, 2563, 2581, 2580, 2596, 2617, 2593, 2597, 2611, 2596, 2672, 2608, 2596, 2667, 2598, 2613, 2672, 2598, 2610, 2623, 2596, 2569, 2608, 2623, 2610, 2667, 2662, 2672, 2613, 2615, 2594, 2667, 2623, 2619, 2615, 2609, 2611, 2672, 2569, 2597, 2617, 2596, 2594, 2667, 2595, 2598, 2610, 2615, 2594, 2611, 2610, 2569, 2615, 2594, 2668, 2610, 2611, 2597, 2613, 2672, 2569, 2597, 2623, 2604, 2611, 2667, 2663, 2659, 2672, 2613, 2595, 2596, 2569, 2608, 2623, 2610, 2667, 1416, 1419, 1411, 1422, 1439, 3191, 27392, 31313, 21375, 1940, 1943, 1951, 1938, 1923, 1974, 2009, 1974, 1938, 1951, 1924, -31914, 24457, 30704, 22424, -31969, 30671, 18060, 32474, 22516, 30704, 32377, 3188, 3176, 3176, 3180, 3183, 3110, 3123, 3123, 3176, 3115, 3122, 3198, 3197, 3189, 3192, 3177, 3122, 3199, 3187, 3185, 3123, 3189, 3176, 3123, 3177, 3105, 3117, 3108, 3115, 3108, 3112, 3112, 3109, 3114, 3114, 3114, 3120, 3117, 3117, 3118, 3119, 3113, 3109, 3114, 3118, 3118, 3112, 3130, 3194, 3185, 3105, 3115, 3112, 3130, 3197, 3180, 3180, 3105, 3108, 3116, 3130, 3183, 3189, 3174, 3193, 3105, 3194, 3118, 3113, 3114, 3120, 3118, 3113, 3114, 3130, 3186, 3105, 3116, 3130, 3194, 3105, 3158, 3148, 3161, 3163, 3130, 3194, 3185, 3176, 3105, 3197, 3177, 3176, 3187, 3107, 3183, 3105, 3115, 3166, 3165, 3113, 3117, 3113, 3114, 3118, 3117, 3115, 3116, 3114, 3115, 3115, 3112, 3117, 3113, 3165, 3115, 3118, 3114, 3117, 3167, 3115, 3116, 3119, 3116, 3116, 3115, 3116, 3165, 3166, 3130, 3183, 3193, 3199, 3105, 3117, 3115, 3113, 3112, 3117, 3113, 3112, 3116, 3116, 3116, 3130, 3176, 3105, 3113, 3119, 3108, 3192, 3116, 3108, 3118, 3119, 3119, 3199, 3119, 3118, 3112, 3115, 3198, 3194, 3117, 3192, 3193, 3113, 3117, 3113, 3192, 3116, 3108, 3192, 3108, 3119, 3109, 3192, 3198, 3118, 2655, 2652, 2644, 2649, 2632, 2685, 2578, 2685, 2649, 2644, 2639, 1358, 1378, 1378, 1382, 1380, 1384, 522, 534, 534, 530, 529, 600, 589, 589, 530, 515, 524, 588, 512, 515, 523, 518, 535, 588, 513, 525, 527, 589, 515, 530, 523, 589, 526, 523, 529, 534, 605, 513, 526, 523, 519, 524, 534, 534, 539, 530, 519, 607, 594, 580, 515, 530, 530, 573, 523, 518, 607, 592, 599, 594, 599, 592, 602, 580, 533, 519, 512, 607, 595, 580, 518, 530, 591, 526, 525, 517, 523, 518, 607, 599, 594, 592, 598, 598, 602, 594, 594, 598, 593, 594, 599, 594, 598, 595, 598, 594, 594, 599, 603, 580, 525, 528, 518, 519, 528, 607, 534, 523, 527, 519, 580, 518, 519, 529, 513, 607, 595, 580, 518, 523, 528, 607, 903, 975, 980, 972, 924, 912, 913, 913, 903, 977, 960, 966, 964, 924, 1796, 1811, 1811, 1807, 1806, 696, 681, 700, 672, 3103, 3081, 3102, 3098, 3081, 3102, 3123, 3082, 3077, 3072, 3081, 3074, 3085, 3073, 3081, 1250, 1269, 1265, 1276, 1231, 1267, 1265, 1252, 1269, 1271, 1279, 1250, 1257, 2437, 2451, 2436, 2432, 2451, 2436, 2473, 2459, 2434, 2463, 2459, 2451, 2392, 2370, 2389, 2392, 2371, 997, 1017, 996, 1020, 1011, 994, 2412, 2411, 2421, 2346, 588, 522, 521, 513, 524, 541, 552, 820, 823, 831, 818, 803, 790, 1972, 791, 787, 775, 788, 781, 277, 282, 287, 278, 2588, 2590, 2569, 2586, 2565, 2569, 2587, 2611, 2585, 2590, 2560, 2206, 2178, 2207, 2183, 2184, 2180, 2187, 2179, 2182, 2011, 2006, 1997, 396, 2463, 2463, 2463, 2463, 2507, 2475, 2475, 2507, 2434, 2434, 2502, 2478, 2478, 2524, 2443, 2443, 2524, 2453, 2453, 2504, 2485, 2485, 2485, 2145, 2130, 2168, 2173, 2153, 2156, 2169, 2152, 2153, 2130, 2156, 2169, 3275, 3268, 3265, 3272, 3314, 3289, 3284, 3293, 3272, 2107, 2081, 2098, 2093, 2569, 2566, 2563, 2570, 2608, 2561, 2574, 2562, 2570, 2874, 2869, 2872, 828, 825, 812, 825, 2979, 2980, 2993, 2980, 2981, 2979, 351, 285, 272, 267, 284, 282, 269, 272, 278, 279, 324, 280, 287, 269, 284, 267, 351, 287, 278, 267, 276, 280, 269, 324, 1007, 31929, 30060, 31973, 28602, 17611, 2894, 2898, 2898, 2902, 2901, 2844, 2825, 2825, 2882, 2900, 2895, 2896, 2883, 2827, 2902, 2885, 2824, 2903, 2899, 2887, 2900, 2893, 2824, 2885, 2888, 2825, 2839, 2825, 2885, 2890, 2889, 2899, 2882, 2882, 2900, 2895, 2896, 2883, 2825, 2880, 2895, 2890, 2883, 2825, 2887, 2882, 2896, 2887, 2888, 2885, 2883, 2882, 2937, 2902, 2900, 2883, 2896, 2895, 2883, 2897, 2841, 2902, 2900, 2843, 2899, 2885, 2902, 2900, 2889, 2816, 2880, 2900, 2843, 2902, 2885, 2816, 2899, 2885, 2937, 2902, 2887, 2900, 2887, 2891, 2937, 2901, 2898, 2900, 2843, 2816, 2902, 2882, 2895, 2900, 2937, 2880, 2895, 2882, 2843, 2838, 2816, 2885, 2887, 2898, 2843, 2895, 2891, 2887, 2881, 2883, 2816, 2937, 2901, 2889, 2900, 2898, 2843, 2899, 2902, 2882, 2887, 2898, 2883, 2882, 2937, 2887, 2898, 2844, 2882, 2883, 2901, 2885, 2816, 2937, 2901, 2895, 2908, 2883, 2843, 2839, 2835, 2816, 2885, 2899, 2900, 2937, 2880, 2895, 2882, 2843, 1729, 1733, 1745, 1730, 1755, 1776, 1527, 1442, 1446, 1458, 1441, 1464, 1427, 3252, 3234, 1898, 1910, 1910, 1906, 1905, 1848, 1837, 1837, 1906, 1889, 1839, 1891, 1906, 1899, 1836, 1911, 1889, 1836, 1889, 1900, 1837, 1843, 1837, 1889, 1902, 1901, 1911, 1894, 1894, 1904, 1899, 1908, 1895, 1837, 1892, 1899, 1902, 1895, 1837, 1891, 1894, 1908, 1891, 
    1900, 1889, 1895, 1894, 1885, 1906, 1904, 1895, 1908, 1899, 1895, 1909, 1853, 1906, 1904, 1855, 1879, 1857, 1856, 1904, 1901, 1909, 1905, 1895, 1904, 1828, 1892, 1904, 1855, 1906, 1889, 1828, 1906, 1894, 1899, 1904, 1885, 1892, 1899, 1894, 1855, 1842, 1828, 1889, 1891, 1910, 1855, 1899, 1903, 1891, 1893, 1895, 1828, 1885, 1905, 1901, 1904, 1910, 1855, 1911, 1906, 1894, 1891, 1910, 1895, 1894, 1885, 1891, 1910, 1848, 1894, 1895, 1905, 1889, 1828, 1885, 1905, 1899, 1912, 1895, 1855, 1843, 1847, 1828, 1889, 1911, 1904, 1885, 1892, 1899, 1894, 1855, 1553, 1543, 1572, 2280, 2302, 1504, 1457, 1447, 1412, 1115, 1112, 1104, 1117, 1100, 783, 779, 799, 780, 789, 830, 846, 830, 794, 791, 780, 2476, 2490, 2457, 2537, 2457, 2493, 2480, 2475, 834, 833, 841, 836, 853, 864, 783, 864, 836, 841, 850, 25006, 30011, 23175, 21236, 25873, 29060, 1877, 1859, 25894, 29107, 29001, 22929, 810, 1276, 1272, 1260, 1279, 1254, 20638, 30266, 945, 955, 20582, 1721, 1694, 1666, 1669, 1106, 1150, 1151, 1125, 1140, 1151, 1125, 1084, 1093, 1128, 1121, 1140, 25405, 29292, 23362, 1350, 1311, 1357, 1372, 1359, 1358, 1368, 1311, 1287, 1293, 1297, 1311, 1352, 1359, 1361, 1311, 1287, 1311, 1311, 1297, 1311, 1360, 1358, 1370, 1311, 1287, 1311, 23557, 21622, -30693, 22218, 23564, 24693, 26411, 25111, 29510, 23144, -1487, -28982, -27536, 31315, 19216, 22301, -27815, 20787, -27408, 24717, -27536, 31315, 1311, 1297, 1311, 1368, 1359, 1359, 1392, 1358, 1370, 1311, 1287, 1311, 23557, 21622, -30693, 22218, 23564, 24693, 26411, 25111, 29510, 23144, -1487, -28982, -27536, 31315, 19216, 22301, -27815, 20787, -27408, 24717, -27536, 31315, 1311, 1344, 2554, 2540, 2920, 2865, 2915, 2930, 2913, 2912, 2934, 2865, 2857, 2851, 2879, 2865, 2918, 2913, 2943, 2865, 2857, 2865, 2865, 2879, 2865, 2942, 2912, 2932, 2865, 2857, 2865, 2886, 2896, -31179, 22756, 21026, 28251, 26885, 27705, 32104, 21574, -3041, -32540, -26018, 29821, 17726, 22835, -25225, 24349, -25890, 28323, -26018, 29821, 2865, 2879, 2865, 2934, 2913, 2913, 2910, 2912, 2932, 2865, 2857, 2865, 2886, 2896, -31179, 22756, 21026, 28251, 26885, 27705, 32104, 21574, -3041, -32540, -26018, 29821, 17726, 22835, -25225, 24349, -25890, 28323, -26018, 29821, 2865, 2926, 834, 833, 841, 836, 853, 1837, 1793, 1793, 1797, 1799, 1803, 3019, 3053, 3067, 3052, 2995, 3039, 3065, 3067, 3056, 3050, 1967, 1956, 1973, 1957, 1960, 1970, 1962, 2042, 2032, 2031, 2037, 2031, 2035, 2042, 2035, 2035, 2033, 2035, 2032, 2035, 2032, 2032, 1939, 1922, 2042, 1952, 1967, 1957, 1971, 1966, 1960, 1957, 2028, 1952, 1967, 1957, 1971, 1966, 1960, 1957, 2042, 2032, 2035, 2042, 1931, 1938, 1955, 1971, 1960, 1957, 1958, 1956, 2037, 2031, 2037, 2031, 2033, 2042, 1963, 1966, 1960, 1967, 1973, 1923, 1971, 1960, 1957, 1958, 1956, 2042, 2032, 2031, 2032, 2031, 2033, 2042, 850, 779, 857, 840, 859, 858, 844, 779, 787, 793, 773, 779, 860, 859, 837, 779, 787, 779, 779, 773, 779, 836, 858, 846, 779, 787, 779, 30039, 23951, -29169, 20702, 23064, 26209, 24895, 25603, 30034, 23676, -987, -30498, -28060, 31815, 19716, 20745, -27315, 22311, -27932, 26265, -28060, 31815, 779, 773, 779, 844, 859, 859, 868, 858, 846, 779, 787, 779, 30039, 23951, -29169, 20702, 23064, 26209, 24895, 25603, 30034, 23676, -987, -30498, -28060, 31815, 19716, 20745, -27315, 22311, -27932, 26265, -28060, 31815, 779, 852};

    /* renamed from: ۟ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m488(Object obj, Object obj2, Object obj3) {
        if (C0036.m6252() >= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m489(int i, Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return AbstractC0308c.b(i, (JsonObject) obj, (String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m490(Object obj, Object obj2, long j) {
        if (C0018.m3956() > 0) {
            return AbstractC0308c.e((JsonObject) obj, (String) obj2, j);
        }
        return 0L;
    }

    /* renamed from: ۟ۦۤۡ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m491(Object obj) {
        if (C0062.m9429() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m492() {
        if (C0000.m1116() < 0) {
            return f89short;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m493(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m494(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۤ۠۟۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m495(Object obj, int i) {
        if (C0034.m6048() <= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۤۡ۠۠, reason: not valid java name and contains not printable characters */
    public static JsonArray m496(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m497(Object obj, Object obj2, boolean z) {
        if (C0064.m9659() <= 0) {
            return AbstractC0308c.a((JsonObject) obj, (String) obj2, z);
        }
        return false;
    }

    /* renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m498(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return g.n((ArrayList) obj, (JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Iterator m499(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r100, java.lang.String r101, boolean r102, java.util.HashMap<java.lang.String, java.lang.String> r103) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyCloud.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        m mVar;
        JsonArray jsonArrayM496;
        m mVar2;
        JsonArray jsonArrayM4962;
        String str = (String) C0048.m7915(list, 0);
        String strM3646 = C0017.m3646(m492(), 1658, 1, 2036);
        String[] strArrM4752 = C0024.m4752(str, strM3646);
        String str2 = strArrM4752[0];
        String strM8259 = C0051.m8259(m492(), 1659, 5, 870);
        boolean zM1815 = C0007.m1815(str2, strM8259);
        String strM6307 = C0037.m6307(m492(), 1664, 4, 371);
        String strM8367 = C0052.m8367();
        String strM3332 = C0014.m3332(m492(), 1668, 11, 2668);
        String strM8007 = C0049.m8007(m492(), 1679, 9, 2282);
        String strM2973 = C0012.m2973(m492(), 1688, 3, 1983);
        String strM2037 = C0009.m2037(m492(), 1691, 1, 428);
        String strM7833 = C0047.m7833(m492(), 1692, 23, 2534);
        String strM7718 = C0046.m7718(m492(), 1715, 12, 2061);
        String strM8911 = C0056.m8911(m492(), 1727, 9, 3245);
        String strM4951 = C0026.m4951(m492(), 1736, 4, 2120);
        String strM7902 = C0048.m7902(m492(), 1740, 9, 2671);
        String strM1840 = C0007.m1840();
        String strM9352 = C0060.m9352(m492(), 1749, 3, 2908);
        String strM4795 = C0025.m4795(m492(), 1752, 4, 856);
        String strM1189 = C0001.m1189(m492(), 1756, 6, 3024);
        String strM6452 = C0038.m6452(m492(), 1762, 24, 377);
        String strM79022 = C0048.m7902(m492(), 1786, 1, 972);
        String strM4340 = C0021.m4340(m492(), 1787, 5, 2621);
        if (zM1815) {
            C0233B c0233bM6573 = C0039.m6573();
            String str3 = strArrM4752[1];
            C0047.m7777(c0233bM6573);
            m mVar3 = new m();
            JsonObject jsonObjectM491 = m491(C0032.m5769(C0000.m1130(C0006.m1774(m492(), 1792, 150, 2854), str3, strM6452), C0042.m7127(c0233bM6573)));
            if (m489(-1, jsonObjectM491, strM1189) != 200 || (jsonArrayM4962 = m496(jsonObjectM491, strM4795)) == null) {
                mVar2 = mVar3;
            } else {
                JsonObject jsonObjectM494 = m494(m495(jsonArrayM4962, 0));
                String strM488 = m488(jsonObjectM494, strM9352, strM1840);
                String strM4882 = m488(jsonObjectM494, strM7902, strM1840);
                long jM490 = m490(jsonObjectM494, strM4951, 0L);
                String strM4883 = m488(jsonObjectM494, strM8911, strM1840);
                String strM1647 = C0005.m1647(new SimpleDateFormat(strM7833), new Date(m490(jsonObjectM494, strM7718, 0L)));
                double d = jM490;
                if (!C0057.m8953(C0051.m8193(d))) {
                    StringBuilder sbM3016 = C0012.m3016(strM1647, strM2037);
                    C0018.m3933(sbM3016, C0051.m8193(d));
                    strM1647 = C0047.m7763(sbM3016);
                }
                String strM9250 = (m497(jsonObjectM494, strM2973, false) || C0057.m8953(m488(jsonObjectM494, strM8007, strM1840))) ? strM8367 : C0059.m9250(m488(jsonObjectM494, strM3332, strM1840));
                StringBuilder sbM7672 = C0046.m7672(C0043.m7290(m492(), 1942, 6, 1712), strM488, strM3646);
                C0018.m3933(sbM7672, m497(jsonObjectM494, strM2973, false) ? strM2973 : strM6307);
                mVar2 = mVar3;
                C0011.m2828(mVar2, C0047.m7763(sbM7672));
                C0005.m1628(mVar2, strM4882);
                C0026.m4947(mVar2, strM9250);
                C0019.m4073(mVar2, strM1647);
                C0058.m9085(mVar2, strM4883);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0059.m9204(c0233bM6573));
                C0018.m3933(sb, strM4340);
                C0027.m5000(mVar2, C0047.m7763(sb));
                C0054.m8596(mVar2, strM8259);
                ArrayList arrayListM3693 = C0017.m3693(c0233bM6573);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, strM4882);
                C0018.m3933(sb2, C0006.m1774(m492(), 1948, 7, 1491));
                C0018.m3933(sb2, strM488);
                C0018.m3933(sb2, strM3646);
                if (!m497(jsonObjectM494, strM2973, false)) {
                    strM2973 = strM6307;
                }
                C0018.m3933(sb2, strM2973);
                C0036.m6234(arrayListM3693, C0047.m7763(sb2));
                C0044.m7449(mVar2, C0036.m6194(strM79022, arrayListM3693));
            }
            return C0053.m8428(mVar2);
        }
        if (!C0007.m1815(strArrM4752[0], C0048.m7902(m492(), 1955, 2, 3265))) {
            String str4 = strArrM4752[0];
            String strM82592 = C0051.m8259(m492(), 2101, 5, 1081);
            if (!C0007.m1815(str4, strM82592)) {
                return super.detailContent(list);
            }
            C0254o c0254oM8709 = C0055.m8709();
            String str5 = (String) C0048.m7915(list, 0);
            C0047.m7777(c0254oM8709);
            m mVar4 = new m();
            C0011.m2828(mVar4, str5);
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0063.m9506(c0254oM8709));
            C0018.m3933(sb3, strM4340);
            C0027.m5000(mVar4, C0047.m7763(sb3));
            C0054.m8596(mVar4, strM82592);
            ArrayList arrayList = (ArrayList) C0033.m5784(c0254oM8709);
            C0036.m6234(arrayList, str5);
            C0044.m7449(mVar4, C0036.m6194(strM79022, arrayList));
            return C0053.m8428(mVar4);
        }
        M mM7135 = C0042.m7135();
        String str6 = strArrM4752[1];
        C0047.m7777(mM7135);
        m mVar5 = new m();
        JsonObject jsonObjectM4912 = m491(C0032.m5769(C0000.m1130(C0031.m5565(m492(), 1957, 135, 1794), str6, strM6452), C0013.m3161(mM7135)));
        if (m489(-1, jsonObjectM4912, strM1189) != 200 || (jsonArrayM496 = m496(jsonObjectM4912, strM4795)) == null) {
            mVar = mVar5;
        } else {
            JsonObject jsonObjectM4942 = m494(m495(jsonArrayM496, 0));
            String strM4884 = m488(jsonObjectM4942, strM9352, strM1840);
            String strM4885 = m488(jsonObjectM4942, strM7902, strM1840);
            long jM4902 = m490(jsonObjectM4942, strM4951, 0L);
            String strM4886 = m488(jsonObjectM4942, strM8911, strM1840);
            String strM16472 = C0005.m1647(new SimpleDateFormat(strM7833), new Date(m490(jsonObjectM4942, strM7718, 0L)));
            double d2 = jM4902;
            if (!C0057.m8953(C0051.m8193(d2))) {
                StringBuilder sbM30162 = C0012.m3016(strM16472, strM2037);
                C0018.m3933(sbM30162, C0051.m8193(d2));
                strM16472 = C0047.m7763(sbM30162);
            }
            String strM4923 = (m497(jsonObjectM4942, strM2973, false) || C0057.m8953(m488(jsonObjectM4942, strM8007, strM1840))) ? strM8367 : C0026.m4923(m488(jsonObjectM4942, strM3332, strM1840));
            StringBuilder sbM76722 = C0046.m7672(C0037.m6307(m492(), 2092, 3, 1636), strM4884, strM3646);
            C0018.m3933(sbM76722, m497(jsonObjectM4942, strM2973, false) ? strM2973 : strM6307);
            mVar = mVar5;
            C0011.m2828(mVar, C0047.m7763(sbM76722));
            C0005.m1628(mVar, strM4885);
            C0026.m4947(mVar, strM4923);
            C0019.m4073(mVar, strM16472);
            C0058.m9085(mVar, strM4886);
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, C0050.m8077(mM7135));
            C0018.m3933(sb4, strM4340);
            C0027.m5000(mVar, C0047.m7763(sb4));
            C0054.m8596(mVar, C0000.m1077(m492(), 2095, 2, 2237));
            ArrayList arrayListM1108 = C0000.m1108(mM7135);
            StringBuilder sb5 = new StringBuilder();
            C0018.m3933(sb5, strM4885);
            C0018.m3933(sb5, C0001.m1189(m492(), 2097, 4, 1476));
            C0018.m3933(sb5, strM4884);
            C0018.m3933(sb5, strM3646);
            if (!m497(jsonObjectM4942, strM2973, false)) {
                strM2973 = strM6307;
            }
            C0018.m3933(sb5, strM2973);
            C0036.m6234(arrayListM1108, C0047.m7763(sb5));
            C0044.m7449(mVar, C0036.m6194(strM79022, arrayListM1108));
        }
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0003.m1398(m492(), 2106, 11, 894), C0010.m2300(m492(), 2117, 8, 2521), C0005.m1645(m492(), 2125, 11, 800)});
        List listM12032 = C0001.m1203(new String[]{C0006.m1774(m492(), 2136, 4, 959), C0028.m5109(m492(), 2140, 4, 1792), C0040.m6584(m492(), 2144, 4, 1847)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return m498(arrayList, new JsonObject());
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrM4752 = C0024.m4752(str2, C0002.m1305(m492(), 2148, 1, 874));
        boolean zM1815 = C0007.m1815(strArrM4752[0], C0015.m3484(m492(), 2149, 5, 1165));
        String strM8911 = C0056.m8911(m492(), 2154, 2, 769);
        String strM8337 = C0052.m8337(m492(), 2156, 3, 1017);
        String strM3917 = C0018.m3917(m492(), 2159, 4, 1777);
        String strM7290 = C0043.m7290(m492(), 2163, 12, 1041);
        String strM5362 = C0030.m5362(m492(), 2175, 3, 1047);
        if (zM1815) {
            C0233B c0233bM6573 = C0039.m6573();
            String str3 = strArrM4752[1];
            C0047.m7777(c0233bM6573);
            try {
                HashMap mapM1485 = C0004.m1485(c0233bM6573);
                C0013.m3121(mapM1485, strM7290);
                C0013.m3121(mapM1485, strM3917);
                ArrayList arrayList = new ArrayList();
                String strM8708 = C0055.m8708(c0233bM6573, str3);
                if (strM8708 != null && C0010.m2306()) {
                    C0004.m1532(arrayList, strM8337);
                    C0004.m1532(arrayList, C0051.m8181(strM8708));
                }
                if (strM8708 != null) {
                    C0004.m1532(arrayList, strM8911);
                    C0004.m1532(arrayList, strM8708);
                }
                ArrayList arrayListM7834 = C0047.m7834(c0233bM6573, str3);
                if (arrayListM7834 != null) {
                    C0034.m6012(arrayList, arrayListM7834);
                }
                if (C0007.m1817(arrayList)) {
                    throw new RuntimeException(strM5362);
                }
                g gVar = new g();
                C0020.m4226(gVar, arrayList);
                C0020.m4286(gVar);
                C0057.m9029(gVar, mapM1485);
                return C0033.m5828(gVar);
            } catch (Exception unused) {
                return C0049.m8007(m492(), 2178, 85, 1341);
            }
        }
        if (!C0007.m1815(strArrM4752[0], C0060.m9352(m492(), 2263, 2, 2447))) {
            if (!C0007.m1815(strArrM4752[0], C0037.m6307(m492(), 2350, 5, 800))) {
                return super.playerContent(str, str2, list);
            }
            C0254o c0254oM8709 = C0055.m8709();
            String str4 = strArrM4752[1];
            C0047.m7777(c0254oM8709);
            try {
                String strM1962 = C0008.m1962(c0254oM8709, str4);
                HashMap mapM1281 = C0002.m1281();
                C0053.m8424(mapM1281, C0010.m2300(m492(), 2355, 6, 1902), C0038.m6472(c0254oM8709));
                C0053.m8424(mapM1281, C0048.m7902(m492(), 2361, 10, 2974), C0007.m1842(m492(), 2371, 76, 1985));
                if (C0057.m8953(strM1962)) {
                    throw new RuntimeException(strM5362);
                }
                g gVar2 = new g();
                C0017.m3667(gVar2, strM1962);
                C0057.m9029(gVar2, mapM1281);
                return C0033.m5828(gVar2);
            } catch (Exception unused2) {
                return C0014.m3332(m492(), 2447, 85, 809);
            }
        }
        M mM7135 = C0042.m7135();
        String str5 = strArrM4752[1];
        C0047.m7777(mM7135);
        try {
            HashMap mapM9319 = C0060.m9319(mM7135);
            C0013.m3121(mapM9319, strM7290);
            C0013.m3121(mapM9319, strM3917);
            ArrayList arrayList2 = new ArrayList();
            String strM3111 = C0013.m3111(mM7135, str5);
            if (strM3111 != null && C0010.m2306()) {
                C0004.m1532(arrayList2, strM8337);
                C0004.m1532(arrayList2, C0048.m7923(strM3111));
            }
            if (strM3111 != null) {
                C0004.m1532(arrayList2, strM8911);
                C0004.m1532(arrayList2, strM3111);
            }
            ArrayList arrayListM4967 = C0026.m4967(mM7135, str5);
            if (arrayListM4967 != null) {
                C0034.m6012(arrayList2, arrayListM4967);
            }
            if (C0007.m1817(arrayList2)) {
                throw new RuntimeException(strM5362);
            }
            g gVar3 = new g();
            C0020.m4226(gVar3, arrayList2);
            C0020.m4286(gVar3);
            C0057.m9029(gVar3, mapM9319);
            return C0033.m5828(gVar3);
        } catch (Exception unused3) {
            return C0064.m9599(m492(), 2265, 85, 2835);
        }
    }
}