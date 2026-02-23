package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
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
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class KuaKeS extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f81short = {1454, 1514, 1511, 1528, 1440, 1519, 1532, 1530, 1511, 1517, 1506, 1515, 1533, 1443, 1506, 1511, 1533, 1530, 1454, 1456, 1454, 1519, 1532, 1530, 1511, 1517, 1506, 1515, 1440, 1534, 1505, 1533, 1530, 2917, 2852, 2923, 2869, 2858, 2870, 2865, 2920, 2865, 2860, 2865, 2857, 2848, 1091, 1113, 1102, 1101, 1204, 1277, 1273, 1267, 1113, 1116, 1097, 1116, 1040, 1105, 1116, 1095, 1092, 1040, 1102, 1103, 1118, 2022, 2042, 2042, 2046, 2081, 2109, 2109, 2105, 2106, 2163, 2150, 2150, 2082, 2108, 2088, 2082, 2092, 2106, 2151, 2090, 2086, 2084, 1470, 1521, 1455, 1456, 1452, 1451, 1522, 1451, 1462, 1451, 1459, 1466, 2306, 2305, 2320, 2335, 2399, 2325, 2323, 2350, 2306, 2322, 2334, 2307, 2324, 2530, 2546, 2494, 2544, 2283, 2295, 2295, 2291, 2288, 2233, 2220, 2220, 2280, 2294, 2274, 2280, 2278, 2288, 2221, 2272, 2284, 2286, 947, 917, 899, 916, 971, 935, 897, 899, 904, 914, 2377, 2411, 2430, 2413, 2408, 2408, 2405, 2347, 2353, 2346, 2356, 2340, 2348, 2387, 2413, 2410, 2400, 2411, 2419, 2423, 2340, 2378, 2384, 2340, 2357, 2356, 2346, 2356, 2367, 2340, 2387, 2413, 2410, 2354, 2352, 2367, 2340, 2428, 2354, 2352, 2349, 2340, 2373, 2420, 2420, 2408, 2401, 2387, 2401, 2406, 2383, 2413, 2416, 2347, 2353, 2359, 2355, 2346, 2359, 2354, 2340, 2348, 2383, 2380, 2384, 2377, 2376, 2344, 2340, 2408, 2413, 2415, 2401, 2340, 2371, 2401, 2407, 2415, 2411, 2349, 2340, 2375, 2412, 2422, 2411, 2409, 2401, 2347, 2357, 2358, 2358, 2346, 2356, 2346, 2356, 2346, 2356, 2340, 2391, 2405, 2402, 2405, 2422, 2413, 2347, 2353, 2359, 2355, 2346, 2359, 2354, 1777, 1789, 1789, 1785, 1787, 1783, 3319, 3297, 3313, 3277, 3297, 3319, 3315, 3296, 3313, 3322, 3277, 3313, 3315, 3298, 3302, 3313, 3322, 3315, 3247, 3235, 3241, 3250, 3296, 3319, 3297, 3303, 3326, 3302, 3247, 3238, 3233, 1057, 1150, 1135, 1129, 1131, 1057, 3111, 3073, 3095, 3072, 3167, 3123, 3093, 3095, 3100, 3078, 293, 263, 274, 257, 260, 260, 265, 327, 349, 326, 344, 328, 320, 319, 257, 262, 268, 263, 287, 283, 328, 294, 316, 328, 345, 344, 326, 344, 339, 328, 319, 257, 262, 350, 348, 339, 328, 272, 350, 348, 321, 328, 297, 280, 280, 260, 269, 319, 269, 266, 291, 257, 284, 327, 349, 347, 351, 326, 347, 350, 328, 320, 291, 288, 316, 293, 292, 324, 328, 260, 257, 259, 269, 328, 303, 269, 267, 259, 263, 321, 328, 299, 256, 282, 263, 261, 269, 327, 345, 346, 346, 326, 344, 326, 344, 326, 344, 328, 315, 265, 270, 265, 282, 257, 327, 349, 347, 351, 326, 347, 350, 2215, 2177, 2199, 2176, 2271, 2227, 2197, 2199, 2204, 2182, 434, 400, 389, 406, 403, 403, 414, 464, 458, 465, 463, 479, 471, 424, 406, 401, 411, 400, 392, 396, 479, 433, 427, 479, 462, 463, 465, 463, 452, 479, 424, 406, 401, 457, 459, 452, 479, 391, 457, 459, 470, 479, 446, 399, 399, 403, 410, 424, 410, 413, 436, 406, 395, 464, 458, 460, 456, 465, 460, 457, 479, 471, 436, 439, 427, 434, 435, 467, 479, 403, 406, 404, 410, 479, 440, 410, 412, 404, 400, 470, 479, 444, 407, 397, 400, 402, 410, 464, 462, 461, 461, 465, 463, 465, 463, 465, 463, 479, 428, 414, 409, 414, 397, 406, 464, 458, 460, 456, 465, 460, 457, 2305, 2377, 2320, 2319, 2389, 2376, 2389, 2381, 2372, 2316, 2373, 2372, 2389, 2368, 2376, 2381, 1184, 1197, 1202, 1258, 1193, 1185, 1184, 1197, 1189, 1257, 1204, 1197, 1191, 1252, 1252, 1197, 1193, 1187, 3129, 3132, 3113, 3132, 3184, 3121, 3132, 3111, 3108, 3184, 3118, 3119, 3134, 2333, 2320, 2319, 2391, 2318, 2313, 2388, 2331, 2325, 2326, 2330, 2322, 2388, 2324, 2332, 2333, 2320, 2328, 2388, 2317, 2332, 2305, 2317, 2342, 2342, 2330, 2326, 2327, 2317, 2332, 2327, 2317, 2393, 2375, 2393, 2313, 24572, 27412, 1082, 1064, 1070, 1066, 1087, 1065, 31510, 22119, 1082, 20492, 21510, 1798, 1812, 1810, 1814, 1795, 1813, -29487, -29380, 1798, 17917, 25810, 3068, 3054, 3048, 3052, 3065, 3055, 30653, 23629, 3068, 17444, 27662, 28619, 27953, 2580, 2566, 2560, 2564, 2577, 2567, 2674, 2566, -2777, 32193, 22065, 384, 402, 404, 400, 389, 403, 21388, 29693, 1647, 1634, 1661, 1573, 1642, 1657, 1663, 1634, 1640, 1639, 1646, 1574, 1647, 1646, 1663, 1642, 1634, 1639, 1579, 1589, 1579, 1659, 1863, 1866, 1877, 1805, 1870, 1858, 1860, 1866, 1856, 1875, 1868, 1872, 1879, 1806, 1856, 1868, 1869, 1879, 1806, 1857, 1863, 1795, 1821, 1795, 1858, 1322, 1327, 1338, 1327, 1379, 1340, 1319, 1322, 699, 702, 683, 702, 754, 687, 694, 699, 941, 943, 952, 933, 931, 930, 2819, 2838, 2859, 2841, 2820, 2832, 2840, 2859, 2834, 2822, 2843, 2842, 2816, 2249, 2258, 2271, 3093, 3084, 3073, 690, 675, 678, 698, 703, 693, 695, 674, 691, 758, 701, 691, 687, 748, 758, 2194, 2190, 2190, 2186, 2185, 2240, 2261, 2261, 2193, 2191, 2203, 2193, 2207, 2185, 2260, 2201, 2197, 2199, 2261, 2189, 2186, 2263, 2203, 2206, 2199, 2195, 2196, 2261, 2203, 2206, 2199, 2195, 2196, 2263, 2203, 2192, 2203, 2178, 2260, 2186, 2194, 2186, 2186, 2191, 2202, 2191, 2905, 2910, 2880, 1353, 1391, 1401, 1390, 1329, 1373, 1403, 1401, 1394, 1384, 915, 945, 932, 951, 946, 946, 959, 1009, 1003, 1008, 1006, 1022, 1014, 905, 951, 944, 954, 945, 937, 941, 1022, 912, 906, 1022, 1007, 1006, 1008, 1006, 997, 1022, 905, 951, 944, 1000, 1002, 997, 1022, 934, 1000, 1002, 1015, 1022, 927, 942, 942, 946, 955, 905, 955, 956, 917, 951, 938, 1009, 1003, 1005, 1001, 1008, 1005, 1000, 1022, 1014, 917, 918, 906, 915, 914, 1010, 1022, 946, 951, 949, 955, 1022, 921, 955, 957, 949, 945, 1015, 1022, 925, 950, 940, 945, 947, 955, 1009, 1007, 1004, 1004, 1008, 1006, 1008, 1006, 1008, 1006, 1022, 909, 959, 952, 959, 940, 951, 1009, 1003, 1005, 1001, 1008, 1005, 1000, 2724, 2744, 2744, 2748, 2751, 2806, 2787, 2787, 2727, 2745, 2733, 2727, 2729, 2751, 2786, 2735, 2723, 2721, 2827, 2824, 2913, 2932, 2911, 2884, 2907, 2917, 2890, 2909, 2827, 2827, 2890, 1192, 1202, 1189, 1190};

    public static String a(String str, Pattern pattern) {
        Matcher matcherM6026 = C0034.m6026(pattern, str);
        return C0003.m1405(matcherM6026) ? C0064.m9640(C0021.m4306(matcherM6026, 1)) : C0007.m1840();
    }

    public static ArrayList b(h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0047.m7833(m464(), 0, 33, 1422)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(C0036.m6243(mVar, C0002.m1305(m464(), 33, 13, 2885)), C0007.m1842(m464(), 46, 4, 1067));
            String strM23392 = C0010.m2339(C0036.m6243(mVar, C0001.m1189(m464(), 50, 4, 1172)), C0043.m7290(m464(), 54, 13, 1085));
            if (!C0043.m7277(strM23392, C0002.m1305(m464(), 67, 4, 1934))) {
                strM23392 = C0050.m8125(C0064.m9599(m464(), 71, 18, 2121), strM23392);
            }
            String strM9669 = C0064.m9669(C0036.m6243(mVar, C0052.m8337(m464(), 89, 12, 1503)));
            String strM8337 = C0052.m8337(m464(), 101, 13, 2417);
            C0055.m8732(strM2339, strM9669, strM23392, C0036.m6243(mVar, strM8337) != null ? C0064.m9669(C0036.m6243(mVar, strM8337)) : C0007.m1840(), arrayList);
        }
        return arrayList;
    }

    public static String c(String str) {
        String strM8909 = C0056.m8909(str);
        StringBuilder sb = new StringBuilder(C0057.m8978(m464(), 114, 4, 2509));
        C0018.m3933(sb, strM8909);
        String strM8125 = C0050.m8125(C0057.m8978(m464(), 118, 18, 2179), C0047.m7763(sb));
        HashMap map = new HashMap();
        C0053.m8424(map, C0040.m6584(m464(), 136, 10, 998), C0044.m7509(m464(), 146, 111, 2308));
        C0053.m8424(map, C0000.m1077(m464(), 257, 6, 1682), C0021.m4340(m464(), 263, 31, 3218));
        return C0047.m7783(C0052.m8287(C0016.m3577(C0032.m5769(strM8125, map))));
    }

    /* renamed from: ۣ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static JsonObject m463(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m464() {
        if (C0012.m3024() > 0) {
            return f81short;
        }
        return null;
    }

    /* renamed from: ۢ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m465(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۥۡۥ, reason: not valid java name and contains not printable characters */
    public static String m466(Object obj) {
        if (C0062.m9429() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۨ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m467(Object obj) {
        if (C0050.m8121() < 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM5172 = C0028.m5172(str, C0010.m2300(m464(), 294, 6, 1038), str2);
        HashMap map2 = new HashMap();
        C0053.m8424(map2, C0007.m1842(m464(), 300, 10, 3186), C0056.m8911(m464(), 310, 111, 360));
        ArrayList arrayListM8287 = C0052.m8287(C0016.m3577(C0032.m5769(strM5172, map2)));
        int iM6456 = (C0038.m6456(str2) + 1) * 19;
        g gVar = new g();
        C0045.m7632(gVar, arrayListM8287);
        C0049.m7974(gVar, C0038.m6456(str2), C0038.m6456(str2) + 1, 19, iM6456);
        return C0033.m5828(gVar);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0021.m4340(m464(), 421, 10, 2290), C0033.m5852(m464(), 431, 111, 511));
        h hVarM3577 = C0016.m3577(C0032.m5769(str, map));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, C0064.m9669(C0036.m6243(hVarM3577, C0046.m7718(m464(), 542, 16, 2337))));
        C0026.m4947(mVar, C0010.m2339(C0036.m6243(hVarM3577, C0005.m1645(m464(), 558, 18, 1220)), C0047.m7833(m464(), 576, 13, 3165)));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0024.m4740(m464(), 589, 36, 2425)));
        C0058.m9159(mVar, C0042.m7165(strM4684, C0005.m1602(C0007.m1842(m464(), 625, 11, 1024))));
        C0017.m3671(mVar, C0042.m7165(strM4684, C0005.m1602(C0016.m3525(m464(), 636, 11, 1852))));
        C0058.m9152(mVar, C0042.m7165(strM4684, C0005.m1602(C0063.m9585(m464(), 647, 11, 3014))));
        C0022.m4432(mVar, C0042.m7165(strM4684, C0005.m1602(C0031.m5565(m464(), 658, 13, 2606))));
        C0058.m9085(mVar, C0042.m7165(strM4684, C0005.m1602(C0051.m8259(m464(), 671, 10, 442))));
        C0019.m4073(mVar, C0007.m1840());
        C0027.m5000(mVar, C0024.m4684(C0030.m5333(hVarM3577, C0057.m8978(m464(), 681, 22, 1547))));
        ArrayList arrayList = new ArrayList();
        d dVarM5333 = C0030.m5333(hVarM3577, C0064.m9599(m464(), 703, 25, 1827));
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(C0035.m6131(m464(), 744, 6, 972), C0013.m3106(m464(), 750, 13, 2932)), new AbstractMap.SimpleEntry(C0016.m3525(m464(), 763, 3, 2235), C0049.m8058(dVarM5333, C0063.m9585(m464(), 728, 8, 1358))), new AbstractMap.SimpleEntry(C0037.m6307(m464(), 766, 3, 3173), C0049.m8058(dVarM5333, C0041.m6779(m464(), 736, 8, 735)))};
        HashMap map2 = new HashMap(3);
        for (int i = 0; i < 3; i++) {
            Map.Entry entry = entryArr[i];
            Object objM7624 = C0045.m7624(entry);
            if (C0044.m7425(objM7624, entry, map2, objM7624) != null) {
                throw new IllegalArgumentException(C0002.m1280(objM7624, C0023.m4536(m464(), 769, 15, 726)));
            }
        }
        C0004.m1532(arrayList, m466(m465(m463(m465(m467(C0008.m2029(C0003.m1396(C0064.m9599(m464(), 784, 42, 2298), C0001.m1184(map2), null))), C0030.m5362(m464(), 826, 4, 2286))), C0009.m2037(m464(), 830, 3, 2860))));
        C0044.m7449(mVar, C0014.m3356(this, arrayList));
        C0054.m8596(mVar, C0030.m5351(this));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        C0053.m8424(map, C0000.m1077(m464(), 833, 10, 1308), C0040.m6584(m464(), 843, 111, 990));
        String strM9361 = C0061.m9361(m464(), 954, 18, 2764);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM9361, map));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0036.m6188(m464(), 972, 13, 2859)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2339 = C0010.m2339(mVar, C0040.m6584(m464(), 985, 4, 1216));
            String strM9669 = C0064.m9669(mVar);
            if (C0058.m9127(strM2339, strM9361)) {
                C0004.m1532(arrayList, new b(strM2339, strM9669, null));
            }
        }
        return C0025.m4831(arrayList, C0052.m8287(hVarM3577));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        return C0048.m7909(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0048.m7909(str);
    }
}