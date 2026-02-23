package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
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
import com.github.catvod.spider.merge.T0.h;
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
import com.github.catvod.spider.merge.Z.c;
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
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class Xb6v extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f129short = {1684, 2242, 2204, 2188, 2240, 3241, 3297, 3309, 3324, 3327, 3252, 2912, 2855, 2859, 2870, 2941, 1558, 1554, 1567, 1567, 1556, 1551, 1600, 12925, 13231, 13231, 13231, 13231, 13231, 2075, 14955, 14955, 14955, 14955, 2635, 14955, 12627, 2454, 2437, 2453, 2545, 2548, 2452, 2551, 2433, 2452, 795, 655, 712, 708, 729, 658, 2254, 2250, 2247, 2247, 2252, 2263, 2200, 13080, 629, 637, 616, 620, 630, 546, 12844, 2077, 2059, 2078, 2074, 2048, 2132, 13067, 13707, 2422, 2384, 2374, 2385, 2318, 2402, 2372, 2374, 2381, 2391, 592, 626, 615, 628, 625, 625, 636, 562, 552, 563, 557, 573, 565, 586, 628, 627, 633, 626, 618, 622, 573, 595, 585, 573, 556, 557, 563, 557, 550, 573, 586, 628, 627, 555, 553, 550, 573, 613, 555, 553, 564, 573, 604, 621, 621, 625, 632, 586, 632, 639, 598, 628, 617, 562, 552, 558, 554, 563, 558, 555, 573, 565, 598, 597, 585, 592, 593, 561, 573, 625, 628, 630, 632, 573, 602, 632, 638, 630, 626, 564, 573, 606, 629, 623, 626, 624, 632, 562, 556, 559, 559, 563, 557, 563, 557, 563, 557, 573, 590, 636, 635, 636, 623, 628, 562, 552, 558, 554, 563, 558, 555, 1169, 1190, 1189, 1190, 1201, 1190, 1201, 1025, 1053, 1053, 1049, 1050, 1107, 1094, 1094, 1054, 1054, 1054, 1095, 1041, 1035, 1119, 1055, 1095, 1034, 1030, 1028, 1094, 2952, 3035, 3012, 3032, 3039, 3060, 3016, 3012, 3013, 3039, 3018, 3010, 3013, 3022, 3033, 2955, 2949, 3035, 3012, 3032, 3039, 3060, 3011, 3012, 3037, 3022, 3033, 1366, 1390, 1377, 1388, 1406, 1406, 1328, 1399, 1378, 1378, 1376, 1360, 1232, 1226, 1245, 1246, 1921, 1948, 1921, 1945, 1936, 3113, 3130, 3114, 3150, 3147, 3115, 3144, 3134, 3115, 2397, 2393, 2387, 1794, 1795, 1810, 2724, 2701, 2714, 2707, 2754, 2716, 2718, 2699, 2714, 2712, 2704, 2701, 2694, 2783, 2699, 2718, 2712, 2722, 1914, 1912, 1901, 1916, 1872, 1917, 1836, 1840, 1840, 1844, 1847, 1918, 1899, 1899, 1843, 1843, 1843, 1898, 1852, 1830, 1906, 1842, 1898, 1831, 1835, 1833, 2566, 1703, 1696, 1706, 1707, 1718, 1681, 727, 657, 653, 660, 661, 536, 582, 599, 593, 607, 600, 599, 578, 607, 601, 600, 534, 520, 534, 599, 1950, 1924, 1939, 1936, 1263, 1256, 1250, 1251, 1278, 1241, 1198, 1192, 1196, 1209, 1199, 1192, 1262, 1266, 1259, 1258, 1761, 1714, 1709, 1713, 1718, 1693, 1697, 1709, 1708, 1718, 1699, 1707, 1708, 1703, 1712, 1762, 1772, 1714, 1709, 1713, 1718, 1693, 1706, 1709, 1716, 1703, 1712, 2536, 2548, 2548, 2544, 2547, 2490, 2479, 2479, 2551, 2551, 2551, 2478, 2552, 2530, 2486, 2550, 2478, 2531, 2543, 2541, 2653, 2683, 2669, 2682, 2597, 2633, 2671, 2669, 2662, 2684, 1011, 977, 964, 983, 978, 978, 991, 913, 907, 912, 910, 926, 918, 1001, 983, 976, 986, 977, 969, 973, 926, 1008, 1002, 926, 911, 910, 912, 910, 901, 926, 1001, 983, 976, 904, 906, 901, 926, 966, 904, 906, 919, 926, 1023, 974, 974, 978, 987, 1001, 987, 988, 1013, 983, 970, 913, 907, 909, 905, 912, 909, 904, 926, 918, 1013, 1014, 1002, 1011, 1010, 914, 926, 978, 983, 981, 987, 926, 1017, 987, 989, 981, 977, 919, 926, 1021, 982, 972, 977, 979, 987, 913, 911, 908, 908, 912, 910, 912, 910, 912, 910, 926, 1005, 991, 984, 991, 972, 983, 913, 907, 909, 905, 912, 909, 904, 388, 471, 456, 468, 467, 504, 452, 456, 457, 467, 450, 457, 467, 1709, 1762, 1777, 1783, 1770, 1760, 1775, 1766, 1756, 1760, 1772, 1773, 1783, 1762, 1770, 1773, 1766, 1777, 1699, 1725, 1699, 1771, 1714, 2448, 22691, -24819, 2454, 3284, 3266, 3279, 3268, 3289, 3025, 3031, 2955, 3011, 3020, 3031, 3030, 3025, 3063, 3018, 3026, 2906, 2320, 2799, 3133, 3111, 3120, 3123, 674, 674, 674, 1291, 29225, 22643, 2764, 2764, 2764, 2966, 2970, 2972, 2965, 2974, 2959, 1126, 1131, 1140, 1068, 1141, 1131, 1126, 1125, 1127, 1142, 1068, 1120, 1133, 1146, 1068, 1136, 1133, 1141, 2677, 24961, 24594, 21020, 21100, 1178, 1217, 490, 503, 490, 498, 507, 399, 450, 462, 463, 469, 452, 473, 469, 3120, 3171, 3196, 3168, 3175, 3148, 3184, 3196, 3197, 3175, 3190, 3197, 3175, 3123, 3194, 3198, 3188, 1200, 1201, 1184, 12260, 30289, 14890, 14890, 22529, 14890, 2562, 2564, 2560, 2581, 2563, 2582, 2632, 2648, 2580, 388, 429, 442, 435, 482, 444, 446, 427, 442, 440, 432, 429, 422, 511, 427, 446, 440, 386, 11822, 21908, 15328, 15328, 17667, 15328, 3016, 3022, 3018, 3039, 3017, 3036, 2946, 2962, 3038, -24963, 25414, 2001, 1987, 1989, 1985, 2004, 1986, 2007, 1929, 1945, 2005, 12108, 17445, 14978, 14978, 23986, 14978, 2730, 2732, 2728, 2749, 2731, 2750, 2784, 2800, 2748, 24525, 23495, 2247, 2261, 2259, 2263, 2242, 2260, 2241, 2207, 2191, 2243, 8682, 18990, 25092, 25025, 25403, 13348, 1036, 1034, 1038, 1051, 1037, 1048, 1094, 1110, 1050, 9929, 27667, 13063, 13063, 22367, 13063, 815, 809, 813, 824, 814, 827, 808, 887, 825, 8920, 18733, 14102, 14102, 26626, 14102, 1854, 1848, 1852, 1833, 1855, 1834, 1849, 1894, 1832, 19412, 27387, 1493, 1479, 1473, 1477, 1488, 1478, 1491, 1421, 1437, 1489, 8636, 24462, 13426, 13426, 27494, 13426, 1114, 1116, 1112, 1101, 1115, 1102, 1040, 1024, 1100, 22945, 27977, 615, 629, 627, 631, 610, 628, 609, 575, 559, 611, 9041, 32031, 13983, 13983, 18516, 1719, 1713, 1717, 1696, 1718, 1699, 1783, 1773, 1697, 32011, 18496, 1699, 1701, 1697, 1716, 1698, 1719, 1700, 1787, 1717, 567, 555, 555, 559, 556, 613, 624, 624, 552, 552, 552, 625, 551, 573, 617, 553, 625, 572, 560, 562, 1780, 1722, 1714, 1721, 1698, 1700, 1783, 1769, 1783, 1723, 1726, 1783, 1769, 1783, 1718, 1411, 1433, 1422, 1421, 28698, -29463, 22344, 20377, -26684, 2468, 1102, 1100, 1113, 1096, 1124, 1097, 31279, 20959, 2704, 2059, 2128, 2139, 2057, 2128, 2133, 2138, 2137, 2113, 2066, 2142, 2113, 2137, 2141, 2138, 2131, 2057, 1597, 1649, 1650, 1640, 1651, 1646, 1574, 2660, 2664, 2670, 2663, 2668, 2685, 488, 492, 504, 491, 498, 1144, 1124, 1124, 1120, 1123, 1066, 1087, 1087, 1127, 1127, 1127, 1086, 1128, 1138, 1062, 1126, 1086, 1139, 1151, 1149, 2088, 2087, 2099, 2080, 2092, 2084, 2381, 2380, 2397, 1809, 1192, 3175, 3196, 
    3195, 3171, 2244, 2265, 2244, 2268, 2261, 740, 757, 765, 736, 761, 756, 312, 302, 290, 301, 289, 297, 3287, 3268, 3266, 3295, 3285, 3290, 3283, 1987, 1991, 1994, 3108, 3119, 3120, 3119, 3123, 3124, 463, 473, 477, 462, 479, 468, 2870, 2864, 2855, 2856, 2860, 2865, 1701, 1707, 1719, 1708, 1697, 1711, 1724, 1706, 2156, 2160, 2160, 2164, 2167, 2110, 2091, 2091, 2163, 2163, 2163, 2090, 2172, 2150, 2098, 2162, 2090, 2151, 2155, 2153, 2091, 2145, 2091, 2167, 2145, 2149, 2166, 2151, 2156, 2091, 2101, 2157, 2154, 2144, 2145, 2172, 2090, 2164, 2156, 2164, 2051, 2085, 2099, 2084, 2171, 2071, 2097, 2099, 2104, 2082, 407, 437, 416, 435, 438, 438, 443, 501, 495, 500, 490, 506, 498, 397, 435, 436, 446, 437, 429, 425, 506, 404, 398, 506, 491, 490, 500, 490, 481, 506, 397, 435, 436, 492, 494, 481, 506, 418, 492, 494, 499, 506, 411, 426, 426, 438, 447, 397, 447, 440, 401, 435, 430, 501, 495, 489, 493, 500, 489, 492, 506, 498, 401, 402, 398, 407, 406, 502, 506, 438, 435, 433, 447, 506, 413, 447, 441, 433, 437, 499, 506, 409, 434, 424, 437, 439, 447, 501, 491, 488, 488, 500, 490, 500, 490, 500, 490, 506, 393, 443, 444, 443, 424, 435, 501, 495, 489, 493, 500, 489, 492, 2929, 2892, 2903, 2905, 2903, 2896, 2914, 2942, 2942, 2938, 2937, 2864, 2853, 2853, 2941, 2941, 2941, 2852, 2930, 2920, 2876, 2940, 2852, 2921, 2917, 2919, 2978, 2965, 2966, 2965, 2946, 2965, 2946, 1430, 1418, 1418, 1422, 1421, 1476, 1489, 1489, 1417, 1417, 1417, 1488, 1414, 1436, 1480, 1416, 1488, 1437, 1425, 1427, 1489, 1037, 1134, 1058, 1076, 1072, 1059, 1074, 1081, 1080, 1077, 1132, 979, 980, 990, 991, 962, 916, 970, 978, 970, 901, 970, 987, 989, 991, 903, 2706, 2759, 2769, 2773, 2758, 2775, 2780, 2781, 2768, 2697};
    public String a;
    public String b;
    public String c = C0057.m8978(m752(), 0, 1, 1700);

    public static String a(String str, Pattern pattern) {
        String strM1689 = C0006.m1689(str, pattern);
        String strM3332 = C0014.m3332(m752(), 1, 4, 2302);
        String strM1840 = C0007.m1840();
        String strM4800 = C0025.m4800(C0025.m4800(C0025.m4800(C0025.m4800(strM1689, strM3332, strM1840), C0037.m6307(m752(), 5, 6, 3215), strM1840), C0047.m7833(m752(), 11, 5, 2886), strM1840), C0028.m5109(m752(), 16, 7, 1659), C0037.m6307(m752(), 23, 1, 646));
        String strM6584 = C0040.m6584(m752(), 24, 5, 943);
        String strM8007 = C0049.m8007(m752(), 29, 1, 2103);
        return C0025.m4800(C0025.m4800(C0025.m4800(strM4800, strM6584, strM8007), C0033.m5852(m752(), 30, 6, 2667), strM8007), C0004.m1549(m752(), 36, 1, 339), strM1840);
    }

    public static String b(String str, Pattern pattern) {
        String strM1689 = C0006.m1689(str, pattern);
        String strM4403 = C0022.m4403(m752(), 37, 9, 2474);
        String strM1840 = C0007.m1840();
        return C0025.m4800(C0025.m4800(C0025.m4800(C0025.m4800(C0025.m4800(C0025.m4800(C0025.m4800(strM1689, strM4403, strM1840), C0007.m1842(m752(), 46, 1, 785), strM1840), C0025.m4795(m752(), 47, 5, 681), strM1840), C0050.m8131(m752(), 52, 7, 2211), C0009.m2037(m752(), 59, 1, 995)), C0033.m5852(m752(), 60, 6, 537), C0008.m1970(m752(), 66, 1, 572)), C0003.m1398(m752(), 67, 6, 2159), C0064.m9599(m752(), 73, 1, 794)), C0041.m6779(m752(), 74, 1, 1419), strM1840);
    }

    public static HashMap c() {
        return C0019.m4127(C0064.m9599(m752(), 75, 10, 2339), C0005.m1645(m752(), 85, 111, 541), C0033.m5852(m752(), 196, 7, 1219), C0038.m6452(m752(), 203, 21, 1129));
    }

    public static String d(String str, Pattern pattern) {
        Matcher matcherM6026 = C0034.m6026(pattern, str);
        return C0003.m1405(matcherM6026) ? C0064.m9640(C0021.m4306(matcherM6026, 1)) : C0007.m1840();
    }

    public static ArrayList e(h hVar) {
        d dVarM5333 = C0030.m5333(hVar, C0042.m7151(m752(), 224, 27, 2987));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            m mVar2 = (m) C0028.m5161(C0030.m5333(mVar, C0056.m8911(m752(), 251, 12, 1293)), 0);
            C0055.m8732(C0010.m2339(mVar2, C0003.m1398(m752(), 263, 4, 1208)), C0025.m4800(C0010.m2339(mVar2, C0049.m8007(m752(), 267, 5, 2037)), C0013.m3106(m752(), 272, 9, 3093), C0007.m1840()), C0049.m8058(C0030.m5333(mVar2, C0010.m2300(m752(), 281, 3, 2356)), C0029.m5256(m752(), 284, 3, 1905)), C0024.m4684(C0030.m5333(mVar, C0003.m1398(m752(), 287, 18, 2815))), arrayList);
        }
        return arrayList;
    }

    /* renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m752() {
        if (C0033.m5872() > 0) {
            return f129short;
        }
        return null;
    }

    /* renamed from: ۟۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Request.Builder m753(Object obj, Object obj2) {
        if (C0019.m4065() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۧ۠, reason: not valid java name and contains not printable characters */
    public static Request.Builder m754(Object obj, Object obj2, Object obj3) {
        if (C0004.m1557() < 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static FormBody.Builder m755(Object obj, Object obj2, Object obj3) {
        if (C0010.m2320() < 0) {
            return ((FormBody.Builder) obj).addEncoded((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static ResponseBody m756(Object obj) {
        if (C0033.m5872() > 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static Request m757(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((Response) obj).request();
        }
        return null;
    }

    /* renamed from: ۟ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Request m758(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦۣ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m759() {
        if (C0053.m8389() > 0) {
            return c.d();
        }
        return null;
    }

    /* renamed from: ۟ۥۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Call m760(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static String m761(Object obj) {
        if (C0002.m1242() > 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۢۢۨۤ, reason: not valid java name and contains not printable characters */
    public static FormBody m762(Object obj) {
        if (C0030.m5375() > 0) {
            return ((FormBody.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣۢۦ, reason: not valid java name and contains not printable characters */
    public static HttpUrl m763(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((Request) obj).url();
        }
        return null;
    }

    /* renamed from: ۣۥۨۤ, reason: not valid java name and contains not printable characters */
    public static Response m764(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static FormBody.Builder m765(Object obj, Object obj2, Object obj3) {
        if (C0012.m3024() > 0) {
            return ((FormBody.Builder) obj).add((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۧۤۤ۟, reason: not valid java name and contains not printable characters */
    public static Request.Builder m766(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM1189 = C0001.m1189(m752(), 305, 6, 1817);
        String strM1130 = C0000.m1130(C0037.m6307(m752(), 311, 20, 1860), str, C0065.m9715(map, strM1189) == null ? C0007.m1840() : (String) C0065.m9715(map, strM1189));
        if (!C0007.m1815(str2, C0003.m1398(m752(), 331, 1, 2615))) {
            strM1130 = C0004.m1488(strM1130, C0018.m3917(m752(), 332, 6, 1742), str2, C0016.m3525(m752(), 338, 5, 761));
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(strM1130, C0051.m8273()));
        String strM2339 = C0010.m2339(C0053.m8455(C0030.m5333(hVarM3577, C0039.m6551(m752(), 343, 15, 566))), C0027.m5062(m752(), 358, 4, 2038));
        int iM6456 = C0038.m6456(str2);
        int iM64562 = C0038.m6456(C0006.m1689(strM2339, C0005.m1602(C0005.m1645(m752(), 362, 16, 1158))));
        int iM2095 = iM6456 == iM64562 ? C0009.m2095(C0030.m5333(hVarM3577, C0024.m4740(m752(), 378, 27, 1730))) + ((iM6456 - 1) * 18) : iM64562 * 18;
        g gVar = new g();
        C0045.m7632(gVar, C0010.m2329(hVarM3577));
        C0049.m7974(gVar, iM6456, iM64562, 18, iM2095);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        String strM4915 = C0026.m4915(C0039.m6551(m752(), 405, 20, 2432), (String) C0048.m7915(list, 0));
        HashMap map = new HashMap();
        C0053.m8424(map, C0046.m7718(m752(), 425, 10, 2568), C0030.m5362(m752(), 435, 111, 958));
        h hVarM3577 = C0016.m3577(C0032.m5769(strM4915, map));
        C0030.m5333(hVarM3577, C0041.m6779(m752(), 546, 13, 423));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0041.m6779(m752(), 559, 23, 1667)));
        String strM3332 = C0014.m3332(m752(), 582, 4, 2507);
        String strM1840 = C0007.m1840();
        String strM3446 = C0015.m3446(strM4684, strM3332, strM1840);
        d dVarM6459 = C0038.m6459(C0030.m5333(hVarM3577, C0055.m8814(m752(), 586, 5, 3232)), C0054.m8574(m752(), 591, 11, 2981));
        String strM5852 = C0033.m5852(m752(), 602, 1, 2875);
        d dVarM64592 = C0038.m6459(dVarM6459, strM5852);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int iM2095 = C0009.m2095(dVarM64592);
        String strM6001 = C0034.m6001(m752(), 603, 1, 2355);
        String strM2037 = C0009.m2037(m752(), 604, 1, 2763);
        String strM5109 = C0028.m5109(m752(), 605, 4, 3157);
        String strM7902 = C0048.m7902(m752(), 609, 3, 646);
        String strM3917 = C0018.m3917(m752(), 612, 1, 1397);
        if (iM2095 != 0) {
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0016.m3579());
            C0018.m3933(sb3, C0063.m9585(m752(), 613, 5, 2792));
            C0018.m3933(sb, C0047.m7763(sb3));
            Iterator itM7807 = C0047.m7807(dVarM64592);
            while (C0012.m2962(itM7807)) {
                m mVar = (m) C0048.m7949(itM7807);
                String strM9669 = C0064.m9669(mVar);
                String strM2339 = C0010.m2339(mVar, strM5109);
                if (C0058.m9127(strM2339, C0016.m3525(m752(), 618, 6, 3067))) {
                    StringBuilder sb4 = new StringBuilder();
                    C0018.m3933(sb4, strM9669);
                    C0018.m3933(sb4, strM2037);
                    C0018.m3933(sb4, strM2339);
                    C0018.m3933(sb4, strM3917);
                    C0018.m3933(sb4, strM3446);
                    C0018.m3933(sb4, strM3917);
                    C0018.m3933(sb4, strM9669);
                    C0018.m3933(sb4, strM6001);
                    C0018.m3933(sb2, C0047.m7763(sb4));
                }
            }
            C0018.m3933(sb2, strM7902);
        }
        d dVarM5333 = C0030.m5333(hVarM3577, C0065.m9775(m752(), 624, 18, 1026));
        if (C0009.m2095(dVarM5333) != 0 && C0058.m9127(C0042.m7119(this), C0027.m5062(m752(), 642, 1, 2629))) {
            Iterator itM78072 = C0047.m7807(dVarM5333);
            while (C0012.m2962(itM78072)) {
                m mVar2 = (m) C0048.m7949(itM78072);
                Iterator it = itM78072;
                if (C0058.m9127(C0064.m9669(mVar2), C0000.m1077(m752(), 643, 4, 1324))) {
                    StringBuilder sb5 = new StringBuilder();
                    C0018.m3933(sb5, C0016.m3579());
                    C0018.m3933(sb5, C0024.m4684(C0030.m5333(mVar2, C0051.m8259(m752(), 647, 2, 1266))));
                    C0018.m3933(sb5, strM7902);
                    C0018.m3933(sb, C0047.m7763(sb5));
                    Iterator itM78073 = C0047.m7807(C0030.m5333(mVar2, strM5852));
                    while (C0012.m2962(itM78073)) {
                        m mVar3 = (m) C0048.m7949(itM78073);
                        String strM23392 = C0010.m2339(mVar3, C0063.m9585(m752(), 649, 5, 414));
                        String strM23393 = C0010.m2339(mVar3, strM5109);
                        Iterator it2 = itM78073;
                        StringBuilder sb6 = new StringBuilder();
                        C0018.m3933(sb6, strM23392);
                        C0018.m3933(sb6, strM2037);
                        C0018.m3933(sb6, strM23393);
                        C0018.m3933(sb6, strM3917);
                        C0018.m3933(sb6, strM3446);
                        C0018.m3933(sb6, strM3917);
                        C0018.m3933(sb6, strM23392);
                        C0018.m3933(sb6, strM6001);
                        C0018.m3933(sb2, C0047.m7763(sb6));
                        itM78073 = it2;
                    }
                    C0018.m3933(sb2, strM7902);
                }
                itM78072 = it;
            }
        }
        String strM3314 = C0014.m3314(C0030.m5333(hVarM3577, C0024.m4740(m752(), 654, 8, 417)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0053.m8477(m752(), 662, 17, 3091)), C0061.m9361(m752(), 679, 3, 1219));
        String strM1689 = C0006.m1689(strM3314, C0005.m1602(C0038.m6452(m752(), 682, 15, 2602)));
        if (C0007.m1815(strM1689, strM1840)) {
            strM1689 = C0024.m4684(C0030.m5333(hVarM3577, C0045.m7657(m752(), 697, 18, 479)));
        }
        String strM16892 = C0006.m1689(strM3314, C0005.m1602(C0064.m9599(m752(), 715, 15, 3040)));
        if (C0007.m1815(strM16892, strM1840)) {
            strM16892 = C0006.m1689(strM3314, C0005.m1602(C0013.m3106(m752(), 730, 12, 2027)));
        }
        String strM16893 = C0006.m1689(strM3314, C0005.m1602(C0061.m9361(m752(), 742, 15, 2690)));
        if (C0007.m1815(strM16893, strM1840)) {
            strM16893 = C0006.m1689(strM3314, C0005.m1602(C0005.m1645(m752(), 757, 12, 2301)));
        }
        String strM16894 = C0006.m1689(strM3314, C0005.m1602(C0056.m8911(m752(), 769, 15, 1060)));
        String strM1110 = C0000.m1110(strM3314, C0005.m1602(C0007.m1842(m752(), 784, 15, 775)));
        if (C0007.m1815(strM1110, strM1840)) {
            strM1110 = C0000.m1110(strM3314, C0005.m1602(C0037.m6307(m752(), 799, 15, 1814)));
        }
        if (C0007.m1815(strM1110, strM1840)) {
            strM1110 = C0000.m1110(strM3314, C0005.m1602(C0055.m8814(m752(), 814, 12, 1519)));
        }
        String strM11102 = C0000.m1110(strM3314, C0005.m1602(C0028.m5109(m752(), 826, 15, 1138)));
        if (C0007.m1815(strM11102, strM1840)) {
            strM11102 = C0000.m1110(strM3314, C0005.m1602(C0050.m8131(m752(), 841, 12, 605)));
        }
        String strM9637 = C0064.m9637(strM3314, C0026.m4930(C0044.m7509(m752(), 853, 14, 1695), 34));
        if (C0007.m1815(strM9637, strM1840)) {
            strM9637 = C0064.m9637(strM3314, C0026.m4930(C0022.m4403(m752(), 867, 11, 1675), 34));
        }
        com.github.catvod.spider.merge.E.m mVar4 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar4, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar4, strM3446);
        C0026.m4947(mVar4, strM8058);
        C0058.m9085(mVar4, strM1689);
        C0022.m4432(mVar4, strM16892);
        C0017.m3671(mVar4, strM16893);
        StringBuilder sb7 = new StringBuilder();
        C0018.m3933(sb7, C0036.m6189());
        C0018.m3933(sb7, strM16894);
        C0019.m4073(mVar4, C0047.m7763(sb7));
        C0058.m9152(mVar4, strM1110);
        C0058.m9159(mVar4, strM11102);
        StringBuilder sb8 = new StringBuilder();
        C0018.m3933(sb8, C0055.m8703());
        C0018.m3933(sb8, strM9637);
        C0027.m5000(mVar4, C0047.m7763(sb8));
        C0054.m8596(mVar4, C0000.m1096(sb));
        C0044.m7449(mVar4, C0000.m1096(sb2));
        return C0053.m8428(mVar4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8 A[LOOP:1: B:19:0x00f2->B:21:0x00f8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r66) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Xb6v.homeContent(boolean):java.lang.String");
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        this.c = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0049.m8007(m752(), 931, 1, 2798));
        int length = strArrM4752.length;
        Integer numM2808 = C0011.m2808(0);
        String str3 = (length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str5 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0036.m6188(m752(), 932, 17, 2100));
        C0018.m3933(sb, str4);
        C0018.m3933(sb, C0044.m7509(m752(), 949, 7, 1563));
        C0018.m3933(sb, str5);
        String strM7763 = C0047.m7763(sb);
        if (C0043.m7277(str3, C0010.m2300(m752(), 956, 6, 2569))) {
            g gVar = new g();
            C0017.m3667(gVar, str2);
            C0002.m1282(gVar, strM7763);
            return C0033.m5828(gVar);
        }
        if (C0058.m9127(str, C0046.m7718(m752(), 962, 5, 409))) {
            return super.playerContent(str, str2, list);
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0028.m5109(m752(), 967, 20, 1040), str3), null));
        Pattern patternM9425 = C0062.m9425();
        String strM5433 = C0030.m5433(C0037.m6369(patternM9425), C0000.m1081(hVarM3577), numM2808);
        if (C0048.m7937(new CharSequence[]{strM5433})) {
            strM5433 = C0030.m5433(C0037.m6369(patternM9425), C0000.m1081(C0016.m3577(C0032.m5769(C0049.m8058(C0030.m5333(hVarM3577, C0014.m3332(m752(), 987, 6, 2113)), C0010.m2300(m752(), 993, 3, 2366)), null))), numM2808);
        }
        g gVar2 = new g();
        C0017.m3667(gVar2, strM5433);
        C0002.m1282(gVar2, strM7763);
        return C0033.m5828(gVar2);
    }

    public String searchContent(String str, boolean z) {
        return C0013.m3181(this, str, z, C0031.m5565(m752(), 996, 1, 1824));
    }

    public String searchContent(String str, boolean z, String str2) {
        String strM8007 = C0049.m8007(m752(), 997, 1, 1177);
        if (!C0007.m1815(str2, strM8007)) {
            int iM6456 = C0038.m6456(str2) - 1;
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0020.m4258(this));
            C0036.m6177(sb, iM6456);
            C0018.m3933(sb, C0050.m8066(this));
            return C0047.m7783(C0010.m2329(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0051.m8273()))));
        }
        try {
            Response responseM764 = m764(m760(m759(), m758(m766(m754(m754(m754(m753(new Request.Builder(), C0048.m7902(m752(), 1055, 40, 2052)), C0049.m8007(m752(), 1095, 10, 2134), C0000.m1077(m752(), 1105, 111, 474)), C0040.m6584(m752(), 1216, 6, 2878), C0062.m9389(m752(), 1222, 20, 2826)), C0064.m9599(m752(), 1242, 7, 3056), C0025.m4795(m752(), 1249, 21, 1534)), m762(m755(m765(m765(m765(m765(m765(m765(new FormBody.Builder(), C0021.m4340(m752(), 998, 4, 3092), C0048.m7902(m752(), 1002, 5, 2224)), C0052.m8337(m752(), 1007, 6, 656), strM8007), C0016.m3525(m752(), 1013, 6, 332), C0006.m1774(m752(), 1019, 7, 3254)), C0034.m6001(m752(), 1026, 3, 1966), strM8007), C0047.m7833(m752(), 1029, 6, 3136), C0004.m1549(m752(), 1035, 6, 444)), C0046.m7718(m752(), 1041, 6, 2885), C0007.m1840()), C0031.m5565(m752(), 1047, 8, 1742), str))))));
            C0032.m5762();
            String[] strArrM4752 = C0024.m4752(C0000.m1096(m763(m757(responseM764))), C0058.m9106(m752(), 1270, 11, 1105));
            this.a = C0028.m5188(new StringBuilder(), strArrM4752[0], C0017.m3646(m752(), 1281, 15, 954));
            StringBuilder sb2 = new StringBuilder(C0020.m4199(m752(), 1296, 10, 2740));
            C0018.m3933(sb2, strArrM4752[1]);
            this.b = C0047.m7763(sb2);
            return C0047.m7783(C0010.m2329(C0016.m3577(m761(m756(responseM764)))));
        } catch (Throwable th) {
            C0032.m5762();
            throw th;
        }
    }
}