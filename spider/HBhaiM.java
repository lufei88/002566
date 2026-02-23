package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
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
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.P;
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
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
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
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class HBhaiM extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f43short = {778, 790, 790, 786, 785, 856, 845, 845, 789, 789, 789, 844, 778, 771, 779, 783, 779, 771, 780, 794, 792, 844, 769, 781, 783, 1271, 1253, 1265, 1250, 1268, 1197, 1258, 1223, 1193, 1236, 1220, 1223, 1234, 1235, 1191, 1219, 1278, 1187, 1247, 1252, 1278, 1249, 1215, 1185, 1217, 1238, 1275, 1255, 1197, 1197, 1195, 1200, 1271, 1253, 1265, 1250, 1268, 1250, 1269, 1252, 1197, 1184, 1190, 1214, 1192, 1195, 1200, 1266, 1266, 1251, 1231, 1251, 1273, 1268, 1197, 1191, 1267, 1248, 1274, 1187, 1277, 1193, 1272, 1273, 1272, 1265, 1279, 1190, 1268, 1252, 1188, 1265, 1279, 1272, 1192, 1187, 1265, 1190, 1268, 1190, 1193, 1195, 1200, 1240, 1277, 1231, 1276, 1254, 1252, 1231, 1268, 1192, 1268, 1188, 1192, 1190, 1270, 1189, 1265, 1269, 1267, 1191, 1266, 1192, 1187, 1269, 1265, 1185, 1185, 1191, 1186, 1188, 1191, 1191, 1267, 1186, 1269, 1267, 1268, 1269, 1188, 1270, 1197, 1185, 1191, 1189, 1186, 1192, 1188, 1191, 1186, 1187, 1191, 1195, 1200, 1240, 1245, 1233, 1235, 1235, 1247, 1221, 1246, 1220, 1197, 1235, 1237, 1235, 1193, 1187, 1233, 1188, 1192, 1193, 1192, 1186, 1187, 1187, 1188, 1191, 1238, 1195, 1200, 1231, 1256, 1278, 1231, 1265, 1267, 1267, 1269, 1251, 1251, 1267, 1279, 1253, 1278, 1252, 1231, 1254, 1273, 1251, 1273, 1252, 1269, 1268, 1197, 1185, 1195, 1200, 1266, 1266, 1251, 1231, 1252, 1279, 1275, 1269, 1278, 1197, 1272, 1240, 1270, 1189, 1242, 1220, 1250, 1271, 1242, 1255, 1251, 1252, 1266, 1221, 1275, 1251, 1187, 1276, 1184, 1184, 1184, 1271, 1256, 1224, 1225, 1236, 1243, 1231, 1186, 1234, 1252, 1254, 1225, 1273, 1189, 1233, 1238, 1184, 1189, 1188, 1184, 1240, 1276, 1278, 1191, 1265, 1246, 1276, 1192, 1277, 1195, 1200, 1240, 1277, 1231, 1276, 1248, 1254, 1252, 1231, 1268, 1192, 1268, 1188, 1192, 1190, 1270, 1189, 1265, 1269, 1267, 1191, 1266, 1192, 1187, 1269, 1265, 1185, 1185, 1191, 1186, 1188, 1191, 1191, 1267, 1186, 1269, 1267, 1268, 1269, 1188, 1270, 1197, 1185, 1191, 1189, 1186, 1192, 1193, 1187, 1193, 1193, 1190, 24312, 28416, 18772, -1826, 26317, -29712, 28334, 18921, 21972, 18809, 25138, 17781, 21092, 30103, 22997, 17864, -3006, -31593, 17764, -31222, 26078, 26928, 17864, 21702, 17675, 32264, 28472, 20586, -31661, 26503, 23645, 2409, 2409, 2409, -31435, -31435, -2538, -27466, 24016, 27450, -791, -791, -791, 25026, 18053, 28305, 20887, 18101, 27998, 28146, 20889, 20931, 17924, 24555, 18476, 22007, 24555, 18476, 22007, 26197, -29848, 21836, 18913, -1973, -1973, -1973, -1973, -29977, 29217, 25361, 19262, 19220, 23619, -30598, 27566, 20596, 1356, 1354, 1372, 1355, 1300, 1368, 1374, 1372, 1367, 1357, 279, 309, 288, 307, 310, 310, 315, 373, 367, 372, 362, 378, 370, 269, 307, 308, 318, 309, 301, 297, 378, 276, 270, 378, 363, 362, 372, 362, 353, 378, 269, 307, 308, 364, 366, 353, 378, 290, 364, 366, 371, 378, 283, 298, 298, 310, 319, 269, 319, 312, 273, 307, 302, 373, 367, 361, 365, 372, 361, 364, 378, 370, 273, 274, 270, 279, 278, 374, 378, 310, 307, 305, 319, 378, 285, 319, 313, 305, 309, 371, 378, 281, 306, 296, 309, 311, 319, 373, 363, 363, 365, 372, 362, 372, 362, 372, 362, 378, 265, 315, 316, 315, 296, 307, 373, 367, 361, 365, 372, 361, 364, 3080, 3074, 3092, 3094, 3183, 3182, 3112, 3105, 3113, 3117, 3113, 3105, 3118, 3107, 3115, 2568, 2575, 2593, 2575, 2621, 2575, 2592, 2574, 2680, 2679, 2552, 2548, 2548, 2544, 2546, 2558, 1103, 1101, 1103, 1092, 1097, 1025, 1103, 1091, 1090, 1112, 1118, 1091, 1088, 3107, 3119, 3126, 3171, 3119, 3113, 3115, 3187, 3198, 1764, 1778, 1780, 1722, 1780, 1791, 1722, 1762, 1782, 2954, 3046, 3015, 3036, 2945, 3049, 2963, 3050, 3034, 3017, 3014, 3020, 2954, 2963, 3038, 2965, 2954, 2960, 2954, 2948, 2952, 2954, 3051, 3008, 3034, 3015, 3013, 3009, 3037, 3013, 2954, 2963, 3038, 2965, 2954, 2969, 2971, 2960, 2954, 2948, 2952, 2954, 3055, 3015, 3015, 3023, 3012, 3021, 2952, 3051, 3008, 3034, 3015, 3013, 3021, 2954, 2963, 3038, 2965, 2954, 2969, 2971, 2960, 2954, 820, 802, 804, 874, 804, 815, 874, 818, 806, 874, 810, 808, 805, 814, 811, 802, 1716, 1723, 626, 612, 610, 556, 610, 617, 556, 628, 608, 556, 625, 621, 608, 629, 615, 622, 627, 620, 1013, 896, 958, 953, 947, 952, 928, 932, 1013, 3061, 3056, 3047, 3058, 3041, 3044, 3045, 2989, 3049, 3054, 3059, 3045, 3043, 3061, 3058, 3045, 2989, 3058, 3045, 3057, 3061, 3045, 3059, 3060, 3059, 2584, 1416, 1438, 1432, 1494, 1437, 1438, 1423, 1432, 1427, 1494, 1416, 1426, 1423, 1438, 2360, 2361, 2360, 2355, 2511, 2521, 2527, 2449, 2522, 2521, 2504, 2527, 2516, 2449, 2513, 2515, 2520, 2521, 1534, 1521, 1510, 1529, 1527, 1521, 1508, 1525, 1419, 1437, 1435, 1493, 1438, 1437, 1420, 1435, 1424, 1493, 1421, 1419, 1437, 1418, 1556, 1562, 2404, 2418, 2420, 2362, 2417, 2418, 2403, 2420, 2431, 2362, 2419, 2418, 2404, 2403, 3080, 3075, 3087, 3097, 3073, 3081, 3074, 3096, 2225, 2227, 2227, 2229, 2208, 2212, 2301, 2236, 2225, 2238, 2231, 2213, 2225, 2231, 2229, 2939, 2921, 2860, 2882, 2895, 2861, 2939, 2921, 2874, 2928, 2876, 2865, 2863, 2872, 3072, 3074, 3097, 3103, 3074, 3097, 3076, 3081, 3283, 3227, 3222, 3210, 3206, 3279, 1862, 1863, 2803, 2746, 2739, 2734, 2729, 2737, 2801, 525, 2786, 2724, 2744, 2721, 2213, 2236, 2302, 2236, 2233, 2211, 2212, 2301, 2213, 2238, 2211, 2212, 2217, 2236, 2229, 2228, 2302, 2212, 2232, 2210, 2229, 2225, 2228, 2236, 2233, 2211, 2212, 2302, 2237, 2226, 2301, 2272, 2288, 2286, 2288, 2236, 2233, 256, 269, 274, 330, 265, 257, 256, 269, 261, 329, 262, 267, 256, 285, 997, 2161, 2155, 2172, 2175, 2561, 446, 442, 432, 505, 438, 417, 438, 419, 438, 421, 506, 484, 2985, 2984, 3001, 2163, 2172, 2175, 2149, 2164, 2110, 2081, 2088, 2089, 3192, 3136, 3087, 2237, 2220, 2220, 2224, 2229, 2239, 2237, 2216, 2229, 2227, 2226, 2291, 2212, 2289, 2219, 2219, 2219, 2289, 2234, 2227, 2222, 2225, 2289, 2217, 2222, 2224, 2233, 2226, 2239, 2227, 2232, 2233, 2232, 1953, 1962, 1958, 1969, 1980, 1973, 1952, 2040, 2036, 2019, 1975, 1952, 1969, 1968, 1975, 1963, 1946, 1965, 1969, 1960, 1961, 2040, 2036, 2019, 1972, 1968, 
    1962, 1969, 1952, 1973, 1964, 1953, 2040, 2037, 2019, 1960, 1952, 1974, 1974, 1956, 1954, 1952, 2040, 526, 601, 605, 577, 587, 579, 631, 602, 589, 600, 580, 593, 631, 581, 589, 603, 603, 585, 591, 589, 533, 537, 536, 2819, 2908, 2883, 2911, 2904, 2817, 2895, 2910, 2889, 2893, 2904, 2889, 2817, 2534, 2554, 2533, 2467, 2495, 2470, 678, 640, 662, 641, 734, 690, 660, 662, 669, 647, 2230, 2196, 2177, 2194, 2199, 2199, 2202, 2260, 2254, 2261, 2251, 2267, 2259, 2231, 2194, 2197, 2190, 2179, 2240, 2267, 2234, 2197, 2207, 2185, 2196, 2194, 2207, 2267, 2250, 2251, 2240, 2267, 2230, 2226, 2267, 2243, 2267, 2216, 2238, 2267, 2233, 2190, 2194, 2199, 2207, 2260, 2218, 2224, 2218, 2250, 2261, 2250, 2242, 2251, 2243, 2249, 2243, 2261, 2251, 2251, 2249, 2258, 2267, 2234, 2187, 2187, 2199, 2206, 2220, 2206, 2201, 2224, 2194, 2191, 2260, 2254, 2248, 2252, 2261, 2248, 2253, 2267, 2259, 2224, 2227, 2223, 2230, 2231, 2263, 2267, 2199, 2194, 2192, 2206, 2267, 2236, 2206, 2200, 2192, 2196, 2258, 2267, 2232, 2195, 2185, 2196, 2198, 2206, 2260, 2243, 2252, 2261, 2251, 2261, 2255, 2249, 2243, 2251, 2261, 2250, 2251, 2250, 2267, 2230, 2196, 2201, 2194, 2199, 2206, 2267, 2216, 2202, 2205, 2202, 2185, 2194, 2260, 2254, 2248, 2252, 2261, 2248, 2253, 599, 629, 629, 627, 614, 610, 1198, 1215, 1186, 1198, 1269, 1194, 1206, 1211, 1203, 1204, 1270, 1274, 1264, 1269, 1264, 1249, 1274, 1195, 1255, 1258, 1268, 1258, 1259, 2369, 2413, 2412, 2422, 2407, 2412, 2422, 2351, 2390, 2427, 2418, 2407, 1734, 1683, 1740, 1755, 1743, 1739, 1755, 1741, 1738, 1755, 1754, 1683, 1737, 1751, 1738, 1750, 2979, 2998, 2999, 2995, 2959, 2959, 2955, 2985, 2974, 2954, 2958, 2974, 2952, 2959, 3168, 3178, 3196, 3198, 3079, 3078, 3136, 3145, 3137, 3141, 3137, 3145, 3142, 3147, 3139, 758, 753, 735, 753, 707, 753, 734, 752, 646, 649, 1687, 1723, 1723, 1727, 1725, 1713, 306, 366, 372, 312, 296, 319, 315, 305, 375, 315, 310, 310, 372, 316, 309, 308, 302, 375, 301, 319, 307, 317, 306, 302, 375, 312, 309, 310, 318, 1750, 1738, 1738, 1742, 1741, 1668, 1681, 1681, 1757, 1746, 1745, 1739, 1754, 1762, 1680, 1679, 1670, 1671, 1762, 1680, 1757, 1744, 1681, 1738, 1681, 1765, 1759, 1683, 1732, 1791, 1683, 1764, 1678, 1683, 1671, 1763, 1685, 3161, 713, 3027, 1778, 2650, 2651, 29804, 24104, 32290, -32047, 22896, 21789, 26782, 31460, -31134, -28941, 31267, 26682, 31672, 1326, 1318, 3013, 2974, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2961, 2972, 2956, 2961, 2954, 2958, 2944, 2955, 3015, 3039, 3015, 3015, 3017, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2945, 2960, 2961, 2954, 2958, 2944, 2955, 3015, 3039, 3015, 3015, 3017, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2965, 3028, 3031, 3030, 2961, 2954, 2958, 2944, 2955, 3015, 3039, 3015, 3015, 3017, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2961, 2954, 2958, 2944, 2955, 3015, 3039, 3013, 3015, 3015, 3017, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2950, 2954, 2954, 2958, 2956, 2944, 3015, 3039, 3013, 3015, 3015, 3017, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2960, 2950, 2950, 2954, 2954, 2958, 2956, 2944, 3015, 3039, 3015, 3015, 3017, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3013, 3015, 2966, 2956, 2961, 2944, 3015, 3039, 3013, 3015, 3015, 3055, 3013, 3013, 3013, 3013, 3013, 3013, 2968, 523, 526, 522, 514, 525, 512, 520, 3146, 3158, 3158, 3154, 2147, 2169, 2148, 2165, 2737, 2797, 2811, 2815, 2796, 2813, 2806, 2736, 2806, 2794, 2803, 2721, 2805, 2811, 2791, 2793, 2801, 2796, 2810, 2723, 497, 488, 426, 488, 493, 503, 496, 425, 497, 490, 503, 496, 509, 488, 481, 480, 426, 496, 492, 502, 481, 485, 480, 488, 493, 503, 496, 426, 489, 486, 425, 436, 420, 442, 420, 488, 493, 2883, 2894, 2897, 2825, 2890, 2882, 2883, 2894, 2886, 2826, 2885, 2888, 2883, 2910, 2997, 2690, 2712, 2703, 2700, 902, 947, 951, 957, 1012, 955, 940, 955, 942, 955, 936, 1015, 1001, 288, 289, 304, 2403, -31908, 18388, 32131, 2282, 2247, 2244, 2244, 2240, 26084, -32413, 24259, 27325, -30546, 23005, 18045, 27922, 25726, -30399, -32537, 32464, 22526, 26076, 30302, 29298, 30738, 2209, -29924, 23421, 2248, 2244, 2244, 2240, 2242, 2254, -30864, -32537, -30920, 22990, 2209, 29298, 30738, 24475, 24555, 2193, 2187, 2243, 2271, 2271, 2267, 2264, 2193, 2180, 2180, 2268, 2268, 2268, 2181, 2243, 2250, 2242, 2246, 2242, 2250, 2245, 2259, 2257, 2181, 2248, 2244, 2246, 2180, 524, 518, 528, 530, 619, 618, 556, 549, 557, 553, 557, 549, 554, 551, 559};
    public String g = C0003.m1398(m276(), 0, 25, 866);
    public String h = C0026.m4951(m276(), 25, 303, 1168);
    public final String[] i = {C0024.m4740(m276(), 328, 10, 2002), C0039.m6551(m276(), 338, 15, 2894), C0031.m5565(m276(), 353, 12, 2327), C0056.m8911(m276(), 365, 6, 1000), C0026.m4951(m276(), 371, 10, 2238), C0049.m8007(m276(), 381, 6, 1686), C0006.m1774(m276(), 387, 8, 1866), C0052.m8337(m276(), 395, 9, 1342)};
    public AlertDialog j;

    /* renamed from: ۟۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static Response m273(Object obj) {
        if (C0037.m6350() < 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Request m274(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m275(Object obj, Object obj2, Object obj3) {
        if (C0020.m4210() <= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m276() {
        if (C0034.m6048() <= 0) {
            return f43short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static ResponseBody m277(Object obj) {
        if (C0025.m4797() > 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m278(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Call m279(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m280(Object obj) {
        if (C0023.m4566() < 0) {
            return AbstractC0308c.k((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m281(Object obj, Object obj2, Object obj3) {
        if (C0006.m1726() <= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۠ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static MediaType m282(Object obj) {
        if (C0051.m8216() < 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۤ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m283(Object obj, Object obj2) {
        if (C0039.m6529() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۥ۠ۦۦ, reason: contains not printable characters */
    public static RequestBody m284(Object obj, Object obj2) {
        if (C0021.m4379() >= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    public final HashMap a() {
        HashMap mapM4251 = C0020.m4251(C0052.m8337(m276(), 404, 10, 1337), C0014.m3332(m276(), 414, 111, 346));
        String strM1542 = C0004.m1542(C0040.m6584(m276(), 525, 15, 3136));
        C0053.m8424(mapM4251, C0006.m1774(m276(), 550, 6, 2459), !C0057.m8953(strM1542) ? C0025.m4800(strM1542, C0052.m8337(m276(), 540, 10, 2643), C0007.m1840()) : C0051.m8250(this));
        C0053.m8424(mapM4251, C0035.m6131(m276(), 556, 13, 1068), C0007.m1842(m276(), 569, 9, 3150));
        C0053.m8424(mapM4251, C0013.m3106(m276(), 578, 9, 1687), C0002.m1305(m276(), 587, 64, 2984));
        C0053.m8424(mapM4251, C0029.m5256(m276(), 651, 16, 839), C0021.m4340(m276(), 667, 2, 1675));
        C0053.m8424(mapM4251, C0048.m7902(m276(), 669, 18, 513), C0050.m8131(m276(), 687, 9, 983));
        C0053.m8424(mapM4251, C0065.m9775(m276(), 696, 25, 2944), C0006.m1774(m276(), 721, 1, 2601));
        C0053.m8424(mapM4251, C0003.m1398(m276(), 722, 14, 1531), C0019.m4107(m276(), 736, 4, 2390));
        C0053.m8424(mapM4251, C0064.m9599(m276(), 740, 14, 2492), C0037.m6307(m276(), 754, 8, 1424));
        C0053.m8424(mapM4251, C0034.m6001(m276(), 762, 14, 1528), C0014.m3332(m276(), 776, 2, 1579));
        C0053.m8424(mapM4251, C0040.m6584(m276(), 778, 14, 2327), C0003.m1398(m276(), 792, 8, 3180));
        C0053.m8424(mapM4251, C0045.m7657(m276(), 800, 15, 2256), C0035.m6131(m276(), 815, 14, 2817));
        C0053.m8424(mapM4251, C0050.m8131(m276(), 829, 8, 3184), C0037.m6307(m276(), 837, 6, 3238));
        return mapM4251;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (C0007.m1815(str, C0033.m5852(m276(), 843, 2, 1911))) {
            C0040.m6650(this);
            return C0007.m1840();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0011.m2747(sb, C0016.m3558(this), C0064.m9599(m276(), 845, 7, 2780), str, C0047.m7833(m276(), 852, 1, 544));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0028.m5188(sb, str2, C0040.m6584(m276(), 853, 4, 2764)), C0026.m4925(this))), C0032.m5708(m276(), 857, 37, 2256)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2037 = C0009.m2037(m276(), 894, 14, 356);
            d dVarM5333 = C0030.m5333(mVar, strM2037);
            String strM3525 = C0016.m3525(m276(), 908, 1, 900);
            String strM9669 = C0064.m9669((m) C0028.m5161(C0038.m6459(dVarM5333, strM3525), 0));
            String strM2339 = C0010.m2339((m) C0028.m5161(C0038.m6459(C0030.m5333(mVar, strM2037), strM3525), 0), C0001.m1189(m276(), 909, 4, 2073));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0016.m3558(this));
            String strM7509 = C0044.m7509(m276(), 913, 1, 2606);
            C0018.m3933(sb2, strM7509);
            C0018.m3933(sb2, C0049.m8058(C0030.m5333(mVar, C0054.m8574(m276(), 914, 12, 471)), C0026.m4951(m276(), 926, 3, 3034)));
            C0032.m5685(C0038.m6434(new StringBuilder(), C0016.m3558(this), strM7509, strM2339), strM9669, C0047.m7763(sb2), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        if (!C0058.m9127(C0032.m5769((String) C0048.m7915(list, 0), C0026.m4925(this)), C0051.m8259(m276(), 929, 9, 2064))) {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0054.m8574(m276(), 938, 3, 3108)), (CharSequence) C0048.m7915(list, 0));
            while (C0003.m1405(matcherM6026)) {
                OkHttpClient okHttpClient = new OkHttpClient();
                Random random = new Random();
                String[] strArrM3347 = C0014.m3347(this);
                String str = strArrM3347[C0025.m4817(random, strArrM3347.length)];
                String strM4199 = C0020.m4199(m276(), 941, 33, 2268);
                MediaType mediaTypeM282 = m282(strM4199);
                StringBuilder sb = new StringBuilder(C0007.m1842(m276(), 974, 43, 1989));
                C0018.m3933(sb, str);
                C0018.m3933(sb, C0028.m5109(m276(), 1017, 23, 552));
                RequestBody requestBodyM284 = m284(mediaTypeM282, C0047.m7763(sb));
                Request.Builder builder = new Request.Builder();
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0016.m3558(this));
                C0018.m3933(sb2, C0018.m3917(m276(), 1040, 13, 2860));
                C0018.m3933(sb2, C0062.m9422(matcherM6026));
                C0018.m3933(sb2, C0009.m2037(m276(), 1053, 6, 2507));
                Request.Builder builderM275 = m275(m275(m275(m275(m283(m278(builder, C0047.m7763(sb2)), requestBodyM284), C0049.m8007(m276(), 1059, 10, 755), C0013.m3106(m276(), 1069, 143, 2299)), C0057.m8978(m276(), 1212, 6, 534), C0063.m9585(m276(), 1218, 23, 1242)), C0007.m1842(m276(), 1241, 12, 2306), strM4199), C0024.m4740(m276(), 1253, 16, 1726), C0038.m6452(m276(), 1269, 14, 3067));
                String strM1542 = C0004.m1542(C0008.m1970(m276(), 1283, 15, 3112));
                C0037.m6312(m277(m273(m279(okHttpClient, m274(m275(builderM275, C0035.m6131(m276(), 1308, 6, 1748), !C0057.m8953(strM1542) ? C0025.m4800(strM1542, C0015.m3484(m276(), 1298, 10, 685), C0007.m1840()) : C0051.m8250(this)))))));
            }
        }
        String strM5769 = C0032.m5769((String) C0048.m7915(list, 0), C0026.m4925(this));
        String strM4684 = C0024.m4684(C0030.m5333(C0016.m3577(strM5769), C0039.m6551(m276(), 1314, 29, 346)));
        ArrayList arrayList = new ArrayList();
        Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0035.m6131(m276(), 1343, 37, 1726)), strM5769);
        while (C0003.m1405(matcherM60262)) {
            C0004.m1532(arrayList, C0062.m9422(matcherM60262));
        }
        ArrayList arrayList2 = new ArrayList(new LinkedHashSet(arrayList));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0027.m5000(mVar, C0055.m8703());
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar, strM4684);
        C0044.m7449(mVar, C0014.m3356(this, arrayList2));
        C0054.m8596(mVar, C0030.m5351(this));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0036.m6188(m276(), 1380, 1, 3176), C0031.m5565(m276(), 1381, 1, 763), C0001.m1189(m276(), 1382, 1, 3040), C0053.m8477(m276(), 1383, 1, 1735), C0044.m7509(m276(), 1384, 2, 2667)});
        List listM12032 = C0001.m1203(new String[]{C0012.m2973(m276(), 1386, 2, 345), C0057.m8978(m276(), 1388, 3, 2839), C0026.m4951(m276(), 1391, 2, 1973), C0030.m5362(m276(), 1393, 2, 1048), C0064.m9599(m276(), 1395, 6, 1357)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0007.m1840(), null, arrayList);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
        super.init(context, C0053.m8477(m276(), 1401, 164, 3045));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        JsonObject jsonObjectM280 = m280(str);
        String strM1305 = C0002.m1305(m276(), 1565, 7, 611);
        String strM1840 = C0007.m1840();
        if (!C0057.m8953(m281(jsonObjectM280, strM1305, strM1840))) {
            String strM281 = m281(jsonObjectM280, strM1305, strM1840);
            this.h = strM281;
            if (C0058.m9127(strM281, C0007.m1842(m276(), 1572, 4, 3106))) {
                this.h = C0032.m5769(C0051.m8250(this), null);
            }
        }
        String strM8814 = C0055.m8814(m276(), 1576, 4, 2064);
        if (!C0057.m8953(m281(jsonObjectM280, strM8814, strM1840))) {
            this.g = m281(jsonObjectM280, strM8814, strM1840);
        }
        super.init(context, str);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0038.m6434(new StringBuilder(), C0016.m3558(this), C0018.m3917(m276(), 1580, 20, 2718), str), C0026.m4925(this))), C0041.m6779(m276(), 1600, 37, 388)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM3646 = C0017.m3646(m276(), 1637, 14, 2855);
            d dVarM5333 = C0030.m5333(mVar, strM3646);
            String strM3917 = C0018.m3917(m276(), 1651, 1, 3028);
            String strM9669 = C0064.m9669((m) C0028.m5161(C0038.m6459(dVarM5333, strM3917), 0));
            String strM2339 = C0010.m2339((m) C0028.m5161(C0038.m6459(C0030.m5333(mVar, strM3646), strM3917), 0), C0021.m4340(m276(), 1652, 4, 2794));
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0016.m3558(this));
            String strM8131 = C0050.m8131(m276(), 1656, 1, 937);
            C0018.m3933(sb, strM8131);
            C0018.m3933(sb, C0049.m8058(C0030.m5333(mVar, C0009.m2037(m276(), 1657, 12, 986)), C0006.m1774(m276(), 1669, 3, 339)));
            C0032.m5685(C0038.m6434(new StringBuilder(), C0016.m3558(this), strM8131, strM2339), strM9669, C0047.m7763(sb), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0006.m1734(this, C0056.m8909(str), C0014.m3332(m276(), 1672, 1, 2386), true);
    }

    public Runnable showdig() {
        int iM3103 = C0013.m3103(16);
        Activity activityM4453 = C0022.m4453();
        LinearLayout linearLayout = new LinearLayout(C0031.m5652());
        C0032.m5684(linearLayout, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
        C0009.m2112(linearLayout, layoutParams);
        TextView textView = new TextView(C0031.m5652());
        C0042.m7106(textView, C0024.m4740(m276(), 1673, 71, 2219));
        C0039.m6563(textView, 16.0f);
        C0017.m3709(textView, C0013.m3103(10), 0, C0013.m3103(10), C0013.m3103(16));
        C0026.m4878(textView, -16777216);
        EditText editText = new EditText(C0031.m5652());
        C0042.m7106(editText, C0004.m1542(C0062.m9389(m276(), 1744, 15, 580)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C0037.m6336(linearLayout, textView);
        C0041.m6790(linearLayout, editText, layoutParams2);
        C0047.m7781(new Handler(C0063.m9553()), new P(this, activityM4453, linearLayout, editText, 1));
        return null;
    }
}