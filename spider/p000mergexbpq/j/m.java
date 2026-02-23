package com.github.catvod.spider.p000mergexbpq.j;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f354short = {2696, 2708, 2708, 2704, 2760, 2760, 2783, 2753, 2696, 2708, 2708, 2704, 2761, 2766, 2761, 2762, 2783, 2692, 2693, 2694, 2689, 2709, 2700, 2708, 2748, 2766, 2771, 2774, 2773, 2713, 2695, 2748, 2766, 2691, 2703, 2701, 2767, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2748, 2739, 2715, 2769, 2770, 2764, 2717, 2783, 2748, 2766, 2760, 2701, 2771, 2709, 2776, 2716, 2701, 2704, 2772, 2716, 2694, 2700, 2710, 2716, 2689, 2710, 2697, 2716, 2701, 2699, 2710, 2716, 2706, 2701, 2716, 2711, 2701, 2710, 2716, 2701, 2704, 2695, 2716, 2701, 2772, 2689, 2716, 2701, 2704, 2771, 2761, 2716, 2696, 2708, 2708, 2704, 2748, 2739, 2715, 2769, 2770, 2764, 2717, 2783, 2748, 2766, 2760, 2701, 2771, 2709, 2776, 2716, 2701, 2704, 2772, 2716, 2694, 2700, 2710, 2716, 2689, 2710, 2697, 2716, 2701, 2699, 2710, 2716, 2706, 2701, 2716, 2711, 2701, 2710, 2716, 2701, 2704, 2695, 2716, 2701, 2772, 2689, 2716, 2701, 2704, 2771, 2761, 2748, 2783, 2748, 2739, 2762, 2716, 2696, 2708, 2708, 2704, 2748, 2739, 2715, 2769, 2770, 2764, 2717, 2783, 2701, 2771, 2709, 2776, 2748, 2739, 2762, 2716, 2696, 2708, 2708, 2704, 2760, 2760, 2783, 2753, 2696, 2708, 2708, 2704, 2761, 2766, 2761, 2762, 2783, 2692, 2693, 2694, 2689, 2709, 2700, 2708, 2748, 2766, 2697, 2712, 2697, 2695, 2709, 2689, 2748, 2766, 2691, 2703, 2701, 2767, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2760, 2760, 2783, 2753, 2696, 2708, 2708, 2704, 2761, 2766, 2761, 2762, 2783, 2692, 2713, 2691, 2692, 2702, 2765, 2708, 2703, 2707, 2748, 2766, 2704, 2707, 2708, 2689, 2708, 2704, 2747, 2750, 2748, 2783, 2749, 2762, 2716, 2696, 2708, 2708, 2704, 2766, 2762, 2783, 2767, 2704, 2700, 2689, 2713, 2766, 2715, 2768, 2764, 2771, 2717, 2748, 2783, 2747, 2750, 2709, 2706, 2700, 2749, 2715, 2770, 2764, 2776, 2717, 2781, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2766, 2762, 2783, 2767, 2704, 2700, 2689, 2713, 2693, 2706, 2767, 2766, 2762, 2783, 2747, 2704, 2736, 2749, 2700, 2689, 2713, 2748, 2766, 2704, 2696, 2704, 2748, 2783, 2709, 2706, 2700, 2781, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2766, 2762, 2783, 2767, 2692, 2703, 2711, 2702, 2700, 2703, 2689, 2692, 2766, 2689, 2707, 2704, 2712, 2748, 2783, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2766, 2762, 2783, 2767, 2689, 2704, 2697, 2767, 2709, 2704, 2751, 2689, 2704, 2697, 2766, 2704, 2696, 2704, 2748, 2783, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2707, 2766, 2762, 2783, 2748, 2766, 2774, 2774, 2713, 2699, 2748, 2766, 2691, 2702, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2760, 2760, 2783, 2753, 2696, 2708, 2708, 2704, 2761, 2766, 2761, 2762, 2783, 2702, 2693, 2708, 2693, 2689, 2707, 2693, 2748, 2766, 2691, 2703, 2701, 2767, 2694, 2697, 2700, 2693, 2767, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2760, 2760, 2783, 2753, 2696, 2708, 2708, 2704, 2761, 2766, 2761, 2762, 2783, 2692, 2703, 2709, 2713, 2697, 2702, 2748, 2766, 2691, 2703, 2701, 2767, 2766, 2762, 2767, 2704, 2700, 2689, 2713, 2767, 2748, 2783, 2766, 2762, 2716, 2696, 2708, 2708, 2704, 2760, 2760, 2783, 2753, 2696, 2708, 2708, 2704, 2761, 2766, 2761, 2762, 2783, 2696, 2709, 2703, 2707, 2696, 2689, 2702, 2748, 2766, 2691, 2703, 2701, 2767, 2766, 2762, 2767, 2748, 2783, 2697, 2708, 2693, 2701, 2766, 2762, 2716, 2701, 2689, 2695, 2702, 2693, 2708, 2778, 2766, 2762, 2716, 2693, 2692, 2770, 2699, 2778, 2766, 2762, 2716, 2694, 2708, 2704, 2778, 2766, 2762, 2716, 2694, 2697, 2700, 2693, 2778, 2766, 2762, 2716, 2708, 2710, 2690, 2703, 2712, 2765, 2712, 2695, 2778, 2766, 2762, 2716, 2708, 2696, 2709, 2702, 2692, 2693, 2706, 2778, 2766, 2762, 2716, 2704, 2709, 2707, 2696, 2778, 2766, 2762, 1548, 1549, 1567, 1652, 1633, 2198, 2188, 2192, 2258, 2247, 2247, 2250, 2246, 2258, 2254, 1847, 1854, 1871, 843, 1464, 1453, 1453, 2273, 2301, 2301, 2297, 1939, 1951, 1945, 1936, 1947, 1930, 1988, 452, 470, 466, 408, 2299, 2298, 2220, 2293, 2212, 1686, 1689, 1692, 1685, 1738, 679, 677, 689, 700, 683, 766, 683, 692, 745, 1370, 1350, 1371, 1344, 1354, 1355, 1372, 1300, 1155, 1158, 1152, 1179, 1225, 720, 720, 860, 1853, 1832, 2485, 2481, 2483, 2547, 2543, 2543, 2539, 2536, 2468, 2503, 2465, 2484, 2484, 2496, 2501, 2484, 2502, 2480, 2482, 2484, 2485, 2481, 3195, 3199, 3197, 3133, 3105, 3105, 3109, 3195, 3199, 3196, 1100, 1099, 1089, 1026, 1115, 1088, 1116, 637, 560, 544, 544, 1895, 1827, 1850, 1109, 1106, 1100, 1053, 1096, 1108, 1108, 1104, 3299, 3323, 3299, 3315, 3299, 3236, 3305, 3301, 3303, 2501, 2498, 2524, 2445, 2520, 2500, 2500, 2496, 3178, 3122, 3181, 3181, 3122, 3199, 3187, 3185, 2941, 2923, 2929, 2927, 2929, 2858, 2919, 2923, 2921, 2972, 2965, 3038, 2963, 2975, 2973, 1375, 1374, 1359, 1348, 1374, 1285, 1352, 1348, 1350, 1348, 1358, 1373, 1375, 1287, 1354, 1350, 1348, 1041, 1037, 1034, 1047, 1100, 1025, 1037, 1039, 1637, 1639, 1634, 1649, 1642, 1578, 1639, 1642, 2398, 2389, 2384, 2389, 2398, 2389, 2384, 2389, 2322, 2399, 2387, 2385, 3181, 3182, 3168, 3177, 3178, 3169, 3176, 3105, 3180, 3168, 3170, 606, 606, 602, 600, 512, 589, 577, 579, 1574, 1582, 1575, 1570, 1593, 1652, 1656, 1658, 2800, 2792, 2800, 2784, 2800, 2743, 2810, 2806, 2804, 2742, 2808, 2758, 1255, 1279, 1255, 1271, 1255, 1184, 1261, 1249, 1251, 1185, 1273, 1233, 428, 436, 428, 444, 428, 491, 422, 426, 424, 490, 435, 410, 1701, 1696, 1717, 1696, 2612, 2611, 2605, 3250, 3250, 485, 505, 505, 509, 510, 439, 1369, 1349, 1349, 1345, 1757, 1747, 1751, 1757, 1747, 1751, 1738, 1692, 1693, 1694, 2164, 2108, 2099, 2094, 2144, 3307, 3309, 3323, 3308, 3251, 3327, 3321, 3323, 3312, 3306, 2203, 2237, 2219, 2236, 2275, 2191, 2217, 2219, 2208, 2234, 2397, 430, 441, 442, 441, 430, 441, 430, 2264, 2287, 2284, 2287, 2296, 2287, 2296, 1685, 1685, 1685, 1740, 1679, 1669, 1686, 1684, 1740, 1665, 1677, 1679, 1415, 1434, 1415, 1426, 1437, 1501, 1438, 1428, 1415, 1413, 1191, 1226, 1256, 1277, 1262, 1259, 1259, 1254, 1192, 1202, 1193, 1207, 2454, 2461, 2456, 2461, 2454, 2461, 2456, 2461, 1542, 1614, 1618, 1618, 1622, 1621, 1564, 1545, 1545, 1617, 1617, 1617, 1544, 1604, 1615, 1610, 1615, 1604, 1615, 1610, 1615, 
    1544, 1605, 1609, 1611, 1545, 2204, 2289, 2259, 2246, 2261, 2256, 2256, 2269, 2195, 2185, 2194, 2188, 2204, 2196, 2283, 2261, 2258, 2264, 2259, 2251, 2255, 2204, 2290, 2280, 2204, 2189, 2188, 2194, 2188, 2183, 2204, 2283, 2261, 2258, 2186, 2184, 2183, 2204, 2244, 2186, 2184, 2197, 2204, 2301, 2252, 2252, 2256, 2265, 2283, 2265, 2270, 2295, 2261, 2248, 2195, 2185, 2191, 2187, 2194, 2191, 2186, 2204, 2196, 2295, 2292, 2280, 2289, 2288, 2192, 2204, 2256, 2261, 2263, 2265, 2204, 2299, 2265, 2271, 2263, 2259, 2197, 2204, 2303, 2260, 2254, 2259, 2257, 2265, 2195, 2181, 2184, 2194, 2188, 2194, 2184, 2186, 2188, 2186, 2194, 2185, 2184, 2204, 2287, 2269, 2266, 2269, 2254, 2261, 2195, 2185, 2191, 2187, 2194, 2191, 2186, 1584, 1597, 1593, 1596, 1597, 1578};
    private static final Pattern a = C0005.m1602(C0048.m7902(m3074(), 0, 592, 2784));
    public static Charset b = C0055.m8706(C0011.m2805(m3074(), 592, 5, 1625));
    public static Charset c = C0055.m8706(C0030.m5362(m3074(), 597, 10, 2303));

    public static String a(String str, Charset charset) {
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0011.m2805(m3074(), 607, 3, 1914)), C0012.m3018(str, charset));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrM6159) {
                String strM8889 = C0056.m8889(b2 & 255);
                if (C0004.m1584(strM8889) < 2) {
                    C0036.m6177(sb, 0);
                }
                C0018.m3933(sb, strM8889);
            }
            return C0023.m4587(C0047.m7763(sb));
        } catch (NoSuchAlgorithmException e) {
            C0049.m7975(e);
            return C0007.m1840();
        }
    }

    public static String b(String str, String str2) {
        String strM4800;
        StringBuilder sb;
        String strM7833 = C0047.m7833(m3074(), 610, 1, 868);
        String strM4951 = C0026.m4951(m3074(), 611, 3, 1410);
        String strM4403 = C0022.m4403(m3074(), 614, 4, 2185);
        try {
            if (!C0043.m7277(str2, strM4403) && !C0043.m7277(str2, C0057.m8978(m3074(), 618, 7, 2046)) && !C0043.m7277(str2, C0051.m8259(m3074(), 625, 4, 418)) && !C0043.m7277(str2, C0051.m8259(m3074(), 629, 5, 2206)) && !C0043.m7277(str2, C0065.m9775(m3074(), 634, 5, 1776)) && !C0043.m7277(str2, C0014.m3332(m3074(), 639, 9, 723)) && !C0043.m7277(str2, C0042.m7151(m3074(), 648, 8, 1326)) && !C0043.m7277(str2, C0046.m7718(m3074(), 656, 5, 1267))) {
                Uri uriM4422 = C0022.m4422(str);
                if (C0043.m7277(str2, strM4951)) {
                    sb = new StringBuilder();
                    C0018.m3933(sb, C0000.m1076(uriM4422));
                    C0018.m3933(sb, str2);
                } else {
                    if (!C0043.m7277(str2, C0051.m8259(m3074(), 661, 2, 767))) {
                        boolean zM9127 = C0058.m9127(str2, strM4951);
                        String strM4340 = C0021.m4340(m3074(), 664, 2, 1817);
                        if (!zM9127 && C0043.m7277(str2, strM7833)) {
                            StringBuilder sb2 = new StringBuilder();
                            StringBuilder sb3 = new StringBuilder();
                            C0018.m3933(sb3, str);
                            C0018.m3933(sb3, strM7833);
                            C0018.m3933(sb2, C0025.m4800(C0047.m7763(sb3), C0030.m5362(m3074(), 666, 22, 2459), strM4340));
                            C0018.m3933(sb2, str2);
                            strM4800 = C0047.m7763(sb2);
                        } else {
                            if (!C0058.m9127(str2, strM4403) || C0043.m7277(str2, strM4403)) {
                                return str2;
                            }
                            strM4800 = C0025.m4800(str2, C0017.m3646(m3074(), 688, 10, 3157), strM4340);
                        }
                        return strM4800;
                    }
                    sb = new StringBuilder();
                    C0018.m3933(sb, C0000.m1076(uriM4422));
                    C0018.m3933(sb, C0051.m8259(m3074(), 663, 1, 870));
                    C0018.m3933(sb, str2);
                }
                strM4800 = C0047.m7763(sb);
                return strM4800;
            }
            return str2;
        } catch (Exception e) {
            m3073(e);
            return str2;
        }
    }

    public static boolean c(String str) {
        if (C0003.m1405(C0034.m6026(m3072(), str))) {
            return ((C0058.m9127(str, C0003.m1398(m3074(), 698, 7, 1071)) && (C0058.m9127(str, C0038.m6452(m3074(), 705, 4, 595)) || C0058.m9127(str, C0007.m1842(m3074(), 709, 3, 1865)))) || C0058.m9127(str, C0030.m5362(m3074(), 712, 8, 1056))) ? false : true;
        }
        return false;
    }

    public static boolean d(String str) {
        String strM6551 = C0039.m6551(m3074(), 720, 9, 3210);
        try {
            if (C0058.m9127(str, C0035.m6131(m3074(), 729, 8, 2480))) {
                return false;
            }
            String strM7889 = C0048.m7889(C0022.m4422(str));
            String[] strArr = {strM6551, C0040.m6584(m3074(), 737, 8, 3100), C0061.m9361(m3074(), 745, 9, 2820), C0033.m5852(m3074(), 754, 6, 3056), C0020.m4199(m3074(), 760, 9, 1323), C0037.m6307(m3074(), 769, 8, 1321), C0013.m3106(m3074(), 777, 8, 1122), C0063.m9585(m3074(), 785, 8, 1540), C0012.m2973(m3074(), 793, 12, 2364), C0058.m9106(m3074(), 805, 11, 3087), C0030.m5362(m3074(), 816, 8, 558), C0008.m1970(m3074(), 824, 8, 1559)};
            for (int i = 0; i < 12; i++) {
                if (C0058.m9127(strM7889, strArr[i]) && (!C0007.m1815(strM6551, strArr[i]) || C0058.m9127(str, C0047.m7833(m3074(), 832, 12, 2713)) || C0058.m9127(str, C0049.m8007(m3074(), 844, 12, 1166)) || C0058.m9127(str, C0025.m4795(m3074(), 856, 12, 453)))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static JSONObject e(String str, String str2) {
        String strM3525;
        JSONObject jSONObject = new JSONObject(str2);
        String strM6131 = C0035.m6131(m3074(), 868, 4, 1729);
        boolean zM9499 = C0063.m9499(jSONObject, strM6131);
        String strM6188 = C0036.m6188(m3074(), 872, 3, 2625);
        String strM1212 = zM9499 ? C0001.m1212(C0003.m1370(jSONObject, strM6131), strM6188) : C0001.m1212(jSONObject, strM6188);
        if (C0043.m7277(strM1212, C0018.m3917(m3074(), 875, 2, 3229))) {
            strM1212 = C0001.m1153(C0004.m1549(m3074(), 877, 6, 397), strM1212);
        }
        if (!C0043.m7277(strM1212, C0055.m8814(m3074(), 883, 4, 1329))) {
            return null;
        }
        if (C0007.m1815(strM1212, str) && (C0022.m4429(strM1212) || !C0004.m1526(strM1212))) {
            return null;
        }
        if (C0058.m9127(strM1212, C0054.m8574(m3074(), 887, 10, 1764)) || C0058.m9127(strM1212, C0061.m9361(m3074(), 897, 5, 2138))) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strM3484 = C0015.m3484(m3074(), 902, 10, 3230);
        String strM1840 = C0007.m1840();
        String strM2054 = C0009.m2054(jSONObject, strM3484, strM1840);
        int iM1584 = C0004.m1584(C0064.m9640(strM2054));
        String strM8814 = C0055.m8814(m3074(), 912, 10, 2254);
        String strM8259 = C0051.m8259(m3074(), 922, 1, 2429);
        if (iM1584 > 0) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, strM8259);
            C0018.m3933(sb, strM2054);
            C0047.m7743(jSONObject2, strM8814, C0047.m7763(sb));
        }
        String strM20542 = C0009.m2054(jSONObject, C0013.m3106(m3074(), 923, 7, 476), strM1840);
        int iM15842 = C0004.m1584(C0064.m9640(strM20542));
        String strM9775 = C0065.m9775(m3074(), 930, 7, 2186);
        if (iM15842 > 0) {
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, strM8259);
            C0018.m3933(sb2, strM20542);
            C0047.m7743(jSONObject2, strM9775, C0047.m7763(sb2));
        }
        if (!C0058.m9127(str, C0050.m8131(m3074(), 937, 12, 1762)) && !C0058.m9127(strM1212, C0010.m2300(m3074(), 949, 10, 1523))) {
            if (C0058.m9127(str, C0017.m3646(m3074(), 971, 8, 2548))) {
                C0047.m7743(jSONObject2, strM9775, C0043.m7290(m3074(), 979, 26, 1574));
                strM3525 = C0031.m5565(m3074(), 1005, 115, 2236);
            }
            JSONObject jSONObject3 = new JSONObject();
            C0047.m7743(jSONObject3, C0004.m1549(m3074(), 1120, 6, 1624), jSONObject2);
            C0047.m7743(jSONObject3, strM6188, strM1212);
            return jSONObject3;
        }
        C0047.m7743(jSONObject2, strM9775, strM8259);
        strM3525 = C0016.m3525(m3074(), 959, 12, 1159);
        C0047.m7743(jSONObject2, strM8814, strM3525);
        JSONObject jSONObject32 = new JSONObject();
        C0047.m7743(jSONObject32, C0004.m1549(m3074(), 1120, 6, 1624), jSONObject2);
        C0047.m7743(jSONObject32, strM6188, strM1212);
        return jSONObject32;
    }

    /* renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m3072() {
        if (C0039.m6529() < 0) {
            return a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3073(Object obj) {
        if (C0018.m3956() > 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3074() {
        if (C0060.m9355() > 0) {
            return f354short;
        }
        return null;
    }
}