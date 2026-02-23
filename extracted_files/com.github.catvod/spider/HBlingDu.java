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
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.h;
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
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class HBlingDu extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f47short = {1575, 1598, 1570, 1571, 1645, 1597, 1580, 1599, 1598, 1576, 1645, 1576, 1599, 1599, 1570, 1599, 1655, 1645, 1162, 1184, 1292, 690, 2804, 884, 875, 887, 880, 2935, 2930, 2930, 2885, 2915, 2918, 2918, 2916, 2931, 2917, 2917, 2931, 2930, 1111, 1147, 1146, 1120, 1137, 1146, 1120, 1081, 1088, 1133, 1124, 1137, 3089, 3072, 3072, 3100, 3097, 3091, 3089, 3076, 3097, 3103, 3102, 3167, 3098, 3075, 3103, 3102, 2583, 2619, 2618, 2592, 2609, 2618, 2592, 2681, 2584, 2609, 2618, 2611, 2592, 2620, 929, 928, 951, 951, 945, 956, 902, 939, 930, 951, 919, 956, 935, 959, 2010, 2001, 1987, 2001, 1991, 1984, 2401, 2412, 2405, 2416, 2396, 2417, 2892, 2880, 2881, 2891, 2886, 2907, 2886, 2880, 2881, 1744, 1729, 1735, 1733, 1774, 1749, 1741, 760, 745, 751, 749, 731, 737, 754, 749, 637, 609, 609, 613, 559, 570, 570, 623, 624, 615, 634, 571, 632, 636, 609, 634, 609, 611, 571, 630, 634, 632, 570, 628, 613, 636, 570, 611, 548, 570, 628, 613, 613, 570, 614, 630, 615, 624, 624, 635, 570, 614, 630, 615, 624, 624, 635, 600, 634, 611, 636, 624, 489, 492, 505, 492, 2952, 2975, 2969, 2965, 2952, 2974, 2953, 1469, 1464, 1442, 1445, 2361, 2344, 2350, 2348, 1357, 1372, 1370, 1368, 1374, 1362, 1352, 1363, 1353, 624, 629, 625, 629, 616, 2563, 2584, 2563, 2582, 2587, 2302, 2269, 2255, 2265, 2186, 2184, -32417, 28861, -25179, -31917, 2182, 2204, 1959, 1959, 1265, 1276, 2636, 2625, 2632, 2653, 2673, 2652, 1460, 1448, 1448, 1452, 1510, 1523, 1523, 1446, 1465, 1454, 1459, 1522, 1457, 1461, 1448, 1459, 1448, 1450, 1522, 1471, 1459, 1457, 1523, 1469, 1452, 1461, 1523, 1450, 1517, 1523, 1469, 1452, 1452, 1523, 1452, 1456, 1469, 1445, 1523, 1457, 1459, 1450, 1461, 1465, 1432, 1465, 1455, 1471, 1706, 1711, 1722, 1711, 1181, 1170, 1183, 1165, 1165, 1175, 1176, 1159, 800, 813, 804, 817, 779, 826, 821, 825, 817, 3066, 3046, 3042, 3057, 1157, 1180, 1175, 1196, 1162, 1174, 1170, 1153, 539, 514, 521, 562, 515, 524, 512, 520, 1623, 1604, 1619, 1623, 2174, 2151, 2156, 2135, 2153, 2170, 2157, 2153, 575, 568, 557, 574, 2562, 2587, 2576, 2603, 2581, 2583, 2560, 2587, 2566, 410, 407, 396, 411, 413, 394, 401, 396, 1225, 1232, 1243, 1248, 1243, 1238, 1229, 1242, 1244, 1227, 1232, 1229, 1167, 1160, 1170, 1172, 1161, 1154, 1171, 1157, 1155, 408, 385, 394, 433, 397, 385, 384, 410, 395, 384, 410, 2909, 2884, 2895, 2932, 2907, 2887, 2890, 2898, 2932, 2893, 2905, 2884, 2886, 2419, 2410, 2401, 2394, 2421, 2409, 2404, 2428, 2394, 2416, 2423, 2409, 305, 301, 301, 297, 355, 374, 374, 291, 316, 299, 310, 375, 308, 304, 301, 310, 301, 303, 375, 314, 310, 308, 374, 312, 297, 304, 374, 303, 360, 374, 312, 297, 297, 374, 297, 309, 312, 288, 374, 308, 310, 303, 304, 316, 285, 316, 301, 312, 304, 309, 298, 3275, 3273, 3280, 3279, 3267, 3318, 3274, 3271, 3295, 3267, 3284, 3306, 3279, 3285, 3282, 2616, 2618, 2595, 2620, 2608, 2565, 2617, 2612, 2604, 2608, 2599, 2587, 2612, 2616, 2608, 2559, 2531, 2542, 2550, 2538, 2557, 2502, 2539, 2823, 2834, 2827, 2833, 2829, 2822, 2823, 2862, 2827, 2833, 2838, -30301, 28182, 23397, -28815, 622, 628, 2919, 2919, 2919, 2953, 2956, 2966, 2961, 2778, 2809, 2795, 2813, 2734, 2732, 30094, 29337, -24703, -32393, 2722, 2744, 1621, 1624, 777, 789, 792, 768, 796, 779, 816, 797, 2279, 2299, 2299, 2303, 2229, 2208, 2208, 2293, 2282, 2301, 2272, 2209, 2274, 2278, 2299, 2272, 2299, 2297, 2209, 2284, 2272, 2274, 2208, 2286, 2303, 2278, 2208, 2297, 2238, 2208, 2286, 2303, 2303, 2208, 2303, 2275, 2286, 2294, 2208, 2274, 2272, 2297, 2278, 2282, 2251, 2282, 2299, 2286, 2278, 2275, 2300, 2562, 2567, 2578, 2567, 1697, 1716, 1709, 1719, 1707, 1696, 1697, 1672, 1709, 1719, 1712, 547, 546, 545, 544, 551, 550, 549, 548, 555, 554, 626, 625, 624, 631, 630, 629, 1156, 1161, 1999, 1999, 1402, 1399, 1406, 1387, 1351, 1386, 2732, 2723, 2735, 2727, 1129, 1136, 1147, 1088, 1142, 1147, 2229, 2220, 2215, 2204, 2221, 2210, 2222, 2214, 3042, 3054, 3063, 3044, 3059, 1248, 1273, 1266, 1225, 1254, 1279, 1269, 719, 723, 727, 708, 1623, 1614, 1605, 1662, 1624, 1604, 1600, 1619, 2583, 2572, 2583, 2562, 2575, 2598, 2579, 2570, 2576, 2572, 2567, 2566, 1303, 1294, 1285, 1342, 1299, 1284, 1292, 1280, 1299, 1290, 1298, 467, 463, 463, 459, 385, 404, 404, 449, 478, 457, 468, 405, 470, 466, 463, 468, 463, 461, 405, 472, 468, 470, 404, 474, 459, 466, 404, 461, 394, 404, 474, 459, 459, 404, 462, 456, 478, 457, 404, 461, 466, 456, 466, 463, 468, 457, 498, 469, 477, 468, 916, 918, 903, 1136, 1141, 1141, 1090, 1124, 1121, 1121, 1123, 1140, 1122, 1122, 1140, 1141, 3198, 3195, 3182, 3195, 677, 702, 698, 692, 703, 618, 630, 635, 611, 639, 616, 595, 638, 1648, 1661, 1754, 1743, 1750, 1740, 1744, 1755, 1754, 1782, 1755, 2953, 2972, 2949, 2975, 2947, 2952, 2953, 783, 1004, 1004, 3108, 1563, 1543, 1543, 1539, 1609, 1628, 1628, 1545, 1558, 1537, 1564, 1629, 1566, 1562, 1543, 1564, 1543, 1541, 1629, 1552, 1564, 1566, 1628, 1554, 1539, 1562, 1628, 1541, 1602, 1628, 1554, 1539, 1539, 1628, 1536, 1552, 1537, 1558, 1558, 1565, 1628, 1536, 1552, 1537, 1558, 1558, 1565, 1575, 1546, 1539, 1558, 30822, 21398, 1556, 1563, 1558, 1540, 1540, 1566, 1553, 1550, 21698, 20680, 2339, 2356, 2358, 2360, 2366, 2367, 22707, 18490, 1227, 1239, 1235, 1216, 2872, 2870, 2858, 2381, 2380, 2395, 2395, 2397, 2384, 2410, 2375, 2382, 2395, 2427, 2384, 2379, 2387, 2051, 2060, 2048, 2056, 26609, 23276, 28180, 27812, 1040, 2630, 2637, 2655, 2637, 2651, 2652, 1342, 1707, 1722, 1727, 1699, 1702, 1708, 1710, 1723, 1706, 1775, 1700, 1706, 1718, 1781, 1775, 18761, 27623, 417, 446, 417, 420, 445, 432, 419, 440, 421, 424, -30597, 20921, 483, 495, 492, 492, 485, 483, 500, 29366, 26183, 2177, 2182, 2205, 1162, 1181, 1168, 1161, 1177, 2617, 2620, 2601, 2620, 3159, 3162, 3155, 3142, 3196, 3149, 3138, 3150, 3142, 1228, 1217, 645, 648, 641, 660, 686, 664, 661, 1196, 1191, 1190, 1187, 
    1195, 1213, 1194, 1185, 305, 318, 307, 289, 289, 1590, 1593, 1596, 1572, 1589, 1570, 1571, 3297, 3309, 3308, 3302, 3307, 3318, 3307, 3309, 3308, 1395, 1378, 1380, 1382, 1357, 1398, 1390, 2443, 2458, 2460, 2462, 2472, 2450, 2433, 2462, 2519, 2507, 2507, 2511, 2437, 2448, 2448, 2501, 2522, 2509, 2512, 2449, 2514, 2518, 2507, 2512, 2507, 2505, 2449, 2524, 2512, 2514, 2448, 2526, 2511, 2518, 2448, 2505, 2446, 2448, 2526, 2511, 2511, 2448, 2509, 2522, 2524, 2512, 2514, 2514, 2522, 2513, 2523, 2448, 2509, 2522, 2524, 2512, 2514, 2514, 2522, 2513, 2523, 2540, 2506, 2525, 2547, 2518, 2508, 2507, 2575, 2570, 2591, 2570, 2462, 2441, 2447, 2435, 2462, 2440, 2463, 1790, 1787, 1761, 1766, 2744, 2718, 2696, 2719, 2752, 2732, 2698, 2696, 2691, 2713, 1026, 1030, 1029, 1049, 1049, 1053, 1090, 1113, 1091, 1116, 1119, 1091, 1117, 2742, 2745, 2748, 2736, 2747, 2721, 870, 887, 887, 2723, 2722, 2737, 2734, 2724, 2722, 2707, 2750, 2743, 2722, 1953, 1934, 1924, 1938, 1935, 1929, 1924, 3122, 3123, 3104, 3135, 3125, 3123, 3103, 3122, 1423, 1428, 1424, 1438, 1429, 2058, 2061, 2067, 969, 972, 985, 972, 2184, 2184, 578, 537, 530, 576, 537, 540, 531, 528, 520, 603, 535, 520, 528, 532, 531, 538, 576, 2710, 2778, 2777, 2755, 2776, 2757, 2701, 2212, 2225, 2216, 2226, 2222, 2213, 2212, 2184, 2213, 1567, 1539, 1550, 1558, 1546, 1565, 1574, 1547, 1198, 1202, 1202, 1206, 1276, 1257, 1257, 1212, 1187, 1204, 1193, 1256, 1195, 1199, 1202, 1193, 1202, 1200, 1256, 1189, 1193, 1195, 1257, 1191, 1206, 1199, 1257, 1200, 1271, 1257, 1191, 1206, 1206, 1257, 1206, 1194, 1191, 1215, 1257, 1195, 1193, 1200, 1199, 1187, 1154, 1187, 1202, 1191, 1199, 1194, 1205, 1099, 1111, 1114, 1090, 1118, 1097, 1134, 1097, 1111, 2822, 2842, 2842, 2846, 2900, 2881, 2881, 2836, 2827, 2844, 2817, 2880, 2819, 2823, 2842, 2817, 2842, 2840, 2880, 2829, 2817, 2819, 2881, 2831, 2846, 2823, 2881, 2840, 2911, 2881, 2831, 2846, 2846, 2881, 2846, 2818, 2831, 2839, 2881, 2831, 2816, 2831, 2818, 2839, 2845, 2823, 2845, 2851, 2817, 2840, 2823, 2827, 2875, 2844, 2818, -29049, 26930, 23617, -30635, 1354, 1360, 1770, 1787, 1768, 1769, 1791, 683, 686, 673, 674, 686, 676, 698, 3185, 3159, 3137, 3158, 3081, 3173, 3139, 3137, 3146, 3152, 2860, 2856, 2859, 2871, 2871, 2867, 2924, 2935, 2925, 2930, 2929, 2925, 2931, 540, 529, 533, 528, 529, 518, 1450, 793, 782, 771, 794, 778, 1614, 1602, 1603, 1609, 1604, 1625, 1604, 1602, 1603, 2820, 2837, 2835, 2833, 2874, 2817, 2841, 951, 934, 928, 930, 916, 942, 957, 930, 937, 949, 949, 945, 1019, 1006, 1006, 955, 932, 947, 942, 1007, 940, 936, 949, 942, 949, 951, 1007, 930, 942, 940, 1006, 928, 945, 936, 1006, 951, 1008, 1006, 928, 945, 945, 1006, 946, 932, 928, 947, 930, 937, 1006, 946, 932, 928, 947, 930, 937, 908, 942, 951, 936, 932, 3278, 3275, 3294, 3275, 778, 797, 795, 791, 778, 796, 779, 2399, 2394, 2368, 2375, 3198, 3183, 3177, 3179};
    public HashMap a;
    public HashMap b;

    public static Map b(String str) {
        try {
            return (Map) m290(new Gson(), str, Map.class);
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder(C0064.m9599(m292(), 0, 18, 1613));
            C0018.m3933(sb, C0036.m6261(e));
            C0018.m3933(sb, C0013.m3106(m292(), 18, 2, 1152));
            C0018.m3933(sb, str);
            m293(C0047.m7763(sb));
            return null;
        }
    }

    public static Map c(String str, HashMap map, Map map2, HashMap map3) {
        try {
            URL url = new URL(str);
            if (map3 != null) {
                StringBuilder sb = new StringBuilder();
                Iterator itM5199 = C0029.m5199(C0043.m7267(map3));
                while (C0012.m2962(itM5199)) {
                    Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
                    if (C0006.m1693(sb) > 0) {
                        C0018.m3933(sb, C0026.m4951(m292(), 20, 1, 1322));
                    }
                    C0018.m3933(sb, (String) C0045.m7624(entry));
                    C0018.m3933(sb, C0031.m5565(m292(), 21, 1, 655));
                    C0016.m3605(sb, C0039.m6540(entry));
                }
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, str);
                C0018.m3933(sb2, C0029.m5256(m292(), 22, 1, 2763));
                C0018.m3933(sb2, C0047.m7763(sb));
                url = new URL(C0047.m7763(sb2));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) C0018.m3955(url);
            C0005.m1655(httpURLConnection, C0034.m6001(m292(), 23, 4, 804));
            Iterator itM51992 = C0029.m5199(C0043.m7267(map));
            while (C0012.m2962(itM51992)) {
                Map.Entry entry2 = (Map.Entry) C0048.m7949(itM51992);
                C0017.m3641(httpURLConnection, (String) C0045.m7624(entry2), (String) C0039.m6540(entry2));
            }
            String strM8337 = C0052.m8337(m292(), 27, 13, 2838);
            if (map2 != null) {
                C0007.m1839(httpURLConnection, true);
                byte[] bArrM3018 = C0012.m3018(C0018.m3924(map2), C0034.m5989());
                C0017.m3641(httpURLConnection, C0065.m9775(m292(), 40, 12, 1044), C0020.m4199(m292(), 52, 16, 3184));
                C0017.m3641(httpURLConnection, C0063.m9585(m292(), 68, 14, 2644), C0054.m8599(bArrM3018.length));
                OutputStream outputStreamM1238 = C0001.m1238(httpURLConnection);
                try {
                    C0040.m6606(outputStreamM1238, bArrM3018, 0, bArrM3018.length);
                    C0027.m5049(outputStreamM1238);
                } catch (Throwable th) {
                    if (outputStreamM1238 != null) {
                        try {
                            C0027.m5049(outputStreamM1238);
                        } catch (Throwable th2) {
                            try {
                                C0052.m8352(C0057.m8970(Throwable.class, strM8337, new Class[]{Throwable.class}), th, new Object[]{th2});
                            } catch (Exception unused) {
                            }
                        }
                    }
                    throw th;
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C0057.m9040(httpURLConnection), C0034.m5989()));
            try {
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    String strM4438 = C0022.m4438(bufferedReader);
                    if (strM4438 == null) {
                        Map mapM5096 = C0027.m5096(C0047.m7763(sb3));
                        C0057.m8961(bufferedReader);
                        return mapM5096;
                    }
                    C0018.m3933(sb3, C0064.m9640(strM4438));
                }
            } finally {
                try {
                    C0057.m8961(bufferedReader);
                } catch (Throwable th3) {
                    try {
                        C0052.m8352(C0057.m8970(Throwable.class, strM8337, new Class[]{Throwable.class}), th, new Object[]{th3});
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (IOException e) {
            C0049.m7975(e);
            return new HashMap();
        }
    }

    public static String d(Map map) {
        return m291(new Gson(), map);
    }

    /* renamed from: ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m290(Object obj, Object obj2, Object obj3) {
        if (C0027.m5017() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static String m291(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m292() {
        if (C0019.m4065() < 0) {
            return f47short;
        }
        return null;
    }

    /* renamed from: ۥۥۣ۠, reason: contains not printable characters */
    public static void m293(Object obj) {
        if (C0046.m7701() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0021.m4340(m292(), 108, 9, 2863), C0019.m4127(C0057.m8978(m292(), 82, 14, 978), C0049.m8007(m292(), 96, 6, 1940), C0032.m5708(m292(), 102, 6, 2325), str));
        C0053.m8424(map2, C0004.m1549(m292(), 117, 7, 1696), C0011.m2808(C0038.m6456(str2)));
        C0053.m8424(map2, C0056.m8911(m292(), 124, 8, 648), C0011.m2808(40));
        Map mapM2346 = C0010.m2346(C0037.m6307(m292(), 132, 52, 533), C0004.m1586(this), map2, null);
        HashMap map3 = new HashMap();
        C0053.m8424(map3, C0049.m8007(m292(), 195, 4, 1489), C0050.m8146(this, (List) C0062.m9431((Map) C0062.m9431(mapM2346, C0065.m9775(m292(), 184, 4, 397)), C0062.m9389(m292(), 188, 7, 3066))));
        C0053.m8424(map3, C0012.m2973(m292(), 199, 4, 2377), str2);
        C0053.m8424(map3, C0064.m9599(m292(), 203, 9, 1341), C0011.m2808(9999));
        C0053.m8424(map3, C0000.m1077(m292(), 212, 5, 540), C0011.m2808(90));
        C0053.m8424(map3, C0015.m3484(m292(), 217, 5, 2679), C0011.m2808(999999));
        return C0018.m3924(map3);
    }

    public String d64(String str) {
        try {
            return new String(C0007.m1882(str));
        } catch (Exception e) {
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb = new StringBuilder(C0058.m9106(m292(), 222, 12, 2236));
            C0018.m3933(sb, C0036.m6261(e));
            C0012.m2969(printStreamM6087, C0047.m7763(sb));
            return C0007.m1840();
        }
    }

    public void destroy() {
    }

    public String detailContent(List<String> list) {
        String[] strArrM4752 = C0024.m4752((String) C0048.m7915(list, 0), C0058.m9106(m292(), 234, 2, 2023));
        HashMap map = new HashMap();
        Integer numM2808 = C0011.m2808(C0038.m6456(strArrM4752[0]));
        String strM9599 = C0064.m9599(m292(), 236, 2, 1176);
        C0053.m8424(map, strM9599, numM2808);
        C0053.m8424(map, C0013.m3106(m292(), 238, 6, 2616), strArrM4752[1]);
        Map mapM2346 = C0010.m2346(C0037.m6307(m292(), 244, 48, 1500), C0004.m1586(this), map, null);
        String strM9361 = C0061.m9361(m292(), 292, 4, 1742);
        Map map2 = (Map) C0062.m9431(mapM2346, strM9361);
        C0055.m8715(C0035.m6110(), strArrM4752[2]);
        HashMap map3 = new HashMap();
        C0053.m8424(map3, C0063.m9585(m292(), 304, 9, 852), C0062.m9431(map2, C0051.m8259(m292(), 296, 8, 1278)));
        C0053.m8424(map3, C0007.m1842(m292(), 317, 8, 1267), C0062.m9431(map2, C0022.m4403(m292(), 313, 4, 2947)));
        C0053.m8424(map3, C0007.m1842(m292(), 325, 8, 621), strArrM4752[2]);
        C0053.m8424(map3, C0029.m5256(m292(), 337, 8, 2056), C0062.m9431(map2, C0060.m9352(m292(), 333, 4, 1590)));
        C0053.m8424(map3, C0004.m1549(m292(), 349, 9, 2676), C0062.m9431(map2, C0015.m3484(m292(), 345, 4, 588)));
        C0053.m8424(map3, C0058.m9106(m292(), 366, 12, 1215), C0062.m9431(map2, C0054.m8574(m292(), 358, 8, 510)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0055.m8703());
        C0016.m3605(sb, C0062.m9431(map2, C0025.m4795(m292(), 378, 9, 1254)));
        C0053.m8424(map3, C0047.m7833(m292(), 387, 11, 494), C0047.m7763(sb));
        String strM7657 = C0045.m7657(m292(), 398, 13, 2859);
        String strM1840 = C0007.m1840();
        C0053.m8424(map3, strM7657, strM1840);
        String strM1645 = C0005.m1645(m292(), 411, 12, 2309);
        C0053.m8424(map3, strM1645, strM1840);
        Map mapM23462 = C0010.m2346(C0052.m8337(m292(), 423, 51, 345), C0004.m1586(this), map, null);
        List list2 = (List) C0062.m9431((Map) C0062.m9431(mapM23462, strM9361), C0002.m1305(m292(), 474, 15, 3238));
        HashMap map4 = new HashMap();
        Iterator itM3109 = C0013.m3109(list2);
        while (C0012.m2962(itM3109)) {
            Map map5 = (Map) C0048.m7949(itM3109);
            C0053.m8424(map4, C0037.m6312(C0062.m9431(map5, strM9599)), C0037.m6312(C0062.m9431(map5, C0055.m8814(m292(), 489, 15, 2645))));
        }
        this.b = new HashMap();
        HashMap map6 = new HashMap(map);
        Iterator itM31092 = C0013.m3109(list2);
        while (C0012.m2962(itM31092)) {
            C0053.m8424(map6, C0040.m6584(m292(), 504, 8, 2447), C0037.m6312(C0062.m9431((Map) C0048.m7949(itM31092), strM9599)));
            C0000.m1071(this, map6, (List) C0062.m9431((Map) C0062.m9431(mapM23462, strM9361), C0050.m8131(m292(), 512, 11, 2914)));
        }
        if (C0064.m9636(list2) > 1) {
            ExecutorService executorServiceM4370 = C0021.m4370(C0064.m9636(list2) - 1);
            ArrayList arrayList = new ArrayList();
            Iterator itM31093 = C0013.m3109(C0012.m2972(list2, 1, C0064.m9636(list2)));
            while (C0012.m2962(itM31093)) {
                C0004.m1532(arrayList, C0049.m8042(executorServiceM4370, new h(0, map, this, (Map) C0048.m7949(itM31093))));
            }
            Iterator itM7816 = C0047.m7816(arrayList);
            while (C0012.m2962(itM7816)) {
                try {
                    Map.Entry entry = (Map.Entry) C0002.m1288((Future) C0048.m7949(itM7816));
                    C0018.m3979(C0008.m1966(this), C0000.m1071(this, (Map) C0045.m7624(entry), (List) C0039.m6540(entry)));
                } catch (Exception e) {
                    PrintStream printStreamM6087 = C0035.m6087();
                    StringBuilder sb2 = new StringBuilder(C0055.m8814(m292(), 523, 6, 596));
                    C0018.m3933(sb2, C0036.m6261(e));
                    C0012.m2969(printStreamM6087, C0047.m7763(sb2));
                }
            }
            C0027.m5072(executorServiceM4370);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator itM5199 = C0029.m5199(C0043.m7267(C0008.m1966(this)));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry2 = (Map.Entry) C0048.m7949(itM5199);
            if (!C0057.m8953((String) C0039.m6540(entry2))) {
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, C0016.m3579());
                C0018.m3933(sb3, (String) C0065.m9715(map4, C0045.m7624(entry2)));
                C0004.m1532(arrayList2, C0047.m7763(sb3));
                C0004.m1532(arrayList3, (String) C0039.m6540(entry2));
            }
        }
        StringBuilder sb4 = new StringBuilder();
        Iterator itM78162 = C0047.m7816(arrayList2);
        boolean zM2962 = C0012.m2962(itM78162);
        String strM3525 = C0016.m3525(m292(), 529, 3, 2883);
        if (zM2962) {
            while (true) {
                C0056.m8896(sb4, (CharSequence) C0048.m7949(itM78162));
                if (!C0012.m2962(itM78162)) {
                    break;
                }
                C0056.m8896(sb4, strM3525);
            }
        }
        C0053.m8424(map3, strM7657, C0047.m7763(sb4));
        StringBuilder sb5 = new StringBuilder();
        Iterator itM78163 = C0047.m7816(arrayList3);
        if (C0012.m2962(itM78163)) {
            while (true) {
                C0056.m8896(sb5, (CharSequence) C0048.m7949(itM78163));
                if (!C0012.m2962(itM78163)) {
                    break;
                }
                C0056.m8896(sb5, strM3525);
            }
        }
        C0053.m8424(map3, strM1645, C0047.m7763(sb5));
        HashMap map7 = new HashMap();
        C0053.m8424(map7, C0033.m5852(m292(), 532, 4, 3045), C0058.m9079(map3));
        return C0018.m3924(map7);
    }

    public String e64(String str) {
        try {
            return new String(C0004.m1553(C0050.m8115(str)));
        } catch (Exception e) {
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb = new StringBuilder(C0058.m9106(m292(), 536, 12, 2712));
            C0018.m3933(sb, C0036.m6261(e));
            C0012.m2969(printStreamM6087, C0047.m7763(sb));
            return C0007.m1840();
        }
    }

    public String getName() {
        return null;
    }

    public Map.Entry<Map<String, Object>, List<Map<String, Object>>> getd(Map<String, Object> map, Map<String, Object> map2) {
        HashMap map3 = new HashMap(map);
        C0053.m8424(map3, C0032.m5708(m292(), 550, 8, 889), C0037.m6312(C0062.m9431(map2, C0037.m6307(m292(), 548, 2, 1596))));
        return new AbstractMap.SimpleEntry(map3, (List) C0062.m9431((Map) C0062.m9431(C0010.m2346(C0036.m6188(m292(), 558, 51, 2191), C0004.m1586(this), map3, null), C0034.m6001(m292(), 609, 4, 2662)), C0016.m3525(m292(), 613, 11, 1732)));
    }

    public String getdid() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            C0062.m9399(sb, C0007.m1823(C0023.m4536(m292(), 624, 16, 531), C0025.m4817(random, 16)));
        }
        return C0047.m7763(sb);
    }

    public List<Map<String, Object>> getlist(List<Map<String, Object>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            Map map = (Map) C0048.m7949(itM3109);
            HashMap map2 = new HashMap();
            StringBuilder sb = new StringBuilder();
            C0016.m3605(sb, C0062.m9431(map, C0000.m1077(m292(), 640, 2, 1261)));
            String strM5362 = C0030.m5362(m292(), 642, 2, 1935);
            C0018.m3933(sb, strM5362);
            C0016.m3605(sb, C0062.m9431(map, C0017.m3646(m292(), 644, 6, 1294)));
            C0018.m3933(sb, strM5362);
            String strM4107 = C0019.m4107(m292(), 650, 4, 2754);
            C0016.m3605(sb, C0062.m9431(map, strM4107));
            C0053.m8424(map2, C0037.m6307(m292(), 654, 6, 1055), C0047.m7763(sb));
            C0053.m8424(map2, C0064.m9599(m292(), 660, 8, 2243), C0062.m9431(map, strM4107));
            C0053.m8424(map2, C0041.m6779(m292(), 673, 7, 1174), C0062.m9431(map, C0047.m7833(m292(), 668, 5, 2945)));
            C0053.m8424(map2, C0035.m6131(m292(), 684, 8, 1569), C0062.m9431(map, C0039.m6551(m292(), 680, 4, 694)));
            C0053.m8424(map2, C0016.m3525(m292(), 704, 11, 1377), C0062.m9431(map, C0028.m5109(m292(), 692, 12, 2659)));
            C0004.m1532(arrayList, map2);
        }
        return arrayList;
    }

    public String gettk() {
        Object map;
        BufferedReader bufferedReader;
        String strM4536 = C0023.m4536(m292(), 715, 50, 443);
        HashMap mapM1586 = C0004.m1586(this);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) C0018.m3955(new URL(strM4536));
            C0005.m1655(httpURLConnection, C0022.m4403(m292(), 765, 3, 979));
            Iterator itM5199 = C0029.m5199(C0043.m7267(mapM1586));
            while (C0012.m2962(itM5199)) {
                Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
                C0017.m3641(httpURLConnection, (String) C0045.m7624(entry), (String) C0039.m6540(entry));
            }
            bufferedReader = new BufferedReader(new InputStreamReader(C0057.m9040(httpURLConnection), C0034.m5989()));
        } catch (IOException e) {
            C0049.m7975(e);
            map = new HashMap();
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String strM4438 = C0022.m4438(bufferedReader);
                if (strM4438 == null) {
                    break;
                }
                C0018.m3933(sb, C0064.m9640(strM4438));
            }
            map = C0027.m5096(C0047.m7763(sb));
            C0057.m8961(bufferedReader);
            return C0037.m6312(C0062.m9431((Map) C0062.m9431(map, C0053.m8477(m292(), 781, 4, 3098)), C0061.m9361(m292(), 785, 5, 721)));
        } finally {
            try {
                C0057.m8961(bufferedReader);
            } catch (Throwable th) {
                try {
                    C0052.m8352(C0057.m8970(Throwable.class, C0055.m8814(m292(), 768, 13, 1041), new Class[]{Throwable.class}), th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
    }

    public Map<String, String> getv(Map<String, Object> map, List<Map<String, Object>> list) {
        HashMap map2 = new HashMap();
        String strM4340 = C0021.m4340(m292(), 790, 8, 538);
        C0053.m8424(map2, C0037.m6312(C0062.m9431(map, strM4340)), C0007.m1840());
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            Map map3 = (Map) C0048.m7949(itM3109);
            HashMap map4 = new HashMap(map);
            C0053.m8424(map4, C0050.m8131(m292(), 800, 9, 1727), C0037.m6312(C0062.m9431(map3, C0057.m8978(m292(), 798, 2, 1561))));
            StringBuilder sb = new StringBuilder();
            String strM8337 = C0052.m8337(m292(), 809, 7, 3052);
            C0016.m3605(sb, C0062.m9431(map3, strM8337));
            C0018.m3933(sb, C0002.m1305(m292(), 816, 1, 811));
            C0018.m3933(sb, C0003.m1362(this, C0018.m3924(map4)));
            C0018.m3933(sb, C0005.m1645(m292(), 817, 2, 914));
            C0016.m3605(sb, C0062.m9431(map3, strM8337));
            C0004.m1532(arrayList, C0047.m7763(sb));
        }
        HashMap mapM1966 = C0008.m1966(this);
        String strM6312 = C0037.m6312(C0062.m9431(map, strM4340));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb2, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb2, C0008.m1970(m292(), 819, 1, 3079));
            }
        }
        C0053.m8424(mapM1966, strM6312, C0047.m7763(sb2));
        return C0008.m1966(this);
    }

    public String homeContent(boolean z) {
        int i = 2;
        Map mapM2346 = C0010.m2346(C0058.m9106(m292(), 820, 51, 1651), C0004.m1586(this), null, null);
        HashMap map = new HashMap();
        HashMap mapM4127 = C0019.m4127(C0029.m5256(m292(), 871, 2, 1053), C0026.m4951(m292(), 873, 8, 1655), C0039.m6551(m292(), 881, 2, 1010), C0000.m1077(m292(), 883, 6, 2385));
        C0053.m8424(mapM4127, C0011.m2805(m292(), 889, 2, 1735), C0043.m7290(m292(), 891, 4, 1202));
        HashMap map2 = new HashMap();
        String strM7290 = C0043.m7290(m292(), 895, 3, 2899);
        C0053.m8424(map2, strM7290, C0007.m1842(m292(), 898, 14, 2366));
        String strM5109 = C0028.m5109(m292(), 912, 4, 2157);
        C0053.m8424(map2, strM5109, C0057.m8978(m292(), 916, 2, 1123));
        ArrayList arrayList = new ArrayList();
        String strM9361 = C0061.m9361(m292(), 918, 2, 2324);
        String strM5256 = C0029.m5256(m292(), 920, 1, 1150);
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(strM5256, strM9361);
        String strM8978 = C0057.m8978(m292(), 921, 6, 2568);
        String strM7833 = C0047.m7833(m292(), 927, 1, 1352);
        Map.Entry[] entryArr = {simpleEntry, new AbstractMap.SimpleEntry(strM7833, strM8978)};
        HashMap map3 = new HashMap(2);
        int i2 = 0;
        while (true) {
            String strM7902 = C0048.m7902(m292(), 928, 15, 1743);
            if (i2 >= i) {
                C0004.m1532(arrayList, C0001.m1184(map3));
                Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(strM5256, C0027.m5062(m292(), 943, 2, 2035)), new AbstractMap.SimpleEntry(strM7833, C0058.m9106(m292(), 945, 10, 497))};
                HashMap map4 = new HashMap(2);
                int i3 = 0;
                for (int i4 = 2; i3 < i4; i4 = 2) {
                    Map.Entry entry = entryArr2[i3];
                    Object objM7624 = C0045.m7624(entry);
                    if (C0044.m7425(objM7624, entry, map4, objM7624) != null) {
                        throw new IllegalArgumentException(C0002.m1280(objM7624, strM7902));
                    }
                    i3++;
                }
                C0004.m1532(arrayList, C0001.m1184(map4));
                Map.Entry[] entryArr3 = {new AbstractMap.SimpleEntry(strM5256, C0033.m5852(m292(), 955, 2, 959)), new AbstractMap.SimpleEntry(strM7833, C0022.m4403(m292(), 957, 7, 416))};
                HashMap map5 = new HashMap(2);
                int i5 = 0;
                for (int i6 = 2; i5 < i6; i6 = 2) {
                    Map.Entry entry2 = entryArr3[i5];
                    Object objM76242 = C0045.m7624(entry2);
                    if (C0044.m7425(objM76242, entry2, map5, objM76242) != null) {
                        throw new IllegalArgumentException(C0002.m1280(objM76242, strM7902));
                    }
                    i5++;
                }
                C0004.m1532(arrayList, C0001.m1184(map5));
                Map.Entry[] entryArr4 = {new AbstractMap.SimpleEntry(strM5256, C0000.m1077(m292(), 964, 2, 603)), new AbstractMap.SimpleEntry(strM7833, C0065.m9775(m292(), 966, 3, 2249))};
                HashMap map6 = new HashMap(2);
                int i7 = 0;
                for (int i8 = 2; i7 < i8; i8 = 2) {
                    Map.Entry entry3 = entryArr4[i7];
                    Object objM76243 = C0045.m7624(entry3);
                    if (C0044.m7425(objM76243, entry3, map6, objM76243) != null) {
                        throw new IllegalArgumentException(C0002.m1280(objM76243, strM7902));
                    }
                    i7++;
                }
                C0004.m1532(arrayList, C0001.m1184(map6));
                String strM4199 = C0020.m4199(m292(), 969, 5, 1276);
                C0053.m8424(map2, strM4199, arrayList);
                ArrayList arrayList2 = new ArrayList();
                HashMap map7 = new HashMap();
                Iterator itM3109 = C0013.m3109((List) C0062.m9431(mapM2346, C0058.m9106(m292(), 974, 4, 2653)));
                while (C0012.m2962(itM3109)) {
                    Map map8 = (Map) C0048.m7949(itM3109);
                    HashMap map9 = new HashMap();
                    C0053.m8424(map9, C0055.m8814(m292(), 978, 9, 3107), C0062.m9431(map8, strM5109));
                    String strM2037 = C0009.m2037(m292(), 987, 2, 1189);
                    Iterator it = itM3109;
                    C0053.m8424(map9, C0049.m8007(m292(), 989, 7, 753), C0062.m9431(map8, strM2037));
                    C0004.m1532(arrayList2, map9);
                    String strM6312 = C0037.m6312(C0062.m9431(map8, strM2037));
                    C0053.m8424(map7, strM6312, new ArrayList());
                    String strM7151 = C0042.m7151(m292(), 996, 8, 1231);
                    Iterator itM31092 = C0013.m3109((List) C0062.m9431(map8, strM7151));
                    while (C0012.m2962(itM31092)) {
                        Map map10 = (Map) C0048.m7949(itM31092);
                        HashMap map11 = new HashMap();
                        Iterator it2 = itM31092;
                        C0053.m8424(map11, strM5109, C0062.m9431(map10, strM5109));
                        C0053.m8424(map11, strM7290, C0065.m9715(mapM4127, C0062.m9431(map10, strM5109)));
                        List list = (List) C0062.m9431(map10, strM7151);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator itM31093 = C0013.m3109(list);
                        while (C0012.m2962(itM31093)) {
                            String str = strM7151;
                            Map map12 = (Map) C0048.m7949(itM31093);
                            HashMap map13 = mapM4127;
                            String strM63122 = C0037.m6312(C0062.m9431(map12, strM5109));
                            String strM63123 = C0037.m6312(C0062.m9431(map12, strM5109));
                            String str2 = strM7290;
                            AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(strM5256, strM63122);
                            AbstractMap.SimpleEntry simpleEntry3 = new AbstractMap.SimpleEntry(strM7833, strM63123);
                            String str3 = strM5109;
                            Map.Entry[] entryArr5 = {simpleEntry2, simpleEntry3};
                            HashMap map14 = new HashMap(2);
                            int i9 = 0;
                            for (int i10 = 2; i9 < i10; i10 = 2) {
                                Map.Entry entry4 = entryArr5[i9];
                                Map.Entry[] entryArr6 = entryArr5;
                                Object objM76244 = C0045.m7624(entry4);
                                if (C0044.m7425(objM76244, entry4, map14, objM76244) != null) {
                                    throw new IllegalArgumentException(C0002.m1280(objM76244, strM7902));
                                }
                                i9++;
                                entryArr5 = entryArr6;
                            }
                            C0004.m1532(arrayList3, C0001.m1184(map14));
                            strM5109 = str3;
                            strM7290 = str2;
                            strM7151 = str;
                            mapM4127 = map13;
                        }
                        C0053.m8424(map11, strM4199, arrayList3);
                        C0063.m9550((List) C0065.m9715(map7, strM6312), map11);
                        itM31092 = it2;
                        strM7151 = strM7151;
                        mapM4127 = mapM4127;
                    }
                    C0063.m9550((List) C0065.m9715(map7, strM6312), map2);
                    itM3109 = it;
                }
                C0053.m8424(map, C0056.m8911(m292(), 1004, 5, 338), arrayList2);
                C0053.m8424(map, C0028.m5109(m292(), 1009, 7, 1616), map7);
                return C0018.m3924(map);
            }
            Map.Entry entry5 = entryArr[i2];
            Object objM76245 = C0045.m7624(entry5);
            if (C0044.m7425(objM76245, entry5, map3, objM76245) != null) {
                throw new IllegalArgumentException(C0002.m1280(objM76245, strM7902));
            }
            i2++;
            i = 2;
        }
    }

    public String homeVideoContent() {
        HashMap map = new HashMap();
        C0053.m8424(map, C0011.m2805(m292(), 1016, 9, 3202), C0011.m2808(64));
        C0053.m8424(map, C0053.m8477(m292(), 1025, 7, 1283), C0011.m2808(1));
        C0053.m8424(map, C0044.m7509(m292(), 1032, 8, 2555), C0011.m2808(40));
        Map mapM2346 = C0010.m2346(C0045.m7657(m292(), 1040, 60, 2495), C0004.m1586(this), map, null);
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0030.m5362(m292(), 1111, 4, 1682), C0050.m8146(this, (List) C0062.m9431((Map) C0062.m9431(mapM2346, C0021.m4340(m292(), 1100, 4, 2667)), C0035.m6131(m292(), 1104, 7, 2540))));
        return C0018.m3924(map2);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
        HashMap map = new HashMap();
        this.a = map;
        C0053.m8424(map, C0038.m6452(m292(), 1115, 10, 2797), C0016.m3525(m292(), 1125, 13, 1133));
        C0053.m8424(C0004.m1586(this), C0019.m4107(m292(), 1138, 6, 2773), C0008.m1970(m292(), 1144, 3, 775));
        C0053.m8424(C0004.m1586(this), C0022.m4403(m292(), 1147, 10, 2759), C0053.m8477(m292(), 1157, 7, 2016));
        C0053.m8424(C0004.m1586(this), C0018.m3917(m292(), 1164, 8, 3158), C0006.m1783(this));
        C0053.m8424(C0004.m1586(this), C0061.m9361(m292(), 1172, 5, 1531), C0044.m7432(this));
    }

    public boolean isVideoFormat(String str) {
        return false;
    }

    public Map<String, Object> liveContent(String str) {
        return null;
    }

    public void localProxy(Map<String, Object> map) {
    }

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM6312;
        String strM8911 = C0056.m8911(m292(), 1177, 3, 2175);
        String strM1398 = C0003.m1398(m292(), 1180, 4, 941);
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0010.m2300(m292(), 1184, 2, 2294));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0052.m8337(m292(), 1186, 17, 637));
        C0018.m3933(sb, C0002.m1316(C0035.m6110()));
        C0018.m3933(sb, C0015.m3484(m292(), 1203, 7, 2736));
        C0018.m3933(sb, strArrM4752[1]);
        String strM7763 = C0047.m7763(sb);
        Map mapM5096 = C0027.m5096(C0040.m6642(this, strArrM4752[0]));
        String strM7902 = C0048.m7902(m292(), 1210, 9, 2241);
        C0006.m1755(mapM5096, strM7902, C0031.m5627((long) C0059.m9205((String) C0062.m9431(mapM5096, strM7902))));
        String strM4795 = C0025.m4795(m292(), 1219, 8, 1647);
        C0006.m1755(mapM5096, strM4795, C0031.m5627((long) C0059.m9205((String) C0062.m9431(mapM5096, strM4795))));
        Map mapM2346 = C0010.m2346(C0052.m8337(m292(), 1227, 51, 1222), C0004.m1586(this), mapM5096, null);
        try {
            HashMap map = new HashMap();
            C0053.m8424(map, C0042.m7151(m292(), 1278, 9, 1083), C0062.m9431((Map) C0062.m9431(mapM2346, strM1398), strM8911));
            C0053.m8424(map, strM4795, C0062.m9431(mapM5096, strM4795));
            strM6312 = C0037.m6312(C0062.m9431(C0010.m2346(C0007.m1842(m292(), 1287, 55, 2926), C0004.m1586(this), null, map), strM1398));
        } catch (Exception e) {
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb2 = new StringBuilder(C0046.m7718(m292(), 1342, 6, 1392));
            C0018.m3933(sb2, C0036.m6261(e));
            C0012.m2969(printStreamM6087, C0047.m7763(sb2));
            strM6312 = C0037.m6312(C0062.m9431((Map) C0062.m9431(mapM2346, strM1398), strM8911));
        }
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0046.m7718(m292(), 1348, 5, 1690), C0011.m2808(0));
        C0053.m8424(map2, C0029.m5256(m292(), 1353, 7, 719), strM7763);
        C0053.m8424(map2, strM8911, strM6312);
        HashMap map3 = new HashMap();
        C0053.m8424(map3, C0003.m1398(m292(), 1360, 10, 3108), C0027.m5062(m292(), 1370, 13, 2883));
        C0053.m8424(map2, C0028.m5109(m292(), 1383, 6, 628), map3);
        return C0018.m3924(map2);
    }

    public String searchContent(String str, boolean z) {
        return C0053.m8401(this, str, z, C0031.m5565(m292(), 1389, 1, 1435));
    }

    public String searchContent(String str, boolean z, String str2) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0017.m3646(m292(), 1390, 5, 879), str);
        C0053.m8424(map, C0065.m9775(m292(), 1395, 9, 1581), map2);
        C0053.m8424(map, C0004.m1549(m292(), 1404, 7, 2932), C0011.m2808(C0038.m6456(str2)));
        C0053.m8424(map, C0021.m4340(m292(), 1411, 8, 967), C0011.m2808(40));
        Map mapM2346 = C0010.m2346(C0015.m3484(m292(), 1419, 52, 961), C0004.m1586(this), map, null);
        HashMap map3 = new HashMap();
        C0053.m8424(map3, C0008.m1970(m292(), 1482, 4, 2355), C0050.m8146(this, (List) C0062.m9431((Map) C0062.m9431(mapM2346, C0034.m6001(m292(), 1471, 4, 3242)), C0041.m6779(m292(), 1475, 7, 888))));
        C0053.m8424(map3, C0042.m7151(m292(), 1486, 4, 3086), str2);
        return C0018.m3924(map3);
    }
}